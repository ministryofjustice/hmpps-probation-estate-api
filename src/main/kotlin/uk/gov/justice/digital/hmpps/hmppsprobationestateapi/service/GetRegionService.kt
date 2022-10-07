package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.RegionRepository

@Service
class GetRegionService(private val regionRepository: RegionRepository) {
  fun getAll(): Flux<RegionOverview> = regionRepository.findAll()
    .map { RegionOverview(it.code, it.name) }
}
