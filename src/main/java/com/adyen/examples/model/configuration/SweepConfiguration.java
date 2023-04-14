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
 * SweepConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class SweepConfiguration {

  private String balanceAccountId;

  private String id;

  private String merchantAccount;

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

  private String transferInstrumentId;

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
   * @deprecated Use {@link SweepConfiguration#SweepConfiguration(String, SweepConfigurationSchedule)}
   */
  @Deprecated
  public SweepConfiguration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SweepConfiguration(String id, SweepConfigurationSchedule schedule) {
    this.id = id;
    this.schedule = schedule;
  }

  public SweepConfiguration balanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
    return this;
  }

  /**
   * The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as `schedule.type` **daily** or **monthly**.
   * @return balanceAccountId
  */
  
  @Schema(name = "balanceAccountId", description = "The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as `schedule.type` **daily** or **monthly**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balanceAccountId")
  public String getBalanceAccountId() {
    return balanceAccountId;
  }

  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }

  public SweepConfiguration id(String id) {
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

  public SweepConfiguration merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account that will be the source of funds. You can only use this if you are processing payments with Adyen. This can only be used for sweeps of `type` **pull** and `schedule.type` **balance**.
   * @return merchantAccount
  */
  
  @Schema(name = "merchantAccount", description = "The merchant account that will be the source of funds. You can only use this if you are processing payments with Adyen. This can only be used for sweeps of `type` **pull** and `schedule.type` **balance**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchantAccount")
  public String getMerchantAccount() {
    return merchantAccount;
  }

  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  public SweepConfiguration schedule(SweepConfigurationSchedule schedule) {
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

  public SweepConfiguration status(StatusEnum status) {
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

  public SweepConfiguration sweepAmount(Amount sweepAmount) {
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

  public SweepConfiguration targetAmount(Amount targetAmount) {
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

  public SweepConfiguration transferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
    return this;
  }

  /**
   * The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/transferInstruments__resParam_id).  You can also use this in combination with a `merchantAccount` and a `type` **pull** to start a direct debit request from the source transfer instrument. To use this feature, reach out to your Adyen contact.
   * @return transferInstrumentId
  */
  
  @Schema(name = "transferInstrumentId", description = "The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/transferInstruments__resParam_id).  You can also use this in combination with a `merchantAccount` and a `type` **pull** to start a direct debit request from the source transfer instrument. To use this feature, reach out to your Adyen contact.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transferInstrumentId")
  public String getTransferInstrumentId() {
    return transferInstrumentId;
  }

  public void setTransferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
  }

  public SweepConfiguration triggerAmount(Amount triggerAmount) {
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

  public SweepConfiguration type(TypeEnum type) {
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
    SweepConfiguration sweepConfiguration = (SweepConfiguration) o;
    return Objects.equals(this.balanceAccountId, sweepConfiguration.balanceAccountId) &&
        Objects.equals(this.id, sweepConfiguration.id) &&
        Objects.equals(this.merchantAccount, sweepConfiguration.merchantAccount) &&
        Objects.equals(this.schedule, sweepConfiguration.schedule) &&
        Objects.equals(this.status, sweepConfiguration.status) &&
        Objects.equals(this.sweepAmount, sweepConfiguration.sweepAmount) &&
        Objects.equals(this.targetAmount, sweepConfiguration.targetAmount) &&
        Objects.equals(this.transferInstrumentId, sweepConfiguration.transferInstrumentId) &&
        Objects.equals(this.triggerAmount, sweepConfiguration.triggerAmount) &&
        Objects.equals(this.type, sweepConfiguration.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, id, merchantAccount, schedule, status, sweepAmount, targetAmount, transferInstrumentId, triggerAmount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepConfiguration {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sweepAmount: ").append(toIndentedString(sweepAmount)).append("\n");
    sb.append("    targetAmount: ").append(toIndentedString(targetAmount)).append("\n");
    sb.append("    transferInstrumentId: ").append(toIndentedString(transferInstrumentId)).append("\n");
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

