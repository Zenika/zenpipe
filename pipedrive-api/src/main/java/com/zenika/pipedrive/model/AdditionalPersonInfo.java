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
import com.zenika.pipedrive.model.Owner;
import com.zenika.pipedrive.model.RelationshipOrganizationInfoItemWithActiveFlag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AdditionalPersonInfo
 */
@JsonPropertyOrder({
  AdditionalPersonInfo.JSON_PROPERTY_OWNER_ID,
  AdditionalPersonInfo.JSON_PROPERTY_ORG_ID,
  AdditionalPersonInfo.JSON_PROPERTY_NAME,
  AdditionalPersonInfo.JSON_PROPERTY_FIRST_NAME,
  AdditionalPersonInfo.JSON_PROPERTY_LAST_NAME,
  AdditionalPersonInfo.JSON_PROPERTY_EMAIL_MESSAGES_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_ACTIVITIES_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_DONE_ACTIVITIES_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_UNDONE_ACTIVITIES_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_FILES_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_NOTES_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_FOLLOWERS_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_LAST_INCOMING_MAIL_TIME,
  AdditionalPersonInfo.JSON_PROPERTY_LAST_OUTGOING_MAIL_TIME,
  AdditionalPersonInfo.JSON_PROPERTY_OPEN_DEALS_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_RELATED_OPEN_DEALS_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_CLOSED_DEALS_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_RELATED_CLOSED_DEALS_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_WON_DEALS_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_RELATED_WON_DEALS_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_LOST_DEALS_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_RELATED_LOST_DEALS_COUNT,
  AdditionalPersonInfo.JSON_PROPERTY_NEXT_ACTIVITY_DATE,
  AdditionalPersonInfo.JSON_PROPERTY_NEXT_ACTIVITY_TIME,
  AdditionalPersonInfo.JSON_PROPERTY_NEXT_ACTIVITY_ID,
  AdditionalPersonInfo.JSON_PROPERTY_LAST_ACTIVITY_ID,
  AdditionalPersonInfo.JSON_PROPERTY_LAST_ACTIVITY_DATE
})
@JsonTypeName("additionalPersonInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AdditionalPersonInfo {
  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private Owner ownerId;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private RelationshipOrganizationInfoItemWithActiveFlag orgId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL_MESSAGES_COUNT = "email_messages_count";
  private Integer emailMessagesCount;

  public static final String JSON_PROPERTY_ACTIVITIES_COUNT = "activities_count";
  private Integer activitiesCount;

  public static final String JSON_PROPERTY_DONE_ACTIVITIES_COUNT = "done_activities_count";
  private Integer doneActivitiesCount;

  public static final String JSON_PROPERTY_UNDONE_ACTIVITIES_COUNT = "undone_activities_count";
  private Integer undoneActivitiesCount;

  public static final String JSON_PROPERTY_FILES_COUNT = "files_count";
  private Integer filesCount;

  public static final String JSON_PROPERTY_NOTES_COUNT = "notes_count";
  private Integer notesCount;

  public static final String JSON_PROPERTY_FOLLOWERS_COUNT = "followers_count";
  private Integer followersCount;

  public static final String JSON_PROPERTY_LAST_INCOMING_MAIL_TIME = "last_incoming_mail_time";
  private String lastIncomingMailTime;

  public static final String JSON_PROPERTY_LAST_OUTGOING_MAIL_TIME = "last_outgoing_mail_time";
  private String lastOutgoingMailTime;

  public static final String JSON_PROPERTY_OPEN_DEALS_COUNT = "open_deals_count";
  private Integer openDealsCount;

  public static final String JSON_PROPERTY_RELATED_OPEN_DEALS_COUNT = "related_open_deals_count";
  private Integer relatedOpenDealsCount;

  public static final String JSON_PROPERTY_CLOSED_DEALS_COUNT = "closed_deals_count";
  private Integer closedDealsCount;

  public static final String JSON_PROPERTY_RELATED_CLOSED_DEALS_COUNT = "related_closed_deals_count";
  private Integer relatedClosedDealsCount;

  public static final String JSON_PROPERTY_WON_DEALS_COUNT = "won_deals_count";
  private Integer wonDealsCount;

  public static final String JSON_PROPERTY_RELATED_WON_DEALS_COUNT = "related_won_deals_count";
  private Integer relatedWonDealsCount;

  public static final String JSON_PROPERTY_LOST_DEALS_COUNT = "lost_deals_count";
  private Integer lostDealsCount;

  public static final String JSON_PROPERTY_RELATED_LOST_DEALS_COUNT = "related_lost_deals_count";
  private Integer relatedLostDealsCount;

  public static final String JSON_PROPERTY_NEXT_ACTIVITY_DATE = "next_activity_date";
  private String nextActivityDate;

  public static final String JSON_PROPERTY_NEXT_ACTIVITY_TIME = "next_activity_time";
  private String nextActivityTime;

  public static final String JSON_PROPERTY_NEXT_ACTIVITY_ID = "next_activity_id";
  private JsonNullable<Integer> nextActivityId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_LAST_ACTIVITY_ID = "last_activity_id";
  private JsonNullable<Integer> lastActivityId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_LAST_ACTIVITY_DATE = "last_activity_date";
  private JsonNullable<String> lastActivityDate = JsonNullable.<String>undefined();

  public AdditionalPersonInfo() {
  }

  public AdditionalPersonInfo ownerId(Owner ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Owner getOwnerId() {
    return ownerId;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerId(Owner ownerId) {
    this.ownerId = ownerId;
  }


  public AdditionalPersonInfo orgId(RelationshipOrganizationInfoItemWithActiveFlag orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelationshipOrganizationInfoItemWithActiveFlag getOrgId() {
    return orgId;
  }


  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgId(RelationshipOrganizationInfoItemWithActiveFlag orgId) {
    this.orgId = orgId;
  }


  public AdditionalPersonInfo name(String name) {
    
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


  public AdditionalPersonInfo firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the person
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first name of the person")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public AdditionalPersonInfo lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the person
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last name of the person")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public AdditionalPersonInfo emailMessagesCount(Integer emailMessagesCount) {
    
    this.emailMessagesCount = emailMessagesCount;
    return this;
  }

   /**
   * The count of email messages related to the person
   * @return emailMessagesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of email messages related to the person")
  @JsonProperty(JSON_PROPERTY_EMAIL_MESSAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEmailMessagesCount() {
    return emailMessagesCount;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_MESSAGES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailMessagesCount(Integer emailMessagesCount) {
    this.emailMessagesCount = emailMessagesCount;
  }


  public AdditionalPersonInfo activitiesCount(Integer activitiesCount) {
    
    this.activitiesCount = activitiesCount;
    return this;
  }

   /**
   * The count of activities related to the person
   * @return activitiesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of activities related to the person")
  @JsonProperty(JSON_PROPERTY_ACTIVITIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getActivitiesCount() {
    return activitiesCount;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVITIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivitiesCount(Integer activitiesCount) {
    this.activitiesCount = activitiesCount;
  }


  public AdditionalPersonInfo doneActivitiesCount(Integer doneActivitiesCount) {
    
    this.doneActivitiesCount = doneActivitiesCount;
    return this;
  }

   /**
   * The count of done activities related to the person
   * @return doneActivitiesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of done activities related to the person")
  @JsonProperty(JSON_PROPERTY_DONE_ACTIVITIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDoneActivitiesCount() {
    return doneActivitiesCount;
  }


  @JsonProperty(JSON_PROPERTY_DONE_ACTIVITIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoneActivitiesCount(Integer doneActivitiesCount) {
    this.doneActivitiesCount = doneActivitiesCount;
  }


  public AdditionalPersonInfo undoneActivitiesCount(Integer undoneActivitiesCount) {
    
    this.undoneActivitiesCount = undoneActivitiesCount;
    return this;
  }

   /**
   * The count of undone activities related to the person
   * @return undoneActivitiesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of undone activities related to the person")
  @JsonProperty(JSON_PROPERTY_UNDONE_ACTIVITIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUndoneActivitiesCount() {
    return undoneActivitiesCount;
  }


  @JsonProperty(JSON_PROPERTY_UNDONE_ACTIVITIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUndoneActivitiesCount(Integer undoneActivitiesCount) {
    this.undoneActivitiesCount = undoneActivitiesCount;
  }


  public AdditionalPersonInfo filesCount(Integer filesCount) {
    
    this.filesCount = filesCount;
    return this;
  }

   /**
   * The count of files related to the person
   * @return filesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of files related to the person")
  @JsonProperty(JSON_PROPERTY_FILES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFilesCount() {
    return filesCount;
  }


  @JsonProperty(JSON_PROPERTY_FILES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilesCount(Integer filesCount) {
    this.filesCount = filesCount;
  }


  public AdditionalPersonInfo notesCount(Integer notesCount) {
    
    this.notesCount = notesCount;
    return this;
  }

   /**
   * The count of notes related to the person
   * @return notesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of notes related to the person")
  @JsonProperty(JSON_PROPERTY_NOTES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNotesCount() {
    return notesCount;
  }


  @JsonProperty(JSON_PROPERTY_NOTES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotesCount(Integer notesCount) {
    this.notesCount = notesCount;
  }


  public AdditionalPersonInfo followersCount(Integer followersCount) {
    
    this.followersCount = followersCount;
    return this;
  }

   /**
   * The count of followers related to the person
   * @return followersCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of followers related to the person")
  @JsonProperty(JSON_PROPERTY_FOLLOWERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFollowersCount() {
    return followersCount;
  }


  @JsonProperty(JSON_PROPERTY_FOLLOWERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFollowersCount(Integer followersCount) {
    this.followersCount = followersCount;
  }


  public AdditionalPersonInfo lastIncomingMailTime(String lastIncomingMailTime) {
    
    this.lastIncomingMailTime = lastIncomingMailTime;
    return this;
  }

   /**
   * The date and time of the last incoming email associated with the person
   * @return lastIncomingMailTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time of the last incoming email associated with the person")
  @JsonProperty(JSON_PROPERTY_LAST_INCOMING_MAIL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastIncomingMailTime() {
    return lastIncomingMailTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_INCOMING_MAIL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastIncomingMailTime(String lastIncomingMailTime) {
    this.lastIncomingMailTime = lastIncomingMailTime;
  }


  public AdditionalPersonInfo lastOutgoingMailTime(String lastOutgoingMailTime) {
    
    this.lastOutgoingMailTime = lastOutgoingMailTime;
    return this;
  }

   /**
   * The date and time of the last outgoing email associated with the person
   * @return lastOutgoingMailTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time of the last outgoing email associated with the person")
  @JsonProperty(JSON_PROPERTY_LAST_OUTGOING_MAIL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastOutgoingMailTime() {
    return lastOutgoingMailTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_OUTGOING_MAIL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastOutgoingMailTime(String lastOutgoingMailTime) {
    this.lastOutgoingMailTime = lastOutgoingMailTime;
  }


  public AdditionalPersonInfo openDealsCount(Integer openDealsCount) {
    
    this.openDealsCount = openDealsCount;
    return this;
  }

   /**
   * The count of open deals related with the item
   * @return openDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of open deals related with the item")
  @JsonProperty(JSON_PROPERTY_OPEN_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpenDealsCount() {
    return openDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenDealsCount(Integer openDealsCount) {
    this.openDealsCount = openDealsCount;
  }


  public AdditionalPersonInfo relatedOpenDealsCount(Integer relatedOpenDealsCount) {
    
    this.relatedOpenDealsCount = relatedOpenDealsCount;
    return this;
  }

   /**
   * The count of related open deals related with the item
   * @return relatedOpenDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of related open deals related with the item")
  @JsonProperty(JSON_PROPERTY_RELATED_OPEN_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelatedOpenDealsCount() {
    return relatedOpenDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_OPEN_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedOpenDealsCount(Integer relatedOpenDealsCount) {
    this.relatedOpenDealsCount = relatedOpenDealsCount;
  }


  public AdditionalPersonInfo closedDealsCount(Integer closedDealsCount) {
    
    this.closedDealsCount = closedDealsCount;
    return this;
  }

   /**
   * The count of closed deals related with the item
   * @return closedDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of closed deals related with the item")
  @JsonProperty(JSON_PROPERTY_CLOSED_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getClosedDealsCount() {
    return closedDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_CLOSED_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClosedDealsCount(Integer closedDealsCount) {
    this.closedDealsCount = closedDealsCount;
  }


  public AdditionalPersonInfo relatedClosedDealsCount(Integer relatedClosedDealsCount) {
    
    this.relatedClosedDealsCount = relatedClosedDealsCount;
    return this;
  }

   /**
   * The count of related closed deals related with the item
   * @return relatedClosedDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of related closed deals related with the item")
  @JsonProperty(JSON_PROPERTY_RELATED_CLOSED_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelatedClosedDealsCount() {
    return relatedClosedDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_CLOSED_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedClosedDealsCount(Integer relatedClosedDealsCount) {
    this.relatedClosedDealsCount = relatedClosedDealsCount;
  }


  public AdditionalPersonInfo wonDealsCount(Integer wonDealsCount) {
    
    this.wonDealsCount = wonDealsCount;
    return this;
  }

   /**
   * The count of won deals related with the item
   * @return wonDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of won deals related with the item")
  @JsonProperty(JSON_PROPERTY_WON_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWonDealsCount() {
    return wonDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_WON_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWonDealsCount(Integer wonDealsCount) {
    this.wonDealsCount = wonDealsCount;
  }


  public AdditionalPersonInfo relatedWonDealsCount(Integer relatedWonDealsCount) {
    
    this.relatedWonDealsCount = relatedWonDealsCount;
    return this;
  }

   /**
   * The count of related won deals related with the item
   * @return relatedWonDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of related won deals related with the item")
  @JsonProperty(JSON_PROPERTY_RELATED_WON_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelatedWonDealsCount() {
    return relatedWonDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_WON_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedWonDealsCount(Integer relatedWonDealsCount) {
    this.relatedWonDealsCount = relatedWonDealsCount;
  }


  public AdditionalPersonInfo lostDealsCount(Integer lostDealsCount) {
    
    this.lostDealsCount = lostDealsCount;
    return this;
  }

   /**
   * The count of lost deals related with the item
   * @return lostDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of lost deals related with the item")
  @JsonProperty(JSON_PROPERTY_LOST_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLostDealsCount() {
    return lostDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_LOST_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLostDealsCount(Integer lostDealsCount) {
    this.lostDealsCount = lostDealsCount;
  }


  public AdditionalPersonInfo relatedLostDealsCount(Integer relatedLostDealsCount) {
    
    this.relatedLostDealsCount = relatedLostDealsCount;
    return this;
  }

   /**
   * The count of related lost deals related with the item
   * @return relatedLostDealsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of related lost deals related with the item")
  @JsonProperty(JSON_PROPERTY_RELATED_LOST_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelatedLostDealsCount() {
    return relatedLostDealsCount;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_LOST_DEALS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedLostDealsCount(Integer relatedLostDealsCount) {
    this.relatedLostDealsCount = relatedLostDealsCount;
  }


  public AdditionalPersonInfo nextActivityDate(String nextActivityDate) {
    
    this.nextActivityDate = nextActivityDate;
    return this;
  }

   /**
   * The date of the next activity associated with the deal
   * @return nextActivityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the next activity associated with the deal")
  @JsonProperty(JSON_PROPERTY_NEXT_ACTIVITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextActivityDate() {
    return nextActivityDate;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_ACTIVITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextActivityDate(String nextActivityDate) {
    this.nextActivityDate = nextActivityDate;
  }


  public AdditionalPersonInfo nextActivityTime(String nextActivityTime) {
    
    this.nextActivityTime = nextActivityTime;
    return this;
  }

   /**
   * The time of the next activity associated with the deal
   * @return nextActivityTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time of the next activity associated with the deal")
  @JsonProperty(JSON_PROPERTY_NEXT_ACTIVITY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextActivityTime() {
    return nextActivityTime;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_ACTIVITY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextActivityTime(String nextActivityTime) {
    this.nextActivityTime = nextActivityTime;
  }


  public AdditionalPersonInfo nextActivityId(Integer nextActivityId) {
    this.nextActivityId = JsonNullable.<Integer>of(nextActivityId);
    
    return this;
  }

   /**
   * The ID of the next activity associated with the deal
   * @return nextActivityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the next activity associated with the deal")
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


  public AdditionalPersonInfo lastActivityId(Integer lastActivityId) {
    this.lastActivityId = JsonNullable.<Integer>of(lastActivityId);
    
    return this;
  }

   /**
   * The ID of the last activity associated with the deal
   * @return lastActivityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the last activity associated with the deal")
  @JsonIgnore

  public Integer getLastActivityId() {
        return lastActivityId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getLastActivityId_JsonNullable() {
    return lastActivityId;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_ID)
  public void setLastActivityId_JsonNullable(JsonNullable<Integer> lastActivityId) {
    this.lastActivityId = lastActivityId;
  }

  public void setLastActivityId(Integer lastActivityId) {
    this.lastActivityId = JsonNullable.<Integer>of(lastActivityId);
  }


  public AdditionalPersonInfo lastActivityDate(String lastActivityDate) {
    this.lastActivityDate = JsonNullable.<String>of(lastActivityDate);
    
    return this;
  }

   /**
   * The date of the last activity associated with the deal
   * @return lastActivityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the last activity associated with the deal")
  @JsonIgnore

  public String getLastActivityDate() {
        return lastActivityDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastActivityDate_JsonNullable() {
    return lastActivityDate;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_ACTIVITY_DATE)
  public void setLastActivityDate_JsonNullable(JsonNullable<String> lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public void setLastActivityDate(String lastActivityDate) {
    this.lastActivityDate = JsonNullable.<String>of(lastActivityDate);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPersonInfo additionalPersonInfo = (AdditionalPersonInfo) o;
    return Objects.equals(this.ownerId, additionalPersonInfo.ownerId) &&
        Objects.equals(this.orgId, additionalPersonInfo.orgId) &&
        Objects.equals(this.name, additionalPersonInfo.name) &&
        Objects.equals(this.firstName, additionalPersonInfo.firstName) &&
        Objects.equals(this.lastName, additionalPersonInfo.lastName) &&
        Objects.equals(this.emailMessagesCount, additionalPersonInfo.emailMessagesCount) &&
        Objects.equals(this.activitiesCount, additionalPersonInfo.activitiesCount) &&
        Objects.equals(this.doneActivitiesCount, additionalPersonInfo.doneActivitiesCount) &&
        Objects.equals(this.undoneActivitiesCount, additionalPersonInfo.undoneActivitiesCount) &&
        Objects.equals(this.filesCount, additionalPersonInfo.filesCount) &&
        Objects.equals(this.notesCount, additionalPersonInfo.notesCount) &&
        Objects.equals(this.followersCount, additionalPersonInfo.followersCount) &&
        Objects.equals(this.lastIncomingMailTime, additionalPersonInfo.lastIncomingMailTime) &&
        Objects.equals(this.lastOutgoingMailTime, additionalPersonInfo.lastOutgoingMailTime) &&
        Objects.equals(this.openDealsCount, additionalPersonInfo.openDealsCount) &&
        Objects.equals(this.relatedOpenDealsCount, additionalPersonInfo.relatedOpenDealsCount) &&
        Objects.equals(this.closedDealsCount, additionalPersonInfo.closedDealsCount) &&
        Objects.equals(this.relatedClosedDealsCount, additionalPersonInfo.relatedClosedDealsCount) &&
        Objects.equals(this.wonDealsCount, additionalPersonInfo.wonDealsCount) &&
        Objects.equals(this.relatedWonDealsCount, additionalPersonInfo.relatedWonDealsCount) &&
        Objects.equals(this.lostDealsCount, additionalPersonInfo.lostDealsCount) &&
        Objects.equals(this.relatedLostDealsCount, additionalPersonInfo.relatedLostDealsCount) &&
        Objects.equals(this.nextActivityDate, additionalPersonInfo.nextActivityDate) &&
        Objects.equals(this.nextActivityTime, additionalPersonInfo.nextActivityTime) &&
        equalsNullable(this.nextActivityId, additionalPersonInfo.nextActivityId) &&
        equalsNullable(this.lastActivityId, additionalPersonInfo.lastActivityId) &&
        equalsNullable(this.lastActivityDate, additionalPersonInfo.lastActivityDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, orgId, name, firstName, lastName, emailMessagesCount, activitiesCount, doneActivitiesCount, undoneActivitiesCount, filesCount, notesCount, followersCount, lastIncomingMailTime, lastOutgoingMailTime, openDealsCount, relatedOpenDealsCount, closedDealsCount, relatedClosedDealsCount, wonDealsCount, relatedWonDealsCount, lostDealsCount, relatedLostDealsCount, nextActivityDate, nextActivityTime, hashCodeNullable(nextActivityId), hashCodeNullable(lastActivityId), hashCodeNullable(lastActivityDate));
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
    sb.append("class AdditionalPersonInfo {\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailMessagesCount: ").append(toIndentedString(emailMessagesCount)).append("\n");
    sb.append("    activitiesCount: ").append(toIndentedString(activitiesCount)).append("\n");
    sb.append("    doneActivitiesCount: ").append(toIndentedString(doneActivitiesCount)).append("\n");
    sb.append("    undoneActivitiesCount: ").append(toIndentedString(undoneActivitiesCount)).append("\n");
    sb.append("    filesCount: ").append(toIndentedString(filesCount)).append("\n");
    sb.append("    notesCount: ").append(toIndentedString(notesCount)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    lastIncomingMailTime: ").append(toIndentedString(lastIncomingMailTime)).append("\n");
    sb.append("    lastOutgoingMailTime: ").append(toIndentedString(lastOutgoingMailTime)).append("\n");
    sb.append("    openDealsCount: ").append(toIndentedString(openDealsCount)).append("\n");
    sb.append("    relatedOpenDealsCount: ").append(toIndentedString(relatedOpenDealsCount)).append("\n");
    sb.append("    closedDealsCount: ").append(toIndentedString(closedDealsCount)).append("\n");
    sb.append("    relatedClosedDealsCount: ").append(toIndentedString(relatedClosedDealsCount)).append("\n");
    sb.append("    wonDealsCount: ").append(toIndentedString(wonDealsCount)).append("\n");
    sb.append("    relatedWonDealsCount: ").append(toIndentedString(relatedWonDealsCount)).append("\n");
    sb.append("    lostDealsCount: ").append(toIndentedString(lostDealsCount)).append("\n");
    sb.append("    relatedLostDealsCount: ").append(toIndentedString(relatedLostDealsCount)).append("\n");
    sb.append("    nextActivityDate: ").append(toIndentedString(nextActivityDate)).append("\n");
    sb.append("    nextActivityTime: ").append(toIndentedString(nextActivityTime)).append("\n");
    sb.append("    nextActivityId: ").append(toIndentedString(nextActivityId)).append("\n");
    sb.append("    lastActivityId: ").append(toIndentedString(lastActivityId)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
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

