package com.adyen.examples.model.configuration;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * CardConfiguration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class CardConfiguration {

  private String activation;

  private String activationUrl;

  private BulkAddress bulkAddress;

  private String cardImageId;

  private String carrier;

  private String carrierImageId;

  private String configurationProfileId;

  private String currency;

  private String envelope;

  private String insert;

  private String language;

  private String logoImageId;

  private String pinMailer;

  private String shipmentMethod;

  /**
   * Default constructor
   * @deprecated Use {@link CardConfiguration#CardConfiguration(String)}
   */
  @Deprecated
  public CardConfiguration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CardConfiguration(String configurationProfileId) {
    this.configurationProfileId = configurationProfileId;
  }

  public CardConfiguration activation(String activation) {
    this.activation = activation;
    return this;
  }

  /**
   * Overrides the activation label design ID defined in the `configurationProfileId`. The activation label is attached to the card and contains the activation instructions.
   * @return activation
  */
  
  @Schema(name = "activation", description = "Overrides the activation label design ID defined in the `configurationProfileId`. The activation label is attached to the card and contains the activation instructions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activation")
  public String getActivation() {
    return activation;
  }

  public void setActivation(String activation) {
    this.activation = activation;
  }

  public CardConfiguration activationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  /**
   * Your app's URL, if you want to activate cards through your app. For example, **my-app://ref1236a7d**. A QR code is created based on this URL, and is included in the carrier. Before you use this field, reach out to your Adyen contact to set up the QR code process.   Maximum length: 255 characters.
   * @return activationUrl
  */
  @Size(max = 255) 
  @Schema(name = "activationUrl", description = "Your app's URL, if you want to activate cards through your app. For example, **my-app://ref1236a7d**. A QR code is created based on this URL, and is included in the carrier. Before you use this field, reach out to your Adyen contact to set up the QR code process.   Maximum length: 255 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activationUrl")
  public String getActivationUrl() {
    return activationUrl;
  }

  public void setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
  }

  public CardConfiguration bulkAddress(BulkAddress bulkAddress) {
    this.bulkAddress = bulkAddress;
    return this;
  }

  /**
   * Get bulkAddress
   * @return bulkAddress
  */
  @Valid 
  @Schema(name = "bulkAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bulkAddress")
  public BulkAddress getBulkAddress() {
    return bulkAddress;
  }

  public void setBulkAddress(BulkAddress bulkAddress) {
    this.bulkAddress = bulkAddress;
  }

  public CardConfiguration cardImageId(String cardImageId) {
    this.cardImageId = cardImageId;
    return this;
  }

  /**
   * The ID of the card image. This is the image that will be printed on the full front of the card.
   * @return cardImageId
  */
  
  @Schema(name = "cardImageId", description = "The ID of the card image. This is the image that will be printed on the full front of the card.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardImageId")
  public String getCardImageId() {
    return cardImageId;
  }

  public void setCardImageId(String cardImageId) {
    this.cardImageId = cardImageId;
  }

  public CardConfiguration carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Overrides the carrier design ID defined in the `configurationProfileId`. The carrier is the letter or packaging to which the card is attached.
   * @return carrier
  */
  
  @Schema(name = "carrier", description = "Overrides the carrier design ID defined in the `configurationProfileId`. The carrier is the letter or packaging to which the card is attached.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public CardConfiguration carrierImageId(String carrierImageId) {
    this.carrierImageId = carrierImageId;
    return this;
  }

  /**
   * The ID of the carrier image. This is the image that will printed on the letter to which the card is attached.
   * @return carrierImageId
  */
  
  @Schema(name = "carrierImageId", description = "The ID of the carrier image. This is the image that will printed on the letter to which the card is attached.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carrierImageId")
  public String getCarrierImageId() {
    return carrierImageId;
  }

  public void setCarrierImageId(String carrierImageId) {
    this.carrierImageId = carrierImageId;
  }

  public CardConfiguration configurationProfileId(String configurationProfileId) {
    this.configurationProfileId = configurationProfileId;
    return this;
  }

  /**
   * The ID of the card configuration profile that contains the settings of the card. For example, the envelope and PIN mailer designs or the logistics company handling the shipment. All the settings in the profile are applied to the card, unless you provide other fields to override them.  For example, send the `shipmentMethod` to override the logistics company defined in the card configuration profile.
   * @return configurationProfileId
  */
  @NotNull 
  @Schema(name = "configurationProfileId", description = "The ID of the card configuration profile that contains the settings of the card. For example, the envelope and PIN mailer designs or the logistics company handling the shipment. All the settings in the profile are applied to the card, unless you provide other fields to override them.  For example, send the `shipmentMethod` to override the logistics company defined in the card configuration profile.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("configurationProfileId")
  public String getConfigurationProfileId() {
    return configurationProfileId;
  }

  public void setConfigurationProfileId(String configurationProfileId) {
    this.configurationProfileId = configurationProfileId;
  }

  public CardConfiguration currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-letter [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the card. For example, **EUR**.
   * @return currency
  */
  
  @Schema(name = "currency", description = "The three-letter [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the card. For example, **EUR**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CardConfiguration envelope(String envelope) {
    this.envelope = envelope;
    return this;
  }

  /**
   * Overrides the envelope design ID defined in the `configurationProfileId`. 
   * @return envelope
  */
  
  @Schema(name = "envelope", description = "Overrides the envelope design ID defined in the `configurationProfileId`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("envelope")
  public String getEnvelope() {
    return envelope;
  }

  public void setEnvelope(String envelope) {
    this.envelope = envelope;
  }

  public CardConfiguration insert(String insert) {
    this.insert = insert;
    return this;
  }

  /**
   * Overrides the insert design ID defined in the `configurationProfileId`. An insert is any additional material, such as marketing materials, that are shipped together with the card.
   * @return insert
  */
  
  @Schema(name = "insert", description = "Overrides the insert design ID defined in the `configurationProfileId`. An insert is any additional material, such as marketing materials, that are shipped together with the card.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert")
  public String getInsert() {
    return insert;
  }

  public void setInsert(String insert) {
    this.insert = insert;
  }

  public CardConfiguration language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code of the card. For example, **en**.
   * @return language
  */
  
  @Schema(name = "language", description = "The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code of the card. For example, **en**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CardConfiguration logoImageId(String logoImageId) {
    this.logoImageId = logoImageId;
    return this;
  }

  /**
   * The ID of the logo image. This is the image that will be printed on the partial front of the card, such as a logo on the upper right corner.
   * @return logoImageId
  */
  
  @Schema(name = "logoImageId", description = "The ID of the logo image. This is the image that will be printed on the partial front of the card, such as a logo on the upper right corner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logoImageId")
  public String getLogoImageId() {
    return logoImageId;
  }

  public void setLogoImageId(String logoImageId) {
    this.logoImageId = logoImageId;
  }

  public CardConfiguration pinMailer(String pinMailer) {
    this.pinMailer = pinMailer;
    return this;
  }

  /**
   * Overrides the PIN mailer design ID defined in the `configurationProfileId`. The PIN mailer is the letter on which the PIN is printed.
   * @return pinMailer
  */
  
  @Schema(name = "pinMailer", description = "Overrides the PIN mailer design ID defined in the `configurationProfileId`. The PIN mailer is the letter on which the PIN is printed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pinMailer")
  public String getPinMailer() {
    return pinMailer;
  }

  public void setPinMailer(String pinMailer) {
    this.pinMailer = pinMailer;
  }

  public CardConfiguration shipmentMethod(String shipmentMethod) {
    this.shipmentMethod = shipmentMethod;
    return this;
  }

  /**
   * Overrides the logistics company defined in the `configurationProfileId`.
   * @return shipmentMethod
  */
  
  @Schema(name = "shipmentMethod", description = "Overrides the logistics company defined in the `configurationProfileId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipmentMethod")
  public String getShipmentMethod() {
    return shipmentMethod;
  }

  public void setShipmentMethod(String shipmentMethod) {
    this.shipmentMethod = shipmentMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardConfiguration cardConfiguration = (CardConfiguration) o;
    return Objects.equals(this.activation, cardConfiguration.activation) &&
        Objects.equals(this.activationUrl, cardConfiguration.activationUrl) &&
        Objects.equals(this.bulkAddress, cardConfiguration.bulkAddress) &&
        Objects.equals(this.cardImageId, cardConfiguration.cardImageId) &&
        Objects.equals(this.carrier, cardConfiguration.carrier) &&
        Objects.equals(this.carrierImageId, cardConfiguration.carrierImageId) &&
        Objects.equals(this.configurationProfileId, cardConfiguration.configurationProfileId) &&
        Objects.equals(this.currency, cardConfiguration.currency) &&
        Objects.equals(this.envelope, cardConfiguration.envelope) &&
        Objects.equals(this.insert, cardConfiguration.insert) &&
        Objects.equals(this.language, cardConfiguration.language) &&
        Objects.equals(this.logoImageId, cardConfiguration.logoImageId) &&
        Objects.equals(this.pinMailer, cardConfiguration.pinMailer) &&
        Objects.equals(this.shipmentMethod, cardConfiguration.shipmentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activation, activationUrl, bulkAddress, cardImageId, carrier, carrierImageId, configurationProfileId, currency, envelope, insert, language, logoImageId, pinMailer, shipmentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardConfiguration {\n");
    sb.append("    activation: ").append(toIndentedString(activation)).append("\n");
    sb.append("    activationUrl: ").append(toIndentedString(activationUrl)).append("\n");
    sb.append("    bulkAddress: ").append(toIndentedString(bulkAddress)).append("\n");
    sb.append("    cardImageId: ").append(toIndentedString(cardImageId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    carrierImageId: ").append(toIndentedString(carrierImageId)).append("\n");
    sb.append("    configurationProfileId: ").append(toIndentedString(configurationProfileId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    insert: ").append(toIndentedString(insert)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    logoImageId: ").append(toIndentedString(logoImageId)).append("\n");
    sb.append("    pinMailer: ").append(toIndentedString(pinMailer)).append("\n");
    sb.append("    shipmentMethod: ").append(toIndentedString(shipmentMethod)).append("\n");
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

