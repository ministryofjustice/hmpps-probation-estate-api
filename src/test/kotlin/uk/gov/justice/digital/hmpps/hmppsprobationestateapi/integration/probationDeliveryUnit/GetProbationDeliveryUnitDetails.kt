package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.probationDeliveryUnit

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetProbationDeliveryUnitDetails : IntegrationTestBase() {

  @Test
  fun `must get PDU and all teams associated`(): Unit = runBlocking {
    val firstTeamCode = "TM1"
    val secondTeamCode = "TM2"
    val firstTeamEstate = setupEstate(firstTeamCode)
    val secondTeamEstate = setupEstate(secondTeamCode)
    val deletedTeamEstate = setupEstate("DELETEDTEAM", true)

    webTestClient.get()
      .uri("/probationDeliveryUnit/${firstTeamEstate.probationDeliveryUnit.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(firstTeamEstate.probationDeliveryUnit.code)
      .jsonPath("$.name").isEqualTo(firstTeamEstate.probationDeliveryUnit.name)
      .jsonPath("$.region.code").isEqualTo(firstTeamEstate.region.code)
      .jsonPath("$.region.name").isEqualTo(firstTeamEstate.region.name)
      .jsonPath("$.teams.[?(@.code=='${firstTeamEstate.team.code}')].name").isEqualTo(firstTeamEstate.team.name)
      .jsonPath("$.teams.[?(@.code=='${secondTeamEstate.team.code}')].name").isEqualTo(secondTeamEstate.team.name)
      .jsonPath("$.teams.[?(@.code=='${deletedTeamEstate.team.code}')]").doesNotExist()
  }

  @Test
  fun `can get PDU without any teams`(): Unit = runBlocking {
    val estate = setupEstate()
    teamRepository.deleteAll()
    webTestClient.get()
      .uri("/probationDeliveryUnit/${estate.probationDeliveryUnit.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(estate.probationDeliveryUnit.code)
      .jsonPath("$.name").isEqualTo(estate.probationDeliveryUnit.name)
      .jsonPath("$.region.code").isEqualTo(estate.region.code)
      .jsonPath("$.region.name").isEqualTo(estate.region.name)
      .jsonPath("$.teams").isEmpty
  }

  @Test
  fun `Not found when get PDU by code that doesn't exist`() {
    webTestClient.get()
      .uri("/probationDeliveryUnit/NOPDUHERE")
      .exchange()
      .expectStatus()
      .isNotFound
  }
}
