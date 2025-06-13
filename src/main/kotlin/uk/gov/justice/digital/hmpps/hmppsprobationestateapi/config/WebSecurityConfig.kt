package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

@Configuration
@EnableWebFluxSecurity
class WebSecurityConfig {
  @Bean
  fun securityWebFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain = http.csrf().disable()
    .authorizeExchange().anyExchange().permitAll()
    .and().build()
}
