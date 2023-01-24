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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddCallLogResponse200AllOfData
 */
@JsonPropertyOrder({
  AddCallLogResponse200AllOfData.JSON_PROPERTY_USER_ID,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_ACTIVITY_ID,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_SUBJECT,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_DURATION,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_OUTCOME,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_FROM_PHONE_NUMBER,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_TO_PHONE_NUMBER,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_START_TIME,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_END_TIME,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_PERSON_ID,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_ORG_ID,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_DEAL_ID,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_NOTE,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_ID,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_HAS_RECORDING,
  AddCallLogResponse200AllOfData.JSON_PROPERTY_COMPANY_ID
})
@JsonTypeName("addCallLogResponse200_allOf_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddCallLogResponse200AllOfData {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Integer userId;

  public static final String JSON_PROPERTY_ACTIVITY_ID = "activity_id";
  private Integer activityId;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private String duration;

  /**
   * Describes the outcome of the call
   */
  public enum OutcomeEnum {
    CONNECTED("connected"),
    
    NO_ANSWER("no_answer"),
    
    LEFT_MESSAGE("left_message"),
    
    LEFT_VOICEMAIL("left_voicemail"),
    
    WRONG_NUMBER("wrong_number"),
    
    BUSY("busy");

    private String value;

    OutcomeEnum(String value) {
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
    public static OutcomeEnum fromValue(String value) {
      for (OutcomeEnum b : OutcomeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private OutcomeEnum outcome;

  public static final String JSON_PROPERTY_FROM_PHONE_NUMBER = "from_phone_number";
  private String fromPhoneNumber;

  public static final String JSON_PROPERTY_TO_PHONE_NUMBER = "to_phone_number";
  private String toPhoneNumber;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private OffsetDateTime endTime;

  public static final String JSON_PROPERTY_PERSON_ID = "person_id";
  private Integer personId;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Integer orgId;

  public static final String JSON_PROPERTY_DEAL_ID = "deal_id";
  private Integer dealId;

  public static final String JSON_PROPERTY_NOTE = "note";
  private String note;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_HAS_RECORDING = "has_recording";
  private Boolean hasRecording;

  public static final String JSON_PROPERTY_COMPANY_ID = "company_id";
  private Integer companyId;

  public AddCallLogResponse200AllOfData() {
  }

  public AddCallLogResponse200AllOfData userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the owner of the call log. Please note that a user without account settings access cannot create call logs for other users.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the owner of the call log. Please note that a user without account settings access cannot create call logs for other users.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public AddCallLogResponse200AllOfData activityId(Integer activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * If specified, this activity will be converted into a call log, with the information provided. When this field is used, you don&#39;t need to specify &#x60;deal_id&#x60;, &#x60;person_id&#x60; or &#x60;org_id&#x60;, as they will be ignored in favor of the values already available in the activity.
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, this activity will be converted into a call log, with the information provided. When this field is used, you don't need to specify `deal_id`, `person_id` or `org_id`, as they will be ignored in favor of the values already available in the activity.")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getActivityId() {
    return activityId;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivityId(Integer activityId) {
    this.activityId = activityId;
  }


  public AddCallLogResponse200AllOfData subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The name of the activity this call is attached to
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the activity this call is attached to")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public AddCallLogResponse200AllOfData duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the call in seconds
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The duration of the call in seconds")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(String duration) {
    this.duration = duration;
  }


  public AddCallLogResponse200AllOfData outcome(OutcomeEnum outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * Describes the outcome of the call
   * @return outcome
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Describes the outcome of the call")
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OutcomeEnum getOutcome() {
    return outcome;
  }


  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOutcome(OutcomeEnum outcome) {
    this.outcome = outcome;
  }


  public AddCallLogResponse200AllOfData fromPhoneNumber(String fromPhoneNumber) {
    
    this.fromPhoneNumber = fromPhoneNumber;
    return this;
  }

   /**
   * The number that made the call
   * @return fromPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number that made the call")
  @JsonProperty(JSON_PROPERTY_FROM_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromPhoneNumber() {
    return fromPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_FROM_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromPhoneNumber(String fromPhoneNumber) {
    this.fromPhoneNumber = fromPhoneNumber;
  }


  public AddCallLogResponse200AllOfData toPhoneNumber(String toPhoneNumber) {
    
    this.toPhoneNumber = toPhoneNumber;
    return this;
  }

   /**
   * The number called
   * @return toPhoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number called")
  @JsonProperty(JSON_PROPERTY_TO_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToPhoneNumber() {
    return toPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_TO_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToPhoneNumber(String toPhoneNumber) {
    this.toPhoneNumber = toPhoneNumber;
  }


  public AddCallLogResponse200AllOfData startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The date and time of the start of the call in UTC. Format: YYYY-MM-DD HH:MM:SS.
   * @return startTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date and time of the start of the call in UTC. Format: YYYY-MM-DD HH:MM:SS.")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public AddCallLogResponse200AllOfData endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The date and time of the end of the call in UTC. Format: YYYY-MM-DD HH:MM:SS.
   * @return endTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date and time of the end of the call in UTC. Format: YYYY-MM-DD HH:MM:SS.")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public AddCallLogResponse200AllOfData personId(Integer personId) {
    
    this.personId = personId;
    return this;
  }

   /**
   * The ID of the person this call is associated with
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the person this call is associated with")
  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPersonId() {
    return personId;
  }


  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonId(Integer personId) {
    this.personId = personId;
  }


  public AddCallLogResponse200AllOfData orgId(Integer orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * The ID of the organization this call is associated with
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the organization this call is associated with")
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


  public AddCallLogResponse200AllOfData dealId(Integer dealId) {
    
    this.dealId = dealId;
    return this;
  }

   /**
   * The ID of the deal this call is associated with
   * @return dealId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the deal this call is associated with")
  @JsonProperty(JSON_PROPERTY_DEAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDealId() {
    return dealId;
  }


  @JsonProperty(JSON_PROPERTY_DEAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDealId(Integer dealId) {
    this.dealId = dealId;
  }


  public AddCallLogResponse200AllOfData note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * The note for the call log in HTML format
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The note for the call log in HTML format")
  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNote() {
    return note;
  }


  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNote(String note) {
    this.note = note;
  }


  public AddCallLogResponse200AllOfData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The call log ID, generated when the call log was created
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The call log ID, generated when the call log was created")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public AddCallLogResponse200AllOfData hasRecording(Boolean hasRecording) {
    
    this.hasRecording = hasRecording;
    return this;
  }

   /**
   * If the call log has an audio recording attached, the value should be true
   * @return hasRecording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the call log has an audio recording attached, the value should be true")
  @JsonProperty(JSON_PROPERTY_HAS_RECORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasRecording() {
    return hasRecording;
  }


  @JsonProperty(JSON_PROPERTY_HAS_RECORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasRecording(Boolean hasRecording) {
    this.hasRecording = hasRecording;
  }


  public AddCallLogResponse200AllOfData companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * The company ID of the owner of the call log
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The company ID of the owner of the call log")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCallLogResponse200AllOfData addCallLogResponse200AllOfData = (AddCallLogResponse200AllOfData) o;
    return Objects.equals(this.userId, addCallLogResponse200AllOfData.userId) &&
        Objects.equals(this.activityId, addCallLogResponse200AllOfData.activityId) &&
        Objects.equals(this.subject, addCallLogResponse200AllOfData.subject) &&
        Objects.equals(this.duration, addCallLogResponse200AllOfData.duration) &&
        Objects.equals(this.outcome, addCallLogResponse200AllOfData.outcome) &&
        Objects.equals(this.fromPhoneNumber, addCallLogResponse200AllOfData.fromPhoneNumber) &&
        Objects.equals(this.toPhoneNumber, addCallLogResponse200AllOfData.toPhoneNumber) &&
        Objects.equals(this.startTime, addCallLogResponse200AllOfData.startTime) &&
        Objects.equals(this.endTime, addCallLogResponse200AllOfData.endTime) &&
        Objects.equals(this.personId, addCallLogResponse200AllOfData.personId) &&
        Objects.equals(this.orgId, addCallLogResponse200AllOfData.orgId) &&
        Objects.equals(this.dealId, addCallLogResponse200AllOfData.dealId) &&
        Objects.equals(this.note, addCallLogResponse200AllOfData.note) &&
        Objects.equals(this.id, addCallLogResponse200AllOfData.id) &&
        Objects.equals(this.hasRecording, addCallLogResponse200AllOfData.hasRecording) &&
        Objects.equals(this.companyId, addCallLogResponse200AllOfData.companyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, activityId, subject, duration, outcome, fromPhoneNumber, toPhoneNumber, startTime, endTime, personId, orgId, dealId, note, id, hasRecording, companyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCallLogResponse200AllOfData {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    fromPhoneNumber: ").append(toIndentedString(fromPhoneNumber)).append("\n");
    sb.append("    toPhoneNumber: ").append(toIndentedString(toPhoneNumber)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hasRecording: ").append(toIndentedString(hasRecording)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
