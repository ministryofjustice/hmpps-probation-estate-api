package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.exception.EntityNotFoundException

@Service
class GetTeamService(private val teamRepository: TeamRepository) {
  fun findTeamsByCode(codes: List<String>): Flux<TeamOverview> = teamRepository.findAllById(codes)
    .map { TeamOverview(it.code, it.name) }

  fun findTeamByCode(teamCode: String): Mono<TeamOverview> = teamRepository
    .findById(teamCode)
    .map { TeamOverview(it.code, it.name) }
    .switchIfEmpty(Mono.error(EntityNotFoundException("No team found for $teamCode")))
}
