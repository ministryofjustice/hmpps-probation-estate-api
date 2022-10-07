package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository

@Service
class GetTeamService(private val teamRepository: TeamRepository) {
  fun findTeamsByCode(codes: List<String>): Flow<TeamOverview> = teamRepository.findAllById(codes)
    .map { TeamOverview(it.code, it.name) }

  suspend fun findTeamByCode(teamCode: String): TeamOverview? = teamRepository
    .findById(teamCode)?.let { TeamOverview(it.code, it.name) }
}
