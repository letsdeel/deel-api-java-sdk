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
import org.openapitools.client.model.GetAllOrgStructures200ResponseDataInnerRolesInner;

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
 * GetAllOrgStructures200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:23:41.573776663Z[GMT]", comments = "Generator version: 7.10.0")
public class GetAllOrgStructures200ResponseDataInner {
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
  private List<GetAllOrgStructures200ResponseDataInnerRolesInner> roles = new ArrayList<>();

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

  public GetAllOrgStructures200ResponseDataInner() {
  }

  public GetAllOrgStructures200ResponseDataInner id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the Org Structure.
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public GetAllOrgStructures200ResponseDataInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Org Structure.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetAllOrgStructures200ResponseDataInner type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the Org Structure.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public GetAllOrgStructures200ResponseDataInner roles(@javax.annotation.Nullable List<GetAllOrgStructures200ResponseDataInnerRolesInner> roles) {
    this.roles = roles;
    return this;
  }

  public GetAllOrgStructures200ResponseDataInner addRolesItem(GetAllOrgStructures200ResponseDataInnerRolesInner rolesItem) {
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
  public List<GetAllOrgStructures200ResponseDataInnerRolesInner> getRoles() {
    return roles;
  }

  public void setRoles(@javax.annotation.Nullable List<GetAllOrgStructures200ResponseDataInnerRolesInner> roles) {
    this.roles = roles;
  }


  public GetAllOrgStructures200ResponseDataInner teams(@javax.annotation.Nullable List<Object> teams) {
    this.teams = teams;
    return this;
  }

  public GetAllOrgStructures200ResponseDataInner addTeamsItem(Object teamsItem) {
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


  public GetAllOrgStructures200ResponseDataInner externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * The external identifier of the Org Structure.
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public GetAllOrgStructures200ResponseDataInner teamsCount(@javax.annotation.Nullable Integer teamsCount) {
    this.teamsCount = teamsCount;
    return this;
  }

  /**
   * The number of Teams in the Org Structure.
   * @return teamsCount
   */
  @javax.annotation.Nullable
  public Integer getTeamsCount() {
    return teamsCount;
  }

  public void setTeamsCount(@javax.annotation.Nullable Integer teamsCount) {
    this.teamsCount = teamsCount;
  }


  public GetAllOrgStructures200ResponseDataInner enableRoles(@javax.annotation.Nullable Boolean enableRoles) {
    this.enableRoles = enableRoles;
    return this;
  }

  /**
   * Whether the Org Structure has Roles enabled.
   * @return enableRoles
   */
  @javax.annotation.Nullable
  public Boolean getEnableRoles() {
    return enableRoles;
  }

  public void setEnableRoles(@javax.annotation.Nullable Boolean enableRoles) {
    this.enableRoles = enableRoles;
  }


  public GetAllOrgStructures200ResponseDataInner isMultiselect(@javax.annotation.Nullable Boolean isMultiselect) {
    this.isMultiselect = isMultiselect;
    return this;
  }

  /**
   * Whether the Org Structure is multiselect.
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
    GetAllOrgStructures200ResponseDataInner getAllOrgStructures200ResponseDataInner = (GetAllOrgStructures200ResponseDataInner) o;
    return Objects.equals(this.id, getAllOrgStructures200ResponseDataInner.id) &&
        Objects.equals(this.name, getAllOrgStructures200ResponseDataInner.name) &&
        Objects.equals(this.type, getAllOrgStructures200ResponseDataInner.type) &&
        Objects.equals(this.roles, getAllOrgStructures200ResponseDataInner.roles) &&
        Objects.equals(this.teams, getAllOrgStructures200ResponseDataInner.teams) &&
        Objects.equals(this.externalId, getAllOrgStructures200ResponseDataInner.externalId) &&
        Objects.equals(this.teamsCount, getAllOrgStructures200ResponseDataInner.teamsCount) &&
        Objects.equals(this.enableRoles, getAllOrgStructures200ResponseDataInner.enableRoles) &&
        Objects.equals(this.isMultiselect, getAllOrgStructures200ResponseDataInner.isMultiselect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, roles, teams, externalId, teamsCount, enableRoles, isMultiselect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllOrgStructures200ResponseDataInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetAllOrgStructures200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAllOrgStructures200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAllOrgStructures200ResponseDataInner is not found in the empty JSON string", GetAllOrgStructures200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAllOrgStructures200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAllOrgStructures200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            GetAllOrgStructures200ResponseDataInnerRolesInner.validateJsonElement(jsonArrayroles.get(i));
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
       if (!GetAllOrgStructures200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAllOrgStructures200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAllOrgStructures200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAllOrgStructures200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAllOrgStructures200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetAllOrgStructures200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAllOrgStructures200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAllOrgStructures200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAllOrgStructures200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetAllOrgStructures200ResponseDataInner
   */
  public static GetAllOrgStructures200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAllOrgStructures200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetAllOrgStructures200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

