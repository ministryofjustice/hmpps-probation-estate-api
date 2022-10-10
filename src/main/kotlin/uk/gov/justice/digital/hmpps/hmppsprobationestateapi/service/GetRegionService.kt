package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.ProbationDeliveryUnitOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.RegionRepository

@Service
class GetRegionService(private val regionRepository: RegionRepository, private val probationDeliveryUnitService: GetProbationDeliveryUnitService) {
  suspend fun getAll(): Flow<RegionOverview> = regionRepository.findAll()
    .map { RegionOverview(it.code, it.name) }

  suspend fun getRegionByCode(code: String): RegionDetails? = regionRepository.findById(code)?.let {
    val pdus = probationDeliveryUnitService.findByRegionCode(code).map { pdu -> ProbationDeliveryUnitOverview(pdu.code, pdu.name) }.toList()
    RegionDetails(it.code, it.name, pdus)
  }
}
