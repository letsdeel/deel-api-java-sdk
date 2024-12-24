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
 * CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:16:06.545846627Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner {
  public static final String SERIALIZED_NAME_EXTERNAL_HRIS_PROFILE_ID = "external_hris_profile_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_HRIS_PROFILE_ID)
  @javax.annotation.Nonnull
  private String externalHrisProfileId;

  public static final String SERIALIZED_NAME_RELATION_EXTERNAL_ID = "relation_external_id";
  @SerializedName(SERIALIZED_NAME_RELATION_EXTERNAL_ID)
  @javax.annotation.Nonnull
  private String relationExternalId;

  public CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner() {
  }

  public CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner externalHrisProfileId(@javax.annotation.Nonnull String externalHrisProfileId) {
    this.externalHrisProfileId = externalHrisProfileId;
    return this;
  }

  /**
   * The external ID of the secondary HrisProfile.
   * @return externalHrisProfileId
   */
  @javax.annotation.Nonnull
  public String getExternalHrisProfileId() {
    return externalHrisProfileId;
  }

  public void setExternalHrisProfileId(@javax.annotation.Nonnull String externalHrisProfileId) {
    this.externalHrisProfileId = externalHrisProfileId;
  }


  public CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner relationExternalId(@javax.annotation.Nonnull String relationExternalId) {
    this.relationExternalId = relationExternalId;
    return this;
  }

  /**
   * A custom ID to set to the relation.
   * @return relationExternalId
   */
  @javax.annotation.Nonnull
  public String getRelationExternalId() {
    return relationExternalId;
  }

  public void setRelationExternalId(@javax.annotation.Nonnull String relationExternalId) {
    this.relationExternalId = relationExternalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner createWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner = (CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner) o;
    return Objects.equals(this.externalHrisProfileId, createWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner.externalHrisProfileId) &&
        Objects.equals(this.relationExternalId, createWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner.relationExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalHrisProfileId, relationExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner {\n");
    sb.append("    externalHrisProfileId: ").append(toIndentedString(externalHrisProfileId)).append("\n");
    sb.append("    relationExternalId: ").append(toIndentedString(relationExternalId)).append("\n");
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
    openapiFields.add("external_hris_profile_id");
    openapiFields.add("relation_external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("external_hris_profile_id");
    openapiRequiredFields.add("relation_external_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner is not found in the empty JSON string", CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("external_hris_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_hris_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_hris_profile_id").toString()));
      }
      if (!jsonObj.get("relation_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relation_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relation_external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner>() {
           @Override
           public void write(JsonWriter out, CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner
   * @throws IOException if the JSON string is invalid with respect to CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner
   */
  public static CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner.class);
  }

  /**
   * Convert an instance of CreateWorkerRelationExternalIdContainerDataChildHrisProfileIdsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

