package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Region

interface RegionRepository : ReactiveCrudRepository<Region, String>
