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
 * OrganizationRelationship
 */
@JsonPropertyOrder({
  OrganizationRelationship.JSON_PROPERTY_ORG_ID,
  OrganizationRelationship.JSON_PROPERTY_TYPE,
  OrganizationRelationship.JSON_PROPERTY_REL_OWNER_ORG_ID,
  OrganizationRelationship.JSON_PROPERTY_REL_LINKED_ORG_ID
})
@JsonTypeName("organizationRelationship")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class OrganizationRelationship {
  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Integer orgId;

  /**
   * The type of organization relationship
   */
  public enum TypeEnum {
    PARENT("parent"),
    
    RELATED("related");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_REL_OWNER_ORG_ID = "rel_owner_org_id";
  private Integer relOwnerOrgId;

  public static final String JSON_PROPERTY_REL_LINKED_ORG_ID = "rel_linked_org_id";
  private Integer relLinkedOrgId;

  public OrganizationRelationship() {
  }

  public OrganizationRelationship orgId(Integer orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * The ID of the base organization for the returned calculated values
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the base organization for the returned calculated values")
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


  public OrganizationRelationship type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of organization relationship
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of organization relationship")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public OrganizationRelationship relOwnerOrgId(Integer relOwnerOrgId) {
    
    this.relOwnerOrgId = relOwnerOrgId;
    return this;
  }

   /**
   * The owner of this relationship. If type is &#x60;parent&#x60;, then the owner is the parent and the linked organization is the daughter.
   * @return relOwnerOrgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The owner of this relationship. If type is `parent`, then the owner is the parent and the linked organization is the daughter.")
  @JsonProperty(JSON_PROPERTY_REL_OWNER_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelOwnerOrgId() {
    return relOwnerOrgId;
  }


  @JsonProperty(JSON_PROPERTY_REL_OWNER_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelOwnerOrgId(Integer relOwnerOrgId) {
    this.relOwnerOrgId = relOwnerOrgId;
  }


  public OrganizationRelationship relLinkedOrgId(Integer relLinkedOrgId) {
    
    this.relLinkedOrgId = relLinkedOrgId;
    return this;
  }

   /**
   * The linked organization in this relationship. If type is &#x60;parent&#x60;, then the linked organization is the daughter.
   * @return relLinkedOrgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The linked organization in this relationship. If type is `parent`, then the linked organization is the daughter.")
  @JsonProperty(JSON_PROPERTY_REL_LINKED_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelLinkedOrgId() {
    return relLinkedOrgId;
  }


  @JsonProperty(JSON_PROPERTY_REL_LINKED_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelLinkedOrgId(Integer relLinkedOrgId) {
    this.relLinkedOrgId = relLinkedOrgId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationRelationship organizationRelationship = (OrganizationRelationship) o;
    return Objects.equals(this.orgId, organizationRelationship.orgId) &&
        Objects.equals(this.type, organizationRelationship.type) &&
        Objects.equals(this.relOwnerOrgId, organizationRelationship.relOwnerOrgId) &&
        Objects.equals(this.relLinkedOrgId, organizationRelationship.relLinkedOrgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, type, relOwnerOrgId, relLinkedOrgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationRelationship {\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    relOwnerOrgId: ").append(toIndentedString(relOwnerOrgId)).append("\n");
    sb.append("    relLinkedOrgId: ").append(toIndentedString(relLinkedOrgId)).append("\n");
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

