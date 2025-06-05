package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.cache.CacheManager
import org.springframework.cache.support.NoOpCacheManager
import org.springframework.context.annotation.Bean

@TestConfiguration
class NoOpCacheConfig {
  @Bean
  fun cacheManager(): CacheManager = NoOpCacheManager()
}