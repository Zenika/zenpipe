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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NoteRequest
 */
@JsonPropertyOrder({
  NoteRequest.JSON_PROPERTY_CONTENT,
  NoteRequest.JSON_PROPERTY_LEAD_ID,
  NoteRequest.JSON_PROPERTY_DEAL_ID,
  NoteRequest.JSON_PROPERTY_PERSON_ID,
  NoteRequest.JSON_PROPERTY_ORG_ID,
  NoteRequest.JSON_PROPERTY_USER_ID,
  NoteRequest.JSON_PROPERTY_ADD_TIME,
  NoteRequest.JSON_PROPERTY_PINNED_TO_LEAD_FLAG,
  NoteRequest.JSON_PROPERTY_PINNED_TO_DEAL_FLAG,
  NoteRequest.JSON_PROPERTY_PINNED_TO_ORGANIZATION_FLAG,
  NoteRequest.JSON_PROPERTY_PINNED_TO_PERSON_FLAG
})
@JsonTypeName("noteRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class NoteRequest {
  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_LEAD_ID = "lead_id";
  private UUID leadId;

  public static final String JSON_PROPERTY_DEAL_ID = "deal_id";
  private Integer dealId;

  public static final String JSON_PROPERTY_PERSON_ID = "person_id";
  private Integer personId;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Integer orgId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Integer userId;

  public static final String JSON_PROPERTY_ADD_TIME = "add_time";
  private String addTime;

  /**
   * Gets or Sets pinnedToLeadFlag
   */
  public enum PinnedToLeadFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    PinnedToLeadFlagEnum(BigDecimal value) {
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
    public static PinnedToLeadFlagEnum fromValue(BigDecimal value) {
      for (PinnedToLeadFlagEnum b : PinnedToLeadFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PINNED_TO_LEAD_FLAG = "pinned_to_lead_flag";
  private PinnedToLeadFlagEnum pinnedToLeadFlag;

  /**
   * Gets or Sets pinnedToDealFlag
   */
  public enum PinnedToDealFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    PinnedToDealFlagEnum(BigDecimal value) {
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
    public static PinnedToDealFlagEnum fromValue(BigDecimal value) {
      for (PinnedToDealFlagEnum b : PinnedToDealFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PINNED_TO_DEAL_FLAG = "pinned_to_deal_flag";
  private PinnedToDealFlagEnum pinnedToDealFlag;

  /**
   * Gets or Sets pinnedToOrganizationFlag
   */
  public enum PinnedToOrganizationFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    PinnedToOrganizationFlagEnum(BigDecimal value) {
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
    public static PinnedToOrganizationFlagEnum fromValue(BigDecimal value) {
      for (PinnedToOrganizationFlagEnum b : PinnedToOrganizationFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PINNED_TO_ORGANIZATION_FLAG = "pinned_to_organization_flag";
  private PinnedToOrganizationFlagEnum pinnedToOrganizationFlag;

  /**
   * Gets or Sets pinnedToPersonFlag
   */
  public enum PinnedToPersonFlagEnum {
    NUMBER_0(new BigDecimal("0")),
    
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    PinnedToPersonFlagEnum(BigDecimal value) {
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
    public static PinnedToPersonFlagEnum fromValue(BigDecimal value) {
      for (PinnedToPersonFlagEnum b : PinnedToPersonFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PINNED_TO_PERSON_FLAG = "pinned_to_person_flag";
  private PinnedToPersonFlagEnum pinnedToPersonFlag;

  public NoteRequest() {
  }

  public NoteRequest content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * The content of the note in HTML format. Subject to sanitization on the back-end.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content of the note in HTML format. Subject to sanitization on the back-end.")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public NoteRequest leadId(UUID leadId) {
    
    this.leadId = leadId;
    return this;
  }

   /**
   * The ID of the lead the note will be attached to
   * @return leadId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the lead the note will be attached to")
  @JsonProperty(JSON_PROPERTY_LEAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLeadId() {
    return leadId;
  }


  @JsonProperty(JSON_PROPERTY_LEAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeadId(UUID leadId) {
    this.leadId = leadId;
  }


  public NoteRequest dealId(Integer dealId) {
    
    this.dealId = dealId;
    return this;
  }

   /**
   * The ID of the deal the note will be attached to
   * @return dealId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the deal the note will be attached to")
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


  public NoteRequest personId(Integer personId) {
    
    this.personId = personId;
    return this;
  }

   /**
   * The ID of the person the note will be attached to
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the person the note will be attached to")
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


  public NoteRequest orgId(Integer orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * The ID of the organization the note will be attached to
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the organization the note will be attached to")
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


  public NoteRequest userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user who will be marked as the author of the note. Only an admin can change the author.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user who will be marked as the author of the note. Only an admin can change the author.")
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


  public NoteRequest addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * The optional creation date &amp; time of the note in UTC. Can be set in the past or in the future. Requires admin user API token. Format: YYYY-MM-DD HH:MM:SS
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The optional creation date & time of the note in UTC. Can be set in the past or in the future. Requires admin user API token. Format: YYYY-MM-DD HH:MM:SS")
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


  public NoteRequest pinnedToLeadFlag(PinnedToLeadFlagEnum pinnedToLeadFlag) {
    
    this.pinnedToLeadFlag = pinnedToLeadFlag;
    return this;
  }

   /**
   * Get pinnedToLeadFlag
   * @return pinnedToLeadFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PINNED_TO_LEAD_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PinnedToLeadFlagEnum getPinnedToLeadFlag() {
    return pinnedToLeadFlag;
  }


  @JsonProperty(JSON_PROPERTY_PINNED_TO_LEAD_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPinnedToLeadFlag(PinnedToLeadFlagEnum pinnedToLeadFlag) {
    this.pinnedToLeadFlag = pinnedToLeadFlag;
  }


  public NoteRequest pinnedToDealFlag(PinnedToDealFlagEnum pinnedToDealFlag) {
    
    this.pinnedToDealFlag = pinnedToDealFlag;
    return this;
  }

   /**
   * Get pinnedToDealFlag
   * @return pinnedToDealFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PINNED_TO_DEAL_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PinnedToDealFlagEnum getPinnedToDealFlag() {
    return pinnedToDealFlag;
  }


  @JsonProperty(JSON_PROPERTY_PINNED_TO_DEAL_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPinnedToDealFlag(PinnedToDealFlagEnum pinnedToDealFlag) {
    this.pinnedToDealFlag = pinnedToDealFlag;
  }


  public NoteRequest pinnedToOrganizationFlag(PinnedToOrganizationFlagEnum pinnedToOrganizationFlag) {
    
    this.pinnedToOrganizationFlag = pinnedToOrganizationFlag;
    return this;
  }

   /**
   * Get pinnedToOrganizationFlag
   * @return pinnedToOrganizationFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PINNED_TO_ORGANIZATION_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PinnedToOrganizationFlagEnum getPinnedToOrganizationFlag() {
    return pinnedToOrganizationFlag;
  }


  @JsonProperty(JSON_PROPERTY_PINNED_TO_ORGANIZATION_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPinnedToOrganizationFlag(PinnedToOrganizationFlagEnum pinnedToOrganizationFlag) {
    this.pinnedToOrganizationFlag = pinnedToOrganizationFlag;
  }


  public NoteRequest pinnedToPersonFlag(PinnedToPersonFlagEnum pinnedToPersonFlag) {
    
    this.pinnedToPersonFlag = pinnedToPersonFlag;
    return this;
  }

   /**
   * Get pinnedToPersonFlag
   * @return pinnedToPersonFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PINNED_TO_PERSON_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PinnedToPersonFlagEnum getPinnedToPersonFlag() {
    return pinnedToPersonFlag;
  }


  @JsonProperty(JSON_PROPERTY_PINNED_TO_PERSON_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPinnedToPersonFlag(PinnedToPersonFlagEnum pinnedToPersonFlag) {
    this.pinnedToPersonFlag = pinnedToPersonFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteRequest noteRequest = (NoteRequest) o;
    return Objects.equals(this.content, noteRequest.content) &&
        Objects.equals(this.leadId, noteRequest.leadId) &&
        Objects.equals(this.dealId, noteRequest.dealId) &&
        Objects.equals(this.personId, noteRequest.personId) &&
        Objects.equals(this.orgId, noteRequest.orgId) &&
        Objects.equals(this.userId, noteRequest.userId) &&
        Objects.equals(this.addTime, noteRequest.addTime) &&
        Objects.equals(this.pinnedToLeadFlag, noteRequest.pinnedToLeadFlag) &&
        Objects.equals(this.pinnedToDealFlag, noteRequest.pinnedToDealFlag) &&
        Objects.equals(this.pinnedToOrganizationFlag, noteRequest.pinnedToOrganizationFlag) &&
        Objects.equals(this.pinnedToPersonFlag, noteRequest.pinnedToPersonFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, leadId, dealId, personId, orgId, userId, addTime, pinnedToLeadFlag, pinnedToDealFlag, pinnedToOrganizationFlag, pinnedToPersonFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteRequest {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    pinnedToLeadFlag: ").append(toIndentedString(pinnedToLeadFlag)).append("\n");
    sb.append("    pinnedToDealFlag: ").append(toIndentedString(pinnedToDealFlag)).append("\n");
    sb.append("    pinnedToOrganizationFlag: ").append(toIndentedString(pinnedToOrganizationFlag)).append("\n");
    sb.append("    pinnedToPersonFlag: ").append(toIndentedString(pinnedToPersonFlag)).append("\n");
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

