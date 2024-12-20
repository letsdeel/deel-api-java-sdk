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
 * WorkerDocumentDownloadLink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T13:30:34.884345844Z[GMT]", comments = "Generator version: 7.10.0")
public class WorkerDocumentDownloadLink {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  @javax.annotation.Nullable
  private String expiresAt;

  public WorkerDocumentDownloadLink() {
  }

  public WorkerDocumentDownloadLink url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the document to download.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public WorkerDocumentDownloadLink expiresAt(@javax.annotation.Nullable String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Link expiration date.
   * @return expiresAt
   */
  @javax.annotation.Nullable
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(@javax.annotation.Nullable String expiresAt) {
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
    WorkerDocumentDownloadLink workerDocumentDownloadLink = (WorkerDocumentDownloadLink) o;
    return Objects.equals(this.url, workerDocumentDownloadLink.url) &&
        Objects.equals(this.expiresAt, workerDocumentDownloadLink.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerDocumentDownloadLink {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to WorkerDocumentDownloadLink
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkerDocumentDownloadLink.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkerDocumentDownloadLink is not found in the empty JSON string", WorkerDocumentDownloadLink.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkerDocumentDownloadLink.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkerDocumentDownloadLink` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("expires_at") != null && !jsonObj.get("expires_at").isJsonNull()) && !jsonObj.get("expires_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkerDocumentDownloadLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkerDocumentDownloadLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkerDocumentDownloadLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkerDocumentDownloadLink.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkerDocumentDownloadLink>() {
           @Override
           public void write(JsonWriter out, WorkerDocumentDownloadLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkerDocumentDownloadLink read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkerDocumentDownloadLink given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkerDocumentDownloadLink
   * @throws IOException if the JSON string is invalid with respect to WorkerDocumentDownloadLink
   */
  public static WorkerDocumentDownloadLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkerDocumentDownloadLink.class);
  }

  /**
   * Convert an instance of WorkerDocumentDownloadLink to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

