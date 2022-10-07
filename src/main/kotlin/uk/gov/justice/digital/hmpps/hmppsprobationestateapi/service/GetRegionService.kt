package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.RegionRepository

@Service
class GetRegionService(private val regionRepository: RegionRepository) {
  suspend fun getAll(): Flow<RegionOverview> = regionRepository.findAll()
    .map { RegionOverview(it.code, it.name) }
}
