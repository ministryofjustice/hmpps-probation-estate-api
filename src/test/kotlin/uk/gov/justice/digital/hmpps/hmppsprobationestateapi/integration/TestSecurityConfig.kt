package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

@TestConfiguration
class TestSecurityConfig {

  @Bean
  fun testSecurityWebFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain = http
    .csrf { it.disable() }
    .authorizeExchange { it.anyExchange().permitAll() }
    .build()
}
