package com.adyen.examples.model.configuration;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * AccountHolder
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-12T13:12:26.960810+02:00[Europe/Amsterdam]")
public class AccountHolder {

  private String balancePlatform;

  @Valid
  private Map<String, AccountHolderCapability> capabilities = new HashMap<>();

  private ContactDetails contactDetails;

  private String description;

  private String id;

  private String legalEntityId;

  private String primaryBalanceAccount;

  private String reference;

  /**
   * The status of the account holder.  Possible values:    * **Active**: The account holder is active. This is the default status when creating an account holder.    * **Inactive (Deprecated)**: The account holder is temporarily inactive due to missing KYC details. You can set the account back to active by providing the missing KYC details.    * **Suspended**: The account holder is permanently deactivated by Adyen. This action cannot be undone.   * **Closed**: The account holder is permanently deactivated by you. This action cannot be undone.
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    SUSPENDED("Suspended");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private String timeZone;

  /**
   * Default constructor
   * @deprecated Use {@link AccountHolder#AccountHolder(String, String)}
   */
  @Deprecated
  public AccountHolder() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccountHolder(String id, String legalEntityId) {
    this.id = id;
    this.legalEntityId = legalEntityId;
  }

  public AccountHolder balancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
    return this;
  }

  /**
   * The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the account holder belongs. Required in the request if your API credentials can be used for multiple balance platforms.
   * @return balancePlatform
  */
  
  @Schema(name = "balancePlatform", description = "The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the account holder belongs. Required in the request if your API credentials can be used for multiple balance platforms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balancePlatform")
  public String getBalancePlatform() {
    return balancePlatform;
  }

  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }

  public AccountHolder capabilities(Map<String, AccountHolderCapability> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public AccountHolder putCapabilitiesItem(String key, AccountHolderCapability capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new HashMap<>();
    }
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

  /**
   * Contains key-value pairs that specify the actions that an account holder can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing. The value is an object containing the settings for the capability.
   * @return capabilities
  */
  @Valid 
  @Schema(name = "capabilities", description = "Contains key-value pairs that specify the actions that an account holder can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing. The value is an object containing the settings for the capability.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capabilities")
  public Map<String, AccountHolderCapability> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(Map<String, AccountHolderCapability> capabilities) {
    this.capabilities = capabilities;
  }

  public AccountHolder contactDetails(ContactDetails contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

  /**
   * Get contactDetails
   * @return contactDetails
  */
  @Valid 
  @Schema(name = "contactDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactDetails")
  public ContactDetails getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(ContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }

  public AccountHolder description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Your description for the account holder, maximum 300 characters.
   * @return description
  */
  @Size(max = 300) 
  @Schema(name = "description", description = "Your description for the account holder, maximum 300 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountHolder id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the account holder.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The unique identifier of the account holder.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountHolder legalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
    return this;
  }

  /**
   * The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) associated with the account holder. Adyen performs a verification process against the legal entity of the account holder.
   * @return legalEntityId
  */
  @NotNull 
  @Schema(name = "legalEntityId", description = "The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id) associated with the account holder. Adyen performs a verification process against the legal entity of the account holder.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("legalEntityId")
  public String getLegalEntityId() {
    return legalEntityId;
  }

  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }

  public AccountHolder primaryBalanceAccount(String primaryBalanceAccount) {
    this.primaryBalanceAccount = primaryBalanceAccount;
    return this;
  }

  /**
   * The ID of the account holder's primary balance account. By default, this is set to the first balance account that you create for the account holder. To assign a different balance account, send a PATCH request.
   * @return primaryBalanceAccount
  */
  
  @Schema(name = "primaryBalanceAccount", description = "The ID of the account holder's primary balance account. By default, this is set to the first balance account that you create for the account holder. To assign a different balance account, send a PATCH request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primaryBalanceAccount")
  public String getPrimaryBalanceAccount() {
    return primaryBalanceAccount;
  }

  public void setPrimaryBalanceAccount(String primaryBalanceAccount) {
    this.primaryBalanceAccount = primaryBalanceAccount;
  }

  public AccountHolder reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the account holder, maximum 150 characters.
   * @return reference
  */
  @Size(max = 150) 
  @Schema(name = "reference", description = "Your reference for the account holder, maximum 150 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public AccountHolder status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the account holder.  Possible values:    * **Active**: The account holder is active. This is the default status when creating an account holder.    * **Inactive (Deprecated)**: The account holder is temporarily inactive due to missing KYC details. You can set the account back to active by providing the missing KYC details.    * **Suspended**: The account holder is permanently deactivated by Adyen. This action cannot be undone.   * **Closed**: The account holder is permanently deactivated by you. This action cannot be undone.
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the account holder.  Possible values:    * **Active**: The account holder is active. This is the default status when creating an account holder.    * **Inactive (Deprecated)**: The account holder is temporarily inactive due to missing KYC details. You can set the account back to active by providing the missing KYC details.    * **Suspended**: The account holder is permanently deactivated by Adyen. This action cannot be undone.   * **Closed**: The account holder is permanently deactivated by you. This action cannot be undone.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AccountHolder timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The [time zone](https://www.iana.org/time-zones) of the account holder. For example, **Europe/Amsterdam**. Defaults to the time zone of the balance platform if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
   * @return timeZone
  */
  
  @Schema(name = "timeZone", description = "The [time zone](https://www.iana.org/time-zones) of the account holder. For example, **Europe/Amsterdam**. Defaults to the time zone of the balance platform if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolder accountHolder = (AccountHolder) o;
    return Objects.equals(this.balancePlatform, accountHolder.balancePlatform) &&
        Objects.equals(this.capabilities, accountHolder.capabilities) &&
        Objects.equals(this.contactDetails, accountHolder.contactDetails) &&
        Objects.equals(this.description, accountHolder.description) &&
        Objects.equals(this.id, accountHolder.id) &&
        Objects.equals(this.legalEntityId, accountHolder.legalEntityId) &&
        Objects.equals(this.primaryBalanceAccount, accountHolder.primaryBalanceAccount) &&
        Objects.equals(this.reference, accountHolder.reference) &&
        Objects.equals(this.status, accountHolder.status) &&
        Objects.equals(this.timeZone, accountHolder.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balancePlatform, capabilities, contactDetails, description, id, legalEntityId, primaryBalanceAccount, reference, status, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolder {\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    primaryBalanceAccount: ").append(toIndentedString(primaryBalanceAccount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

