package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.ProbationDeliveryUnitDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.ProbationDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.RegionRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.exception.EntityNotFoundException

@Service
class GetProbationDeliveryUnitService(
  private val probationDeliveryUnitRepository: ProbationDeliveryUnitRepository,
  private val regionRepository: RegionRepository,
  private val teamRepository: TeamRepository
) {
  suspend fun findTeamsByCode(code: String): Flow<TeamOverview> {
    if (probationDeliveryUnitRepository.existsById(code)) {
      return teamRepository.findByPduCode(code).map { team ->
        TeamOverview(team.code, team.name)
      }
    }
    throw EntityNotFoundException("No Probation Delivery Unit found at $code")
  }

  suspend fun getProbationDeliveryUnitDetailsByCode(code: String): ProbationDeliveryUnitDetails? = probationDeliveryUnitRepository.findById(code)?.let {
    val region = regionRepository.findById(it.regionCode)!!.let { region -> RegionOverview(region.code, region.name) }
    val teams = teamRepository.findByPduCode(code).map { team ->
      TeamOverview(team.code, team.name)
    }.toList()
    ProbationDeliveryUnitDetails(it.code, it.name, region, teams)
  }
}
