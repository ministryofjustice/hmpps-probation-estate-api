package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.regions

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetAllRegions : IntegrationTestBase() {

  @Test
  fun `must get all regions`(): Unit = runBlocking {
    val mockResponse = """
{
  "providers": [
    {
      "code": "REGION1",
      "description": "First Region",
      "probationDeliveryUnits": [
        {
          "code": "R1PDU",
          "description": "PDU 1",
          "localAdminUnits": [
            {
              "code": "R1LDU",
              "description": "LDU 1",
              "teams": [
                { "code": "T1", "description": "Team 1" }
              ]
            }
          ]
        }
      ]
    },
    {
      "code": "REGION2",
      "description": "Second Region",
      "probationDeliveryUnits": [
        {
          "code": "R2PDU",
          "description": "PDU 2",
          "localAdminUnits": [
            {
              "code": "R2LDU",
              "description": "LDU 2",
              "teams": [
                { "code": "T2", "description": "Team 2" }
              ]
            }
          ]
        }
      ]
    },
    {
      "code": "REGION3",
      "description": "Third Region",
      "probationDeliveryUnits": [
        {
          "code": "R3PDU",
          "description": "PDU 3",
          "localAdminUnits": [
            {
              "code": "R3LDU",
              "description": "LDU 3",
              "teams": [
                { "code": "T3", "description": "Team 3" }
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

    val region1Code = "REGION1"
    val region1Name = "First Region"
    val region2Code = "REGION2"
    val region2Name = "Second Region"
    val region3Code = "REGION3"
    val region3Name = "Third Region"

    webTestClient.get()
      .uri("/regions")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[?(@.code=='$region1Code')].name").isEqualTo(region1Name)
      .jsonPath("$.[?(@.code=='$region2Code')].name").isEqualTo(region2Name)
      .jsonPath("$.[?(@.code=='$region3Code')].name").isEqualTo(region3Name)
  }
}
