package com.adyen.examples.model.configuration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * BulkAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class BulkAddress {

  private String city;

  private String company;

  private String country;

  private String email;

  private String houseNumberOrName;

  private String mobile;

  private String postalCode;

  private String stateOrProvince;

  private String street;

  /**
   * Default constructor
   * @deprecated Use {@link BulkAddress#BulkAddress(String)}
   */
  @Deprecated
  public BulkAddress() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkAddress(String country) {
    this.country = country;
  }

  public BulkAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The name of the city.
   * @return city
  */
  
  @Schema(name = "city", description = "The name of the city.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public BulkAddress company(String company) {
    this.company = company;
    return this;
  }

  /**
   * The name of the company.
   * @return company
  */
  
  @Schema(name = "company", description = "The name of the company.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public BulkAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The two-character ISO-3166-1 alpha-2 country code. For example, **US**.
   * @return country
  */
  @NotNull 
  @Schema(name = "country", description = "The two-character ISO-3166-1 alpha-2 country code. For example, **US**.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public BulkAddress email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address.
   * @return email
  */
  
  @Schema(name = "email", description = "The email address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BulkAddress houseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
    return this;
  }

  /**
   * The house number or name.
   * @return houseNumberOrName
  */
  
  @Schema(name = "houseNumberOrName", description = "The house number or name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("houseNumberOrName")
  public String getHouseNumberOrName() {
    return houseNumberOrName;
  }

  public void setHouseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
  }

  public BulkAddress mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * The full telephone number.
   * @return mobile
  */
  
  @Schema(name = "mobile", description = "The full telephone number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobile")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public BulkAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The postal code.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.
   * @return postalCode
  */
  
  @Schema(name = "postalCode", description = "The postal code.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public BulkAddress stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * The two-letter ISO 3166-2 state or province code.  Maximum length: 2 characters for addresses in the US.
   * @return stateOrProvince
  */
  
  @Schema(name = "stateOrProvince", description = "The two-letter ISO 3166-2 state or province code.  Maximum length: 2 characters for addresses in the US.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateOrProvince")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public BulkAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * The streetname of the house.
   * @return street
  */
  
  @Schema(name = "street", description = "The streetname of the house.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkAddress bulkAddress = (BulkAddress) o;
    return Objects.equals(this.city, bulkAddress.city) &&
        Objects.equals(this.company, bulkAddress.company) &&
        Objects.equals(this.country, bulkAddress.country) &&
        Objects.equals(this.email, bulkAddress.email) &&
        Objects.equals(this.houseNumberOrName, bulkAddress.houseNumberOrName) &&
        Objects.equals(this.mobile, bulkAddress.mobile) &&
        Objects.equals(this.postalCode, bulkAddress.postalCode) &&
        Objects.equals(this.stateOrProvince, bulkAddress.stateOrProvince) &&
        Objects.equals(this.street, bulkAddress.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, company, country, email, houseNumberOrName, mobile, postalCode, stateOrProvince, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    houseNumberOrName: ").append(toIndentedString(houseNumberOrName)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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

