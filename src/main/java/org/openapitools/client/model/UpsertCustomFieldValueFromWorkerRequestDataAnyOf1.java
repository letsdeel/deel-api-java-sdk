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
 * Number type
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:45:24.021173966Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private BigDecimal value;

  public UpsertCustomFieldValueFromWorkerRequestDataAnyOf1() {
  }

  public UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 value(@javax.annotation.Nullable BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Number type
   * @return value
   */
  @javax.annotation.Nullable
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable BigDecimal value) {
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
    UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 upsertCustomFieldValueFromWorkerRequestDataAnyOf1 = (UpsertCustomFieldValueFromWorkerRequestDataAnyOf1) o;
    return Objects.equals(this.value, upsertCustomFieldValueFromWorkerRequestDataAnyOf1.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to UpsertCustomFieldValueFromWorkerRequestDataAnyOf1
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertCustomFieldValueFromWorkerRequestDataAnyOf1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 is not found in the empty JSON string", UpsertCustomFieldValueFromWorkerRequestDataAnyOf1.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertCustomFieldValueFromWorkerRequestDataAnyOf1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertCustomFieldValueFromWorkerRequestDataAnyOf1` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertCustomFieldValueFromWorkerRequestDataAnyOf1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertCustomFieldValueFromWorkerRequestDataAnyOf1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataAnyOf1.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf1>() {
           @Override
           public void write(JsonWriter out, UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpsertCustomFieldValueFromWorkerRequestDataAnyOf1
   * @throws IOException if the JSON string is invalid with respect to UpsertCustomFieldValueFromWorkerRequestDataAnyOf1
   */
  public static UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertCustomFieldValueFromWorkerRequestDataAnyOf1.class);
  }

  /**
   * Convert an instance of UpsertCustomFieldValueFromWorkerRequestDataAnyOf1 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

