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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.EorTimeoffsBaseItem;
import org.openapitools.client.model.TimeoffsAttachmentsItem;
import org.openapitools.client.model.TimeoffsProfile;
import org.openapitools.client.model.TimeoffsStatusEnum;
import org.openapitools.client.model.TimeoffsTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * EorTimeoffsItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T13:47:44.629538829Z[GMT]", comments = "Generator version: 7.10.0")
public class EorTimeoffsItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  @javax.annotation.Nullable
  private String contractId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_CAN_REQUEST_CHANGES = "can_request_changes";
  @SerializedName(SERIALIZED_NAME_CAN_REQUEST_CHANGES)
  @javax.annotation.Nullable
  private Boolean canRequestChanges;

  public static final String SERIALIZED_NAME_IS_UPDATED = "is_updated";
  @SerializedName(SERIALIZED_NAME_IS_UPDATED)
  @javax.annotation.Nullable
  private Boolean isUpdated;

  public static final String SERIALIZED_NAME_CHANGE_REQUEST = "change_request";
  @SerializedName(SERIALIZED_NAME_CHANGE_REQUEST)
  @javax.annotation.Nullable
  private EorTimeoffsBaseItem changeRequest;

  public static final String SERIALIZED_NAME_APPLIED_CHANGES = "applied_changes";
  @SerializedName(SERIALIZED_NAME_APPLIED_CHANGES)
  @javax.annotation.Nullable
  private List<EorTimeoffsBaseItem> appliedChanges = new ArrayList<>();

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @javax.annotation.Nullable
  private String reason;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private TimeoffsTypeEnum type;

  public static final String SERIALIZED_NAME_REQUESTED_AT = "requested_at";
  @SerializedName(SERIALIZED_NAME_REQUESTED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime requestedAt;

  public static final String SERIALIZED_NAME_REVIEWED_AT = "reviewed_at";
  @SerializedName(SERIALIZED_NAME_REVIEWED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime reviewedAt;

  public static final String SERIALIZED_NAME_DENIAL_REASON = "denial_reason";
  @SerializedName(SERIALIZED_NAME_DENIAL_REASON)
  @javax.annotation.Nullable
  private String denialReason;

  public static final String SERIALIZED_NAME_HAS_MULTIPLE_DATES = "has_multiple_dates";
  @SerializedName(SERIALIZED_NAME_HAS_MULTIPLE_DATES)
  @javax.annotation.Nullable
  private Boolean hasMultipleDates;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private TimeoffsStatusEnum status;

  public static final String SERIALIZED_NAME_OTHER_TIMEOFF_NAME = "other_timeoff_name";
  @SerializedName(SERIALIZED_NAME_OTHER_TIMEOFF_NAME)
  @javax.annotation.Nullable
  private String otherTimeoffName;

  public static final String SERIALIZED_NAME_REQUESTER = "requester";
  @SerializedName(SERIALIZED_NAME_REQUESTER)
  @javax.annotation.Nullable
  private TimeoffsProfile requester;

  public static final String SERIALIZED_NAME_REVIEWER = "reviewer";
  @SerializedName(SERIALIZED_NAME_REVIEWER)
  @javax.annotation.Nullable
  private TimeoffsProfile reviewer;

  public static final String SERIALIZED_NAME_DAYS_USED_START_YEAR = "days_used_start_year";
  @SerializedName(SERIALIZED_NAME_DAYS_USED_START_YEAR)
  @javax.annotation.Nullable
  private String daysUsedStartYear;

  public static final String SERIALIZED_NAME_DAYS_USED_END_YEAR = "days_used_end_year";
  @SerializedName(SERIALIZED_NAME_DAYS_USED_END_YEAR)
  @javax.annotation.Nullable
  private String daysUsedEndYear;

  public static final String SERIALIZED_NAME_TOTAL_DAYS_USED = "total_days_used";
  @SerializedName(SERIALIZED_NAME_TOTAL_DAYS_USED)
  @javax.annotation.Nullable
  private String totalDaysUsed;

  public static final String SERIALIZED_NAME_START_DATE_IS_HALF_DAY = "start_date_is_half_day";
  @SerializedName(SERIALIZED_NAME_START_DATE_IS_HALF_DAY)
  @javax.annotation.Nullable
  private Boolean startDateIsHalfDay;

  public static final String SERIALIZED_NAME_END_DATE_IS_HALF_DAY = "end_date_is_half_day";
  @SerializedName(SERIALIZED_NAME_END_DATE_IS_HALF_DAY)
  @javax.annotation.Nullable
  private Boolean endDateIsHalfDay;

  public static final String SERIALIZED_NAME_SINGLE_DATE = "single_date";
  @SerializedName(SERIALIZED_NAME_SINGLE_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime singleDate;

  public static final String SERIALIZED_NAME_DATE_IS_HALF_DAY = "date_is_half_day";
  @SerializedName(SERIALIZED_NAME_DATE_IS_HALF_DAY)
  @javax.annotation.Nullable
  private Boolean dateIsHalfDay;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  @javax.annotation.Nullable
  private List<TimeoffsAttachmentsItem> attachments = new ArrayList<>();

  public EorTimeoffsItem() {
  }

  public EorTimeoffsItem id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public EorTimeoffsItem contractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
   */
  @javax.annotation.Nullable
  public String getContractId() {
    return contractId;
  }

  public void setContractId(@javax.annotation.Nullable String contractId) {
    this.contractId = contractId;
  }


  public EorTimeoffsItem createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EorTimeoffsItem updatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public EorTimeoffsItem startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return startDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public EorTimeoffsItem endDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return endDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public EorTimeoffsItem canRequestChanges(@javax.annotation.Nullable Boolean canRequestChanges) {
    this.canRequestChanges = canRequestChanges;
    return this;
  }

  /**
   * Indicates if it is possible to make changes to the time off request.
   * @return canRequestChanges
   */
  @javax.annotation.Nullable
  public Boolean getCanRequestChanges() {
    return canRequestChanges;
  }

  public void setCanRequestChanges(@javax.annotation.Nullable Boolean canRequestChanges) {
    this.canRequestChanges = canRequestChanges;
  }


  public EorTimeoffsItem isUpdated(@javax.annotation.Nullable Boolean isUpdated) {
    this.isUpdated = isUpdated;
    return this;
  }

  /**
   * If true, an update to the original time off request was made.
   * @return isUpdated
   */
  @javax.annotation.Nullable
  public Boolean getIsUpdated() {
    return isUpdated;
  }

  public void setIsUpdated(@javax.annotation.Nullable Boolean isUpdated) {
    this.isUpdated = isUpdated;
  }


  public EorTimeoffsItem changeRequest(@javax.annotation.Nullable EorTimeoffsBaseItem changeRequest) {
    this.changeRequest = changeRequest;
    return this;
  }

  /**
   * Get changeRequest
   * @return changeRequest
   */
  @javax.annotation.Nullable
  public EorTimeoffsBaseItem getChangeRequest() {
    return changeRequest;
  }

  public void setChangeRequest(@javax.annotation.Nullable EorTimeoffsBaseItem changeRequest) {
    this.changeRequest = changeRequest;
  }


  public EorTimeoffsItem appliedChanges(@javax.annotation.Nullable List<EorTimeoffsBaseItem> appliedChanges) {
    this.appliedChanges = appliedChanges;
    return this;
  }

  public EorTimeoffsItem addAppliedChangesItem(EorTimeoffsBaseItem appliedChangesItem) {
    if (this.appliedChanges == null) {
      this.appliedChanges = new ArrayList<>();
    }
    this.appliedChanges.add(appliedChangesItem);
    return this;
  }

  /**
   * List of changes applied to the time off.
   * @return appliedChanges
   */
  @javax.annotation.Nullable
  public List<EorTimeoffsBaseItem> getAppliedChanges() {
    return appliedChanges;
  }

  public void setAppliedChanges(@javax.annotation.Nullable List<EorTimeoffsBaseItem> appliedChanges) {
    this.appliedChanges = appliedChanges;
  }


  public EorTimeoffsItem reason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for requesting time off.
   * @return reason
   */
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }

  public void setReason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public EorTimeoffsItem type(@javax.annotation.Nonnull TimeoffsTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public TimeoffsTypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TimeoffsTypeEnum type) {
    this.type = type;
  }


  public EorTimeoffsItem requestedAt(@javax.annotation.Nullable OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return requestedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(@javax.annotation.Nullable OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
  }


  public EorTimeoffsItem reviewedAt(@javax.annotation.Nullable OffsetDateTime reviewedAt) {
    this.reviewedAt = reviewedAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return reviewedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReviewedAt() {
    return reviewedAt;
  }

  public void setReviewedAt(@javax.annotation.Nullable OffsetDateTime reviewedAt) {
    this.reviewedAt = reviewedAt;
  }


  public EorTimeoffsItem denialReason(@javax.annotation.Nullable String denialReason) {
    this.denialReason = denialReason;
    return this;
  }

  /**
   * Reason why time off was denied.
   * @return denialReason
   */
  @javax.annotation.Nullable
  public String getDenialReason() {
    return denialReason;
  }

  public void setDenialReason(@javax.annotation.Nullable String denialReason) {
    this.denialReason = denialReason;
  }


  public EorTimeoffsItem hasMultipleDates(@javax.annotation.Nullable Boolean hasMultipleDates) {
    this.hasMultipleDates = hasMultipleDates;
    return this;
  }

  /**
   * Indicates if multiple time off days are requested.
   * @return hasMultipleDates
   */
  @javax.annotation.Nullable
  public Boolean getHasMultipleDates() {
    return hasMultipleDates;
  }

  public void setHasMultipleDates(@javax.annotation.Nullable Boolean hasMultipleDates) {
    this.hasMultipleDates = hasMultipleDates;
  }


  public EorTimeoffsItem status(@javax.annotation.Nonnull TimeoffsStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public TimeoffsStatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull TimeoffsStatusEnum status) {
    this.status = status;
  }


  public EorTimeoffsItem otherTimeoffName(@javax.annotation.Nullable String otherTimeoffName) {
    this.otherTimeoffName = otherTimeoffName;
    return this;
  }

  /**
   * Custom title for the time off. Only specify if type is \&quot;OTHER\&quot;.
   * @return otherTimeoffName
   */
  @javax.annotation.Nullable
  public String getOtherTimeoffName() {
    return otherTimeoffName;
  }

  public void setOtherTimeoffName(@javax.annotation.Nullable String otherTimeoffName) {
    this.otherTimeoffName = otherTimeoffName;
  }


  public EorTimeoffsItem requester(@javax.annotation.Nullable TimeoffsProfile requester) {
    this.requester = requester;
    return this;
  }

  /**
   * Get requester
   * @return requester
   */
  @javax.annotation.Nullable
  public TimeoffsProfile getRequester() {
    return requester;
  }

  public void setRequester(@javax.annotation.Nullable TimeoffsProfile requester) {
    this.requester = requester;
  }


  public EorTimeoffsItem reviewer(@javax.annotation.Nullable TimeoffsProfile reviewer) {
    this.reviewer = reviewer;
    return this;
  }

  /**
   * Get reviewer
   * @return reviewer
   */
  @javax.annotation.Nullable
  public TimeoffsProfile getReviewer() {
    return reviewer;
  }

  public void setReviewer(@javax.annotation.Nullable TimeoffsProfile reviewer) {
    this.reviewer = reviewer;
  }


  public EorTimeoffsItem daysUsedStartYear(@javax.annotation.Nullable String daysUsedStartYear) {
    this.daysUsedStartYear = daysUsedStartYear;
    return this;
  }

  /**
   * Days used at the start year.
   * @return daysUsedStartYear
   */
  @javax.annotation.Nullable
  public String getDaysUsedStartYear() {
    return daysUsedStartYear;
  }

  public void setDaysUsedStartYear(@javax.annotation.Nullable String daysUsedStartYear) {
    this.daysUsedStartYear = daysUsedStartYear;
  }


  public EorTimeoffsItem daysUsedEndYear(@javax.annotation.Nullable String daysUsedEndYear) {
    this.daysUsedEndYear = daysUsedEndYear;
    return this;
  }

  /**
   * Days used at the end year.
   * @return daysUsedEndYear
   */
  @javax.annotation.Nullable
  public String getDaysUsedEndYear() {
    return daysUsedEndYear;
  }

  public void setDaysUsedEndYear(@javax.annotation.Nullable String daysUsedEndYear) {
    this.daysUsedEndYear = daysUsedEndYear;
  }


  public EorTimeoffsItem totalDaysUsed(@javax.annotation.Nullable String totalDaysUsed) {
    this.totalDaysUsed = totalDaysUsed;
    return this;
  }

  /**
   * Total number of time off days used.
   * @return totalDaysUsed
   */
  @javax.annotation.Nullable
  public String getTotalDaysUsed() {
    return totalDaysUsed;
  }

  public void setTotalDaysUsed(@javax.annotation.Nullable String totalDaysUsed) {
    this.totalDaysUsed = totalDaysUsed;
  }


  public EorTimeoffsItem startDateIsHalfDay(@javax.annotation.Nullable Boolean startDateIsHalfDay) {
    this.startDateIsHalfDay = startDateIsHalfDay;
    return this;
  }

  /**
   * Indicates if the first day of time off is a half day.
   * @return startDateIsHalfDay
   */
  @javax.annotation.Nullable
  public Boolean getStartDateIsHalfDay() {
    return startDateIsHalfDay;
  }

  public void setStartDateIsHalfDay(@javax.annotation.Nullable Boolean startDateIsHalfDay) {
    this.startDateIsHalfDay = startDateIsHalfDay;
  }


  public EorTimeoffsItem endDateIsHalfDay(@javax.annotation.Nullable Boolean endDateIsHalfDay) {
    this.endDateIsHalfDay = endDateIsHalfDay;
    return this;
  }

  /**
   * Indicates if the last day of time off is a half day.
   * @return endDateIsHalfDay
   */
  @javax.annotation.Nullable
  public Boolean getEndDateIsHalfDay() {
    return endDateIsHalfDay;
  }

  public void setEndDateIsHalfDay(@javax.annotation.Nullable Boolean endDateIsHalfDay) {
    this.endDateIsHalfDay = endDateIsHalfDay;
  }


  public EorTimeoffsItem singleDate(@javax.annotation.Nullable OffsetDateTime singleDate) {
    this.singleDate = singleDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return singleDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSingleDate() {
    return singleDate;
  }

  public void setSingleDate(@javax.annotation.Nullable OffsetDateTime singleDate) {
    this.singleDate = singleDate;
  }


  public EorTimeoffsItem dateIsHalfDay(@javax.annotation.Nullable Boolean dateIsHalfDay) {
    this.dateIsHalfDay = dateIsHalfDay;
    return this;
  }

  /**
   * If true, only a single date was specified.
   * @return dateIsHalfDay
   */
  @javax.annotation.Nullable
  public Boolean getDateIsHalfDay() {
    return dateIsHalfDay;
  }

  public void setDateIsHalfDay(@javax.annotation.Nullable Boolean dateIsHalfDay) {
    this.dateIsHalfDay = dateIsHalfDay;
  }


  public EorTimeoffsItem attachments(@javax.annotation.Nullable List<TimeoffsAttachmentsItem> attachments) {
    this.attachments = attachments;
    return this;
  }

  public EorTimeoffsItem addAttachmentsItem(TimeoffsAttachmentsItem attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * A list of attachments. 2022-09-08 FE only allows for \&quot;SICK LEAVE\&quot;
   * @return attachments
   */
  @javax.annotation.Nullable
  public List<TimeoffsAttachmentsItem> getAttachments() {
    return attachments;
  }

  public void setAttachments(@javax.annotation.Nullable List<TimeoffsAttachmentsItem> attachments) {
    this.attachments = attachments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorTimeoffsItem eorTimeoffsItem = (EorTimeoffsItem) o;
    return Objects.equals(this.id, eorTimeoffsItem.id) &&
        Objects.equals(this.contractId, eorTimeoffsItem.contractId) &&
        Objects.equals(this.createdAt, eorTimeoffsItem.createdAt) &&
        Objects.equals(this.updatedAt, eorTimeoffsItem.updatedAt) &&
        Objects.equals(this.startDate, eorTimeoffsItem.startDate) &&
        Objects.equals(this.endDate, eorTimeoffsItem.endDate) &&
        Objects.equals(this.canRequestChanges, eorTimeoffsItem.canRequestChanges) &&
        Objects.equals(this.isUpdated, eorTimeoffsItem.isUpdated) &&
        Objects.equals(this.changeRequest, eorTimeoffsItem.changeRequest) &&
        Objects.equals(this.appliedChanges, eorTimeoffsItem.appliedChanges) &&
        Objects.equals(this.reason, eorTimeoffsItem.reason) &&
        Objects.equals(this.type, eorTimeoffsItem.type) &&
        Objects.equals(this.requestedAt, eorTimeoffsItem.requestedAt) &&
        Objects.equals(this.reviewedAt, eorTimeoffsItem.reviewedAt) &&
        Objects.equals(this.denialReason, eorTimeoffsItem.denialReason) &&
        Objects.equals(this.hasMultipleDates, eorTimeoffsItem.hasMultipleDates) &&
        Objects.equals(this.status, eorTimeoffsItem.status) &&
        Objects.equals(this.otherTimeoffName, eorTimeoffsItem.otherTimeoffName) &&
        Objects.equals(this.requester, eorTimeoffsItem.requester) &&
        Objects.equals(this.reviewer, eorTimeoffsItem.reviewer) &&
        Objects.equals(this.daysUsedStartYear, eorTimeoffsItem.daysUsedStartYear) &&
        Objects.equals(this.daysUsedEndYear, eorTimeoffsItem.daysUsedEndYear) &&
        Objects.equals(this.totalDaysUsed, eorTimeoffsItem.totalDaysUsed) &&
        Objects.equals(this.startDateIsHalfDay, eorTimeoffsItem.startDateIsHalfDay) &&
        Objects.equals(this.endDateIsHalfDay, eorTimeoffsItem.endDateIsHalfDay) &&
        Objects.equals(this.singleDate, eorTimeoffsItem.singleDate) &&
        Objects.equals(this.dateIsHalfDay, eorTimeoffsItem.dateIsHalfDay) &&
        Objects.equals(this.attachments, eorTimeoffsItem.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contractId, createdAt, updatedAt, startDate, endDate, canRequestChanges, isUpdated, changeRequest, appliedChanges, reason, type, requestedAt, reviewedAt, denialReason, hasMultipleDates, status, otherTimeoffName, requester, reviewer, daysUsedStartYear, daysUsedEndYear, totalDaysUsed, startDateIsHalfDay, endDateIsHalfDay, singleDate, dateIsHalfDay, attachments);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorTimeoffsItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    canRequestChanges: ").append(toIndentedString(canRequestChanges)).append("\n");
    sb.append("    isUpdated: ").append(toIndentedString(isUpdated)).append("\n");
    sb.append("    changeRequest: ").append(toIndentedString(changeRequest)).append("\n");
    sb.append("    appliedChanges: ").append(toIndentedString(appliedChanges)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
    sb.append("    reviewedAt: ").append(toIndentedString(reviewedAt)).append("\n");
    sb.append("    denialReason: ").append(toIndentedString(denialReason)).append("\n");
    sb.append("    hasMultipleDates: ").append(toIndentedString(hasMultipleDates)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    otherTimeoffName: ").append(toIndentedString(otherTimeoffName)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
    sb.append("    daysUsedStartYear: ").append(toIndentedString(daysUsedStartYear)).append("\n");
    sb.append("    daysUsedEndYear: ").append(toIndentedString(daysUsedEndYear)).append("\n");
    sb.append("    totalDaysUsed: ").append(toIndentedString(totalDaysUsed)).append("\n");
    sb.append("    startDateIsHalfDay: ").append(toIndentedString(startDateIsHalfDay)).append("\n");
    sb.append("    endDateIsHalfDay: ").append(toIndentedString(endDateIsHalfDay)).append("\n");
    sb.append("    singleDate: ").append(toIndentedString(singleDate)).append("\n");
    sb.append("    dateIsHalfDay: ").append(toIndentedString(dateIsHalfDay)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("type");
    openapiFields.add("requested_at");
    openapiFields.add("reviewed_at");
    openapiFields.add("denial_reason");
    openapiFields.add("has_multiple_dates");
    openapiFields.add("status");
    openapiFields.add("other_timeoff_name");
    openapiFields.add("requester");
    openapiFields.add("reviewer");
    openapiFields.add("days_used_start_year");
    openapiFields.add("days_used_end_year");
    openapiFields.add("total_days_used");
    openapiFields.add("start_date_is_half_day");
    openapiFields.add("end_date_is_half_day");
    openapiFields.add("single_date");
    openapiFields.add("date_is_half_day");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("requested_at");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorTimeoffsItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorTimeoffsItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorTimeoffsItem is not found in the empty JSON string", EorTimeoffsItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorTimeoffsItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorTimeoffsItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EorTimeoffsItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("contract_id") != null && !jsonObj.get("contract_id").isJsonNull()) && !jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      // validate the optional field `change_request`
      if (jsonObj.get("change_request") != null && !jsonObj.get("change_request").isJsonNull()) {
        EorTimeoffsBaseItem.validateJsonElement(jsonObj.get("change_request"));
      }
      if (jsonObj.get("applied_changes") != null && !jsonObj.get("applied_changes").isJsonNull()) {
        JsonArray jsonArrayappliedChanges = jsonObj.getAsJsonArray("applied_changes");
        if (jsonArrayappliedChanges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("applied_changes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `applied_changes` to be an array in the JSON string but got `%s`", jsonObj.get("applied_changes").toString()));
          }

          // validate the optional field `applied_changes` (array)
          for (int i = 0; i < jsonArrayappliedChanges.size(); i++) {
            EorTimeoffsBaseItem.validateJsonElement(jsonArrayappliedChanges.get(i));
          };
        }
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      // validate the required field `type`
      TimeoffsTypeEnum.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("denial_reason") != null && !jsonObj.get("denial_reason").isJsonNull()) && !jsonObj.get("denial_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `denial_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("denial_reason").toString()));
      }
      // validate the required field `status`
      TimeoffsStatusEnum.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("other_timeoff_name") != null && !jsonObj.get("other_timeoff_name").isJsonNull()) && !jsonObj.get("other_timeoff_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_timeoff_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_timeoff_name").toString()));
      }
      // validate the optional field `requester`
      if (jsonObj.get("requester") != null && !jsonObj.get("requester").isJsonNull()) {
        TimeoffsProfile.validateJsonElement(jsonObj.get("requester"));
      }
      // validate the optional field `reviewer`
      if (jsonObj.get("reviewer") != null && !jsonObj.get("reviewer").isJsonNull()) {
        TimeoffsProfile.validateJsonElement(jsonObj.get("reviewer"));
      }
      if ((jsonObj.get("days_used_start_year") != null && !jsonObj.get("days_used_start_year").isJsonNull()) && !jsonObj.get("days_used_start_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days_used_start_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days_used_start_year").toString()));
      }
      if ((jsonObj.get("days_used_end_year") != null && !jsonObj.get("days_used_end_year").isJsonNull()) && !jsonObj.get("days_used_end_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days_used_end_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days_used_end_year").toString()));
      }
      if ((jsonObj.get("total_days_used") != null && !jsonObj.get("total_days_used").isJsonNull()) && !jsonObj.get("total_days_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_days_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_days_used").toString()));
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
            TimeoffsAttachmentsItem.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorTimeoffsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorTimeoffsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorTimeoffsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorTimeoffsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EorTimeoffsItem>() {
           @Override
           public void write(JsonWriter out, EorTimeoffsItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorTimeoffsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorTimeoffsItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorTimeoffsItem
   * @throws IOException if the JSON string is invalid with respect to EorTimeoffsItem
   */
  public static EorTimeoffsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorTimeoffsItem.class);
  }

  /**
   * Convert an instance of EorTimeoffsItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

