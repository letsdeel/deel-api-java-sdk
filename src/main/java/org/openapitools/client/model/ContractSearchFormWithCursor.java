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
 * This is a model to make it easier to understand and restrict search parameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:25:45.183107737Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractSearchFormWithCursor {
  public static final String SERIALIZED_NAME_AFTER_CURSOR = "after_cursor";
  @SerializedName(SERIALIZED_NAME_AFTER_CURSOR)
  @javax.annotation.Nullable
  private String afterCursor;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  @javax.annotation.Nullable
  private String limit = "10";

  public ContractSearchFormWithCursor() {
  }

  public ContractSearchFormWithCursor afterCursor(@javax.annotation.Nullable String afterCursor) {
    this.afterCursor = afterCursor;
    return this;
  }

  /**
   * Return next page of results after given cursor.
   * @return afterCursor
   */
  @javax.annotation.Nullable
  public String getAfterCursor() {
    return afterCursor;
  }

  public void setAfterCursor(@javax.annotation.Nullable String afterCursor) {
    this.afterCursor = afterCursor;
  }


  public ContractSearchFormWithCursor limit(@javax.annotation.Nullable String limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Return a page of results with given number of records.
   * @return limit
   */
  @javax.annotation.Nullable
  public String getLimit() {
    return limit;
  }

  public void setLimit(@javax.annotation.Nullable String limit) {
    this.limit = limit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractSearchFormWithCursor contractSearchFormWithCursor = (ContractSearchFormWithCursor) o;
    return Objects.equals(this.afterCursor, contractSearchFormWithCursor.afterCursor) &&
        Objects.equals(this.limit, contractSearchFormWithCursor.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterCursor, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractSearchFormWithCursor {\n");
    sb.append("    afterCursor: ").append(toIndentedString(afterCursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
    openapiFields.add("after_cursor");
    openapiFields.add("limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContractSearchFormWithCursor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractSearchFormWithCursor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractSearchFormWithCursor is not found in the empty JSON string", ContractSearchFormWithCursor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractSearchFormWithCursor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractSearchFormWithCursor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("after_cursor") != null && !jsonObj.get("after_cursor").isJsonNull()) && !jsonObj.get("after_cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after_cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after_cursor").toString()));
      }
      if ((jsonObj.get("limit") != null && !jsonObj.get("limit").isJsonNull()) && !jsonObj.get("limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractSearchFormWithCursor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractSearchFormWithCursor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractSearchFormWithCursor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractSearchFormWithCursor.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractSearchFormWithCursor>() {
           @Override
           public void write(JsonWriter out, ContractSearchFormWithCursor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractSearchFormWithCursor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractSearchFormWithCursor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractSearchFormWithCursor
   * @throws IOException if the JSON string is invalid with respect to ContractSearchFormWithCursor
   */
  public static ContractSearchFormWithCursor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractSearchFormWithCursor.class);
  }

  /**
   * Convert an instance of ContractSearchFormWithCursor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

