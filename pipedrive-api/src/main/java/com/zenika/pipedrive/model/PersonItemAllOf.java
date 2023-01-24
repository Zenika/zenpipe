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
import com.zenika.pipedrive.model.PersonItemAllOfEmailInner;
import com.zenika.pipedrive.model.PersonItemAllOfPhoneInner;
import com.zenika.pipedrive.model.PersonItemAllOfPictureId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PersonItemAllOf
 */
@JsonPropertyOrder({
  PersonItemAllOf.JSON_PROPERTY_ID,
  PersonItemAllOf.JSON_PROPERTY_COMPANY_ID,
  PersonItemAllOf.JSON_PROPERTY_ACTIVE_FLAG,
  PersonItemAllOf.JSON_PROPERTY_PHONE,
  PersonItemAllOf.JSON_PROPERTY_EMAIL,
  PersonItemAllOf.JSON_PROPERTY_FIRST_CHAR,
  PersonItemAllOf.JSON_PROPERTY_ADD_TIME,
  PersonItemAllOf.JSON_PROPERTY_UPDATE_TIME,
  PersonItemAllOf.JSON_PROPERTY_VISIBLE_TO,
  PersonItemAllOf.JSON_PROPERTY_PICTURE_ID,
  PersonItemAllOf.JSON_PROPERTY_LABEL,
  PersonItemAllOf.JSON_PROPERTY_ORG_NAME,
  PersonItemAllOf.JSON_PROPERTY_OWNER_NAME,
  PersonItemAllOf.JSON_PROPERTY_CC_EMAIL
})
@JsonTypeName("personItem_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class PersonItemAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_COMPANY_ID = "company_id";
  private Integer companyId;

  public static final String JSON_PROPERTY_ACTIVE_FLAG = "active_flag";
  private Boolean activeFlag;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private List<PersonItemAllOfPhoneInner> phone = null;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private List<PersonItemAllOfEmailInner> email = null;

  public static final String JSON_PROPERTY_FIRST_CHAR = "first_char";
  private String firstChar;

  public static final String JSON_PROPERTY_ADD_TIME = "add_time";
  private String addTime;

  public static final String JSON_PROPERTY_UPDATE_TIME = "update_time";
  private String updateTime;

  public static final String JSON_PROPERTY_VISIBLE_TO = "visible_to";
  private String visibleTo;

  public static final String JSON_PROPERTY_PICTURE_ID = "picture_id";
  private PersonItemAllOfPictureId pictureId;

  public static final String JSON_PROPERTY_LABEL = "label";
  private Integer label;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_OWNER_NAME = "owner_name";
  private String ownerName;

  public static final String JSON_PROPERTY_CC_EMAIL = "cc_email";
  private String ccEmail;

  public PersonItemAllOf() {
  }

  public PersonItemAllOf id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the person
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the person")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public PersonItemAllOf companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * The ID of the company related to the person
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the company related to the person")
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCompanyId() {
    return companyId;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public PersonItemAllOf activeFlag(Boolean activeFlag) {
    
    this.activeFlag = activeFlag;
    return this;
  }

   /**
   * Whether the person is active or not
   * @return activeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the person is active or not")
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


  public PersonItemAllOf phone(List<PersonItemAllOfPhoneInner> phone) {
    
    this.phone = phone;
    return this;
  }

  public PersonItemAllOf addPhoneItem(PersonItemAllOfPhoneInner phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<>();
    }
    this.phone.add(phoneItem);
    return this;
  }

   /**
   * A phone number supplied as a string or an array of phone objects related to the person. The structure of the array is as follows: &#x60;[{ \&quot;value\&quot;: \&quot;12345\&quot;, \&quot;primary\&quot;: \&quot;true\&quot;, \&quot;label\&quot;: \&quot;mobile\&quot; }]&#x60;. Please note that only &#x60;value&#x60; is required.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A phone number supplied as a string or an array of phone objects related to the person. The structure of the array is as follows: `[{ \"value\": \"12345\", \"primary\": \"true\", \"label\": \"mobile\" }]`. Please note that only `value` is required.")
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PersonItemAllOfPhoneInner> getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(List<PersonItemAllOfPhoneInner> phone) {
    this.phone = phone;
  }


  public PersonItemAllOf email(List<PersonItemAllOfEmailInner> email) {
    
    this.email = email;
    return this;
  }

  public PersonItemAllOf addEmailItem(PersonItemAllOfEmailInner emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * An email address as a string or an array of email objects related to the person. The structure of the array is as follows: &#x60;[{ \&quot;value\&quot;: \&quot;mail@example.com\&quot;, \&quot;primary\&quot;: \&quot;true\&quot;, \&quot;label\&quot;: \&quot;main\&quot; } ]&#x60;. Please note that only &#x60;value&#x60; is required.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An email address as a string or an array of email objects related to the person. The structure of the array is as follows: `[{ \"value\": \"mail@example.com\", \"primary\": \"true\", \"label\": \"main\" } ]`. Please note that only `value` is required.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PersonItemAllOfEmailInner> getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(List<PersonItemAllOfEmailInner> email) {
    this.email = email;
  }


  public PersonItemAllOf firstChar(String firstChar) {
    
    this.firstChar = firstChar;
    return this;
  }

   /**
   * The first letter of the name of the person
   * @return firstChar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first letter of the name of the person")
  @JsonProperty(JSON_PROPERTY_FIRST_CHAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstChar() {
    return firstChar;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_CHAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstChar(String firstChar) {
    this.firstChar = firstChar;
  }


  public PersonItemAllOf addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * The date and time when the person was added/created. Format: YYYY-MM-DD HH:MM:SS
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when the person was added/created. Format: YYYY-MM-DD HH:MM:SS")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }


  public PersonItemAllOf updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The last updated date and time of the person. Format: YYYY-MM-DD HH:MM:SS
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last updated date and time of the person. Format: YYYY-MM-DD HH:MM:SS")
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateTime() {
    return updateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public PersonItemAllOf visibleTo(String visibleTo) {
    
    this.visibleTo = visibleTo;
    return this;
  }

   /**
   * The visibility group ID of who can see the person
   * @return visibleTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The visibility group ID of who can see the person")
  @JsonProperty(JSON_PROPERTY_VISIBLE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisibleTo() {
    return visibleTo;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleTo(String visibleTo) {
    this.visibleTo = visibleTo;
  }


  public PersonItemAllOf pictureId(PersonItemAllOfPictureId pictureId) {
    
    this.pictureId = pictureId;
    return this;
  }

   /**
   * Get pictureId
   * @return pictureId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PICTURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PersonItemAllOfPictureId getPictureId() {
    return pictureId;
  }


  @JsonProperty(JSON_PROPERTY_PICTURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPictureId(PersonItemAllOfPictureId pictureId) {
    this.pictureId = pictureId;
  }


  public PersonItemAllOf label(Integer label) {
    
    this.label = label;
    return this;
  }

   /**
   * The label assigned to the person
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The label assigned to the person")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(Integer label) {
    this.label = label;
  }


  public PersonItemAllOf orgName(String orgName) {
    
    this.orgName = orgName;
    return this;
  }

   /**
   * The name of the organization associated with the person
   * @return orgName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the organization associated with the person")
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrgName() {
    return orgName;
  }


  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }


  public PersonItemAllOf ownerName(String ownerName) {
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name of the owner associated with the person
   * @return ownerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the owner associated with the person")
  @JsonProperty(JSON_PROPERTY_OWNER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwnerName() {
    return ownerName;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public PersonItemAllOf ccEmail(String ccEmail) {
    
    this.ccEmail = ccEmail;
    return this;
  }

   /**
   * The BCC email associated with the person
   * @return ccEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The BCC email associated with the person")
  @JsonProperty(JSON_PROPERTY_CC_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCcEmail() {
    return ccEmail;
  }


  @JsonProperty(JSON_PROPERTY_CC_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCcEmail(String ccEmail) {
    this.ccEmail = ccEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonItemAllOf personItemAllOf = (PersonItemAllOf) o;
    return Objects.equals(this.id, personItemAllOf.id) &&
        Objects.equals(this.companyId, personItemAllOf.companyId) &&
        Objects.equals(this.activeFlag, personItemAllOf.activeFlag) &&
        Objects.equals(this.phone, personItemAllOf.phone) &&
        Objects.equals(this.email, personItemAllOf.email) &&
        Objects.equals(this.firstChar, personItemAllOf.firstChar) &&
        Objects.equals(this.addTime, personItemAllOf.addTime) &&
        Objects.equals(this.updateTime, personItemAllOf.updateTime) &&
        Objects.equals(this.visibleTo, personItemAllOf.visibleTo) &&
        Objects.equals(this.pictureId, personItemAllOf.pictureId) &&
        Objects.equals(this.label, personItemAllOf.label) &&
        Objects.equals(this.orgName, personItemAllOf.orgName) &&
        Objects.equals(this.ownerName, personItemAllOf.ownerName) &&
        Objects.equals(this.ccEmail, personItemAllOf.ccEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, activeFlag, phone, email, firstChar, addTime, updateTime, visibleTo, pictureId, label, orgName, ownerName, ccEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonItemAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstChar: ").append(toIndentedString(firstChar)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
    sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
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

