
package org.graylog2.rest.models.dashboards.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_UpdateDashboardRequest extends UpdateDashboardRequest {

  private final String title;
  private final String description;
  private final Boolean favoriteDash;

  $AutoValue_UpdateDashboardRequest(
      @Nullable String title,
      @Nullable String description,
      Boolean favoriteDash) {
    this.title = title;
    this.description = description;
    if (favoriteDash == null) {
      throw new NullPointerException("Null favoriteDash");
    }
    this.favoriteDash = favoriteDash;
  }

  @JsonProperty
  @Nullable
  @Override
  public String title() {
    return title;
  }

  @JsonProperty
  @Nullable
  @Override
  public String description() {
    return description;
  }

  @JsonProperty(value = "isFavoriteDash")
  @Override
  public Boolean favoriteDash() {
    return favoriteDash;
  }

  @Override
  public String toString() {
    return "UpdateDashboardRequest{"
        + "title=" + title + ", "
        + "description=" + description + ", "
        + "favoriteDash=" + favoriteDash
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpdateDashboardRequest) {
      UpdateDashboardRequest that = (UpdateDashboardRequest) o;
      return ((this.title == null) ? (that.title() == null) : this.title.equals(that.title()))
           && ((this.description == null) ? (that.description() == null) : this.description.equals(that.description()))
           && (this.favoriteDash.equals(that.favoriteDash()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (title == null) ? 0 : this.title.hashCode();
    h *= 1000003;
    h ^= (description == null) ? 0 : this.description.hashCode();
    h *= 1000003;
    h ^= this.favoriteDash.hashCode();
    return h;
  }

}
