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
import java.time.OffsetDateTime;
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
 * EmployeeAgreementDownloadObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class EmployeeAgreementDownloadObject {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  @javax.annotation.Nullable
  private OffsetDateTime expiresAt;

  public EmployeeAgreementDownloadObject() {
  }

  public EmployeeAgreementDownloadObject url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to requested employee agreement to download.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public EmployeeAgreementDownloadObject expiresAt(@javax.annotation.Nullable OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Expiration date time of download URL.
   * @return expiresAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(@javax.annotation.Nullable OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeAgreementDownloadObject employeeAgreementDownloadObject = (EmployeeAgreementDownloadObject) o;
    return Objects.equals(this.url, employeeAgreementDownloadObject.url) &&
        Objects.equals(this.expiresAt, employeeAgreementDownloadObject.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeAgreementDownloadObject {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("expires_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmployeeAgreementDownloadObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmployeeAgreementDownloadObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeAgreementDownloadObject is not found in the empty JSON string", EmployeeAgreementDownloadObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmployeeAgreementDownloadObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmployeeAgreementDownloadObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeAgreementDownloadObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeAgreementDownloadObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeAgreementDownloadObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeAgreementDownloadObject.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeAgreementDownloadObject>() {
           @Override
           public void write(JsonWriter out, EmployeeAgreementDownloadObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeeAgreementDownloadObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmployeeAgreementDownloadObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmployeeAgreementDownloadObject
   * @throws IOException if the JSON string is invalid with respect to EmployeeAgreementDownloadObject
   */
  public static EmployeeAgreementDownloadObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeAgreementDownloadObject.class);
  }

  /**
   * Convert an instance of EmployeeAgreementDownloadObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

