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
import org.openapitools.client.model.GetOrgStructure200ResponseDataRolesInner;

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
 * GetOrgStructure200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class GetOrgStructure200ResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  @javax.annotation.Nullable
  private List<GetOrgStructure200ResponseDataRolesInner> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  @javax.annotation.Nullable
  private List<Object> teams = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_TEAMS_COUNT = "teams_count";
  @SerializedName(SERIALIZED_NAME_TEAMS_COUNT)
  @javax.annotation.Nullable
  private Integer teamsCount;

  public static final String SERIALIZED_NAME_ENABLE_ROLES = "enable_roles";
  @SerializedName(SERIALIZED_NAME_ENABLE_ROLES)
  @javax.annotation.Nullable
  private Boolean enableRoles;

  public static final String SERIALIZED_NAME_IS_MULTISELECT = "is_multiselect";
  @SerializedName(SERIALIZED_NAME_IS_MULTISELECT)
  @javax.annotation.Nullable
  private Boolean isMultiselect;

  public GetOrgStructure200ResponseData() {
  }

  public GetOrgStructure200ResponseData id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * HRIS Organization Structure ID
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public GetOrgStructure200ResponseData name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * HRIS Organization Structure Name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetOrgStructure200ResponseData type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * HRIS Organization Structure Type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public GetOrgStructure200ResponseData roles(@javax.annotation.Nullable List<GetOrgStructure200ResponseDataRolesInner> roles) {
    this.roles = roles;
    return this;
  }

  public GetOrgStructure200ResponseData addRolesItem(GetOrgStructure200ResponseDataRolesInner rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   */
  @javax.annotation.Nullable
  public List<GetOrgStructure200ResponseDataRolesInner> getRoles() {
    return roles;
  }

  public void setRoles(@javax.annotation.Nullable List<GetOrgStructure200ResponseDataRolesInner> roles) {
    this.roles = roles;
  }


  public GetOrgStructure200ResponseData teams(@javax.annotation.Nullable List<Object> teams) {
    this.teams = teams;
    return this;
  }

  public GetOrgStructure200ResponseData addTeamsItem(Object teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Get teams
   * @return teams
   */
  @javax.annotation.Nullable
  public List<Object> getTeams() {
    return teams;
  }

  public void setTeams(@javax.annotation.Nullable List<Object> teams) {
    this.teams = teams;
  }


  public GetOrgStructure200ResponseData externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * HRIS Organization Structure External ID
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public GetOrgStructure200ResponseData teamsCount(@javax.annotation.Nullable Integer teamsCount) {
    this.teamsCount = teamsCount;
    return this;
  }

  /**
   * HRIS Organization Structure Teams Count
   * @return teamsCount
   */
  @javax.annotation.Nullable
  public Integer getTeamsCount() {
    return teamsCount;
  }

  public void setTeamsCount(@javax.annotation.Nullable Integer teamsCount) {
    this.teamsCount = teamsCount;
  }


  public GetOrgStructure200ResponseData enableRoles(@javax.annotation.Nullable Boolean enableRoles) {
    this.enableRoles = enableRoles;
    return this;
  }

  /**
   * HRIS Organization Structure Enable Roles
   * @return enableRoles
   */
  @javax.annotation.Nullable
  public Boolean getEnableRoles() {
    return enableRoles;
  }

  public void setEnableRoles(@javax.annotation.Nullable Boolean enableRoles) {
    this.enableRoles = enableRoles;
  }


  public GetOrgStructure200ResponseData isMultiselect(@javax.annotation.Nullable Boolean isMultiselect) {
    this.isMultiselect = isMultiselect;
    return this;
  }

  /**
   * HRIS Organization Structure Is Multiselect
   * @return isMultiselect
   */
  @javax.annotation.Nullable
  public Boolean getIsMultiselect() {
    return isMultiselect;
  }

  public void setIsMultiselect(@javax.annotation.Nullable Boolean isMultiselect) {
    this.isMultiselect = isMultiselect;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrgStructure200ResponseData getOrgStructure200ResponseData = (GetOrgStructure200ResponseData) o;
    return Objects.equals(this.id, getOrgStructure200ResponseData.id) &&
        Objects.equals(this.name, getOrgStructure200ResponseData.name) &&
        Objects.equals(this.type, getOrgStructure200ResponseData.type) &&
        Objects.equals(this.roles, getOrgStructure200ResponseData.roles) &&
        Objects.equals(this.teams, getOrgStructure200ResponseData.teams) &&
        Objects.equals(this.externalId, getOrgStructure200ResponseData.externalId) &&
        Objects.equals(this.teamsCount, getOrgStructure200ResponseData.teamsCount) &&
        Objects.equals(this.enableRoles, getOrgStructure200ResponseData.enableRoles) &&
        Objects.equals(this.isMultiselect, getOrgStructure200ResponseData.isMultiselect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, roles, teams, externalId, teamsCount, enableRoles, isMultiselect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrgStructure200ResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    teamsCount: ").append(toIndentedString(teamsCount)).append("\n");
    sb.append("    enableRoles: ").append(toIndentedString(enableRoles)).append("\n");
    sb.append("    isMultiselect: ").append(toIndentedString(isMultiselect)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("roles");
    openapiFields.add("teams");
    openapiFields.add("external_id");
    openapiFields.add("teams_count");
    openapiFields.add("enable_roles");
    openapiFields.add("is_multiselect");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetOrgStructure200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetOrgStructure200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOrgStructure200ResponseData is not found in the empty JSON string", GetOrgStructure200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetOrgStructure200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetOrgStructure200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull()) {
        JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
        if (jsonArrayroles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("roles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
          }

          // validate the optional field `roles` (array)
          for (int i = 0; i < jsonArrayroles.size(); i++) {
            GetOrgStructure200ResponseDataRolesInner.validateJsonElement(jsonArrayroles.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("teams") != null && !jsonObj.get("teams").isJsonNull() && !jsonObj.get("teams").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `teams` to be an array in the JSON string but got `%s`", jsonObj.get("teams").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOrgStructure200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOrgStructure200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOrgStructure200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOrgStructure200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOrgStructure200ResponseData>() {
           @Override
           public void write(JsonWriter out, GetOrgStructure200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetOrgStructure200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetOrgStructure200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetOrgStructure200ResponseData
   * @throws IOException if the JSON string is invalid with respect to GetOrgStructure200ResponseData
   */
  public static GetOrgStructure200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOrgStructure200ResponseData.class);
  }

  /**
   * Convert an instance of GetOrgStructure200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

