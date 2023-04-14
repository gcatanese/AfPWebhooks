package com.adyen.examples.model.configuration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Amount
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class Amount {

  private String currency;

  private Long value;

  /**
   * Default constructor
   * @deprecated Use {@link Amount#Amount(String, Long)}
   */
  @Deprecated
  public Amount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Amount(String currency, Long value) {
    this.currency = currency;
    this.value = value;
  }

  public Amount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).
   * @return currency
  */
  @NotNull @Size(min = 3, max = 3) 
  @Schema(name = "currency", description = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Amount value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * The amount of the transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes).
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "The amount of the transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.currency, amount.currency) &&
        Objects.equals(this.value, amount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

