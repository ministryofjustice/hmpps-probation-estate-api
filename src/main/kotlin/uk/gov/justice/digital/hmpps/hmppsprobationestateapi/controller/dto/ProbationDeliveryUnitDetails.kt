package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto

import com.fasterxml.jackson.annotation.JsonCreator

data class ProbationDeliveryUnitDetails @JsonCreator constructor(
  val code: String,
  val name: String,
  val region: RegionOverview,
  val teams: List<TeamOverview>,
)
