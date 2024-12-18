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
import org.openapitools.client.model.CreateTimeOffRequestDataAttachmentsInner;
import org.openapitools.client.model.CreateTimeOffRequestDataDatesInner;
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
 * CreateTimeOffRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:04:44.564028033Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateTimeOffRequestData {
  public static final String SERIALIZED_NAME_DATES = "dates";
  @SerializedName(SERIALIZED_NAME_DATES)
  @javax.annotation.Nullable
  private List<CreateTimeOffRequestDataDatesInner> dates = new ArrayList<>();

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @javax.annotation.Nullable
  private String reason;

  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  @javax.annotation.Nullable
  private Boolean isPaid = false;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  @javax.annotation.Nullable
  private List<CreateTimeOffRequestDataAttachmentsInner> attachments;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_CONTRACT_OID = "contract_oid";
  @SerializedName(SERIALIZED_NAME_CONTRACT_OID)
  @javax.annotation.Nullable
  private String contractOid;

  public static final String SERIALIZED_NAME_DEDUCTION_AMOUNT = "deduction_amount";
  @SerializedName(SERIALIZED_NAME_DEDUCTION_AMOUNT)
  @javax.annotation.Nullable
  private Float deductionAmount;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE_ID = "time_off_type_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE_ID)
  @javax.annotation.Nonnull
  private String timeOffTypeId;

  public static final String SERIALIZED_NAME_TIME_OFF_PERCENTAGE = "time_off_percentage";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_PERCENTAGE)
  @javax.annotation.Nullable
  private Double timeOffPercentage;

  public static final String SERIALIZED_NAME_RECIPIENT_PROFILE_ID = "recipient_profile_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_PROFILE_ID)
  @javax.annotation.Nonnull
  private String recipientProfileId;

  public static final String SERIALIZED_NAME_OTHER_TYPE_DESCRIPTION = "other_type_description";
  @SerializedName(SERIALIZED_NAME_OTHER_TYPE_DESCRIPTION)
  @javax.annotation.Nullable
  private String otherTypeDescription;

  public CreateTimeOffRequestData() {
  }

  public CreateTimeOffRequestData dates(@javax.annotation.Nullable List<CreateTimeOffRequestDataDatesInner> dates) {
    this.dates = dates;
    return this;
  }

  public CreateTimeOffRequestData addDatesItem(CreateTimeOffRequestDataDatesInner datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<>();
    }
    this.dates.add(datesItem);
    return this;
  }

  /**
   * Get dates
   * @return dates
   */
  @javax.annotation.Nullable
  public List<CreateTimeOffRequestDataDatesInner> getDates() {
    return dates;
  }

  public void setDates(@javax.annotation.Nullable List<CreateTimeOffRequestDataDatesInner> dates) {
    this.dates = dates;
  }


  public CreateTimeOffRequestData reason(@javax.annotation.Nullable String reason) {
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


  public CreateTimeOffRequestData isPaid(@javax.annotation.Nullable Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  /**
   * Is the time off paid
   * @return isPaid
   */
  @javax.annotation.Nullable
  public Boolean getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(@javax.annotation.Nullable Boolean isPaid) {
    this.isPaid = isPaid;
  }


  public CreateTimeOffRequestData endDate(@javax.annotation.Nonnull OffsetDateTime endDate) {
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


  public CreateTimeOffRequestData startDate(@javax.annotation.Nonnull OffsetDateTime startDate) {
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


  public CreateTimeOffRequestData attachments(@javax.annotation.Nullable List<CreateTimeOffRequestDataAttachmentsInner> attachments) {
    this.attachments = attachments;
    return this;
  }

  public CreateTimeOffRequestData addAttachmentsItem(CreateTimeOffRequestDataAttachmentsInner attachmentsItem) {
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
  public List<CreateTimeOffRequestDataAttachmentsInner> getAttachments() {
    return attachments;
  }

  public void setAttachments(@javax.annotation.Nullable List<CreateTimeOffRequestDataAttachmentsInner> attachments) {
    this.attachments = attachments;
  }


  public CreateTimeOffRequestData description(@javax.annotation.Nullable String description) {
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


  public CreateTimeOffRequestData contractOid(@javax.annotation.Nullable String contractOid) {
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


  public CreateTimeOffRequestData deductionAmount(@javax.annotation.Nullable Float deductionAmount) {
    this.deductionAmount = deductionAmount;
    return this;
  }

  /**
   * The deduction amount of the time off
   * minimum: 1
   * @return deductionAmount
   */
  @javax.annotation.Nullable
  public Float getDeductionAmount() {
    return deductionAmount;
  }

  public void setDeductionAmount(@javax.annotation.Nullable Float deductionAmount) {
    this.deductionAmount = deductionAmount;
  }


  public CreateTimeOffRequestData timeOffTypeId(@javax.annotation.Nonnull String timeOffTypeId) {
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


  public CreateTimeOffRequestData timeOffPercentage(@javax.annotation.Nullable Double timeOffPercentage) {
    this.timeOffPercentage = timeOffPercentage;
    return this;
  }

  /**
   * The time off percentage
   * minimum: 0
   * maximum: 1
   * @return timeOffPercentage
   */
  @javax.annotation.Nullable
  public Double getTimeOffPercentage() {
    return timeOffPercentage;
  }

  public void setTimeOffPercentage(@javax.annotation.Nullable Double timeOffPercentage) {
    this.timeOffPercentage = timeOffPercentage;
  }


  public CreateTimeOffRequestData recipientProfileId(@javax.annotation.Nonnull String recipientProfileId) {
    this.recipientProfileId = recipientProfileId;
    return this;
  }

  /**
   * The hris profile id of the recipient
   * @return recipientProfileId
   */
  @javax.annotation.Nonnull
  public String getRecipientProfileId() {
    return recipientProfileId;
  }

  public void setRecipientProfileId(@javax.annotation.Nonnull String recipientProfileId) {
    this.recipientProfileId = recipientProfileId;
  }


  public CreateTimeOffRequestData otherTypeDescription(@javax.annotation.Nullable String otherTypeDescription) {
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
    CreateTimeOffRequestData createTimeOffRequestData = (CreateTimeOffRequestData) o;
    return Objects.equals(this.dates, createTimeOffRequestData.dates) &&
        Objects.equals(this.reason, createTimeOffRequestData.reason) &&
        Objects.equals(this.isPaid, createTimeOffRequestData.isPaid) &&
        Objects.equals(this.endDate, createTimeOffRequestData.endDate) &&
        Objects.equals(this.startDate, createTimeOffRequestData.startDate) &&
        Objects.equals(this.attachments, createTimeOffRequestData.attachments) &&
        Objects.equals(this.description, createTimeOffRequestData.description) &&
        Objects.equals(this.contractOid, createTimeOffRequestData.contractOid) &&
        Objects.equals(this.deductionAmount, createTimeOffRequestData.deductionAmount) &&
        Objects.equals(this.timeOffTypeId, createTimeOffRequestData.timeOffTypeId) &&
        Objects.equals(this.timeOffPercentage, createTimeOffRequestData.timeOffPercentage) &&
        Objects.equals(this.recipientProfileId, createTimeOffRequestData.recipientProfileId) &&
        Objects.equals(this.otherTypeDescription, createTimeOffRequestData.otherTypeDescription);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dates, reason, isPaid, endDate, startDate, attachments, description, contractOid, deductionAmount, timeOffTypeId, timeOffPercentage, recipientProfileId, otherTypeDescription);
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
    sb.append("class CreateTimeOffRequestData {\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contractOid: ").append(toIndentedString(contractOid)).append("\n");
    sb.append("    deductionAmount: ").append(toIndentedString(deductionAmount)).append("\n");
    sb.append("    timeOffTypeId: ").append(toIndentedString(timeOffTypeId)).append("\n");
    sb.append("    timeOffPercentage: ").append(toIndentedString(timeOffPercentage)).append("\n");
    sb.append("    recipientProfileId: ").append(toIndentedString(recipientProfileId)).append("\n");
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
    openapiFields.add("dates");
    openapiFields.add("reason");
    openapiFields.add("is_paid");
    openapiFields.add("end_date");
    openapiFields.add("start_date");
    openapiFields.add("attachments");
    openapiFields.add("description");
    openapiFields.add("contract_oid");
    openapiFields.add("deduction_amount");
    openapiFields.add("time_off_type_id");
    openapiFields.add("time_off_percentage");
    openapiFields.add("recipient_profile_id");
    openapiFields.add("other_type_description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("time_off_type_id");
    openapiRequiredFields.add("recipient_profile_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTimeOffRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTimeOffRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTimeOffRequestData is not found in the empty JSON string", CreateTimeOffRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTimeOffRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTimeOffRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTimeOffRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("dates") != null && !jsonObj.get("dates").isJsonNull()) {
        JsonArray jsonArraydates = jsonObj.getAsJsonArray("dates");
        if (jsonArraydates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dates` to be an array in the JSON string but got `%s`", jsonObj.get("dates").toString()));
          }

          // validate the optional field `dates` (array)
          for (int i = 0; i < jsonArraydates.size(); i++) {
            CreateTimeOffRequestDataDatesInner.validateJsonElement(jsonArraydates.get(i));
          };
        }
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
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
            CreateTimeOffRequestDataAttachmentsInner.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("contract_oid") != null && !jsonObj.get("contract_oid").isJsonNull()) && !jsonObj.get("contract_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_oid").toString()));
      }
      if (!jsonObj.get("time_off_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_type_id").toString()));
      }
      if (!jsonObj.get("recipient_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient_profile_id").toString()));
      }
      if ((jsonObj.get("other_type_description") != null && !jsonObj.get("other_type_description").isJsonNull()) && !jsonObj.get("other_type_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_type_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_type_description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTimeOffRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTimeOffRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTimeOffRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTimeOffRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTimeOffRequestData>() {
           @Override
           public void write(JsonWriter out, CreateTimeOffRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTimeOffRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTimeOffRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTimeOffRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateTimeOffRequestData
   */
  public static CreateTimeOffRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTimeOffRequestData.class);
  }

  /**
   * Convert an instance of CreateTimeOffRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

