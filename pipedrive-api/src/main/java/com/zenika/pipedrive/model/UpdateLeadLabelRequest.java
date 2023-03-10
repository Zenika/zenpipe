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
 * UpdateLeadLabelRequest
 */
@JsonPropertyOrder({
  UpdateLeadLabelRequest.JSON_PROPERTY_NAME,
  UpdateLeadLabelRequest.JSON_PROPERTY_COLOR
})
@JsonTypeName("updateLeadLabelRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class UpdateLeadLabelRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * The color of the label. Only a subset of colors can be used.
   */
  public enum ColorEnum {
    GREEN("green"),
    
    BLUE("blue"),
    
    RED("red"),
    
    YELLOW("yellow"),
    
    PURPLE("purple"),
    
    GRAY("gray");

    private String value;

    ColorEnum(String value) {
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
    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COLOR = "color";
  private ColorEnum color;

  public UpdateLeadLabelRequest() {
  }

  public UpdateLeadLabelRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the lead label
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the lead label")
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


  public UpdateLeadLabelRequest color(ColorEnum color) {
    
    this.color = color;
    return this;
  }

   /**
   * The color of the label. Only a subset of colors can be used.
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The color of the label. Only a subset of colors can be used.")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ColorEnum getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(ColorEnum color) {
    this.color = color;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLeadLabelRequest updateLeadLabelRequest = (UpdateLeadLabelRequest) o;
    return Objects.equals(this.name, updateLeadLabelRequest.name) &&
        Objects.equals(this.color, updateLeadLabelRequest.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLeadLabelRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

