package com.adyen.examples.model.configuration;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * AccountHolderCapability
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class AccountHolderCapability {

  private Boolean allowed;

  /**
   * The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   */
  public enum AllowedLevelEnum {
    HIGH("high"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    NOTAPPLICABLE("notApplicable");

    private String value;

    AllowedLevelEnum(String value) {
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
    public static AllowedLevelEnum fromValue(String value) {
      for (AllowedLevelEnum b : AllowedLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AllowedLevelEnum allowedLevel;

  private JSONObject allowedSettings;

  private Boolean enabled;

  @Valid
  private List<Object> problems;

  private Boolean requested;

  /**
   * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   */
  public enum RequestedLevelEnum {
    HIGH("high"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    NOTAPPLICABLE("notApplicable");

    private String value;

    RequestedLevelEnum(String value) {
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
    public static RequestedLevelEnum fromValue(String value) {
      for (RequestedLevelEnum b : RequestedLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RequestedLevelEnum requestedLevel;

  private JSONObject requestedSettings;

  @Valid
  private List<@Valid AccountSupportingEntityCapability> transferInstruments;

  /**
   * The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   */
  public enum VerificationStatusEnum {
    INVALID("invalid"),
    
    PENDING("pending"),
    
    REJECTED("rejected"),
    
    VALID("valid");

    private String value;

    VerificationStatusEnum(String value) {
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
    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VerificationStatusEnum verificationStatus;

  public AccountHolderCapability allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

  /**
   * Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.
   * @return allowed
  */
  
  @Schema(name = "allowed", description = "Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowed")
  public Boolean getAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public AccountHolderCapability allowedLevel(AllowedLevelEnum allowedLevel) {
    this.allowedLevel = allowedLevel;
    return this;
  }

  /**
   * The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   * @return allowedLevel
  */
  
  @Schema(name = "allowedLevel", description = "The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedLevel")
  public AllowedLevelEnum getAllowedLevel() {
    return allowedLevel;
  }

  public void setAllowedLevel(AllowedLevelEnum allowedLevel) {
    this.allowedLevel = allowedLevel;
  }

  public AccountHolderCapability allowedSettings(JSONObject allowedSettings) {
    this.allowedSettings = allowedSettings;
    return this;
  }

  /**
   * Get allowedSettings
   * @return allowedSettings
  */
  @Valid 
  @Schema(name = "allowedSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedSettings")
  public JSONObject getAllowedSettings() {
    return allowedSettings;
  }

  public void setAllowedSettings(JSONObject allowedSettings) {
    this.allowedSettings = allowedSettings;
  }

  public AccountHolderCapability enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder.
   * @return enabled
  */
  
  @Schema(name = "enabled", description = "Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AccountHolderCapability problems(List<Object> problems) {
    this.problems = problems;
    return this;
  }

  public AccountHolderCapability addProblemsItem(Object problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<>();
    }
    this.problems.add(problemsItem);
    return this;
  }

  /**
   * Contains verification errors and the actions that you can take to resolve them.
   * @return problems
  */
  
  @Schema(name = "problems", description = "Contains verification errors and the actions that you can take to resolve them.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("problems")
  public List<Object> getProblems() {
    return problems;
  }

  public void setProblems(List<Object> problems) {
    this.problems = problems;
  }

  public AccountHolderCapability requested(Boolean requested) {
    this.requested = requested;
    return this;
  }

  /**
   * Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the `allowed` field.
   * @return requested
  */
  
  @Schema(name = "requested", description = "Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the `allowed` field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requested")
  public Boolean getRequested() {
    return requested;
  }

  public void setRequested(Boolean requested) {
    this.requested = requested;
  }

  public AccountHolderCapability requestedLevel(RequestedLevelEnum requestedLevel) {
    this.requestedLevel = requestedLevel;
    return this;
  }

  /**
   * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   * @return requestedLevel
  */
  
  @Schema(name = "requestedLevel", description = "The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedLevel")
  public RequestedLevelEnum getRequestedLevel() {
    return requestedLevel;
  }

  public void setRequestedLevel(RequestedLevelEnum requestedLevel) {
    this.requestedLevel = requestedLevel;
  }

  public AccountHolderCapability requestedSettings(JSONObject requestedSettings) {
    this.requestedSettings = requestedSettings;
    return this;
  }

  /**
   * Get requestedSettings
   * @return requestedSettings
  */
  @Valid 
  @Schema(name = "requestedSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedSettings")
  public JSONObject getRequestedSettings() {
    return requestedSettings;
  }

  public void setRequestedSettings(JSONObject requestedSettings) {
    this.requestedSettings = requestedSettings;
  }

  public AccountHolderCapability transferInstruments(List<@Valid AccountSupportingEntityCapability> transferInstruments) {
    this.transferInstruments = transferInstruments;
    return this;
  }

  public AccountHolderCapability addTransferInstrumentsItem(AccountSupportingEntityCapability transferInstrumentsItem) {
    if (this.transferInstruments == null) {
      this.transferInstruments = new ArrayList<>();
    }
    this.transferInstruments.add(transferInstrumentsItem);
    return this;
  }

  /**
   * Contains the status of the transfer instruments associated with this capability. 
   * @return transferInstruments
  */
  @Valid 
  @Schema(name = "transferInstruments", description = "Contains the status of the transfer instruments associated with this capability. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transferInstruments")
  public List<@Valid AccountSupportingEntityCapability> getTransferInstruments() {
    return transferInstruments;
  }

  public void setTransferInstruments(List<@Valid AccountSupportingEntityCapability> transferInstruments) {
    this.transferInstruments = transferInstruments;
  }

  public AccountHolderCapability verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

  /**
   * The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   * @return verificationStatus
  */
  
  @Schema(name = "verificationStatus", description = "The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verificationStatus")
  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolderCapability accountHolderCapability = (AccountHolderCapability) o;
    return Objects.equals(this.allowed, accountHolderCapability.allowed) &&
        Objects.equals(this.allowedLevel, accountHolderCapability.allowedLevel) &&
        Objects.equals(this.allowedSettings, accountHolderCapability.allowedSettings) &&
        Objects.equals(this.enabled, accountHolderCapability.enabled) &&
        Objects.equals(this.problems, accountHolderCapability.problems) &&
        Objects.equals(this.requested, accountHolderCapability.requested) &&
        Objects.equals(this.requestedLevel, accountHolderCapability.requestedLevel) &&
        Objects.equals(this.requestedSettings, accountHolderCapability.requestedSettings) &&
        Objects.equals(this.transferInstruments, accountHolderCapability.transferInstruments) &&
        Objects.equals(this.verificationStatus, accountHolderCapability.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, allowedLevel, allowedSettings, enabled, problems, requested, requestedLevel, requestedSettings, transferInstruments, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolderCapability {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    allowedLevel: ").append(toIndentedString(allowedLevel)).append("\n");
    sb.append("    allowedSettings: ").append(toIndentedString(allowedSettings)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    requestedLevel: ").append(toIndentedString(requestedLevel)).append("\n");
    sb.append("    requestedSettings: ").append(toIndentedString(requestedSettings)).append("\n");
    sb.append("    transferInstruments: ").append(toIndentedString(transferInstruments)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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

