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
 * PaymentInstrument
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class PaymentInstrument {

  private String balanceAccountId;

  private PaymentInstrumentBankAccount bankAccount;

  private Card card;

  private String description;

  private String id;

  private String issuingCountryCode;

  private String paymentInstrumentGroupId;

  private String reference;

  /**
   * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **Active** by default. However, there can be exceptions for cards based on the `card.formFactor` and the `issuingCountryCode`. For example, when issuing physical cards in the US, the default status is **Requested**.  Possible values:    * **Active**:  The payment instrument is active and can be used to make payments.    * **Requested**: The payment instrument has been requested. This state is applicable for physical cards.   * **Inactive**: The payment instrument is inactive and cannot be used to make payments.    * **Suspended**: The payment instrument is temporarily suspended and cannot be used to make payments.    * **Closed**: The payment instrument is permanently closed. This action cannot be undone.   * **Stolen**    * **Lost**   
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    LOST("Lost"),
    
    REQUESTED("Requested"),
    
    STOLEN("Stolen"),
    
    SUSPENDED("Suspended"),
    
    BLOCKED("blocked"),
    
    DISCARDED("discarded");

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

  /**
   * Type of payment instrument.  Possible value: **card**, **bankAccount**. 
   */
  public enum TypeEnum {
    BANKACCOUNT("bankAccount"),
    
    CARD("card");

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

  private TypeEnum type;

  /**
   * Default constructor
   * @deprecated Use {@link PaymentInstrument#PaymentInstrument(String, String, String, TypeEnum)}
   */
  @Deprecated
  public PaymentInstrument() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentInstrument(String balanceAccountId, String id, String issuingCountryCode, TypeEnum type) {
    this.balanceAccountId = balanceAccountId;
    this.id = id;
    this.issuingCountryCode = issuingCountryCode;
    this.type = type;
  }

  public PaymentInstrument balanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
    return this;
  }

  /**
   * The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument.
   * @return balanceAccountId
  */
  @NotNull 
  @Schema(name = "balanceAccountId", description = "The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("balanceAccountId")
  public String getBalanceAccountId() {
    return balanceAccountId;
  }

  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }

  public PaymentInstrument bankAccount(PaymentInstrumentBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

  /**
   * Get bankAccount
   * @return bankAccount
  */
  @Valid 
  @Schema(name = "bankAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bankAccount")
  public PaymentInstrumentBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(PaymentInstrumentBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public PaymentInstrument card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  */
  @Valid 
  @Schema(name = "card", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("card")
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public PaymentInstrument description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Your description for the payment instrument, maximum 300 characters.
   * @return description
  */
  @Size(max = 300) 
  @Schema(name = "description", description = "Your description for the payment instrument, maximum 300 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentInstrument id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the payment instrument.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The unique identifier of the payment instrument.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentInstrument issuingCountryCode(String issuingCountryCode) {
    this.issuingCountryCode = issuingCountryCode;
    return this;
  }

  /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**.
   * @return issuingCountryCode
  */
  @NotNull 
  @Schema(name = "issuingCountryCode", description = "The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issuingCountryCode")
  public String getIssuingCountryCode() {
    return issuingCountryCode;
  }

  public void setIssuingCountryCode(String issuingCountryCode) {
    this.issuingCountryCode = issuingCountryCode;
  }

  public PaymentInstrument paymentInstrumentGroupId(String paymentInstrumentGroupId) {
    this.paymentInstrumentGroupId = paymentInstrumentGroupId;
    return this;
  }

  /**
   * The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs.
   * @return paymentInstrumentGroupId
  */
  
  @Schema(name = "paymentInstrumentGroupId", description = "The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentInstrumentGroupId")
  public String getPaymentInstrumentGroupId() {
    return paymentInstrumentGroupId;
  }

  public void setPaymentInstrumentGroupId(String paymentInstrumentGroupId) {
    this.paymentInstrumentGroupId = paymentInstrumentGroupId;
  }

  public PaymentInstrument reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the payment instrument, maximum 150 characters.
   * @return reference
  */
  @Size(max = 150) 
  @Schema(name = "reference", description = "Your reference for the payment instrument, maximum 150 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public PaymentInstrument status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **Active** by default. However, there can be exceptions for cards based on the `card.formFactor` and the `issuingCountryCode`. For example, when issuing physical cards in the US, the default status is **Requested**.  Possible values:    * **Active**:  The payment instrument is active and can be used to make payments.    * **Requested**: The payment instrument has been requested. This state is applicable for physical cards.   * **Inactive**: The payment instrument is inactive and cannot be used to make payments.    * **Suspended**: The payment instrument is temporarily suspended and cannot be used to make payments.    * **Closed**: The payment instrument is permanently closed. This action cannot be undone.   * **Stolen**    * **Lost**   
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **Active** by default. However, there can be exceptions for cards based on the `card.formFactor` and the `issuingCountryCode`. For example, when issuing physical cards in the US, the default status is **Requested**.  Possible values:    * **Active**:  The payment instrument is active and can be used to make payments.    * **Requested**: The payment instrument has been requested. This state is applicable for physical cards.   * **Inactive**: The payment instrument is inactive and cannot be used to make payments.    * **Suspended**: The payment instrument is temporarily suspended and cannot be used to make payments.    * **Closed**: The payment instrument is permanently closed. This action cannot be undone.   * **Stolen**    * **Lost**   ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PaymentInstrument type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of payment instrument.  Possible value: **card**, **bankAccount**. 
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Type of payment instrument.  Possible value: **card**, **bankAccount**. ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    PaymentInstrument paymentInstrument = (PaymentInstrument) o;
    return Objects.equals(this.balanceAccountId, paymentInstrument.balanceAccountId) &&
        Objects.equals(this.bankAccount, paymentInstrument.bankAccount) &&
        Objects.equals(this.card, paymentInstrument.card) &&
        Objects.equals(this.description, paymentInstrument.description) &&
        Objects.equals(this.id, paymentInstrument.id) &&
        Objects.equals(this.issuingCountryCode, paymentInstrument.issuingCountryCode) &&
        Objects.equals(this.paymentInstrumentGroupId, paymentInstrument.paymentInstrumentGroupId) &&
        Objects.equals(this.reference, paymentInstrument.reference) &&
        Objects.equals(this.status, paymentInstrument.status) &&
        Objects.equals(this.type, paymentInstrument.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, bankAccount, card, description, id, issuingCountryCode, paymentInstrumentGroupId, reference, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrument {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuingCountryCode: ").append(toIndentedString(issuingCountryCode)).append("\n");
    sb.append("    paymentInstrumentGroupId: ").append(toIndentedString(paymentInstrumentGroupId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

