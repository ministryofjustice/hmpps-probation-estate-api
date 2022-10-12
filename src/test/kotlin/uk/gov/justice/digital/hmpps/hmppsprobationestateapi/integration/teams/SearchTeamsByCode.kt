package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.teams

import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class SearchTeamsByCode : IntegrationTestBase() {

  @Test
  fun `retrieve team by code`() {
    val estateOverview = setupEstate()
    webTestClient.get()
      .uri("/team/search?codes=${estateOverview.team.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[0].code").isEqualTo(estateOverview.team.code)
      .jsonPath("$.[0].name").isEqualTo(estateOverview.team.name)
  }

  @Test
  fun `retrieve multiple teams by codes`() {
    val estateOverview = setupEstate()
    val secondEstateOverview = setupEstate("TM2")

    webTestClient.get()
      .uri("/team/search?codes=${estateOverview.team.code},${secondEstateOverview.team.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[?(@.code=='${estateOverview.team.code}')].name").isEqualTo(estateOverview.team.name)
      .jsonPath("$.[?(@.code=='${secondEstateOverview.team.code}')].name").isEqualTo(secondEstateOverview.team.name)
  }
}
