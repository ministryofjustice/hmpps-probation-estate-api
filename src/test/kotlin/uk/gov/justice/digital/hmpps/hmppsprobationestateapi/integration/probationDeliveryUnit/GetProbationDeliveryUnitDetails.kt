package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.probationDeliveryUnit

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetProbationDeliveryUnitDetails : IntegrationTestBase() {

  @Test
  fun `must get PDU and all teams associated`(): Unit = runBlocking {
    val firstTeam = Triple("TM1", "Team 1", false)
    val secondTeam = Triple("TM2", "Team 2", false)
    val deletedTeam = Triple("DELETEDTEAM", "Deleted Team", true)
    val estate = setupEstate(teams = listOf(firstTeam, secondTeam, deletedTeam))

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
      .jsonPath("$.teams.[?(@.code=='${estate.teams[0].code}')].name").isEqualTo(estate.teams[0].name)
      .jsonPath("$.teams.[?(@.code=='${estate.teams[1].code}')].name").isEqualTo(estate.teams[1].name)
      .jsonPath("$.teams.[?(@.code=='${estate.teams[2].code}')]").doesNotExist()
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
