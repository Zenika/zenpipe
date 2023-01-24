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
 * AddChannelRequest
 */
@JsonPropertyOrder({
  AddChannelRequest.JSON_PROPERTY_NAME,
  AddChannelRequest.JSON_PROPERTY_PROVIDER_CHANNEL_ID,
  AddChannelRequest.JSON_PROPERTY_AVATAR_URL,
  AddChannelRequest.JSON_PROPERTY_TEMPLATE_SUPPORT,
  AddChannelRequest.JSON_PROPERTY_PROVIDER_TYPE
})
@JsonTypeName("addChannel_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class AddChannelRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROVIDER_CHANNEL_ID = "provider_channel_id";
  private String providerChannelId;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatar_url";
  private String avatarUrl;

  public static final String JSON_PROPERTY_TEMPLATE_SUPPORT = "template_support";
  private Boolean templateSupport = false;

  /**
   * It controls the icons (like the icon next to the conversation)
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
  private ProviderTypeEnum providerType = ProviderTypeEnum.OTHER;

  public AddChannelRequest() {
  }

  public AddChannelRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the channel
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My Channel", required = true, value = "The name of the channel")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AddChannelRequest providerChannelId(String providerChannelId) {
    
    this.providerChannelId = providerChannelId;
    return this;
  }

   /**
   * The channel ID
   * @return providerChannelId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The channel ID")
  @JsonProperty(JSON_PROPERTY_PROVIDER_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProviderChannelId() {
    return providerChannelId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderChannelId(String providerChannelId) {
    this.providerChannelId = providerChannelId;
  }


  public AddChannelRequest avatarUrl(String avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL for an icon that represents your channel
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for an icon that represents your channel")
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


  public AddChannelRequest templateSupport(Boolean templateSupport) {
    
    this.templateSupport = templateSupport;
    return this;
  }

   /**
   * If true, enables templates logic on UI. Requires getTemplates endpoint implemented. Find out more [here](https://pipedrive.readme.io/docs/implementing-messaging-app-extension).
   * @return templateSupport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, enables templates logic on UI. Requires getTemplates endpoint implemented. Find out more [here](https://pipedrive.readme.io/docs/implementing-messaging-app-extension).")
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


  public AddChannelRequest providerType(ProviderTypeEnum providerType) {
    
    this.providerType = providerType;
    return this;
  }

   /**
   * It controls the icons (like the icon next to the conversation)
   * @return providerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "It controls the icons (like the icon next to the conversation)")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddChannelRequest addChannelRequest = (AddChannelRequest) o;
    return Objects.equals(this.name, addChannelRequest.name) &&
        Objects.equals(this.providerChannelId, addChannelRequest.providerChannelId) &&
        Objects.equals(this.avatarUrl, addChannelRequest.avatarUrl) &&
        Objects.equals(this.templateSupport, addChannelRequest.templateSupport) &&
        Objects.equals(this.providerType, addChannelRequest.providerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, providerChannelId, avatarUrl, templateSupport, providerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddChannelRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerChannelId: ").append(toIndentedString(providerChannelId)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    templateSupport: ").append(toIndentedString(templateSupport)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
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

