package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.regions

import org.junit.jupiter.api.Test
import org.springframework.http.MediaType
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.stubs.REGIONS_BY_TEAM_CODES_REQUEST_BODY
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.stubs.REGIONS_BY_TEAM_CODES_RESPONSE_BODY

class GetRegionsByTeamCodes : IntegrationTestBase() {

  @Test
  fun `retrieve regions and teams by teamCodes`() {
    val mockResponse = """
{
  "providers": [
    {
      "code": "LN",
      "description": "London",
      "probationDeliveryUnits": [
        {
          "code": "LN-PDU1",
          "description": "London PDU 1",
          "localAdminUnits": [
            {
              "code": "LN-LDU1",
              "description": "London LDU 1",
              "teams": [
                { "code": "CAI2", "description": "CAI 2" },
                { "code": "CRO1", "description": "CRO 1" }
              ]
            }
          ]
        }
      ]
    },
    {
      "code": "WM",
      "description": "West Midlands Region",
      "probationDeliveryUnits": [
        {
          "code": "WM-PDU1",
          "description": "WM PDU 1",
          "localAdminUnits": [
            {
              "code": "WM-LDU1",
              "description": "WM LDU 1",
              "teams": [
                { "code": "CB1", "description": "Central Birmingham 1" },
                { "code": "SB1", "description": "South Birmingham 1" },
                { "code": "COV4", "description": "Coventry PQIP" }
              ]
            }
          ]
        }
      ]
    },
    {
      "code": "WS",
      "description": "Wales",
      "probationDeliveryUnits": [
        {
          "code": "WS-PDU1",
          "description": "Wales PDU 1",
          "localAdminUnits": [
            {
              "code": "WS-LDU1",
              "description": "Wales LDU 1",
              "teams": [
                { "code": "WT1", "description": "Wrexham - Team 1" }
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

    webTestClient.post()
      .uri("/regions")
      .contentType(MediaType.APPLICATION_JSON)
      .bodyValue(REGIONS_BY_TEAM_CODES_REQUEST_BODY)
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .json(REGIONS_BY_TEAM_CODES_RESPONSE_BODY)
  }
}
