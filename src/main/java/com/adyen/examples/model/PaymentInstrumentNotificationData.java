package com.adyen.examples.model;

import java.net.URI;
import java.util.Objects;
import com.adyen.examples.model.PaymentInstrument;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaymentInstrumentNotificationData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class PaymentInstrumentNotificationData {

  private String balancePlatform;

  private PaymentInstrument paymentInstrument;

  public PaymentInstrumentNotificationData balancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
    return this;
  }

  /**
   * The unique identifier of the balance platform.
   * @return balancePlatform
  */
  
  @Schema(name = "balancePlatform", description = "The unique identifier of the balance platform.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balancePlatform")
  public String getBalancePlatform() {
    return balancePlatform;
  }

  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }

  public PaymentInstrumentNotificationData paymentInstrument(PaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

  /**
   * Get paymentInstrument
   * @return paymentInstrument
  */
  @Valid 
  @Schema(name = "paymentInstrument", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentInstrument")
  public PaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(PaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentNotificationData paymentInstrumentNotificationData = (PaymentInstrumentNotificationData) o;
    return Objects.equals(this.balancePlatform, paymentInstrumentNotificationData.balancePlatform) &&
        Objects.equals(this.paymentInstrument, paymentInstrumentNotificationData.paymentInstrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balancePlatform, paymentInstrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentNotificationData {\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
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

