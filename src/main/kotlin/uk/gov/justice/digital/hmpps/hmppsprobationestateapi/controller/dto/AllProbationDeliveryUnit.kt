package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto

import com.fasterxml.jackson.annotation.JsonCreator

data class AllProbationDeliveryUnit @JsonCreator constructor(
  val name: String,
  val ldus: Map<String, AllLocalDeliveryUnit>
)
