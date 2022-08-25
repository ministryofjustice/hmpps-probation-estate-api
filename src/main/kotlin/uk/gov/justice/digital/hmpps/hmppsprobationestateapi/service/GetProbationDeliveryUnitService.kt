package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.ProbationDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.exception.EntityNotFoundException

@Service
class GetProbationDeliveryUnitService(
  private val probationDeliveryUnitRepository: ProbationDeliveryUnitRepository,
  private val teamRepository: TeamRepository
) {
  fun findByCode(code: String): Flux<TeamOverview> =
    probationDeliveryUnitRepository.existsById(code)
      .flatMapMany { exists ->
        if (exists) {
          return@flatMapMany teamRepository.findByPduCode(code).map { team ->
            TeamOverview(team.code, team.name)
          }
        }
        throw EntityNotFoundException("No Probation Delivery Unit found at $code")
      }
}
