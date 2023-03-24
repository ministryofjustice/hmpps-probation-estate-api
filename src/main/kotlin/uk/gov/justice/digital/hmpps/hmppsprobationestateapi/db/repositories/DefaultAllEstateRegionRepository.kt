package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.reactive.asFlow
import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.stereotype.Repository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.mapping.AllEstateRegionRow

@Repository
class DefaultAllEstateRegionRepository(private val databaseClient: DatabaseClient) : AllEstateRegionRepository {
  override suspend fun findAllEstateByRegionCode(regionCode: String): Flow<AllEstateRegionRow> = databaseClient
    .sql(
      "select p.code as pduCode, p.name as pduName, l.code as lduCode, l.name as lduName, t.code as teamCode, t.name as teamName " +
        "from region r " +
        "join pdu p on p.region_code = r.code " +
        "join ldu l on l.pdu_code=p.code " +
        "join team t on t.ldu_code=l.code " +
        "where r.code=:regionCode " +
        "and r.soft_deleted = false " +
        "and p.soft_deleted = false " +
        "and l.soft_deleted = false " +
        "and t.soft_deleted = false",
    )
    .bind("regionCode", regionCode)
    .map { row ->
      AllEstateRegionRow(
        row.get("pduCode", String::class.java),
        row.get("pduName", String::class.java),
        row.get("lduCode", String::class.java),
        row.get("lduName", String::class.java),
        row.get("teamCode", String::class.java),
        row.get("teamName", String::class.java),
      )
    }
    .all().asFlow()
}
