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
import java.util.LinkedHashSet;
import java.util.Set;

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
 * Multiselect type
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:23:41.573776663Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 {
  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  @javax.annotation.Nullable
  private Set<String> options = new LinkedHashSet<>();

  public UpsertCustomFieldValueFromWorkerRequestDataAnyOf6() {
  }

  public UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 options(@javax.annotation.Nullable Set<String> options) {
    this.options = options;
    return this;
  }

  public UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new LinkedHashSet<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nullable
  public Set<String> getOptions() {
    return options;
  }

  public void setOptions(@javax.annotation.Nullable Set<String> options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 upsertCustomFieldValueFromWorkerRequestDataAnyOf6 = (UpsertCustomFieldValueFromWorkerRequestDataAnyOf6) o;
    return Objects.equals(this.options, upsertCustomFieldValueFromWorkerRequestDataAnyOf6.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpsertCustomFieldValueFromWorkerRequestDataAnyOf6
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertCustomFieldValueFromWorkerRequestDataAnyOf6.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 is not found in the empty JSON string", UpsertCustomFieldValueFromWorkerRequestDataAnyOf6.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertCustomFieldValueFromWorkerRequestDataAnyOf6.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertCustomFieldValueFromWorkerRequestDataAnyOf6` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull() && !jsonObj.get("options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertCustomFieldValueFromWorkerRequestDataAnyOf6.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertCustomFieldValueFromWorkerRequestDataAnyOf6' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf6> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromWorkerRequestDataAnyOf6.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertCustomFieldValueFromWorkerRequestDataAnyOf6>() {
           @Override
           public void write(JsonWriter out, UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpsertCustomFieldValueFromWorkerRequestDataAnyOf6
   * @throws IOException if the JSON string is invalid with respect to UpsertCustomFieldValueFromWorkerRequestDataAnyOf6
   */
  public static UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertCustomFieldValueFromWorkerRequestDataAnyOf6.class);
  }

  /**
   * Convert an instance of UpsertCustomFieldValueFromWorkerRequestDataAnyOf6 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

