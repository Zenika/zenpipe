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
 * MailMessageResponse200AllOf
 */
@JsonPropertyOrder({
  MailMessageResponse200AllOf.JSON_PROPERTY_SUCCESS,
  MailMessageResponse200AllOf.JSON_PROPERTY_STATUS_CODE,
  MailMessageResponse200AllOf.JSON_PROPERTY_STATUS_TEXT,
  MailMessageResponse200AllOf.JSON_PROPERTY_SERVICE
})
@JsonTypeName("mailMessageResponse200_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class MailMessageResponse200AllOf {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Integer statusCode;

  public static final String JSON_PROPERTY_STATUS_TEXT = "statusText";
  private String statusText;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public MailMessageResponse200AllOf() {
  }

  public MailMessageResponse200AllOf success(Boolean success) {
    
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


  public MailMessageResponse200AllOf statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * The email service specific status code and it is returned through the response body.
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email service specific status code and it is returned through the response body.")
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatusCode() {
    return statusCode;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public MailMessageResponse200AllOf statusText(String statusText) {
    
    this.statusText = statusText;
    return this;
  }

   /**
   * The status text of the response.
   * @return statusText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status text of the response.")
  @JsonProperty(JSON_PROPERTY_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusText() {
    return statusText;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }


  public MailMessageResponse200AllOf service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * The service name of the response.
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The service name of the response.")
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getService() {
    return service;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(String service) {
    this.service = service;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailMessageResponse200AllOf mailMessageResponse200AllOf = (MailMessageResponse200AllOf) o;
    return Objects.equals(this.success, mailMessageResponse200AllOf.success) &&
        Objects.equals(this.statusCode, mailMessageResponse200AllOf.statusCode) &&
        Objects.equals(this.statusText, mailMessageResponse200AllOf.statusText) &&
        Objects.equals(this.service, mailMessageResponse200AllOf.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, statusCode, statusText, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailMessageResponse200AllOf {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

