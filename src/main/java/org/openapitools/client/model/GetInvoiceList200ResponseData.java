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
import org.openapitools.client.model.GetInvoiceList200ResponseDataRowsInner;

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
 * GetInvoiceList200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T20:12:16.895242729Z[GMT]", comments = "Generator version: 7.10.0")
public class GetInvoiceList200ResponseData {
  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  @javax.annotation.Nonnull
  private List<GetInvoiceList200ResponseDataRowsInner> rows = new ArrayList<>();

  public GetInvoiceList200ResponseData() {
  }

  public GetInvoiceList200ResponseData rows(@javax.annotation.Nonnull List<GetInvoiceList200ResponseDataRowsInner> rows) {
    this.rows = rows;
    return this;
  }

  public GetInvoiceList200ResponseData addRowsItem(GetInvoiceList200ResponseDataRowsInner rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * Get rows
   * @return rows
   */
  @javax.annotation.Nonnull
  public List<GetInvoiceList200ResponseDataRowsInner> getRows() {
    return rows;
  }

  public void setRows(@javax.annotation.Nonnull List<GetInvoiceList200ResponseDataRowsInner> rows) {
    this.rows = rows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInvoiceList200ResponseData getInvoiceList200ResponseData = (GetInvoiceList200ResponseData) o;
    return Objects.equals(this.rows, getInvoiceList200ResponseData.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvoiceList200ResponseData {\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
    openapiFields.add("rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rows");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetInvoiceList200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetInvoiceList200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetInvoiceList200ResponseData is not found in the empty JSON string", GetInvoiceList200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetInvoiceList200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetInvoiceList200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetInvoiceList200ResponseData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("rows").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rows` to be an array in the JSON string but got `%s`", jsonObj.get("rows").toString()));
      }

      JsonArray jsonArrayrows = jsonObj.getAsJsonArray("rows");
      // validate the required field `rows` (array)
      for (int i = 0; i < jsonArrayrows.size(); i++) {
        GetInvoiceList200ResponseDataRowsInner.validateJsonElement(jsonArrayrows.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetInvoiceList200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetInvoiceList200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetInvoiceList200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetInvoiceList200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetInvoiceList200ResponseData>() {
           @Override
           public void write(JsonWriter out, GetInvoiceList200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetInvoiceList200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetInvoiceList200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetInvoiceList200ResponseData
   * @throws IOException if the JSON string is invalid with respect to GetInvoiceList200ResponseData
   */
  public static GetInvoiceList200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetInvoiceList200ResponseData.class);
  }

  /**
   * Convert an instance of GetInvoiceList200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

