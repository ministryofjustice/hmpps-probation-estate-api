package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.ProbationDeliveryUnit

interface ProbationDeliveryUnitRepository : CoroutineCrudRepository<ProbationDeliveryUnit, String>
