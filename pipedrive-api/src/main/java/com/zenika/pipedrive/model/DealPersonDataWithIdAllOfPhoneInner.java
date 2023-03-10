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
 * DealPersonDataWithIdAllOfPhoneInner
 */
@JsonPropertyOrder({
  DealPersonDataWithIdAllOfPhoneInner.JSON_PROPERTY_LABEL,
  DealPersonDataWithIdAllOfPhoneInner.JSON_PROPERTY_VALUE,
  DealPersonDataWithIdAllOfPhoneInner.JSON_PROPERTY_PRIMARY
})
@JsonTypeName("dealPersonDataWithId_allOf_phone_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class DealPersonDataWithIdAllOfPhoneInner {
  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary;

  public DealPersonDataWithIdAllOfPhoneInner() {
  }

  public DealPersonDataWithIdAllOfPhoneInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The type of the phone number
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the phone number")
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


  public DealPersonDataWithIdAllOfPhoneInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The phone number of the person associated with the deal
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number of the person associated with the deal")
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


  public DealPersonDataWithIdAllOfPhoneInner primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * If this is the primary phone number or not
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this is the primary phone number or not")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealPersonDataWithIdAllOfPhoneInner dealPersonDataWithIdAllOfPhoneInner = (DealPersonDataWithIdAllOfPhoneInner) o;
    return Objects.equals(this.label, dealPersonDataWithIdAllOfPhoneInner.label) &&
        Objects.equals(this.value, dealPersonDataWithIdAllOfPhoneInner.value) &&
        Objects.equals(this.primary, dealPersonDataWithIdAllOfPhoneInner.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealPersonDataWithIdAllOfPhoneInner {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

