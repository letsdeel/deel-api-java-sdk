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
 * EorTimeoffsBaseItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:16:06.545846627Z[GMT]", comments = "Generator version: 7.10.0")
public class EorTimeoffsBaseItem {
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

  public EorTimeoffsBaseItem() {
  }

  public EorTimeoffsBaseItem reason(@javax.annotation.Nullable String reason) {
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


  public EorTimeoffsBaseItem type(@javax.annotation.Nonnull TimeoffsTypeEnum type) {
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


  public EorTimeoffsBaseItem requestedAt(@javax.annotation.Nullable OffsetDateTime requestedAt) {
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


  public EorTimeoffsBaseItem reviewedAt(@javax.annotation.Nullable OffsetDateTime reviewedAt) {
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


  public EorTimeoffsBaseItem denialReason(@javax.annotation.Nullable String denialReason) {
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


  public EorTimeoffsBaseItem hasMultipleDates(@javax.annotation.Nullable Boolean hasMultipleDates) {
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


  public EorTimeoffsBaseItem status(@javax.annotation.Nonnull TimeoffsStatusEnum status) {
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


  public EorTimeoffsBaseItem otherTimeoffName(@javax.annotation.Nullable String otherTimeoffName) {
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


  public EorTimeoffsBaseItem requester(@javax.annotation.Nullable TimeoffsProfile requester) {
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


  public EorTimeoffsBaseItem reviewer(@javax.annotation.Nullable TimeoffsProfile reviewer) {
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


  public EorTimeoffsBaseItem daysUsedStartYear(@javax.annotation.Nullable String daysUsedStartYear) {
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


  public EorTimeoffsBaseItem daysUsedEndYear(@javax.annotation.Nullable String daysUsedEndYear) {
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


  public EorTimeoffsBaseItem totalDaysUsed(@javax.annotation.Nullable String totalDaysUsed) {
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


  public EorTimeoffsBaseItem startDateIsHalfDay(@javax.annotation.Nullable Boolean startDateIsHalfDay) {
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


  public EorTimeoffsBaseItem endDateIsHalfDay(@javax.annotation.Nullable Boolean endDateIsHalfDay) {
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


  public EorTimeoffsBaseItem singleDate(@javax.annotation.Nullable OffsetDateTime singleDate) {
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


  public EorTimeoffsBaseItem dateIsHalfDay(@javax.annotation.Nullable Boolean dateIsHalfDay) {
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


  public EorTimeoffsBaseItem attachments(@javax.annotation.Nullable List<TimeoffsAttachmentsItem> attachments) {
    this.attachments = attachments;
    return this;
  }

  public EorTimeoffsBaseItem addAttachmentsItem(TimeoffsAttachmentsItem attachmentsItem) {
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
    EorTimeoffsBaseItem eorTimeoffsBaseItem = (EorTimeoffsBaseItem) o;
    return Objects.equals(this.reason, eorTimeoffsBaseItem.reason) &&
        Objects.equals(this.type, eorTimeoffsBaseItem.type) &&
        Objects.equals(this.requestedAt, eorTimeoffsBaseItem.requestedAt) &&
        Objects.equals(this.reviewedAt, eorTimeoffsBaseItem.reviewedAt) &&
        Objects.equals(this.denialReason, eorTimeoffsBaseItem.denialReason) &&
        Objects.equals(this.hasMultipleDates, eorTimeoffsBaseItem.hasMultipleDates) &&
        Objects.equals(this.status, eorTimeoffsBaseItem.status) &&
        Objects.equals(this.otherTimeoffName, eorTimeoffsBaseItem.otherTimeoffName) &&
        Objects.equals(this.requester, eorTimeoffsBaseItem.requester) &&
        Objects.equals(this.reviewer, eorTimeoffsBaseItem.reviewer) &&
        Objects.equals(this.daysUsedStartYear, eorTimeoffsBaseItem.daysUsedStartYear) &&
        Objects.equals(this.daysUsedEndYear, eorTimeoffsBaseItem.daysUsedEndYear) &&
        Objects.equals(this.totalDaysUsed, eorTimeoffsBaseItem.totalDaysUsed) &&
        Objects.equals(this.startDateIsHalfDay, eorTimeoffsBaseItem.startDateIsHalfDay) &&
        Objects.equals(this.endDateIsHalfDay, eorTimeoffsBaseItem.endDateIsHalfDay) &&
        Objects.equals(this.singleDate, eorTimeoffsBaseItem.singleDate) &&
        Objects.equals(this.dateIsHalfDay, eorTimeoffsBaseItem.dateIsHalfDay) &&
        Objects.equals(this.attachments, eorTimeoffsBaseItem.attachments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, type, requestedAt, reviewedAt, denialReason, hasMultipleDates, status, otherTimeoffName, requester, reviewer, daysUsedStartYear, daysUsedEndYear, totalDaysUsed, startDateIsHalfDay, endDateIsHalfDay, singleDate, dateIsHalfDay, attachments);
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
    sb.append("class EorTimeoffsBaseItem {\n");
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
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("requested_at");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorTimeoffsBaseItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorTimeoffsBaseItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorTimeoffsBaseItem is not found in the empty JSON string", EorTimeoffsBaseItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorTimeoffsBaseItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorTimeoffsBaseItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EorTimeoffsBaseItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
       if (!EorTimeoffsBaseItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorTimeoffsBaseItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorTimeoffsBaseItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorTimeoffsBaseItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EorTimeoffsBaseItem>() {
           @Override
           public void write(JsonWriter out, EorTimeoffsBaseItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorTimeoffsBaseItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorTimeoffsBaseItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorTimeoffsBaseItem
   * @throws IOException if the JSON string is invalid with respect to EorTimeoffsBaseItem
   */
  public static EorTimeoffsBaseItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorTimeoffsBaseItem.class);
  }

  /**
   * Convert an instance of EorTimeoffsBaseItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

