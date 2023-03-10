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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddActivityRequestAllOf
 */
@JsonPropertyOrder({
  AddActivityRequestAllOf.JSON_PROPERTY_SUBJECT,
  AddActivityRequestAllOf.JSON_PROPERTY_TYPE,
  AddActivityRequestAllOf.JSON_PROPERTY_USER_ID,
  AddActivityRequestAllOf.JSON_PROPERTY_PARTICIPANTS,
  AddActivityRequestAllOf.JSON_PROPERTY_BUSY_FLAG,
  AddActivityRequestAllOf.JSON_PROPERTY_ATTENDEES,
  AddActivityRequestAllOf.JSON_PROPERTY_DONE
})
@JsonTypeName("addActivityRequest_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddActivityRequestAllOf {
  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Integer userId;

  public static final String JSON_PROPERTY_PARTICIPANTS = "participants";
  private List<Object> participants = null;

  /**
   * Set the activity as &#39;Busy&#39; or &#39;Free&#39;. If the flag is set to &#x60;true&#x60;, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset by never setting it or overriding it with &#x60;null&#x60;. When the value of the flag is unset (&#x60;null&#x60;), the flag defaults to &#39;Busy&#39; if it has a time set, and &#39;Free&#39; if it is an all-day event without specified time.
   */
  public enum BusyFlagEnum {
    TRUE(true),
    
    FALSE(false);

    private Boolean value;

    BusyFlagEnum(Boolean value) {
      this.value = value;
    }

    @JsonValue
    public Boolean getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BusyFlagEnum fromValue(Boolean value) {
      for (BusyFlagEnum b : BusyFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BUSY_FLAG = "busy_flag";
  private BusyFlagEnum busyFlag;

  public static final String JSON_PROPERTY_ATTENDEES = "attendees";
  private List<Object> attendees = null;

  /**
   * Gets or Sets done
   */
  public enum DoneEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    DoneEnum(BigDecimal value) {
      this.value = value;
    }

    @JsonValue
    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DoneEnum fromValue(BigDecimal value) {
      for (DoneEnum b : DoneEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DONE = "done";
  private DoneEnum done;

  public AddActivityRequestAllOf() {
  }

  public AddActivityRequestAllOf subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the activity. When value for subject is not set, it will be given a default value &#x60;Call&#x60;.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject of the activity. When value for subject is not set, it will be given a default value `Call`.")
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


  public AddActivityRequestAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the activity. This is in correlation with the &#x60;key_string&#x60; parameter of ActivityTypes. When value for type is not set, it will be given a default value &#x60;Call&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the activity. This is in correlation with the `key_string` parameter of ActivityTypes. When value for type is not set, it will be given a default value `Call`.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public AddActivityRequestAllOf userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user whom the activity is assigned to. If omitted, the activity is assigned to the authorized user.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user whom the activity is assigned to. If omitted, the activity is assigned to the authorized user.")
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


  public AddActivityRequestAllOf participants(List<Object> participants) {
    
    this.participants = participants;
    return this;
  }

  public AddActivityRequestAllOf addParticipantsItem(Object participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * List of multiple persons (participants) this activity is associated with. If omitted, single participant from &#x60;person_id&#x60; field is used. It requires a structure as follows: &#x60;[{\&quot;person_id\&quot;:1,\&quot;primary_flag\&quot;:true}]&#x60;
   * @return participants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of multiple persons (participants) this activity is associated with. If omitted, single participant from `person_id` field is used. It requires a structure as follows: `[{\"person_id\":1,\"primary_flag\":true}]`")
  @JsonProperty(JSON_PROPERTY_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getParticipants() {
    return participants;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipants(List<Object> participants) {
    this.participants = participants;
  }


  public AddActivityRequestAllOf busyFlag(BusyFlagEnum busyFlag) {
    
    this.busyFlag = busyFlag;
    return this;
  }

   /**
   * Set the activity as &#39;Busy&#39; or &#39;Free&#39;. If the flag is set to &#x60;true&#x60;, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset by never setting it or overriding it with &#x60;null&#x60;. When the value of the flag is unset (&#x60;null&#x60;), the flag defaults to &#39;Busy&#39; if it has a time set, and &#39;Free&#39; if it is an all-day event without specified time.
   * @return busyFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the activity as 'Busy' or 'Free'. If the flag is set to `true`, your customers will not be able to book that time slot through any Scheduler links. The flag can also be unset by never setting it or overriding it with `null`. When the value of the flag is unset (`null`), the flag defaults to 'Busy' if it has a time set, and 'Free' if it is an all-day event without specified time.")
  @JsonProperty(JSON_PROPERTY_BUSY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BusyFlagEnum getBusyFlag() {
    return busyFlag;
  }


  @JsonProperty(JSON_PROPERTY_BUSY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusyFlag(BusyFlagEnum busyFlag) {
    this.busyFlag = busyFlag;
  }


  public AddActivityRequestAllOf attendees(List<Object> attendees) {
    
    this.attendees = attendees;
    return this;
  }

  public AddActivityRequestAllOf addAttendeesItem(Object attendeesItem) {
    if (this.attendees == null) {
      this.attendees = new ArrayList<>();
    }
    this.attendees.add(attendeesItem);
    return this;
  }

   /**
   * The attendees of the activity. This can be either your existing Pipedrive contacts or an external email address. It requires a structure as follows: &#x60;[{\&quot;email_address\&quot;:\&quot;mail@example.org\&quot;}]&#x60; or &#x60;[{\&quot;person_id\&quot;:1, \&quot;email_address\&quot;:\&quot;mail@example.org\&quot;}]&#x60;
   * @return attendees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attendees of the activity. This can be either your existing Pipedrive contacts or an external email address. It requires a structure as follows: `[{\"email_address\":\"mail@example.org\"}]` or `[{\"person_id\":1, \"email_address\":\"mail@example.org\"}]`")
  @JsonProperty(JSON_PROPERTY_ATTENDEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getAttendees() {
    return attendees;
  }


  @JsonProperty(JSON_PROPERTY_ATTENDEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttendees(List<Object> attendees) {
    this.attendees = attendees;
  }


  public AddActivityRequestAllOf done(DoneEnum done) {
    
    this.done = done;
    return this;
  }

   /**
   * Get done
   * @return done
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DoneEnum getDone() {
    return done;
  }


  @JsonProperty(JSON_PROPERTY_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDone(DoneEnum done) {
    this.done = done;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddActivityRequestAllOf addActivityRequestAllOf = (AddActivityRequestAllOf) o;
    return Objects.equals(this.subject, addActivityRequestAllOf.subject) &&
        Objects.equals(this.type, addActivityRequestAllOf.type) &&
        Objects.equals(this.userId, addActivityRequestAllOf.userId) &&
        Objects.equals(this.participants, addActivityRequestAllOf.participants) &&
        Objects.equals(this.busyFlag, addActivityRequestAllOf.busyFlag) &&
        Objects.equals(this.attendees, addActivityRequestAllOf.attendees) &&
        Objects.equals(this.done, addActivityRequestAllOf.done);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, type, userId, participants, busyFlag, attendees, done);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddActivityRequestAllOf {\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    busyFlag: ").append(toIndentedString(busyFlag)).append("\n");
    sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
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

