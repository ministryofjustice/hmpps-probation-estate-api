package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.regions

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.springframework.http.MediaType
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.stubs.regionsByTeamCodesRequestBody
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.stubs.regionsByTeamCodesResponseBody

class GetRegionsByTeamCodes : IntegrationTestBase() {

  private fun setupRegionsLDUsPDUsAndTeams() = runBlocking {
    setupWalesSingleLDU()
    setupLondonLDUs()
    setupWestMidlandsLDUs()
  }

  @Test
  fun `retrieve regions and teams by teamCodes`() {
    setupRegionsLDUsPDUsAndTeams()
    webTestClient.post()
      .uri("/regions")
      .contentType(MediaType.APPLICATION_JSON)
      .bodyValue(regionsByTeamCodesRequestBody)
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .json(regionsByTeamCodesResponseBody)
  }
}
