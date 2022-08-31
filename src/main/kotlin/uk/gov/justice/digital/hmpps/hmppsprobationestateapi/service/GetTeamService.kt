package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository

@Service
class GetTeamService(private val teamRepository: TeamRepository) {
  fun findTeamsByCode(codes: List<String>): Flux<TeamOverview> = teamRepository.findAllById(codes)
    .map { TeamOverview(it.code, it.name) }
}
