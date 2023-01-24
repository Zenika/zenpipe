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
import com.zenika.pipedrive.model.BasicPersonRequestEmailInner;
import com.zenika.pipedrive.model.PersonItemAllOfPhoneInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdatePersonRequest
 */
@JsonPropertyOrder({
  UpdatePersonRequest.JSON_PROPERTY_NAME,
  UpdatePersonRequest.JSON_PROPERTY_OWNER_ID,
  UpdatePersonRequest.JSON_PROPERTY_ORG_ID,
  UpdatePersonRequest.JSON_PROPERTY_EMAIL,
  UpdatePersonRequest.JSON_PROPERTY_PHONE,
  UpdatePersonRequest.JSON_PROPERTY_VISIBLE_TO,
  UpdatePersonRequest.JSON_PROPERTY_MARKETING_STATUS,
  UpdatePersonRequest.JSON_PROPERTY_ADD_TIME
})
@JsonTypeName("updatePersonRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class UpdatePersonRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private Integer ownerId;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Integer orgId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private List<BasicPersonRequestEmailInner> email = null;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private List<PersonItemAllOfPhoneInner> phone = null;

  /**
   * Gets or Sets visibleTo
   */
  public enum VisibleToEnum {
    _1("1"),
    
    _3("3"),
    
    _5("5"),
    
    _7("7");

    private String value;

    VisibleToEnum(String value) {
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
    public static VisibleToEnum fromValue(String value) {
      for (VisibleToEnum b : VisibleToEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VISIBLE_TO = "visible_to";
  private VisibleToEnum visibleTo;

  /**
   * Gets or Sets marketingStatus
   */
  public enum MarketingStatusEnum {
    NO_CONSENT("no_consent"),
    
    UNSUBSCRIBED("unsubscribed"),
    
    SUBSCRIBED("subscribed"),
    
    ARCHIVED("archived");

    private String value;

    MarketingStatusEnum(String value) {
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
    public static MarketingStatusEnum fromValue(String value) {
      for (MarketingStatusEnum b : MarketingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MARKETING_STATUS = "marketing_status";
  private MarketingStatusEnum marketingStatus;

  public static final String JSON_PROPERTY_ADD_TIME = "add_time";
  private String addTime;

  public UpdatePersonRequest() {
  }

  public UpdatePersonRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the person
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the person")
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


  public UpdatePersonRequest ownerId(Integer ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The ID of the user who will be marked as the owner of this person. When omitted, the authorized user ID will be used.
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user who will be marked as the owner of this person. When omitted, the authorized user ID will be used.")
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


  public UpdatePersonRequest orgId(Integer orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * The ID of the organization this person will belong to
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the organization this person will belong to")
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrgId() {
    return orgId;
  }


  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }


  public UpdatePersonRequest email(List<BasicPersonRequestEmailInner> email) {
    
    this.email = email;
    return this;
  }

  public UpdatePersonRequest addEmailItem(BasicPersonRequestEmailInner emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * An email address as a string or an array of email objects related to the person. The structure of the array is as follows: &#x60;[{ \&quot;value\&quot;: \&quot;mail@example.com\&quot;, \&quot;primary\&quot;: \&quot;true\&quot;, \&quot;label\&quot;: \&quot;main\&quot; }]&#x60;. Please note that only &#x60;value&#x60; is required.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An email address as a string or an array of email objects related to the person. The structure of the array is as follows: `[{ \"value\": \"mail@example.com\", \"primary\": \"true\", \"label\": \"main\" }]`. Please note that only `value` is required.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BasicPersonRequestEmailInner> getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(List<BasicPersonRequestEmailInner> email) {
    this.email = email;
  }


  public UpdatePersonRequest phone(List<PersonItemAllOfPhoneInner> phone) {
    
    this.phone = phone;
    return this;
  }

  public UpdatePersonRequest addPhoneItem(PersonItemAllOfPhoneInner phoneItem) {
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


  public UpdatePersonRequest visibleTo(VisibleToEnum visibleTo) {
    
    this.visibleTo = visibleTo;
    return this;
  }

   /**
   * Get visibleTo
   * @return visibleTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VISIBLE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VisibleToEnum getVisibleTo() {
    return visibleTo;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleTo(VisibleToEnum visibleTo) {
    this.visibleTo = visibleTo;
  }


  public UpdatePersonRequest marketingStatus(MarketingStatusEnum marketingStatus) {
    
    this.marketingStatus = marketingStatus;
    return this;
  }

   /**
   * Get marketingStatus
   * @return marketingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKETING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MarketingStatusEnum getMarketingStatus() {
    return marketingStatus;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingStatus(MarketingStatusEnum marketingStatus) {
    this.marketingStatus = marketingStatus;
  }


  public UpdatePersonRequest addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * The optional creation date &amp; time of the person in UTC. Requires admin user API token. Format: YYYY-MM-DD HH:MM:SS
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The optional creation date & time of the person in UTC. Requires admin user API token. Format: YYYY-MM-DD HH:MM:SS")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePersonRequest updatePersonRequest = (UpdatePersonRequest) o;
    return Objects.equals(this.name, updatePersonRequest.name) &&
        Objects.equals(this.ownerId, updatePersonRequest.ownerId) &&
        Objects.equals(this.orgId, updatePersonRequest.orgId) &&
        Objects.equals(this.email, updatePersonRequest.email) &&
        Objects.equals(this.phone, updatePersonRequest.phone) &&
        Objects.equals(this.visibleTo, updatePersonRequest.visibleTo) &&
        Objects.equals(this.marketingStatus, updatePersonRequest.marketingStatus) &&
        Objects.equals(this.addTime, updatePersonRequest.addTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ownerId, orgId, email, phone, visibleTo, marketingStatus, addTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePersonRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
    sb.append("    marketingStatus: ").append(toIndentedString(marketingStatus)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
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

