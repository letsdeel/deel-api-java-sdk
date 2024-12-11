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
 * GetGpBankGuide200ResponseDataInnerValuesAllowedInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:39:46.997965815Z[GMT]", comments = "Generator version: 7.10.0")
public class GetGpBankGuide200ResponseDataInnerValuesAllowedInner {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private String value;

  public GetGpBankGuide200ResponseDataInnerValuesAllowedInner() {
  }

  public GetGpBankGuide200ResponseDataInnerValuesAllowedInner label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * The display name of the allowed value.
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public GetGpBankGuide200ResponseDataInnerValuesAllowedInner value(@javax.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * The value associated with the allowed option.
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
    GetGpBankGuide200ResponseDataInnerValuesAllowedInner getGpBankGuide200ResponseDataInnerValuesAllowedInner = (GetGpBankGuide200ResponseDataInnerValuesAllowedInner) o;
    return Objects.equals(this.label, getGpBankGuide200ResponseDataInnerValuesAllowedInner.label) &&
        Objects.equals(this.value, getGpBankGuide200ResponseDataInnerValuesAllowedInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGpBankGuide200ResponseDataInnerValuesAllowedInner {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetGpBankGuide200ResponseDataInnerValuesAllowedInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetGpBankGuide200ResponseDataInnerValuesAllowedInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGpBankGuide200ResponseDataInnerValuesAllowedInner is not found in the empty JSON string", GetGpBankGuide200ResponseDataInnerValuesAllowedInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetGpBankGuide200ResponseDataInnerValuesAllowedInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGpBankGuide200ResponseDataInnerValuesAllowedInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGpBankGuide200ResponseDataInnerValuesAllowedInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGpBankGuide200ResponseDataInnerValuesAllowedInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGpBankGuide200ResponseDataInnerValuesAllowedInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGpBankGuide200ResponseDataInnerValuesAllowedInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGpBankGuide200ResponseDataInnerValuesAllowedInner>() {
           @Override
           public void write(JsonWriter out, GetGpBankGuide200ResponseDataInnerValuesAllowedInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGpBankGuide200ResponseDataInnerValuesAllowedInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetGpBankGuide200ResponseDataInnerValuesAllowedInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetGpBankGuide200ResponseDataInnerValuesAllowedInner
   * @throws IOException if the JSON string is invalid with respect to GetGpBankGuide200ResponseDataInnerValuesAllowedInner
   */
  public static GetGpBankGuide200ResponseDataInnerValuesAllowedInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGpBankGuide200ResponseDataInnerValuesAllowedInner.class);
  }

  /**
   * Convert an instance of GetGpBankGuide200ResponseDataInnerValuesAllowedInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

