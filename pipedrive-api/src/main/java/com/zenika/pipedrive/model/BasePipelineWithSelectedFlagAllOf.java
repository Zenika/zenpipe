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
 * BasePipelineWithSelectedFlagAllOf
 */
@JsonPropertyOrder({
  BasePipelineWithSelectedFlagAllOf.JSON_PROPERTY_SELECTED
})
@JsonTypeName("basePipelineWithSelectedFlag_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class BasePipelineWithSelectedFlagAllOf {
  public static final String JSON_PROPERTY_SELECTED = "selected";
  private Boolean selected;

  public BasePipelineWithSelectedFlagAllOf() {
  }

  public BasePipelineWithSelectedFlagAllOf selected(Boolean selected) {
    
    this.selected = selected;
    return this;
  }

   /**
   * A boolean that shows if the pipeline is selected from a filter or not
   * @return selected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean that shows if the pipeline is selected from a filter or not")
  @JsonProperty(JSON_PROPERTY_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSelected() {
    return selected;
  }


  @JsonProperty(JSON_PROPERTY_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasePipelineWithSelectedFlagAllOf basePipelineWithSelectedFlagAllOf = (BasePipelineWithSelectedFlagAllOf) o;
    return Objects.equals(this.selected, basePipelineWithSelectedFlagAllOf.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasePipelineWithSelectedFlagAllOf {\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

