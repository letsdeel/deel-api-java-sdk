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
 * A item in attachments array. 2022-09-08 FE only allows for \&quot;SICK LEAVE\&quot;
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T11:33:27.931295037Z[GMT]", comments = "Generator version: 7.10.0")
public class TimeoffsAttachmentsItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_FILE_EXTENSION = "file_extension";
  @SerializedName(SERIALIZED_NAME_FILE_EXTENSION)
  @javax.annotation.Nullable
  private String fileExtension;

  public TimeoffsAttachmentsItem() {
  }

  public TimeoffsAttachmentsItem id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public TimeoffsAttachmentsItem label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * The file name
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public TimeoffsAttachmentsItem fileExtension(@javax.annotation.Nullable String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * The file name extension
   * @return fileExtension
   */
  @javax.annotation.Nullable
  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(@javax.annotation.Nullable String fileExtension) {
    this.fileExtension = fileExtension;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeoffsAttachmentsItem timeoffsAttachmentsItem = (TimeoffsAttachmentsItem) o;
    return Objects.equals(this.id, timeoffsAttachmentsItem.id) &&
        Objects.equals(this.label, timeoffsAttachmentsItem.label) &&
        Objects.equals(this.fileExtension, timeoffsAttachmentsItem.fileExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, fileExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeoffsAttachmentsItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("file_extension");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeoffsAttachmentsItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeoffsAttachmentsItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeoffsAttachmentsItem is not found in the empty JSON string", TimeoffsAttachmentsItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeoffsAttachmentsItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeoffsAttachmentsItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("file_extension") != null && !jsonObj.get("file_extension").isJsonNull()) && !jsonObj.get("file_extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_extension").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeoffsAttachmentsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeoffsAttachmentsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeoffsAttachmentsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeoffsAttachmentsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeoffsAttachmentsItem>() {
           @Override
           public void write(JsonWriter out, TimeoffsAttachmentsItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeoffsAttachmentsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeoffsAttachmentsItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeoffsAttachmentsItem
   * @throws IOException if the JSON string is invalid with respect to TimeoffsAttachmentsItem
   */
  public static TimeoffsAttachmentsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeoffsAttachmentsItem.class);
  }

  /**
   * Convert an instance of TimeoffsAttachmentsItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

