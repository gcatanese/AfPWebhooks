package com.adyen.examples.model.configuration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * SweepCounterparty
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class SweepCounterparty {

  private String balanceAccountId;

  private String merchantAccount;

  private String transferInstrumentId;

  public SweepCounterparty balanceAccountId(String balanceAccountId) {
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

  public SweepCounterparty merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account that will be the source of funds, if you are processing payments with Adyen. You can only use this with sweeps of `type` **pull** and `schedule.type` **balance**.
   * @return merchantAccount
  */
  
  @Schema(name = "merchantAccount", description = "The merchant account that will be the source of funds, if you are processing payments with Adyen. You can only use this with sweeps of `type` **pull** and `schedule.type` **balance**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchantAccount")
  public String getMerchantAccount() {
    return merchantAccount;
  }

  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  public SweepCounterparty transferInstrumentId(String transferInstrumentId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepCounterparty sweepCounterparty = (SweepCounterparty) o;
    return Objects.equals(this.balanceAccountId, sweepCounterparty.balanceAccountId) &&
        Objects.equals(this.merchantAccount, sweepCounterparty.merchantAccount) &&
        Objects.equals(this.transferInstrumentId, sweepCounterparty.transferInstrumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, merchantAccount, transferInstrumentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepCounterparty {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    transferInstrumentId: ").append(toIndentedString(transferInstrumentId)).append("\n");
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

