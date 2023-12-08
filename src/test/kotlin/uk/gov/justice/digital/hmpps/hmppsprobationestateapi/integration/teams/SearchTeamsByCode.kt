package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class SearchTeamsByCode : IntegrationTestBase() {

  @Test
  fun `retrieve team by code`() {
    val estateOverview = setupEstate()
    webTestClient.get()
      .uri("/team/search?codes=${estateOverview.teams[0].code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[0].code").isEqualTo(estateOverview.teams[0].code)
      .jsonPath("$.[0].name").isEqualTo(estateOverview.teams[0].name)
  }

  @Test
  fun `retrieve multiple teams by codes`() {
    val firstTeam = Triple("TM1", "Team 1", false)
    val secondTeam = Triple("TM2", "Team 2", false)
    val deletedTeam = Triple("DELETEDTEAM", "Deleted Team", true)
    val estate = setupEstate(teams = listOf(firstTeam, secondTeam, deletedTeam))

    webTestClient.get()
      .uri("/team/search?codes=${estate.teams[0].code},${estate.teams[1].code},${estate.teams[2].code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[?(@.code=='${estate.teams[0].code}')].name").isEqualTo(estate.teams[0].name)
      .jsonPath("$.[?(@.code=='${estate.teams[1].code}')].name").isEqualTo(estate.teams[1].name)
      .jsonPath("$.[?(@.code=='${estate.teams[2].code}')]").doesNotExist()
  }
}
