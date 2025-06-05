package uk.gov.justice.digital.hmpps.hmppsprobationestateapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication()
@EnableCaching
class HmppsProbationEstateApi

fun main(args: Array<String>) {
  runApplication<HmppsProbationEstateApi>(*args)
}
