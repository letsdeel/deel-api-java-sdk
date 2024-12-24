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
import org.openapitools.client.model.CreateTimeOff201ResponseTimeOffsInnerRecipientProfile;
import org.openapitools.client.model.CreateTimeOff201ResponseTimeOffsInnerRequesterProfile;
import org.openapitools.client.model.CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner;
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
 * CreateTimeOff201ResponseTimeOffsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:45:23.308834949Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateTimeOff201ResponseTimeOffsInner {
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
   * The status of the time off
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
  private List<CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner> timeOffDailies = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE_ID = "time_off_type_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE_ID)
  @javax.annotation.Nonnull
  private String timeOffTypeId;

  public static final String SERIALIZED_NAME_RECIPIENT_PROFILE = "recipient_profile";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_PROFILE)
  @javax.annotation.Nullable
  private CreateTimeOff201ResponseTimeOffsInnerRecipientProfile recipientProfile;

  public static final String SERIALIZED_NAME_REQUESTER_PROFILE = "requester_profile";
  @SerializedName(SERIALIZED_NAME_REQUESTER_PROFILE)
  @javax.annotation.Nullable
  private CreateTimeOff201ResponseTimeOffsInnerRequesterProfile requesterProfile;

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

  public CreateTimeOff201ResponseTimeOffsInner() {
  }

  public CreateTimeOff201ResponseTimeOffsInner id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The time off id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public CreateTimeOff201ResponseTimeOffsInner amount(@javax.annotation.Nonnull Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of time off
   * @return amount
   */
  @javax.annotation.Nonnull
  public Float getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull Float amount) {
    this.amount = amount;
  }


  public CreateTimeOff201ResponseTimeOffsInner reason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for the time off
   * @return reason
   */
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }

  public void setReason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public CreateTimeOff201ResponseTimeOffsInner status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the time off
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public CreateTimeOff201ResponseTimeOffsInner isPaid(@javax.annotation.Nonnull Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  /**
   * Is the time off paid
   * @return isPaid
   */
  @javax.annotation.Nonnull
  public Boolean getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(@javax.annotation.Nonnull Boolean isPaid) {
    this.isPaid = isPaid;
  }


  public CreateTimeOff201ResponseTimeOffsInner endDate(@javax.annotation.Nonnull OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The end date of the time off
   * @return endDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nonnull OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public CreateTimeOff201ResponseTimeOffsInner createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation date of the time off
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CreateTimeOff201ResponseTimeOffsInner startDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the time off
   * @return startDate
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public CreateTimeOff201ResponseTimeOffsInner updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The update date of the time off
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CreateTimeOff201ResponseTimeOffsInner approvedAt(@javax.annotation.Nullable OffsetDateTime approvedAt) {
    this.approvedAt = approvedAt;
    return this;
  }

  /**
   * The approval date of the time off
   * @return approvedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getApprovedAt() {
    return approvedAt;
  }

  public void setApprovedAt(@javax.annotation.Nullable OffsetDateTime approvedAt) {
    this.approvedAt = approvedAt;
  }


  public CreateTimeOff201ResponseTimeOffsInner description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the time off
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public CreateTimeOff201ResponseTimeOffsInner contractOid(@javax.annotation.Nullable String contractOid) {
    this.contractOid = contractOid;
    return this;
  }

  /**
   * The contract id of the time off
   * @return contractOid
   */
  @javax.annotation.Nullable
  public String getContractOid() {
    return contractOid;
  }

  public void setContractOid(@javax.annotation.Nullable String contractOid) {
    this.contractOid = contractOid;
  }


  public CreateTimeOff201ResponseTimeOffsInner requestedAt(@javax.annotation.Nonnull OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * The request date of the time off
   * @return requestedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(@javax.annotation.Nonnull OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
  }


  public CreateTimeOff201ResponseTimeOffsInner halfEndDate(@javax.annotation.Nonnull Boolean halfEndDate) {
    this.halfEndDate = halfEndDate;
    return this;
  }

  /**
   * Is the end date a half day
   * @return halfEndDate
   */
  @javax.annotation.Nonnull
  public Boolean getHalfEndDate() {
    return halfEndDate;
  }

  public void setHalfEndDate(@javax.annotation.Nonnull Boolean halfEndDate) {
    this.halfEndDate = halfEndDate;
  }


  public CreateTimeOff201ResponseTimeOffsInner halfStartDate(@javax.annotation.Nonnull Boolean halfStartDate) {
    this.halfStartDate = halfStartDate;
    return this;
  }

  /**
   * Is the start date a half day
   * @return halfStartDate
   */
  @javax.annotation.Nonnull
  public Boolean getHalfStartDate() {
    return halfStartDate;
  }

  public void setHalfStartDate(@javax.annotation.Nonnull Boolean halfStartDate) {
    this.halfStartDate = halfStartDate;
  }


  public CreateTimeOff201ResponseTimeOffsInner deductionAmount(@javax.annotation.Nullable Float deductionAmount) {
    this.deductionAmount = deductionAmount;
    return this;
  }

  /**
   * The deduction amount of the time off
   * @return deductionAmount
   */
  @javax.annotation.Nullable
  public Float getDeductionAmount() {
    return deductionAmount;
  }

  public void setDeductionAmount(@javax.annotation.Nullable Float deductionAmount) {
    this.deductionAmount = deductionAmount;
  }


  public CreateTimeOff201ResponseTimeOffsInner timeOffDailies(@javax.annotation.Nullable List<CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner> timeOffDailies) {
    this.timeOffDailies = timeOffDailies;
    return this;
  }

  public CreateTimeOff201ResponseTimeOffsInner addTimeOffDailiesItem(CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner timeOffDailiesItem) {
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
  public List<CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner> getTimeOffDailies() {
    return timeOffDailies;
  }

  public void setTimeOffDailies(@javax.annotation.Nullable List<CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner> timeOffDailies) {
    this.timeOffDailies = timeOffDailies;
  }


  public CreateTimeOff201ResponseTimeOffsInner timeOffTypeId(@javax.annotation.Nonnull String timeOffTypeId) {
    this.timeOffTypeId = timeOffTypeId;
    return this;
  }

  /**
   * The time off type id
   * @return timeOffTypeId
   */
  @javax.annotation.Nonnull
  public String getTimeOffTypeId() {
    return timeOffTypeId;
  }

  public void setTimeOffTypeId(@javax.annotation.Nonnull String timeOffTypeId) {
    this.timeOffTypeId = timeOffTypeId;
  }


  public CreateTimeOff201ResponseTimeOffsInner recipientProfile(@javax.annotation.Nullable CreateTimeOff201ResponseTimeOffsInnerRecipientProfile recipientProfile) {
    this.recipientProfile = recipientProfile;
    return this;
  }

  /**
   * Get recipientProfile
   * @return recipientProfile
   */
  @javax.annotation.Nullable
  public CreateTimeOff201ResponseTimeOffsInnerRecipientProfile getRecipientProfile() {
    return recipientProfile;
  }

  public void setRecipientProfile(@javax.annotation.Nullable CreateTimeOff201ResponseTimeOffsInnerRecipientProfile recipientProfile) {
    this.recipientProfile = recipientProfile;
  }


  public CreateTimeOff201ResponseTimeOffsInner requesterProfile(@javax.annotation.Nullable CreateTimeOff201ResponseTimeOffsInnerRequesterProfile requesterProfile) {
    this.requesterProfile = requesterProfile;
    return this;
  }

  /**
   * Get requesterProfile
   * @return requesterProfile
   */
  @javax.annotation.Nullable
  public CreateTimeOff201ResponseTimeOffsInnerRequesterProfile getRequesterProfile() {
    return requesterProfile;
  }

  public void setRequesterProfile(@javax.annotation.Nullable CreateTimeOff201ResponseTimeOffsInnerRequesterProfile requesterProfile) {
    this.requesterProfile = requesterProfile;
  }


  public CreateTimeOff201ResponseTimeOffsInner timeOffPercentage(@javax.annotation.Nullable Float timeOffPercentage) {
    this.timeOffPercentage = timeOffPercentage;
    return this;
  }

  /**
   * The time off percentage
   * @return timeOffPercentage
   */
  @javax.annotation.Nullable
  public Float getTimeOffPercentage() {
    return timeOffPercentage;
  }

  public void setTimeOffPercentage(@javax.annotation.Nullable Float timeOffPercentage) {
    this.timeOffPercentage = timeOffPercentage;
  }


  public CreateTimeOff201ResponseTimeOffsInner isEndDateEstimated(@javax.annotation.Nullable Boolean isEndDateEstimated) {
    this.isEndDateEstimated = isEndDateEstimated;
    return this;
  }

  /**
   * Is the end date estimated
   * @return isEndDateEstimated
   */
  @javax.annotation.Nullable
  public Boolean getIsEndDateEstimated() {
    return isEndDateEstimated;
  }

  public void setIsEndDateEstimated(@javax.annotation.Nullable Boolean isEndDateEstimated) {
    this.isEndDateEstimated = isEndDateEstimated;
  }


  public CreateTimeOff201ResponseTimeOffsInner otherTypeDescription(@javax.annotation.Nullable String otherTypeDescription) {
    this.otherTypeDescription = otherTypeDescription;
    return this;
  }

  /**
   * The other type description
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
    CreateTimeOff201ResponseTimeOffsInner createTimeOff201ResponseTimeOffsInner = (CreateTimeOff201ResponseTimeOffsInner) o;
    return Objects.equals(this.id, createTimeOff201ResponseTimeOffsInner.id) &&
        Objects.equals(this.amount, createTimeOff201ResponseTimeOffsInner.amount) &&
        Objects.equals(this.reason, createTimeOff201ResponseTimeOffsInner.reason) &&
        Objects.equals(this.status, createTimeOff201ResponseTimeOffsInner.status) &&
        Objects.equals(this.isPaid, createTimeOff201ResponseTimeOffsInner.isPaid) &&
        Objects.equals(this.endDate, createTimeOff201ResponseTimeOffsInner.endDate) &&
        Objects.equals(this.createdAt, createTimeOff201ResponseTimeOffsInner.createdAt) &&
        Objects.equals(this.startDate, createTimeOff201ResponseTimeOffsInner.startDate) &&
        Objects.equals(this.updatedAt, createTimeOff201ResponseTimeOffsInner.updatedAt) &&
        Objects.equals(this.approvedAt, createTimeOff201ResponseTimeOffsInner.approvedAt) &&
        Objects.equals(this.description, createTimeOff201ResponseTimeOffsInner.description) &&
        Objects.equals(this.contractOid, createTimeOff201ResponseTimeOffsInner.contractOid) &&
        Objects.equals(this.requestedAt, createTimeOff201ResponseTimeOffsInner.requestedAt) &&
        Objects.equals(this.halfEndDate, createTimeOff201ResponseTimeOffsInner.halfEndDate) &&
        Objects.equals(this.halfStartDate, createTimeOff201ResponseTimeOffsInner.halfStartDate) &&
        Objects.equals(this.deductionAmount, createTimeOff201ResponseTimeOffsInner.deductionAmount) &&
        Objects.equals(this.timeOffDailies, createTimeOff201ResponseTimeOffsInner.timeOffDailies) &&
        Objects.equals(this.timeOffTypeId, createTimeOff201ResponseTimeOffsInner.timeOffTypeId) &&
        Objects.equals(this.recipientProfile, createTimeOff201ResponseTimeOffsInner.recipientProfile) &&
        Objects.equals(this.requesterProfile, createTimeOff201ResponseTimeOffsInner.requesterProfile) &&
        Objects.equals(this.timeOffPercentage, createTimeOff201ResponseTimeOffsInner.timeOffPercentage) &&
        Objects.equals(this.isEndDateEstimated, createTimeOff201ResponseTimeOffsInner.isEndDateEstimated) &&
        Objects.equals(this.otherTypeDescription, createTimeOff201ResponseTimeOffsInner.otherTypeDescription);
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
    sb.append("class CreateTimeOff201ResponseTimeOffsInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to CreateTimeOff201ResponseTimeOffsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTimeOff201ResponseTimeOffsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTimeOff201ResponseTimeOffsInner is not found in the empty JSON string", CreateTimeOff201ResponseTimeOffsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTimeOff201ResponseTimeOffsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTimeOff201ResponseTimeOffsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTimeOff201ResponseTimeOffsInner.openapiRequiredFields) {
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
            CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.validateJsonElement(jsonArraytimeOffDailies.get(i));
          };
        }
      }
      if (!jsonObj.get("time_off_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_type_id").toString()));
      }
      // validate the optional field `recipient_profile`
      if (jsonObj.get("recipient_profile") != null && !jsonObj.get("recipient_profile").isJsonNull()) {
        CreateTimeOff201ResponseTimeOffsInnerRecipientProfile.validateJsonElement(jsonObj.get("recipient_profile"));
      }
      // validate the optional field `requester_profile`
      if (jsonObj.get("requester_profile") != null && !jsonObj.get("requester_profile").isJsonNull()) {
        CreateTimeOff201ResponseTimeOffsInnerRequesterProfile.validateJsonElement(jsonObj.get("requester_profile"));
      }
      if ((jsonObj.get("other_type_description") != null && !jsonObj.get("other_type_description").isJsonNull()) && !jsonObj.get("other_type_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_type_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_type_description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTimeOff201ResponseTimeOffsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTimeOff201ResponseTimeOffsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTimeOff201ResponseTimeOffsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTimeOff201ResponseTimeOffsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTimeOff201ResponseTimeOffsInner>() {
           @Override
           public void write(JsonWriter out, CreateTimeOff201ResponseTimeOffsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTimeOff201ResponseTimeOffsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTimeOff201ResponseTimeOffsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTimeOff201ResponseTimeOffsInner
   * @throws IOException if the JSON string is invalid with respect to CreateTimeOff201ResponseTimeOffsInner
   */
  public static CreateTimeOff201ResponseTimeOffsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTimeOff201ResponseTimeOffsInner.class);
  }

  /**
   * Convert an instance of CreateTimeOff201ResponseTimeOffsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

