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
import org.openapitools.client.model.GetPaymentList200ResponseDataRowsInnerPaymentMethod;
import org.openapitools.client.model.TheWorkerForThePayment;

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
 * GetPaymentList200ResponseDataRowsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPaymentList200ResponseDataRowsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private BigDecimal id;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  /**
   * Status of the payment. Either &#39;paid&#39; or &#39;processing&#39;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PAID("paid"),
    
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

  public static final String SERIALIZED_NAME_PAID_AT = "paid_at";
  @SerializedName(SERIALIZED_NAME_PAID_AT)
  @javax.annotation.Nullable
  private OffsetDateTime paidAt;

  public static final String SERIALIZED_NAME_WORKERS = "workers";
  @SerializedName(SERIALIZED_NAME_WORKERS)
  @javax.annotation.Nullable
  private List<TheWorkerForThePayment> workers = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private String createdAt;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  @javax.annotation.Nullable
  private GetPaymentList200ResponseDataRowsInnerPaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_CURRENCY = "payment_currency";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CURRENCY)
  @javax.annotation.Nullable
  private String paymentCurrency;

  public GetPaymentList200ResponseDataRowsInner() {
  }

  public GetPaymentList200ResponseDataRowsInner id(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the payment.
   * @return id
   */
  @javax.annotation.Nullable
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
  }


  public GetPaymentList200ResponseDataRowsInner label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * A descriptive label for the payment.
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public GetPaymentList200ResponseDataRowsInner status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the payment. Either &#39;paid&#39; or &#39;processing&#39;.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public GetPaymentList200ResponseDataRowsInner paidAt(@javax.annotation.Nullable OffsetDateTime paidAt) {
    this.paidAt = paidAt;
    return this;
  }

  /**
   * Date and time when the payment was completed, in ISO-8601 format.
   * @return paidAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getPaidAt() {
    return paidAt;
  }

  public void setPaidAt(@javax.annotation.Nullable OffsetDateTime paidAt) {
    this.paidAt = paidAt;
  }


  public GetPaymentList200ResponseDataRowsInner workers(@javax.annotation.Nullable List<TheWorkerForThePayment> workers) {
    this.workers = workers;
    return this;
  }

  public GetPaymentList200ResponseDataRowsInner addWorkersItem(TheWorkerForThePayment workersItem) {
    if (this.workers == null) {
      this.workers = new ArrayList<>();
    }
    this.workers.add(workersItem);
    return this;
  }

  /**
   * Get workers
   * @return workers
   */
  @javax.annotation.Nullable
  public List<TheWorkerForThePayment> getWorkers() {
    return workers;
  }

  public void setWorkers(@javax.annotation.Nullable List<TheWorkerForThePayment> workers) {
    this.workers = workers;
  }


  public GetPaymentList200ResponseDataRowsInner createdAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date and time when the payment was created, in ISO-8601 format.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = createdAt;
  }


  public GetPaymentList200ResponseDataRowsInner paymentMethod(@javax.annotation.Nullable GetPaymentList200ResponseDataRowsInnerPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @javax.annotation.Nullable
  public GetPaymentList200ResponseDataRowsInnerPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(@javax.annotation.Nullable GetPaymentList200ResponseDataRowsInnerPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public GetPaymentList200ResponseDataRowsInner paymentCurrency(@javax.annotation.Nullable String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
    return this;
  }

  /**
   * Three-letter currency code for the payment, following ISO 4217.
   * @return paymentCurrency
   */
  @javax.annotation.Nullable
  public String getPaymentCurrency() {
    return paymentCurrency;
  }

  public void setPaymentCurrency(@javax.annotation.Nullable String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPaymentList200ResponseDataRowsInner getPaymentList200ResponseDataRowsInner = (GetPaymentList200ResponseDataRowsInner) o;
    return Objects.equals(this.id, getPaymentList200ResponseDataRowsInner.id) &&
        Objects.equals(this.label, getPaymentList200ResponseDataRowsInner.label) &&
        Objects.equals(this.status, getPaymentList200ResponseDataRowsInner.status) &&
        Objects.equals(this.paidAt, getPaymentList200ResponseDataRowsInner.paidAt) &&
        Objects.equals(this.workers, getPaymentList200ResponseDataRowsInner.workers) &&
        Objects.equals(this.createdAt, getPaymentList200ResponseDataRowsInner.createdAt) &&
        Objects.equals(this.paymentMethod, getPaymentList200ResponseDataRowsInner.paymentMethod) &&
        Objects.equals(this.paymentCurrency, getPaymentList200ResponseDataRowsInner.paymentCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, status, paidAt, workers, createdAt, paymentMethod, paymentCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentList200ResponseDataRowsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paidAt: ").append(toIndentedString(paidAt)).append("\n");
    sb.append("    workers: ").append(toIndentedString(workers)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentCurrency: ").append(toIndentedString(paymentCurrency)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("status");
    openapiFields.add("paid_at");
    openapiFields.add("workers");
    openapiFields.add("created_at");
    openapiFields.add("payment_method");
    openapiFields.add("payment_currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPaymentList200ResponseDataRowsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPaymentList200ResponseDataRowsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPaymentList200ResponseDataRowsInner is not found in the empty JSON string", GetPaymentList200ResponseDataRowsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPaymentList200ResponseDataRowsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPaymentList200ResponseDataRowsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if (jsonObj.get("workers") != null && !jsonObj.get("workers").isJsonNull()) {
        JsonArray jsonArrayworkers = jsonObj.getAsJsonArray("workers");
        if (jsonArrayworkers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("workers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `workers` to be an array in the JSON string but got `%s`", jsonObj.get("workers").toString()));
          }

          // validate the optional field `workers` (array)
          for (int i = 0; i < jsonArrayworkers.size(); i++) {
            TheWorkerForThePayment.validateJsonElement(jsonArrayworkers.get(i));
          };
        }
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      // validate the optional field `payment_method`
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) {
        GetPaymentList200ResponseDataRowsInnerPaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
      }
      if ((jsonObj.get("payment_currency") != null && !jsonObj.get("payment_currency").isJsonNull()) && !jsonObj.get("payment_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPaymentList200ResponseDataRowsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPaymentList200ResponseDataRowsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPaymentList200ResponseDataRowsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPaymentList200ResponseDataRowsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPaymentList200ResponseDataRowsInner>() {
           @Override
           public void write(JsonWriter out, GetPaymentList200ResponseDataRowsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPaymentList200ResponseDataRowsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPaymentList200ResponseDataRowsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPaymentList200ResponseDataRowsInner
   * @throws IOException if the JSON string is invalid with respect to GetPaymentList200ResponseDataRowsInner
   */
  public static GetPaymentList200ResponseDataRowsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPaymentList200ResponseDataRowsInner.class);
  }

  /**
   * Convert an instance of GetPaymentList200ResponseDataRowsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

