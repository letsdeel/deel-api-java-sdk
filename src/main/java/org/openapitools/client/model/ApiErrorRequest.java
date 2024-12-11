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
 * ApiErrorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class ApiErrorRequest {
  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  @javax.annotation.Nullable
  private String method;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private BigDecimal status;

  public static final String SERIALIZED_NAME_API_REQ_ID = "api_req_id";
  @SerializedName(SERIALIZED_NAME_API_REQ_ID)
  @javax.annotation.Nullable
  private String apiReqId;

  public static final String SERIALIZED_NAME_DOCS = "docs";
  @SerializedName(SERIALIZED_NAME_DOCS)
  @javax.annotation.Nullable
  private String docs;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @javax.annotation.Nullable
  private String source;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nullable
  private BigDecimal code;

  public ApiErrorRequest() {
  }

  public ApiErrorRequest method(@javax.annotation.Nullable String method) {
    this.method = method;
    return this;
  }

  /**
   * The HTTP method of the failed request
   * @return method
   */
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }

  public void setMethod(@javax.annotation.Nullable String method) {
    this.method = method;
  }


  public ApiErrorRequest url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * The relative URL of the failed request
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public ApiErrorRequest status(@javax.annotation.Nullable BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * The status code of the response
   * @return status
   */
  @javax.annotation.Nullable
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable BigDecimal status) {
    this.status = status;
  }


  public ApiErrorRequest apiReqId(@javax.annotation.Nullable String apiReqId) {
    this.apiReqId = apiReqId;
    return this;
  }

  /**
   * The request ID of the failed request
   * @return apiReqId
   */
  @javax.annotation.Nullable
  public String getApiReqId() {
    return apiReqId;
  }

  public void setApiReqId(@javax.annotation.Nullable String apiReqId) {
    this.apiReqId = apiReqId;
  }


  public ApiErrorRequest docs(@javax.annotation.Nullable String docs) {
    this.docs = docs;
    return this;
  }

  /**
   * A link to the official documentation for the requested endpoint resource
   * @return docs
   */
  @javax.annotation.Nullable
  public String getDocs() {
    return docs;
  }

  public void setDocs(@javax.annotation.Nullable String docs) {
    this.docs = docs;
  }


  public ApiErrorRequest source(@javax.annotation.Nullable String source) {
    this.source = source;
    return this;
  }

  /**
   * The source handler which produced the returned error
   * @return source
   */
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(@javax.annotation.Nullable String source) {
    this.source = source;
  }


  public ApiErrorRequest code(@javax.annotation.Nullable BigDecimal code) {
    this.code = code;
    return this;
  }

  /**
   * The code of the source handler which produced the returned error
   * @return code
   */
  @javax.annotation.Nullable
  public BigDecimal getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nullable BigDecimal code) {
    this.code = code;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiErrorRequest apiErrorRequest = (ApiErrorRequest) o;
    return Objects.equals(this.method, apiErrorRequest.method) &&
        Objects.equals(this.url, apiErrorRequest.url) &&
        Objects.equals(this.status, apiErrorRequest.status) &&
        Objects.equals(this.apiReqId, apiErrorRequest.apiReqId) &&
        Objects.equals(this.docs, apiErrorRequest.docs) &&
        Objects.equals(this.source, apiErrorRequest.source) &&
        Objects.equals(this.code, apiErrorRequest.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, url, status, apiReqId, docs, source, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    apiReqId: ").append(toIndentedString(apiReqId)).append("\n");
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
    openapiFields.add("method");
    openapiFields.add("url");
    openapiFields.add("status");
    openapiFields.add("api_req_id");
    openapiFields.add("docs");
    openapiFields.add("source");
    openapiFields.add("code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiErrorRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiErrorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiErrorRequest is not found in the empty JSON string", ApiErrorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiErrorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiErrorRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("api_req_id") != null && !jsonObj.get("api_req_id").isJsonNull()) && !jsonObj.get("api_req_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_req_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_req_id").toString()));
      }
      if ((jsonObj.get("docs") != null && !jsonObj.get("docs").isJsonNull()) && !jsonObj.get("docs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docs").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiErrorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiErrorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiErrorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiErrorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiErrorRequest>() {
           @Override
           public void write(JsonWriter out, ApiErrorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiErrorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiErrorRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiErrorRequest
   * @throws IOException if the JSON string is invalid with respect to ApiErrorRequest
   */
  public static ApiErrorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiErrorRequest.class);
  }

  /**
   * Convert an instance of ApiErrorRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

