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
 * Text type
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:06:48.603230199Z[GMT]", comments = "Generator version: 7.10.0")
public class GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private String value;

  public GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf() {
  }

  public GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf value(@javax.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable String value) {
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
    GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf getCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf = (GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf) o;
    return Objects.equals(this.value, getCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf is not found in the empty JSON string", GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf>() {
           @Override
           public void write(JsonWriter out, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf
   * @throws IOException if the JSON string is invalid with respect to GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf
   */
  public static GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf.class);
  }

  /**
   * Convert an instance of GetCustomFieldValuesFromWorker200ResponseDataInnerDataOneOf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

