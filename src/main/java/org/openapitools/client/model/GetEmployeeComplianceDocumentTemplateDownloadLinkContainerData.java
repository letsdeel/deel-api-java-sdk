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
 * GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:16:06.545846627Z[GMT]", comments = "Generator version: 7.10.0")
public class GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nullable
  private String url;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  @javax.annotation.Nullable
  private OffsetDateTime expiresAt;

  public GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData() {
  }

  public GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData url(@javax.annotation.Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL for the requested compliance document template.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nullable String url) {
    this.url = url;
  }


  public GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData expiresAt(@javax.annotation.Nullable OffsetDateTime expiresAt) {
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
    GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData getEmployeeComplianceDocumentTemplateDownloadLinkContainerData = (GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData) o;
    return Objects.equals(this.url, getEmployeeComplianceDocumentTemplateDownloadLinkContainerData.url) &&
        Objects.equals(this.expiresAt, getEmployeeComplianceDocumentTemplateDownloadLinkContainerData.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData is not found in the empty JSON string", GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData>() {
           @Override
           public void write(JsonWriter out, GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData
   * @throws IOException if the JSON string is invalid with respect to GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData
   */
  public static GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData.class);
  }

  /**
   * Convert an instance of GetEmployeeComplianceDocumentTemplateDownloadLinkContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

