package com.adyen.examples.model.configuration;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * AccountHolderNotificationData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class AccountHolderNotificationData {

  private AccountHolder accountHolder;

  private String balancePlatform;

  public AccountHolderNotificationData accountHolder(AccountHolder accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

  /**
   * Get accountHolder
   * @return accountHolder
  */
  @Valid 
  @Schema(name = "accountHolder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountHolder")
  public AccountHolder getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(AccountHolder accountHolder) {
    this.accountHolder = accountHolder;
  }

  public AccountHolderNotificationData balancePlatform(String balancePlatform) {
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
    AccountHolderNotificationData accountHolderNotificationData = (AccountHolderNotificationData) o;
    return Objects.equals(this.accountHolder, accountHolderNotificationData.accountHolder) &&
        Objects.equals(this.balancePlatform, accountHolderNotificationData.balancePlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolder, balancePlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolderNotificationData {\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
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

