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
 * AdjustmentsContainerPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class AdjustmentsContainerPage {
  public static final String SERIALIZED_NAME_TOTAL_ROWS = "total_rows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS)
  @javax.annotation.Nullable
  private BigDecimal totalRows;

  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "items_per_page";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE)
  @javax.annotation.Nullable
  private BigDecimal itemsPerPage;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  @javax.annotation.Nullable
  private BigDecimal offset;

  public AdjustmentsContainerPage() {
  }

  public AdjustmentsContainerPage totalRows(@javax.annotation.Nullable BigDecimal totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * The total number of rows in the response
   * @return totalRows
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(@javax.annotation.Nullable BigDecimal totalRows) {
    this.totalRows = totalRows;
  }


  public AdjustmentsContainerPage itemsPerPage(@javax.annotation.Nullable BigDecimal itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * The number of items per page
   * @return itemsPerPage
   */
  @javax.annotation.Nullable
  public BigDecimal getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(@javax.annotation.Nullable BigDecimal itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }


  public AdjustmentsContainerPage offset(@javax.annotation.Nullable BigDecimal offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The offset of the first item in the response
   * @return offset
   */
  @javax.annotation.Nullable
  public BigDecimal getOffset() {
    return offset;
  }

  public void setOffset(@javax.annotation.Nullable BigDecimal offset) {
    this.offset = offset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustmentsContainerPage adjustmentsContainerPage = (AdjustmentsContainerPage) o;
    return Objects.equals(this.totalRows, adjustmentsContainerPage.totalRows) &&
        Objects.equals(this.itemsPerPage, adjustmentsContainerPage.itemsPerPage) &&
        Objects.equals(this.offset, adjustmentsContainerPage.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRows, itemsPerPage, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustmentsContainerPage {\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
    openapiFields.add("total_rows");
    openapiFields.add("items_per_page");
    openapiFields.add("offset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdjustmentsContainerPage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdjustmentsContainerPage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdjustmentsContainerPage is not found in the empty JSON string", AdjustmentsContainerPage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdjustmentsContainerPage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdjustmentsContainerPage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdjustmentsContainerPage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdjustmentsContainerPage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdjustmentsContainerPage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdjustmentsContainerPage.class));

       return (TypeAdapter<T>) new TypeAdapter<AdjustmentsContainerPage>() {
           @Override
           public void write(JsonWriter out, AdjustmentsContainerPage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdjustmentsContainerPage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdjustmentsContainerPage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdjustmentsContainerPage
   * @throws IOException if the JSON string is invalid with respect to AdjustmentsContainerPage
   */
  public static AdjustmentsContainerPage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdjustmentsContainerPage.class);
  }

  /**
   * Convert an instance of AdjustmentsContainerPage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

