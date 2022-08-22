package uk.gov.justice.digital.hmpps.hmppsprobationestateapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication()
class HmppsProbationEstateApi

fun main(args: Array<String>) {
  runApplication<HmppsProbationEstateApi>(*args)
}
