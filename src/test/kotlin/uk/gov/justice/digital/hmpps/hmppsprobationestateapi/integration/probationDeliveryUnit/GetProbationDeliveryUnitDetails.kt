package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.probationDeliveryUnit

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetProbationDeliveryUnitDetails : IntegrationTestBase() {

  @Test
  fun `must get PDU and all teams associated`(): Unit = runBlocking {
    val mockResponse = """
{
  "providers": [
    {
      "code": "REGION1",
      "description": "Region Name",
      "probationDeliveryUnits": [
        {
          "code": "PDU1",
          "description": "PDU Name",
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

    val regionCode: String = "REGION1"
    val regionName: String = "Region Name"
    val pduCode: String = "PDU1"
    val pduName: String = "PDU Name"
    val firstTeam = Pair("TM1", "Team 1")
    val secondTeam = Pair("TM2", "Team 2")

    webTestClient.get()
      .uri("/probationDeliveryUnit/$pduCode")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(pduCode)
      .jsonPath("$.name").isEqualTo(pduName)
      .jsonPath("$.region.code").isEqualTo(regionCode)
      .jsonPath("$.region.name").isEqualTo(regionName)
      .jsonPath("$.teams.[?(@.code=='${firstTeam.first}')].name").isEqualTo(firstTeam.second)
      .jsonPath("$.teams.[?(@.code=='${secondTeam.first}')].name").isEqualTo(secondTeam.second)
  }

  @Test
  fun `Not found when get PDU by code that doesn't exist`() {
    val mockResponse = """
{
  "providers": [
    {
      "code": "REGION1",
      "description": "Region Name",
      "probationDeliveryUnits": [
        {
          "code": "PDU1",
          "description": "PDU Name",
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

    webTestClient.get()
      .uri("/probationDeliveryUnit/NOPDUHERE")
      .exchange()
      .expectStatus()
      .isNotFound
  }
}
