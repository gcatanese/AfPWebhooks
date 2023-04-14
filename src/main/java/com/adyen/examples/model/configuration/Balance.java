package com.adyen.examples.model.configuration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Balance
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class Balance {

  private Long available;

  private Long balance;

  private String currency;

  private Long reserved;

  /**
   * Default constructor
   * @deprecated Use {@link Balance#Balance(Long, Long, String, Long)}
   */
  @Deprecated
  public Balance() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Balance(Long available, Long balance, String currency, Long reserved) {
    this.available = available;
    this.balance = balance;
    this.currency = currency;
    this.reserved = reserved;
  }

  public Balance available(Long available) {
    this.available = available;
    return this;
  }

  /**
   * The remaining amount available for spending.
   * @return available
  */
  @NotNull 
  @Schema(name = "available", description = "The remaining amount available for spending.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("available")
  public Long getAvailable() {
    return available;
  }

  public void setAvailable(Long available) {
    this.available = available;
  }

  public Balance balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The total amount in the balance.
   * @return balance
  */
  @NotNull 
  @Schema(name = "balance", description = "The total amount in the balance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("balance")
  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public Balance currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance.
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", description = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Balance reserved(Long reserved) {
    this.reserved = reserved;
    return this;
  }

  /**
   * The amount reserved for payments that have been authorised, but have not been captured yet.
   * @return reserved
  */
  @NotNull 
  @Schema(name = "reserved", description = "The amount reserved for payments that have been authorised, but have not been captured yet.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reserved")
  public Long getReserved() {
    return reserved;
  }

  public void setReserved(Long reserved) {
    this.reserved = reserved;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.available, balance.available) &&
        Objects.equals(this.balance, balance.balance) &&
        Objects.equals(this.currency, balance.currency) &&
        Objects.equals(this.reserved, balance.reserved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, balance, currency, reserved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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

