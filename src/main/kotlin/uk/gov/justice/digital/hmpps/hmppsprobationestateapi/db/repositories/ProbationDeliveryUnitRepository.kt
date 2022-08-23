package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.ProbationDeliveryUnit

interface ProbationDeliveryUnitRepository : ReactiveCrudRepository<ProbationDeliveryUnit, String>
