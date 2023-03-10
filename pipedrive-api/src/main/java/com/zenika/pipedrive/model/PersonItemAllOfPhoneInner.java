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
 * PersonItemAllOfPhoneInner
 */
@JsonPropertyOrder({
  PersonItemAllOfPhoneInner.JSON_PROPERTY_VALUE,
  PersonItemAllOfPhoneInner.JSON_PROPERTY_PRIMARY,
  PersonItemAllOfPhoneInner.JSON_PROPERTY_LABEL
})
@JsonTypeName("personItem_allOf_phone_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class PersonItemAllOfPhoneInner {
  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public PersonItemAllOfPhoneInner() {
  }

  public PersonItemAllOfPhoneInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The phone number
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public PersonItemAllOfPhoneInner primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * Boolean that indicates if phone number is primary for the person or not
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean that indicates if phone number is primary for the person or not")
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public PersonItemAllOfPhoneInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The label that indicates the type of the phone number. (Possible values - work, home, mobile or other)
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The label that indicates the type of the phone number. (Possible values - work, home, mobile or other)")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonItemAllOfPhoneInner personItemAllOfPhoneInner = (PersonItemAllOfPhoneInner) o;
    return Objects.equals(this.value, personItemAllOfPhoneInner.value) &&
        Objects.equals(this.primary, personItemAllOfPhoneInner.primary) &&
        Objects.equals(this.label, personItemAllOfPhoneInner.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, primary, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonItemAllOfPhoneInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

