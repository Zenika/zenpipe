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
 * PersonCountAndEmailInfo
 */
@JsonPropertyOrder({
  PersonCountAndEmailInfo.JSON_PROPERTY_EMAIL_MESSAGES_COUNT,
  PersonCountAndEmailInfo.JSON_PROPERTY_ACTIVITIES_COUNT,
  PersonCountAndEmailInfo.JSON_PROPERTY_DONE_ACTIVITIES_COUNT,
  PersonCountAndEmailInfo.JSON_PROPERTY_UNDONE_ACTIVITIES_COUNT,
  PersonCountAndEmailInfo.JSON_PROPERTY_FILES_COUNT,
  PersonCountAndEmailInfo.JSON_PROPERTY_NOTES_COUNT,
  PersonCountAndEmailInfo.JSON_PROPERTY_FOLLOWERS_COUNT,
  PersonCountAndEmailInfo.JSON_PROPERTY_LAST_INCOMING_MAIL_TIME,
  PersonCountAndEmailInfo.JSON_PROPERTY_LAST_OUTGOING_MAIL_TIME
})
@JsonTypeName("personCountAndEmailInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class PersonCountAndEmailInfo {
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

  public PersonCountAndEmailInfo() {
  }

  public PersonCountAndEmailInfo emailMessagesCount(Integer emailMessagesCount) {
    
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


  public PersonCountAndEmailInfo activitiesCount(Integer activitiesCount) {
    
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


  public PersonCountAndEmailInfo doneActivitiesCount(Integer doneActivitiesCount) {
    
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


  public PersonCountAndEmailInfo undoneActivitiesCount(Integer undoneActivitiesCount) {
    
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


  public PersonCountAndEmailInfo filesCount(Integer filesCount) {
    
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


  public PersonCountAndEmailInfo notesCount(Integer notesCount) {
    
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


  public PersonCountAndEmailInfo followersCount(Integer followersCount) {
    
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


  public PersonCountAndEmailInfo lastIncomingMailTime(String lastIncomingMailTime) {
    
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


  public PersonCountAndEmailInfo lastOutgoingMailTime(String lastOutgoingMailTime) {
    
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
    PersonCountAndEmailInfo personCountAndEmailInfo = (PersonCountAndEmailInfo) o;
    return Objects.equals(this.emailMessagesCount, personCountAndEmailInfo.emailMessagesCount) &&
        Objects.equals(this.activitiesCount, personCountAndEmailInfo.activitiesCount) &&
        Objects.equals(this.doneActivitiesCount, personCountAndEmailInfo.doneActivitiesCount) &&
        Objects.equals(this.undoneActivitiesCount, personCountAndEmailInfo.undoneActivitiesCount) &&
        Objects.equals(this.filesCount, personCountAndEmailInfo.filesCount) &&
        Objects.equals(this.notesCount, personCountAndEmailInfo.notesCount) &&
        Objects.equals(this.followersCount, personCountAndEmailInfo.followersCount) &&
        Objects.equals(this.lastIncomingMailTime, personCountAndEmailInfo.lastIncomingMailTime) &&
        Objects.equals(this.lastOutgoingMailTime, personCountAndEmailInfo.lastOutgoingMailTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailMessagesCount, activitiesCount, doneActivitiesCount, undoneActivitiesCount, filesCount, notesCount, followersCount, lastIncomingMailTime, lastOutgoingMailTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonCountAndEmailInfo {\n");
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

