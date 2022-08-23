package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.ProbationDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository

@Service
class GetProbationDeliveryUnitService(
  private val probationDeliveryUnitRepository: ProbationDeliveryUnitRepository,
  private val teamRepository: TeamRepository
) {
  fun findByCode(code: String): Flux<TeamOverview> =
    probationDeliveryUnitRepository.findById(code).flatMapMany { probationDeliveryUnit ->
      teamRepository.findByPduCode(probationDeliveryUnit.code).map { team ->
        TeamOverview(team.code, team.name)
      }
    }
}
