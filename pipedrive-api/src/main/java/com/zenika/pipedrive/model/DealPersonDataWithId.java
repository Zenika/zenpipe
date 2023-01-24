/*
 * Pipedrive API v1
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zenika.pipedrive.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zenika.pipedrive.model.DealPersonDataWithIdAllOfEmailInner;
import com.zenika.pipedrive.model.DealPersonDataWithIdAllOfPhoneInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DealPersonDataWithId
 */
@JsonPropertyOrder({
  DealPersonDataWithId.JSON_PROPERTY_ACTIVE_FLAG,
  DealPersonDataWithId.JSON_PROPERTY_NAME,
  DealPersonDataWithId.JSON_PROPERTY_EMAIL,
  DealPersonDataWithId.JSON_PROPERTY_PHONE,
  DealPersonDataWithId.JSON_PROPERTY_OWNER_ID,
  DealPersonDataWithId.JSON_PROPERTY_VALUE
})
@JsonTypeName("dealPersonDataWithId")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class DealPersonDataWithId {
  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private List<DealPersonDataWithIdAllOfEmailInner> email = null;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private List<DealPersonDataWithIdAllOfPhoneInner> phone = null;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private Integer ownerId;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Integer value;

  public DealPersonDataWithId() {
  }

  public DealPersonDataWithId activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether the associated person is active or not
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the associated person is active or not")
  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActiveFlag() {
    return activeFlag;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveFlag(Boolean activeFlag) {
    this.activeFlag = activeFlag;
  }


  public DealPersonDataWithId name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the person associated with the deal
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the person associated with the deal")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public DealPersonDataWithId email(List<DealPersonDataWithIdAllOfEmailInner> email) {
    
    this.email = email;
    return this;
  }

  public DealPersonDataWithId addEmailItem(DealPersonDataWithIdAllOfEmailInner emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * The emails of the person associated with the deal
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The emails of the person associated with the deal")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DealPersonDataWithIdAllOfEmailInner> getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(List<DealPersonDataWithIdAllOfEmailInner> email) {
    this.email = email;
  }


  public DealPersonDataWithId phone(List<DealPersonDataWithIdAllOfPhoneInner> phone) {
    
    this.phone = phone;
    return this;
  }

  public DealPersonDataWithId addPhoneItem(DealPersonDataWithIdAllOfPhoneInner phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<>();
    }
    this.phone.add(phoneItem);
    return this;
  }

   /**
   * The phone numbers of the person associated with the deal
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone numbers of the person associated with the deal")
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DealPersonDataWithIdAllOfPhoneInner> getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(List<DealPersonDataWithIdAllOfPhoneInner> phone) {
    this.phone = phone;
  }


  public DealPersonDataWithId ownerId(Integer ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The ID of the owner of the person that is associated with the deal
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the owner of the person that is associated with the deal")
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOwnerId() {
    return ownerId;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }


  public DealPersonDataWithId value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * The ID of the person associated with the deal
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the person associated with the deal")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealPersonDataWithId dealPersonDataWithId = (DealPersonDataWithId) o;
    return Objects.equals(this.activeFlag, dealPersonDataWithId.activeFlag) &&
        Objects.equals(this.name, dealPersonDataWithId.name) &&
        Objects.equals(this.email, dealPersonDataWithId.email) &&
        Objects.equals(this.phone, dealPersonDataWithId.phone) &&
        Objects.equals(this.ownerId, dealPersonDataWithId.ownerId) &&
        Objects.equals(this.value, dealPersonDataWithId.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeFlag, name, email, phone, ownerId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealPersonDataWithId {\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
