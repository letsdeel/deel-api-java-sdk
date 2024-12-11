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
import org.openapitools.client.model.GetAllOrgStructuresContainerDataInnerRolesInner;
import org.openapitools.client.model.GetHrisPositionContainerDataInnerTeam;

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
 * GetHrisPositionContainerDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:39:46.997965815Z[GMT]", comments = "Generator version: 7.10.0")
public class GetHrisPositionContainerDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  @javax.annotation.Nullable
  private GetAllOrgStructuresContainerDataInnerRolesInner role;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  @javax.annotation.Nullable
  private GetHrisPositionContainerDataInnerTeam team;

  public static final String SERIALIZED_NAME_IS_SUPPORTIVE = "is_supportive";
  @SerializedName(SERIALIZED_NAME_IS_SUPPORTIVE)
  @javax.annotation.Nullable
  private Boolean isSupportive;

  public GetHrisPositionContainerDataInner() {
  }

  public GetHrisPositionContainerDataInner id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public GetHrisPositionContainerDataInner role(@javax.annotation.Nullable GetAllOrgStructuresContainerDataInnerRolesInner role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @javax.annotation.Nullable
  public GetAllOrgStructuresContainerDataInnerRolesInner getRole() {
    return role;
  }

  public void setRole(@javax.annotation.Nullable GetAllOrgStructuresContainerDataInnerRolesInner role) {
    this.role = role;
  }


  public GetHrisPositionContainerDataInner team(@javax.annotation.Nullable GetHrisPositionContainerDataInnerTeam team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @javax.annotation.Nullable
  public GetHrisPositionContainerDataInnerTeam getTeam() {
    return team;
  }

  public void setTeam(@javax.annotation.Nullable GetHrisPositionContainerDataInnerTeam team) {
    this.team = team;
  }


  public GetHrisPositionContainerDataInner isSupportive(@javax.annotation.Nullable Boolean isSupportive) {
    this.isSupportive = isSupportive;
    return this;
  }

  /**
   * Get isSupportive
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
    GetHrisPositionContainerDataInner getHrisPositionContainerDataInner = (GetHrisPositionContainerDataInner) o;
    return Objects.equals(this.id, getHrisPositionContainerDataInner.id) &&
        Objects.equals(this.role, getHrisPositionContainerDataInner.role) &&
        Objects.equals(this.team, getHrisPositionContainerDataInner.team) &&
        Objects.equals(this.isSupportive, getHrisPositionContainerDataInner.isSupportive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, team, isSupportive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHrisPositionContainerDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("role");
    openapiFields.add("team");
    openapiFields.add("is_supportive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetHrisPositionContainerDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetHrisPositionContainerDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetHrisPositionContainerDataInner is not found in the empty JSON string", GetHrisPositionContainerDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetHrisPositionContainerDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetHrisPositionContainerDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `role`
      if (jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) {
        GetAllOrgStructuresContainerDataInnerRolesInner.validateJsonElement(jsonObj.get("role"));
      }
      // validate the optional field `team`
      if (jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) {
        GetHrisPositionContainerDataInnerTeam.validateJsonElement(jsonObj.get("team"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetHrisPositionContainerDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetHrisPositionContainerDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetHrisPositionContainerDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetHrisPositionContainerDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetHrisPositionContainerDataInner>() {
           @Override
           public void write(JsonWriter out, GetHrisPositionContainerDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetHrisPositionContainerDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetHrisPositionContainerDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetHrisPositionContainerDataInner
   * @throws IOException if the JSON string is invalid with respect to GetHrisPositionContainerDataInner
   */
  public static GetHrisPositionContainerDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetHrisPositionContainerDataInner.class);
  }

  /**
   * Convert an instance of GetHrisPositionContainerDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

