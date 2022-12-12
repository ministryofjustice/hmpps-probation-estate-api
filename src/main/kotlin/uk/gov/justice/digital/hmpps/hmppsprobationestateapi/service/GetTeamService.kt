package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.ProbationDeliveryUnitOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.LocalDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.ProbationDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository

@Service
class GetTeamService(private val teamRepository: TeamRepository, private val probationDeliveryUnitRepository: ProbationDeliveryUnitRepository, private val localDeliveryUnitRepository: LocalDeliveryUnitRepository) {
  fun findTeamsByCode(codes: List<String>): Flow<TeamOverview> = teamRepository.findAllById(codes)
    .map { TeamOverview(it.code, it.name) }

  suspend fun findTeamDetailsByCode(teamCode: String): TeamDetails? = teamRepository
    .findById(teamCode)?.let {
      val pduCode = localDeliveryUnitRepository.findById(it.lduCode)!!.pduCode
      val probationDeliveryUnitOverview = probationDeliveryUnitRepository.findById(pduCode)!!
        .let { probationDeliveryUnit -> ProbationDeliveryUnitOverview(probationDeliveryUnit.code, probationDeliveryUnit.name) }
      TeamDetails(it.code, it.name, probationDeliveryUnitOverview)
    }
}
