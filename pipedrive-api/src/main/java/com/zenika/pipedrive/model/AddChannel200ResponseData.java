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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddChannel200ResponseData
 */
@JsonPropertyOrder({
  AddChannel200ResponseData.JSON_PROPERTY_ID,
  AddChannel200ResponseData.JSON_PROPERTY_NAME,
  AddChannel200ResponseData.JSON_PROPERTY_AVATAR_URL,
  AddChannel200ResponseData.JSON_PROPERTY_PROVIDER_CHANNEL_ID,
  AddChannel200ResponseData.JSON_PROPERTY_MARKETPLACE_CLIENT_ID,
  AddChannel200ResponseData.JSON_PROPERTY_PD_COMPANY_ID,
  AddChannel200ResponseData.JSON_PROPERTY_PD_USER_ID,
  AddChannel200ResponseData.JSON_PROPERTY_CREATED_AT,
  AddChannel200ResponseData.JSON_PROPERTY_PROVIDER_TYPE,
  AddChannel200ResponseData.JSON_PROPERTY_TEMPLATE_SUPPORT
})
@JsonTypeName("addChannel_200_response_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddChannel200ResponseData {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatar_url";
  private String avatarUrl;

  public static final String JSON_PROPERTY_PROVIDER_CHANNEL_ID = "provider_channel_id";
  private String providerChannelId;

  public static final String JSON_PROPERTY_MARKETPLACE_CLIENT_ID = "marketplace_client_id";
  private String marketplaceClientId;

  public static final String JSON_PROPERTY_PD_COMPANY_ID = "pd_company_id";
  private Integer pdCompanyId;

  public static final String JSON_PROPERTY_PD_USER_ID = "pd_user_id";
  private Integer pdUserId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  /**
   * Value of the provider_type sent to this endpoint
   */
  public enum ProviderTypeEnum {
    FACEBOOK("facebook"),
    
    WHATSAPP("whatsapp"),
    
    OTHER("other");

    private String value;

    ProviderTypeEnum(String value) {
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
    public static ProviderTypeEnum fromValue(String value) {
      for (ProviderTypeEnum b : ProviderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PROVIDER_TYPE = "provider_type";
  private ProviderTypeEnum providerType;

  public static final String JSON_PROPERTY_TEMPLATE_SUPPORT = "template_support";
  private Boolean templateSupport;

  public AddChannel200ResponseData() {
  }

  public AddChannel200ResponseData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique channel ID used internally in omnichannel-api and the frontend of the extension
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique channel ID used internally in omnichannel-api and the frontend of the extension")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public AddChannel200ResponseData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the channel
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Channel", value = "The name of the channel")
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


  public AddChannel200ResponseData avatarUrl(String avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL for an icon that represents your channel
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://some-domain.com/test.jpg", value = "The URL for an icon that represents your channel")
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvatarUrl() {
    return avatarUrl;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public AddChannel200ResponseData providerChannelId(String providerChannelId) {
    
    this.providerChannelId = providerChannelId;
    return this;
  }

   /**
   * The channel ID you specified while creating the channel
   * @return providerChannelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The channel ID you specified while creating the channel")
  @JsonProperty(JSON_PROPERTY_PROVIDER_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderChannelId() {
    return providerChannelId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderChannelId(String providerChannelId) {
    this.providerChannelId = providerChannelId;
  }


  public AddChannel200ResponseData marketplaceClientId(String marketplaceClientId) {
    
    this.marketplaceClientId = marketplaceClientId;
    return this;
  }

   /**
   * The client_id of your app in Pipedrive marketplace
   * @return marketplaceClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client_id of your app in Pipedrive marketplace")
  @JsonProperty(JSON_PROPERTY_MARKETPLACE_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarketplaceClientId() {
    return marketplaceClientId;
  }


  @JsonProperty(JSON_PROPERTY_MARKETPLACE_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketplaceClientId(String marketplaceClientId) {
    this.marketplaceClientId = marketplaceClientId;
  }


  public AddChannel200ResponseData pdCompanyId(Integer pdCompanyId) {
    
    this.pdCompanyId = pdCompanyId;
    return this;
  }

   /**
   * The ID of the user&#39;s company in Pipedrive
   * @return pdCompanyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The ID of the user's company in Pipedrive")
  @JsonProperty(JSON_PROPERTY_PD_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPdCompanyId() {
    return pdCompanyId;
  }


  @JsonProperty(JSON_PROPERTY_PD_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPdCompanyId(Integer pdCompanyId) {
    this.pdCompanyId = pdCompanyId;
  }


  public AddChannel200ResponseData pdUserId(Integer pdUserId) {
    
    this.pdUserId = pdUserId;
    return this;
  }

   /**
   * The ID of the user in Pipedrive
   * @return pdUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The ID of the user in Pipedrive")
  @JsonProperty(JSON_PROPERTY_PD_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPdUserId() {
    return pdUserId;
  }


  @JsonProperty(JSON_PROPERTY_PD_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPdUserId(Integer pdUserId) {
    this.pdUserId = pdUserId;
  }


  public AddChannel200ResponseData createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when your channel was created in the API
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when your channel was created in the API")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AddChannel200ResponseData providerType(ProviderTypeEnum providerType) {
    
    this.providerType = providerType;
    return this;
  }

   /**
   * Value of the provider_type sent to this endpoint
   * @return providerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the provider_type sent to this endpoint")
  @JsonProperty(JSON_PROPERTY_PROVIDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProviderTypeEnum getProviderType() {
    return providerType;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
  }


  public AddChannel200ResponseData templateSupport(Boolean templateSupport) {
    
    this.templateSupport = templateSupport;
    return this;
  }

   /**
   * Value of the template_support sent to this endpoint
   * @return templateSupport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the template_support sent to this endpoint")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTemplateSupport() {
    return templateSupport;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateSupport(Boolean templateSupport) {
    this.templateSupport = templateSupport;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddChannel200ResponseData addChannel200ResponseData = (AddChannel200ResponseData) o;
    return Objects.equals(this.id, addChannel200ResponseData.id) &&
        Objects.equals(this.name, addChannel200ResponseData.name) &&
        Objects.equals(this.avatarUrl, addChannel200ResponseData.avatarUrl) &&
        Objects.equals(this.providerChannelId, addChannel200ResponseData.providerChannelId) &&
        Objects.equals(this.marketplaceClientId, addChannel200ResponseData.marketplaceClientId) &&
        Objects.equals(this.pdCompanyId, addChannel200ResponseData.pdCompanyId) &&
        Objects.equals(this.pdUserId, addChannel200ResponseData.pdUserId) &&
        Objects.equals(this.createdAt, addChannel200ResponseData.createdAt) &&
        Objects.equals(this.providerType, addChannel200ResponseData.providerType) &&
        Objects.equals(this.templateSupport, addChannel200ResponseData.templateSupport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, avatarUrl, providerChannelId, marketplaceClientId, pdCompanyId, pdUserId, createdAt, providerType, templateSupport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddChannel200ResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    providerChannelId: ").append(toIndentedString(providerChannelId)).append("\n");
    sb.append("    marketplaceClientId: ").append(toIndentedString(marketplaceClientId)).append("\n");
    sb.append("    pdCompanyId: ").append(toIndentedString(pdCompanyId)).append("\n");
    sb.append("    pdUserId: ").append(toIndentedString(pdUserId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    templateSupport: ").append(toIndentedString(templateSupport)).append("\n");
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

