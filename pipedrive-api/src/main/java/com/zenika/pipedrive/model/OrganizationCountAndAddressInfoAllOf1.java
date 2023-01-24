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
 * OrganizationCountAndAddressInfoAllOf1
 */
@JsonPropertyOrder({
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS,
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS_SUBPREMISE,
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS_STREET_NUMBER,
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS_ROUTE,
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS_SUBLOCALITY,
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS_LOCALITY,
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS_ADMIN_AREA_LEVEL1,
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS_ADMIN_AREA_LEVEL2,
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS_COUNTRY,
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS_POSTAL_CODE,
  OrganizationCountAndAddressInfoAllOf1.JSON_PROPERTY_ADDRESS_FORMATTED_ADDRESS
})
@JsonTypeName("organizationCountAndAddressInfo_allOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class OrganizationCountAndAddressInfoAllOf1 {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_ADDRESS_SUBPREMISE = "address_subpremise";
  private String addressSubpremise;

  public static final String JSON_PROPERTY_ADDRESS_STREET_NUMBER = "address_street_number";
  private String addressStreetNumber;

  public static final String JSON_PROPERTY_ADDRESS_ROUTE = "address_route";
  private String addressRoute;

  public static final String JSON_PROPERTY_ADDRESS_SUBLOCALITY = "address_sublocality";
  private String addressSublocality;

  public static final String JSON_PROPERTY_ADDRESS_LOCALITY = "address_locality";
  private String addressLocality;

  public static final String JSON_PROPERTY_ADDRESS_ADMIN_AREA_LEVEL1 = "address_admin_area_level_1";
  private String addressAdminAreaLevel1;

  public static final String JSON_PROPERTY_ADDRESS_ADMIN_AREA_LEVEL2 = "address_admin_area_level_2";
  private String addressAdminAreaLevel2;

  public static final String JSON_PROPERTY_ADDRESS_COUNTRY = "address_country";
  private String addressCountry;

  public static final String JSON_PROPERTY_ADDRESS_POSTAL_CODE = "address_postal_code";
  private String addressPostalCode;

  public static final String JSON_PROPERTY_ADDRESS_FORMATTED_ADDRESS = "address_formatted_address";
  private String addressFormattedAddress;

  public OrganizationCountAndAddressInfoAllOf1() {
  }

  public OrganizationCountAndAddressInfoAllOf1 address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The full address of the organization
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full address of the organization")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public OrganizationCountAndAddressInfoAllOf1 addressSubpremise(String addressSubpremise) {
    
    this.addressSubpremise = addressSubpremise;
    return this;
  }

   /**
   * The sub-premise of the organization location
   * @return addressSubpremise
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sub-premise of the organization location")
  @JsonProperty(JSON_PROPERTY_ADDRESS_SUBPREMISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressSubpremise() {
    return addressSubpremise;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_SUBPREMISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressSubpremise(String addressSubpremise) {
    this.addressSubpremise = addressSubpremise;
  }


  public OrganizationCountAndAddressInfoAllOf1 addressStreetNumber(String addressStreetNumber) {
    
    this.addressStreetNumber = addressStreetNumber;
    return this;
  }

   /**
   * The street number of the organization location
   * @return addressStreetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street number of the organization location")
  @JsonProperty(JSON_PROPERTY_ADDRESS_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressStreetNumber() {
    return addressStreetNumber;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressStreetNumber(String addressStreetNumber) {
    this.addressStreetNumber = addressStreetNumber;
  }


  public OrganizationCountAndAddressInfoAllOf1 addressRoute(String addressRoute) {
    
    this.addressRoute = addressRoute;
    return this;
  }

   /**
   * The route of the organization location
   * @return addressRoute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The route of the organization location")
  @JsonProperty(JSON_PROPERTY_ADDRESS_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressRoute() {
    return addressRoute;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressRoute(String addressRoute) {
    this.addressRoute = addressRoute;
  }


  public OrganizationCountAndAddressInfoAllOf1 addressSublocality(String addressSublocality) {
    
    this.addressSublocality = addressSublocality;
    return this;
  }

   /**
   * The sub-locality of the organization location
   * @return addressSublocality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sub-locality of the organization location")
  @JsonProperty(JSON_PROPERTY_ADDRESS_SUBLOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressSublocality() {
    return addressSublocality;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_SUBLOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressSublocality(String addressSublocality) {
    this.addressSublocality = addressSublocality;
  }


  public OrganizationCountAndAddressInfoAllOf1 addressLocality(String addressLocality) {
    
    this.addressLocality = addressLocality;
    return this;
  }

   /**
   * The locality of the organization location
   * @return addressLocality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The locality of the organization location")
  @JsonProperty(JSON_PROPERTY_ADDRESS_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLocality() {
    return addressLocality;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLocality(String addressLocality) {
    this.addressLocality = addressLocality;
  }


  public OrganizationCountAndAddressInfoAllOf1 addressAdminAreaLevel1(String addressAdminAreaLevel1) {
    
    this.addressAdminAreaLevel1 = addressAdminAreaLevel1;
    return this;
  }

   /**
   * The level 1 admin area of the organization location
   * @return addressAdminAreaLevel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The level 1 admin area of the organization location")
  @JsonProperty(JSON_PROPERTY_ADDRESS_ADMIN_AREA_LEVEL1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressAdminAreaLevel1() {
    return addressAdminAreaLevel1;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_ADMIN_AREA_LEVEL1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressAdminAreaLevel1(String addressAdminAreaLevel1) {
    this.addressAdminAreaLevel1 = addressAdminAreaLevel1;
  }


  public OrganizationCountAndAddressInfoAllOf1 addressAdminAreaLevel2(String addressAdminAreaLevel2) {
    
    this.addressAdminAreaLevel2 = addressAdminAreaLevel2;
    return this;
  }

   /**
   * The level 2 admin area of the organization location
   * @return addressAdminAreaLevel2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The level 2 admin area of the organization location")
  @JsonProperty(JSON_PROPERTY_ADDRESS_ADMIN_AREA_LEVEL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressAdminAreaLevel2() {
    return addressAdminAreaLevel2;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_ADMIN_AREA_LEVEL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressAdminAreaLevel2(String addressAdminAreaLevel2) {
    this.addressAdminAreaLevel2 = addressAdminAreaLevel2;
  }


  public OrganizationCountAndAddressInfoAllOf1 addressCountry(String addressCountry) {
    
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * The country of the organization location
   * @return addressCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country of the organization location")
  @JsonProperty(JSON_PROPERTY_ADDRESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressCountry() {
    return addressCountry;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }


  public OrganizationCountAndAddressInfoAllOf1 addressPostalCode(String addressPostalCode) {
    
    this.addressPostalCode = addressPostalCode;
    return this;
  }

   /**
   * The postal code of the organization location
   * @return addressPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code of the organization location")
  @JsonProperty(JSON_PROPERTY_ADDRESS_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressPostalCode() {
    return addressPostalCode;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
  }


  public OrganizationCountAndAddressInfoAllOf1 addressFormattedAddress(String addressFormattedAddress) {
    
    this.addressFormattedAddress = addressFormattedAddress;
    return this;
  }

   /**
   * The formatted organization location
   * @return addressFormattedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The formatted organization location")
  @JsonProperty(JSON_PROPERTY_ADDRESS_FORMATTED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressFormattedAddress() {
    return addressFormattedAddress;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_FORMATTED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressFormattedAddress(String addressFormattedAddress) {
    this.addressFormattedAddress = addressFormattedAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationCountAndAddressInfoAllOf1 organizationCountAndAddressInfoAllOf1 = (OrganizationCountAndAddressInfoAllOf1) o;
    return Objects.equals(this.address, organizationCountAndAddressInfoAllOf1.address) &&
        Objects.equals(this.addressSubpremise, organizationCountAndAddressInfoAllOf1.addressSubpremise) &&
        Objects.equals(this.addressStreetNumber, organizationCountAndAddressInfoAllOf1.addressStreetNumber) &&
        Objects.equals(this.addressRoute, organizationCountAndAddressInfoAllOf1.addressRoute) &&
        Objects.equals(this.addressSublocality, organizationCountAndAddressInfoAllOf1.addressSublocality) &&
        Objects.equals(this.addressLocality, organizationCountAndAddressInfoAllOf1.addressLocality) &&
        Objects.equals(this.addressAdminAreaLevel1, organizationCountAndAddressInfoAllOf1.addressAdminAreaLevel1) &&
        Objects.equals(this.addressAdminAreaLevel2, organizationCountAndAddressInfoAllOf1.addressAdminAreaLevel2) &&
        Objects.equals(this.addressCountry, organizationCountAndAddressInfoAllOf1.addressCountry) &&
        Objects.equals(this.addressPostalCode, organizationCountAndAddressInfoAllOf1.addressPostalCode) &&
        Objects.equals(this.addressFormattedAddress, organizationCountAndAddressInfoAllOf1.addressFormattedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressSubpremise, addressStreetNumber, addressRoute, addressSublocality, addressLocality, addressAdminAreaLevel1, addressAdminAreaLevel2, addressCountry, addressPostalCode, addressFormattedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCountAndAddressInfoAllOf1 {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressSubpremise: ").append(toIndentedString(addressSubpremise)).append("\n");
    sb.append("    addressStreetNumber: ").append(toIndentedString(addressStreetNumber)).append("\n");
    sb.append("    addressRoute: ").append(toIndentedString(addressRoute)).append("\n");
    sb.append("    addressSublocality: ").append(toIndentedString(addressSublocality)).append("\n");
    sb.append("    addressLocality: ").append(toIndentedString(addressLocality)).append("\n");
    sb.append("    addressAdminAreaLevel1: ").append(toIndentedString(addressAdminAreaLevel1)).append("\n");
    sb.append("    addressAdminAreaLevel2: ").append(toIndentedString(addressAdminAreaLevel2)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
    sb.append("    addressFormattedAddress: ").append(toIndentedString(addressFormattedAddress)).append("\n");
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
