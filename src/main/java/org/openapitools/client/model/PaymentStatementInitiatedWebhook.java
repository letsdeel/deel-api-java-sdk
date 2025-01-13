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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * PaymentStatementInitiatedWebhook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class PaymentStatementInitiatedWebhook {
  public static final String SERIALIZED_NAME_BILLING_INVOICES = "billing_invoices";
  @SerializedName(SERIALIZED_NAME_BILLING_INVOICES)
  @javax.annotation.Nonnull
  private List<BigDecimal> billingInvoices = new ArrayList<>();

  public static final String SERIALIZED_NAME_INVOICES = "invoices";
  @SerializedName(SERIALIZED_NAME_INVOICES)
  @javax.annotation.Nonnull
  private List<BigDecimal> invoices = new ArrayList<>();

  public PaymentStatementInitiatedWebhook() {
  }

  public PaymentStatementInitiatedWebhook billingInvoices(@javax.annotation.Nonnull List<BigDecimal> billingInvoices) {
    this.billingInvoices = billingInvoices;
    return this;
  }

  public PaymentStatementInitiatedWebhook addBillingInvoicesItem(BigDecimal billingInvoicesItem) {
    if (this.billingInvoices == null) {
      this.billingInvoices = new ArrayList<>();
    }
    this.billingInvoices.add(billingInvoicesItem);
    return this;
  }

  /**
   * Get billingInvoices
   * @return billingInvoices
   */
  @javax.annotation.Nonnull
  public List<BigDecimal> getBillingInvoices() {
    return billingInvoices;
  }

  public void setBillingInvoices(@javax.annotation.Nonnull List<BigDecimal> billingInvoices) {
    this.billingInvoices = billingInvoices;
  }


  public PaymentStatementInitiatedWebhook invoices(@javax.annotation.Nonnull List<BigDecimal> invoices) {
    this.invoices = invoices;
    return this;
  }

  public PaymentStatementInitiatedWebhook addInvoicesItem(BigDecimal invoicesItem) {
    if (this.invoices == null) {
      this.invoices = new ArrayList<>();
    }
    this.invoices.add(invoicesItem);
    return this;
  }

  /**
   * Get invoices
   * @return invoices
   */
  @javax.annotation.Nonnull
  public List<BigDecimal> getInvoices() {
    return invoices;
  }

  public void setInvoices(@javax.annotation.Nonnull List<BigDecimal> invoices) {
    this.invoices = invoices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentStatementInitiatedWebhook paymentStatementInitiatedWebhook = (PaymentStatementInitiatedWebhook) o;
    return Objects.equals(this.billingInvoices, paymentStatementInitiatedWebhook.billingInvoices) &&
        Objects.equals(this.invoices, paymentStatementInitiatedWebhook.invoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingInvoices, invoices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentStatementInitiatedWebhook {\n");
    sb.append("    billingInvoices: ").append(toIndentedString(billingInvoices)).append("\n");
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
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
    openapiFields.add("billing_invoices");
    openapiFields.add("invoices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("billing_invoices");
    openapiRequiredFields.add("invoices");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PaymentStatementInitiatedWebhook
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentStatementInitiatedWebhook.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentStatementInitiatedWebhook is not found in the empty JSON string", PaymentStatementInitiatedWebhook.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentStatementInitiatedWebhook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentStatementInitiatedWebhook` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentStatementInitiatedWebhook.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("billing_invoices") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("billing_invoices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_invoices` to be an array in the JSON string but got `%s`", jsonObj.get("billing_invoices").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("invoices") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("invoices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoices` to be an array in the JSON string but got `%s`", jsonObj.get("invoices").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentStatementInitiatedWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentStatementInitiatedWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentStatementInitiatedWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentStatementInitiatedWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentStatementInitiatedWebhook>() {
           @Override
           public void write(JsonWriter out, PaymentStatementInitiatedWebhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentStatementInitiatedWebhook read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PaymentStatementInitiatedWebhook given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentStatementInitiatedWebhook
   * @throws IOException if the JSON string is invalid with respect to PaymentStatementInitiatedWebhook
   */
  public static PaymentStatementInitiatedWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentStatementInitiatedWebhook.class);
  }

  /**
   * Convert an instance of PaymentStatementInitiatedWebhook to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

