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
import org.openapitools.client.model.OrgStructureToCreateContainerDataTeamsInner;

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
 * OrgStructureToCreateContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class OrgStructureToCreateContainerData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  @javax.annotation.Nullable
  private List<OrgStructureToCreateContainerDataTeamsInner> teams = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_ENABLE_ROLES = "enable_roles";
  @SerializedName(SERIALIZED_NAME_ENABLE_ROLES)
  @javax.annotation.Nullable
  private Boolean enableRoles = true;

  public static final String SERIALIZED_NAME_IS_MULTIPLE_SELECT = "is_multiple_select";
  @SerializedName(SERIALIZED_NAME_IS_MULTIPLE_SELECT)
  @javax.annotation.Nullable
  private Boolean isMultipleSelect = true;

  public OrgStructureToCreateContainerData() {
  }

  public OrgStructureToCreateContainerData name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public OrgStructureToCreateContainerData teams(@javax.annotation.Nullable List<OrgStructureToCreateContainerDataTeamsInner> teams) {
    this.teams = teams;
    return this;
  }

  public OrgStructureToCreateContainerData addTeamsItem(OrgStructureToCreateContainerDataTeamsInner teamsItem) {
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
  public List<OrgStructureToCreateContainerDataTeamsInner> getTeams() {
    return teams;
  }

  public void setTeams(@javax.annotation.Nullable List<OrgStructureToCreateContainerDataTeamsInner> teams) {
    this.teams = teams;
  }


  public OrgStructureToCreateContainerData externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public OrgStructureToCreateContainerData enableRoles(@javax.annotation.Nullable Boolean enableRoles) {
    this.enableRoles = enableRoles;
    return this;
  }

  /**
   * Get enableRoles
   * @return enableRoles
   */
  @javax.annotation.Nullable
  public Boolean getEnableRoles() {
    return enableRoles;
  }

  public void setEnableRoles(@javax.annotation.Nullable Boolean enableRoles) {
    this.enableRoles = enableRoles;
  }


  public OrgStructureToCreateContainerData isMultipleSelect(@javax.annotation.Nullable Boolean isMultipleSelect) {
    this.isMultipleSelect = isMultipleSelect;
    return this;
  }

  /**
   * Get isMultipleSelect
   * @return isMultipleSelect
   */
  @javax.annotation.Nullable
  public Boolean getIsMultipleSelect() {
    return isMultipleSelect;
  }

  public void setIsMultipleSelect(@javax.annotation.Nullable Boolean isMultipleSelect) {
    this.isMultipleSelect = isMultipleSelect;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgStructureToCreateContainerData orgStructureToCreateContainerData = (OrgStructureToCreateContainerData) o;
    return Objects.equals(this.name, orgStructureToCreateContainerData.name) &&
        Objects.equals(this.teams, orgStructureToCreateContainerData.teams) &&
        Objects.equals(this.externalId, orgStructureToCreateContainerData.externalId) &&
        Objects.equals(this.enableRoles, orgStructureToCreateContainerData.enableRoles) &&
        Objects.equals(this.isMultipleSelect, orgStructureToCreateContainerData.isMultipleSelect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, teams, externalId, enableRoles, isMultipleSelect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgStructureToCreateContainerData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    enableRoles: ").append(toIndentedString(enableRoles)).append("\n");
    sb.append("    isMultipleSelect: ").append(toIndentedString(isMultipleSelect)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("teams");
    openapiFields.add("external_id");
    openapiFields.add("enable_roles");
    openapiFields.add("is_multiple_select");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrgStructureToCreateContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrgStructureToCreateContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgStructureToCreateContainerData is not found in the empty JSON string", OrgStructureToCreateContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrgStructureToCreateContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrgStructureToCreateContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("teams") != null && !jsonObj.get("teams").isJsonNull()) {
        JsonArray jsonArrayteams = jsonObj.getAsJsonArray("teams");
        if (jsonArrayteams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("teams").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `teams` to be an array in the JSON string but got `%s`", jsonObj.get("teams").toString()));
          }

          // validate the optional field `teams` (array)
          for (int i = 0; i < jsonArrayteams.size(); i++) {
            OrgStructureToCreateContainerDataTeamsInner.validateJsonElement(jsonArrayteams.get(i));
          };
        }
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrgStructureToCreateContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgStructureToCreateContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgStructureToCreateContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgStructureToCreateContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgStructureToCreateContainerData>() {
           @Override
           public void write(JsonWriter out, OrgStructureToCreateContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrgStructureToCreateContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrgStructureToCreateContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrgStructureToCreateContainerData
   * @throws IOException if the JSON string is invalid with respect to OrgStructureToCreateContainerData
   */
  public static OrgStructureToCreateContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgStructureToCreateContainerData.class);
  }

  /**
   * Convert an instance of OrgStructureToCreateContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

