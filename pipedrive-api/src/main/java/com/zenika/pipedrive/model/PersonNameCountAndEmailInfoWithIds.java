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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PersonNameCountAndEmailInfoWithIds
 */
@JsonPropertyOrder({
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_OWNER_ID,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_ORG_ID,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_MERGE_WHAT_ID,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_NAME,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_FIRST_NAME,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_LAST_NAME,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_EMAIL_MESSAGES_COUNT,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_ACTIVITIES_COUNT,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_DONE_ACTIVITIES_COUNT,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_UNDONE_ACTIVITIES_COUNT,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_FILES_COUNT,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_NOTES_COUNT,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_FOLLOWERS_COUNT,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_LAST_INCOMING_MAIL_TIME,
  PersonNameCountAndEmailInfoWithIds.JSON_PROPERTY_LAST_OUTGOING_MAIL_TIME
})
@JsonTypeName("personNameCountAndEmailInfoWithIds")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class PersonNameCountAndEmailInfoWithIds {
  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private Integer ownerId;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Integer orgId;

  public static final String JSON_PROPERTY_MERGE_WHAT_ID = "merge_what_id";
  private Integer mergeWhatId;

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

  public PersonNameCountAndEmailInfoWithIds() {
  }

  public PersonNameCountAndEmailInfoWithIds ownerId(Integer ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The ID of the owner related to the person
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the owner related to the person")
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


  public PersonNameCountAndEmailInfoWithIds orgId(Integer orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * The ID of the organization related to the person
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the organization related to the person")
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


  public PersonNameCountAndEmailInfoWithIds mergeWhatId(Integer mergeWhatId) {
    
    this.mergeWhatId = mergeWhatId;
    return this;
  }

   /**
   * The ID of the person with what the main person was merged
   * @return mergeWhatId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the person with what the main person was merged")
  @JsonProperty(JSON_PROPERTY_MERGE_WHAT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMergeWhatId() {
    return mergeWhatId;
  }


  @JsonProperty(JSON_PROPERTY_MERGE_WHAT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMergeWhatId(Integer mergeWhatId) {
    this.mergeWhatId = mergeWhatId;
  }


  public PersonNameCountAndEmailInfoWithIds name(String name) {
    
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


  public PersonNameCountAndEmailInfoWithIds firstName(String firstName) {
    
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


  public PersonNameCountAndEmailInfoWithIds lastName(String lastName) {
    
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


  public PersonNameCountAndEmailInfoWithIds emailMessagesCount(Integer emailMessagesCount) {
    
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


  public PersonNameCountAndEmailInfoWithIds activitiesCount(Integer activitiesCount) {
    
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


  public PersonNameCountAndEmailInfoWithIds doneActivitiesCount(Integer doneActivitiesCount) {
    
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


  public PersonNameCountAndEmailInfoWithIds undoneActivitiesCount(Integer undoneActivitiesCount) {
    
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


  public PersonNameCountAndEmailInfoWithIds filesCount(Integer filesCount) {
    
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


  public PersonNameCountAndEmailInfoWithIds notesCount(Integer notesCount) {
    
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


  public PersonNameCountAndEmailInfoWithIds followersCount(Integer followersCount) {
    
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


  public PersonNameCountAndEmailInfoWithIds lastIncomingMailTime(String lastIncomingMailTime) {
    
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


  public PersonNameCountAndEmailInfoWithIds lastOutgoingMailTime(String lastOutgoingMailTime) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonNameCountAndEmailInfoWithIds personNameCountAndEmailInfoWithIds = (PersonNameCountAndEmailInfoWithIds) o;
    return Objects.equals(this.ownerId, personNameCountAndEmailInfoWithIds.ownerId) &&
        Objects.equals(this.orgId, personNameCountAndEmailInfoWithIds.orgId) &&
        Objects.equals(this.mergeWhatId, personNameCountAndEmailInfoWithIds.mergeWhatId) &&
        Objects.equals(this.name, personNameCountAndEmailInfoWithIds.name) &&
        Objects.equals(this.firstName, personNameCountAndEmailInfoWithIds.firstName) &&
        Objects.equals(this.lastName, personNameCountAndEmailInfoWithIds.lastName) &&
        Objects.equals(this.emailMessagesCount, personNameCountAndEmailInfoWithIds.emailMessagesCount) &&
        Objects.equals(this.activitiesCount, personNameCountAndEmailInfoWithIds.activitiesCount) &&
        Objects.equals(this.doneActivitiesCount, personNameCountAndEmailInfoWithIds.doneActivitiesCount) &&
        Objects.equals(this.undoneActivitiesCount, personNameCountAndEmailInfoWithIds.undoneActivitiesCount) &&
        Objects.equals(this.filesCount, personNameCountAndEmailInfoWithIds.filesCount) &&
        Objects.equals(this.notesCount, personNameCountAndEmailInfoWithIds.notesCount) &&
        Objects.equals(this.followersCount, personNameCountAndEmailInfoWithIds.followersCount) &&
        Objects.equals(this.lastIncomingMailTime, personNameCountAndEmailInfoWithIds.lastIncomingMailTime) &&
        Objects.equals(this.lastOutgoingMailTime, personNameCountAndEmailInfoWithIds.lastOutgoingMailTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, orgId, mergeWhatId, name, firstName, lastName, emailMessagesCount, activitiesCount, doneActivitiesCount, undoneActivitiesCount, filesCount, notesCount, followersCount, lastIncomingMailTime, lastOutgoingMailTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonNameCountAndEmailInfoWithIds {\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    mergeWhatId: ").append(toIndentedString(mergeWhatId)).append("\n");
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
