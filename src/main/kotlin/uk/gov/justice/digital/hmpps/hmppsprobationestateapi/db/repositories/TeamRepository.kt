package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Team

interface TeamRepository : ReactiveCrudRepository<Team, String> {
  // I think the SQL can be put here and it will just work, but not tried it yet
}
