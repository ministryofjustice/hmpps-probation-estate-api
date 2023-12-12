package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetTeamByCode : IntegrationTestBase() {

  @Test
  fun `retrieve team details by code`() {
    val estateOverview = setupEstate()
    webTestClient.get()
      .uri("/team/${estateOverview.teams[0].code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(estateOverview.teams[0].code)
      .jsonPath("$.name").isEqualTo(estateOverview.teams[0].name)
      .jsonPath("$.probationDeliveryUnit.code").isEqualTo(estateOverview.probationDeliveryUnit.code)
      .jsonPath("$.probationDeliveryUnit.name").isEqualTo(estateOverview.probationDeliveryUnit.name)
  }

  @Test
  fun `Not found when get team by code that doesn't exist`() {
    setupEstate()
    webTestClient.get()
      .uri("/team/NOTEAMEXISTS")
      .exchange()
      .expectStatus()
      .isNotFound
  }
}
