package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client

import kotlinx.coroutines.runBlocking
import org.springframework.cache.annotation.CacheEvict
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service.ProbationEstateService

@Component
class CacheRefresh(private val probationEstateService: ProbationEstateService) {
  @Scheduled(cron = "0 0/10 * * * *")
  @CacheEvict(cacheNames = ["probationEstate"], allEntries = true)
  fun updateProbationEstate() {
    runBlocking {
      probationEstateService.getProbationEstate()
    }
  }
}
