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
 * UpdateFilterRequest
 */
@JsonPropertyOrder({
  UpdateFilterRequest.JSON_PROPERTY_NAME,
  UpdateFilterRequest.JSON_PROPERTY_CONDITIONS
})
@JsonTypeName("updateFilterRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class UpdateFilterRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private Object conditions;

  public UpdateFilterRequest() {
  }

  public UpdateFilterRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the filter
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the filter")
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


  public UpdateFilterRequest conditions(Object conditions) {
    
    this.conditions = conditions;
    return this;
  }

   /**
   * The conditions of the filter as a JSON object. Please note that a maximum of 16 conditions is allowed per filter and &#x60;date&#x60; values must be supplied in the &#x60;YYYY-MM-DD&#x60; format. It requires a minimum structure as follows: &#x60;{\&quot;glue\&quot;:\&quot;and\&quot;,\&quot;conditions\&quot;:[{\&quot;glue\&quot;:\&quot;and\&quot;,\&quot;conditions\&quot;: [CONDITION_OBJECTS]},{\&quot;glue\&quot;:\&quot;or\&quot;,\&quot;conditions\&quot;:[CONDITION_OBJECTS]}]}&#x60;. Replace &#x60;CONDITION_OBJECTS&#x60; with JSON objects of the following structure: &#x60;{\&quot;object\&quot;:\&quot;\&quot;,\&quot;field_id\&quot;:\&quot;\&quot;, \&quot;operator\&quot;:\&quot;\&quot;,\&quot;value\&quot;:\&quot;\&quot;, \&quot;extra_value\&quot;:\&quot;\&quot;}&#x60; or leave the array empty. Depending on the object type you should use another API endpoint to get &#x60;field_id&#x60;. There are five types of objects you can choose from: &#x60;\&quot;person\&quot;&#x60;, &#x60;\&quot;deal\&quot;&#x60;, &#x60;\&quot;organization\&quot;&#x60;, &#x60;\&quot;product\&quot;&#x60;, &#x60;\&quot;activity\&quot;&#x60; and you can use these types of operators depending on what type of a field you have: &#x60;\&quot;IS NOT NULL\&quot;&#x60;, &#x60;\&quot;IS NULL\&quot;&#x60;, &#x60;\&quot;&lt;&#x3D;\&quot;&#x60;, &#x60;\&quot;&gt;&#x3D;\&quot;&#x60;, &#x60;\&quot;&lt;\&quot;&#x60;, &#x60;\&quot;&gt;\&quot;&#x60;, &#x60;\&quot;!&#x3D;\&quot;&#x60;, &#x60;\&quot;&#x3D;\&quot;&#x60;, &#x60;\&quot;LIKE &#39;$%&#39;\&quot;&#x60;, &#x60;\&quot;LIKE &#39;%$%&#39;\&quot;&#x60;, &#x60;\&quot;NOT LIKE &#39;$%&#39;\&quot;&#x60;. To get a better understanding of how filters work try creating them directly from the Pipedrive application.
   * @return conditions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The conditions of the filter as a JSON object. Please note that a maximum of 16 conditions is allowed per filter and `date` values must be supplied in the `YYYY-MM-DD` format. It requires a minimum structure as follows: `{\"glue\":\"and\",\"conditions\":[{\"glue\":\"and\",\"conditions\": [CONDITION_OBJECTS]},{\"glue\":\"or\",\"conditions\":[CONDITION_OBJECTS]}]}`. Replace `CONDITION_OBJECTS` with JSON objects of the following structure: `{\"object\":\"\",\"field_id\":\"\", \"operator\":\"\",\"value\":\"\", \"extra_value\":\"\"}` or leave the array empty. Depending on the object type you should use another API endpoint to get `field_id`. There are five types of objects you can choose from: `\"person\"`, `\"deal\"`, `\"organization\"`, `\"product\"`, `\"activity\"` and you can use these types of operators depending on what type of a field you have: `\"IS NOT NULL\"`, `\"IS NULL\"`, `\"<=\"`, `\">=\"`, `\"<\"`, `\">\"`, `\"!=\"`, `\"=\"`, `\"LIKE '$%'\"`, `\"LIKE '%$%'\"`, `\"NOT LIKE '$%'\"`. To get a better understanding of how filters work try creating them directly from the Pipedrive application.")
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConditions(Object conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFilterRequest updateFilterRequest = (UpdateFilterRequest) o;
    return Objects.equals(this.name, updateFilterRequest.name) &&
        Objects.equals(this.conditions, updateFilterRequest.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFilterRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

