package com.adyen.examples.model.configuration;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Contact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class Contact {

  private Address address;

  private String email;

  private String fullPhoneNumber;

  private Name name;

  private PersonalData personalData;

  private PhoneNumber phoneNumber;

  private String webAddress;

  public Contact address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Contact email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The e-mail address of the contact.
   * @return email
  */
  
  @Schema(name = "email", description = "The e-mail address of the contact.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Contact fullPhoneNumber(String fullPhoneNumber) {
    this.fullPhoneNumber = fullPhoneNumber;
    return this;
  }

  /**
   * The phone number of the contact provided as a single string.  It will be handled as a landline phone. **Examples:** \"0031 6 11 22 33 44\", \"+316/1122-3344\", \"(0031) 611223344\"
   * @return fullPhoneNumber
  */
  
  @Schema(name = "fullPhoneNumber", description = "The phone number of the contact provided as a single string.  It will be handled as a landline phone. **Examples:** \"0031 6 11 22 33 44\", \"+316/1122-3344\", \"(0031) 611223344\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullPhoneNumber")
  public String getFullPhoneNumber() {
    return fullPhoneNumber;
  }

  public void setFullPhoneNumber(String fullPhoneNumber) {
    this.fullPhoneNumber = fullPhoneNumber;
  }

  public Contact name(Name name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Contact personalData(PersonalData personalData) {
    this.personalData = personalData;
    return this;
  }

  /**
   * Get personalData
   * @return personalData
  */
  @Valid 
  @Schema(name = "personalData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personalData")
  public PersonalData getPersonalData() {
    return personalData;
  }

  public void setPersonalData(PersonalData personalData) {
    this.personalData = personalData;
  }

  public Contact phoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @Valid 
  @Schema(name = "phoneNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phoneNumber")
  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Contact webAddress(String webAddress) {
    this.webAddress = webAddress;
    return this;
  }

  /**
   * The URL of the website of the contact.
   * @return webAddress
  */
  
  @Schema(name = "webAddress", description = "The URL of the website of the contact.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webAddress")
  public String getWebAddress() {
    return webAddress;
  }

  public void setWebAddress(String webAddress) {
    this.webAddress = webAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.address, contact.address) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.fullPhoneNumber, contact.fullPhoneNumber) &&
        Objects.equals(this.name, contact.name) &&
        Objects.equals(this.personalData, contact.personalData) &&
        Objects.equals(this.phoneNumber, contact.phoneNumber) &&
        Objects.equals(this.webAddress, contact.webAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, fullPhoneNumber, name, personalData, phoneNumber, webAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullPhoneNumber: ").append(toIndentedString(fullPhoneNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    personalData: ").append(toIndentedString(personalData)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    webAddress: ").append(toIndentedString(webAddress)).append("\n");
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

