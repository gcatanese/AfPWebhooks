package com.adyen.examples.model.configuration;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * ContactDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class ContactDetails {

  private Address address;

  private String email;

  private Phone phone;

  private String webAddress;

  /**
   * Default constructor
   * @deprecated Use {@link ContactDetails#ContactDetails(Address, String, Phone)}
   */
  @Deprecated
  public ContactDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContactDetails(Address address, String email, Phone phone) {
    this.address = address;
    this.email = email;
    this.phone = phone;
  }

  public ContactDetails address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @NotNull @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ContactDetails email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the account holder.
   * @return email
  */
  @NotNull 
  @Schema(name = "email", description = "The email address of the account holder.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContactDetails phone(Phone phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @NotNull @Valid 
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phone")
  public Phone getPhone() {
    return phone;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }

  public ContactDetails webAddress(String webAddress) {
    this.webAddress = webAddress;
    return this;
  }

  /**
   * The URL of the account holder's website.
   * @return webAddress
  */
  
  @Schema(name = "webAddress", description = "The URL of the account holder's website.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ContactDetails contactDetails = (ContactDetails) o;
    return Objects.equals(this.address, contactDetails.address) &&
        Objects.equals(this.email, contactDetails.email) &&
        Objects.equals(this.phone, contactDetails.phone) &&
        Objects.equals(this.webAddress, contactDetails.webAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, phone, webAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDetails {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

