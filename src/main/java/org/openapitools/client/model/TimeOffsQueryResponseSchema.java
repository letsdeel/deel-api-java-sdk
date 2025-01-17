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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.TimeOffResponseCommon;

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
 * Time offs associated to the query
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class TimeOffsQueryResponseSchema {
  public static final String SERIALIZED_NAME_HAS_NEXT_PAGE = "has_next_page";
  @SerializedName(SERIALIZED_NAME_HAS_NEXT_PAGE)
  @javax.annotation.Nonnull
  private Boolean hasNextPage;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private List<TimeOffResponseCommon> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  @javax.annotation.Nonnull
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  @javax.annotation.Nonnull
  private Integer pageSize;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  @javax.annotation.Nullable
  private String next;

  public TimeOffsQueryResponseSchema() {
  }

  public TimeOffsQueryResponseSchema hasNextPage(@javax.annotation.Nonnull Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }

  /**
   * Get hasNextPage
   * @return hasNextPage
   */
  @javax.annotation.Nonnull
  public Boolean getHasNextPage() {
    return hasNextPage;
  }

  public void setHasNextPage(@javax.annotation.Nonnull Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }


  public TimeOffsQueryResponseSchema data(@javax.annotation.Nonnull List<TimeOffResponseCommon> data) {
    this.data = data;
    return this;
  }

  public TimeOffsQueryResponseSchema addDataItem(TimeOffResponseCommon dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  public List<TimeOffResponseCommon> getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull List<TimeOffResponseCommon> data) {
    this.data = data;
  }


  public TimeOffsQueryResponseSchema page(@javax.annotation.Nonnull Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * minimum: 1
   * maximum: 2147483647
   * @return page
   */
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }

  public void setPage(@javax.annotation.Nonnull Integer page) {
    this.page = page;
  }


  public TimeOffsQueryResponseSchema pageSize(@javax.annotation.Nonnull Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * minimum: 5
   * maximum: 200
   * @return pageSize
   */
  @javax.annotation.Nonnull
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(@javax.annotation.Nonnull Integer pageSize) {
    this.pageSize = pageSize;
  }


  public TimeOffsQueryResponseSchema next(@javax.annotation.Nullable String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   */
  @javax.annotation.Nullable
  public String getNext() {
    return next;
  }

  public void setNext(@javax.annotation.Nullable String next) {
    this.next = next;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffsQueryResponseSchema timeOffsQueryResponseSchema = (TimeOffsQueryResponseSchema) o;
    return Objects.equals(this.hasNextPage, timeOffsQueryResponseSchema.hasNextPage) &&
        Objects.equals(this.data, timeOffsQueryResponseSchema.data) &&
        Objects.equals(this.page, timeOffsQueryResponseSchema.page) &&
        Objects.equals(this.pageSize, timeOffsQueryResponseSchema.pageSize) &&
        Objects.equals(this.next, timeOffsQueryResponseSchema.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasNextPage, data, page, pageSize, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffsQueryResponseSchema {\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
    openapiFields.add("has_next_page");
    openapiFields.add("data");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("has_next_page");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("page_size");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeOffsQueryResponseSchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeOffsQueryResponseSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeOffsQueryResponseSchema is not found in the empty JSON string", TimeOffsQueryResponseSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeOffsQueryResponseSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeOffsQueryResponseSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeOffsQueryResponseSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }

      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      // validate the required field `data` (array)
      for (int i = 0; i < jsonArraydata.size(); i++) {
        TimeOffResponseCommon.validateJsonElement(jsonArraydata.get(i));
      };
      if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull()) && !jsonObj.get("next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeOffsQueryResponseSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeOffsQueryResponseSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeOffsQueryResponseSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeOffsQueryResponseSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeOffsQueryResponseSchema>() {
           @Override
           public void write(JsonWriter out, TimeOffsQueryResponseSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeOffsQueryResponseSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeOffsQueryResponseSchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeOffsQueryResponseSchema
   * @throws IOException if the JSON string is invalid with respect to TimeOffsQueryResponseSchema
   */
  public static TimeOffsQueryResponseSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeOffsQueryResponseSchema.class);
  }

  /**
   * Convert an instance of TimeOffsQueryResponseSchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

