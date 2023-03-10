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
 * BasicGoalRequest
 */
@JsonPropertyOrder({
  BasicGoalRequest.JSON_PROPERTY_TITLE,
  BasicGoalRequest.JSON_PROPERTY_ASSIGNEE,
  BasicGoalRequest.JSON_PROPERTY_TYPE,
  BasicGoalRequest.JSON_PROPERTY_EXPECTED_OUTCOME,
  BasicGoalRequest.JSON_PROPERTY_DURATION,
  BasicGoalRequest.JSON_PROPERTY_INTERVAL
})
@JsonTypeName("basicGoalRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-24T19:04:25.918485+01:00[Europe/Paris]")
public class BasicGoalRequest {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  private Object assignee;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Object type;

  public static final String JSON_PROPERTY_EXPECTED_OUTCOME = "expected_outcome";
  private Object expectedOutcome;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Object duration;

  /**
   * The interval of the goal
   */
  public enum IntervalEnum {
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    YEARLY("yearly");

    private String value;

    IntervalEnum(String value) {
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
    public static IntervalEnum fromValue(String value) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private IntervalEnum interval;

  public BasicGoalRequest() {
  }

  public BasicGoalRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the goal
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the goal")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public BasicGoalRequest assignee(Object assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Who this goal is assigned to. It requires the following JSON structure: &#x60;{ \&quot;id\&quot;: \&quot;1\&quot;, \&quot;type\&quot;: \&quot;person\&quot; }&#x60;. &#x60;type&#x60; can be either &#x60;person&#x60;, &#x60;company&#x60; or &#x60;team&#x60;. ID of the assignee person, company or team.
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Who this goal is assigned to. It requires the following JSON structure: `{ \"id\": \"1\", \"type\": \"person\" }`. `type` can be either `person`, `company` or `team`. ID of the assignee person, company or team.")
  @JsonProperty(JSON_PROPERTY_ASSIGNEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAssignee() {
    return assignee;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignee(Object assignee) {
    this.assignee = assignee;
  }


  public BasicGoalRequest type(Object type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the goal. It requires the following JSON structure: &#x60;{ \&quot;name\&quot;: \&quot;deals_started\&quot;, \&quot;params\&quot;: { \&quot;pipeline_id\&quot;: [1, 2], \&quot;activity_type_id\&quot;: [9] } }&#x60;. Type can be one of: &#x60;deals_won&#x60;, &#x60;deals_progressed&#x60;, &#x60;activities_completed&#x60;, &#x60;activities_added&#x60;, &#x60;deals_started&#x60; or &#x60;revenue_forecast&#x60;. &#x60;params&#x60; can include &#x60;pipeline_id&#x60;, &#x60;stage_id&#x60; or &#x60;activity_type_id&#x60;. &#x60;stage_id&#x60; is related to only &#x60;deals_progressed&#x60; type of goals and &#x60;activity_type_id&#x60; to &#x60;activities_completed&#x60; or &#x60;activities_added&#x60; types of goals. The &#x60;pipeline_id&#x60; and &#x60;activity_type_id&#x60; need to be given as an array of integers. To track the goal in all pipelines, set &#x60;pipeline_id&#x60; as &#x60;null&#x60; and similarly, to track the goal for all activities, set &#x60;activity_type_id&#x60; as &#x60;null&#x60;.???
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the goal. It requires the following JSON structure: `{ \"name\": \"deals_started\", \"params\": { \"pipeline_id\": [1, 2], \"activity_type_id\": [9] } }`. Type can be one of: `deals_won`, `deals_progressed`, `activities_completed`, `activities_added`, `deals_started` or `revenue_forecast`. `params` can include `pipeline_id`, `stage_id` or `activity_type_id`. `stage_id` is related to only `deals_progressed` type of goals and `activity_type_id` to `activities_completed` or `activities_added` types of goals. The `pipeline_id` and `activity_type_id` need to be given as an array of integers. To track the goal in all pipelines, set `pipeline_id` as `null` and similarly, to track the goal for all activities, set `activity_type_id` as `null`.???")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Object type) {
    this.type = type;
  }


  public BasicGoalRequest expectedOutcome(Object expectedOutcome) {
    
    this.expectedOutcome = expectedOutcome;
    return this;
  }

   /**
   * The expected outcome of the goal. Expected outcome can be tracked either by &#x60;quantity&#x60; or by &#x60;sum&#x60;. It requires the following JSON structure: &#x60;{ \&quot;target\&quot;: \&quot;50\&quot;, \&quot;tracking_metric\&quot;: \&quot;quantity\&quot; }&#x60; or &#x60;{ \&quot;target\&quot;: \&quot;50\&quot;, \&quot;tracking_metric\&quot;: \&quot;sum\&quot;, \&quot;currency_id\&quot;: 1 }&#x60;. &#x60;currency_id&#x60; should only be added to &#x60;sum&#x60; type of goals.
   * @return expectedOutcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expected outcome of the goal. Expected outcome can be tracked either by `quantity` or by `sum`. It requires the following JSON structure: `{ \"target\": \"50\", \"tracking_metric\": \"quantity\" }` or `{ \"target\": \"50\", \"tracking_metric\": \"sum\", \"currency_id\": 1 }`. `currency_id` should only be added to `sum` type of goals.")
  @JsonProperty(JSON_PROPERTY_EXPECTED_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getExpectedOutcome() {
    return expectedOutcome;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectedOutcome(Object expectedOutcome) {
    this.expectedOutcome = expectedOutcome;
  }


  public BasicGoalRequest duration(Object duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * The date when the goal starts and ends. It requires the following JSON structure: &#x60;{ \&quot;start\&quot;: \&quot;2019-01-01\&quot;, \&quot;end\&quot;: \&quot;2022-12-31\&quot; }&#x60;. Date in format of YYYY-MM-DD. \&quot;end\&quot; can be set to &#x60;null&#x60; for an infinite, open-ended goal.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the goal starts and ends. It requires the following JSON structure: `{ \"start\": \"2019-01-01\", \"end\": \"2022-12-31\" }`. Date in format of YYYY-MM-DD. \"end\" can be set to `null` for an infinite, open-ended goal.")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Object duration) {
    this.duration = duration;
  }


  public BasicGoalRequest interval(IntervalEnum interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * The interval of the goal
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The interval of the goal")
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IntervalEnum getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicGoalRequest basicGoalRequest = (BasicGoalRequest) o;
    return Objects.equals(this.title, basicGoalRequest.title) &&
        Objects.equals(this.assignee, basicGoalRequest.assignee) &&
        Objects.equals(this.type, basicGoalRequest.type) &&
        Objects.equals(this.expectedOutcome, basicGoalRequest.expectedOutcome) &&
        Objects.equals(this.duration, basicGoalRequest.duration) &&
        Objects.equals(this.interval, basicGoalRequest.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, assignee, type, expectedOutcome, duration, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicGoalRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    expectedOutcome: ").append(toIndentedString(expectedOutcome)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

