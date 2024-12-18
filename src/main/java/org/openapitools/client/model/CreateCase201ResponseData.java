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
import org.openapitools.client.model.CreateCase201ResponseDataProcess;

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
 * CreateCase201ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:25:45.183107737Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateCase201ResponseData {
  /**
   * Current status of the immigration case
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OPEN("OPEN"),
    
    CLOSED("CLOSED"),
    
    ON_HOLD("ON_HOLD");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private StatusEnum status;

  public static final String SERIALIZED_NAME_PROCESS = "process";
  @SerializedName(SERIALIZED_NAME_PROCESS)
  @javax.annotation.Nonnull
  private CreateCase201ResponseDataProcess process;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CLOSURE_NOTE = "closure_note";
  @SerializedName(SERIALIZED_NAME_CLOSURE_NOTE)
  @javax.annotation.Nullable
  private String closureNote;

  public static final String SERIALIZED_NAME_CLOSURE_REASON = "closure_reason";
  @SerializedName(SERIALIZED_NAME_CLOSURE_REASON)
  @javax.annotation.Nullable
  private String closureReason;

  public CreateCase201ResponseData() {
  }

  public CreateCase201ResponseData status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of the immigration case
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }


  public CreateCase201ResponseData process(@javax.annotation.Nonnull CreateCase201ResponseDataProcess process) {
    this.process = process;
    return this;
  }

  /**
   * Get process
   * @return process
   */
  @javax.annotation.Nonnull
  public CreateCase201ResponseDataProcess getProcess() {
    return process;
  }

  public void setProcess(@javax.annotation.Nonnull CreateCase201ResponseDataProcess process) {
    this.process = process;
  }


  public CreateCase201ResponseData createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the case was created
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CreateCase201ResponseData updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the case was last updated
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CreateCase201ResponseData closureNote(@javax.annotation.Nullable String closureNote) {
    this.closureNote = closureNote;
    return this;
  }

  /**
   * Optional note explaining why the case was closed
   * @return closureNote
   */
  @javax.annotation.Nullable
  public String getClosureNote() {
    return closureNote;
  }

  public void setClosureNote(@javax.annotation.Nullable String closureNote) {
    this.closureNote = closureNote;
  }


  public CreateCase201ResponseData closureReason(@javax.annotation.Nullable String closureReason) {
    this.closureReason = closureReason;
    return this;
  }

  /**
   * Standardized reason for case closure
   * @return closureReason
   */
  @javax.annotation.Nullable
  public String getClosureReason() {
    return closureReason;
  }

  public void setClosureReason(@javax.annotation.Nullable String closureReason) {
    this.closureReason = closureReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCase201ResponseData createCase201ResponseData = (CreateCase201ResponseData) o;
    return Objects.equals(this.status, createCase201ResponseData.status) &&
        Objects.equals(this.process, createCase201ResponseData.process) &&
        Objects.equals(this.createdAt, createCase201ResponseData.createdAt) &&
        Objects.equals(this.updatedAt, createCase201ResponseData.updatedAt) &&
        Objects.equals(this.closureNote, createCase201ResponseData.closureNote) &&
        Objects.equals(this.closureReason, createCase201ResponseData.closureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, process, createdAt, updatedAt, closureNote, closureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCase201ResponseData {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    closureNote: ").append(toIndentedString(closureNote)).append("\n");
    sb.append("    closureReason: ").append(toIndentedString(closureReason)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("process");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("closure_note");
    openapiFields.add("closure_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("process");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateCase201ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCase201ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCase201ResponseData is not found in the empty JSON string", CreateCase201ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCase201ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCase201ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCase201ResponseData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      // validate the required field `process`
      CreateCase201ResponseDataProcess.validateJsonElement(jsonObj.get("process"));
      if ((jsonObj.get("closure_note") != null && !jsonObj.get("closure_note").isJsonNull()) && !jsonObj.get("closure_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `closure_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("closure_note").toString()));
      }
      if ((jsonObj.get("closure_reason") != null && !jsonObj.get("closure_reason").isJsonNull()) && !jsonObj.get("closure_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `closure_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("closure_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCase201ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCase201ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCase201ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCase201ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCase201ResponseData>() {
           @Override
           public void write(JsonWriter out, CreateCase201ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCase201ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateCase201ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCase201ResponseData
   * @throws IOException if the JSON string is invalid with respect to CreateCase201ResponseData
   */
  public static CreateCase201ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCase201ResponseData.class);
  }

  /**
   * Convert an instance of CreateCase201ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

