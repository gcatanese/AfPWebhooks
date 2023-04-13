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
 * PaymentInstrumentReference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class PaymentInstrumentReference {

  private String id;

  /**
   * Default constructor
   * @deprecated Use {@link PaymentInstrumentReference#PaymentInstrumentReference(String)}
   */
  @Deprecated
  public PaymentInstrumentReference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentInstrumentReference(String id) {
    this.id = id;
  }

  public PaymentInstrumentReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the payment instrument.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The unique identifier of the payment instrument.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentReference paymentInstrumentReference = (PaymentInstrumentReference) o;
    return Objects.equals(this.id, paymentInstrumentReference.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

