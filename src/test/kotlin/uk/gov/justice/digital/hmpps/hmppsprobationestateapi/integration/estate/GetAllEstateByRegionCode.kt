package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.estate

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetAllEstateByRegionCode : IntegrationTestBase() {

  @Test
  fun `must get all teams associated to region via LDUs and PDUs and their names`(): Unit = runBlocking {
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
      .uri("/all/region/${region.first}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.${firstPdu.first}.name")
      .isEqualTo(firstPdu.second)
      .jsonPath("$.${firstPdu.first}.ldus.${firstPduLdu.first}.name")
      .isEqualTo(firstPduLdu.second)
      .jsonPath("$.${firstPdu.first}.ldus.${firstPduLdu.first}.teams[?(@.code == '${firstPduLduFirstTeam.first}')].name")
      .isEqualTo(firstPduLduFirstTeam.second)
      .jsonPath("$.${firstPdu.first}.ldus.${firstPduLdu.first}.teams[?(@.code == '${firstPduLduSecondTeam.first}')].name")
      .isEqualTo(firstPduLduSecondTeam.second)
      .jsonPath("$.${secondPdu.first}.ldus.${secondPduLdu.first}.teams[?(@.code == '${secondPduLduFirstTeam.first}')].name")
      .isEqualTo(secondPduLduFirstTeam.second)
      .jsonPath("$.${secondPdu.first}.ldus.${secondPduLdu.first}.teams[?(@.code == '${secondPduLduSecondTeam.first}')].name")
      .isEqualTo(secondPduLduSecondTeam.second)
  }

  @Test
  fun `must not return when no team exists`(): Unit = runBlocking {
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
              "teams": []
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
    val firstPduLdu = Pair("LDU1", "LDU 1")
    val firstPduFirstLduFirstTeam = Pair("T1", "Team 1")

    webTestClient.get()
      .uri("/all/region/${region.first}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.${firstPdu.first}")
      .exists()
      .jsonPath("$.${firstPdu.first}.ldus.${firstPduLdu.first}")
      .exists()
      .jsonPath("$.${firstPdu.first}.ldus.${firstPduLdu.first}.teams").isEmpty
  }
}
