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
import org.openapitools.client.model.GetEORWorkerPayslipDownloadUrl200ResponseData;

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
 * GetEORWorkerPayslipDownloadUrl200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T14:19:15.487453130Z[GMT]", comments = "Generator version: 7.10.0")
public class GetEORWorkerPayslipDownloadUrl200Response {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private GetEORWorkerPayslipDownloadUrl200ResponseData data;

  public GetEORWorkerPayslipDownloadUrl200Response() {
  }

  public GetEORWorkerPayslipDownloadUrl200Response data(@javax.annotation.Nonnull GetEORWorkerPayslipDownloadUrl200ResponseData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  public GetEORWorkerPayslipDownloadUrl200ResponseData getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull GetEORWorkerPayslipDownloadUrl200ResponseData data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEORWorkerPayslipDownloadUrl200Response getEORWorkerPayslipDownloadUrl200Response = (GetEORWorkerPayslipDownloadUrl200Response) o;
    return Objects.equals(this.data, getEORWorkerPayslipDownloadUrl200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEORWorkerPayslipDownloadUrl200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetEORWorkerPayslipDownloadUrl200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEORWorkerPayslipDownloadUrl200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEORWorkerPayslipDownloadUrl200Response is not found in the empty JSON string", GetEORWorkerPayslipDownloadUrl200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEORWorkerPayslipDownloadUrl200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEORWorkerPayslipDownloadUrl200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetEORWorkerPayslipDownloadUrl200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `data`
      GetEORWorkerPayslipDownloadUrl200ResponseData.validateJsonElement(jsonObj.get("data"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEORWorkerPayslipDownloadUrl200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEORWorkerPayslipDownloadUrl200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEORWorkerPayslipDownloadUrl200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEORWorkerPayslipDownloadUrl200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEORWorkerPayslipDownloadUrl200Response>() {
           @Override
           public void write(JsonWriter out, GetEORWorkerPayslipDownloadUrl200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEORWorkerPayslipDownloadUrl200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetEORWorkerPayslipDownloadUrl200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetEORWorkerPayslipDownloadUrl200Response
   * @throws IOException if the JSON string is invalid with respect to GetEORWorkerPayslipDownloadUrl200Response
   */
  public static GetEORWorkerPayslipDownloadUrl200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEORWorkerPayslipDownloadUrl200Response.class);
  }

  /**
   * Convert an instance of GetEORWorkerPayslipDownloadUrl200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

