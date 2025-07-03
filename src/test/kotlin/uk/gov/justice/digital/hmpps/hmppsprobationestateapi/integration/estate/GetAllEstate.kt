package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.estate

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetAllEstate : IntegrationTestBase() {

  @Test
  fun `must get all estate`(): Unit = runBlocking {
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
                { "code": "T1", "description": "Team 1" },
                { "code": "T2", "description": "Team 2" }
              ]
            }

          ]
        },
        {
          "code": "PDU2",
          "description": "PDU 2",
          "localAdminUnits": [
            {
              "code": "LDU3",
              "description": "LDU 3",
              "teams": [
                { "code": "T3", "description": "Team 3" },
                { "code": "T4", "description": "Team 4" }
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

    val region = Pair("RG1", "Region 1")
    val firstPdu = Pair("PDU1", "PDU 1")
    val secondPdu = Pair("PDU2", "PDU 2")
    val firstPduLdu = Pair("LDU1", "LDU 1")
    val secondPduLdu = Pair("LDU3", "LDU 3")
    val firstPduLduFirstTeam = Pair("T1", "Team 1")
    val firstPduLduSecondTeam = Pair("T2", "Team 2")
    val secondPduLduFirstTeam = Pair("T3", "Team 3")
    val secondPduLduSecondTeam = Pair("T4", "Team 4")

    webTestClient.get()
      .uri("/all/regions")
      .exchange()
      .expectStatus().isOk
      .expectBody()
      .jsonPath("$.${region.first}.name").isEqualTo(region.second)
      .jsonPath("$.${region.first}.pdus.${firstPdu.first}.name").isEqualTo(firstPdu.second)
      .jsonPath("$.${region.first}.pdus.${firstPdu.first}.ldus.${firstPduLdu.first}.name").isEqualTo(firstPduLdu.second)
      .jsonPath("$.${region.first}.pdus.${firstPdu.first}.ldus.${firstPduLdu.first}.teams[?(@.code == '${firstPduLduFirstTeam.first}')].name")
      .value<List<String>> { assert(it.contains(firstPduLduFirstTeam.second)) }
      .jsonPath("$.${region.first}.pdus.${firstPdu.first}.ldus.${firstPduLdu.first}.teams[?(@.code == '${firstPduLduSecondTeam.first}')].name")
      .value<List<String>> { assert(it.contains(firstPduLduSecondTeam.second)) }
      .jsonPath("$.${region.first}.pdus.${secondPdu.first}.ldus.${secondPduLdu.first}.teams[?(@.code == '${secondPduLduFirstTeam.first}')].name")
      .value<List<String>> { assert(it.contains(secondPduLduFirstTeam.second)) }
      .jsonPath("$.${region.first}.pdus.${secondPdu.first}.ldus.${secondPduLdu.first}.teams[?(@.code == '${secondPduLduSecondTeam.first}')].name")
      .value<List<String>> { assert(it.contains(secondPduLduSecondTeam.second)) }
  }
}
