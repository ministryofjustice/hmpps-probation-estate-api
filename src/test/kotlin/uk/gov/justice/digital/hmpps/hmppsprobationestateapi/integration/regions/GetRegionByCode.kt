package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.regions

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetRegionByCode : IntegrationTestBase() {

  @Test
  fun `must get region and all PDUs associated`(): Unit = runBlocking {
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
          "localAdminUnits": []
        },
        {
          "code": "PDU2",
          "description": "PDU 2",
          "localAdminUnits": []
        }
      ]
    }
  ]
}
    """.trimIndent()

    mockWebClientFactory.setJsonResponse(mockResponse)

    val region = Pair("RG1", "Region 1")
    val firstPdu = Pair("PDU1", "PDU 1")
    val secondPdu = Pair("PDU2", "PDU 2")

    webTestClient.get()
      .uri("/region/${region.first}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(region.first)
      .jsonPath("$.name").isEqualTo(region.second)
      .jsonPath("$.probationDeliveryUnits.[?(@.code=='${firstPdu.first}')].name").isEqualTo(firstPdu.second)
      .jsonPath("$.probationDeliveryUnits.[?(@.code=='${secondPdu.first}')].name").isEqualTo(secondPdu.second)
  }

  @Test
  fun `can get region without any PDUs`(): Unit = runBlocking {
    val region = Pair("RG1", "Region 1")
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
      .uri("/region/${region.first}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(region.first)
      .jsonPath("$.name").isEqualTo(region.second)
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
      "probationDeliveryUnits": []
    },
    {
      "code": "RG2",
      "description": "Region 2",
      "probationDeliveryUnits": []
    }
  ]
}
    """.trimIndent()

    mockWebClientFactory.setJsonResponse(mockResponse)

    webTestClient.get()
      .uri("/region/NOREGIONHERE")
      .exchange()
      .expectStatus()
      .isNotFound
  }
}
