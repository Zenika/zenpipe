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
import com.zenika.pipedrive.model.GetAllMailMessagesOfMailThreadResponse200AllOfDataInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetAllMailMessagesOfMailThreadResponse200
 */
@JsonPropertyOrder({
  GetAllMailMessagesOfMailThreadResponse200.JSON_PROPERTY_SUCCESS,
  GetAllMailMessagesOfMailThreadResponse200.JSON_PROPERTY_DATA
})
@JsonTypeName("getAllMailMessagesOfMailThreadResponse200")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetAllMailMessagesOfMailThreadResponse200 {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<GetAllMailMessagesOfMailThreadResponse200AllOfDataInner> data = null;

  public GetAllMailMessagesOfMailThreadResponse200() {
  }

  public GetAllMailMessagesOfMailThreadResponse200 success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * If the response is successful or not
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the response is successful or not")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public GetAllMailMessagesOfMailThreadResponse200 data(List<GetAllMailMessagesOfMailThreadResponse200AllOfDataInner> data) {
    
    this.data = data;
    return this;
  }

  public GetAllMailMessagesOfMailThreadResponse200 addDataItem(GetAllMailMessagesOfMailThreadResponse200AllOfDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The array of the mail messages of the mail thread
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The array of the mail messages of the mail thread")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetAllMailMessagesOfMailThreadResponse200AllOfDataInner> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<GetAllMailMessagesOfMailThreadResponse200AllOfDataInner> data) {
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
    GetAllMailMessagesOfMailThreadResponse200 getAllMailMessagesOfMailThreadResponse200 = (GetAllMailMessagesOfMailThreadResponse200) o;
    return Objects.equals(this.success, getAllMailMessagesOfMailThreadResponse200.success) &&
        Objects.equals(this.data, getAllMailMessagesOfMailThreadResponse200.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllMailMessagesOfMailThreadResponse200 {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

