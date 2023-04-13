package com.adyen.examples.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * USLocalAccountIdentification
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class USLocalAccountIdentification implements PaymentInstrumentBankAccount {

  private String accountNumber;

  /**
   * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
   */
  public enum AccountTypeEnum {
    CHECKING("checking"),
    
    SAVINGS("savings");

    private String value;

    AccountTypeEnum(String value) {
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
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AccountTypeEnum accountType = AccountTypeEnum.CHECKING;

  private String routingNumber;

  /**
   * **usLocal**
   */
  public enum TypeEnum {
    USLOCAL("usLocal");

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

  private TypeEnum type = TypeEnum.USLOCAL;

  /**
   * Default constructor
   * @deprecated Use {@link USLocalAccountIdentification#USLocalAccountIdentification(String, String, TypeEnum)}
   */
  @Deprecated
  public USLocalAccountIdentification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public USLocalAccountIdentification(String accountNumber, String routingNumber, TypeEnum type) {
    this.accountNumber = accountNumber;
    this.routingNumber = routingNumber;
    this.type = type;
  }

  public USLocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The bank account number, without separators or whitespace.
   * @return accountNumber
  */
  @NotNull @Size(min = 2, max = 18) 
  @Schema(name = "accountNumber", description = "The bank account number, without separators or whitespace.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public USLocalAccountIdentification accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.
   * @return accountType
  */
  
  @Schema(name = "accountType", description = "The bank account type.  Possible values: **checking** or **savings**. Defaults to **checking**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountType")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public USLocalAccountIdentification routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

  /**
   * The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace.
   * @return routingNumber
  */
  @NotNull @Size(min = 9, max = 9) 
  @Schema(name = "routingNumber", description = "The 9-digit [routing number](https://en.wikipedia.org/wiki/ABA_routing_transit_number), without separators or whitespace.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("routingNumber")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public USLocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **usLocal**
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "**usLocal**", requiredMode = Schema.RequiredMode.REQUIRED)
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
    USLocalAccountIdentification usLocalAccountIdentification = (USLocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, usLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.accountType, usLocalAccountIdentification.accountType) &&
        Objects.equals(this.routingNumber, usLocalAccountIdentification.routingNumber) &&
        Objects.equals(this.type, usLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountType, routingNumber, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class USLocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
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

