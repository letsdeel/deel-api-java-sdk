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
 * GetPeopleList200ResponsePage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPeopleList200ResponsePage {
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

  public GetPeopleList200ResponsePage() {
  }

  public GetPeopleList200ResponsePage offset(@javax.annotation.Nonnull BigDecimal offset) {
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


  public GetPeopleList200ResponsePage totalRows(@javax.annotation.Nonnull BigDecimal totalRows) {
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


  public GetPeopleList200ResponsePage itemsPerPage(@javax.annotation.Nonnull BigDecimal itemsPerPage) {
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
    GetPeopleList200ResponsePage getPeopleList200ResponsePage = (GetPeopleList200ResponsePage) o;
    return Objects.equals(this.offset, getPeopleList200ResponsePage.offset) &&
        Objects.equals(this.totalRows, getPeopleList200ResponsePage.totalRows) &&
        Objects.equals(this.itemsPerPage, getPeopleList200ResponsePage.itemsPerPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, totalRows, itemsPerPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeopleList200ResponsePage {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetPeopleList200ResponsePage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPeopleList200ResponsePage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPeopleList200ResponsePage is not found in the empty JSON string", GetPeopleList200ResponsePage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPeopleList200ResponsePage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPeopleList200ResponsePage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPeopleList200ResponsePage.openapiRequiredFields) {
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
       if (!GetPeopleList200ResponsePage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPeopleList200ResponsePage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPeopleList200ResponsePage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPeopleList200ResponsePage.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPeopleList200ResponsePage>() {
           @Override
           public void write(JsonWriter out, GetPeopleList200ResponsePage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPeopleList200ResponsePage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPeopleList200ResponsePage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPeopleList200ResponsePage
   * @throws IOException if the JSON string is invalid with respect to GetPeopleList200ResponsePage
   */
  public static GetPeopleList200ResponsePage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPeopleList200ResponsePage.class);
  }

  /**
   * Convert an instance of GetPeopleList200ResponsePage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

