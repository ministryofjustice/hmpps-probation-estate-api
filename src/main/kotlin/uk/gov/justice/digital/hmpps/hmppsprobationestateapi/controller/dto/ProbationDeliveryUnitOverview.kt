package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto

import com.fasterxml.jackson.annotation.JsonCreator

data class ProbationDeliveryUnitOverview @JsonCreator constructor(
  val code: String,
  val name: String,
)
