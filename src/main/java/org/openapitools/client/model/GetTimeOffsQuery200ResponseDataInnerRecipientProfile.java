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
 * GetTimeOffsQuery200ResponseDataInnerRecipientProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:03:48.437639881Z[GMT]", comments = "Generator version: 7.10.0")
public class GetTimeOffsQuery200ResponseDataInnerRecipientProfile {
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

  public GetTimeOffsQuery200ResponseDataInnerRecipientProfile() {
  }

  public GetTimeOffsQuery200ResponseDataInnerRecipientProfile hrisProfileId(@javax.annotation.Nullable UUID hrisProfileId) {
    this.hrisProfileId = hrisProfileId;
    return this;
  }

  /**
   * Recipient hris profile id
   * @return hrisProfileId
   */
  @javax.annotation.Nullable
  public UUID getHrisProfileId() {
    return hrisProfileId;
  }

  public void setHrisProfileId(@javax.annotation.Nullable UUID hrisProfileId) {
    this.hrisProfileId = hrisProfileId;
  }


  public GetTimeOffsQuery200ResponseDataInnerRecipientProfile organizationId(@javax.annotation.Nullable UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Recipient organization id
   * @return organizationId
   */
  @javax.annotation.Nullable
  public UUID getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(@javax.annotation.Nullable UUID organizationId) {
    this.organizationId = organizationId;
  }


  public GetTimeOffsQuery200ResponseDataInnerRecipientProfile clientProfileId(@javax.annotation.Nullable UUID clientProfileId) {
    this.clientProfileId = clientProfileId;
    return this;
  }

  /**
   * Recipient client profile id
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
    GetTimeOffsQuery200ResponseDataInnerRecipientProfile getTimeOffsQuery200ResponseDataInnerRecipientProfile = (GetTimeOffsQuery200ResponseDataInnerRecipientProfile) o;
    return Objects.equals(this.hrisProfileId, getTimeOffsQuery200ResponseDataInnerRecipientProfile.hrisProfileId) &&
        Objects.equals(this.organizationId, getTimeOffsQuery200ResponseDataInnerRecipientProfile.organizationId) &&
        Objects.equals(this.clientProfileId, getTimeOffsQuery200ResponseDataInnerRecipientProfile.clientProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hrisProfileId, organizationId, clientProfileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimeOffsQuery200ResponseDataInnerRecipientProfile {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetTimeOffsQuery200ResponseDataInnerRecipientProfile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTimeOffsQuery200ResponseDataInnerRecipientProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTimeOffsQuery200ResponseDataInnerRecipientProfile is not found in the empty JSON string", GetTimeOffsQuery200ResponseDataInnerRecipientProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTimeOffsQuery200ResponseDataInnerRecipientProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTimeOffsQuery200ResponseDataInnerRecipientProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!GetTimeOffsQuery200ResponseDataInnerRecipientProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTimeOffsQuery200ResponseDataInnerRecipientProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTimeOffsQuery200ResponseDataInnerRecipientProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTimeOffsQuery200ResponseDataInnerRecipientProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTimeOffsQuery200ResponseDataInnerRecipientProfile>() {
           @Override
           public void write(JsonWriter out, GetTimeOffsQuery200ResponseDataInnerRecipientProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTimeOffsQuery200ResponseDataInnerRecipientProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetTimeOffsQuery200ResponseDataInnerRecipientProfile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTimeOffsQuery200ResponseDataInnerRecipientProfile
   * @throws IOException if the JSON string is invalid with respect to GetTimeOffsQuery200ResponseDataInnerRecipientProfile
   */
  public static GetTimeOffsQuery200ResponseDataInnerRecipientProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTimeOffsQuery200ResponseDataInnerRecipientProfile.class);
  }

  /**
   * Convert an instance of GetTimeOffsQuery200ResponseDataInnerRecipientProfile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

