package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client.DeliusClient
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.ProbationDeliveryUnitOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionAndTeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview

@Service
class GetRegionService(
  private val deliusClient: DeliusClient,
) {
  suspend fun getAll(): Flow<RegionOverview> = deliusClient.getProbationEstate().providers.asFlow().map { RegionOverview(it.code, it.description) }

  suspend fun getRegionDetailsByCode(code: String): RegionDetails? = deliusClient.getProbationEstate().providers.firstOrNull { it.code == code }.let {
    val pdus = it?.probationDeliveryUnits?.map { ProbationDeliveryUnitOverview(it.code, it.description) }
    RegionDetails(it?.code ?: "", it?.description ?: "", pdus!!)
  }

  suspend fun getRegionAndTeamOverviews(teamCodes: List<String>): List<RegionAndTeamOverview> {
    val teamCodesAsSet: Set<String> = teamCodes.toSet()
    val results = deliusClient.getProbationEstate().providers
      .mapNotNull { provider ->
        val matchingTeams = provider.probationDeliveryUnits
          .flatMap { pdu -> pdu.localAdminUnits }
          .flatMap { lau -> lau.teams }
          .filter { it.code in teamCodesAsSet }
        if (matchingTeams.isNotEmpty()) provider to matchingTeams else null
      }.toMap()
    val returnList = ArrayList<RegionAndTeamOverview>()
    results.forEach { provider ->
      {
        val regionOverview = RegionOverview(provider.key.code, provider.key.description)
        val teamOverviews = provider.value.map { team -> TeamOverview(team.code, team.description) }
          .forEach { teamOverview ->
            {
              returnList.add(RegionAndTeamOverview(regionOverview, teamOverview))
            }
          }
      }
    }
    return returnList.toList()
  }
}
