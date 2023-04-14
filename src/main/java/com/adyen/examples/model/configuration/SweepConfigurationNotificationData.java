package com.adyen.examples.model.configuration;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * SweepConfigurationNotificationData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class SweepConfigurationNotificationData {

  private String accountId;

  private String balancePlatform;

  private SweepConfigurationV2 sweep;

  public SweepConfigurationNotificationData accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The unique identifier of the balance account for which the sweep was configured.
   * @return accountId
  */
  
  @Schema(name = "accountId", description = "The unique identifier of the balance account for which the sweep was configured.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SweepConfigurationNotificationData balancePlatform(String balancePlatform) {
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

  public SweepConfigurationNotificationData sweep(SweepConfigurationV2 sweep) {
    this.sweep = sweep;
    return this;
  }

  /**
   * Get sweep
   * @return sweep
  */
  @Valid 
  @Schema(name = "sweep", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sweep")
  public SweepConfigurationV2 getSweep() {
    return sweep;
  }

  public void setSweep(SweepConfigurationV2 sweep) {
    this.sweep = sweep;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepConfigurationNotificationData sweepConfigurationNotificationData = (SweepConfigurationNotificationData) o;
    return Objects.equals(this.accountId, sweepConfigurationNotificationData.accountId) &&
        Objects.equals(this.balancePlatform, sweepConfigurationNotificationData.balancePlatform) &&
        Objects.equals(this.sweep, sweepConfigurationNotificationData.sweep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, balancePlatform, sweep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepConfigurationNotificationData {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    sweep: ").append(toIndentedString(sweep)).append("\n");
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

