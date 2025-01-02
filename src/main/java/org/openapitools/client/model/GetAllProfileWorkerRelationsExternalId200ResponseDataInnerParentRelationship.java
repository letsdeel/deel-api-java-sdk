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
 * An object that has information about the parent profile in the relation.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-02T14:25:45.544976271Z[GMT]", comments = "Generator version: 7.10.0")
public class GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship {
  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profile_id";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  @javax.annotation.Nullable
  private UUID profileId;

  public static final String SERIALIZED_NAME_RELATION_ID = "relation_id";
  @SerializedName(SERIALIZED_NAME_RELATION_ID)
  @javax.annotation.Nullable
  private UUID relationId;

  public static final String SERIALIZED_NAME_PROFILE_EXTERNAL_ID = "profile_external_id";
  @SerializedName(SERIALIZED_NAME_PROFILE_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String profileExternalId;

  public static final String SERIALIZED_NAME_RELATION_EXTERNAL_ID = "relation_external_id";
  @SerializedName(SERIALIZED_NAME_RELATION_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String relationExternalId;

  public GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship() {
  }

  public GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the parent profile
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the parent profile
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship profileId(@javax.annotation.Nullable UUID profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * The ID of the parent profile
   * @return profileId
   */
  @javax.annotation.Nullable
  public UUID getProfileId() {
    return profileId;
  }

  public void setProfileId(@javax.annotation.Nullable UUID profileId) {
    this.profileId = profileId;
  }


  public GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship relationId(@javax.annotation.Nullable UUID relationId) {
    this.relationId = relationId;
    return this;
  }

  /**
   * The ID of the relation between the profiles
   * @return relationId
   */
  @javax.annotation.Nullable
  public UUID getRelationId() {
    return relationId;
  }

  public void setRelationId(@javax.annotation.Nullable UUID relationId) {
    this.relationId = relationId;
  }


  public GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship profileExternalId(@javax.annotation.Nullable String profileExternalId) {
    this.profileExternalId = profileExternalId;
    return this;
  }

  /**
   * The external ID of the parent profile
   * @return profileExternalId
   */
  @javax.annotation.Nullable
  public String getProfileExternalId() {
    return profileExternalId;
  }

  public void setProfileExternalId(@javax.annotation.Nullable String profileExternalId) {
    this.profileExternalId = profileExternalId;
  }


  public GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship relationExternalId(@javax.annotation.Nullable String relationExternalId) {
    this.relationExternalId = relationExternalId;
    return this;
  }

  /**
   * The external ID of the relation
   * @return relationExternalId
   */
  @javax.annotation.Nullable
  public String getRelationExternalId() {
    return relationExternalId;
  }

  public void setRelationExternalId(@javax.annotation.Nullable String relationExternalId) {
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
    GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship getAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship = (GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship) o;
    return Objects.equals(this.lastName, getAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.lastName) &&
        Objects.equals(this.firstName, getAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.firstName) &&
        Objects.equals(this.profileId, getAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.profileId) &&
        Objects.equals(this.relationId, getAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.relationId) &&
        Objects.equals(this.profileExternalId, getAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.profileExternalId) &&
        Objects.equals(this.relationExternalId, getAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.relationExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, firstName, profileId, relationId, profileExternalId, relationExternalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship {\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    relationId: ").append(toIndentedString(relationId)).append("\n");
    sb.append("    profileExternalId: ").append(toIndentedString(profileExternalId)).append("\n");
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
    openapiFields.add("last_name");
    openapiFields.add("first_name");
    openapiFields.add("profile_id");
    openapiFields.add("relation_id");
    openapiFields.add("profile_external_id");
    openapiFields.add("relation_external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship is not found in the empty JSON string", GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("profile_id") != null && !jsonObj.get("profile_id").isJsonNull()) && !jsonObj.get("profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_id").toString()));
      }
      if ((jsonObj.get("relation_id") != null && !jsonObj.get("relation_id").isJsonNull()) && !jsonObj.get("relation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relation_id").toString()));
      }
      if ((jsonObj.get("profile_external_id") != null && !jsonObj.get("profile_external_id").isJsonNull()) && !jsonObj.get("profile_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_external_id").toString()));
      }
      if ((jsonObj.get("relation_external_id") != null && !jsonObj.get("relation_external_id").isJsonNull()) && !jsonObj.get("relation_external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relation_external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relation_external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship>() {
           @Override
           public void write(JsonWriter out, GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship
   * @throws IOException if the JSON string is invalid with respect to GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship
   */
  public static GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.class);
  }

  /**
   * Convert an instance of GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

