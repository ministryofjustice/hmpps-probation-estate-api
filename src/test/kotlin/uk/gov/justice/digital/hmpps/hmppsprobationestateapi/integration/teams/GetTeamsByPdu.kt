package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.ProbationDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Region
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Team
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetTeamsByPdu : IntegrationTestBase() {

  @Test
  fun `get teams by PDU Code`() {
    val region = Region(code = "REGION1", name = "Region Name", new = true)
    val probationDeliveryUnit = ProbationDeliveryUnit(code = "PDU1", name = "PDU Name", regionCode = region.code, new = true)
    val team = Team(code = "TM1", name = "Team Name", pduCode = probationDeliveryUnit.code, new = true)
    regionRepository.save(region)
      .then(probationDeliveryUnitRepository.save(probationDeliveryUnit))
      .then(teamRepository.save(team))
      .block()

    webTestClient.get()
      .uri("/probationDeliveryUnit/${probationDeliveryUnit.code}/teams")
      .headers { it.authToken(roles = listOf("ROLE_MANAGE_A_WORKFORCE_ALLOCATE")) }
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[0].code").isEqualTo(team.code)
      .jsonPath("$.[0].name").isEqualTo(team.name)
  }
}
