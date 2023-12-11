package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.ProbationDeliveryUnitOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionAndTeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.ProbationDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.RegionRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamsAndRegionsRepository

@Service
class GetRegionService(
  private val regionRepository: RegionRepository,
  private val probationDeliveryUnitRepository: ProbationDeliveryUnitRepository,
  private val teamsAndRegionsRepository: TeamsAndRegionsRepository,
) {
  suspend fun getAll(): Flow<RegionOverview> = regionRepository.findBySoftDeletedFalse()
    .map { RegionOverview(it.code, it.name) }

  suspend fun getRegionDetailsByCode(code: String): RegionDetails? = regionRepository.findById(code)?.let {
    val pdus = probationDeliveryUnitRepository.findByRegionCodeAndSoftDeletedFalse(code).map { pdu -> ProbationDeliveryUnitOverview(pdu.code, pdu.name) }.toList()
    RegionDetails(it.code, it.name, pdus)
  }

  suspend fun getRegionAndTeamOverviews(teamCodes: List<String>): List<RegionAndTeamOverview> = teamsAndRegionsRepository.findTeamsWithRelatedRegions(teamCodes)
    .toList()
    .map { teamsWithRelatedRegion ->
      RegionAndTeamOverview(
        region = RegionOverview(
          code = teamsWithRelatedRegion.regionCode,
          name = teamsWithRelatedRegion.regionName,
        ),
        team = TeamOverview(
          code = teamsWithRelatedRegion.teamCode,
          name = teamsWithRelatedRegion.teamName,
        ),
      )
    }
}
