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
 * Object containing additional information about the enrollment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class Get401kEnrollmentsDefinition200ResponseInnerDetails {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private String key;

  public Get401kEnrollmentsDefinition200ResponseInnerDetails() {
  }

  public Get401kEnrollmentsDefinition200ResponseInnerDetails key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * A key-value pair providing additional details about the enrollment.
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Get401kEnrollmentsDefinition200ResponseInnerDetails get401kEnrollmentsDefinition200ResponseInnerDetails = (Get401kEnrollmentsDefinition200ResponseInnerDetails) o;
    return Objects.equals(this.key, get401kEnrollmentsDefinition200ResponseInnerDetails.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Get401kEnrollmentsDefinition200ResponseInnerDetails {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Get401kEnrollmentsDefinition200ResponseInnerDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Get401kEnrollmentsDefinition200ResponseInnerDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Get401kEnrollmentsDefinition200ResponseInnerDetails is not found in the empty JSON string", Get401kEnrollmentsDefinition200ResponseInnerDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Get401kEnrollmentsDefinition200ResponseInnerDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Get401kEnrollmentsDefinition200ResponseInnerDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Get401kEnrollmentsDefinition200ResponseInnerDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Get401kEnrollmentsDefinition200ResponseInnerDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Get401kEnrollmentsDefinition200ResponseInnerDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Get401kEnrollmentsDefinition200ResponseInnerDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<Get401kEnrollmentsDefinition200ResponseInnerDetails>() {
           @Override
           public void write(JsonWriter out, Get401kEnrollmentsDefinition200ResponseInnerDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Get401kEnrollmentsDefinition200ResponseInnerDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Get401kEnrollmentsDefinition200ResponseInnerDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Get401kEnrollmentsDefinition200ResponseInnerDetails
   * @throws IOException if the JSON string is invalid with respect to Get401kEnrollmentsDefinition200ResponseInnerDetails
   */
  public static Get401kEnrollmentsDefinition200ResponseInnerDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Get401kEnrollmentsDefinition200ResponseInnerDetails.class);
  }

  /**
   * Convert an instance of Get401kEnrollmentsDefinition200ResponseInnerDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

