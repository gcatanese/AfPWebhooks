package com.adyen.examples.model.configuration;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * SweepConfigurationV2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class SweepConfigurationV2 {

  private SweepCounterparty counterparty;

  private String currency;

  private String description;

  private String id;

  /**
   * The reason for disabling the sweep.
   */
  public enum ReasonEnum {
    AMOUNTLIMITEXCEEDED("amountLimitExceeded"),
    
    APPROVED("approved"),
    
    COUNTERPARTYACCOUNTBLOCKED("counterpartyAccountBlocked"),
    
    COUNTERPARTYACCOUNTCLOSED("counterpartyAccountClosed"),
    
    COUNTERPARTYACCOUNTNOTFOUND("counterpartyAccountNotFound"),
    
    COUNTERPARTYADDRESSREQUIRED("counterpartyAddressRequired"),
    
    COUNTERPARTYBANKTIMEDOUT("counterpartyBankTimedOut"),
    
    COUNTERPARTYBANKUNAVAILABLE("counterpartyBankUnavailable"),
    
    ERROR("error"),
    
    NOTENOUGHBALANCE("notEnoughBalance"),
    
    REFUSEDBYCOUNTERPARTYBANK("refusedByCounterpartyBank"),
    
    ROUTENOTFOUND("routeNotFound"),
    
    UNKNOWN("unknown");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReasonEnum reason;

  private SweepConfigurationSchedule schedule;

  /**
   * The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

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

  private Amount sweepAmount;

  private Amount targetAmount;

  private Amount triggerAmount;

  /**
   * The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
   */
  public enum TypeEnum {
    PULL("pull"),
    
    PUSH("push");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type = TypeEnum.PUSH;

  /**
   * Default constructor
   * @deprecated Use {@link SweepConfigurationV2#SweepConfigurationV2(SweepCounterparty, String, String, SweepConfigurationSchedule)}
   */
  @Deprecated
  public SweepConfigurationV2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SweepConfigurationV2(SweepCounterparty counterparty, String currency, String id, SweepConfigurationSchedule schedule) {
    this.counterparty = counterparty;
    this.currency = currency;
    this.id = id;
    this.schedule = schedule;
  }

  public SweepConfigurationV2 counterparty(SweepCounterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

  /**
   * Get counterparty
   * @return counterparty
  */
  @NotNull @Valid 
  @Schema(name = "counterparty", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("counterparty")
  public SweepCounterparty getCounterparty() {
    return counterparty;
  }

  public void setCounterparty(SweepCounterparty counterparty) {
    this.counterparty = counterparty;
  }

  public SweepConfigurationV2 currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances).
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", description = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SweepConfigurationV2 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The message that will be used in the sweep transfer's description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters.
   * @return description
  */
  
  @Schema(name = "description", description = "The message that will be used in the sweep transfer's description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SweepConfigurationV2 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the sweep.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The unique identifier of the sweep.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SweepConfigurationV2 reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for disabling the sweep.
   * @return reason
  */
  
  @Schema(name = "reason", description = "The reason for disabling the sweep.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public SweepConfigurationV2 schedule(SweepConfigurationSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @NotNull @Valid 
  @Schema(name = "schedule", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schedule")
  public SweepConfigurationSchedule getSchedule() {
    return schedule;
  }

  public void setSchedule(SweepConfigurationSchedule schedule) {
    this.schedule = schedule;
  }

  public SweepConfigurationV2 status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public SweepConfigurationV2 sweepAmount(Amount sweepAmount) {
    this.sweepAmount = sweepAmount;
    return this;
  }

  /**
   * Get sweepAmount
   * @return sweepAmount
  */
  @Valid 
  @Schema(name = "sweepAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sweepAmount")
  public Amount getSweepAmount() {
    return sweepAmount;
  }

  public void setSweepAmount(Amount sweepAmount) {
    this.sweepAmount = sweepAmount;
  }

  public SweepConfigurationV2 targetAmount(Amount targetAmount) {
    this.targetAmount = targetAmount;
    return this;
  }

  /**
   * Get targetAmount
   * @return targetAmount
  */
  @Valid 
  @Schema(name = "targetAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetAmount")
  public Amount getTargetAmount() {
    return targetAmount;
  }

  public void setTargetAmount(Amount targetAmount) {
    this.targetAmount = targetAmount;
  }

  public SweepConfigurationV2 triggerAmount(Amount triggerAmount) {
    this.triggerAmount = triggerAmount;
    return this;
  }

  /**
   * Get triggerAmount
   * @return triggerAmount
  */
  @Valid 
  @Schema(name = "triggerAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggerAmount")
  public Amount getTriggerAmount() {
    return triggerAmount;
  }

  public void setTriggerAmount(Amount triggerAmount) {
    this.triggerAmount = triggerAmount;
  }

  public SweepConfigurationV2 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
   * @return type
  */
  
  @Schema(name = "type", description = "The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepConfigurationV2 sweepConfigurationV2 = (SweepConfigurationV2) o;
    return Objects.equals(this.counterparty, sweepConfigurationV2.counterparty) &&
        Objects.equals(this.currency, sweepConfigurationV2.currency) &&
        Objects.equals(this.description, sweepConfigurationV2.description) &&
        Objects.equals(this.id, sweepConfigurationV2.id) &&
        Objects.equals(this.reason, sweepConfigurationV2.reason) &&
        Objects.equals(this.schedule, sweepConfigurationV2.schedule) &&
        Objects.equals(this.status, sweepConfigurationV2.status) &&
        Objects.equals(this.sweepAmount, sweepConfigurationV2.sweepAmount) &&
        Objects.equals(this.targetAmount, sweepConfigurationV2.targetAmount) &&
        Objects.equals(this.triggerAmount, sweepConfigurationV2.triggerAmount) &&
        Objects.equals(this.type, sweepConfigurationV2.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterparty, currency, description, id, reason, schedule, status, sweepAmount, targetAmount, triggerAmount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepConfigurationV2 {\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sweepAmount: ").append(toIndentedString(sweepAmount)).append("\n");
    sb.append("    targetAmount: ").append(toIndentedString(targetAmount)).append("\n");
    sb.append("    triggerAmount: ").append(toIndentedString(triggerAmount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

