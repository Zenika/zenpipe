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
 * GetAddProductAttachementResponse200DataAllOfAllOf1
 */
@JsonPropertyOrder({
  GetAddProductAttachementResponse200DataAllOfAllOf1.JSON_PROPERTY_PRODUCT_ATTACHMENT_ID
})
@JsonTypeName("getAddProductAttachementResponse200_data_allOf_allOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetAddProductAttachementResponse200DataAllOfAllOf1 {
  public static final String JSON_PROPERTY_PRODUCT_ATTACHMENT_ID = "product_attachment_id";
  private Integer productAttachmentId;

  public GetAddProductAttachementResponse200DataAllOfAllOf1() {
  }

  public GetAddProductAttachementResponse200DataAllOfAllOf1 productAttachmentId(Integer productAttachmentId) {
    
    this.productAttachmentId = productAttachmentId;
    return this;
  }

   /**
   * The ID of the deal-product (the ID of the product attached to the deal)
   * @return productAttachmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the deal-product (the ID of the product attached to the deal)")
  @JsonProperty(JSON_PROPERTY_PRODUCT_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProductAttachmentId() {
    return productAttachmentId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductAttachmentId(Integer productAttachmentId) {
    this.productAttachmentId = productAttachmentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAddProductAttachementResponse200DataAllOfAllOf1 getAddProductAttachementResponse200DataAllOfAllOf1 = (GetAddProductAttachementResponse200DataAllOfAllOf1) o;
    return Objects.equals(this.productAttachmentId, getAddProductAttachementResponse200DataAllOfAllOf1.productAttachmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productAttachmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAddProductAttachementResponse200DataAllOfAllOf1 {\n");
    sb.append("    productAttachmentId: ").append(toIndentedString(productAttachmentId)).append("\n");
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

