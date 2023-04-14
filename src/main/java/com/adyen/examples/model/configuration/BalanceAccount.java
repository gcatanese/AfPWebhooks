package com.adyen.examples.model.configuration;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * BalanceAccount
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class BalanceAccount {

  private String accountHolderId;

  @Valid
  private List<@Valid Balance> balances;

  private String defaultCurrencyCode;

  private String description;

  private String id;

  @Valid
  private List<@Valid PaymentInstrumentReference> paymentInstruments;

  private String reference;

  /**
   * The status of the balance account, set to **Active** by default.  
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    SUSPENDED("Suspended");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  @Valid
  private Map<String, SweepConfiguration> sweepConfigurations = new HashMap<>();

  private String timeZone;

  /**
   * Default constructor
   * @deprecated Use {@link BalanceAccount#BalanceAccount(String, String)}
   */
  @Deprecated
  public BalanceAccount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BalanceAccount(String accountHolderId, String id) {
    this.accountHolderId = accountHolderId;
    this.id = id;
  }

  public BalanceAccount accountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
    return this;
  }

  /**
   * The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.
   * @return accountHolderId
  */
  @NotNull 
  @Schema(name = "accountHolderId", description = "The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountHolderId")
  public String getAccountHolderId() {
    return accountHolderId;
  }

  public void setAccountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
  }

  public BalanceAccount balances(List<@Valid Balance> balances) {
    this.balances = balances;
    return this;
  }

  public BalanceAccount addBalancesItem(Balance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * List of balances with the amount and currency.
   * @return balances
  */
  @Valid 
  @Schema(name = "balances", description = "List of balances with the amount and currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balances")
  public List<@Valid Balance> getBalances() {
    return balances;
  }

  public void setBalances(List<@Valid Balance> balances) {
    this.balances = balances;
  }

  public BalanceAccount defaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
    return this;
  }

  /**
   * The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**.
   * @return defaultCurrencyCode
  */
  
  @Schema(name = "defaultCurrencyCode", description = "The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultCurrencyCode")
  public String getDefaultCurrencyCode() {
    return defaultCurrencyCode;
  }

  public void setDefaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
  }

  public BalanceAccount description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.
   * @return description
  */
  @Size(max = 300) 
  @Schema(name = "description", description = "A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BalanceAccount id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the balance account.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The unique identifier of the balance account.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BalanceAccount paymentInstruments(List<@Valid PaymentInstrumentReference> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
    return this;
  }

  public BalanceAccount addPaymentInstrumentsItem(PaymentInstrumentReference paymentInstrumentsItem) {
    if (this.paymentInstruments == null) {
      this.paymentInstruments = new ArrayList<>();
    }
    this.paymentInstruments.add(paymentInstrumentsItem);
    return this;
  }

  /**
   * List of [payment instruments](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/paymentInstruments) associated with the balance account.
   * @return paymentInstruments
  */
  @Valid 
  @Schema(name = "paymentInstruments", description = "List of [payment instruments](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/paymentInstruments) associated with the balance account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentInstruments")
  public List<@Valid PaymentInstrumentReference> getPaymentInstruments() {
    return paymentInstruments;
  }

  public void setPaymentInstruments(List<@Valid PaymentInstrumentReference> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }

  public BalanceAccount reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the balance account, maximum 150 characters.
   * @return reference
  */
  @Size(max = 150) 
  @Schema(name = "reference", description = "Your reference for the balance account, maximum 150 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public BalanceAccount status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the balance account, set to **Active** by default.  
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the balance account, set to **Active** by default.  ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BalanceAccount sweepConfigurations(Map<String, SweepConfiguration> sweepConfigurations) {
    this.sweepConfigurations = sweepConfigurations;
    return this;
  }

  public BalanceAccount putSweepConfigurationsItem(String key, SweepConfiguration sweepConfigurationsItem) {
    if (this.sweepConfigurations == null) {
      this.sweepConfigurations = new HashMap<>();
    }
    this.sweepConfigurations.put(key, sweepConfigurationsItem);
    return this;
  }

  /**
   * Contains key-value pairs that specify configurations for balance sweeps per currency code. A sweep pulls in or pushes out funds based on a defined schedule, amount, and a source (for pulling funds) or a destination (for pushing funds).  The key must be a three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**. The value must be an object containing the sweep configuration.
   * @return sweepConfigurations
  */
  @Valid 
  @Schema(name = "sweepConfigurations", description = "Contains key-value pairs that specify configurations for balance sweeps per currency code. A sweep pulls in or pushes out funds based on a defined schedule, amount, and a source (for pulling funds) or a destination (for pushing funds).  The key must be a three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**. The value must be an object containing the sweep configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sweepConfigurations")
  public Map<String, SweepConfiguration> getSweepConfigurations() {
    return sweepConfigurations;
  }

  public void setSweepConfigurations(Map<String, SweepConfiguration> sweepConfigurations) {
    this.sweepConfigurations = sweepConfigurations;
  }

  public BalanceAccount timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The [time zone](https://www.iana.org/time-zones) of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
   * @return timeZone
  */
  
  @Schema(name = "timeZone", description = "The [time zone](https://www.iana.org/time-zones) of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceAccount balanceAccount = (BalanceAccount) o;
    return Objects.equals(this.accountHolderId, balanceAccount.accountHolderId) &&
        Objects.equals(this.balances, balanceAccount.balances) &&
        Objects.equals(this.defaultCurrencyCode, balanceAccount.defaultCurrencyCode) &&
        Objects.equals(this.description, balanceAccount.description) &&
        Objects.equals(this.id, balanceAccount.id) &&
        Objects.equals(this.paymentInstruments, balanceAccount.paymentInstruments) &&
        Objects.equals(this.reference, balanceAccount.reference) &&
        Objects.equals(this.status, balanceAccount.status) &&
        Objects.equals(this.sweepConfigurations, balanceAccount.sweepConfigurations) &&
        Objects.equals(this.timeZone, balanceAccount.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderId, balances, defaultCurrencyCode, description, id, paymentInstruments, reference, status, sweepConfigurations, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccount {\n");
    sb.append("    accountHolderId: ").append(toIndentedString(accountHolderId)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sweepConfigurations: ").append(toIndentedString(sweepConfigurations)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

