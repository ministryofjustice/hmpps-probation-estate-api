package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.ProbationDeliveryUnitOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionAndTeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.exception.EntityNotFoundException

@Service
class GetRegionService(
  private val probationEstateService: ProbationEstateService,
) {
  suspend fun getAll(): Flow<RegionOverview> = probationEstateService.getProbationEstate().providers.asFlow().map { RegionOverview(it.code, it.description) }

  suspend fun getRegionDetailsByCode(code: String): RegionDetails {
    val provider = probationEstateService.getProbationEstate().providers.firstOrNull { it.code == code }
      ?: throw EntityNotFoundException("Region with code $code not found")

    val pdus = provider.probationDeliveryUnits.map {
      ProbationDeliveryUnitOverview(it.code, it.description)
    }

    return RegionDetails(provider.code, provider.description, pdus)
  }

  suspend fun getRegionAndTeamOverviews(teamCodes: List<String>): List<RegionAndTeamOverview> {
    val teamCodesAsSet: Set<String> = teamCodes.toSet()
    val results = probationEstateService.getProbationEstate().providers
      .mapNotNull { provider ->
        val matchingTeams = provider.probationDeliveryUnits
          .flatMap { pdu -> pdu.localAdminUnits }
          .flatMap { lau -> lau.teams }
          .filter { it.code in teamCodesAsSet }
        if (matchingTeams.isNotEmpty()) provider to matchingTeams else null
      }.toMap()
    val returnList = ArrayList<RegionAndTeamOverview>()

    results.forEach { (provider, teams) ->
      val regionOverview = RegionOverview(provider.code, provider.description)
      teams.forEach { team ->
        returnList.add(RegionAndTeamOverview(regionOverview, TeamOverview(team.code, team.description)))
      }
    }

    if (returnList.isEmpty()) {
      throw EntityNotFoundException("No teams found for given codes")
    }
    return returnList.toList()
  }
}
