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
 * SweepConfigurationNotificationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class SweepConfigurationNotificationRequest {

  private SweepConfigurationNotificationData data;

  private String environment;

  /**
   * Type of notification.
   */
  public enum TypeEnum {
    CREATED("balancePlatform.balanceAccountSweep.created"),
    
    UPDATED("balancePlatform.balanceAccountSweep.updated"),
    
    DELETED("balancePlatform.balanceAccountSweep.deleted");

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
   * @deprecated Use {@link SweepConfigurationNotificationRequest#SweepConfigurationNotificationRequest(SweepConfigurationNotificationData, String, TypeEnum)}
   */
  @Deprecated
  public SweepConfigurationNotificationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SweepConfigurationNotificationRequest(SweepConfigurationNotificationData data, String environment, TypeEnum type) {
    this.data = data;
    this.environment = environment;
    this.type = type;
  }

  public SweepConfigurationNotificationRequest data(SweepConfigurationNotificationData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public SweepConfigurationNotificationData getData() {
    return data;
  }

  public void setData(SweepConfigurationNotificationData data) {
    this.data = data;
  }

  public SweepConfigurationNotificationRequest environment(String environment) {
    this.environment = environment;
    return this;
  }

  /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   * @return environment
  */
  @NotNull 
  @Schema(name = "environment", description = "The environment from which the webhook originated.  Possible values: **test**, **live**.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public SweepConfigurationNotificationRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of notification.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Type of notification.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SweepConfigurationNotificationRequest sweepConfigurationNotificationRequest = (SweepConfigurationNotificationRequest) o;
    return Objects.equals(this.data, sweepConfigurationNotificationRequest.data) &&
        Objects.equals(this.environment, sweepConfigurationNotificationRequest.environment) &&
        Objects.equals(this.type, sweepConfigurationNotificationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, environment, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepConfigurationNotificationRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

