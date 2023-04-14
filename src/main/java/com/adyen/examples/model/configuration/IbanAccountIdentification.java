package com.adyen.examples.model.configuration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * IbanAccountIdentification
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class IbanAccountIdentification implements PaymentInstrumentBankAccount {

  private String iban;

  /**
   * **iban**
   */
  public enum TypeEnum {
    IBAN("iban");

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

  private TypeEnum type = TypeEnum.IBAN;

  /**
   * Default constructor
   * @deprecated Use {@link IbanAccountIdentification#IbanAccountIdentification(String, TypeEnum)}
   */
  @Deprecated
  public IbanAccountIdentification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IbanAccountIdentification(String iban, TypeEnum type) {
    this.iban = iban;
    this.type = type;
  }

  public IbanAccountIdentification iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard.
   * @return iban
  */
  @NotNull 
  @Schema(name = "iban", description = "The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iban")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public IbanAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **iban**
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "**iban**", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IbanAccountIdentification ibanAccountIdentification = (IbanAccountIdentification) o;
    return Objects.equals(this.iban, ibanAccountIdentification.iban) &&
        Objects.equals(this.type, ibanAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbanAccountIdentification {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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

