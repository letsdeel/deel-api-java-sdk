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
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.client.model.GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy;

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
 * GetOffCyclePaymentsByContract200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T11:33:27.931295037Z[GMT]", comments = "Generator version: 7.10.0")
public class GetOffCyclePaymentsByContract200ResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private String amount;

  /**
   * The current status of the off-cycle payment.
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

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_REPORTED_BY = "reported_by";
  @SerializedName(SERIALIZED_NAME_REPORTED_BY)
  @javax.annotation.Nonnull
  private GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy reportedBy;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nonnull
  private String currencyCode;

  public static final String SERIALIZED_NAME_DATE_SUBMITTED = "date_submitted";
  @SerializedName(SERIALIZED_NAME_DATE_SUBMITTED)
  @javax.annotation.Nonnull
  private OffsetDateTime dateSubmitted;

  public GetOffCyclePaymentsByContract200ResponseDataInner() {
  }

  public GetOffCyclePaymentsByContract200ResponseDataInner id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the off-cycle payment.
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public GetOffCyclePaymentsByContract200ResponseDataInner amount(@javax.annotation.Nonnull String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the off-cycle payment.
   * @return amount
   */
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull String amount) {
    this.amount = amount;
  }


  public GetOffCyclePaymentsByContract200ResponseDataInner status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of the off-cycle payment.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public GetOffCyclePaymentsByContract200ResponseDataInner createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the off-cycle payment was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetOffCyclePaymentsByContract200ResponseDataInner description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * A description or reason for the off-cycle payment.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public GetOffCyclePaymentsByContract200ResponseDataInner reportedBy(@javax.annotation.Nonnull GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy reportedBy) {
    this.reportedBy = reportedBy;
    return this;
  }

  /**
   * Get reportedBy
   * @return reportedBy
   */
  @javax.annotation.Nonnull
  public GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy getReportedBy() {
    return reportedBy;
  }

  public void setReportedBy(@javax.annotation.Nonnull GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy reportedBy) {
    this.reportedBy = reportedBy;
  }


  public GetOffCyclePaymentsByContract200ResponseDataInner currencyCode(@javax.annotation.Nonnull String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The three-letter ISO currency code for the payment amount.
   * @return currencyCode
   */
  @javax.annotation.Nonnull
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nonnull String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public GetOffCyclePaymentsByContract200ResponseDataInner dateSubmitted(@javax.annotation.Nonnull OffsetDateTime dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
    return this;
  }

  /**
   * The timestamp when the off-cycle payment was submitted.
   * @return dateSubmitted
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getDateSubmitted() {
    return dateSubmitted;
  }

  public void setDateSubmitted(@javax.annotation.Nonnull OffsetDateTime dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOffCyclePaymentsByContract200ResponseDataInner getOffCyclePaymentsByContract200ResponseDataInner = (GetOffCyclePaymentsByContract200ResponseDataInner) o;
    return Objects.equals(this.id, getOffCyclePaymentsByContract200ResponseDataInner.id) &&
        Objects.equals(this.amount, getOffCyclePaymentsByContract200ResponseDataInner.amount) &&
        Objects.equals(this.status, getOffCyclePaymentsByContract200ResponseDataInner.status) &&
        Objects.equals(this.createdAt, getOffCyclePaymentsByContract200ResponseDataInner.createdAt) &&
        Objects.equals(this.description, getOffCyclePaymentsByContract200ResponseDataInner.description) &&
        Objects.equals(this.reportedBy, getOffCyclePaymentsByContract200ResponseDataInner.reportedBy) &&
        Objects.equals(this.currencyCode, getOffCyclePaymentsByContract200ResponseDataInner.currencyCode) &&
        Objects.equals(this.dateSubmitted, getOffCyclePaymentsByContract200ResponseDataInner.dateSubmitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, status, createdAt, description, reportedBy, currencyCode, dateSubmitted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOffCyclePaymentsByContract200ResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reportedBy: ").append(toIndentedString(reportedBy)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("created_at");
    openapiFields.add("description");
    openapiFields.add("reported_by");
    openapiFields.add("currency_code");
    openapiFields.add("date_submitted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("reported_by");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("date_submitted");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetOffCyclePaymentsByContract200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetOffCyclePaymentsByContract200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOffCyclePaymentsByContract200ResponseDataInner is not found in the empty JSON string", GetOffCyclePaymentsByContract200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetOffCyclePaymentsByContract200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetOffCyclePaymentsByContract200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetOffCyclePaymentsByContract200ResponseDataInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `reported_by`
      GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy.validateJsonElement(jsonObj.get("reported_by"));
      if (!jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOffCyclePaymentsByContract200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOffCyclePaymentsByContract200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOffCyclePaymentsByContract200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOffCyclePaymentsByContract200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOffCyclePaymentsByContract200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetOffCyclePaymentsByContract200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetOffCyclePaymentsByContract200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetOffCyclePaymentsByContract200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetOffCyclePaymentsByContract200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetOffCyclePaymentsByContract200ResponseDataInner
   */
  public static GetOffCyclePaymentsByContract200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOffCyclePaymentsByContract200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetOffCyclePaymentsByContract200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

