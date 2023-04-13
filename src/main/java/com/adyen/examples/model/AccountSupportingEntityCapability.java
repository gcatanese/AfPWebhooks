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
 * AccountSupportingEntityCapability
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class AccountSupportingEntityCapability {

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

  private Boolean enabled;

  private String id;

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

  /**
   * The status of the verification checks for the supporting entity capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
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

  public AccountSupportingEntityCapability allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

  /**
   * Indicates whether the supporting entity capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.
   * @return allowed
  */
  
  @Schema(name = "allowed", description = "Indicates whether the supporting entity capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowed")
  public Boolean getAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public AccountSupportingEntityCapability allowedLevel(AllowedLevelEnum allowedLevel) {
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

  public AccountSupportingEntityCapability enabled(Boolean enabled) {
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

  public AccountSupportingEntityCapability id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the supporting entity.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the supporting entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountSupportingEntityCapability requested(Boolean requested) {
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

  public AccountSupportingEntityCapability requestedLevel(RequestedLevelEnum requestedLevel) {
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

  public AccountSupportingEntityCapability verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

  /**
   * The status of the verification checks for the supporting entity capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   * @return verificationStatus
  */
  
  @Schema(name = "verificationStatus", description = "The status of the verification checks for the supporting entity capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AccountSupportingEntityCapability accountSupportingEntityCapability = (AccountSupportingEntityCapability) o;
    return Objects.equals(this.allowed, accountSupportingEntityCapability.allowed) &&
        Objects.equals(this.allowedLevel, accountSupportingEntityCapability.allowedLevel) &&
        Objects.equals(this.enabled, accountSupportingEntityCapability.enabled) &&
        Objects.equals(this.id, accountSupportingEntityCapability.id) &&
        Objects.equals(this.requested, accountSupportingEntityCapability.requested) &&
        Objects.equals(this.requestedLevel, accountSupportingEntityCapability.requestedLevel) &&
        Objects.equals(this.verificationStatus, accountSupportingEntityCapability.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, allowedLevel, enabled, id, requested, requestedLevel, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSupportingEntityCapability {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    allowedLevel: ").append(toIndentedString(allowedLevel)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    requestedLevel: ").append(toIndentedString(requestedLevel)).append("\n");
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

