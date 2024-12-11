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
import org.openapitools.client.model.GetTimeOffsQuery200ResponseDataInner;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:11:44.252131062Z[GMT]", comments = "Generator version: 7.10.0")
public class GetTimeOffsQuery200Response {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private List<GetTimeOffsQuery200ResponseDataInner> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  @javax.annotation.Nullable
  private String next;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  @javax.annotation.Nonnull
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  @javax.annotation.Nonnull
  private Integer pageSize;

  public static final String SERIALIZED_NAME_HAS_NEXT_PAGE = "has_next_page";
  @SerializedName(SERIALIZED_NAME_HAS_NEXT_PAGE)
  @javax.annotation.Nonnull
  private Boolean hasNextPage;

  public GetTimeOffsQuery200Response() {
  }

  public GetTimeOffsQuery200Response data(@javax.annotation.Nonnull List<GetTimeOffsQuery200ResponseDataInner> data) {
    this.data = data;
    return this;
  }

  public GetTimeOffsQuery200Response addDataItem(GetTimeOffsQuery200ResponseDataInner dataItem) {
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
  public List<GetTimeOffsQuery200ResponseDataInner> getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull List<GetTimeOffsQuery200ResponseDataInner> data) {
    this.data = data;
  }


  public GetTimeOffsQuery200Response next(@javax.annotation.Nullable String next) {
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


  public GetTimeOffsQuery200Response page(@javax.annotation.Nonnull Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Current page
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


  public GetTimeOffsQuery200Response pageSize(@javax.annotation.Nonnull Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Page size
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


  public GetTimeOffsQuery200Response hasNextPage(@javax.annotation.Nonnull Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }

  /**
   * Has next page
   * @return hasNextPage
   */
  @javax.annotation.Nonnull
  public Boolean getHasNextPage() {
    return hasNextPage;
  }

  public void setHasNextPage(@javax.annotation.Nonnull Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimeOffsQuery200Response getTimeOffsQuery200Response = (GetTimeOffsQuery200Response) o;
    return Objects.equals(this.data, getTimeOffsQuery200Response.data) &&
        Objects.equals(this.next, getTimeOffsQuery200Response.next) &&
        Objects.equals(this.page, getTimeOffsQuery200Response.page) &&
        Objects.equals(this.pageSize, getTimeOffsQuery200Response.pageSize) &&
        Objects.equals(this.hasNextPage, getTimeOffsQuery200Response.hasNextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, next, page, pageSize, hasNextPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeOffsQuery200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("next");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("has_next_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("page_size");
    openapiRequiredFields.add("has_next_page");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetTimeOffsQuery200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTimeOffsQuery200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTimeOffsQuery200Response is not found in the empty JSON string", GetTimeOffsQuery200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTimeOffsQuery200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTimeOffsQuery200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTimeOffsQuery200Response.openapiRequiredFields) {
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
        GetTimeOffsQuery200ResponseDataInner.validateJsonElement(jsonArraydata.get(i));
      };
      if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull()) && !jsonObj.get("next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTimeOffsQuery200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTimeOffsQuery200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTimeOffsQuery200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTimeOffsQuery200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTimeOffsQuery200Response>() {
           @Override
           public void write(JsonWriter out, GetTimeOffsQuery200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTimeOffsQuery200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetTimeOffsQuery200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTimeOffsQuery200Response
   * @throws IOException if the JSON string is invalid with respect to GetTimeOffsQuery200Response
   */
  public static GetTimeOffsQuery200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTimeOffsQuery200Response.class);
  }

  /**
   * Convert an instance of GetTimeOffsQuery200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

