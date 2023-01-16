package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.estate

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.LocalDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.ProbationDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Region
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Team
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.IntegrationTestBase

class GetAllEstateByRegionCode : IntegrationTestBase() {

  @Test
  fun `must get all teams associated to region via LDUs and PDUs and their names`(): Unit = runBlocking {
    val region = regionRepository.save(Region(code = "RG1", name = "Region 1", new = true))
    val firstPdu = probationDeliveryUnitRepository.save(ProbationDeliveryUnit(code = "PDU1", name = "PDU 1", regionCode = region.code, new = true))
    val secondPdu = probationDeliveryUnitRepository.save(ProbationDeliveryUnit(code = "PDU2", name = "PDU 2", regionCode = region.code, new = true))

    val firstPduLdu = localDeliveryUnitRepository.save(LocalDeliveryUnit(code = "LDU1", name = "LDU 1", pduCode = firstPdu.code, new = true))

    val secondPduLdu = localDeliveryUnitRepository.save(LocalDeliveryUnit(code = "LDU3", name = "LDU 3", pduCode = secondPdu.code, new = true))

    val firstPduLduFirstTeam = teamRepository.save(Team(code = "T1", name = "Team 1", lduCode = firstPduLdu.code, new = true))
    val firstPduLduSecondTeam = teamRepository.save(Team(code = "T2", name = "Team 2", lduCode = firstPduLdu.code, new = true))

    val secondPduLduFirstTeam = teamRepository.save(Team(code = "T3", name = "Team 3", lduCode = secondPduLdu.code, new = true))
    val secondPduLduSecondTeam = teamRepository.save(Team(code = "T4", name = "Team 4", lduCode = secondPduLdu.code, new = true))

    webTestClient.get()
      .uri("/all/region/${region.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.${firstPdu.code}.name")
      .isEqualTo(firstPdu.name)
      .jsonPath("$.${firstPdu.code}.ldus.${firstPduLdu.code}.name")
      .isEqualTo(firstPduLdu.name)
      .jsonPath("$.${firstPdu.code}.ldus.${firstPduLdu.code}.teams[?(@.code == '${firstPduLduFirstTeam.code}')].name")
      .isEqualTo(firstPduLduFirstTeam.name)
      .jsonPath("$.${firstPdu.code}.ldus.${firstPduLdu.code}.teams[?(@.code == '${firstPduLduSecondTeam.code}')].name")
      .isEqualTo(firstPduLduSecondTeam.name)
      .jsonPath("$.${secondPdu.code}.ldus.${secondPduLdu.code}.teams[?(@.code == '${secondPduLduFirstTeam.code}')].name")
      .isEqualTo(secondPduLduFirstTeam.name)
      .jsonPath("$.${secondPdu.code}.ldus.${secondPduLdu.code}.teams[?(@.code == '${secondPduLduSecondTeam.code}')].name")
      .isEqualTo(secondPduLduSecondTeam.name)
  }

  @Test
  fun `must not return when no team exists`(): Unit = runBlocking {
    val region = regionRepository.save(Region(code = "RG1", name = "Region 1", new = true))
    val firstPdu = probationDeliveryUnitRepository.save(ProbationDeliveryUnit(code = "PDU1", name = "PDU 1", regionCode = region.code, new = true))
    val firstPduLdu = localDeliveryUnitRepository.save(LocalDeliveryUnit(code = "LDU1", name = "LDU 1", pduCode = firstPdu.code, new = true))
    val firstPduFirstLduFirstTeam = teamRepository.save(Team(code = "T1", name = "Team 1", lduCode = firstPduLdu.code, new = true))

    val secondPdu = probationDeliveryUnitRepository.save(ProbationDeliveryUnit(code = "PDU2", name = "PDU 2", regionCode = region.code, new = true))
    val firstPduSecondLdu = localDeliveryUnitRepository.save(LocalDeliveryUnit(code = "LDU2", name = "LDU 2", pduCode = firstPdu.code, new = true))

    webTestClient.get()
      .uri("/all/region/${region.code}")
      .exchange()
      .expectStatus()
      .isOk
      .expectBody()
      .jsonPath("$.${secondPdu.code}")
      .doesNotExist()
      .jsonPath("$.${firstPdu.code}.ldus.${firstPduSecondLdu.code}")
      .doesNotExist()
      .jsonPath("$.${firstPdu.code}")
      .exists()
      .jsonPath("$.${firstPdu.code}.ldus.${firstPduLdu.code}")
      .exists()
      .jsonPath("$.${firstPdu.code}.ldus.${firstPduLdu.code}.teams[?(@.code == '${firstPduFirstLduFirstTeam.code}')]")
      .exists()
  }
}
