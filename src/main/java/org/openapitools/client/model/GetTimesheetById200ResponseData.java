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
import org.openapitools.client.model.AddContractDocument201ResponseData;
import org.openapitools.client.model.CreateEorContractRequestClientTeamId;
import org.openapitools.client.model.GetTimesheetById200ResponseDataAllOfApproversInner;
import org.openapitools.client.model.GetTimesheetsByContract200ResponseDataInnerContract;
import org.openapitools.client.model.GetTimesheetsByContract200ResponseDataInnerPaymentCycle;
import org.openapitools.client.model.GetTimesheetsByContract200ResponseDataInnerReportedBy;
import org.openapitools.client.model.GetTimesheetsByContract200ResponseDataInnerReviewedBy;
import org.openapitools.client.model.GetTimesheetsByContract200ResponseDataInnerWorksheet;
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
 * GetTimesheetById200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:44:17.413238492Z[GMT]", comments = "Generator version: 7.10.0")
public class GetTimesheetById200ResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private CreateEorContractRequestClientTeamId id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private String type;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nullable
  private String scale;

  /**
   * Status of this entry.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    APPROVED("approved"),
    
    DECLINED("declined"),
    
    NOT_PAYABLE("not_payable"),
    
    PAID("paid"),
    
    PENDING("pending"),
    
    PROCESSING("processing");

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
      return null;
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

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  @javax.annotation.Nonnull
  private GetTimesheetsByContract200ResponseDataInnerContract contract;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  @javax.annotation.Nullable
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_WORKSHEET = "worksheet";
  @SerializedName(SERIALIZED_NAME_WORKSHEET)
  @javax.annotation.Nullable
  private GetTimesheetsByContract200ResponseDataInnerWorksheet worksheet;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  @javax.annotation.Nullable
  private AddContractDocument201ResponseData attachment;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private String createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_REPORTED_BY = "reported_by";
  @SerializedName(SERIALIZED_NAME_REPORTED_BY)
  @javax.annotation.Nonnull
  private GetTimesheetsByContract200ResponseDataInnerReportedBy reportedBy;

  public static final String SERIALIZED_NAME_REVIEWED_BY = "reviewed_by";
  @SerializedName(SERIALIZED_NAME_REVIEWED_BY)
  @javax.annotation.Nullable
  private GetTimesheetsByContract200ResponseDataInnerReviewedBy reviewedBy;

  public static final String SERIALIZED_NAME_CUSTOM_SCALE = "custom_scale";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SCALE)
  @javax.annotation.Nullable
  private String customScale;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  @javax.annotation.Nonnull
  private String totalAmount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nonnull
  private String currencyCode;

  public static final String SERIALIZED_NAME_PAYMENT_CYCLE = "payment_cycle";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CYCLE)
  @javax.annotation.Nullable
  private GetTimesheetsByContract200ResponseDataInnerPaymentCycle paymentCycle;

  public static final String SERIALIZED_NAME_DATE_SUBMITTED = "date_submitted";
  @SerializedName(SERIALIZED_NAME_DATE_SUBMITTED)
  @javax.annotation.Nonnull
  private OffsetDateTime dateSubmitted;

  public static final String SERIALIZED_NAME_APPROVERS = "approvers";
  @SerializedName(SERIALIZED_NAME_APPROVERS)
  @javax.annotation.Nonnull
  private List<GetTimesheetById200ResponseDataAllOfApproversInner> approvers = new ArrayList<>();

  public GetTimesheetById200ResponseData() {
  }

  public GetTimesheetById200ResponseData id(@javax.annotation.Nonnull CreateEorContractRequestClientTeamId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public CreateEorContractRequestClientTeamId getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull CreateEorContractRequestClientTeamId id) {
    this.id = id;
  }


  public GetTimesheetById200ResponseData type(@javax.annotation.Nonnull String type) {
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


  public GetTimesheetById200ResponseData scale(@javax.annotation.Nullable String scale) {
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


  public GetTimesheetById200ResponseData status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of this entry.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public GetTimesheetById200ResponseData contract(@javax.annotation.Nonnull GetTimesheetsByContract200ResponseDataInnerContract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
   */
  @javax.annotation.Nonnull
  public GetTimesheetsByContract200ResponseDataInnerContract getContract() {
    return contract;
  }

  public void setContract(@javax.annotation.Nonnull GetTimesheetsByContract200ResponseDataInnerContract contract) {
    this.contract = contract;
  }


  public GetTimesheetById200ResponseData quantity(@javax.annotation.Nullable BigDecimal quantity) {
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


  public GetTimesheetById200ResponseData worksheet(@javax.annotation.Nullable GetTimesheetsByContract200ResponseDataInnerWorksheet worksheet) {
    this.worksheet = worksheet;
    return this;
  }

  /**
   * Get worksheet
   * @return worksheet
   */
  @javax.annotation.Nullable
  public GetTimesheetsByContract200ResponseDataInnerWorksheet getWorksheet() {
    return worksheet;
  }

  public void setWorksheet(@javax.annotation.Nullable GetTimesheetsByContract200ResponseDataInnerWorksheet worksheet) {
    this.worksheet = worksheet;
  }


  public GetTimesheetById200ResponseData attachment(@javax.annotation.Nullable AddContractDocument201ResponseData attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
   */
  @javax.annotation.Nullable
  public AddContractDocument201ResponseData getAttachment() {
    return attachment;
  }

  public void setAttachment(@javax.annotation.Nullable AddContractDocument201ResponseData attachment) {
    this.attachment = attachment;
  }


  public GetTimesheetById200ResponseData createdAt(@javax.annotation.Nonnull String createdAt) {
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


  public GetTimesheetById200ResponseData description(@javax.annotation.Nonnull String description) {
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


  public GetTimesheetById200ResponseData reportedBy(@javax.annotation.Nonnull GetTimesheetsByContract200ResponseDataInnerReportedBy reportedBy) {
    this.reportedBy = reportedBy;
    return this;
  }

  /**
   * Get reportedBy
   * @return reportedBy
   */
  @javax.annotation.Nonnull
  public GetTimesheetsByContract200ResponseDataInnerReportedBy getReportedBy() {
    return reportedBy;
  }

  public void setReportedBy(@javax.annotation.Nonnull GetTimesheetsByContract200ResponseDataInnerReportedBy reportedBy) {
    this.reportedBy = reportedBy;
  }


  public GetTimesheetById200ResponseData reviewedBy(@javax.annotation.Nullable GetTimesheetsByContract200ResponseDataInnerReviewedBy reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }

  /**
   * Get reviewedBy
   * @return reviewedBy
   */
  @javax.annotation.Nullable
  public GetTimesheetsByContract200ResponseDataInnerReviewedBy getReviewedBy() {
    return reviewedBy;
  }

  public void setReviewedBy(@javax.annotation.Nullable GetTimesheetsByContract200ResponseDataInnerReviewedBy reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  public GetTimesheetById200ResponseData customScale(@javax.annotation.Nullable String customScale) {
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


  public GetTimesheetById200ResponseData totalAmount(@javax.annotation.Nonnull String totalAmount) {
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


  public GetTimesheetById200ResponseData currencyCode(@javax.annotation.Nonnull String currencyCode) {
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


  public GetTimesheetById200ResponseData paymentCycle(@javax.annotation.Nullable GetTimesheetsByContract200ResponseDataInnerPaymentCycle paymentCycle) {
    this.paymentCycle = paymentCycle;
    return this;
  }

  /**
   * Get paymentCycle
   * @return paymentCycle
   */
  @javax.annotation.Nullable
  public GetTimesheetsByContract200ResponseDataInnerPaymentCycle getPaymentCycle() {
    return paymentCycle;
  }

  public void setPaymentCycle(@javax.annotation.Nullable GetTimesheetsByContract200ResponseDataInnerPaymentCycle paymentCycle) {
    this.paymentCycle = paymentCycle;
  }


  public GetTimesheetById200ResponseData dateSubmitted(@javax.annotation.Nonnull OffsetDateTime dateSubmitted) {
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


  public GetTimesheetById200ResponseData approvers(@javax.annotation.Nonnull List<GetTimesheetById200ResponseDataAllOfApproversInner> approvers) {
    this.approvers = approvers;
    return this;
  }

  public GetTimesheetById200ResponseData addApproversItem(GetTimesheetById200ResponseDataAllOfApproversInner approversItem) {
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
  public List<GetTimesheetById200ResponseDataAllOfApproversInner> getApprovers() {
    return approvers;
  }

  public void setApprovers(@javax.annotation.Nonnull List<GetTimesheetById200ResponseDataAllOfApproversInner> approvers) {
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
    GetTimesheetById200ResponseData getTimesheetById200ResponseData = (GetTimesheetById200ResponseData) o;
    return Objects.equals(this.id, getTimesheetById200ResponseData.id) &&
        Objects.equals(this.type, getTimesheetById200ResponseData.type) &&
        Objects.equals(this.scale, getTimesheetById200ResponseData.scale) &&
        Objects.equals(this.status, getTimesheetById200ResponseData.status) &&
        Objects.equals(this.contract, getTimesheetById200ResponseData.contract) &&
        Objects.equals(this.quantity, getTimesheetById200ResponseData.quantity) &&
        Objects.equals(this.worksheet, getTimesheetById200ResponseData.worksheet) &&
        Objects.equals(this.attachment, getTimesheetById200ResponseData.attachment) &&
        Objects.equals(this.createdAt, getTimesheetById200ResponseData.createdAt) &&
        Objects.equals(this.description, getTimesheetById200ResponseData.description) &&
        Objects.equals(this.reportedBy, getTimesheetById200ResponseData.reportedBy) &&
        Objects.equals(this.reviewedBy, getTimesheetById200ResponseData.reviewedBy) &&
        Objects.equals(this.customScale, getTimesheetById200ResponseData.customScale) &&
        Objects.equals(this.totalAmount, getTimesheetById200ResponseData.totalAmount) &&
        Objects.equals(this.currencyCode, getTimesheetById200ResponseData.currencyCode) &&
        Objects.equals(this.paymentCycle, getTimesheetById200ResponseData.paymentCycle) &&
        Objects.equals(this.dateSubmitted, getTimesheetById200ResponseData.dateSubmitted) &&
        Objects.equals(this.approvers, getTimesheetById200ResponseData.approvers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, scale, status, contract, quantity, worksheet, attachment, createdAt, description, reportedBy, reviewedBy, customScale, totalAmount, currencyCode, paymentCycle, dateSubmitted, approvers);
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
    sb.append("class GetTimesheetById200ResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    worksheet: ").append(toIndentedString(worksheet)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reportedBy: ").append(toIndentedString(reportedBy)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    customScale: ").append(toIndentedString(customScale)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
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
    openapiFields.add("scale");
    openapiFields.add("status");
    openapiFields.add("contract");
    openapiFields.add("quantity");
    openapiFields.add("worksheet");
    openapiFields.add("attachment");
    openapiFields.add("created_at");
    openapiFields.add("description");
    openapiFields.add("reported_by");
    openapiFields.add("reviewed_by");
    openapiFields.add("custom_scale");
    openapiFields.add("total_amount");
    openapiFields.add("currency_code");
    openapiFields.add("payment_cycle");
    openapiFields.add("date_submitted");
    openapiFields.add("approvers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("contract");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("worksheet");
    openapiRequiredFields.add("attachment");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("reported_by");
    openapiRequiredFields.add("reviewed_by");
    openapiRequiredFields.add("total_amount");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("date_submitted");
    openapiRequiredFields.add("approvers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetTimesheetById200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTimesheetById200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTimesheetById200ResponseData is not found in the empty JSON string", GetTimesheetById200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTimesheetById200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTimesheetById200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTimesheetById200ResponseData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      CreateEorContractRequestClientTeamId.validateJsonElement(jsonObj.get("id"));
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      // validate the required field `contract`
      GetTimesheetsByContract200ResponseDataInnerContract.validateJsonElement(jsonObj.get("contract"));
      // validate the required field `worksheet`
      GetTimesheetsByContract200ResponseDataInnerWorksheet.validateJsonElement(jsonObj.get("worksheet"));
      // validate the required field `attachment`
      AddContractDocument201ResponseData.validateJsonElement(jsonObj.get("attachment"));
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `reported_by`
      GetTimesheetsByContract200ResponseDataInnerReportedBy.validateJsonElement(jsonObj.get("reported_by"));
      // validate the required field `reviewed_by`
      GetTimesheetsByContract200ResponseDataInnerReviewedBy.validateJsonElement(jsonObj.get("reviewed_by"));
      if ((jsonObj.get("custom_scale") != null && !jsonObj.get("custom_scale").isJsonNull()) && !jsonObj.get("custom_scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_scale").toString()));
      }
      if (!jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
      if (!jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      // validate the optional field `payment_cycle`
      if (jsonObj.get("payment_cycle") != null && !jsonObj.get("payment_cycle").isJsonNull()) {
        GetTimesheetsByContract200ResponseDataInnerPaymentCycle.validateJsonElement(jsonObj.get("payment_cycle"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("approvers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvers` to be an array in the JSON string but got `%s`", jsonObj.get("approvers").toString()));
      }

      JsonArray jsonArrayapprovers = jsonObj.getAsJsonArray("approvers");
      // validate the required field `approvers` (array)
      for (int i = 0; i < jsonArrayapprovers.size(); i++) {
        GetTimesheetById200ResponseDataAllOfApproversInner.validateJsonElement(jsonArrayapprovers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTimesheetById200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTimesheetById200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTimesheetById200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTimesheetById200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTimesheetById200ResponseData>() {
           @Override
           public void write(JsonWriter out, GetTimesheetById200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTimesheetById200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetTimesheetById200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTimesheetById200ResponseData
   * @throws IOException if the JSON string is invalid with respect to GetTimesheetById200ResponseData
   */
  public static GetTimesheetById200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTimesheetById200ResponseData.class);
  }

  /**
   * Convert an instance of GetTimesheetById200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

