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
 * OrgStructureToUpdateContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class OrgStructureToUpdateContainerData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  @javax.annotation.Nonnull
  private List<Object> teams = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_ENABLE_ROLES = "enable_roles";
  @SerializedName(SERIALIZED_NAME_ENABLE_ROLES)
  @javax.annotation.Nullable
  private Boolean enableRoles;

  public static final String SERIALIZED_NAME_IS_MULTISELECT = "is_multiselect";
  @SerializedName(SERIALIZED_NAME_IS_MULTISELECT)
  @javax.annotation.Nullable
  private Boolean isMultiselect;

  public OrgStructureToUpdateContainerData() {
  }

  public OrgStructureToUpdateContainerData name(@javax.annotation.Nullable String name) {
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


  public OrgStructureToUpdateContainerData teams(@javax.annotation.Nonnull List<Object> teams) {
    this.teams = teams;
    return this;
  }

  public OrgStructureToUpdateContainerData addTeamsItem(Object teamsItem) {
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
  @javax.annotation.Nonnull
  public List<Object> getTeams() {
    return teams;
  }

  public void setTeams(@javax.annotation.Nonnull List<Object> teams) {
    this.teams = teams;
  }


  public OrgStructureToUpdateContainerData externalId(@javax.annotation.Nullable String externalId) {
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


  public OrgStructureToUpdateContainerData enableRoles(@javax.annotation.Nullable Boolean enableRoles) {
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


  public OrgStructureToUpdateContainerData isMultiselect(@javax.annotation.Nullable Boolean isMultiselect) {
    this.isMultiselect = isMultiselect;
    return this;
  }

  /**
   * Get isMultiselect
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
    OrgStructureToUpdateContainerData orgStructureToUpdateContainerData = (OrgStructureToUpdateContainerData) o;
    return Objects.equals(this.name, orgStructureToUpdateContainerData.name) &&
        Objects.equals(this.teams, orgStructureToUpdateContainerData.teams) &&
        Objects.equals(this.externalId, orgStructureToUpdateContainerData.externalId) &&
        Objects.equals(this.enableRoles, orgStructureToUpdateContainerData.enableRoles) &&
        Objects.equals(this.isMultiselect, orgStructureToUpdateContainerData.isMultiselect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, teams, externalId, enableRoles, isMultiselect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgStructureToUpdateContainerData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("teams");
    openapiFields.add("external_id");
    openapiFields.add("enable_roles");
    openapiFields.add("is_multiselect");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("teams");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrgStructureToUpdateContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrgStructureToUpdateContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrgStructureToUpdateContainerData is not found in the empty JSON string", OrgStructureToUpdateContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrgStructureToUpdateContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrgStructureToUpdateContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrgStructureToUpdateContainerData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("teams") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("teams").isJsonArray()) {
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
       if (!OrgStructureToUpdateContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrgStructureToUpdateContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrgStructureToUpdateContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrgStructureToUpdateContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<OrgStructureToUpdateContainerData>() {
           @Override
           public void write(JsonWriter out, OrgStructureToUpdateContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrgStructureToUpdateContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrgStructureToUpdateContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrgStructureToUpdateContainerData
   * @throws IOException if the JSON string is invalid with respect to OrgStructureToUpdateContainerData
   */
  public static OrgStructureToUpdateContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrgStructureToUpdateContainerData.class);
  }

  /**
   * Convert an instance of OrgStructureToUpdateContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

