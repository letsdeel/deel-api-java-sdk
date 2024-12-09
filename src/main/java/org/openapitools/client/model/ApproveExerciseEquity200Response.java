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
import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

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
 * ApproveExerciseEquity200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class ApproveExerciseEquity200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private LocalDate createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private LocalDate updatedAt;

  public static final String SERIALIZED_NAME_EMPLOYER_APPROVAL = "employer_approval";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_APPROVAL)
  private String employerApproval;

  public ApproveExerciseEquity200Response() {
  }

  public ApproveExerciseEquity200Response id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the equity exercise.
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public ApproveExerciseEquity200Response status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of the equity exercise, e.g., &#39;approved&#39; or &#39;pending&#39;.
   * @return status
   */
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public ApproveExerciseEquity200Response createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the equity exercise was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  public ApproveExerciseEquity200Response updatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date when the equity exercise was last updated.
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ApproveExerciseEquity200Response employerApproval(String employerApproval) {
    this.employerApproval = employerApproval;
    return this;
  }

  /**
   * Indicates whether the employer has approved the equity exercise. Valid values: &#39;approved&#39;, &#39;rejected&#39;.
   * @return employerApproval
   */
  @javax.annotation.Nonnull
  public String getEmployerApproval() {
    return employerApproval;
  }

  public void setEmployerApproval(String employerApproval) {
    this.employerApproval = employerApproval;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproveExerciseEquity200Response approveExerciseEquity200Response = (ApproveExerciseEquity200Response) o;
    return Objects.equals(this.id, approveExerciseEquity200Response.id) &&
        Objects.equals(this.status, approveExerciseEquity200Response.status) &&
        Objects.equals(this.createdAt, approveExerciseEquity200Response.createdAt) &&
        Objects.equals(this.updatedAt, approveExerciseEquity200Response.updatedAt) &&
        Objects.equals(this.employerApproval, approveExerciseEquity200Response.employerApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, createdAt, updatedAt, employerApproval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproveExerciseEquity200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    employerApproval: ").append(toIndentedString(employerApproval)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("employer_approval");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("employer_approval");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApproveExerciseEquity200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApproveExerciseEquity200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApproveExerciseEquity200Response is not found in the empty JSON string", ApproveExerciseEquity200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApproveExerciseEquity200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApproveExerciseEquity200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApproveExerciseEquity200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("employer_approval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_approval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_approval").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApproveExerciseEquity200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApproveExerciseEquity200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApproveExerciseEquity200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApproveExerciseEquity200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ApproveExerciseEquity200Response>() {
           @Override
           public void write(JsonWriter out, ApproveExerciseEquity200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApproveExerciseEquity200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApproveExerciseEquity200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApproveExerciseEquity200Response
   * @throws IOException if the JSON string is invalid with respect to ApproveExerciseEquity200Response
   */
  public static ApproveExerciseEquity200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApproveExerciseEquity200Response.class);
  }

  /**
   * Convert an instance of ApproveExerciseEquity200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
