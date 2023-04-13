package com.adyen.examples.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Expiry
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class Expiry {

  private String month;

  private String year;

  public Expiry month(String month) {
    this.month = month;
    return this;
  }

  /**
   * The month in which the card will expire.
   * @return month
  */
  
  @Schema(name = "month", description = "The month in which the card will expire.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("month")
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Expiry year(String year) {
    this.year = year;
    return this;
  }

  /**
   * The year in which the card will expire.
   * @return year
  */
  
  @Schema(name = "year", description = "The year in which the card will expire.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("year")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expiry expiry = (Expiry) o;
    return Objects.equals(this.month, expiry.month) &&
        Objects.equals(this.year, expiry.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expiry {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

