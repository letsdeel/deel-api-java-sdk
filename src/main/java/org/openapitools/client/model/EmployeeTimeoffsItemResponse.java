/*
 * Deel REST API
 * Deel REST API
 *
 * The version of the OpenAPI document: 1.25.0
 * Contact: apiteam@deel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.EmployeeTimeoffsItemResponseAttachmentsInner;
import org.openapitools.client.model.RequesterTimeOff;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * EmployeeTimeoffsItemResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:44:17.413238492Z[GMT]", comments = "Generator version: 7.10.0")
public class EmployeeTimeoffsItemResponse {
  public static final String SERIALIZED_NAME_TIME_OFF_ID = "time_off_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_ID)
  @javax.annotation.Nullable
  private String timeOffId;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE_ID = "time_off_type_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE_ID)
  @javax.annotation.Nullable
  private String timeOffTypeId;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  @javax.annotation.Nullable
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  @javax.annotation.Nullable
  private String policyName;

  public static final String SERIALIZED_NAME_POLICY_TYPE_NAME = "policy_type_name";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE_NAME)
  @javax.annotation.Nullable
  private String policyTypeName;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @javax.annotation.Nullable
  private String reason;

  /**
   * Time off type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VACATION("VACATION"),
    
    SICK_LEAVE("SICK_LEAVE"),
    
    OTHER("OTHER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private TypeEnum type;

  public static final String SERIALIZED_NAME_REQUESTED_AT = "requested_at";
  @SerializedName(SERIALIZED_NAME_REQUESTED_AT)
  @javax.annotation.Nullable
  private String requestedAt;

  public static final String SERIALIZED_NAME_REVIEWED_AT = "reviewed_at";
  @SerializedName(SERIALIZED_NAME_REVIEWED_AT)
  @javax.annotation.Nullable
  private String reviewedAt;

  public static final String SERIALIZED_NAME_WITH_MULTIPLE_DATES = "with_multiple_dates";
  @SerializedName(SERIALIZED_NAME_WITH_MULTIPLE_DATES)
  @javax.annotation.Nullable
  private Boolean withMultipleDates;

  public static final String SERIALIZED_NAME_SINGLE_DATE = "single_date";
  @SerializedName(SERIALIZED_NAME_SINGLE_DATE)
  @javax.annotation.Nullable
  private String singleDate;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private String updatedAt;

  public static final String SERIALIZED_NAME_DENIAL_REASON = "denial_reason";
  @SerializedName(SERIALIZED_NAME_DENIAL_REASON)
  @javax.annotation.Nullable
  private Boolean denialReason;

  public static final String SERIALIZED_NAME_REQUESTER = "requester";
  @SerializedName(SERIALIZED_NAME_REQUESTER)
  @javax.annotation.Nullable
  private RequesterTimeOff requester;

  public static final String SERIALIZED_NAME_DAYS_USED_START_YEAR = "days_used_start_year";
  @SerializedName(SERIALIZED_NAME_DAYS_USED_START_YEAR)
  @javax.annotation.Nullable
  private String daysUsedStartYear;

  public static final String SERIALIZED_NAME_DAYS_USED_END_YEAR = "days_used_end_year";
  @SerializedName(SERIALIZED_NAME_DAYS_USED_END_YEAR)
  @javax.annotation.Nullable
  private String daysUsedEndYear;

  public static final String SERIALIZED_NAME_DAYS_USED = "days_used";
  @SerializedName(SERIALIZED_NAME_DAYS_USED)
  @javax.annotation.Nullable
  private String daysUsed;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private String endDate;

  public static final String SERIALIZED_NAME_IS_START_DATE_HALF_DAY = "is_start_date_half_day";
  @SerializedName(SERIALIZED_NAME_IS_START_DATE_HALF_DAY)
  @javax.annotation.Nullable
  private Boolean isStartDateHalfDay;

  public static final String SERIALIZED_NAME_IS_END_DATE_HALF_DAY = "is_end_date_half_day";
  @SerializedName(SERIALIZED_NAME_IS_END_DATE_HALF_DAY)
  @javax.annotation.Nullable
  private Boolean isEndDateHalfDay;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  @javax.annotation.Nullable
  private List<EmployeeTimeoffsItemResponseAttachmentsInner> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHANGE_REQUEST = "change_request";
  @SerializedName(SERIALIZED_NAME_CHANGE_REQUEST)
  @javax.annotation.Nullable
  private String changeRequest;

  public static final String SERIALIZED_NAME_IS_UPDATED = "is_updated";
  @SerializedName(SERIALIZED_NAME_IS_UPDATED)
  @javax.annotation.Nullable
  private Boolean isUpdated;

  public static final String SERIALIZED_NAME_APPLIED_CHANGES = "applied_changes";
  @SerializedName(SERIALIZED_NAME_APPLIED_CHANGES)
  @javax.annotation.Nullable
  private List<Object> appliedChanges = new ArrayList<>();

  public static final String SERIALIZED_NAME_CAN_REQUEST_CHANGES = "can_request_changes";
  @SerializedName(SERIALIZED_NAME_CAN_REQUEST_CHANGES)
  @javax.annotation.Nullable
  private Boolean canRequestChanges;

  public EmployeeTimeoffsItemResponse() {
  }

  public EmployeeTimeoffsItemResponse timeOffId(@javax.annotation.Nullable String timeOffId) {
    this.timeOffId = timeOffId;
    return this;
  }

  /**
   * Get timeOffId
   * @return timeOffId
   */
  @javax.annotation.Nullable
  public String getTimeOffId() {
    return timeOffId;
  }

  public void setTimeOffId(@javax.annotation.Nullable String timeOffId) {
    this.timeOffId = timeOffId;
  }


  public EmployeeTimeoffsItemResponse timeOffTypeId(@javax.annotation.Nullable String timeOffTypeId) {
    this.timeOffTypeId = timeOffTypeId;
    return this;
  }

  /**
   * Get timeOffTypeId
   * @return timeOffTypeId
   */
  @javax.annotation.Nullable
  public String getTimeOffTypeId() {
    return timeOffTypeId;
  }

  public void setTimeOffTypeId(@javax.annotation.Nullable String timeOffTypeId) {
    this.timeOffTypeId = timeOffTypeId;
  }


  public EmployeeTimeoffsItemResponse policyId(@javax.annotation.Nullable String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Get policyId
   * @return policyId
   */
  @javax.annotation.Nullable
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(@javax.annotation.Nullable String policyId) {
    this.policyId = policyId;
  }


  public EmployeeTimeoffsItemResponse policyName(@javax.annotation.Nullable String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Get policyName
   * @return policyName
   */
  @javax.annotation.Nullable
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(@javax.annotation.Nullable String policyName) {
    this.policyName = policyName;
  }


  public EmployeeTimeoffsItemResponse policyTypeName(@javax.annotation.Nullable String policyTypeName) {
    this.policyTypeName = policyTypeName;
    return this;
  }

  /**
   * Get policyTypeName
   * @return policyTypeName
   */
  @javax.annotation.Nullable
  public String getPolicyTypeName() {
    return policyTypeName;
  }

  public void setPolicyTypeName(@javax.annotation.Nullable String policyTypeName) {
    this.policyTypeName = policyTypeName;
  }


  public EmployeeTimeoffsItemResponse reason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }

  public void setReason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public EmployeeTimeoffsItemResponse type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Time off type.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public EmployeeTimeoffsItemResponse requestedAt(@javax.annotation.Nullable String requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * Get requestedAt
   * @return requestedAt
   */
  @javax.annotation.Nullable
  public String getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(@javax.annotation.Nullable String requestedAt) {
    this.requestedAt = requestedAt;
  }


  public EmployeeTimeoffsItemResponse reviewedAt(@javax.annotation.Nullable String reviewedAt) {
    this.reviewedAt = reviewedAt;
    return this;
  }

  /**
   * Get reviewedAt
   * @return reviewedAt
   */
  @javax.annotation.Nullable
  public String getReviewedAt() {
    return reviewedAt;
  }

  public void setReviewedAt(@javax.annotation.Nullable String reviewedAt) {
    this.reviewedAt = reviewedAt;
  }


  public EmployeeTimeoffsItemResponse withMultipleDates(@javax.annotation.Nullable Boolean withMultipleDates) {
    this.withMultipleDates = withMultipleDates;
    return this;
  }

  /**
   * Get withMultipleDates
   * @return withMultipleDates
   */
  @javax.annotation.Nullable
  public Boolean getWithMultipleDates() {
    return withMultipleDates;
  }

  public void setWithMultipleDates(@javax.annotation.Nullable Boolean withMultipleDates) {
    this.withMultipleDates = withMultipleDates;
  }


  public EmployeeTimeoffsItemResponse singleDate(@javax.annotation.Nullable String singleDate) {
    this.singleDate = singleDate;
    return this;
  }

  /**
   * Get singleDate
   * @return singleDate
   */
  @javax.annotation.Nullable
  public String getSingleDate() {
    return singleDate;
  }

  public void setSingleDate(@javax.annotation.Nullable String singleDate) {
    this.singleDate = singleDate;
  }


  public EmployeeTimeoffsItemResponse createdAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = createdAt;
  }


  public EmployeeTimeoffsItemResponse updatedAt(@javax.annotation.Nullable String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nullable String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public EmployeeTimeoffsItemResponse denialReason(@javax.annotation.Nullable Boolean denialReason) {
    this.denialReason = denialReason;
    return this;
  }

  /**
   * Get denialReason
   * @return denialReason
   */
  @javax.annotation.Nullable
  public Boolean getDenialReason() {
    return denialReason;
  }

  public void setDenialReason(@javax.annotation.Nullable Boolean denialReason) {
    this.denialReason = denialReason;
  }


  public EmployeeTimeoffsItemResponse requester(@javax.annotation.Nullable RequesterTimeOff requester) {
    this.requester = requester;
    return this;
  }

  /**
   * Get requester
   * @return requester
   */
  @javax.annotation.Nullable
  public RequesterTimeOff getRequester() {
    return requester;
  }

  public void setRequester(@javax.annotation.Nullable RequesterTimeOff requester) {
    this.requester = requester;
  }


  public EmployeeTimeoffsItemResponse daysUsedStartYear(@javax.annotation.Nullable String daysUsedStartYear) {
    this.daysUsedStartYear = daysUsedStartYear;
    return this;
  }

  /**
   * Get daysUsedStartYear
   * @return daysUsedStartYear
   */
  @javax.annotation.Nullable
  public String getDaysUsedStartYear() {
    return daysUsedStartYear;
  }

  public void setDaysUsedStartYear(@javax.annotation.Nullable String daysUsedStartYear) {
    this.daysUsedStartYear = daysUsedStartYear;
  }


  public EmployeeTimeoffsItemResponse daysUsedEndYear(@javax.annotation.Nullable String daysUsedEndYear) {
    this.daysUsedEndYear = daysUsedEndYear;
    return this;
  }

  /**
   * Get daysUsedEndYear
   * @return daysUsedEndYear
   */
  @javax.annotation.Nullable
  public String getDaysUsedEndYear() {
    return daysUsedEndYear;
  }

  public void setDaysUsedEndYear(@javax.annotation.Nullable String daysUsedEndYear) {
    this.daysUsedEndYear = daysUsedEndYear;
  }


  public EmployeeTimeoffsItemResponse daysUsed(@javax.annotation.Nullable String daysUsed) {
    this.daysUsed = daysUsed;
    return this;
  }

  /**
   * Get daysUsed
   * @return daysUsed
   */
  @javax.annotation.Nullable
  public String getDaysUsed() {
    return daysUsed;
  }

  public void setDaysUsed(@javax.annotation.Nullable String daysUsed) {
    this.daysUsed = daysUsed;
  }


  public EmployeeTimeoffsItemResponse startDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
  }


  public EmployeeTimeoffsItemResponse endDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
  }


  public EmployeeTimeoffsItemResponse isStartDateHalfDay(@javax.annotation.Nullable Boolean isStartDateHalfDay) {
    this.isStartDateHalfDay = isStartDateHalfDay;
    return this;
  }

  /**
   * Get isStartDateHalfDay
   * @return isStartDateHalfDay
   */
  @javax.annotation.Nullable
  public Boolean getIsStartDateHalfDay() {
    return isStartDateHalfDay;
  }

  public void setIsStartDateHalfDay(@javax.annotation.Nullable Boolean isStartDateHalfDay) {
    this.isStartDateHalfDay = isStartDateHalfDay;
  }


  public EmployeeTimeoffsItemResponse isEndDateHalfDay(@javax.annotation.Nullable Boolean isEndDateHalfDay) {
    this.isEndDateHalfDay = isEndDateHalfDay;
    return this;
  }

  /**
   * Get isEndDateHalfDay
   * @return isEndDateHalfDay
   */
  @javax.annotation.Nullable
  public Boolean getIsEndDateHalfDay() {
    return isEndDateHalfDay;
  }

  public void setIsEndDateHalfDay(@javax.annotation.Nullable Boolean isEndDateHalfDay) {
    this.isEndDateHalfDay = isEndDateHalfDay;
  }


  public EmployeeTimeoffsItemResponse attachments(@javax.annotation.Nullable List<EmployeeTimeoffsItemResponseAttachmentsInner> attachments) {
    this.attachments = attachments;
    return this;
  }

  public EmployeeTimeoffsItemResponse addAttachmentsItem(EmployeeTimeoffsItemResponseAttachmentsInner attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Get attachments
   * @return attachments
   */
  @javax.annotation.Nullable
  public List<EmployeeTimeoffsItemResponseAttachmentsInner> getAttachments() {
    return attachments;
  }

  public void setAttachments(@javax.annotation.Nullable List<EmployeeTimeoffsItemResponseAttachmentsInner> attachments) {
    this.attachments = attachments;
  }


  public EmployeeTimeoffsItemResponse changeRequest(@javax.annotation.Nullable String changeRequest) {
    this.changeRequest = changeRequest;
    return this;
  }

  /**
   * Get changeRequest
   * @return changeRequest
   */
  @javax.annotation.Nullable
  public String getChangeRequest() {
    return changeRequest;
  }

  public void setChangeRequest(@javax.annotation.Nullable String changeRequest) {
    this.changeRequest = changeRequest;
  }


  public EmployeeTimeoffsItemResponse isUpdated(@javax.annotation.Nullable Boolean isUpdated) {
    this.isUpdated = isUpdated;
    return this;
  }

  /**
   * Get isUpdated
   * @return isUpdated
   */
  @javax.annotation.Nullable
  public Boolean getIsUpdated() {
    return isUpdated;
  }

  public void setIsUpdated(@javax.annotation.Nullable Boolean isUpdated) {
    this.isUpdated = isUpdated;
  }


  public EmployeeTimeoffsItemResponse appliedChanges(@javax.annotation.Nullable List<Object> appliedChanges) {
    this.appliedChanges = appliedChanges;
    return this;
  }

  public EmployeeTimeoffsItemResponse addAppliedChangesItem(Object appliedChangesItem) {
    if (this.appliedChanges == null) {
      this.appliedChanges = new ArrayList<>();
    }
    this.appliedChanges.add(appliedChangesItem);
    return this;
  }

  /**
   * Get appliedChanges
   * @return appliedChanges
   */
  @javax.annotation.Nullable
  public List<Object> getAppliedChanges() {
    return appliedChanges;
  }

  public void setAppliedChanges(@javax.annotation.Nullable List<Object> appliedChanges) {
    this.appliedChanges = appliedChanges;
  }


  public EmployeeTimeoffsItemResponse canRequestChanges(@javax.annotation.Nullable Boolean canRequestChanges) {
    this.canRequestChanges = canRequestChanges;
    return this;
  }

  /**
   * Get canRequestChanges
   * @return canRequestChanges
   */
  @javax.annotation.Nullable
  public Boolean getCanRequestChanges() {
    return canRequestChanges;
  }

  public void setCanRequestChanges(@javax.annotation.Nullable Boolean canRequestChanges) {
    this.canRequestChanges = canRequestChanges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTimeoffsItemResponse employeeTimeoffsItemResponse = (EmployeeTimeoffsItemResponse) o;
    return Objects.equals(this.timeOffId, employeeTimeoffsItemResponse.timeOffId) &&
        Objects.equals(this.timeOffTypeId, employeeTimeoffsItemResponse.timeOffTypeId) &&
        Objects.equals(this.policyId, employeeTimeoffsItemResponse.policyId) &&
        Objects.equals(this.policyName, employeeTimeoffsItemResponse.policyName) &&
        Objects.equals(this.policyTypeName, employeeTimeoffsItemResponse.policyTypeName) &&
        Objects.equals(this.reason, employeeTimeoffsItemResponse.reason) &&
        Objects.equals(this.type, employeeTimeoffsItemResponse.type) &&
        Objects.equals(this.requestedAt, employeeTimeoffsItemResponse.requestedAt) &&
        Objects.equals(this.reviewedAt, employeeTimeoffsItemResponse.reviewedAt) &&
        Objects.equals(this.withMultipleDates, employeeTimeoffsItemResponse.withMultipleDates) &&
        Objects.equals(this.singleDate, employeeTimeoffsItemResponse.singleDate) &&
        Objects.equals(this.createdAt, employeeTimeoffsItemResponse.createdAt) &&
        Objects.equals(this.updatedAt, employeeTimeoffsItemResponse.updatedAt) &&
        Objects.equals(this.denialReason, employeeTimeoffsItemResponse.denialReason) &&
        Objects.equals(this.requester, employeeTimeoffsItemResponse.requester) &&
        Objects.equals(this.daysUsedStartYear, employeeTimeoffsItemResponse.daysUsedStartYear) &&
        Objects.equals(this.daysUsedEndYear, employeeTimeoffsItemResponse.daysUsedEndYear) &&
        Objects.equals(this.daysUsed, employeeTimeoffsItemResponse.daysUsed) &&
        Objects.equals(this.startDate, employeeTimeoffsItemResponse.startDate) &&
        Objects.equals(this.endDate, employeeTimeoffsItemResponse.endDate) &&
        Objects.equals(this.isStartDateHalfDay, employeeTimeoffsItemResponse.isStartDateHalfDay) &&
        Objects.equals(this.isEndDateHalfDay, employeeTimeoffsItemResponse.isEndDateHalfDay) &&
        Objects.equals(this.attachments, employeeTimeoffsItemResponse.attachments) &&
        Objects.equals(this.changeRequest, employeeTimeoffsItemResponse.changeRequest) &&
        Objects.equals(this.isUpdated, employeeTimeoffsItemResponse.isUpdated) &&
        Objects.equals(this.appliedChanges, employeeTimeoffsItemResponse.appliedChanges) &&
        Objects.equals(this.canRequestChanges, employeeTimeoffsItemResponse.canRequestChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffId, timeOffTypeId, policyId, policyName, policyTypeName, reason, type, requestedAt, reviewedAt, withMultipleDates, singleDate, createdAt, updatedAt, denialReason, requester, daysUsedStartYear, daysUsedEndYear, daysUsed, startDate, endDate, isStartDateHalfDay, isEndDateHalfDay, attachments, changeRequest, isUpdated, appliedChanges, canRequestChanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTimeoffsItemResponse {\n");
    sb.append("    timeOffId: ").append(toIndentedString(timeOffId)).append("\n");
    sb.append("    timeOffTypeId: ").append(toIndentedString(timeOffTypeId)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyTypeName: ").append(toIndentedString(policyTypeName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
    sb.append("    reviewedAt: ").append(toIndentedString(reviewedAt)).append("\n");
    sb.append("    withMultipleDates: ").append(toIndentedString(withMultipleDates)).append("\n");
    sb.append("    singleDate: ").append(toIndentedString(singleDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    denialReason: ").append(toIndentedString(denialReason)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    daysUsedStartYear: ").append(toIndentedString(daysUsedStartYear)).append("\n");
    sb.append("    daysUsedEndYear: ").append(toIndentedString(daysUsedEndYear)).append("\n");
    sb.append("    daysUsed: ").append(toIndentedString(daysUsed)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isStartDateHalfDay: ").append(toIndentedString(isStartDateHalfDay)).append("\n");
    sb.append("    isEndDateHalfDay: ").append(toIndentedString(isEndDateHalfDay)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    changeRequest: ").append(toIndentedString(changeRequest)).append("\n");
    sb.append("    isUpdated: ").append(toIndentedString(isUpdated)).append("\n");
    sb.append("    appliedChanges: ").append(toIndentedString(appliedChanges)).append("\n");
    sb.append("    canRequestChanges: ").append(toIndentedString(canRequestChanges)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("time_off_id");
    openapiFields.add("time_off_type_id");
    openapiFields.add("policy_id");
    openapiFields.add("policy_name");
    openapiFields.add("policy_type_name");
    openapiFields.add("reason");
    openapiFields.add("type");
    openapiFields.add("requested_at");
    openapiFields.add("reviewed_at");
    openapiFields.add("with_multiple_dates");
    openapiFields.add("single_date");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("denial_reason");
    openapiFields.add("requester");
    openapiFields.add("days_used_start_year");
    openapiFields.add("days_used_end_year");
    openapiFields.add("days_used");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("is_start_date_half_day");
    openapiFields.add("is_end_date_half_day");
    openapiFields.add("attachments");
    openapiFields.add("change_request");
    openapiFields.add("is_updated");
    openapiFields.add("applied_changes");
    openapiFields.add("can_request_changes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmployeeTimeoffsItemResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmployeeTimeoffsItemResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeTimeoffsItemResponse is not found in the empty JSON string", EmployeeTimeoffsItemResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmployeeTimeoffsItemResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmployeeTimeoffsItemResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("time_off_id") != null && !jsonObj.get("time_off_id").isJsonNull()) && !jsonObj.get("time_off_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_id").toString()));
      }
      if ((jsonObj.get("time_off_type_id") != null && !jsonObj.get("time_off_type_id").isJsonNull()) && !jsonObj.get("time_off_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_type_id").toString()));
      }
      if ((jsonObj.get("policy_id") != null && !jsonObj.get("policy_id").isJsonNull()) && !jsonObj.get("policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
      if ((jsonObj.get("policy_name") != null && !jsonObj.get("policy_name").isJsonNull()) && !jsonObj.get("policy_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_name").toString()));
      }
      if ((jsonObj.get("policy_type_name") != null && !jsonObj.get("policy_type_name").isJsonNull()) && !jsonObj.get("policy_type_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type_name").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("requested_at") != null && !jsonObj.get("requested_at").isJsonNull()) && !jsonObj.get("requested_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requested_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requested_at").toString()));
      }
      if ((jsonObj.get("reviewed_at") != null && !jsonObj.get("reviewed_at").isJsonNull()) && !jsonObj.get("reviewed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reviewed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reviewed_at").toString()));
      }
      if ((jsonObj.get("single_date") != null && !jsonObj.get("single_date").isJsonNull()) && !jsonObj.get("single_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `single_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("single_date").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      // validate the optional field `requester`
      if (jsonObj.get("requester") != null && !jsonObj.get("requester").isJsonNull()) {
        RequesterTimeOff.validateJsonElement(jsonObj.get("requester"));
      }
      if ((jsonObj.get("days_used_start_year") != null && !jsonObj.get("days_used_start_year").isJsonNull()) && !jsonObj.get("days_used_start_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days_used_start_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days_used_start_year").toString()));
      }
      if ((jsonObj.get("days_used_end_year") != null && !jsonObj.get("days_used_end_year").isJsonNull()) && !jsonObj.get("days_used_end_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days_used_end_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days_used_end_year").toString()));
      }
      if ((jsonObj.get("days_used") != null && !jsonObj.get("days_used").isJsonNull()) && !jsonObj.get("days_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days_used").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            EmployeeTimeoffsItemResponseAttachmentsInner.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
      if ((jsonObj.get("change_request") != null && !jsonObj.get("change_request").isJsonNull()) && !jsonObj.get("change_request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `change_request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("change_request").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("applied_changes") != null && !jsonObj.get("applied_changes").isJsonNull() && !jsonObj.get("applied_changes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `applied_changes` to be an array in the JSON string but got `%s`", jsonObj.get("applied_changes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeTimeoffsItemResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeTimeoffsItemResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeTimeoffsItemResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeTimeoffsItemResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeTimeoffsItemResponse>() {
           @Override
           public void write(JsonWriter out, EmployeeTimeoffsItemResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeeTimeoffsItemResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmployeeTimeoffsItemResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmployeeTimeoffsItemResponse
   * @throws IOException if the JSON string is invalid with respect to EmployeeTimeoffsItemResponse
   */
  public static EmployeeTimeoffsItemResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeTimeoffsItemResponse.class);
  }

  /**
   * Convert an instance of EmployeeTimeoffsItemResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

