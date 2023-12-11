package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.reactive.asFlow
import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.stereotype.Repository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.mapping.TeamAndRegionRow

@Repository
class DefaultTeamsAndRegionsRepository(private val databaseClient: DatabaseClient) : TeamsAndRegionsRepository {
  override suspend fun findTeamsWithRelatedRegions(teamCodes: List<String>): Flow<TeamAndRegionRow> = databaseClient
    .sql(
      """
        select
        t.code as teamCode, t.name as teamName,
        r.code as regionCode, r.name as regionName
        from region r
        join pdu p on p.region_code = r.code
        join ldu l on l.pdu_code=p.code
        join team t on t.ldu_code=l.code
        where t.code in (:teamCodes)
        and r.soft_deleted = false
        and p.soft_deleted = false
        and l.soft_deleted = false
        and t.soft_deleted = false
        order by t.code
      """.trimIndent(),
    )
    .bind("teamCodes", teamCodes)
    .map { row ->
      TeamAndRegionRow(
        teamCode = row.get("teamCode", String::class.java),
        teamName = row.get("teamName", String::class.java),
        regionCode = row.get("regionCode", String::class.java),
        regionName = row.get("regionName", String::class.java),
      )
    }
    .all().asFlow()
}
