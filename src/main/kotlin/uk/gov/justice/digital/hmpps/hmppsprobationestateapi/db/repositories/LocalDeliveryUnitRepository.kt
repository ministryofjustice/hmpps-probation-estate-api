package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.LocalDeliveryUnit

interface LocalDeliveryUnitRepository : CoroutineCrudRepository<LocalDeliveryUnit, String> {
  suspend fun findByPduCode(pduCode: String): Flow<LocalDeliveryUnit>
}
