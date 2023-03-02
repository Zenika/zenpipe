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
 * GetDealUpdatesResponse200AllOfDataInner
 */
@JsonPropertyOrder({
  GetDealUpdatesResponse200AllOfDataInner.JSON_PROPERTY_OBJECT,
  GetDealUpdatesResponse200AllOfDataInner.JSON_PROPERTY_TIMESTAMP,
  GetDealUpdatesResponse200AllOfDataInner.JSON_PROPERTY_DATA
})
@JsonTypeName("getDealUpdatesResponse200_allOf_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetDealUpdatesResponse200AllOfDataInner {
  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;

  public GetDealUpdatesResponse200AllOfDataInner() {
  }

  public GetDealUpdatesResponse200AllOfDataInner _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the deal update. (Possible object types - dealChange, note, activity, mailMessage, invoice, document, file)
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the deal update. (Possible object types - dealChange, note, activity, mailMessage, invoice, document, file)")
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(String _object) {
    this._object = _object;
  }


  public GetDealUpdatesResponse200AllOfDataInner timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The creation date and time of the update
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The creation date and time of the update")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public GetDealUpdatesResponse200AllOfDataInner data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * The data related to the update
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The data related to the update")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDealUpdatesResponse200AllOfDataInner getDealUpdatesResponse200AllOfDataInner = (GetDealUpdatesResponse200AllOfDataInner) o;
    return Objects.equals(this._object, getDealUpdatesResponse200AllOfDataInner._object) &&
        Objects.equals(this.timestamp, getDealUpdatesResponse200AllOfDataInner.timestamp) &&
        Objects.equals(this.data, getDealUpdatesResponse200AllOfDataInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, timestamp, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDealUpdatesResponse200AllOfDataInner {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

