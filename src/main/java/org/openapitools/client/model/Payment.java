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
import org.openapitools.client.model.PaymentMethod;
import org.openapitools.client.model.PaymentStatusEnum;
import org.openapitools.client.model.PaymentWorker;

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
 * Payment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class Payment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private BigDecimal id;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  @javax.annotation.Nonnull
  private PaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private PaymentStatusEnum status;

  public static final String SERIALIZED_NAME_PAYMENT_CURRENCY = "payment_currency";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CURRENCY)
  @javax.annotation.Nonnull
  private String paymentCurrency;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nonnull
  private String label;

  public static final String SERIALIZED_NAME_PAID_AT = "paid_at";
  @SerializedName(SERIALIZED_NAME_PAID_AT)
  @javax.annotation.Nullable
  private OffsetDateTime paidAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nonnull
  private String total;

  public static final String SERIALIZED_NAME_WORKERS = "workers";
  @SerializedName(SERIALIZED_NAME_WORKERS)
  @javax.annotation.Nonnull
  private List<PaymentWorker> workers = new ArrayList<>();

  public Payment() {
  }

  public Payment id(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the payment.
   * @return id
   */
  @javax.annotation.Nonnull
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
  }


  public Payment paymentMethod(@javax.annotation.Nonnull PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @javax.annotation.Nonnull
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(@javax.annotation.Nonnull PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public Payment status(@javax.annotation.Nonnull PaymentStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public PaymentStatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull PaymentStatusEnum status) {
    this.status = status;
  }


  public Payment paymentCurrency(@javax.annotation.Nonnull String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
    return this;
  }

  /**
   * Currency code.
   * @return paymentCurrency
   */
  @javax.annotation.Nonnull
  public String getPaymentCurrency() {
    return paymentCurrency;
  }

  public void setPaymentCurrency(@javax.annotation.Nonnull String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }


  public Payment label(@javax.annotation.Nonnull String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nonnull
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nonnull String label) {
    this.label = label;
  }


  public Payment paidAt(@javax.annotation.Nullable OffsetDateTime paidAt) {
    this.paidAt = paidAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return paidAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getPaidAt() {
    return paidAt;
  }

  public void setPaidAt(@javax.annotation.Nullable OffsetDateTime paidAt) {
    this.paidAt = paidAt;
  }


  public Payment createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
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


  public Payment total(@javax.annotation.Nonnull String total) {
    this.total = total;
    return this;
  }

  /**
   * Total paid.
   * @return total
   */
  @javax.annotation.Nonnull
  public String getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nonnull String total) {
    this.total = total;
  }


  public Payment workers(@javax.annotation.Nonnull List<PaymentWorker> workers) {
    this.workers = workers;
    return this;
  }

  public Payment addWorkersItem(PaymentWorker workersItem) {
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
  @javax.annotation.Nonnull
  public List<PaymentWorker> getWorkers() {
    return workers;
  }

  public void setWorkers(@javax.annotation.Nonnull List<PaymentWorker> workers) {
    this.workers = workers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.id, payment.id) &&
        Objects.equals(this.paymentMethod, payment.paymentMethod) &&
        Objects.equals(this.status, payment.status) &&
        Objects.equals(this.paymentCurrency, payment.paymentCurrency) &&
        Objects.equals(this.label, payment.label) &&
        Objects.equals(this.paidAt, payment.paidAt) &&
        Objects.equals(this.createdAt, payment.createdAt) &&
        Objects.equals(this.total, payment.total) &&
        Objects.equals(this.workers, payment.workers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentMethod, status, paymentCurrency, label, paidAt, createdAt, total, workers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentCurrency: ").append(toIndentedString(paymentCurrency)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    paidAt: ").append(toIndentedString(paidAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    workers: ").append(toIndentedString(workers)).append("\n");
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
    openapiFields.add("payment_method");
    openapiFields.add("status");
    openapiFields.add("payment_currency");
    openapiFields.add("label");
    openapiFields.add("paid_at");
    openapiFields.add("created_at");
    openapiFields.add("total");
    openapiFields.add("workers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("payment_method");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("payment_currency");
    openapiRequiredFields.add("label");
    openapiRequiredFields.add("paid_at");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("workers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Payment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Payment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Payment is not found in the empty JSON string", Payment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Payment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Payment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Payment.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `payment_method`
      PaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
      // validate the required field `status`
      PaymentStatusEnum.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("payment_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_currency").toString()));
      }
      if (!jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (!jsonObj.get("total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("workers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workers` to be an array in the JSON string but got `%s`", jsonObj.get("workers").toString()));
      }

      JsonArray jsonArrayworkers = jsonObj.getAsJsonArray("workers");
      // validate the required field `workers` (array)
      for (int i = 0; i < jsonArrayworkers.size(); i++) {
        PaymentWorker.validateJsonElement(jsonArrayworkers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Payment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Payment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Payment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Payment.class));

       return (TypeAdapter<T>) new TypeAdapter<Payment>() {
           @Override
           public void write(JsonWriter out, Payment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Payment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Payment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Payment
   * @throws IOException if the JSON string is invalid with respect to Payment
   */
  public static Payment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Payment.class);
  }

  /**
   * Convert an instance of Payment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

