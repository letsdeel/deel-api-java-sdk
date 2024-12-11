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
import java.time.LocalDate;
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
 * Date type: YYYY-MM-DD
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:31:34.541358368Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertCustomFieldValueFromWorkerRequestDataOneOf2 {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private LocalDate value;

  public UpsertCustomFieldValueFromWorkerRequestDataOneOf2() {
  }

  public UpsertCustomFieldValueFromWorkerRequestDataOneOf2 value(@javax.annotation.Nullable LocalDate value) {
    this.value = value;
    return this;
  }

  /**
   * Date type: YYYY-MM-DD
   * @return value
   */
  @javax.annotation.Nullable
  public LocalDate getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable LocalDate value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertCustomFieldValueFromWorkerRequestDataOneOf2 upsertCustomFieldValueFromWorkerRequestDataOneOf2 = (UpsertCustomFieldValueFromWorkerRequestDataOneOf2) o;
    return Objects.equals(this.value, upsertCustomFieldValueFromWorkerRequestDataOneOf2.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertCustomFieldValueFromWorkerRequestDataOneOf2 {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpsertCustomFieldValueFromWorkerRequestDataOneOf2
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertCustomFieldValueFromWorkerRequestDataOneOf2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertCustomFieldValueFromWorkerRequestDataOneOf2 is not found in the empty JSON string", UpsertCustomFieldValueFromWorkerRequestDataOneOf2.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertCustomFieldValueFromWorkerRequestDataOneOf2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertCustomFieldValueFromWorkerRequestDataOneOf2` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertCustomFieldValueFromWorkerRequestDataOneOf2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertCustomFieldValueFromWorkerRequestDataOneOf2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataOneOf2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataOneOf2.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataOneOf2>() {
           @Override
           public void write(JsonWriter out, UpsertCustomFieldValueFromWorkerRequestDataOneOf2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertCustomFieldValueFromWorkerRequestDataOneOf2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpsertCustomFieldValueFromWorkerRequestDataOneOf2 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpsertCustomFieldValueFromWorkerRequestDataOneOf2
   * @throws IOException if the JSON string is invalid with respect to UpsertCustomFieldValueFromWorkerRequestDataOneOf2
   */
  public static UpsertCustomFieldValueFromWorkerRequestDataOneOf2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertCustomFieldValueFromWorkerRequestDataOneOf2.class);
  }

  /**
   * Convert an instance of UpsertCustomFieldValueFromWorkerRequestDataOneOf2 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

