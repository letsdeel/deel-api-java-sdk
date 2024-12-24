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
 * OffboardingTrackerGet200ResponsePage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class OffboardingTrackerGet200ResponsePage {
  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  @javax.annotation.Nullable
  private String cursor;

  public static final String SERIALIZED_NAME_TOTAL_ROWS = "total_rows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS)
  @javax.annotation.Nullable
  private Integer totalRows;

  public OffboardingTrackerGet200ResponsePage() {
  }

  public OffboardingTrackerGet200ResponsePage cursor(@javax.annotation.Nullable String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Cursor for pagination to fetch the next page of contractors
   * @return cursor
   */
  @javax.annotation.Nullable
  public String getCursor() {
    return cursor;
  }

  public void setCursor(@javax.annotation.Nullable String cursor) {
    this.cursor = cursor;
  }


  public OffboardingTrackerGet200ResponsePage totalRows(@javax.annotation.Nullable Integer totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * The total number of contractors available
   * @return totalRows
   */
  @javax.annotation.Nullable
  public Integer getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(@javax.annotation.Nullable Integer totalRows) {
    this.totalRows = totalRows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffboardingTrackerGet200ResponsePage offboardingTrackerGet200ResponsePage = (OffboardingTrackerGet200ResponsePage) o;
    return Objects.equals(this.cursor, offboardingTrackerGet200ResponsePage.cursor) &&
        Objects.equals(this.totalRows, offboardingTrackerGet200ResponsePage.totalRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, totalRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffboardingTrackerGet200ResponsePage {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
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
    openapiFields.add("cursor");
    openapiFields.add("total_rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OffboardingTrackerGet200ResponsePage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OffboardingTrackerGet200ResponsePage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OffboardingTrackerGet200ResponsePage is not found in the empty JSON string", OffboardingTrackerGet200ResponsePage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OffboardingTrackerGet200ResponsePage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OffboardingTrackerGet200ResponsePage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull()) && !jsonObj.get("cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cursor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OffboardingTrackerGet200ResponsePage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OffboardingTrackerGet200ResponsePage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OffboardingTrackerGet200ResponsePage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OffboardingTrackerGet200ResponsePage.class));

       return (TypeAdapter<T>) new TypeAdapter<OffboardingTrackerGet200ResponsePage>() {
           @Override
           public void write(JsonWriter out, OffboardingTrackerGet200ResponsePage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OffboardingTrackerGet200ResponsePage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OffboardingTrackerGet200ResponsePage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OffboardingTrackerGet200ResponsePage
   * @throws IOException if the JSON string is invalid with respect to OffboardingTrackerGet200ResponsePage
   */
  public static OffboardingTrackerGet200ResponsePage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OffboardingTrackerGet200ResponsePage.class);
  }

  /**
   * Convert an instance of OffboardingTrackerGet200ResponsePage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

