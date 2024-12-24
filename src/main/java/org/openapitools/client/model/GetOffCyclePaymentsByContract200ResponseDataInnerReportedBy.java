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
import java.util.UUID;

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
 * Details of the person who reported the off-cycle payment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:15:13.914237102Z[GMT]", comments = "Generator version: 7.10.0")
public class GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  @javax.annotation.Nonnull
  private String fullName;

  public GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy() {
  }

  public GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the reporter.
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy fullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name of the individual who reported the payment.
   * @return fullName
   */
  @javax.annotation.Nonnull
  public String getFullName() {
    return fullName;
  }

  public void setFullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy getOffCyclePaymentsByContract200ResponseDataInnerReportedBy = (GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy) o;
    return Objects.equals(this.id, getOffCyclePaymentsByContract200ResponseDataInnerReportedBy.id) &&
        Objects.equals(this.fullName, getOffCyclePaymentsByContract200ResponseDataInnerReportedBy.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
    openapiFields.add("full_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("full_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy is not found in the empty JSON string", GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy>() {
           @Override
           public void write(JsonWriter out, GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy
   * @throws IOException if the JSON string is invalid with respect to GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy
   */
  public static GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy.class);
  }

  /**
   * Convert an instance of GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

