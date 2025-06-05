package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client.DeliusClient
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.ProbationDeliveryUnitOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview

@Service
class GetTeamService(private val deliusClient: DeliusClient) {

  suspend fun findTeamsByCode(codes: List<String>): Flow<TeamOverview> = deliusClient.getProbationEstate().providers
    .mapNotNull { provider ->
      val matchingTeams = provider.probationDeliveryUnits
        .flatMap { pdu -> pdu.localAdminUnits }
        .flatMap { lau -> lau.teams }
        .filter { it.code in codes }
      matchingTeams.ifEmpty { null }
    }.flatten().map { TeamOverview(it.code, it.description) }.asFlow()

  suspend fun findTeamDetailsByCode(teamCode: String): TeamDetails? {
    val estate = deliusClient.getProbationEstate()
    estate.providers.forEach { provider ->
      provider.probationDeliveryUnits.forEach { pdu ->
        pdu.localAdminUnits.forEach { lau ->
          lau.teams.firstOrNull { it.code == teamCode }?.let { team ->
            return TeamDetails(
              code = team.code,
              name = team.description,
              probationDeliveryUnit = ProbationDeliveryUnitOverview(
                code = pdu.code,
                name = pdu.description,
              ),
            )
          }
        }
      }
    }
    return null
  }
}
