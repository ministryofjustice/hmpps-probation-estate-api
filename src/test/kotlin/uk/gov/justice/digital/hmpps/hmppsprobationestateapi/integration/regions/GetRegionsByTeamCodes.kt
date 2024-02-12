package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.regions

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.springframework.http.MediaType
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.stubs.REGIONS_BY_TEAM_CODES_REQUEST_BODY
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.stubs.REGIONS_BY_TEAM_CODES_RESPONSE_BODY

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
      .bodyValue(REGIONS_BY_TEAM_CODES_REQUEST_BODY)
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .json(REGIONS_BY_TEAM_CODES_RESPONSE_BODY)
  }
}
