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
import java.util.Arrays;
import org.openapitools.client.model.PaymentsDetailedReportContainerDataInnerContract;
import org.openapitools.client.model.PaymentsDetailedReportContainerDataInnerInvoice;
import org.openapitools.client.model.PaymentsDetailedReportContainerDataInnerLineItem;
import org.openapitools.client.model.PaymentsDetailedReportContainerDataInnerPayment;

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
 * PaymentsDetailedReportContainerDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:25:45.183107737Z[GMT]", comments = "Generator version: 7.10.0")
public class PaymentsDetailedReportContainerDataInner {
  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  @javax.annotation.Nullable
  private PaymentsDetailedReportContainerDataInnerInvoice invoice;

  public static final String SERIALIZED_NAME_LINE_ITEM = "line_item";
  @SerializedName(SERIALIZED_NAME_LINE_ITEM)
  @javax.annotation.Nullable
  private PaymentsDetailedReportContainerDataInnerLineItem lineItem;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  @javax.annotation.Nullable
  private PaymentsDetailedReportContainerDataInnerPayment payment;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  @javax.annotation.Nullable
  private PaymentsDetailedReportContainerDataInnerContract contract;

  public PaymentsDetailedReportContainerDataInner() {
  }

  public PaymentsDetailedReportContainerDataInner invoice(@javax.annotation.Nullable PaymentsDetailedReportContainerDataInnerInvoice invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Get invoice
   * @return invoice
   */
  @javax.annotation.Nullable
  public PaymentsDetailedReportContainerDataInnerInvoice getInvoice() {
    return invoice;
  }

  public void setInvoice(@javax.annotation.Nullable PaymentsDetailedReportContainerDataInnerInvoice invoice) {
    this.invoice = invoice;
  }


  public PaymentsDetailedReportContainerDataInner lineItem(@javax.annotation.Nullable PaymentsDetailedReportContainerDataInnerLineItem lineItem) {
    this.lineItem = lineItem;
    return this;
  }

  /**
   * Get lineItem
   * @return lineItem
   */
  @javax.annotation.Nullable
  public PaymentsDetailedReportContainerDataInnerLineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(@javax.annotation.Nullable PaymentsDetailedReportContainerDataInnerLineItem lineItem) {
    this.lineItem = lineItem;
  }


  public PaymentsDetailedReportContainerDataInner payment(@javax.annotation.Nullable PaymentsDetailedReportContainerDataInnerPayment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
   */
  @javax.annotation.Nullable
  public PaymentsDetailedReportContainerDataInnerPayment getPayment() {
    return payment;
  }

  public void setPayment(@javax.annotation.Nullable PaymentsDetailedReportContainerDataInnerPayment payment) {
    this.payment = payment;
  }


  public PaymentsDetailedReportContainerDataInner contract(@javax.annotation.Nullable PaymentsDetailedReportContainerDataInnerContract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
   */
  @javax.annotation.Nullable
  public PaymentsDetailedReportContainerDataInnerContract getContract() {
    return contract;
  }

  public void setContract(@javax.annotation.Nullable PaymentsDetailedReportContainerDataInnerContract contract) {
    this.contract = contract;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsDetailedReportContainerDataInner paymentsDetailedReportContainerDataInner = (PaymentsDetailedReportContainerDataInner) o;
    return Objects.equals(this.invoice, paymentsDetailedReportContainerDataInner.invoice) &&
        Objects.equals(this.lineItem, paymentsDetailedReportContainerDataInner.lineItem) &&
        Objects.equals(this.payment, paymentsDetailedReportContainerDataInner.payment) &&
        Objects.equals(this.contract, paymentsDetailedReportContainerDataInner.contract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice, lineItem, payment, contract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsDetailedReportContainerDataInner {\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
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
    openapiFields.add("invoice");
    openapiFields.add("line_item");
    openapiFields.add("payment");
    openapiFields.add("contract");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PaymentsDetailedReportContainerDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentsDetailedReportContainerDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentsDetailedReportContainerDataInner is not found in the empty JSON string", PaymentsDetailedReportContainerDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentsDetailedReportContainerDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentsDetailedReportContainerDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `invoice`
      if (jsonObj.get("invoice") != null && !jsonObj.get("invoice").isJsonNull()) {
        PaymentsDetailedReportContainerDataInnerInvoice.validateJsonElement(jsonObj.get("invoice"));
      }
      // validate the optional field `line_item`
      if (jsonObj.get("line_item") != null && !jsonObj.get("line_item").isJsonNull()) {
        PaymentsDetailedReportContainerDataInnerLineItem.validateJsonElement(jsonObj.get("line_item"));
      }
      // validate the optional field `payment`
      if (jsonObj.get("payment") != null && !jsonObj.get("payment").isJsonNull()) {
        PaymentsDetailedReportContainerDataInnerPayment.validateJsonElement(jsonObj.get("payment"));
      }
      // validate the optional field `contract`
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonNull()) {
        PaymentsDetailedReportContainerDataInnerContract.validateJsonElement(jsonObj.get("contract"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentsDetailedReportContainerDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentsDetailedReportContainerDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentsDetailedReportContainerDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentsDetailedReportContainerDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentsDetailedReportContainerDataInner>() {
           @Override
           public void write(JsonWriter out, PaymentsDetailedReportContainerDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentsDetailedReportContainerDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PaymentsDetailedReportContainerDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentsDetailedReportContainerDataInner
   * @throws IOException if the JSON string is invalid with respect to PaymentsDetailedReportContainerDataInner
   */
  public static PaymentsDetailedReportContainerDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentsDetailedReportContainerDataInner.class);
  }

  /**
   * Convert an instance of PaymentsDetailedReportContainerDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

