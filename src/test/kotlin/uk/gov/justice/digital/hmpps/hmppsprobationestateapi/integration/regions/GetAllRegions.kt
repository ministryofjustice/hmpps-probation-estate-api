package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.regions

import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Region
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetAllRegions : IntegrationTestBase() {

  @Test
  fun `must get all regions`() {
    val regions = regionRepository.saveAll(
      listOf(
        Region(code = "REGION1", name = "First Region", new = true),
        Region(code = "REGION2", name = "Second Region", new = true),
        Region(code = "REGION3", name = "Third Region", new = true)
      )
    ).collectList().block()!!

    webTestClient.get()
      .uri("/regions")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.[?(@.code=='${regions[0].code}')].name").isEqualTo(regions[0].name)
      .jsonPath("$.[?(@.code=='${regions[1].code}')].name").isEqualTo(regions[1].name)
      .jsonPath("$.[?(@.code=='${regions[2].code}')].name").isEqualTo(regions[2].name)
  }
}
