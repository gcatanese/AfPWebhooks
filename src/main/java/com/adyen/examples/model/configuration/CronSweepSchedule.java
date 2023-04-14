package com.adyen.examples.model.configuration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * CronSweepSchedule
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class CronSweepSchedule implements SweepConfigurationSchedule {

  private String cronExpression;

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

  /**
   * Default constructor
   * @deprecated Use {@link CronSweepSchedule#CronSweepSchedule(String)}
   */
  @Deprecated
  public CronSweepSchedule() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CronSweepSchedule(String cronExpression) {
    this.cronExpression = cronExpression;
  }

  public CronSweepSchedule cronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

  /**
   * A [cron expression](https://en.wikipedia.org/wiki/Cron#CRON_expression) that is used to set the sweep schedule. The schedule uses the time zone of the balance account. For example, **30 17 * * MON** schedules a sweep every Monday at 17:30.  The expression must have five values separated by a single space in the following order:  * Minute: **0-59**  * Hour: **0-23**  * Day of the month: **1-31**  * Month: **1-12** or **JAN-DEC**  * Day of the week: **0-7** (0 and 7 are Sunday) or **MON-SUN**.  The following non-standard characters are supported: **&ast;**, **L**, **#**, **W** and **_/_**. See [crontab guru](https://crontab.guru/) for more examples.
   * @return cronExpression
  */
  @NotNull 
  @Schema(name = "cronExpression", description = "A [cron expression](https://en.wikipedia.org/wiki/Cron#CRON_expression) that is used to set the sweep schedule. The schedule uses the time zone of the balance account. For example, **30 17 * * MON** schedules a sweep every Monday at 17:30.  The expression must have five values separated by a single space in the following order:  * Minute: **0-59**  * Hour: **0-23**  * Day of the month: **1-31**  * Month: **1-12** or **JAN-DEC**  * Day of the week: **0-7** (0 and 7 are Sunday) or **MON-SUN**.  The following non-standard characters are supported: **&ast;**, **L**, **#**, **W** and **_/_**. See [crontab guru](https://crontab.guru/) for more examples.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cronExpression")
  public String getCronExpression() {
    return cronExpression;
  }

  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }

  public CronSweepSchedule type(TypeEnum type) {
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
    CronSweepSchedule cronSweepSchedule = (CronSweepSchedule) o;
    return Objects.equals(this.cronExpression, cronSweepSchedule.cronExpression) &&
        Objects.equals(this.type, cronSweepSchedule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpression, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronSweepSchedule {\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
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

