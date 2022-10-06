package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class SearchTeamsByCode : IntegrationTestBase() {

  @Test
  fun `retrieve team by code`() {
    val team = setupTeam()
    webTestClient.get()
      .uri("/team/search?codes=${team.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[0].code").isEqualTo(team.code)
      .jsonPath("$.[0].name").isEqualTo(team.name)
  }

  @Test
  fun `retrieve multiple teams by codes`() {
    val team = setupTeam()
    val secondTeam = setupTeam("TM2")

    webTestClient.get()
      .uri("/team/search?codes=${team.code},${secondTeam.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[?(@.code=='${team.code}')].name").isEqualTo(team.name)
      .jsonPath("$.[?(@.code=='${secondTeam.code}')].name").isEqualTo(secondTeam.name)
  }
}
