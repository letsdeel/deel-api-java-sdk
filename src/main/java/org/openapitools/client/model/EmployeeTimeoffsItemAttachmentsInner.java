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
 * EmployeeTimeoffsItemAttachmentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T10:53:39.811706390Z[GMT]", comments = "Generator version: 7.10.0")
public class EmployeeTimeoffsItemAttachmentsInner {
  public static final String SERIALIZED_NAME_ATTACHMENT_ID = "attachment_id";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_ID)
  @javax.annotation.Nullable
  private String attachmentId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_FILE_EXTENSION = "file_extension";
  @SerializedName(SERIALIZED_NAME_FILE_EXTENSION)
  @javax.annotation.Nullable
  private String fileExtension;

  public EmployeeTimeoffsItemAttachmentsInner() {
  }

  public EmployeeTimeoffsItemAttachmentsInner attachmentId(@javax.annotation.Nullable String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  /**
   * Unique identifier of an attachment.
   * @return attachmentId
   */
  @javax.annotation.Nullable
  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(@javax.annotation.Nullable String attachmentId) {
    this.attachmentId = attachmentId;
  }


  public EmployeeTimeoffsItemAttachmentsInner label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Attachment label.
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public EmployeeTimeoffsItemAttachmentsInner fileExtension(@javax.annotation.Nullable String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * Attachment file extension.
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
    EmployeeTimeoffsItemAttachmentsInner employeeTimeoffsItemAttachmentsInner = (EmployeeTimeoffsItemAttachmentsInner) o;
    return Objects.equals(this.attachmentId, employeeTimeoffsItemAttachmentsInner.attachmentId) &&
        Objects.equals(this.label, employeeTimeoffsItemAttachmentsInner.label) &&
        Objects.equals(this.fileExtension, employeeTimeoffsItemAttachmentsInner.fileExtension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, label, fileExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTimeoffsItemAttachmentsInner {\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
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
    openapiFields.add("attachment_id");
    openapiFields.add("label");
    openapiFields.add("file_extension");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmployeeTimeoffsItemAttachmentsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmployeeTimeoffsItemAttachmentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeTimeoffsItemAttachmentsInner is not found in the empty JSON string", EmployeeTimeoffsItemAttachmentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmployeeTimeoffsItemAttachmentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmployeeTimeoffsItemAttachmentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("attachment_id") != null && !jsonObj.get("attachment_id").isJsonNull()) && !jsonObj.get("attachment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attachment_id").toString()));
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
       if (!EmployeeTimeoffsItemAttachmentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeTimeoffsItemAttachmentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeTimeoffsItemAttachmentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeTimeoffsItemAttachmentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeTimeoffsItemAttachmentsInner>() {
           @Override
           public void write(JsonWriter out, EmployeeTimeoffsItemAttachmentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeeTimeoffsItemAttachmentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmployeeTimeoffsItemAttachmentsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmployeeTimeoffsItemAttachmentsInner
   * @throws IOException if the JSON string is invalid with respect to EmployeeTimeoffsItemAttachmentsInner
   */
  public static EmployeeTimeoffsItemAttachmentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeTimeoffsItemAttachmentsInner.class);
  }

  /**
   * Convert an instance of EmployeeTimeoffsItemAttachmentsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

