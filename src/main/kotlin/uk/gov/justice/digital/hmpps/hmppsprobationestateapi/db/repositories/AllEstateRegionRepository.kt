package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import kotlinx.coroutines.flow.Flow
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.mapping.AllEstateRegionRow

interface AllEstateRegionRepository {

  suspend fun findAllEstateByRegionCode(regionCode: String): Flow<AllEstateRegionRow>
}
