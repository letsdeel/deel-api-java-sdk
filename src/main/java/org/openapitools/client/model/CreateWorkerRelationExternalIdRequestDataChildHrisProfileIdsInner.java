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
 * CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:23:41.573776663Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner {
  public static final String SERIALIZED_NAME_RELATION_EXTERNAL_ID = "relation_external_id";
  @SerializedName(SERIALIZED_NAME_RELATION_EXTERNAL_ID)
  @javax.annotation.Nonnull
  private String relationExternalId;

  public static final String SERIALIZED_NAME_EXTERNAL_HRIS_PROFILE_ID = "external_hris_profile_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_HRIS_PROFILE_ID)
  @javax.annotation.Nonnull
  private String externalHrisProfileId;

  public CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner() {
  }

  public CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner relationExternalId(@javax.annotation.Nonnull String relationExternalId) {
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


  public CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner externalHrisProfileId(@javax.annotation.Nonnull String externalHrisProfileId) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner createWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner = (CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner) o;
    return Objects.equals(this.relationExternalId, createWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner.relationExternalId) &&
        Objects.equals(this.externalHrisProfileId, createWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner.externalHrisProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationExternalId, externalHrisProfileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner {\n");
    sb.append("    relationExternalId: ").append(toIndentedString(relationExternalId)).append("\n");
    sb.append("    externalHrisProfileId: ").append(toIndentedString(externalHrisProfileId)).append("\n");
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
    openapiFields.add("relation_external_id");
    openapiFields.add("external_hris_profile_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("relation_external_id");
    openapiRequiredFields.add("external_hris_profile_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner is not found in the empty JSON string", CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("relation_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relation_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relation_external_id").toString()));
      }
      if (!jsonObj.get("external_hris_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_hris_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_hris_profile_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner>() {
           @Override
           public void write(JsonWriter out, CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner
   * @throws IOException if the JSON string is invalid with respect to CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner
   */
  public static CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner.class);
  }

  /**
   * Convert an instance of CreateWorkerRelationExternalIdRequestDataChildHrisProfileIdsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

