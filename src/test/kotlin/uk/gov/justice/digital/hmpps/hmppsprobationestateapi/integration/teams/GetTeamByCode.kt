package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetTeamByCode : IntegrationTestBase() {

  @Test
  fun `retrieve team by code`() {
    val estateOverview = setupEstate()
    webTestClient.get()
      .uri("/team/${estateOverview.team.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(estateOverview.team.code)
      .jsonPath("$.name").isEqualTo(estateOverview.team.name)
  }

  @Test
  fun `Not found when get team by code that doesn't exist`() {
    val team = setupEstate()
    webTestClient.get()
      .uri("/team/NOTEAMEXISTS")
      .exchange()
      .expectStatus()
      .isNotFound
  }
}
