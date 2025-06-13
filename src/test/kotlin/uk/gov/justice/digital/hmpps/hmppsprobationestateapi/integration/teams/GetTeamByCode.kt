package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetTeamByCode : IntegrationTestBase() {

  @Test
  fun `retrieve team details by code`() {
    val mockResponse = """
{
  "providers": [
    {
      "code": "REG1",
      "description": "Some Region",
      "probationDeliveryUnits": [
        {
          "code": "PDU1",
          "description": "PDU 1",
          "localAdminUnits": [
            {
              "code": "LDU1",
              "description": "LDU 1",
              "teams": [
                { "code": "TM1", "description": "Team 1" }
              ]
            }
          ]
        }
      ]
    }
  ]
}
    """.trimIndent()

    mockWebClientFactory.setJsonResponse(mockResponse)

    val team1 = Pair("TM1", "Team 1")
    val pdu1 = Pair("PDU1", "PDU 1")
    webTestClient.get()
      .uri("/team/${team1.first}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(team1.first)
      .jsonPath("$.name").isEqualTo(team1.second)
      .jsonPath("$.probationDeliveryUnit.code").isEqualTo(pdu1.first)
      .jsonPath("$.probationDeliveryUnit.name").isEqualTo(pdu1.second)
  }

  @Test
  fun `Not found when get team by code that doesn't exist`() {
    val mockResponse = """
{
  "providers": [
    {
      "code": "REGION1",
      "description": "Test Region",
      "probationDeliveryUnits": [
        {
          "code": "PDU1",
          "description": "PDU 1",
          "localAdminUnits": [
            {
              "code": "LDU1",
              "description": "LDU 1",
              "teams": [
                { "code": "TM1", "description": "Team 1" },
                { "code": "TM2", "description": "Team 2" }
              ]
            }
          ]
        }
      ]
    }
  ]
}
    """.trimIndent()
    mockWebClientFactory.setJsonResponse(mockResponse)
    webTestClient.get()
      .uri("/team/NOTEAMEXISTS")
      .exchange()
      .expectStatus()
      .isNotFound
  }
}
