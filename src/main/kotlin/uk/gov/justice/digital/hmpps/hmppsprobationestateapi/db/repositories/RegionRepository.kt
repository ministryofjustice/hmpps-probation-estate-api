package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Region

interface RegionRepository : CoroutineCrudRepository<Region, String> {
  suspend fun findBySoftDeletedFalse(): Flow<Region>
}
