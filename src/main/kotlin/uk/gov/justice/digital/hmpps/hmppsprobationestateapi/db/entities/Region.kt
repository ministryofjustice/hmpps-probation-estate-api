package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities

import org.springframework.beans.factory.annotation.Value
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.domain.Persistable
import java.time.ZonedDateTime
import java.time.temporal.ChronoUnit

data class Region constructor(
  @Id val code: String,
  val name: String,
  val createdDate: ZonedDateTime = ZonedDateTime.now().truncatedTo(ChronoUnit.SECONDS),
  @Transient @Value("false") val new: Boolean
) : Persistable<String> {
  override fun getId(): String? = code

  override fun isNew(): Boolean = new
}
