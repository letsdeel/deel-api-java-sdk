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
 * UpdateTimeOffRequestDataAttachmentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateTimeOffRequestDataAttachmentsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private String key;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  @javax.annotation.Nonnull
  private String filename;

  public static final String SERIALIZED_NAME_UPLOAD_ID = "upload_id";
  @SerializedName(SERIALIZED_NAME_UPLOAD_ID)
  @javax.annotation.Nullable
  private String uploadId;

  public UpdateTimeOffRequestDataAttachmentsInner() {
  }

  public UpdateTimeOffRequestDataAttachmentsInner id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public UpdateTimeOffRequestDataAttachmentsInner key(@javax.annotation.Nullable String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable String key) {
    this.key = key;
  }


  public UpdateTimeOffRequestDataAttachmentsInner filename(@javax.annotation.Nonnull String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   * @return filename
   */
  @javax.annotation.Nonnull
  public String getFilename() {
    return filename;
  }

  public void setFilename(@javax.annotation.Nonnull String filename) {
    this.filename = filename;
  }


  public UpdateTimeOffRequestDataAttachmentsInner uploadId(@javax.annotation.Nullable String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

  /**
   * Get uploadId
   * @return uploadId
   */
  @javax.annotation.Nullable
  public String getUploadId() {
    return uploadId;
  }

  public void setUploadId(@javax.annotation.Nullable String uploadId) {
    this.uploadId = uploadId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTimeOffRequestDataAttachmentsInner updateTimeOffRequestDataAttachmentsInner = (UpdateTimeOffRequestDataAttachmentsInner) o;
    return Objects.equals(this.id, updateTimeOffRequestDataAttachmentsInner.id) &&
        Objects.equals(this.key, updateTimeOffRequestDataAttachmentsInner.key) &&
        Objects.equals(this.filename, updateTimeOffRequestDataAttachmentsInner.filename) &&
        Objects.equals(this.uploadId, updateTimeOffRequestDataAttachmentsInner.uploadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, filename, uploadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTimeOffRequestDataAttachmentsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("key");
    openapiFields.add("filename");
    openapiFields.add("upload_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("filename");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateTimeOffRequestDataAttachmentsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateTimeOffRequestDataAttachmentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTimeOffRequestDataAttachmentsInner is not found in the empty JSON string", UpdateTimeOffRequestDataAttachmentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateTimeOffRequestDataAttachmentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateTimeOffRequestDataAttachmentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateTimeOffRequestDataAttachmentsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if ((jsonObj.get("upload_id") != null && !jsonObj.get("upload_id").isJsonNull()) && !jsonObj.get("upload_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upload_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upload_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTimeOffRequestDataAttachmentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTimeOffRequestDataAttachmentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTimeOffRequestDataAttachmentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTimeOffRequestDataAttachmentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTimeOffRequestDataAttachmentsInner>() {
           @Override
           public void write(JsonWriter out, UpdateTimeOffRequestDataAttachmentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTimeOffRequestDataAttachmentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateTimeOffRequestDataAttachmentsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateTimeOffRequestDataAttachmentsInner
   * @throws IOException if the JSON string is invalid with respect to UpdateTimeOffRequestDataAttachmentsInner
   */
  public static UpdateTimeOffRequestDataAttachmentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTimeOffRequestDataAttachmentsInner.class);
  }

  /**
   * Convert an instance of UpdateTimeOffRequestDataAttachmentsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

