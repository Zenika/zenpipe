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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddNoteRequestAllOf
 */
@JsonPropertyOrder({
  AddNoteRequestAllOf.JSON_PROPERTY_CONTENT,
  AddNoteRequestAllOf.JSON_PROPERTY_LEAD_ID,
  AddNoteRequestAllOf.JSON_PROPERTY_DEAL_ID,
  AddNoteRequestAllOf.JSON_PROPERTY_PERSON_ID,
  AddNoteRequestAllOf.JSON_PROPERTY_ORG_ID
})
@JsonTypeName("addNote_request_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddNoteRequestAllOf {
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

  public AddNoteRequestAllOf() {
  }

  public AddNoteRequestAllOf content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * The content of the note in HTML format. Subject to sanitization on the back-end.
   * @return content
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The content of the note in HTML format. Subject to sanitization on the back-end.")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(String content) {
    this.content = content;
  }


  public AddNoteRequestAllOf leadId(UUID leadId) {
    
    this.leadId = leadId;
    return this;
  }

   /**
   * The ID of the lead the note will be attached to. This property is required unless one of (&#x60;deal_id/person_id/org_id&#x60;) is specified.
   * @return leadId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the lead the note will be attached to. This property is required unless one of (`deal_id/person_id/org_id`) is specified.")
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


  public AddNoteRequestAllOf dealId(Integer dealId) {
    
    this.dealId = dealId;
    return this;
  }

   /**
   * The ID of the deal the note will be attached to. This property is required unless one of (&#x60;lead_id/person_id/org_id&#x60;) is specified.
   * @return dealId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the deal the note will be attached to. This property is required unless one of (`lead_id/person_id/org_id`) is specified.")
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


  public AddNoteRequestAllOf personId(Integer personId) {
    
    this.personId = personId;
    return this;
  }

   /**
   * The ID of the person this note will be attached to. This property is required unless one of (&#x60;deal_id/lead_id/org_id&#x60;) is specified.
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the person this note will be attached to. This property is required unless one of (`deal_id/lead_id/org_id`) is specified.")
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


  public AddNoteRequestAllOf orgId(Integer orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * The ID of the organization this note will be attached to. This property is required unless one of (&#x60;deal_id/lead_id/person_id&#x60;) is specified.
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the organization this note will be attached to. This property is required unless one of (`deal_id/lead_id/person_id`) is specified.")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddNoteRequestAllOf addNoteRequestAllOf = (AddNoteRequestAllOf) o;
    return Objects.equals(this.content, addNoteRequestAllOf.content) &&
        Objects.equals(this.leadId, addNoteRequestAllOf.leadId) &&
        Objects.equals(this.dealId, addNoteRequestAllOf.dealId) &&
        Objects.equals(this.personId, addNoteRequestAllOf.personId) &&
        Objects.equals(this.orgId, addNoteRequestAllOf.orgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, leadId, dealId, personId, orgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddNoteRequestAllOf {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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

