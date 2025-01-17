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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Pagination details for the response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class GetManagers200ResponsePage {
  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  @javax.annotation.Nullable
  private BigDecimal offset;

  public static final String SERIALIZED_NAME_TOTAL_ROWS = "total_rows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS)
  @javax.annotation.Nonnull
  private BigDecimal totalRows;

  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "items_per_page";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE)
  @javax.annotation.Nullable
  private BigDecimal itemsPerPage;

  public GetManagers200ResponsePage() {
  }

  public GetManagers200ResponsePage offset(@javax.annotation.Nullable BigDecimal offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The offset/index of the current page.
   * @return offset
   */
  @javax.annotation.Nullable
  public BigDecimal getOffset() {
    return offset;
  }

  public void setOffset(@javax.annotation.Nullable BigDecimal offset) {
    this.offset = offset;
  }


  public GetManagers200ResponsePage totalRows(@javax.annotation.Nonnull BigDecimal totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * Total number of rows available for this resource.
   * @return totalRows
   */
  @javax.annotation.Nonnull
  public BigDecimal getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(@javax.annotation.Nonnull BigDecimal totalRows) {
    this.totalRows = totalRows;
  }


  public GetManagers200ResponsePage itemsPerPage(@javax.annotation.Nullable BigDecimal itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * Number of items returned per page.
   * @return itemsPerPage
   */
  @javax.annotation.Nullable
  public BigDecimal getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(@javax.annotation.Nullable BigDecimal itemsPerPage) {
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
    GetManagers200ResponsePage getManagers200ResponsePage = (GetManagers200ResponsePage) o;
    return Objects.equals(this.offset, getManagers200ResponsePage.offset) &&
        Objects.equals(this.totalRows, getManagers200ResponsePage.totalRows) &&
        Objects.equals(this.itemsPerPage, getManagers200ResponsePage.itemsPerPage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, totalRows, itemsPerPage);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetManagers200ResponsePage {\n");
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
    openapiRequiredFields.add("total_rows");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetManagers200ResponsePage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetManagers200ResponsePage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetManagers200ResponsePage is not found in the empty JSON string", GetManagers200ResponsePage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetManagers200ResponsePage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetManagers200ResponsePage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetManagers200ResponsePage.openapiRequiredFields) {
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
       if (!GetManagers200ResponsePage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetManagers200ResponsePage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetManagers200ResponsePage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetManagers200ResponsePage.class));

       return (TypeAdapter<T>) new TypeAdapter<GetManagers200ResponsePage>() {
           @Override
           public void write(JsonWriter out, GetManagers200ResponsePage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetManagers200ResponsePage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetManagers200ResponsePage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetManagers200ResponsePage
   * @throws IOException if the JSON string is invalid with respect to GetManagers200ResponsePage
   */
  public static GetManagers200ResponsePage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetManagers200ResponsePage.class);
  }

  /**
   * Convert an instance of GetManagers200ResponsePage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

