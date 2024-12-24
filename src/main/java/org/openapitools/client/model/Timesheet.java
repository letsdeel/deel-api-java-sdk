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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BasicTimesheetContract;
import org.openapitools.client.model.BasicTimesheetPaymentCycle;
import org.openapitools.client.model.BasicTimesheetReportedBy;
import org.openapitools.client.model.BasicTimesheetReviewedBy;
import org.openapitools.client.model.BasicTimesheetWorksheet;
import org.openapitools.client.model.FileAttachmentInfo;
import org.openapitools.client.model.TimesheetApprover;
import org.openapitools.client.model.TimesheetStatusEnum;
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
 * Timesheet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class Timesheet {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private String type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private TimesheetStatusEnum status;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_DATE_SUBMITTED = "date_submitted";
  @SerializedName(SERIALIZED_NAME_DATE_SUBMITTED)
  @javax.annotation.Nonnull
  private OffsetDateTime dateSubmitted;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nonnull
  private String currencyCode;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  @javax.annotation.Nonnull
  private String totalAmount;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  @javax.annotation.Nullable
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private String createdAt;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nullable
  private String scale;

  public static final String SERIALIZED_NAME_CUSTOM_SCALE = "custom_scale";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SCALE)
  @javax.annotation.Nullable
  private String customScale;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  @javax.annotation.Nullable
  private FileAttachmentInfo attachment;

  public static final String SERIALIZED_NAME_WORKSHEET = "worksheet";
  @SerializedName(SERIALIZED_NAME_WORKSHEET)
  @javax.annotation.Nullable
  private BasicTimesheetWorksheet worksheet;

  public static final String SERIALIZED_NAME_REVIEWED_BY = "reviewed_by";
  @SerializedName(SERIALIZED_NAME_REVIEWED_BY)
  @javax.annotation.Nullable
  private BasicTimesheetReviewedBy reviewedBy;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  @javax.annotation.Nonnull
  private BasicTimesheetContract contract;

  public static final String SERIALIZED_NAME_PAYMENT_CYCLE = "payment_cycle";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CYCLE)
  @javax.annotation.Nullable
  private BasicTimesheetPaymentCycle paymentCycle;

  public static final String SERIALIZED_NAME_REPORTED_BY = "reported_by";
  @SerializedName(SERIALIZED_NAME_REPORTED_BY)
  @javax.annotation.Nonnull
  private BasicTimesheetReportedBy reportedBy;

  public static final String SERIALIZED_NAME_APPROVERS = "approvers";
  @SerializedName(SERIALIZED_NAME_APPROVERS)
  @javax.annotation.Nonnull
  private List<TimesheetApprover> approvers = new ArrayList<>();

  public Timesheet() {
  }

  public Timesheet id(@javax.annotation.Nonnull String id) {
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


  public Timesheet type(@javax.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Deprecated - it is always \&quot;work\&quot;
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }


  public Timesheet status(@javax.annotation.Nullable TimesheetStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public TimesheetStatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable TimesheetStatusEnum status) {
    this.status = status;
  }


  public Timesheet description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public Timesheet dateSubmitted(@javax.annotation.Nonnull OffsetDateTime dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return dateSubmitted
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getDateSubmitted() {
    return dateSubmitted;
  }

  public void setDateSubmitted(@javax.annotation.Nonnull OffsetDateTime dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
  }


  public Timesheet currencyCode(@javax.annotation.Nonnull String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   */
  @javax.annotation.Nonnull
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nonnull String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public Timesheet totalAmount(@javax.annotation.Nonnull String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * is equal to quantity times rate of active work statement + bonus in this record
   * @return totalAmount
   */
  @javax.annotation.Nonnull
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(@javax.annotation.Nonnull String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public Timesheet quantity(@javax.annotation.Nullable BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  @javax.annotation.Nullable
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(@javax.annotation.Nullable BigDecimal quantity) {
    this.quantity = quantity;
  }


  public Timesheet createdAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
  }


  public Timesheet scale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
   */
  @javax.annotation.Nullable
  public String getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
  }


  public Timesheet customScale(@javax.annotation.Nullable String customScale) {
    this.customScale = customScale;
    return this;
  }

  /**
   * Get customScale
   * @return customScale
   */
  @javax.annotation.Nullable
  public String getCustomScale() {
    return customScale;
  }

  public void setCustomScale(@javax.annotation.Nullable String customScale) {
    this.customScale = customScale;
  }


  public Timesheet attachment(@javax.annotation.Nullable FileAttachmentInfo attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
   */
  @javax.annotation.Nullable
  public FileAttachmentInfo getAttachment() {
    return attachment;
  }

  public void setAttachment(@javax.annotation.Nullable FileAttachmentInfo attachment) {
    this.attachment = attachment;
  }


  public Timesheet worksheet(@javax.annotation.Nullable BasicTimesheetWorksheet worksheet) {
    this.worksheet = worksheet;
    return this;
  }

  /**
   * Get worksheet
   * @return worksheet
   */
  @javax.annotation.Nullable
  public BasicTimesheetWorksheet getWorksheet() {
    return worksheet;
  }

  public void setWorksheet(@javax.annotation.Nullable BasicTimesheetWorksheet worksheet) {
    this.worksheet = worksheet;
  }


  public Timesheet reviewedBy(@javax.annotation.Nullable BasicTimesheetReviewedBy reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }

  /**
   * Get reviewedBy
   * @return reviewedBy
   */
  @javax.annotation.Nullable
  public BasicTimesheetReviewedBy getReviewedBy() {
    return reviewedBy;
  }

  public void setReviewedBy(@javax.annotation.Nullable BasicTimesheetReviewedBy reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  public Timesheet contract(@javax.annotation.Nonnull BasicTimesheetContract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
   */
  @javax.annotation.Nonnull
  public BasicTimesheetContract getContract() {
    return contract;
  }

  public void setContract(@javax.annotation.Nonnull BasicTimesheetContract contract) {
    this.contract = contract;
  }


  public Timesheet paymentCycle(@javax.annotation.Nullable BasicTimesheetPaymentCycle paymentCycle) {
    this.paymentCycle = paymentCycle;
    return this;
  }

  /**
   * Get paymentCycle
   * @return paymentCycle
   */
  @javax.annotation.Nullable
  public BasicTimesheetPaymentCycle getPaymentCycle() {
    return paymentCycle;
  }

  public void setPaymentCycle(@javax.annotation.Nullable BasicTimesheetPaymentCycle paymentCycle) {
    this.paymentCycle = paymentCycle;
  }


  public Timesheet reportedBy(@javax.annotation.Nonnull BasicTimesheetReportedBy reportedBy) {
    this.reportedBy = reportedBy;
    return this;
  }

  /**
   * Get reportedBy
   * @return reportedBy
   */
  @javax.annotation.Nonnull
  public BasicTimesheetReportedBy getReportedBy() {
    return reportedBy;
  }

  public void setReportedBy(@javax.annotation.Nonnull BasicTimesheetReportedBy reportedBy) {
    this.reportedBy = reportedBy;
  }


  public Timesheet approvers(@javax.annotation.Nonnull List<TimesheetApprover> approvers) {
    this.approvers = approvers;
    return this;
  }

  public Timesheet addApproversItem(TimesheetApprover approversItem) {
    if (this.approvers == null) {
      this.approvers = new ArrayList<>();
    }
    this.approvers.add(approversItem);
    return this;
  }

  /**
   * Get approvers
   * @return approvers
   */
  @javax.annotation.Nonnull
  public List<TimesheetApprover> getApprovers() {
    return approvers;
  }

  public void setApprovers(@javax.annotation.Nonnull List<TimesheetApprover> approvers) {
    this.approvers = approvers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timesheet timesheet = (Timesheet) o;
    return Objects.equals(this.id, timesheet.id) &&
        Objects.equals(this.type, timesheet.type) &&
        Objects.equals(this.status, timesheet.status) &&
        Objects.equals(this.description, timesheet.description) &&
        Objects.equals(this.dateSubmitted, timesheet.dateSubmitted) &&
        Objects.equals(this.currencyCode, timesheet.currencyCode) &&
        Objects.equals(this.totalAmount, timesheet.totalAmount) &&
        Objects.equals(this.quantity, timesheet.quantity) &&
        Objects.equals(this.createdAt, timesheet.createdAt) &&
        Objects.equals(this.scale, timesheet.scale) &&
        Objects.equals(this.customScale, timesheet.customScale) &&
        Objects.equals(this.attachment, timesheet.attachment) &&
        Objects.equals(this.worksheet, timesheet.worksheet) &&
        Objects.equals(this.reviewedBy, timesheet.reviewedBy) &&
        Objects.equals(this.contract, timesheet.contract) &&
        Objects.equals(this.paymentCycle, timesheet.paymentCycle) &&
        Objects.equals(this.reportedBy, timesheet.reportedBy) &&
        Objects.equals(this.approvers, timesheet.approvers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, description, dateSubmitted, currencyCode, totalAmount, quantity, createdAt, scale, customScale, attachment, worksheet, reviewedBy, contract, paymentCycle, reportedBy, approvers);
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
    sb.append("class Timesheet {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    customScale: ").append(toIndentedString(customScale)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    worksheet: ").append(toIndentedString(worksheet)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
    sb.append("    reportedBy: ").append(toIndentedString(reportedBy)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("description");
    openapiFields.add("date_submitted");
    openapiFields.add("currency_code");
    openapiFields.add("total_amount");
    openapiFields.add("quantity");
    openapiFields.add("created_at");
    openapiFields.add("scale");
    openapiFields.add("custom_scale");
    openapiFields.add("attachment");
    openapiFields.add("worksheet");
    openapiFields.add("reviewed_by");
    openapiFields.add("contract");
    openapiFields.add("payment_cycle");
    openapiFields.add("reported_by");
    openapiFields.add("approvers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("date_submitted");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("total_amount");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("attachment");
    openapiRequiredFields.add("worksheet");
    openapiRequiredFields.add("reviewed_by");
    openapiRequiredFields.add("contract");
    openapiRequiredFields.add("reported_by");
    openapiRequiredFields.add("approvers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Timesheet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Timesheet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Timesheet is not found in the empty JSON string", Timesheet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Timesheet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Timesheet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Timesheet.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `status`
      TimesheetStatusEnum.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if (!jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      if ((jsonObj.get("custom_scale") != null && !jsonObj.get("custom_scale").isJsonNull()) && !jsonObj.get("custom_scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_scale").toString()));
      }
      // validate the required field `attachment`
      FileAttachmentInfo.validateJsonElement(jsonObj.get("attachment"));
      // validate the required field `worksheet`
      BasicTimesheetWorksheet.validateJsonElement(jsonObj.get("worksheet"));
      // validate the required field `reviewed_by`
      BasicTimesheetReviewedBy.validateJsonElement(jsonObj.get("reviewed_by"));
      // validate the required field `contract`
      BasicTimesheetContract.validateJsonElement(jsonObj.get("contract"));
      // validate the optional field `payment_cycle`
      if (jsonObj.get("payment_cycle") != null && !jsonObj.get("payment_cycle").isJsonNull()) {
        BasicTimesheetPaymentCycle.validateJsonElement(jsonObj.get("payment_cycle"));
      }
      // validate the required field `reported_by`
      BasicTimesheetReportedBy.validateJsonElement(jsonObj.get("reported_by"));
      // ensure the json data is an array
      if (!jsonObj.get("approvers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvers` to be an array in the JSON string but got `%s`", jsonObj.get("approvers").toString()));
      }

      JsonArray jsonArrayapprovers = jsonObj.getAsJsonArray("approvers");
      // validate the required field `approvers` (array)
      for (int i = 0; i < jsonArrayapprovers.size(); i++) {
        TimesheetApprover.validateJsonElement(jsonArrayapprovers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Timesheet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Timesheet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Timesheet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Timesheet.class));

       return (TypeAdapter<T>) new TypeAdapter<Timesheet>() {
           @Override
           public void write(JsonWriter out, Timesheet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Timesheet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Timesheet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Timesheet
   * @throws IOException if the JSON string is invalid with respect to Timesheet
   */
  public static Timesheet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Timesheet.class);
  }

  /**
   * Convert an instance of Timesheet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

