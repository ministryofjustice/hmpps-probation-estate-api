package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.probationDeliveryUnit

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.ProbationDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Region
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Team
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetProbationDeliveryUnitDetails : IntegrationTestBase() {

  @Test
  fun `must get PDU and all teams associated`(): Unit = runBlocking {
    val region = regionRepository.save(Region(code = "RG1", name = "Region 1", new = true))
    val probationDeliveryUnit = probationDeliveryUnitRepository.save(ProbationDeliveryUnit(code = "PDU1", name = "PDU 1", regionCode = region.code, new = true))
    val firstTeam = teamRepository.save(Team(code = "TM1", name = "A Team", pduCode = probationDeliveryUnit.code, new = true))
    val secondTeam = teamRepository.save(Team(code = "TM2", name = "B Team", pduCode = probationDeliveryUnit.code, new = true))

    webTestClient.get()
      .uri("/probationDeliveryUnit/${region.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(probationDeliveryUnit.code)
      .jsonPath("$.name").isEqualTo(probationDeliveryUnit.name)
      .jsonPath("$.region.code").isEqualTo(region.code)
      .jsonPath("$.region.name").isEqualTo(region.name)
      .jsonPath("$.teams.[?(@.code=='${firstTeam.code}')].name").isEqualTo(firstTeam.name)
      .jsonPath("$.teams.[?(@.code=='${secondTeam.code}')].name").isEqualTo(secondTeam.name)
  }

  @Test
  fun `can get PDU without any teams`(): Unit = runBlocking {
    val region = regionRepository.save(Region(code = "RG1", name = "Region 1", new = true))
    val probationDeliveryUnit = probationDeliveryUnitRepository.save(ProbationDeliveryUnit(code = "PDU1", name = "PDU 1", regionCode = region.code, new = true))
    webTestClient.get()
      .uri("/probationDeliveryUnit/${region.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.code").isEqualTo(probationDeliveryUnit.code)
      .jsonPath("$.name").isEqualTo(probationDeliveryUnit.name)
      .jsonPath("$.region.code").isEqualTo(region.code)
      .jsonPath("$.region.name").isEqualTo(region.name)
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
