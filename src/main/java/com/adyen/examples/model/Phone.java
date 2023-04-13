package com.adyen.examples.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Phone
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class Phone {

  private String number;

  /**
   * Type of phone number. Possible values:  **Landline**, **Mobile**. 
   */
  public enum TypeEnum {
    LANDLINE("Landline"),
    
    MOBILE("Mobile");

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
   * @deprecated Use {@link Phone#Phone(String, TypeEnum)}
   */
  @Deprecated
  public Phone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Phone(String number, TypeEnum type) {
    this.number = number;
    this.type = type;
  }

  public Phone number(String number) {
    this.number = number;
    return this;
  }

  /**
   * The full phone number provided as a single string.  For example, **\"0031 6 11 22 33 44\"**, **\"+316/1122-3344\"**,    or **\"(0031) 611223344\"**.
   * @return number
  */
  @NotNull 
  @Schema(name = "number", description = "The full phone number provided as a single string.  For example, **\"0031 6 11 22 33 44\"**, **\"+316/1122-3344\"**,    or **\"(0031) 611223344\"**.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Phone type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of phone number. Possible values:  **Landline**, **Mobile**. 
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Type of phone number. Possible values:  **Landline**, **Mobile**. ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Phone phone = (Phone) o;
    return Objects.equals(this.number, phone.number) &&
        Objects.equals(this.type, phone.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

