package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.converter.Converter
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.oauth2.jwt.Jwt
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter
import org.springframework.security.web.server.SecurityWebFilterChain
import reactor.core.publisher.Mono

@Configuration
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
class ResourceServerConfiguration {

  @Throws(Exception::class)
  @Bean
  fun springSecurityFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain {
    return http
      .csrf { it.disable() } // crst not needed an rest api
      .authorizeExchange {
        it.pathMatchers(
          "/webjars/**", "/favicon.ico", "/csrf",
          "/health/**", "/info", "/env",
          "/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html", "/readiness-profiles/**"
        ).permitAll()
          .anyExchange().authenticated()
      }
      .oauth2ResourceServer { it.jwt().jwtAuthenticationConverter(ReactiveAuthAwareTokenConverter()) }
      .build()
  }
}

class ReactiveAuthAwareTokenConverter : Converter<Jwt, Mono<AuthAwareAuthenticationToken>> {
  private val jwtGrantedAuthoritiesConverter: Converter<Jwt, Collection<GrantedAuthority>> =
    JwtGrantedAuthoritiesConverter()

  override fun convert(jwt: Jwt): Mono<AuthAwareAuthenticationToken> {
    val claims = jwt.claims
    val principal = findPrincipal(claims)
    val authorities = extractAuthorities(jwt)
    return Mono.just(AuthAwareAuthenticationToken(jwt, principal, authorities))
  }

  private fun findPrincipal(claims: Map<String, Any?>): String {
    return if (claims.containsKey("user_name")) {
      claims["user_name"] as String
    } else if (claims.containsKey("user_id")) {
      claims["user_id"] as String
    } else {
      claims["client_id"] as String
    }
  }

  private fun extractAuthorities(jwt: Jwt): Collection<GrantedAuthority> {
    val authorities = mutableListOf<GrantedAuthority>().apply { addAll(jwtGrantedAuthoritiesConverter.convert(jwt)!!) }
    if (jwt.claims.containsKey("authorities")) {
      @Suppress("UNCHECKED_CAST")
      val claimAuthorities = (jwt.claims["authorities"] as Collection<String>).toList()
      authorities.addAll(claimAuthorities.map(::SimpleGrantedAuthority))
    }
    return authorities.toSet()
  }
}

class AuthAwareAuthenticationToken(
  jwt: Jwt,
  private val aPrincipal: String,
  authorities: Collection<GrantedAuthority>
) : JwtAuthenticationToken(jwt, authorities) {
  override fun getPrincipal(): String {
    return aPrincipal
  }
}
