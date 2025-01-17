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
import org.openapitools.client.model.EmployeeTimeoffsItemAttachmentsInner;
import org.openapitools.client.model.EmployeeTimeoffsItemRequester;
import org.openapitools.client.model.EmployeeTimeoffsItemReviewer;

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
 * EmployeeTimeoffsItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class EmployeeTimeoffsItem {
  public static final String SERIALIZED_NAME_TIME_OFF_ID = "time_off_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_ID)
  @javax.annotation.Nonnull
  private String timeOffId;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE_ID = "time_off_type_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE_ID)
  @javax.annotation.Nonnull
  private String timeOffTypeId;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  @javax.annotation.Nonnull
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_TYPE_ID = "policy_type_id";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE_ID)
  @javax.annotation.Nonnull
  private String policyTypeId;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  @javax.annotation.Nonnull
  private String policyName;

  public static final String SERIALIZED_NAME_POLICY_TYPE_NAME = "policy_type_name";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE_NAME)
  @javax.annotation.Nonnull
  private String policyTypeName;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @javax.annotation.Nonnull
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
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String SERIALIZED_NAME_REQUESTED_AT = "requested_at";
  @SerializedName(SERIALIZED_NAME_REQUESTED_AT)
  @javax.annotation.Nonnull
  private String requestedAt;

  public static final String SERIALIZED_NAME_REVIEWED_AT = "reviewed_at";
  @SerializedName(SERIALIZED_NAME_REVIEWED_AT)
  @javax.annotation.Nonnull
  private String reviewedAt;

  public static final String SERIALIZED_NAME_WITH_MULTIPLE_DATES = "with_multiple_dates";
  @SerializedName(SERIALIZED_NAME_WITH_MULTIPLE_DATES)
  @javax.annotation.Nonnull
  private Boolean withMultipleDates;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private String updatedAt;

  public static final String SERIALIZED_NAME_DENIAL_REASON = "denial_reason";
  @SerializedName(SERIALIZED_NAME_DENIAL_REASON)
  @javax.annotation.Nullable
  private String denialReason;

  public static final String SERIALIZED_NAME_REQUESTER = "requester";
  @SerializedName(SERIALIZED_NAME_REQUESTER)
  @javax.annotation.Nonnull
  private EmployeeTimeoffsItemRequester requester;

  public static final String SERIALIZED_NAME_REVIEWER = "reviewer";
  @SerializedName(SERIALIZED_NAME_REVIEWER)
  @javax.annotation.Nonnull
  private EmployeeTimeoffsItemReviewer reviewer;

  public static final String SERIALIZED_NAME_DAYS_USED_START_YEAR = "days_used_start_year";
  @SerializedName(SERIALIZED_NAME_DAYS_USED_START_YEAR)
  @javax.annotation.Nonnull
  private String daysUsedStartYear;

  public static final String SERIALIZED_NAME_DAYS_USED_END_YEAR = "days_used_end_year";
  @SerializedName(SERIALIZED_NAME_DAYS_USED_END_YEAR)
  @javax.annotation.Nonnull
  private String daysUsedEndYear;

  public static final String SERIALIZED_NAME_DAYS_USED = "days_used";
  @SerializedName(SERIALIZED_NAME_DAYS_USED)
  @javax.annotation.Nonnull
  private String daysUsed;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nonnull
  private String endDate;

  public static final String SERIALIZED_NAME_IS_START_DATE_HALF_DAY = "is_start_date_half_day";
  @SerializedName(SERIALIZED_NAME_IS_START_DATE_HALF_DAY)
  @javax.annotation.Nonnull
  private Boolean isStartDateHalfDay;

  public static final String SERIALIZED_NAME_IS_END_DATE_HALF_DAY = "is_end_date_half_day";
  @SerializedName(SERIALIZED_NAME_IS_END_DATE_HALF_DAY)
  @javax.annotation.Nonnull
  private Boolean isEndDateHalfDay;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  @javax.annotation.Nonnull
  private List<EmployeeTimeoffsItemAttachmentsInner> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHANGE_REQUEST = "change_request";
  @SerializedName(SERIALIZED_NAME_CHANGE_REQUEST)
  @javax.annotation.Nullable
  private String changeRequest;

  public EmployeeTimeoffsItem() {
  }

  public EmployeeTimeoffsItem timeOffId(@javax.annotation.Nonnull String timeOffId) {
    this.timeOffId = timeOffId;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return timeOffId
   */
  @javax.annotation.Nonnull
  public String getTimeOffId() {
    return timeOffId;
  }

  public void setTimeOffId(@javax.annotation.Nonnull String timeOffId) {
    this.timeOffId = timeOffId;
  }


  public EmployeeTimeoffsItem timeOffTypeId(@javax.annotation.Nonnull String timeOffTypeId) {
    this.timeOffTypeId = timeOffTypeId;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return timeOffTypeId
   */
  @javax.annotation.Nonnull
  public String getTimeOffTypeId() {
    return timeOffTypeId;
  }

  public void setTimeOffTypeId(@javax.annotation.Nonnull String timeOffTypeId) {
    this.timeOffTypeId = timeOffTypeId;
  }


  public EmployeeTimeoffsItem policyId(@javax.annotation.Nonnull String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return policyId
   */
  @javax.annotation.Nonnull
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(@javax.annotation.Nonnull String policyId) {
    this.policyId = policyId;
  }


  public EmployeeTimeoffsItem policyTypeId(@javax.annotation.Nonnull String policyTypeId) {
    this.policyTypeId = policyTypeId;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return policyTypeId
   */
  @javax.annotation.Nonnull
  public String getPolicyTypeId() {
    return policyTypeId;
  }

  public void setPolicyTypeId(@javax.annotation.Nonnull String policyTypeId) {
    this.policyTypeId = policyTypeId;
  }


  public EmployeeTimeoffsItem policyName(@javax.annotation.Nonnull String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Time off policy name.
   * @return policyName
   */
  @javax.annotation.Nonnull
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(@javax.annotation.Nonnull String policyName) {
    this.policyName = policyName;
  }


  public EmployeeTimeoffsItem policyTypeName(@javax.annotation.Nonnull String policyTypeName) {
    this.policyTypeName = policyTypeName;
    return this;
  }

  /**
   * Time off policy type name.
   * @return policyTypeName
   */
  @javax.annotation.Nonnull
  public String getPolicyTypeName() {
    return policyTypeName;
  }

  public void setPolicyTypeName(@javax.annotation.Nonnull String policyTypeName) {
    this.policyTypeName = policyTypeName;
  }


  public EmployeeTimeoffsItem reason(@javax.annotation.Nonnull String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for time off.
   * @return reason
   */
  @javax.annotation.Nonnull
  public String getReason() {
    return reason;
  }

  public void setReason(@javax.annotation.Nonnull String reason) {
    this.reason = reason;
  }


  public EmployeeTimeoffsItem type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Time off type.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public EmployeeTimeoffsItem requestedAt(@javax.annotation.Nonnull String requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * Time off requested date.
   * @return requestedAt
   */
  @javax.annotation.Nonnull
  public String getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(@javax.annotation.Nonnull String requestedAt) {
    this.requestedAt = requestedAt;
  }


  public EmployeeTimeoffsItem reviewedAt(@javax.annotation.Nonnull String reviewedAt) {
    this.reviewedAt = reviewedAt;
    return this;
  }

  /**
   * Time off reviewed date.
   * @return reviewedAt
   */
  @javax.annotation.Nonnull
  public String getReviewedAt() {
    return reviewedAt;
  }

  public void setReviewedAt(@javax.annotation.Nonnull String reviewedAt) {
    this.reviewedAt = reviewedAt;
  }


  public EmployeeTimeoffsItem withMultipleDates(@javax.annotation.Nonnull Boolean withMultipleDates) {
    this.withMultipleDates = withMultipleDates;
    return this;
  }

  /**
   * Time off with multiple dates.
   * @return withMultipleDates
   */
  @javax.annotation.Nonnull
  public Boolean getWithMultipleDates() {
    return withMultipleDates;
  }

  public void setWithMultipleDates(@javax.annotation.Nonnull Boolean withMultipleDates) {
    this.withMultipleDates = withMultipleDates;
  }


  public EmployeeTimeoffsItem createdAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time off created date.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
  }


  public EmployeeTimeoffsItem updatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time off updated date.
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public EmployeeTimeoffsItem denialReason(@javax.annotation.Nullable String denialReason) {
    this.denialReason = denialReason;
    return this;
  }

  /**
   * Time off denial reason.
   * @return denialReason
   */
  @javax.annotation.Nullable
  public String getDenialReason() {
    return denialReason;
  }

  public void setDenialReason(@javax.annotation.Nullable String denialReason) {
    this.denialReason = denialReason;
  }


  public EmployeeTimeoffsItem requester(@javax.annotation.Nonnull EmployeeTimeoffsItemRequester requester) {
    this.requester = requester;
    return this;
  }

  /**
   * Get requester
   * @return requester
   */
  @javax.annotation.Nonnull
  public EmployeeTimeoffsItemRequester getRequester() {
    return requester;
  }

  public void setRequester(@javax.annotation.Nonnull EmployeeTimeoffsItemRequester requester) {
    this.requester = requester;
  }


  public EmployeeTimeoffsItem reviewer(@javax.annotation.Nonnull EmployeeTimeoffsItemReviewer reviewer) {
    this.reviewer = reviewer;
    return this;
  }

  /**
   * Get reviewer
   * @return reviewer
   */
  @javax.annotation.Nonnull
  public EmployeeTimeoffsItemReviewer getReviewer() {
    return reviewer;
  }

  public void setReviewer(@javax.annotation.Nonnull EmployeeTimeoffsItemReviewer reviewer) {
    this.reviewer = reviewer;
  }


  public EmployeeTimeoffsItem daysUsedStartYear(@javax.annotation.Nonnull String daysUsedStartYear) {
    this.daysUsedStartYear = daysUsedStartYear;
    return this;
  }

  /**
   * Days used in the start year.
   * @return daysUsedStartYear
   */
  @javax.annotation.Nonnull
  public String getDaysUsedStartYear() {
    return daysUsedStartYear;
  }

  public void setDaysUsedStartYear(@javax.annotation.Nonnull String daysUsedStartYear) {
    this.daysUsedStartYear = daysUsedStartYear;
  }


  public EmployeeTimeoffsItem daysUsedEndYear(@javax.annotation.Nonnull String daysUsedEndYear) {
    this.daysUsedEndYear = daysUsedEndYear;
    return this;
  }

  /**
   * Days used in the end year.
   * @return daysUsedEndYear
   */
  @javax.annotation.Nonnull
  public String getDaysUsedEndYear() {
    return daysUsedEndYear;
  }

  public void setDaysUsedEndYear(@javax.annotation.Nonnull String daysUsedEndYear) {
    this.daysUsedEndYear = daysUsedEndYear;
  }


  public EmployeeTimeoffsItem daysUsed(@javax.annotation.Nonnull String daysUsed) {
    this.daysUsed = daysUsed;
    return this;
  }

  /**
   * Days used.
   * @return daysUsed
   */
  @javax.annotation.Nonnull
  public String getDaysUsed() {
    return daysUsed;
  }

  public void setDaysUsed(@javax.annotation.Nonnull String daysUsed) {
    this.daysUsed = daysUsed;
  }


  public EmployeeTimeoffsItem startDate(@javax.annotation.Nonnull String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Time off start date.
   * @return startDate
   */
  @javax.annotation.Nonnull
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nonnull String startDate) {
    this.startDate = startDate;
  }


  public EmployeeTimeoffsItem endDate(@javax.annotation.Nonnull String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Time off end date.
   * @return endDate
   */
  @javax.annotation.Nonnull
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nonnull String endDate) {
    this.endDate = endDate;
  }


  public EmployeeTimeoffsItem isStartDateHalfDay(@javax.annotation.Nonnull Boolean isStartDateHalfDay) {
    this.isStartDateHalfDay = isStartDateHalfDay;
    return this;
  }

  /**
   * Is start date half day.
   * @return isStartDateHalfDay
   */
  @javax.annotation.Nonnull
  public Boolean getIsStartDateHalfDay() {
    return isStartDateHalfDay;
  }

  public void setIsStartDateHalfDay(@javax.annotation.Nonnull Boolean isStartDateHalfDay) {
    this.isStartDateHalfDay = isStartDateHalfDay;
  }


  public EmployeeTimeoffsItem isEndDateHalfDay(@javax.annotation.Nonnull Boolean isEndDateHalfDay) {
    this.isEndDateHalfDay = isEndDateHalfDay;
    return this;
  }

  /**
   * Is end date half day.
   * @return isEndDateHalfDay
   */
  @javax.annotation.Nonnull
  public Boolean getIsEndDateHalfDay() {
    return isEndDateHalfDay;
  }

  public void setIsEndDateHalfDay(@javax.annotation.Nonnull Boolean isEndDateHalfDay) {
    this.isEndDateHalfDay = isEndDateHalfDay;
  }


  public EmployeeTimeoffsItem attachments(@javax.annotation.Nonnull List<EmployeeTimeoffsItemAttachmentsInner> attachments) {
    this.attachments = attachments;
    return this;
  }

  public EmployeeTimeoffsItem addAttachmentsItem(EmployeeTimeoffsItemAttachmentsInner attachmentsItem) {
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
  @javax.annotation.Nonnull
  public List<EmployeeTimeoffsItemAttachmentsInner> getAttachments() {
    return attachments;
  }

  public void setAttachments(@javax.annotation.Nonnull List<EmployeeTimeoffsItemAttachmentsInner> attachments) {
    this.attachments = attachments;
  }


  public EmployeeTimeoffsItem changeRequest(@javax.annotation.Nullable String changeRequest) {
    this.changeRequest = changeRequest;
    return this;
  }

  /**
   * Time off change request.
   * @return changeRequest
   */
  @javax.annotation.Nullable
  public String getChangeRequest() {
    return changeRequest;
  }

  public void setChangeRequest(@javax.annotation.Nullable String changeRequest) {
    this.changeRequest = changeRequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTimeoffsItem employeeTimeoffsItem = (EmployeeTimeoffsItem) o;
    return Objects.equals(this.timeOffId, employeeTimeoffsItem.timeOffId) &&
        Objects.equals(this.timeOffTypeId, employeeTimeoffsItem.timeOffTypeId) &&
        Objects.equals(this.policyId, employeeTimeoffsItem.policyId) &&
        Objects.equals(this.policyTypeId, employeeTimeoffsItem.policyTypeId) &&
        Objects.equals(this.policyName, employeeTimeoffsItem.policyName) &&
        Objects.equals(this.policyTypeName, employeeTimeoffsItem.policyTypeName) &&
        Objects.equals(this.reason, employeeTimeoffsItem.reason) &&
        Objects.equals(this.type, employeeTimeoffsItem.type) &&
        Objects.equals(this.requestedAt, employeeTimeoffsItem.requestedAt) &&
        Objects.equals(this.reviewedAt, employeeTimeoffsItem.reviewedAt) &&
        Objects.equals(this.withMultipleDates, employeeTimeoffsItem.withMultipleDates) &&
        Objects.equals(this.createdAt, employeeTimeoffsItem.createdAt) &&
        Objects.equals(this.updatedAt, employeeTimeoffsItem.updatedAt) &&
        Objects.equals(this.denialReason, employeeTimeoffsItem.denialReason) &&
        Objects.equals(this.requester, employeeTimeoffsItem.requester) &&
        Objects.equals(this.reviewer, employeeTimeoffsItem.reviewer) &&
        Objects.equals(this.daysUsedStartYear, employeeTimeoffsItem.daysUsedStartYear) &&
        Objects.equals(this.daysUsedEndYear, employeeTimeoffsItem.daysUsedEndYear) &&
        Objects.equals(this.daysUsed, employeeTimeoffsItem.daysUsed) &&
        Objects.equals(this.startDate, employeeTimeoffsItem.startDate) &&
        Objects.equals(this.endDate, employeeTimeoffsItem.endDate) &&
        Objects.equals(this.isStartDateHalfDay, employeeTimeoffsItem.isStartDateHalfDay) &&
        Objects.equals(this.isEndDateHalfDay, employeeTimeoffsItem.isEndDateHalfDay) &&
        Objects.equals(this.attachments, employeeTimeoffsItem.attachments) &&
        Objects.equals(this.changeRequest, employeeTimeoffsItem.changeRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffId, timeOffTypeId, policyId, policyTypeId, policyName, policyTypeName, reason, type, requestedAt, reviewedAt, withMultipleDates, createdAt, updatedAt, denialReason, requester, reviewer, daysUsedStartYear, daysUsedEndYear, daysUsed, startDate, endDate, isStartDateHalfDay, isEndDateHalfDay, attachments, changeRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTimeoffsItem {\n");
    sb.append("    timeOffId: ").append(toIndentedString(timeOffId)).append("\n");
    sb.append("    timeOffTypeId: ").append(toIndentedString(timeOffTypeId)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyTypeId: ").append(toIndentedString(policyTypeId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyTypeName: ").append(toIndentedString(policyTypeName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
    sb.append("    reviewedAt: ").append(toIndentedString(reviewedAt)).append("\n");
    sb.append("    withMultipleDates: ").append(toIndentedString(withMultipleDates)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    denialReason: ").append(toIndentedString(denialReason)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
    sb.append("    daysUsedStartYear: ").append(toIndentedString(daysUsedStartYear)).append("\n");
    sb.append("    daysUsedEndYear: ").append(toIndentedString(daysUsedEndYear)).append("\n");
    sb.append("    daysUsed: ").append(toIndentedString(daysUsed)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isStartDateHalfDay: ").append(toIndentedString(isStartDateHalfDay)).append("\n");
    sb.append("    isEndDateHalfDay: ").append(toIndentedString(isEndDateHalfDay)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    changeRequest: ").append(toIndentedString(changeRequest)).append("\n");
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
    openapiFields.add("policy_type_id");
    openapiFields.add("policy_name");
    openapiFields.add("policy_type_name");
    openapiFields.add("reason");
    openapiFields.add("type");
    openapiFields.add("requested_at");
    openapiFields.add("reviewed_at");
    openapiFields.add("with_multiple_dates");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("denial_reason");
    openapiFields.add("requester");
    openapiFields.add("reviewer");
    openapiFields.add("days_used_start_year");
    openapiFields.add("days_used_end_year");
    openapiFields.add("days_used");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("is_start_date_half_day");
    openapiFields.add("is_end_date_half_day");
    openapiFields.add("attachments");
    openapiFields.add("change_request");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("time_off_id");
    openapiRequiredFields.add("time_off_type_id");
    openapiRequiredFields.add("policy_id");
    openapiRequiredFields.add("policy_type_id");
    openapiRequiredFields.add("policy_name");
    openapiRequiredFields.add("policy_type_name");
    openapiRequiredFields.add("reason");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("requested_at");
    openapiRequiredFields.add("reviewed_at");
    openapiRequiredFields.add("with_multiple_dates");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("denial_reason");
    openapiRequiredFields.add("requester");
    openapiRequiredFields.add("reviewer");
    openapiRequiredFields.add("days_used_start_year");
    openapiRequiredFields.add("days_used_end_year");
    openapiRequiredFields.add("days_used");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("is_start_date_half_day");
    openapiRequiredFields.add("is_end_date_half_day");
    openapiRequiredFields.add("attachments");
    openapiRequiredFields.add("change_request");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmployeeTimeoffsItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmployeeTimeoffsItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeTimeoffsItem is not found in the empty JSON string", EmployeeTimeoffsItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmployeeTimeoffsItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmployeeTimeoffsItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmployeeTimeoffsItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("time_off_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_id").toString()));
      }
      if (!jsonObj.get("time_off_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_type_id").toString()));
      }
      if (!jsonObj.get("policy_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_id").toString()));
      }
      if (!jsonObj.get("policy_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type_id").toString()));
      }
      if (!jsonObj.get("policy_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_name").toString()));
      }
      if (!jsonObj.get("policy_type_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy_type_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy_type_name").toString()));
      }
      if (!jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("requested_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requested_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requested_at").toString()));
      }
      if (!jsonObj.get("reviewed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reviewed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reviewed_at").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if ((jsonObj.get("denial_reason") != null && !jsonObj.get("denial_reason").isJsonNull()) && !jsonObj.get("denial_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `denial_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("denial_reason").toString()));
      }
      // validate the required field `requester`
      EmployeeTimeoffsItemRequester.validateJsonElement(jsonObj.get("requester"));
      // validate the required field `reviewer`
      EmployeeTimeoffsItemReviewer.validateJsonElement(jsonObj.get("reviewer"));
      if (!jsonObj.get("days_used_start_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days_used_start_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days_used_start_year").toString()));
      }
      if (!jsonObj.get("days_used_end_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days_used_end_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days_used_end_year").toString()));
      }
      if (!jsonObj.get("days_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days_used").toString()));
      }
      if (!jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if (!jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("attachments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }

      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      // validate the required field `attachments` (array)
      for (int i = 0; i < jsonArrayattachments.size(); i++) {
        EmployeeTimeoffsItemAttachmentsInner.validateJsonElement(jsonArrayattachments.get(i));
      };
      if ((jsonObj.get("change_request") != null && !jsonObj.get("change_request").isJsonNull()) && !jsonObj.get("change_request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `change_request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("change_request").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeTimeoffsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeTimeoffsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeTimeoffsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeTimeoffsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeTimeoffsItem>() {
           @Override
           public void write(JsonWriter out, EmployeeTimeoffsItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeeTimeoffsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmployeeTimeoffsItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmployeeTimeoffsItem
   * @throws IOException if the JSON string is invalid with respect to EmployeeTimeoffsItem
   */
  public static EmployeeTimeoffsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeTimeoffsItem.class);
  }

  /**
   * Convert an instance of EmployeeTimeoffsItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

