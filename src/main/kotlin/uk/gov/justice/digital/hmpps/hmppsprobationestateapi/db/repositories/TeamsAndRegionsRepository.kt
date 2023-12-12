package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import kotlinx.coroutines.flow.Flow
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.mapping.TeamAndRegionRow

interface TeamsAndRegionsRepository {

  suspend fun findTeamsWithRelatedRegions(teamCodes: List<String>): Flow<TeamAndRegionRow>
}
