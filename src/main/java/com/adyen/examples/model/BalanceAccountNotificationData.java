package com.adyen.examples.model;

import java.net.URI;
import java.util.Objects;
import com.adyen.examples.model.BalanceAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BalanceAccountNotificationData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class BalanceAccountNotificationData {

  private BalanceAccount balanceAccount;

  private String balancePlatform;

  public BalanceAccountNotificationData balanceAccount(BalanceAccount balanceAccount) {
    this.balanceAccount = balanceAccount;
    return this;
  }

  /**
   * Get balanceAccount
   * @return balanceAccount
  */
  @Valid 
  @Schema(name = "balanceAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceAccount")
  public BalanceAccount getBalanceAccount() {
    return balanceAccount;
  }

  public void setBalanceAccount(BalanceAccount balanceAccount) {
    this.balanceAccount = balanceAccount;
  }

  public BalanceAccountNotificationData balancePlatform(String balancePlatform) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceAccountNotificationData balanceAccountNotificationData = (BalanceAccountNotificationData) o;
    return Objects.equals(this.balanceAccount, balanceAccountNotificationData.balanceAccount) &&
        Objects.equals(this.balancePlatform, balanceAccountNotificationData.balancePlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccount, balancePlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccountNotificationData {\n");
    sb.append("    balanceAccount: ").append(toIndentedString(balanceAccount)).append("\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
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

