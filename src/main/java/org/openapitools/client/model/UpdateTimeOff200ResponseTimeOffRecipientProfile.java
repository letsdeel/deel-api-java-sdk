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
 * UpdateTimeOff200ResponseTimeOffRecipientProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:29:34.997576605Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateTimeOff200ResponseTimeOffRecipientProfile {
  public static final String SERIALIZED_NAME_HRIS_PROFILE_ID = "hris_profile_id";
  @SerializedName(SERIALIZED_NAME_HRIS_PROFILE_ID)
  @javax.annotation.Nullable
  private UUID hrisProfileId;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  @javax.annotation.Nullable
  private UUID organizationId;

  public static final String SERIALIZED_NAME_CLIENT_PROFILE_ID = "client_profile_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_PROFILE_ID)
  @javax.annotation.Nullable
  private UUID clientProfileId;

  public UpdateTimeOff200ResponseTimeOffRecipientProfile() {
  }

  public UpdateTimeOff200ResponseTimeOffRecipientProfile hrisProfileId(@javax.annotation.Nullable UUID hrisProfileId) {
    this.hrisProfileId = hrisProfileId;
    return this;
  }

  /**
   * Get hrisProfileId
   * @return hrisProfileId
   */
  @javax.annotation.Nullable
  public UUID getHrisProfileId() {
    return hrisProfileId;
  }

  public void setHrisProfileId(@javax.annotation.Nullable UUID hrisProfileId) {
    this.hrisProfileId = hrisProfileId;
  }


  public UpdateTimeOff200ResponseTimeOffRecipientProfile organizationId(@javax.annotation.Nullable UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId
   * @return organizationId
   */
  @javax.annotation.Nullable
  public UUID getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(@javax.annotation.Nullable UUID organizationId) {
    this.organizationId = organizationId;
  }


  public UpdateTimeOff200ResponseTimeOffRecipientProfile clientProfileId(@javax.annotation.Nullable UUID clientProfileId) {
    this.clientProfileId = clientProfileId;
    return this;
  }

  /**
   * Get clientProfileId
   * @return clientProfileId
   */
  @javax.annotation.Nullable
  public UUID getClientProfileId() {
    return clientProfileId;
  }

  public void setClientProfileId(@javax.annotation.Nullable UUID clientProfileId) {
    this.clientProfileId = clientProfileId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTimeOff200ResponseTimeOffRecipientProfile updateTimeOff200ResponseTimeOffRecipientProfile = (UpdateTimeOff200ResponseTimeOffRecipientProfile) o;
    return Objects.equals(this.hrisProfileId, updateTimeOff200ResponseTimeOffRecipientProfile.hrisProfileId) &&
        Objects.equals(this.organizationId, updateTimeOff200ResponseTimeOffRecipientProfile.organizationId) &&
        Objects.equals(this.clientProfileId, updateTimeOff200ResponseTimeOffRecipientProfile.clientProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hrisProfileId, organizationId, clientProfileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTimeOff200ResponseTimeOffRecipientProfile {\n");
    sb.append("    hrisProfileId: ").append(toIndentedString(hrisProfileId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    clientProfileId: ").append(toIndentedString(clientProfileId)).append("\n");
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
    openapiFields.add("hris_profile_id");
    openapiFields.add("organization_id");
    openapiFields.add("client_profile_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateTimeOff200ResponseTimeOffRecipientProfile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateTimeOff200ResponseTimeOffRecipientProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTimeOff200ResponseTimeOffRecipientProfile is not found in the empty JSON string", UpdateTimeOff200ResponseTimeOffRecipientProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateTimeOff200ResponseTimeOffRecipientProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateTimeOff200ResponseTimeOffRecipientProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hris_profile_id") != null && !jsonObj.get("hris_profile_id").isJsonNull()) && !jsonObj.get("hris_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_profile_id").toString()));
      }
      if ((jsonObj.get("organization_id") != null && !jsonObj.get("organization_id").isJsonNull()) && !jsonObj.get("organization_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_id").toString()));
      }
      if ((jsonObj.get("client_profile_id") != null && !jsonObj.get("client_profile_id").isJsonNull()) && !jsonObj.get("client_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_profile_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTimeOff200ResponseTimeOffRecipientProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTimeOff200ResponseTimeOffRecipientProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTimeOff200ResponseTimeOffRecipientProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTimeOff200ResponseTimeOffRecipientProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTimeOff200ResponseTimeOffRecipientProfile>() {
           @Override
           public void write(JsonWriter out, UpdateTimeOff200ResponseTimeOffRecipientProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTimeOff200ResponseTimeOffRecipientProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateTimeOff200ResponseTimeOffRecipientProfile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateTimeOff200ResponseTimeOffRecipientProfile
   * @throws IOException if the JSON string is invalid with respect to UpdateTimeOff200ResponseTimeOffRecipientProfile
   */
  public static UpdateTimeOff200ResponseTimeOffRecipientProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTimeOff200ResponseTimeOffRecipientProfile.class);
  }

  /**
   * Convert an instance of UpdateTimeOff200ResponseTimeOffRecipientProfile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

