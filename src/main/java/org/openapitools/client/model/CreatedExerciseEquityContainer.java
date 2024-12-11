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
 * CreatedExerciseEquityContainer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:20:01.055724240Z[GMT]", comments = "Generator version: 7.10.0")
public class CreatedExerciseEquityContainer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private String status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_EMPLOYER_APPROVAL = "employer_approval";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_APPROVAL)
  @javax.annotation.Nonnull
  private String employerApproval;

  public CreatedExerciseEquityContainer() {
  }

  public CreatedExerciseEquityContainer id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public CreatedExerciseEquityContainer status(@javax.annotation.Nonnull String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull String status) {
    this.status = status;
  }


  public CreatedExerciseEquityContainer createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CreatedExerciseEquityContainer updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CreatedExerciseEquityContainer employerApproval(@javax.annotation.Nonnull String employerApproval) {
    this.employerApproval = employerApproval;
    return this;
  }

  /**
   * Get employerApproval
   * @return employerApproval
   */
  @javax.annotation.Nonnull
  public String getEmployerApproval() {
    return employerApproval;
  }

  public void setEmployerApproval(@javax.annotation.Nonnull String employerApproval) {
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
    CreatedExerciseEquityContainer createdExerciseEquityContainer = (CreatedExerciseEquityContainer) o;
    return Objects.equals(this.id, createdExerciseEquityContainer.id) &&
        Objects.equals(this.status, createdExerciseEquityContainer.status) &&
        Objects.equals(this.createdAt, createdExerciseEquityContainer.createdAt) &&
        Objects.equals(this.updatedAt, createdExerciseEquityContainer.updatedAt) &&
        Objects.equals(this.employerApproval, createdExerciseEquityContainer.employerApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, createdAt, updatedAt, employerApproval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedExerciseEquityContainer {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to CreatedExerciseEquityContainer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatedExerciseEquityContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatedExerciseEquityContainer is not found in the empty JSON string", CreatedExerciseEquityContainer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatedExerciseEquityContainer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatedExerciseEquityContainer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatedExerciseEquityContainer.openapiRequiredFields) {
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
       if (!CreatedExerciseEquityContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatedExerciseEquityContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatedExerciseEquityContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatedExerciseEquityContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatedExerciseEquityContainer>() {
           @Override
           public void write(JsonWriter out, CreatedExerciseEquityContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatedExerciseEquityContainer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreatedExerciseEquityContainer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatedExerciseEquityContainer
   * @throws IOException if the JSON string is invalid with respect to CreatedExerciseEquityContainer
   */
  public static CreatedExerciseEquityContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatedExerciseEquityContainer.class);
  }

  /**
   * Convert an instance of CreatedExerciseEquityContainer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

