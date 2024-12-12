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
 * GetTimesheets200ResponsePage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class GetTimesheets200ResponsePage {
  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  @javax.annotation.Nonnull
  private BigDecimal offset;

  public static final String SERIALIZED_NAME_TOTAL_ROWS = "total_rows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS)
  @javax.annotation.Nonnull
  private BigDecimal totalRows;

  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "items_per_page";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE)
  @javax.annotation.Nonnull
  private BigDecimal itemsPerPage;

  public GetTimesheets200ResponsePage() {
  }

  public GetTimesheets200ResponsePage offset(@javax.annotation.Nonnull BigDecimal offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * minimum: 0
   * maximum: 999999999
   * @return offset
   */
  @javax.annotation.Nonnull
  public BigDecimal getOffset() {
    return offset;
  }

  public void setOffset(@javax.annotation.Nonnull BigDecimal offset) {
    this.offset = offset;
  }


  public GetTimesheets200ResponsePage totalRows(@javax.annotation.Nonnull BigDecimal totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * Get totalRows
   * @return totalRows
   */
  @javax.annotation.Nonnull
  public BigDecimal getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(@javax.annotation.Nonnull BigDecimal totalRows) {
    this.totalRows = totalRows;
  }


  public GetTimesheets200ResponsePage itemsPerPage(@javax.annotation.Nonnull BigDecimal itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * Get itemsPerPage
   * minimum: 1
   * maximum: 99
   * @return itemsPerPage
   */
  @javax.annotation.Nonnull
  public BigDecimal getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(@javax.annotation.Nonnull BigDecimal itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimesheets200ResponsePage getTimesheets200ResponsePage = (GetTimesheets200ResponsePage) o;
    return Objects.equals(this.offset, getTimesheets200ResponsePage.offset) &&
        Objects.equals(this.totalRows, getTimesheets200ResponsePage.totalRows) &&
        Objects.equals(this.itemsPerPage, getTimesheets200ResponsePage.itemsPerPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, totalRows, itemsPerPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimesheets200ResponsePage {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
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
    openapiFields.add("offset");
    openapiFields.add("total_rows");
    openapiFields.add("items_per_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("offset");
    openapiRequiredFields.add("total_rows");
    openapiRequiredFields.add("items_per_page");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetTimesheets200ResponsePage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTimesheets200ResponsePage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTimesheets200ResponsePage is not found in the empty JSON string", GetTimesheets200ResponsePage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTimesheets200ResponsePage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTimesheets200ResponsePage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTimesheets200ResponsePage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTimesheets200ResponsePage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTimesheets200ResponsePage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTimesheets200ResponsePage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTimesheets200ResponsePage.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTimesheets200ResponsePage>() {
           @Override
           public void write(JsonWriter out, GetTimesheets200ResponsePage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTimesheets200ResponsePage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetTimesheets200ResponsePage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTimesheets200ResponsePage
   * @throws IOException if the JSON string is invalid with respect to GetTimesheets200ResponsePage
   */
  public static GetTimesheets200ResponsePage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTimesheets200ResponsePage.class);
  }

  /**
   * Convert an instance of GetTimesheets200ResponsePage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

