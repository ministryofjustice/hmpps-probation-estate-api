package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.regions

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetRegionByCode : IntegrationTestBase() {

  @Test
  fun `must get region and all PDUs associated`() = runBlocking {
    val mockResponse = """
    {
      "providers": [
        {
          "code": "RG1",
          "description": "Region 1",
          "probationDeliveryUnits": [
            {
              "code": "PDU1",
              "description": "PDU 1",
              "localAdminUnits": [
                {
                  "code": "LDU1",
                  "description": "LDU 1",
                  "teams": [
                    { "code": "TEAM1", "description": "Team 1" }
                  ]
                }
              ]
            },
            {
              "code": "PDU2",
              "description": "PDU 2",
              "localAdminUnits": [
                {
                  "code": "LDU2",
                  "description": "LDU 2",
                  "teams": [
                    { "code": "TEAM2", "description": "Team 2" }
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
      .uri("/region/RG1")
      .exchange()
      .expectStatus().isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo("RG1")
      .jsonPath("$.name").isEqualTo("Region 1")
      .jsonPath("$.probationDeliveryUnits[?(@.code=='PDU1')].name").isEqualTo("PDU 1")
      .jsonPath("$.probationDeliveryUnits[?(@.code=='PDU2')].name").isEqualTo("PDU 2")
  }

  @Test
  fun `can get region without any PDUs`() = runBlocking {
    val mockResponse = """
    {
      "providers": [
        {
          "code": "RG1",
          "description": "Region 1",
          "probationDeliveryUnits": []
        }
      ]
    }
    """.trimIndent()

    mockWebClientFactory.setJsonResponse(mockResponse)

    webTestClient.get()
      .uri("/region/RG1")
      .exchange()
      .expectStatus().isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo("RG1")
      .jsonPath("$.name").isEqualTo("Region 1")
      .jsonPath("$.probationDeliveryUnits").isEmpty
  }

  @Test
  fun `Not found when get region by code that doesn't exist`() {
    val mockResponse = """
    {
      "providers": [
        {
          "code": "RG1",
          "description": "Region 1",
          "probationDeliveryUnits": [
            {
              "code": "PDU1",
              "description": "PDU 1",
              "localAdminUnits": [
                {
                  "code": "LDU1",
                  "description": "LDU 1",
                  "teams": [
                    { "code": "TEAM1", "description": "Team 1" }
                  ]
                }
              ]
            }
          ]
        },
        {
          "code": "RG2",
          "description": "Region 2",
          "probationDeliveryUnits": [
            {
              "code": "PDU2",
              "description": "PDU 2",
              "localAdminUnits": [
                {
                  "code": "LDU2",
                  "description": "LDU 2",
                  "teams": [
                    { "code": "TEAM2", "description": "Team 2" }
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
      .uri("/region/NOREGIONHERE")
      .exchange()
      .expectStatus().isNotFound
  }
}
