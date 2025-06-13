package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class SearchTeamsByCode : IntegrationTestBase() {

  @Test
  fun `retrieve team by code`() {
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

    val team1 = Pair("TM1", "Team 1")
    webTestClient.get()
      .uri("/team/search?codes=${team1.first}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[0].code").isEqualTo(team1.first)
      .jsonPath("$.[0].name").isEqualTo(team1.second)
  }

  @Test
  fun `retrieve multiple teams by codes`() {
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
    val firstTeam = Pair("TM1", "Team 1")
    val secondTeam = Pair("TM2", "Team 2")

    webTestClient.get()
      .uri("/team/search?codes=${firstTeam.first},${secondTeam.first}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[?(@.code=='${firstTeam.first}')].name").isEqualTo(firstTeam.second)
      .jsonPath("$.[?(@.code=='${secondTeam.first}')].name").isEqualTo(secondTeam.second)
  }
}
