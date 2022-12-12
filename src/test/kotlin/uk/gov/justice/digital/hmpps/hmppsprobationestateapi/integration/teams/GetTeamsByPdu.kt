package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetTeamsByPdu : IntegrationTestBase() {

  @Test
  fun `get teams by PDU Code`(): Unit = runBlocking {
    val estate = setupEstate()

    webTestClient.get()
      .uri("/probationDeliveryUnit/${estate.probationDeliveryUnit.code}/teams")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[0].code").isEqualTo(estate.team.code)
      .jsonPath("$.[0].name").isEqualTo(estate.team.name)
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
