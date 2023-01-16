package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import kotlinx.coroutines.flow.toList
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.AllLocalDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.AllProbationDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.AllEstateRegionRepository

@Service
class AllEstateService(private val allEstateRegionRepository: AllEstateRegionRepository) {

  suspend fun getEstateByRegionCode(code: String): Map<String, AllProbationDeliveryUnit>? = allEstateRegionRepository.findAllEstateByRegionCode(code)
    .toList()
    .groupBy { it.pduCode }
    .mapValues { pdus ->
      AllProbationDeliveryUnit(
        pdus.key,
        pdus.value.groupBy { it.lduCode }
          .mapValues { ldu -> AllLocalDeliveryUnit(ldu.value[0].lduName, ldu.value.map { TeamOverview(it.teamCode, it.teamName) }) }
      )
    }
}
