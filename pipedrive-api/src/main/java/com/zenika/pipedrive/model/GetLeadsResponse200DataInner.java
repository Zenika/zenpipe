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
import com.zenika.pipedrive.model.GetLeadsResponse200DataInnerValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetLeadsResponse200DataInner
 */
@JsonPropertyOrder({
  GetLeadsResponse200DataInner.JSON_PROPERTY_ID,
  GetLeadsResponse200DataInner.JSON_PROPERTY_TITLE,
  GetLeadsResponse200DataInner.JSON_PROPERTY_OWNER_ID,
  GetLeadsResponse200DataInner.JSON_PROPERTY_CREATOR_ID,
  GetLeadsResponse200DataInner.JSON_PROPERTY_LABEL_IDS,
  GetLeadsResponse200DataInner.JSON_PROPERTY_PERSON_ID,
  GetLeadsResponse200DataInner.JSON_PROPERTY_ORGANIZATION_ID,
  GetLeadsResponse200DataInner.JSON_PROPERTY_SOURCE_NAME,
  GetLeadsResponse200DataInner.JSON_PROPERTY_IS_ARCHIVED,
  GetLeadsResponse200DataInner.JSON_PROPERTY_WAS_SEEN,
  GetLeadsResponse200DataInner.JSON_PROPERTY_VALUE,
  GetLeadsResponse200DataInner.JSON_PROPERTY_EXPECTED_CLOSE_DATE,
  GetLeadsResponse200DataInner.JSON_PROPERTY_NEXT_ACTIVITY_ID,
  GetLeadsResponse200DataInner.JSON_PROPERTY_ADD_TIME,
  GetLeadsResponse200DataInner.JSON_PROPERTY_UPDATE_TIME,
  GetLeadsResponse200DataInner.JSON_PROPERTY_VISIBLE_TO,
  GetLeadsResponse200DataInner.JSON_PROPERTY_CC_EMAIL
})
@JsonTypeName("getLeadsResponse200_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetLeadsResponse200DataInner {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private Integer ownerId;

  public static final String JSON_PROPERTY_CREATOR_ID = "creator_id";
  private Integer creatorId;

  public static final String JSON_PROPERTY_LABEL_IDS = "label_ids";
  private List<UUID> labelIds = null;

  public static final String JSON_PROPERTY_PERSON_ID = "person_id";
  private JsonNullable<Integer> personId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private JsonNullable<Integer> organizationId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SOURCE_NAME = "source_name";
  private String sourceName;

  public static final String JSON_PROPERTY_IS_ARCHIVED = "is_archived";
  private Boolean isArchived;

  public static final String JSON_PROPERTY_WAS_SEEN = "was_seen";
  private Boolean wasSeen;

  public static final String JSON_PROPERTY_VALUE = "value";
  private GetLeadsResponse200DataInnerValue value;

  public static final String JSON_PROPERTY_EXPECTED_CLOSE_DATE = "expected_close_date";
  private JsonNullable<LocalDate> expectedCloseDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_NEXT_ACTIVITY_ID = "next_activity_id";
  private JsonNullable<Integer> nextActivityId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ADD_TIME = "add_time";
  private OffsetDateTime addTime;

  public static final String JSON_PROPERTY_UPDATE_TIME = "update_time";
  private OffsetDateTime updateTime;

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

  public static final String JSON_PROPERTY_CC_EMAIL = "cc_email";
  private String ccEmail;

  public GetLeadsResponse200DataInner() {
  }

  public GetLeadsResponse200DataInner id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the lead in the UUID format
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the lead in the UUID format")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public GetLeadsResponse200DataInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the lead
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the lead")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public GetLeadsResponse200DataInner ownerId(Integer ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The ID of the user who owns the lead
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user who owns the lead")
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


  public GetLeadsResponse200DataInner creatorId(Integer creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * The ID of the user who created the lead
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user who created the lead")
  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreatorId() {
    return creatorId;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }


  public GetLeadsResponse200DataInner labelIds(List<UUID> labelIds) {
    
    this.labelIds = labelIds;
    return this;
  }

  public GetLeadsResponse200DataInner addLabelIdsItem(UUID labelIdsItem) {
    if (this.labelIds == null) {
      this.labelIds = new ArrayList<>();
    }
    this.labelIds.add(labelIdsItem);
    return this;
  }

   /**
   * The IDs of the lead labels which are associated with the lead
   * @return labelIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the lead labels which are associated with the lead")
  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getLabelIds() {
    return labelIds;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelIds(List<UUID> labelIds) {
    this.labelIds = labelIds;
  }


  public GetLeadsResponse200DataInner personId(Integer personId) {
    this.personId = JsonNullable.<Integer>of(personId);
    
    return this;
  }

   /**
   * The ID of a person which this lead is linked to
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of a person which this lead is linked to")
  @JsonIgnore

  public Integer getPersonId() {
        return personId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPersonId_JsonNullable() {
    return personId;
  }
  
  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  public void setPersonId_JsonNullable(JsonNullable<Integer> personId) {
    this.personId = personId;
  }

  public void setPersonId(Integer personId) {
    this.personId = JsonNullable.<Integer>of(personId);
  }


  public GetLeadsResponse200DataInner organizationId(Integer organizationId) {
    this.organizationId = JsonNullable.<Integer>of(organizationId);
    
    return this;
  }

   /**
   * The ID of an organization which this lead is linked to
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of an organization which this lead is linked to")
  @JsonIgnore

  public Integer getOrganizationId() {
        return organizationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getOrganizationId_JsonNullable() {
    return organizationId;
  }
  
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  public void setOrganizationId_JsonNullable(JsonNullable<Integer> organizationId) {
    this.organizationId = organizationId;
  }

  public void setOrganizationId(Integer organizationId) {
    this.organizationId = JsonNullable.<Integer>of(organizationId);
  }


  public GetLeadsResponse200DataInner sourceName(String sourceName) {
    
    this.sourceName = sourceName;
    return this;
  }

   /**
   * Defines where the lead comes from. Will be &#x60;API&#x60; if the lead was created through the Public API and will be &#x60;Manually created&#x60; if the lead was created manually through the UI. 
   * @return sourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines where the lead comes from. Will be `API` if the lead was created through the Public API and will be `Manually created` if the lead was created manually through the UI. ")
  @JsonProperty(JSON_PROPERTY_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceName() {
    return sourceName;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  public GetLeadsResponse200DataInner isArchived(Boolean isArchived) {
    
    this.isArchived = isArchived;
    return this;
  }

   /**
   * A flag indicating whether the lead is archived or not
   * @return isArchived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the lead is archived or not")
  @JsonProperty(JSON_PROPERTY_IS_ARCHIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsArchived() {
    return isArchived;
  }


  @JsonProperty(JSON_PROPERTY_IS_ARCHIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }


  public GetLeadsResponse200DataInner wasSeen(Boolean wasSeen) {
    
    this.wasSeen = wasSeen;
    return this;
  }

   /**
   * A flag indicating whether the lead was seen by someone in the Pipedrive UI
   * @return wasSeen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the lead was seen by someone in the Pipedrive UI")
  @JsonProperty(JSON_PROPERTY_WAS_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWasSeen() {
    return wasSeen;
  }


  @JsonProperty(JSON_PROPERTY_WAS_SEEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWasSeen(Boolean wasSeen) {
    this.wasSeen = wasSeen;
  }


  public GetLeadsResponse200DataInner value(GetLeadsResponse200DataInnerValue value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetLeadsResponse200DataInnerValue getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(GetLeadsResponse200DataInnerValue value) {
    this.value = value;
  }


  public GetLeadsResponse200DataInner expectedCloseDate(LocalDate expectedCloseDate) {
    this.expectedCloseDate = JsonNullable.<LocalDate>of(expectedCloseDate);
    
    return this;
  }

   /**
   * The date of when the deal which will be created from the lead is expected to be closed. In ISO 8601 format: YYYY-MM-DD.
   * @return expectedCloseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of when the deal which will be created from the lead is expected to be closed. In ISO 8601 format: YYYY-MM-DD.")
  @JsonIgnore

  public LocalDate getExpectedCloseDate() {
        return expectedCloseDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPECTED_CLOSE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getExpectedCloseDate_JsonNullable() {
    return expectedCloseDate;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPECTED_CLOSE_DATE)
  public void setExpectedCloseDate_JsonNullable(JsonNullable<LocalDate> expectedCloseDate) {
    this.expectedCloseDate = expectedCloseDate;
  }

  public void setExpectedCloseDate(LocalDate expectedCloseDate) {
    this.expectedCloseDate = JsonNullable.<LocalDate>of(expectedCloseDate);
  }


  public GetLeadsResponse200DataInner nextActivityId(Integer nextActivityId) {
    this.nextActivityId = JsonNullable.<Integer>of(nextActivityId);
    
    return this;
  }

   /**
   * The ID of the next activity associated with the lead
   * @return nextActivityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the next activity associated with the lead")
  @JsonIgnore

  public Integer getNextActivityId() {
        return nextActivityId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getNextActivityId_JsonNullable() {
    return nextActivityId;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_ACTIVITY_ID)
  public void setNextActivityId_JsonNullable(JsonNullable<Integer> nextActivityId) {
    this.nextActivityId = nextActivityId;
  }

  public void setNextActivityId(Integer nextActivityId) {
    this.nextActivityId = JsonNullable.<Integer>of(nextActivityId);
  }


  public GetLeadsResponse200DataInner addTime(OffsetDateTime addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * The date and time of when the lead was created. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time of when the lead was created. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(OffsetDateTime addTime) {
    this.addTime = addTime;
  }


  public GetLeadsResponse200DataInner updateTime(OffsetDateTime updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The date and time of when the lead was last updated. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time of when the lead was last updated. In ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ.")
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
  }


  public GetLeadsResponse200DataInner visibleTo(VisibleToEnum visibleTo) {
    
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


  public GetLeadsResponse200DataInner ccEmail(String ccEmail) {
    
    this.ccEmail = ccEmail;
    return this;
  }

   /**
   * The BCC email of the lead
   * @return ccEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The BCC email of the lead")
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
    GetLeadsResponse200DataInner getLeadsResponse200DataInner = (GetLeadsResponse200DataInner) o;
    return Objects.equals(this.id, getLeadsResponse200DataInner.id) &&
        Objects.equals(this.title, getLeadsResponse200DataInner.title) &&
        Objects.equals(this.ownerId, getLeadsResponse200DataInner.ownerId) &&
        Objects.equals(this.creatorId, getLeadsResponse200DataInner.creatorId) &&
        Objects.equals(this.labelIds, getLeadsResponse200DataInner.labelIds) &&
        equalsNullable(this.personId, getLeadsResponse200DataInner.personId) &&
        equalsNullable(this.organizationId, getLeadsResponse200DataInner.organizationId) &&
        Objects.equals(this.sourceName, getLeadsResponse200DataInner.sourceName) &&
        Objects.equals(this.isArchived, getLeadsResponse200DataInner.isArchived) &&
        Objects.equals(this.wasSeen, getLeadsResponse200DataInner.wasSeen) &&
        Objects.equals(this.value, getLeadsResponse200DataInner.value) &&
        equalsNullable(this.expectedCloseDate, getLeadsResponse200DataInner.expectedCloseDate) &&
        equalsNullable(this.nextActivityId, getLeadsResponse200DataInner.nextActivityId) &&
        Objects.equals(this.addTime, getLeadsResponse200DataInner.addTime) &&
        Objects.equals(this.updateTime, getLeadsResponse200DataInner.updateTime) &&
        Objects.equals(this.visibleTo, getLeadsResponse200DataInner.visibleTo) &&
        Objects.equals(this.ccEmail, getLeadsResponse200DataInner.ccEmail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, ownerId, creatorId, labelIds, hashCodeNullable(personId), hashCodeNullable(organizationId), sourceName, isArchived, wasSeen, value, hashCodeNullable(expectedCloseDate), hashCodeNullable(nextActivityId), addTime, updateTime, visibleTo, ccEmail);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLeadsResponse200DataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    wasSeen: ").append(toIndentedString(wasSeen)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    expectedCloseDate: ").append(toIndentedString(expectedCloseDate)).append("\n");
    sb.append("    nextActivityId: ").append(toIndentedString(nextActivityId)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
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
