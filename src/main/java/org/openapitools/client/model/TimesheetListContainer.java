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
import org.openapitools.client.model.BasicTimesheet;
import org.openapitools.client.model.PageInfoWithoutCursor;

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
 * TimesheetListContainer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class TimesheetListContainer {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private List<BasicTimesheet> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  @javax.annotation.Nonnull
  private PageInfoWithoutCursor page;

  public TimesheetListContainer() {
  }

  public TimesheetListContainer data(@javax.annotation.Nonnull List<BasicTimesheet> data) {
    this.data = data;
    return this;
  }

  public TimesheetListContainer addDataItem(BasicTimesheet dataItem) {
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
  public List<BasicTimesheet> getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull List<BasicTimesheet> data) {
    this.data = data;
  }


  public TimesheetListContainer page(@javax.annotation.Nonnull PageInfoWithoutCursor page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  @javax.annotation.Nonnull
  public PageInfoWithoutCursor getPage() {
    return page;
  }

  public void setPage(@javax.annotation.Nonnull PageInfoWithoutCursor page) {
    this.page = page;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimesheetListContainer timesheetListContainer = (TimesheetListContainer) o;
    return Objects.equals(this.data, timesheetListContainer.data) &&
        Objects.equals(this.page, timesheetListContainer.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesheetListContainer {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
    openapiFields.add("page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("page");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimesheetListContainer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimesheetListContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimesheetListContainer is not found in the empty JSON string", TimesheetListContainer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimesheetListContainer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimesheetListContainer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimesheetListContainer.openapiRequiredFields) {
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
        BasicTimesheet.validateJsonElement(jsonArraydata.get(i));
      };
      // validate the required field `page`
      PageInfoWithoutCursor.validateJsonElement(jsonObj.get("page"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimesheetListContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimesheetListContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimesheetListContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimesheetListContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<TimesheetListContainer>() {
           @Override
           public void write(JsonWriter out, TimesheetListContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimesheetListContainer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimesheetListContainer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimesheetListContainer
   * @throws IOException if the JSON string is invalid with respect to TimesheetListContainer
   */
  public static TimesheetListContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimesheetListContainer.class);
  }

  /**
   * Convert an instance of TimesheetListContainer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

