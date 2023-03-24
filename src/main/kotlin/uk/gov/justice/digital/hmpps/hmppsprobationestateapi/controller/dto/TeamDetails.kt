package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto

import com.fasterxml.jackson.annotation.JsonCreator

data class TeamDetails @JsonCreator constructor(
  val code: String,
  val name: String,
  val probationDeliveryUnit: ProbationDeliveryUnitOverview,
)
