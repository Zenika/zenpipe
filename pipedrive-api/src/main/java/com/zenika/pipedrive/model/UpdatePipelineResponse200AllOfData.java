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
 * The pipeline object
 */
@ApiModel(description = "The pipeline object")
@JsonPropertyOrder({
  UpdatePipelineResponse200AllOfData.JSON_PROPERTY_ID,
  UpdatePipelineResponse200AllOfData.JSON_PROPERTY_NAME,
  UpdatePipelineResponse200AllOfData.JSON_PROPERTY_URL_TITLE,
  UpdatePipelineResponse200AllOfData.JSON_PROPERTY_ORDER_NR,
  UpdatePipelineResponse200AllOfData.JSON_PROPERTY_ACTIVE,
  UpdatePipelineResponse200AllOfData.JSON_PROPERTY_DEAL_PROBABILITY,
  UpdatePipelineResponse200AllOfData.JSON_PROPERTY_ADD_TIME,
  UpdatePipelineResponse200AllOfData.JSON_PROPERTY_UPDATE_TIME,
  UpdatePipelineResponse200AllOfData.JSON_PROPERTY_SELECTED
})
@JsonTypeName("updatePipelineResponse200_allOf_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class UpdatePipelineResponse200AllOfData {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_URL_TITLE = "url_title";
  private String urlTitle;

  public static final String JSON_PROPERTY_ORDER_NR = "order_nr";
  private Integer orderNr;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_DEAL_PROBABILITY = "deal_probability";
  private Boolean dealProbability;

  public static final String JSON_PROPERTY_ADD_TIME = "add_time";
  private String addTime;

  public static final String JSON_PROPERTY_UPDATE_TIME = "update_time";
  private String updateTime;

  public static final String JSON_PROPERTY_SELECTED = "selected";
  private Boolean selected;

  public UpdatePipelineResponse200AllOfData() {
  }

  public UpdatePipelineResponse200AllOfData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the pipeline
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the pipeline")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public UpdatePipelineResponse200AllOfData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the pipeline
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the pipeline")
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


  public UpdatePipelineResponse200AllOfData urlTitle(String urlTitle) {
    
    this.urlTitle = urlTitle;
    return this;
  }

   /**
   * The pipeline title displayed in the URL
   * @return urlTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pipeline title displayed in the URL")
  @JsonProperty(JSON_PROPERTY_URL_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrlTitle() {
    return urlTitle;
  }


  @JsonProperty(JSON_PROPERTY_URL_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlTitle(String urlTitle) {
    this.urlTitle = urlTitle;
  }


  public UpdatePipelineResponse200AllOfData orderNr(Integer orderNr) {
    
    this.orderNr = orderNr;
    return this;
  }

   /**
   * Defines the order of pipelines. First order (&#x60;order_nr&#x3D;0&#x60;) is the default pipeline.
   * @return orderNr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the order of pipelines. First order (`order_nr=0`) is the default pipeline.")
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


  public UpdatePipelineResponse200AllOfData active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Whether this pipeline will be made inactive (hidden) or active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this pipeline will be made inactive (hidden) or active")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public UpdatePipelineResponse200AllOfData dealProbability(Boolean dealProbability) {
    
    this.dealProbability = dealProbability;
    return this;
  }

   /**
   * Whether deal probability is disabled or enabled for this pipeline
   * @return dealProbability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether deal probability is disabled or enabled for this pipeline")
  @JsonProperty(JSON_PROPERTY_DEAL_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDealProbability() {
    return dealProbability;
  }


  @JsonProperty(JSON_PROPERTY_DEAL_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDealProbability(Boolean dealProbability) {
    this.dealProbability = dealProbability;
  }


  public UpdatePipelineResponse200AllOfData addTime(String addTime) {
    
    this.addTime = addTime;
    return this;
  }

   /**
   * The pipeline creation time. Format: YYYY-MM-DD HH:MM:SS.
   * @return addTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pipeline creation time. Format: YYYY-MM-DD HH:MM:SS.")
  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddTime() {
    return addTime;
  }


  @JsonProperty(JSON_PROPERTY_ADD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddTime(String addTime) {
    this.addTime = addTime;
  }


  public UpdatePipelineResponse200AllOfData updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The pipeline update time. Format: YYYY-MM-DD HH:MM:SS.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pipeline update time. Format: YYYY-MM-DD HH:MM:SS.")
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateTime() {
    return updateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public UpdatePipelineResponse200AllOfData selected(Boolean selected) {
    
    this.selected = selected;
    return this;
  }

   /**
   * A boolean that shows if the pipeline is selected from a filter or not
   * @return selected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean that shows if the pipeline is selected from a filter or not")
  @JsonProperty(JSON_PROPERTY_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSelected() {
    return selected;
  }


  @JsonProperty(JSON_PROPERTY_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePipelineResponse200AllOfData updatePipelineResponse200AllOfData = (UpdatePipelineResponse200AllOfData) o;
    return Objects.equals(this.id, updatePipelineResponse200AllOfData.id) &&
        Objects.equals(this.name, updatePipelineResponse200AllOfData.name) &&
        Objects.equals(this.urlTitle, updatePipelineResponse200AllOfData.urlTitle) &&
        Objects.equals(this.orderNr, updatePipelineResponse200AllOfData.orderNr) &&
        Objects.equals(this.active, updatePipelineResponse200AllOfData.active) &&
        Objects.equals(this.dealProbability, updatePipelineResponse200AllOfData.dealProbability) &&
        Objects.equals(this.addTime, updatePipelineResponse200AllOfData.addTime) &&
        Objects.equals(this.updateTime, updatePipelineResponse200AllOfData.updateTime) &&
        Objects.equals(this.selected, updatePipelineResponse200AllOfData.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, urlTitle, orderNr, active, dealProbability, addTime, updateTime, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePipelineResponse200AllOfData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urlTitle: ").append(toIndentedString(urlTitle)).append("\n");
    sb.append("    orderNr: ").append(toIndentedString(orderNr)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dealProbability: ").append(toIndentedString(dealProbability)).append("\n");
    sb.append("    addTime: ").append(toIndentedString(addTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

