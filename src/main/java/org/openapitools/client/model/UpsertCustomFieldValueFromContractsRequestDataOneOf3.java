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
 * List type
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:17:35.281321822Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertCustomFieldValueFromContractsRequestDataOneOf3 {
  public static final String SERIALIZED_NAME_OPTION = "option";
  @SerializedName(SERIALIZED_NAME_OPTION)
  @javax.annotation.Nullable
  private String option;

  public UpsertCustomFieldValueFromContractsRequestDataOneOf3() {
  }

  public UpsertCustomFieldValueFromContractsRequestDataOneOf3 option(@javax.annotation.Nullable String option) {
    this.option = option;
    return this;
  }

  /**
   * Get option
   * @return option
   */
  @javax.annotation.Nullable
  public String getOption() {
    return option;
  }

  public void setOption(@javax.annotation.Nullable String option) {
    this.option = option;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertCustomFieldValueFromContractsRequestDataOneOf3 upsertCustomFieldValueFromContractsRequestDataOneOf3 = (UpsertCustomFieldValueFromContractsRequestDataOneOf3) o;
    return Objects.equals(this.option, upsertCustomFieldValueFromContractsRequestDataOneOf3.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertCustomFieldValueFromContractsRequestDataOneOf3 {\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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
    openapiFields.add("option");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpsertCustomFieldValueFromContractsRequestDataOneOf3
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertCustomFieldValueFromContractsRequestDataOneOf3.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertCustomFieldValueFromContractsRequestDataOneOf3 is not found in the empty JSON string", UpsertCustomFieldValueFromContractsRequestDataOneOf3.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertCustomFieldValueFromContractsRequestDataOneOf3.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertCustomFieldValueFromContractsRequestDataOneOf3` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("option") != null && !jsonObj.get("option").isJsonNull()) && !jsonObj.get("option").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `option` to be a primitive type in the JSON string but got `%s`", jsonObj.get("option").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertCustomFieldValueFromContractsRequestDataOneOf3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertCustomFieldValueFromContractsRequestDataOneOf3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataOneOf3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertCustomFieldValueFromContractsRequestDataOneOf3.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertCustomFieldValueFromContractsRequestDataOneOf3>() {
           @Override
           public void write(JsonWriter out, UpsertCustomFieldValueFromContractsRequestDataOneOf3 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertCustomFieldValueFromContractsRequestDataOneOf3 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpsertCustomFieldValueFromContractsRequestDataOneOf3 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpsertCustomFieldValueFromContractsRequestDataOneOf3
   * @throws IOException if the JSON string is invalid with respect to UpsertCustomFieldValueFromContractsRequestDataOneOf3
   */
  public static UpsertCustomFieldValueFromContractsRequestDataOneOf3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertCustomFieldValueFromContractsRequestDataOneOf3.class);
  }

  /**
   * Convert an instance of UpsertCustomFieldValueFromContractsRequestDataOneOf3 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

