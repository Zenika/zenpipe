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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GetUserSettingsResponse200AllOfData
 */
@JsonPropertyOrder({
  GetUserSettingsResponse200AllOfData.JSON_PROPERTY_MARKETPLACE_ALLOW_CUSTOM_INSTALL_URL,
  GetUserSettingsResponse200AllOfData.JSON_PROPERTY_MARKETPLACE_APP_EXTENSIONS_VENDOR,
  GetUserSettingsResponse200AllOfData.JSON_PROPERTY_MARKETPLACE_TEAM,
  GetUserSettingsResponse200AllOfData.JSON_PROPERTY_LIST_LIMIT,
  GetUserSettingsResponse200AllOfData.JSON_PROPERTY_BETA_APP,
  GetUserSettingsResponse200AllOfData.JSON_PROPERTY_PREVENT_SALESPHONE_CALLTO_OVERRIDE,
  GetUserSettingsResponse200AllOfData.JSON_PROPERTY_FILE_UPLOAD_DESTINATION,
  GetUserSettingsResponse200AllOfData.JSON_PROPERTY_CALLTO_LINK_SYNTAX,
  GetUserSettingsResponse200AllOfData.JSON_PROPERTY_AUTOFILL_DEAL_EXPECTED_CLOSE_DATE,
  GetUserSettingsResponse200AllOfData.JSON_PROPERTY_PERSON_DUPLICATE_CONDITION
})
@JsonTypeName("getUserSettingsResponse200_allOf_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class GetUserSettingsResponse200AllOfData {
  public static final String JSON_PROPERTY_MARKETPLACE_ALLOW_CUSTOM_INSTALL_URL = "marketplace_allow_custom_install_url";
  private Boolean marketplaceAllowCustomInstallUrl;

  public static final String JSON_PROPERTY_MARKETPLACE_APP_EXTENSIONS_VENDOR = "marketplace_app_extensions_vendor";
  private Boolean marketplaceAppExtensionsVendor;

  public static final String JSON_PROPERTY_MARKETPLACE_TEAM = "marketplace_team";
  private Boolean marketplaceTeam;

  public static final String JSON_PROPERTY_LIST_LIMIT = "list_limit";
  private BigDecimal listLimit;

  public static final String JSON_PROPERTY_BETA_APP = "beta_app";
  private Boolean betaApp;

  public static final String JSON_PROPERTY_PREVENT_SALESPHONE_CALLTO_OVERRIDE = "prevent_salesphone_callto_override";
  private Boolean preventSalesphoneCalltoOverride;

  public static final String JSON_PROPERTY_FILE_UPLOAD_DESTINATION = "file_upload_destination";
  private String fileUploadDestination;

  public static final String JSON_PROPERTY_CALLTO_LINK_SYNTAX = "callto_link_syntax";
  private String calltoLinkSyntax;

  public static final String JSON_PROPERTY_AUTOFILL_DEAL_EXPECTED_CLOSE_DATE = "autofill_deal_expected_close_date";
  private Boolean autofillDealExpectedCloseDate;

  public static final String JSON_PROPERTY_PERSON_DUPLICATE_CONDITION = "person_duplicate_condition";
  private String personDuplicateCondition;

  public GetUserSettingsResponse200AllOfData() {
  }

  public GetUserSettingsResponse200AllOfData marketplaceAllowCustomInstallUrl(Boolean marketplaceAllowCustomInstallUrl) {
    
    this.marketplaceAllowCustomInstallUrl = marketplaceAllowCustomInstallUrl;
    return this;
  }

   /**
   * If the vendors are allowed to install custom Marketplace apps with functionality and content in the Pipedrive UI or not
   * @return marketplaceAllowCustomInstallUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the vendors are allowed to install custom Marketplace apps with functionality and content in the Pipedrive UI or not")
  @JsonProperty(JSON_PROPERTY_MARKETPLACE_ALLOW_CUSTOM_INSTALL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMarketplaceAllowCustomInstallUrl() {
    return marketplaceAllowCustomInstallUrl;
  }


  @JsonProperty(JSON_PROPERTY_MARKETPLACE_ALLOW_CUSTOM_INSTALL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketplaceAllowCustomInstallUrl(Boolean marketplaceAllowCustomInstallUrl) {
    this.marketplaceAllowCustomInstallUrl = marketplaceAllowCustomInstallUrl;
  }


  public GetUserSettingsResponse200AllOfData marketplaceAppExtensionsVendor(Boolean marketplaceAppExtensionsVendor) {
    
    this.marketplaceAppExtensionsVendor = marketplaceAppExtensionsVendor;
    return this;
  }

   /**
   * If the vendors are allowed to extend their Marketplace apps with functionality and content in the Pipedrive UI or not
   * @return marketplaceAppExtensionsVendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the vendors are allowed to extend their Marketplace apps with functionality and content in the Pipedrive UI or not")
  @JsonProperty(JSON_PROPERTY_MARKETPLACE_APP_EXTENSIONS_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMarketplaceAppExtensionsVendor() {
    return marketplaceAppExtensionsVendor;
  }


  @JsonProperty(JSON_PROPERTY_MARKETPLACE_APP_EXTENSIONS_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketplaceAppExtensionsVendor(Boolean marketplaceAppExtensionsVendor) {
    this.marketplaceAppExtensionsVendor = marketplaceAppExtensionsVendor;
  }


  public GetUserSettingsResponse200AllOfData marketplaceTeam(Boolean marketplaceTeam) {
    
    this.marketplaceTeam = marketplaceTeam;
    return this;
  }

   /**
   * If the vendors are allowed to be part of the Marketplace team or not
   * @return marketplaceTeam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the vendors are allowed to be part of the Marketplace team or not")
  @JsonProperty(JSON_PROPERTY_MARKETPLACE_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMarketplaceTeam() {
    return marketplaceTeam;
  }


  @JsonProperty(JSON_PROPERTY_MARKETPLACE_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketplaceTeam(Boolean marketplaceTeam) {
    this.marketplaceTeam = marketplaceTeam;
  }


  public GetUserSettingsResponse200AllOfData listLimit(BigDecimal listLimit) {
    
    this.listLimit = listLimit;
    return this;
  }

   /**
   * The number of results shown in list by default
   * @return listLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of results shown in list by default")
  @JsonProperty(JSON_PROPERTY_LIST_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getListLimit() {
    return listLimit;
  }


  @JsonProperty(JSON_PROPERTY_LIST_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListLimit(BigDecimal listLimit) {
    this.listLimit = listLimit;
  }


  public GetUserSettingsResponse200AllOfData betaApp(Boolean betaApp) {
    
    this.betaApp = betaApp;
    return this;
  }

   /**
   * Whether beta app is enabled
   * @return betaApp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether beta app is enabled")
  @JsonProperty(JSON_PROPERTY_BETA_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBetaApp() {
    return betaApp;
  }


  @JsonProperty(JSON_PROPERTY_BETA_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBetaApp(Boolean betaApp) {
    this.betaApp = betaApp;
  }


  public GetUserSettingsResponse200AllOfData preventSalesphoneCalltoOverride(Boolean preventSalesphoneCalltoOverride) {
    
    this.preventSalesphoneCalltoOverride = preventSalesphoneCalltoOverride;
    return this;
  }

   /**
   * Prevent salesphone call to override
   * @return preventSalesphoneCalltoOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prevent salesphone call to override")
  @JsonProperty(JSON_PROPERTY_PREVENT_SALESPHONE_CALLTO_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreventSalesphoneCalltoOverride() {
    return preventSalesphoneCalltoOverride;
  }


  @JsonProperty(JSON_PROPERTY_PREVENT_SALESPHONE_CALLTO_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreventSalesphoneCalltoOverride(Boolean preventSalesphoneCalltoOverride) {
    this.preventSalesphoneCalltoOverride = preventSalesphoneCalltoOverride;
  }


  public GetUserSettingsResponse200AllOfData fileUploadDestination(String fileUploadDestination) {
    
    this.fileUploadDestination = fileUploadDestination;
    return this;
  }

   /**
   * The destination of file upload
   * @return fileUploadDestination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The destination of file upload")
  @JsonProperty(JSON_PROPERTY_FILE_UPLOAD_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileUploadDestination() {
    return fileUploadDestination;
  }


  @JsonProperty(JSON_PROPERTY_FILE_UPLOAD_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileUploadDestination(String fileUploadDestination) {
    this.fileUploadDestination = fileUploadDestination;
  }


  public GetUserSettingsResponse200AllOfData calltoLinkSyntax(String calltoLinkSyntax) {
    
    this.calltoLinkSyntax = calltoLinkSyntax;
    return this;
  }

   /**
   * The call to link syntax
   * @return calltoLinkSyntax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The call to link syntax")
  @JsonProperty(JSON_PROPERTY_CALLTO_LINK_SYNTAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCalltoLinkSyntax() {
    return calltoLinkSyntax;
  }


  @JsonProperty(JSON_PROPERTY_CALLTO_LINK_SYNTAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalltoLinkSyntax(String calltoLinkSyntax) {
    this.calltoLinkSyntax = calltoLinkSyntax;
  }


  public GetUserSettingsResponse200AllOfData autofillDealExpectedCloseDate(Boolean autofillDealExpectedCloseDate) {
    
    this.autofillDealExpectedCloseDate = autofillDealExpectedCloseDate;
    return this;
  }

   /**
   * Whether the expected close date of the deal is filled automatically or not
   * @return autofillDealExpectedCloseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the expected close date of the deal is filled automatically or not")
  @JsonProperty(JSON_PROPERTY_AUTOFILL_DEAL_EXPECTED_CLOSE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutofillDealExpectedCloseDate() {
    return autofillDealExpectedCloseDate;
  }


  @JsonProperty(JSON_PROPERTY_AUTOFILL_DEAL_EXPECTED_CLOSE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutofillDealExpectedCloseDate(Boolean autofillDealExpectedCloseDate) {
    this.autofillDealExpectedCloseDate = autofillDealExpectedCloseDate;
  }


  public GetUserSettingsResponse200AllOfData personDuplicateCondition(String personDuplicateCondition) {
    
    this.personDuplicateCondition = personDuplicateCondition;
    return this;
  }

   /**
   * Allow the vendors to duplicate a person
   * @return personDuplicateCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow the vendors to duplicate a person")
  @JsonProperty(JSON_PROPERTY_PERSON_DUPLICATE_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPersonDuplicateCondition() {
    return personDuplicateCondition;
  }


  @JsonProperty(JSON_PROPERTY_PERSON_DUPLICATE_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonDuplicateCondition(String personDuplicateCondition) {
    this.personDuplicateCondition = personDuplicateCondition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserSettingsResponse200AllOfData getUserSettingsResponse200AllOfData = (GetUserSettingsResponse200AllOfData) o;
    return Objects.equals(this.marketplaceAllowCustomInstallUrl, getUserSettingsResponse200AllOfData.marketplaceAllowCustomInstallUrl) &&
        Objects.equals(this.marketplaceAppExtensionsVendor, getUserSettingsResponse200AllOfData.marketplaceAppExtensionsVendor) &&
        Objects.equals(this.marketplaceTeam, getUserSettingsResponse200AllOfData.marketplaceTeam) &&
        Objects.equals(this.listLimit, getUserSettingsResponse200AllOfData.listLimit) &&
        Objects.equals(this.betaApp, getUserSettingsResponse200AllOfData.betaApp) &&
        Objects.equals(this.preventSalesphoneCalltoOverride, getUserSettingsResponse200AllOfData.preventSalesphoneCalltoOverride) &&
        Objects.equals(this.fileUploadDestination, getUserSettingsResponse200AllOfData.fileUploadDestination) &&
        Objects.equals(this.calltoLinkSyntax, getUserSettingsResponse200AllOfData.calltoLinkSyntax) &&
        Objects.equals(this.autofillDealExpectedCloseDate, getUserSettingsResponse200AllOfData.autofillDealExpectedCloseDate) &&
        Objects.equals(this.personDuplicateCondition, getUserSettingsResponse200AllOfData.personDuplicateCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceAllowCustomInstallUrl, marketplaceAppExtensionsVendor, marketplaceTeam, listLimit, betaApp, preventSalesphoneCalltoOverride, fileUploadDestination, calltoLinkSyntax, autofillDealExpectedCloseDate, personDuplicateCondition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserSettingsResponse200AllOfData {\n");
    sb.append("    marketplaceAllowCustomInstallUrl: ").append(toIndentedString(marketplaceAllowCustomInstallUrl)).append("\n");
    sb.append("    marketplaceAppExtensionsVendor: ").append(toIndentedString(marketplaceAppExtensionsVendor)).append("\n");
    sb.append("    marketplaceTeam: ").append(toIndentedString(marketplaceTeam)).append("\n");
    sb.append("    listLimit: ").append(toIndentedString(listLimit)).append("\n");
    sb.append("    betaApp: ").append(toIndentedString(betaApp)).append("\n");
    sb.append("    preventSalesphoneCalltoOverride: ").append(toIndentedString(preventSalesphoneCalltoOverride)).append("\n");
    sb.append("    fileUploadDestination: ").append(toIndentedString(fileUploadDestination)).append("\n");
    sb.append("    calltoLinkSyntax: ").append(toIndentedString(calltoLinkSyntax)).append("\n");
    sb.append("    autofillDealExpectedCloseDate: ").append(toIndentedString(autofillDealExpectedCloseDate)).append("\n");
    sb.append("    personDuplicateCondition: ").append(toIndentedString(personDuplicateCondition)).append("\n");
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
