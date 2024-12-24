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
import java.util.UUID;
import org.openapitools.client.model.ProfileReference;
import org.openapitools.client.model.TimeOffDaily;
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
 * TimeOffResponseCommon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class TimeOffResponseCommon {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_RECIPIENT_PROFILE = "recipient_profile";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_PROFILE)
  @javax.annotation.Nullable
  private ProfileReference recipientProfile;

  public static final String SERIALIZED_NAME_REQUESTER_PROFILE = "requester_profile";
  @SerializedName(SERIALIZED_NAME_REQUESTER_PROFILE)
  @javax.annotation.Nullable
  private ProfileReference requesterProfile;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE_ID = "time_off_type_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE_ID)
  @javax.annotation.Nonnull
  private String timeOffTypeId;

  public static final String SERIALIZED_NAME_REQUESTED_AT = "requested_at";
  @SerializedName(SERIALIZED_NAME_REQUESTED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime requestedAt;

  public static final String SERIALIZED_NAME_OTHER_TYPE_DESCRIPTION = "other_type_description";
  @SerializedName(SERIALIZED_NAME_OTHER_TYPE_DESCRIPTION)
  @javax.annotation.Nullable
  private String otherTypeDescription;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @javax.annotation.Nullable
  private String reason;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    REQUESTED("REQUESTED"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED"),
    
    USED("USED"),
    
    CANCELED("CANCELED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_DEDUCTION_AMOUNT = "deduction_amount";
  @SerializedName(SERIALIZED_NAME_DEDUCTION_AMOUNT)
  @javax.annotation.Nullable
  private Float deductionAmount;

  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  @javax.annotation.Nonnull
  private Boolean isPaid;

  public static final String SERIALIZED_NAME_HALF_START_DATE = "half_start_date";
  @SerializedName(SERIALIZED_NAME_HALF_START_DATE)
  @javax.annotation.Nonnull
  private Boolean halfStartDate;

  public static final String SERIALIZED_NAME_HALF_END_DATE = "half_end_date";
  @SerializedName(SERIALIZED_NAME_HALF_END_DATE)
  @javax.annotation.Nonnull
  private Boolean halfEndDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private Float amount;

  public static final String SERIALIZED_NAME_CONTRACT_OID = "contract_oid";
  @SerializedName(SERIALIZED_NAME_CONTRACT_OID)
  @javax.annotation.Nullable
  private String contractOid;

  public static final String SERIALIZED_NAME_APPROVED_AT = "approved_at";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime approvedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_TIME_OFF_DAILIES = "time_off_dailies";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_DAILIES)
  @javax.annotation.Nullable
  private List<TimeOffDaily> timeOffDailies = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIME_OFF_PERCENTAGE = "time_off_percentage";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_PERCENTAGE)
  @javax.annotation.Nullable
  private Float timeOffPercentage;

  public static final String SERIALIZED_NAME_IS_END_DATE_ESTIMATED = "is_end_date_estimated";
  @SerializedName(SERIALIZED_NAME_IS_END_DATE_ESTIMATED)
  @javax.annotation.Nullable
  private Boolean isEndDateEstimated;

  public TimeOffResponseCommon() {
  }

  public TimeOffResponseCommon id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public TimeOffResponseCommon recipientProfile(@javax.annotation.Nullable ProfileReference recipientProfile) {
    this.recipientProfile = recipientProfile;
    return this;
  }

  /**
   * Get recipientProfile
   * @return recipientProfile
   */
  @javax.annotation.Nullable
  public ProfileReference getRecipientProfile() {
    return recipientProfile;
  }

  public void setRecipientProfile(@javax.annotation.Nullable ProfileReference recipientProfile) {
    this.recipientProfile = recipientProfile;
  }


  public TimeOffResponseCommon requesterProfile(@javax.annotation.Nullable ProfileReference requesterProfile) {
    this.requesterProfile = requesterProfile;
    return this;
  }

  /**
   * Get requesterProfile
   * @return requesterProfile
   */
  @javax.annotation.Nullable
  public ProfileReference getRequesterProfile() {
    return requesterProfile;
  }

  public void setRequesterProfile(@javax.annotation.Nullable ProfileReference requesterProfile) {
    this.requesterProfile = requesterProfile;
  }


  public TimeOffResponseCommon timeOffTypeId(@javax.annotation.Nonnull String timeOffTypeId) {
    this.timeOffTypeId = timeOffTypeId;
    return this;
  }

  /**
   * Get timeOffTypeId
   * @return timeOffTypeId
   */
  @javax.annotation.Nonnull
  public String getTimeOffTypeId() {
    return timeOffTypeId;
  }

  public void setTimeOffTypeId(@javax.annotation.Nonnull String timeOffTypeId) {
    this.timeOffTypeId = timeOffTypeId;
  }


  public TimeOffResponseCommon requestedAt(@javax.annotation.Nonnull OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * Get requestedAt
   * @return requestedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(@javax.annotation.Nonnull OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
  }


  public TimeOffResponseCommon otherTypeDescription(@javax.annotation.Nullable String otherTypeDescription) {
    this.otherTypeDescription = otherTypeDescription;
    return this;
  }

  /**
   * Get otherTypeDescription
   * @return otherTypeDescription
   */
  @javax.annotation.Nullable
  public String getOtherTypeDescription() {
    return otherTypeDescription;
  }

  public void setOtherTypeDescription(@javax.annotation.Nullable String otherTypeDescription) {
    this.otherTypeDescription = otherTypeDescription;
  }


  public TimeOffResponseCommon description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public TimeOffResponseCommon reason(@javax.annotation.Nullable String reason) {
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


  public TimeOffResponseCommon status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public TimeOffResponseCommon startDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public TimeOffResponseCommon endDate(@javax.annotation.Nonnull OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nonnull OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public TimeOffResponseCommon deductionAmount(@javax.annotation.Nullable Float deductionAmount) {
    this.deductionAmount = deductionAmount;
    return this;
  }

  /**
   * Get deductionAmount
   * @return deductionAmount
   */
  @javax.annotation.Nullable
  public Float getDeductionAmount() {
    return deductionAmount;
  }

  public void setDeductionAmount(@javax.annotation.Nullable Float deductionAmount) {
    this.deductionAmount = deductionAmount;
  }


  public TimeOffResponseCommon isPaid(@javax.annotation.Nonnull Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  /**
   * Get isPaid
   * @return isPaid
   */
  @javax.annotation.Nonnull
  public Boolean getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(@javax.annotation.Nonnull Boolean isPaid) {
    this.isPaid = isPaid;
  }


  public TimeOffResponseCommon halfStartDate(@javax.annotation.Nonnull Boolean halfStartDate) {
    this.halfStartDate = halfStartDate;
    return this;
  }

  /**
   * Get halfStartDate
   * @return halfStartDate
   */
  @javax.annotation.Nonnull
  public Boolean getHalfStartDate() {
    return halfStartDate;
  }

  public void setHalfStartDate(@javax.annotation.Nonnull Boolean halfStartDate) {
    this.halfStartDate = halfStartDate;
  }


  public TimeOffResponseCommon halfEndDate(@javax.annotation.Nonnull Boolean halfEndDate) {
    this.halfEndDate = halfEndDate;
    return this;
  }

  /**
   * Get halfEndDate
   * @return halfEndDate
   */
  @javax.annotation.Nonnull
  public Boolean getHalfEndDate() {
    return halfEndDate;
  }

  public void setHalfEndDate(@javax.annotation.Nonnull Boolean halfEndDate) {
    this.halfEndDate = halfEndDate;
  }


  public TimeOffResponseCommon amount(@javax.annotation.Nonnull Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  public Float getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull Float amount) {
    this.amount = amount;
  }


  public TimeOffResponseCommon contractOid(@javax.annotation.Nullable String contractOid) {
    this.contractOid = contractOid;
    return this;
  }

  /**
   * Get contractOid
   * @return contractOid
   */
  @javax.annotation.Nullable
  public String getContractOid() {
    return contractOid;
  }

  public void setContractOid(@javax.annotation.Nullable String contractOid) {
    this.contractOid = contractOid;
  }


  public TimeOffResponseCommon approvedAt(@javax.annotation.Nullable OffsetDateTime approvedAt) {
    this.approvedAt = approvedAt;
    return this;
  }

  /**
   * Get approvedAt
   * @return approvedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getApprovedAt() {
    return approvedAt;
  }

  public void setApprovedAt(@javax.annotation.Nullable OffsetDateTime approvedAt) {
    this.approvedAt = approvedAt;
  }


  public TimeOffResponseCommon createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TimeOffResponseCommon updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public TimeOffResponseCommon timeOffDailies(@javax.annotation.Nullable List<TimeOffDaily> timeOffDailies) {
    this.timeOffDailies = timeOffDailies;
    return this;
  }

  public TimeOffResponseCommon addTimeOffDailiesItem(TimeOffDaily timeOffDailiesItem) {
    if (this.timeOffDailies == null) {
      this.timeOffDailies = new ArrayList<>();
    }
    this.timeOffDailies.add(timeOffDailiesItem);
    return this;
  }

  /**
   * Get timeOffDailies
   * @return timeOffDailies
   */
  @javax.annotation.Nullable
  public List<TimeOffDaily> getTimeOffDailies() {
    return timeOffDailies;
  }

  public void setTimeOffDailies(@javax.annotation.Nullable List<TimeOffDaily> timeOffDailies) {
    this.timeOffDailies = timeOffDailies;
  }


  public TimeOffResponseCommon timeOffPercentage(@javax.annotation.Nullable Float timeOffPercentage) {
    this.timeOffPercentage = timeOffPercentage;
    return this;
  }

  /**
   * Get timeOffPercentage
   * @return timeOffPercentage
   */
  @javax.annotation.Nullable
  public Float getTimeOffPercentage() {
    return timeOffPercentage;
  }

  public void setTimeOffPercentage(@javax.annotation.Nullable Float timeOffPercentage) {
    this.timeOffPercentage = timeOffPercentage;
  }


  public TimeOffResponseCommon isEndDateEstimated(@javax.annotation.Nullable Boolean isEndDateEstimated) {
    this.isEndDateEstimated = isEndDateEstimated;
    return this;
  }

  /**
   * Get isEndDateEstimated
   * @return isEndDateEstimated
   */
  @javax.annotation.Nullable
  public Boolean getIsEndDateEstimated() {
    return isEndDateEstimated;
  }

  public void setIsEndDateEstimated(@javax.annotation.Nullable Boolean isEndDateEstimated) {
    this.isEndDateEstimated = isEndDateEstimated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffResponseCommon timeOffResponseCommon = (TimeOffResponseCommon) o;
    return Objects.equals(this.id, timeOffResponseCommon.id) &&
        Objects.equals(this.recipientProfile, timeOffResponseCommon.recipientProfile) &&
        Objects.equals(this.requesterProfile, timeOffResponseCommon.requesterProfile) &&
        Objects.equals(this.timeOffTypeId, timeOffResponseCommon.timeOffTypeId) &&
        Objects.equals(this.requestedAt, timeOffResponseCommon.requestedAt) &&
        Objects.equals(this.otherTypeDescription, timeOffResponseCommon.otherTypeDescription) &&
        Objects.equals(this.description, timeOffResponseCommon.description) &&
        Objects.equals(this.reason, timeOffResponseCommon.reason) &&
        Objects.equals(this.status, timeOffResponseCommon.status) &&
        Objects.equals(this.startDate, timeOffResponseCommon.startDate) &&
        Objects.equals(this.endDate, timeOffResponseCommon.endDate) &&
        Objects.equals(this.deductionAmount, timeOffResponseCommon.deductionAmount) &&
        Objects.equals(this.isPaid, timeOffResponseCommon.isPaid) &&
        Objects.equals(this.halfStartDate, timeOffResponseCommon.halfStartDate) &&
        Objects.equals(this.halfEndDate, timeOffResponseCommon.halfEndDate) &&
        Objects.equals(this.amount, timeOffResponseCommon.amount) &&
        Objects.equals(this.contractOid, timeOffResponseCommon.contractOid) &&
        Objects.equals(this.approvedAt, timeOffResponseCommon.approvedAt) &&
        Objects.equals(this.createdAt, timeOffResponseCommon.createdAt) &&
        Objects.equals(this.updatedAt, timeOffResponseCommon.updatedAt) &&
        Objects.equals(this.timeOffDailies, timeOffResponseCommon.timeOffDailies) &&
        Objects.equals(this.timeOffPercentage, timeOffResponseCommon.timeOffPercentage) &&
        Objects.equals(this.isEndDateEstimated, timeOffResponseCommon.isEndDateEstimated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recipientProfile, requesterProfile, timeOffTypeId, requestedAt, otherTypeDescription, description, reason, status, startDate, endDate, deductionAmount, isPaid, halfStartDate, halfEndDate, amount, contractOid, approvedAt, createdAt, updatedAt, timeOffDailies, timeOffPercentage, isEndDateEstimated);
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
    sb.append("class TimeOffResponseCommon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipientProfile: ").append(toIndentedString(recipientProfile)).append("\n");
    sb.append("    requesterProfile: ").append(toIndentedString(requesterProfile)).append("\n");
    sb.append("    timeOffTypeId: ").append(toIndentedString(timeOffTypeId)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
    sb.append("    otherTypeDescription: ").append(toIndentedString(otherTypeDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    deductionAmount: ").append(toIndentedString(deductionAmount)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    halfStartDate: ").append(toIndentedString(halfStartDate)).append("\n");
    sb.append("    halfEndDate: ").append(toIndentedString(halfEndDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    contractOid: ").append(toIndentedString(contractOid)).append("\n");
    sb.append("    approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    timeOffDailies: ").append(toIndentedString(timeOffDailies)).append("\n");
    sb.append("    timeOffPercentage: ").append(toIndentedString(timeOffPercentage)).append("\n");
    sb.append("    isEndDateEstimated: ").append(toIndentedString(isEndDateEstimated)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("recipient_profile");
    openapiFields.add("requester_profile");
    openapiFields.add("time_off_type_id");
    openapiFields.add("requested_at");
    openapiFields.add("other_type_description");
    openapiFields.add("description");
    openapiFields.add("reason");
    openapiFields.add("status");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("deduction_amount");
    openapiFields.add("is_paid");
    openapiFields.add("half_start_date");
    openapiFields.add("half_end_date");
    openapiFields.add("amount");
    openapiFields.add("contract_oid");
    openapiFields.add("approved_at");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("time_off_dailies");
    openapiFields.add("time_off_percentage");
    openapiFields.add("is_end_date_estimated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("time_off_type_id");
    openapiRequiredFields.add("requested_at");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("is_paid");
    openapiRequiredFields.add("half_start_date");
    openapiRequiredFields.add("half_end_date");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeOffResponseCommon
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeOffResponseCommon.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeOffResponseCommon is not found in the empty JSON string", TimeOffResponseCommon.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeOffResponseCommon.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeOffResponseCommon` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeOffResponseCommon.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `recipient_profile`
      if (jsonObj.get("recipient_profile") != null && !jsonObj.get("recipient_profile").isJsonNull()) {
        ProfileReference.validateJsonElement(jsonObj.get("recipient_profile"));
      }
      // validate the optional field `requester_profile`
      if (jsonObj.get("requester_profile") != null && !jsonObj.get("requester_profile").isJsonNull()) {
        ProfileReference.validateJsonElement(jsonObj.get("requester_profile"));
      }
      if (!jsonObj.get("time_off_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_type_id").toString()));
      }
      if ((jsonObj.get("other_type_description") != null && !jsonObj.get("other_type_description").isJsonNull()) && !jsonObj.get("other_type_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_type_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_type_description").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("contract_oid") != null && !jsonObj.get("contract_oid").isJsonNull()) && !jsonObj.get("contract_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_oid").toString()));
      }
      if (jsonObj.get("time_off_dailies") != null && !jsonObj.get("time_off_dailies").isJsonNull()) {
        JsonArray jsonArraytimeOffDailies = jsonObj.getAsJsonArray("time_off_dailies");
        if (jsonArraytimeOffDailies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("time_off_dailies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `time_off_dailies` to be an array in the JSON string but got `%s`", jsonObj.get("time_off_dailies").toString()));
          }

          // validate the optional field `time_off_dailies` (array)
          for (int i = 0; i < jsonArraytimeOffDailies.size(); i++) {
            TimeOffDaily.validateJsonElement(jsonArraytimeOffDailies.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeOffResponseCommon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeOffResponseCommon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeOffResponseCommon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeOffResponseCommon.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeOffResponseCommon>() {
           @Override
           public void write(JsonWriter out, TimeOffResponseCommon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeOffResponseCommon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeOffResponseCommon given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeOffResponseCommon
   * @throws IOException if the JSON string is invalid with respect to TimeOffResponseCommon
   */
  public static TimeOffResponseCommon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeOffResponseCommon.class);
  }

  /**
   * Convert an instance of TimeOffResponseCommon to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

