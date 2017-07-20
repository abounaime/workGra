package org.graylog2.indexer.retention.strategies;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_NoopRetentionStrategyConfig extends $AutoValue_NoopRetentionStrategyConfig {
  AutoValue_NoopRetentionStrategyConfig(String type, int maxNumberOfIndices) {
    super(type, maxNumberOfIndices);
  }

  @JsonIgnore
  public final String getType() {
    return type();
  }

  @JsonIgnore
  public final int getMaxNumberOfIndices() {
    return maxNumberOfIndices();
  }
}