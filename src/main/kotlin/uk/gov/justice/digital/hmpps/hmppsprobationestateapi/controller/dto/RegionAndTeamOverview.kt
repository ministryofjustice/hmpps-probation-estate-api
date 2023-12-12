package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto

import com.fasterxml.jackson.annotation.JsonCreator

data class RegionAndTeamOverview @JsonCreator constructor(
  val region: RegionOverview,
  val team: TeamOverview,
)
