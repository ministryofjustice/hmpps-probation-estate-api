package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.ProbationDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.exception.EntityNotFoundException

@Service
class GetProbationDeliveryUnitService(
  private val probationDeliveryUnitRepository: ProbationDeliveryUnitRepository,
  private val teamRepository: TeamRepository,
  private val databaseClient: DatabaseClient
) {
  fun findByCode(code: String): Flux<TeamOverview> {
    val foundTeams = databaseClient
      .sql("select team.code, team.name from team inner join pdu on pdu.code = team.pdu_code where pdu.code = :pdu_code")
      .bind("pdu_code", code)
      .map { row, _ ->
        TeamOverview(
          row.get("code", String::class.java)!!,
          row.get("name", String::class.java)!!
        )
      }
      .all()
    // Cannot get empty check to work
//    foundTeams.switchIfEmpty { throw EntityNotFoundException("No Probation Delivery Unit found at $code") }
//    foundTeams.hasElements().map { isAvailable ->
//      if (!isAvailable) {
//        throw EntityNotFoundException("No Probation Delivery Unit found at $code")
//      }
//    }
    return foundTeams
  }
}
