package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.String;

final class AutoValue_CreateDashboardRequest extends $AutoValue_CreateDashboardRequest {
  AutoValue_CreateDashboardRequest(String title, String description, boolean favoriteDash) {
    super(title, description, favoriteDash);
  }

  @JsonIgnore
  public final String getTitle() {
    return title();
  }

  @JsonIgnore
  public final String getDescription() {
    return description();
  }

  @JsonIgnore
  public final boolean isFavoriteDash() {
    return favoriteDash();
  }
}
