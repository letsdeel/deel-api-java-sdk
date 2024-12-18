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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * UpsertChildWorkerRelationsContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:04:44.564028033Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertChildWorkerRelationsContainerData {
  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  @javax.annotation.Nonnull
  private List<UUID> ids = new ArrayList<>();

  public static final String SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_ID = "hris_relationship_type_id";
  @SerializedName(SERIALIZED_NAME_HRIS_RELATIONSHIP_TYPE_ID)
  @javax.annotation.Nonnull
  private UUID hrisRelationshipTypeId;

  public UpsertChildWorkerRelationsContainerData() {
  }

  public UpsertChildWorkerRelationsContainerData ids(@javax.annotation.Nonnull List<UUID> ids) {
    this.ids = ids;
    return this;
  }

  public UpsertChildWorkerRelationsContainerData addIdsItem(UUID idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * An array containing the IDs of the child profiles
   * @return ids
   */
  @javax.annotation.Nonnull
  public List<UUID> getIds() {
    return ids;
  }

  public void setIds(@javax.annotation.Nonnull List<UUID> ids) {
    this.ids = ids;
  }


  public UpsertChildWorkerRelationsContainerData hrisRelationshipTypeId(@javax.annotation.Nonnull UUID hrisRelationshipTypeId) {
    this.hrisRelationshipTypeId = hrisRelationshipTypeId;
    return this;
  }

  /**
   * The ID of the relationship type
   * @return hrisRelationshipTypeId
   */
  @javax.annotation.Nonnull
  public UUID getHrisRelationshipTypeId() {
    return hrisRelationshipTypeId;
  }

  public void setHrisRelationshipTypeId(@javax.annotation.Nonnull UUID hrisRelationshipTypeId) {
    this.hrisRelationshipTypeId = hrisRelationshipTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertChildWorkerRelationsContainerData upsertChildWorkerRelationsContainerData = (UpsertChildWorkerRelationsContainerData) o;
    return Objects.equals(this.ids, upsertChildWorkerRelationsContainerData.ids) &&
        Objects.equals(this.hrisRelationshipTypeId, upsertChildWorkerRelationsContainerData.hrisRelationshipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, hrisRelationshipTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertChildWorkerRelationsContainerData {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    hrisRelationshipTypeId: ").append(toIndentedString(hrisRelationshipTypeId)).append("\n");
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
    openapiFields.add("ids");
    openapiFields.add("hris_relationship_type_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ids");
    openapiRequiredFields.add("hris_relationship_type_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpsertChildWorkerRelationsContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpsertChildWorkerRelationsContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpsertChildWorkerRelationsContainerData is not found in the empty JSON string", UpsertChildWorkerRelationsContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpsertChildWorkerRelationsContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpsertChildWorkerRelationsContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpsertChildWorkerRelationsContainerData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      if (!jsonObj.get("hris_relationship_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_relationship_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_relationship_type_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpsertChildWorkerRelationsContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpsertChildWorkerRelationsContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpsertChildWorkerRelationsContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpsertChildWorkerRelationsContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpsertChildWorkerRelationsContainerData>() {
           @Override
           public void write(JsonWriter out, UpsertChildWorkerRelationsContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpsertChildWorkerRelationsContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpsertChildWorkerRelationsContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpsertChildWorkerRelationsContainerData
   * @throws IOException if the JSON string is invalid with respect to UpsertChildWorkerRelationsContainerData
   */
  public static UpsertChildWorkerRelationsContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpsertChildWorkerRelationsContainerData.class);
  }

  /**
   * Convert an instance of UpsertChildWorkerRelationsContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

