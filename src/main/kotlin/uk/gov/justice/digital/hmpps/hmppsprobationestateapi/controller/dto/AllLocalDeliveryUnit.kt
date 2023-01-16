package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto

import com.fasterxml.jackson.annotation.JsonCreator

data class AllLocalDeliveryUnit @JsonCreator constructor(
  val name: String,
  val teams: List<TeamOverview>
)
