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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ApplyChangesPositionsRequestDataAddInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class ApplyChangesPositionsRequestDataAddInner {
  public static final String SERIALIZED_NAME_ROLE_ID = "role_id";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  @javax.annotation.Nullable
  private UUID roleId;

  public static final String SERIALIZED_NAME_TEAM_ID = "team_id";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  @javax.annotation.Nonnull
  private UUID teamId;

  public static final String SERIALIZED_NAME_IS_SUPPORTIVE = "is_supportive";
  @SerializedName(SERIALIZED_NAME_IS_SUPPORTIVE)
  @javax.annotation.Nullable
  private Boolean isSupportive;

  public ApplyChangesPositionsRequestDataAddInner() {
  }

  public ApplyChangesPositionsRequestDataAddInner roleId(@javax.annotation.Nullable UUID roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Id of the role to be assigned to the position.
   * @return roleId
   */
  @javax.annotation.Nullable
  public UUID getRoleId() {
    return roleId;
  }

  public void setRoleId(@javax.annotation.Nullable UUID roleId) {
    this.roleId = roleId;
  }


  public ApplyChangesPositionsRequestDataAddInner teamId(@javax.annotation.Nonnull UUID teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Id of the team to be assigned to the position.
   * @return teamId
   */
  @javax.annotation.Nonnull
  public UUID getTeamId() {
    return teamId;
  }

  public void setTeamId(@javax.annotation.Nonnull UUID teamId) {
    this.teamId = teamId;
  }


  public ApplyChangesPositionsRequestDataAddInner isSupportive(@javax.annotation.Nullable Boolean isSupportive) {
    this.isSupportive = isSupportive;
    return this;
  }

  /**
   * Flag to indicate if the position is supportive.
   * @return isSupportive
   */
  @javax.annotation.Nullable
  public Boolean getIsSupportive() {
    return isSupportive;
  }

  public void setIsSupportive(@javax.annotation.Nullable Boolean isSupportive) {
    this.isSupportive = isSupportive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyChangesPositionsRequestDataAddInner applyChangesPositionsRequestDataAddInner = (ApplyChangesPositionsRequestDataAddInner) o;
    return Objects.equals(this.roleId, applyChangesPositionsRequestDataAddInner.roleId) &&
        Objects.equals(this.teamId, applyChangesPositionsRequestDataAddInner.teamId) &&
        Objects.equals(this.isSupportive, applyChangesPositionsRequestDataAddInner.isSupportive);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, teamId, isSupportive);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyChangesPositionsRequestDataAddInner {\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    isSupportive: ").append(toIndentedString(isSupportive)).append("\n");
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
    openapiFields.add("role_id");
    openapiFields.add("team_id");
    openapiFields.add("is_supportive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("team_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApplyChangesPositionsRequestDataAddInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApplyChangesPositionsRequestDataAddInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplyChangesPositionsRequestDataAddInner is not found in the empty JSON string", ApplyChangesPositionsRequestDataAddInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApplyChangesPositionsRequestDataAddInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplyChangesPositionsRequestDataAddInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplyChangesPositionsRequestDataAddInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("role_id") != null && !jsonObj.get("role_id").isJsonNull()) && !jsonObj.get("role_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role_id").toString()));
      }
      if (!jsonObj.get("team_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplyChangesPositionsRequestDataAddInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplyChangesPositionsRequestDataAddInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplyChangesPositionsRequestDataAddInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplyChangesPositionsRequestDataAddInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplyChangesPositionsRequestDataAddInner>() {
           @Override
           public void write(JsonWriter out, ApplyChangesPositionsRequestDataAddInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplyChangesPositionsRequestDataAddInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApplyChangesPositionsRequestDataAddInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApplyChangesPositionsRequestDataAddInner
   * @throws IOException if the JSON string is invalid with respect to ApplyChangesPositionsRequestDataAddInner
   */
  public static ApplyChangesPositionsRequestDataAddInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplyChangesPositionsRequestDataAddInner.class);
  }

  /**
   * Convert an instance of ApplyChangesPositionsRequestDataAddInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

