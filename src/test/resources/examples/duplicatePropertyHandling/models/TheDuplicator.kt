package examples.duplicatePropertyHandling.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class TheDuplicator(
  @param:JsonProperty("top_level_duplicate")
  @get:JsonProperty("top_level_duplicate")
  public val topLevelDuplicate: String? = null,
  @param:JsonProperty("child_duplicate")
  @get:JsonProperty("child_duplicate")
  public val childDuplicate: String? = null,
)
