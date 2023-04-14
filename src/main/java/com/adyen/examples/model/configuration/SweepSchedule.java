package com.adyen.examples.model.configuration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * SweepSchedule
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class SweepSchedule implements SweepConfigurationSchedule {

  /**
   * The schedule type.  Possible values:  * **cron**: push out funds based on a cron expression.  * **daily**: push out funds daily at 07:00 AM CET.  * **weekly**: push out funds every Monday at 07:00 AM CET.  * **monthly**: push out funds every first of the month at 07:00 AM CET.  * **balance**: pull in funds instantly if the balance is less than or equal to the `triggerAmount`. You can only use this for sweeps of `type` **pull** and when the source is a `merchantAccount` or `transferInstrument`.
   */
  public enum TypeEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    BALANCE("balance"),
    
    CRON("cron");

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

  public SweepSchedule type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The schedule type.  Possible values:  * **cron**: push out funds based on a cron expression.  * **daily**: push out funds daily at 07:00 AM CET.  * **weekly**: push out funds every Monday at 07:00 AM CET.  * **monthly**: push out funds every first of the month at 07:00 AM CET.  * **balance**: pull in funds instantly if the balance is less than or equal to the `triggerAmount`. You can only use this for sweeps of `type` **pull** and when the source is a `merchantAccount` or `transferInstrument`.
   * @return type
  */
  
  @Schema(name = "type", description = "The schedule type.  Possible values:  * **cron**: push out funds based on a cron expression.  * **daily**: push out funds daily at 07:00 AM CET.  * **weekly**: push out funds every Monday at 07:00 AM CET.  * **monthly**: push out funds every first of the month at 07:00 AM CET.  * **balance**: pull in funds instantly if the balance is less than or equal to the `triggerAmount`. You can only use this for sweeps of `type` **pull** and when the source is a `merchantAccount` or `transferInstrument`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SweepSchedule sweepSchedule = (SweepSchedule) o;
    return Objects.equals(this.type, sweepSchedule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepSchedule {\n");
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

