package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.flow.toSet
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.ProbationDeliveryUnitDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.LocalDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.ProbationDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.RegionRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository

@Service
class GetProbationDeliveryUnitService(
  private val probationDeliveryUnitRepository: ProbationDeliveryUnitRepository,
  private val localDeliveryUnitRepository: LocalDeliveryUnitRepository,
  private val regionRepository: RegionRepository,
  private val teamRepository: TeamRepository,
) {

  suspend fun getProbationDeliveryUnitDetailsByCode(pduCode: String): ProbationDeliveryUnitDetails? = probationDeliveryUnitRepository.findById(pduCode)
    ?.let { pdu ->
      val region = regionRepository.findById(pdu.regionCode)!!.let { region -> RegionOverview(region.code, region.name) }
      val teams = getTeamsByPduCode(pduCode).toList()
      ProbationDeliveryUnitDetails(pdu.code, pdu.name, region, teams)
    }

  private suspend fun getTeamsByPduCode(pduCode: String) = teamRepository.findByLduCodeInAndSoftDeletedFalse(
    localDeliveryUnitRepository
      .findByPduCode(pduCode)
      .map { it.code }.toSet(),
  )
    .map { team ->
      TeamOverview(team.code, team.name)
    }
}
