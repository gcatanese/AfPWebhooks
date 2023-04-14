package com.adyen.examples.model.configuration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * PhoneNumber
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class PhoneNumber {

  private String phoneCountryCode;

  private String phoneNumber;

  /**
   * The type of the phone number. Possible values: **Landline**, **Mobile**, **SIP**, **Fax**.
   */
  public enum PhoneTypeEnum {
    FAX("Fax"),
    
    LANDLINE("Landline"),
    
    MOBILE("Mobile"),
    
    SIP("SIP");

    private String value;

    PhoneTypeEnum(String value) {
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
    public static PhoneTypeEnum fromValue(String value) {
      for (PhoneTypeEnum b : PhoneTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PhoneTypeEnum phoneType;

  public PhoneNumber phoneCountryCode(String phoneCountryCode) {
    this.phoneCountryCode = phoneCountryCode;
    return this;
  }

  /**
   * The two-character ISO-3166-1 alpha-2 country code of the phone number. For example, **US** or **NL**.
   * @return phoneCountryCode
  */
  
  @Schema(name = "phoneCountryCode", description = "The two-character ISO-3166-1 alpha-2 country code of the phone number. For example, **US** or **NL**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phoneCountryCode")
  public String getPhoneCountryCode() {
    return phoneCountryCode;
  }

  public void setPhoneCountryCode(String phoneCountryCode) {
    this.phoneCountryCode = phoneCountryCode;
  }

  public PhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The phone number. The inclusion of the phone number country code is not necessary.
   * @return phoneNumber
  */
  
  @Schema(name = "phoneNumber", description = "The phone number. The inclusion of the phone number country code is not necessary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PhoneNumber phoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
    return this;
  }

  /**
   * The type of the phone number. Possible values: **Landline**, **Mobile**, **SIP**, **Fax**.
   * @return phoneType
  */
  
  @Schema(name = "phoneType", description = "The type of the phone number. Possible values: **Landline**, **Mobile**, **SIP**, **Fax**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phoneType")
  public PhoneTypeEnum getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(PhoneTypeEnum phoneType) {
    this.phoneType = phoneType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(this.phoneCountryCode, phoneNumber.phoneCountryCode) &&
        Objects.equals(this.phoneNumber, phoneNumber.phoneNumber) &&
        Objects.equals(this.phoneType, phoneNumber.phoneType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneCountryCode, phoneNumber, phoneType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    sb.append("    phoneCountryCode: ").append(toIndentedString(phoneCountryCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
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

