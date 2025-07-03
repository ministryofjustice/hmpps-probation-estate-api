package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto

import com.fasterxml.jackson.annotation.JsonCreator

data class AllRegionDeliveryUnit @JsonCreator constructor(
  val name: String,
  val pdus: Map<String, AllProbationDeliveryUnit>,
)
