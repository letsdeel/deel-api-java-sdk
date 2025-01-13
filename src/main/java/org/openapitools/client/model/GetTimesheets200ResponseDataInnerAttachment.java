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
 * This object is used for linking file attachments to your records.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class GetTimesheets200ResponseDataInnerAttachment {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nonnull
  private String key;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  @javax.annotation.Nonnull
  private String filename;

  public GetTimesheets200ResponseDataInnerAttachment() {
  }

  public GetTimesheets200ResponseDataInnerAttachment key(@javax.annotation.Nonnull String key) {
    this.key = key;
    return this;
  }

  /**
   * You can call attachments end-point, get key and URL to upload your file.
   * @return key
   */
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nonnull String key) {
    this.key = key;
  }


  public GetTimesheets200ResponseDataInnerAttachment filename(@javax.annotation.Nonnull String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Original filename you used to upload using attachments end-point.
   * @return filename
   */
  @javax.annotation.Nonnull
  public String getFilename() {
    return filename;
  }

  public void setFilename(@javax.annotation.Nonnull String filename) {
    this.filename = filename;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimesheets200ResponseDataInnerAttachment getTimesheets200ResponseDataInnerAttachment = (GetTimesheets200ResponseDataInnerAttachment) o;
    return Objects.equals(this.key, getTimesheets200ResponseDataInnerAttachment.key) &&
        Objects.equals(this.filename, getTimesheets200ResponseDataInnerAttachment.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, filename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimesheets200ResponseDataInnerAttachment {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("filename");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("filename");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetTimesheets200ResponseDataInnerAttachment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTimesheets200ResponseDataInnerAttachment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTimesheets200ResponseDataInnerAttachment is not found in the empty JSON string", GetTimesheets200ResponseDataInnerAttachment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTimesheets200ResponseDataInnerAttachment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTimesheets200ResponseDataInnerAttachment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTimesheets200ResponseDataInnerAttachment.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTimesheets200ResponseDataInnerAttachment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTimesheets200ResponseDataInnerAttachment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTimesheets200ResponseDataInnerAttachment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTimesheets200ResponseDataInnerAttachment.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTimesheets200ResponseDataInnerAttachment>() {
           @Override
           public void write(JsonWriter out, GetTimesheets200ResponseDataInnerAttachment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTimesheets200ResponseDataInnerAttachment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetTimesheets200ResponseDataInnerAttachment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTimesheets200ResponseDataInnerAttachment
   * @throws IOException if the JSON string is invalid with respect to GetTimesheets200ResponseDataInnerAttachment
   */
  public static GetTimesheets200ResponseDataInnerAttachment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTimesheets200ResponseDataInnerAttachment.class);
  }

  /**
   * Convert an instance of GetTimesheets200ResponseDataInnerAttachment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

