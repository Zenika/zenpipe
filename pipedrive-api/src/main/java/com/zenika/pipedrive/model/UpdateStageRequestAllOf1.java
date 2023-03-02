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
 * UpdateStageRequestAllOf1
 */
@JsonPropertyOrder({
  UpdateStageRequestAllOf1.JSON_PROPERTY_ORDER_NR
})
@JsonTypeName("updateStageRequest_allOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class UpdateStageRequestAllOf1 {
  public static final String JSON_PROPERTY_ORDER_NR = "order_nr";
  private Integer orderNr;

  public UpdateStageRequestAllOf1() {
  }

  public UpdateStageRequestAllOf1 orderNr(Integer orderNr) {
    
    this.orderNr = orderNr;
    return this;
  }

   /**
   * An order number for this stage. Order numbers should be used to order the stages in the pipeline.
   * @return orderNr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An order number for this stage. Order numbers should be used to order the stages in the pipeline.")
  @JsonProperty(JSON_PROPERTY_ORDER_NR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrderNr() {
    return orderNr;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_NR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderNr(Integer orderNr) {
    this.orderNr = orderNr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStageRequestAllOf1 updateStageRequestAllOf1 = (UpdateStageRequestAllOf1) o;
    return Objects.equals(this.orderNr, updateStageRequestAllOf1.orderNr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStageRequestAllOf1 {\n");
    sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
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

