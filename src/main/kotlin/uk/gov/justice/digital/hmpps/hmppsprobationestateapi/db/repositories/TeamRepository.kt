package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Team

interface TeamRepository : CoroutineCrudRepository<Team, String> {

  suspend fun findByCodeInAndSoftDeletedFalse(teamCodes: List<String>): Flow<Team>
  suspend fun findByLduCodeInAndSoftDeletedFalse(lduCodes: Set<String>): Flow<Team>
}
