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
 * PaymentsDetailedReportContainerDataInnerInvoice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class PaymentsDetailedReportContainerDataInnerInvoice {
  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  @javax.annotation.Nullable
  private String document;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public PaymentsDetailedReportContainerDataInnerInvoice() {
  }

  public PaymentsDetailedReportContainerDataInnerInvoice document(@javax.annotation.Nullable String document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   */
  @javax.annotation.Nullable
  public String getDocument() {
    return document;
  }

  public void setDocument(@javax.annotation.Nullable String document) {
    this.document = document;
  }


  public PaymentsDetailedReportContainerDataInnerInvoice issuedAt(@javax.annotation.Nullable OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(@javax.annotation.Nullable OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public PaymentsDetailedReportContainerDataInnerInvoice id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsDetailedReportContainerDataInnerInvoice paymentsDetailedReportContainerDataInnerInvoice = (PaymentsDetailedReportContainerDataInnerInvoice) o;
    return Objects.equals(this.document, paymentsDetailedReportContainerDataInnerInvoice.document) &&
        Objects.equals(this.issuedAt, paymentsDetailedReportContainerDataInnerInvoice.issuedAt) &&
        Objects.equals(this.id, paymentsDetailedReportContainerDataInnerInvoice.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, issuedAt, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsDetailedReportContainerDataInnerInvoice {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("document");
    openapiFields.add("issued_at");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PaymentsDetailedReportContainerDataInnerInvoice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentsDetailedReportContainerDataInnerInvoice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentsDetailedReportContainerDataInnerInvoice is not found in the empty JSON string", PaymentsDetailedReportContainerDataInnerInvoice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentsDetailedReportContainerDataInnerInvoice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentsDetailedReportContainerDataInnerInvoice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("document") != null && !jsonObj.get("document").isJsonNull()) && !jsonObj.get("document").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentsDetailedReportContainerDataInnerInvoice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentsDetailedReportContainerDataInnerInvoice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentsDetailedReportContainerDataInnerInvoice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentsDetailedReportContainerDataInnerInvoice.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentsDetailedReportContainerDataInnerInvoice>() {
           @Override
           public void write(JsonWriter out, PaymentsDetailedReportContainerDataInnerInvoice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentsDetailedReportContainerDataInnerInvoice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PaymentsDetailedReportContainerDataInnerInvoice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentsDetailedReportContainerDataInnerInvoice
   * @throws IOException if the JSON string is invalid with respect to PaymentsDetailedReportContainerDataInnerInvoice
   */
  public static PaymentsDetailedReportContainerDataInnerInvoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentsDetailedReportContainerDataInnerInvoice.class);
  }

  /**
   * Convert an instance of PaymentsDetailedReportContainerDataInnerInvoice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

