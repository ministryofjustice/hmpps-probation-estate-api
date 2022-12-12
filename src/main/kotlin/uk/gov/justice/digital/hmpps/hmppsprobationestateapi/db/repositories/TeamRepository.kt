package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Team

interface TeamRepository : CoroutineCrudRepository<Team, String> {
  suspend fun findByLduCode(lduCode: String): Flow<Team>

  suspend fun findByLduCodeIn(lduCodes: Set<String>): Flow<Team>
}
