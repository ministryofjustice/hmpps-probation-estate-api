package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.regions

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.ProbationDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Region
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetRegionByCode : IntegrationTestBase() {

  @Test
  fun `must get region and all PDUs associated`(): Unit = runBlocking {
    val region = regionRepository.save(Region(code = "RG1", name = "Region 1", new = true))
    val firstPdu = probationDeliveryUnitRepository.save(ProbationDeliveryUnit(code = "PDU1", name = "PDU 1", regionCode = region.code, new = true))
    val secondPdu = probationDeliveryUnitRepository.save(ProbationDeliveryUnit(code = "PDU2", name = "PDU 2", regionCode = region.code, new = true))

    webTestClient.get()
      .uri("/region/${region.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(region.code)
      .jsonPath("$.name").isEqualTo(region.name)
      .jsonPath("$.probationDeliveryUnits.[?(@.code=='${firstPdu.code}')].name").isEqualTo(firstPdu.name)
      .jsonPath("$.probationDeliveryUnits.[?(@.code=='${secondPdu.code}')].name").isEqualTo(secondPdu.name)
  }

  @Test
  fun `can get region without any PDUs`(): Unit = runBlocking {
    val region = regionRepository.save(Region(code = "RG1", name = "Region 1", new = true))
    webTestClient.get()
      .uri("/region/${region.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(region.code)
      .jsonPath("$.name").isEqualTo(region.name)
      .jsonPath("$.probationDeliveryUnits").isEmpty
  }

  @Test
  fun `Not found when get region by code that doesn't exist`() {
    webTestClient.get()
      .uri("/region/NOREGIONHERE")
      .exchange()
      .expectStatus()
      .isNotFound
  }
}
