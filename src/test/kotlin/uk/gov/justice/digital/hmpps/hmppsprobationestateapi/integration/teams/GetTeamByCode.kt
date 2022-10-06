package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetTeamByCode : IntegrationTestBase() {

  @Test
  fun `retrieve team by code`() {
    val team = setupTeam()
    webTestClient.get()
      .uri("/team/${team.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(team.code)
      .jsonPath("$.name").isEqualTo(team.name)
  }

  @Test
  fun `Not found when get team by code that doesn't exist`() {
    val team = setupTeam()
    webTestClient.get()
      .uri("/team/NOTEAMEXISTS")
      .exchange()
      .expectStatus()
      .isNotFound
  }
}
