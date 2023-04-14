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
 * Card
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class Card {

  private Authentication authentication;

  private String bin;

  private String brand;

  private String brandVariant;

  private String cardholderName;

  private CardConfiguration _configuration;

  private String cvc;

  private Contact deliveryContact;

  private Expiry expiration;

  /**
   * The form factor of the card. Possible values: **virtual**, **physical**.
   */
  public enum FormFactorEnum {
    PHYSICAL("physical"),
    
    UNKNOWN("unknown"),
    
    VIRTUAL("virtual");

    private String value;

    FormFactorEnum(String value) {
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
    public static FormFactorEnum fromValue(String value) {
      for (FormFactorEnum b : FormFactorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FormFactorEnum formFactor;

  private String lastFour;

  private String number;

  /**
   * Default constructor
   * @deprecated Use {@link Card#Card(String, String, String, FormFactorEnum, String)}
   */
  @Deprecated
  public Card() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Card(String brand, String brandVariant, String cardholderName, FormFactorEnum formFactor, String number) {
    this.brand = brand;
    this.brandVariant = brandVariant;
    this.cardholderName = cardholderName;
    this.formFactor = formFactor;
    this.number = number;
  }

  public Card authentication(Authentication authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * Get authentication
   * @return authentication
  */
  @Valid 
  @Schema(name = "authentication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authentication")
  public Authentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(Authentication authentication) {
    this.authentication = authentication;
  }

  public Card bin(String bin) {
    this.bin = bin;
    return this;
  }

  /**
   * The bank identification number (BIN) of the card number.
   * @return bin
  */
  
  @Schema(name = "bin", description = "The bank identification number (BIN) of the card number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bin")
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }

  public Card brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * The brand of the physical or the virtual card. Possible values: **visa**, **mc**.
   * @return brand
  */
  @NotNull 
  @Schema(name = "brand", description = "The brand of the physical or the virtual card. Possible values: **visa**, **mc**.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Card brandVariant(String brandVariant) {
    this.brandVariant = brandVariant;
    return this;
  }

  /**
   * The brand variant of the physical or the virtual card. >Contact your Adyen Implementation Manager to get the values that are relevant to your integration. Examples: **visadebit**, **mcprepaid**.
   * @return brandVariant
  */
  @NotNull 
  @Schema(name = "brandVariant", description = "The brand variant of the physical or the virtual card. >Contact your Adyen Implementation Manager to get the values that are relevant to your integration. Examples: **visadebit**, **mcprepaid**.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("brandVariant")
  public String getBrandVariant() {
    return brandVariant;
  }

  public void setBrandVariant(String brandVariant) {
    this.brandVariant = brandVariant;
  }

  public Card cardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
    return this;
  }

  /**
   * The name of the cardholder.  Maximum length: 26 characters.
   * @return cardholderName
  */
  @NotNull @Size(max = 26) 
  @Schema(name = "cardholderName", description = "The name of the cardholder.  Maximum length: 26 characters.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cardholderName")
  public String getCardholderName() {
    return cardholderName;
  }

  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }

  public Card _configuration(CardConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
  */
  @Valid 
  @Schema(name = "configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public CardConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(CardConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public Card cvc(String cvc) {
    this.cvc = cvc;
    return this;
  }

  /**
   * The CVC2 value of the card. > The CVC2 is not sent by default. This is only returned in the `POST` response for single-use virtual cards.
   * @return cvc
  */
  
  @Schema(name = "cvc", description = "The CVC2 value of the card. > The CVC2 is not sent by default. This is only returned in the `POST` response for single-use virtual cards.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cvc")
  public String getCvc() {
    return cvc;
  }

  public void setCvc(String cvc) {
    this.cvc = cvc;
  }

  public Card deliveryContact(Contact deliveryContact) {
    this.deliveryContact = deliveryContact;
    return this;
  }

  /**
   * Get deliveryContact
   * @return deliveryContact
  */
  @Valid 
  @Schema(name = "deliveryContact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryContact")
  public Contact getDeliveryContact() {
    return deliveryContact;
  }

  public void setDeliveryContact(Contact deliveryContact) {
    this.deliveryContact = deliveryContact;
  }

  public Card expiration(Expiry expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * Get expiration
   * @return expiration
  */
  @Valid 
  @Schema(name = "expiration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiration")
  public Expiry getExpiration() {
    return expiration;
  }

  public void setExpiration(Expiry expiration) {
    this.expiration = expiration;
  }

  public Card formFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
    return this;
  }

  /**
   * The form factor of the card. Possible values: **virtual**, **physical**.
   * @return formFactor
  */
  @NotNull 
  @Schema(name = "formFactor", description = "The form factor of the card. Possible values: **virtual**, **physical**.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("formFactor")
  public FormFactorEnum getFormFactor() {
    return formFactor;
  }

  public void setFormFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
  }

  public Card lastFour(String lastFour) {
    this.lastFour = lastFour;
    return this;
  }

  /**
   * Last last four digits of the card number.
   * @return lastFour
  */
  
  @Schema(name = "lastFour", description = "Last last four digits of the card number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastFour")
  public String getLastFour() {
    return lastFour;
  }

  public void setLastFour(String lastFour) {
    this.lastFour = lastFour;
  }

  public Card number(String number) {
    this.number = number;
    return this;
  }

  /**
   * The primary account number (PAN) of the card. > The PAN is masked by default and returned only for single-use virtual cards.
   * @return number
  */
  @NotNull 
  @Schema(name = "number", description = "The primary account number (PAN) of the card. > The PAN is masked by default and returned only for single-use virtual cards.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.authentication, card.authentication) &&
        Objects.equals(this.bin, card.bin) &&
        Objects.equals(this.brand, card.brand) &&
        Objects.equals(this.brandVariant, card.brandVariant) &&
        Objects.equals(this.cardholderName, card.cardholderName) &&
        Objects.equals(this._configuration, card._configuration) &&
        Objects.equals(this.cvc, card.cvc) &&
        Objects.equals(this.deliveryContact, card.deliveryContact) &&
        Objects.equals(this.expiration, card.expiration) &&
        Objects.equals(this.formFactor, card.formFactor) &&
        Objects.equals(this.lastFour, card.lastFour) &&
        Objects.equals(this.number, card.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, bin, brand, brandVariant, cardholderName, _configuration, cvc, deliveryContact, expiration, formFactor, lastFour, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    brandVariant: ").append(toIndentedString(brandVariant)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    deliveryContact: ").append(toIndentedString(deliveryContact)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

