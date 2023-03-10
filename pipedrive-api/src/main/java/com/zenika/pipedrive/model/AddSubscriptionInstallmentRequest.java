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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddSubscriptionInstallmentRequest
 */
@JsonPropertyOrder({
  AddSubscriptionInstallmentRequest.JSON_PROPERTY_DEAL_ID,
  AddSubscriptionInstallmentRequest.JSON_PROPERTY_CURRENCY,
  AddSubscriptionInstallmentRequest.JSON_PROPERTY_PAYMENTS,
  AddSubscriptionInstallmentRequest.JSON_PROPERTY_UPDATE_DEAL_VALUE
})
@JsonTypeName("addSubscriptionInstallmentRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddSubscriptionInstallmentRequest {
  public static final String JSON_PROPERTY_DEAL_ID = "deal_id";
  private Integer dealId;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PAYMENTS = "payments";
  private List<Object> payments = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATE_DEAL_VALUE = "update_deal_value";
  private Boolean updateDealValue;

  public AddSubscriptionInstallmentRequest() {
  }

  public AddSubscriptionInstallmentRequest dealId(Integer dealId) {
    
    this.dealId = dealId;
    return this;
  }

   /**
   * The ID of the deal this installment subscription is associated with
   * @return dealId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the deal this installment subscription is associated with")
  @JsonProperty(JSON_PROPERTY_DEAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDealId() {
    return dealId;
  }


  @JsonProperty(JSON_PROPERTY_DEAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDealId(Integer dealId) {
    this.dealId = dealId;
  }


  public AddSubscriptionInstallmentRequest currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the installment subscription. Accepts a 3-character currency code.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The currency of the installment subscription. Accepts a 3-character currency code.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public AddSubscriptionInstallmentRequest payments(List<Object> payments) {
    
    this.payments = payments;
    return this;
  }

  public AddSubscriptionInstallmentRequest addPaymentsItem(Object paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Array of payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).
   * @return payments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of payments. It requires a minimum structure as follows: [{ amount:SUM, description:DESCRIPTION, due_at:PAYMENT_DATE }]. Replace SUM with a payment amount, DESCRIPTION with an explanation string, PAYMENT_DATE with a date (format YYYY-MM-DD).")
  @JsonProperty(JSON_PROPERTY_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getPayments() {
    return payments;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayments(List<Object> payments) {
    this.payments = payments;
  }


  public AddSubscriptionInstallmentRequest updateDealValue(Boolean updateDealValue) {
    
    this.updateDealValue = updateDealValue;
    return this;
  }

   /**
   * Indicates that the deal value must be set to the installment subscription&#39;s total value
   * @return updateDealValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the deal value must be set to the installment subscription's total value")
  @JsonProperty(JSON_PROPERTY_UPDATE_DEAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpdateDealValue() {
    return updateDealValue;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_DEAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateDealValue(Boolean updateDealValue) {
    this.updateDealValue = updateDealValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSubscriptionInstallmentRequest addSubscriptionInstallmentRequest = (AddSubscriptionInstallmentRequest) o;
    return Objects.equals(this.dealId, addSubscriptionInstallmentRequest.dealId) &&
        Objects.equals(this.currency, addSubscriptionInstallmentRequest.currency) &&
        Objects.equals(this.payments, addSubscriptionInstallmentRequest.payments) &&
        Objects.equals(this.updateDealValue, addSubscriptionInstallmentRequest.updateDealValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealId, currency, payments, updateDealValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSubscriptionInstallmentRequest {\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    updateDealValue: ").append(toIndentedString(updateDealValue)).append("\n");
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

