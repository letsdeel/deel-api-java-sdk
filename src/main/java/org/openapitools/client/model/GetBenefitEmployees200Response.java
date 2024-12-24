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
import org.openapitools.client.model.GetBenefitEmployees200ResponseDataInner;
import org.openapitools.client.model.GetBenefitEmployees200ResponsePage;

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
 * GetBenefitEmployees200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:16:06.545846627Z[GMT]", comments = "Generator version: 7.10.0")
public class GetBenefitEmployees200Response {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private List<GetBenefitEmployees200ResponseDataInner> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  @javax.annotation.Nullable
  private GetBenefitEmployees200ResponsePage page;

  public GetBenefitEmployees200Response() {
  }

  public GetBenefitEmployees200Response data(@javax.annotation.Nullable List<GetBenefitEmployees200ResponseDataInner> data) {
    this.data = data;
    return this;
  }

  public GetBenefitEmployees200Response addDataItem(GetBenefitEmployees200ResponseDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * List of employees
   * @return data
   */
  @javax.annotation.Nullable
  public List<GetBenefitEmployees200ResponseDataInner> getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable List<GetBenefitEmployees200ResponseDataInner> data) {
    this.data = data;
  }


  public GetBenefitEmployees200Response page(@javax.annotation.Nullable GetBenefitEmployees200ResponsePage page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  @javax.annotation.Nullable
  public GetBenefitEmployees200ResponsePage getPage() {
    return page;
  }

  public void setPage(@javax.annotation.Nullable GetBenefitEmployees200ResponsePage page) {
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
    GetBenefitEmployees200Response getBenefitEmployees200Response = (GetBenefitEmployees200Response) o;
    return Objects.equals(this.data, getBenefitEmployees200Response.data) &&
        Objects.equals(this.page, getBenefitEmployees200Response.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBenefitEmployees200Response {\n");
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
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetBenefitEmployees200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBenefitEmployees200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBenefitEmployees200Response is not found in the empty JSON string", GetBenefitEmployees200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBenefitEmployees200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBenefitEmployees200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            GetBenefitEmployees200ResponseDataInner.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
      // validate the optional field `page`
      if (jsonObj.get("page") != null && !jsonObj.get("page").isJsonNull()) {
        GetBenefitEmployees200ResponsePage.validateJsonElement(jsonObj.get("page"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBenefitEmployees200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBenefitEmployees200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBenefitEmployees200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBenefitEmployees200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBenefitEmployees200Response>() {
           @Override
           public void write(JsonWriter out, GetBenefitEmployees200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBenefitEmployees200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBenefitEmployees200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBenefitEmployees200Response
   * @throws IOException if the JSON string is invalid with respect to GetBenefitEmployees200Response
   */
  public static GetBenefitEmployees200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBenefitEmployees200Response.class);
  }

  /**
   * Convert an instance of GetBenefitEmployees200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

