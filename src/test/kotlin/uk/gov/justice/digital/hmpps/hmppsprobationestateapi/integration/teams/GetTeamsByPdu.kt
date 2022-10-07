package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.ProbationDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Region
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Team
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetTeamsByPdu : IntegrationTestBase() {

  @Test
  fun `get teams by PDU Code`(): Unit = runBlocking {
    val region = Region(code = "REGION1", name = "Region Name", new = true)
    val probationDeliveryUnit = ProbationDeliveryUnit(code = "PDU1", name = "PDU Name", regionCode = region.code, new = true)
    val team = Team(code = "TM1", name = "Team Name", pduCode = probationDeliveryUnit.code, new = true)

    regionRepository.save(region)
    probationDeliveryUnitRepository.save(probationDeliveryUnit)
      .then(teamRepository.save(team))
      .block()

    webTestClient.get()
      .uri("/probationDeliveryUnit/${probationDeliveryUnit.code}/teams")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[0].code").isEqualTo(team.code)
      .jsonPath("$.[0].name").isEqualTo(team.name)
  }

  @Test
  fun `Not found if retrieving a PDU which is not at code`() {
    webTestClient.get()
      .uri("/probationDeliveryUnit/PDUNOTFOUND/teams")
      .exchange()
      .expectStatus()
      .isNotFound
  }
}
