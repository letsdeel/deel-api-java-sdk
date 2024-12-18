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
import org.openapitools.client.model.UpdateTimeOff200ResponseTimeOffRecipientProfile;
import org.openapitools.client.model.UpdateTimeOff200ResponseTimeOffTimeOffDailiesInner;
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
 * Updated time off request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateTimeOff200ResponseTimeOff {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private Float amount;

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

  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  @javax.annotation.Nonnull
  private Boolean isPaid;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_APPROVED_AT = "approved_at";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime approvedAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_CONTRACT_OID = "contract_oid";
  @SerializedName(SERIALIZED_NAME_CONTRACT_OID)
  @javax.annotation.Nullable
  private String contractOid;

  public static final String SERIALIZED_NAME_REQUESTED_AT = "requested_at";
  @SerializedName(SERIALIZED_NAME_REQUESTED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime requestedAt;

  public static final String SERIALIZED_NAME_HALF_END_DATE = "half_end_date";
  @SerializedName(SERIALIZED_NAME_HALF_END_DATE)
  @javax.annotation.Nonnull
  private Boolean halfEndDate;

  public static final String SERIALIZED_NAME_HALF_START_DATE = "half_start_date";
  @SerializedName(SERIALIZED_NAME_HALF_START_DATE)
  @javax.annotation.Nonnull
  private Boolean halfStartDate;

  public static final String SERIALIZED_NAME_DEDUCTION_AMOUNT = "deduction_amount";
  @SerializedName(SERIALIZED_NAME_DEDUCTION_AMOUNT)
  @javax.annotation.Nullable
  private Float deductionAmount;

  public static final String SERIALIZED_NAME_TIME_OFF_DAILIES = "time_off_dailies";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_DAILIES)
  @javax.annotation.Nullable
  private List<UpdateTimeOff200ResponseTimeOffTimeOffDailiesInner> timeOffDailies = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE_ID = "time_off_type_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE_ID)
  @javax.annotation.Nonnull
  private String timeOffTypeId;

  public static final String SERIALIZED_NAME_RECIPIENT_PROFILE = "recipient_profile";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_PROFILE)
  @javax.annotation.Nullable
  private UpdateTimeOff200ResponseTimeOffRecipientProfile recipientProfile;

  public static final String SERIALIZED_NAME_REQUESTER_PROFILE = "requester_profile";
  @SerializedName(SERIALIZED_NAME_REQUESTER_PROFILE)
  @javax.annotation.Nullable
  private UpdateTimeOff200ResponseTimeOffRecipientProfile requesterProfile;

  public static final String SERIALIZED_NAME_TIME_OFF_PERCENTAGE = "time_off_percentage";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_PERCENTAGE)
  @javax.annotation.Nullable
  private Float timeOffPercentage;

  public static final String SERIALIZED_NAME_IS_END_DATE_ESTIMATED = "is_end_date_estimated";
  @SerializedName(SERIALIZED_NAME_IS_END_DATE_ESTIMATED)
  @javax.annotation.Nullable
  private Boolean isEndDateEstimated;

  public static final String SERIALIZED_NAME_OTHER_TYPE_DESCRIPTION = "other_type_description";
  @SerializedName(SERIALIZED_NAME_OTHER_TYPE_DESCRIPTION)
  @javax.annotation.Nullable
  private String otherTypeDescription;

  public UpdateTimeOff200ResponseTimeOff() {
  }

  public UpdateTimeOff200ResponseTimeOff id(@javax.annotation.Nonnull UUID id) {
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


  public UpdateTimeOff200ResponseTimeOff amount(@javax.annotation.Nonnull Float amount) {
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


  public UpdateTimeOff200ResponseTimeOff reason(@javax.annotation.Nullable String reason) {
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


  public UpdateTimeOff200ResponseTimeOff status(@javax.annotation.Nullable StatusEnum status) {
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


  public UpdateTimeOff200ResponseTimeOff isPaid(@javax.annotation.Nonnull Boolean isPaid) {
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


  public UpdateTimeOff200ResponseTimeOff endDate(@javax.annotation.Nonnull OffsetDateTime endDate) {
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


  public UpdateTimeOff200ResponseTimeOff createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
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


  public UpdateTimeOff200ResponseTimeOff startDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
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


  public UpdateTimeOff200ResponseTimeOff updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
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


  public UpdateTimeOff200ResponseTimeOff approvedAt(@javax.annotation.Nullable OffsetDateTime approvedAt) {
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


  public UpdateTimeOff200ResponseTimeOff description(@javax.annotation.Nullable String description) {
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


  public UpdateTimeOff200ResponseTimeOff contractOid(@javax.annotation.Nullable String contractOid) {
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


  public UpdateTimeOff200ResponseTimeOff requestedAt(@javax.annotation.Nonnull OffsetDateTime requestedAt) {
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


  public UpdateTimeOff200ResponseTimeOff halfEndDate(@javax.annotation.Nonnull Boolean halfEndDate) {
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


  public UpdateTimeOff200ResponseTimeOff halfStartDate(@javax.annotation.Nonnull Boolean halfStartDate) {
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


  public UpdateTimeOff200ResponseTimeOff deductionAmount(@javax.annotation.Nullable Float deductionAmount) {
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


  public UpdateTimeOff200ResponseTimeOff timeOffDailies(@javax.annotation.Nullable List<UpdateTimeOff200ResponseTimeOffTimeOffDailiesInner> timeOffDailies) {
    this.timeOffDailies = timeOffDailies;
    return this;
  }

  public UpdateTimeOff200ResponseTimeOff addTimeOffDailiesItem(UpdateTimeOff200ResponseTimeOffTimeOffDailiesInner timeOffDailiesItem) {
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
  public List<UpdateTimeOff200ResponseTimeOffTimeOffDailiesInner> getTimeOffDailies() {
    return timeOffDailies;
  }

  public void setTimeOffDailies(@javax.annotation.Nullable List<UpdateTimeOff200ResponseTimeOffTimeOffDailiesInner> timeOffDailies) {
    this.timeOffDailies = timeOffDailies;
  }


  public UpdateTimeOff200ResponseTimeOff timeOffTypeId(@javax.annotation.Nonnull String timeOffTypeId) {
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


  public UpdateTimeOff200ResponseTimeOff recipientProfile(@javax.annotation.Nullable UpdateTimeOff200ResponseTimeOffRecipientProfile recipientProfile) {
    this.recipientProfile = recipientProfile;
    return this;
  }

  /**
   * Get recipientProfile
   * @return recipientProfile
   */
  @javax.annotation.Nullable
  public UpdateTimeOff200ResponseTimeOffRecipientProfile getRecipientProfile() {
    return recipientProfile;
  }

  public void setRecipientProfile(@javax.annotation.Nullable UpdateTimeOff200ResponseTimeOffRecipientProfile recipientProfile) {
    this.recipientProfile = recipientProfile;
  }


  public UpdateTimeOff200ResponseTimeOff requesterProfile(@javax.annotation.Nullable UpdateTimeOff200ResponseTimeOffRecipientProfile requesterProfile) {
    this.requesterProfile = requesterProfile;
    return this;
  }

  /**
   * Get requesterProfile
   * @return requesterProfile
   */
  @javax.annotation.Nullable
  public UpdateTimeOff200ResponseTimeOffRecipientProfile getRequesterProfile() {
    return requesterProfile;
  }

  public void setRequesterProfile(@javax.annotation.Nullable UpdateTimeOff200ResponseTimeOffRecipientProfile requesterProfile) {
    this.requesterProfile = requesterProfile;
  }


  public UpdateTimeOff200ResponseTimeOff timeOffPercentage(@javax.annotation.Nullable Float timeOffPercentage) {
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


  public UpdateTimeOff200ResponseTimeOff isEndDateEstimated(@javax.annotation.Nullable Boolean isEndDateEstimated) {
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


  public UpdateTimeOff200ResponseTimeOff otherTypeDescription(@javax.annotation.Nullable String otherTypeDescription) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTimeOff200ResponseTimeOff updateTimeOff200ResponseTimeOff = (UpdateTimeOff200ResponseTimeOff) o;
    return Objects.equals(this.id, updateTimeOff200ResponseTimeOff.id) &&
        Objects.equals(this.amount, updateTimeOff200ResponseTimeOff.amount) &&
        Objects.equals(this.reason, updateTimeOff200ResponseTimeOff.reason) &&
        Objects.equals(this.status, updateTimeOff200ResponseTimeOff.status) &&
        Objects.equals(this.isPaid, updateTimeOff200ResponseTimeOff.isPaid) &&
        Objects.equals(this.endDate, updateTimeOff200ResponseTimeOff.endDate) &&
        Objects.equals(this.createdAt, updateTimeOff200ResponseTimeOff.createdAt) &&
        Objects.equals(this.startDate, updateTimeOff200ResponseTimeOff.startDate) &&
        Objects.equals(this.updatedAt, updateTimeOff200ResponseTimeOff.updatedAt) &&
        Objects.equals(this.approvedAt, updateTimeOff200ResponseTimeOff.approvedAt) &&
        Objects.equals(this.description, updateTimeOff200ResponseTimeOff.description) &&
        Objects.equals(this.contractOid, updateTimeOff200ResponseTimeOff.contractOid) &&
        Objects.equals(this.requestedAt, updateTimeOff200ResponseTimeOff.requestedAt) &&
        Objects.equals(this.halfEndDate, updateTimeOff200ResponseTimeOff.halfEndDate) &&
        Objects.equals(this.halfStartDate, updateTimeOff200ResponseTimeOff.halfStartDate) &&
        Objects.equals(this.deductionAmount, updateTimeOff200ResponseTimeOff.deductionAmount) &&
        Objects.equals(this.timeOffDailies, updateTimeOff200ResponseTimeOff.timeOffDailies) &&
        Objects.equals(this.timeOffTypeId, updateTimeOff200ResponseTimeOff.timeOffTypeId) &&
        Objects.equals(this.recipientProfile, updateTimeOff200ResponseTimeOff.recipientProfile) &&
        Objects.equals(this.requesterProfile, updateTimeOff200ResponseTimeOff.requesterProfile) &&
        Objects.equals(this.timeOffPercentage, updateTimeOff200ResponseTimeOff.timeOffPercentage) &&
        Objects.equals(this.isEndDateEstimated, updateTimeOff200ResponseTimeOff.isEndDateEstimated) &&
        Objects.equals(this.otherTypeDescription, updateTimeOff200ResponseTimeOff.otherTypeDescription);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, reason, status, isPaid, endDate, createdAt, startDate, updatedAt, approvedAt, description, contractOid, requestedAt, halfEndDate, halfStartDate, deductionAmount, timeOffDailies, timeOffTypeId, recipientProfile, requesterProfile, timeOffPercentage, isEndDateEstimated, otherTypeDescription);
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
    sb.append("class UpdateTimeOff200ResponseTimeOff {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contractOid: ").append(toIndentedString(contractOid)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
    sb.append("    halfEndDate: ").append(toIndentedString(halfEndDate)).append("\n");
    sb.append("    halfStartDate: ").append(toIndentedString(halfStartDate)).append("\n");
    sb.append("    deductionAmount: ").append(toIndentedString(deductionAmount)).append("\n");
    sb.append("    timeOffDailies: ").append(toIndentedString(timeOffDailies)).append("\n");
    sb.append("    timeOffTypeId: ").append(toIndentedString(timeOffTypeId)).append("\n");
    sb.append("    recipientProfile: ").append(toIndentedString(recipientProfile)).append("\n");
    sb.append("    requesterProfile: ").append(toIndentedString(requesterProfile)).append("\n");
    sb.append("    timeOffPercentage: ").append(toIndentedString(timeOffPercentage)).append("\n");
    sb.append("    isEndDateEstimated: ").append(toIndentedString(isEndDateEstimated)).append("\n");
    sb.append("    otherTypeDescription: ").append(toIndentedString(otherTypeDescription)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("reason");
    openapiFields.add("status");
    openapiFields.add("is_paid");
    openapiFields.add("end_date");
    openapiFields.add("created_at");
    openapiFields.add("start_date");
    openapiFields.add("updated_at");
    openapiFields.add("approved_at");
    openapiFields.add("description");
    openapiFields.add("contract_oid");
    openapiFields.add("requested_at");
    openapiFields.add("half_end_date");
    openapiFields.add("half_start_date");
    openapiFields.add("deduction_amount");
    openapiFields.add("time_off_dailies");
    openapiFields.add("time_off_type_id");
    openapiFields.add("recipient_profile");
    openapiFields.add("requester_profile");
    openapiFields.add("time_off_percentage");
    openapiFields.add("is_end_date_estimated");
    openapiFields.add("other_type_description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("is_paid");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("requested_at");
    openapiRequiredFields.add("half_end_date");
    openapiRequiredFields.add("half_start_date");
    openapiRequiredFields.add("time_off_type_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateTimeOff200ResponseTimeOff
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateTimeOff200ResponseTimeOff.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTimeOff200ResponseTimeOff is not found in the empty JSON string", UpdateTimeOff200ResponseTimeOff.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateTimeOff200ResponseTimeOff.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateTimeOff200ResponseTimeOff` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateTimeOff200ResponseTimeOff.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
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
            UpdateTimeOff200ResponseTimeOffTimeOffDailiesInner.validateJsonElement(jsonArraytimeOffDailies.get(i));
          };
        }
      }
      if (!jsonObj.get("time_off_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_type_id").toString()));
      }
      // validate the optional field `recipient_profile`
      if (jsonObj.get("recipient_profile") != null && !jsonObj.get("recipient_profile").isJsonNull()) {
        UpdateTimeOff200ResponseTimeOffRecipientProfile.validateJsonElement(jsonObj.get("recipient_profile"));
      }
      // validate the optional field `requester_profile`
      if (jsonObj.get("requester_profile") != null && !jsonObj.get("requester_profile").isJsonNull()) {
        UpdateTimeOff200ResponseTimeOffRecipientProfile.validateJsonElement(jsonObj.get("requester_profile"));
      }
      if ((jsonObj.get("other_type_description") != null && !jsonObj.get("other_type_description").isJsonNull()) && !jsonObj.get("other_type_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_type_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_type_description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTimeOff200ResponseTimeOff.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTimeOff200ResponseTimeOff' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTimeOff200ResponseTimeOff> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTimeOff200ResponseTimeOff.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTimeOff200ResponseTimeOff>() {
           @Override
           public void write(JsonWriter out, UpdateTimeOff200ResponseTimeOff value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTimeOff200ResponseTimeOff read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateTimeOff200ResponseTimeOff given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateTimeOff200ResponseTimeOff
   * @throws IOException if the JSON string is invalid with respect to UpdateTimeOff200ResponseTimeOff
   */
  public static UpdateTimeOff200ResponseTimeOff fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTimeOff200ResponseTimeOff.class);
  }

  /**
   * Convert an instance of UpdateTimeOff200ResponseTimeOff to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

