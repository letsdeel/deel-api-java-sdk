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
import org.openapitools.client.model.GetHrisPositions200ResponseDataInnerTeamOrganizationStructure;

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
 * GetHrisPositions200ResponseDataInnerTeam
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T14:19:15.487453130Z[GMT]", comments = "Generator version: 7.10.0")
public class GetHrisPositions200ResponseDataInnerTeam {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_ORGANIZATION_STRUCTURE = "organization_structure";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_STRUCTURE)
  @javax.annotation.Nullable
  private GetHrisPositions200ResponseDataInnerTeamOrganizationStructure organizationStructure;

  public GetHrisPositions200ResponseDataInnerTeam() {
  }

  public GetHrisPositions200ResponseDataInnerTeam id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Team ID
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public GetHrisPositions200ResponseDataInnerTeam name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Team Name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetHrisPositions200ResponseDataInnerTeam organizationStructure(@javax.annotation.Nullable GetHrisPositions200ResponseDataInnerTeamOrganizationStructure organizationStructure) {
    this.organizationStructure = organizationStructure;
    return this;
  }

  /**
   * Get organizationStructure
   * @return organizationStructure
   */
  @javax.annotation.Nullable
  public GetHrisPositions200ResponseDataInnerTeamOrganizationStructure getOrganizationStructure() {
    return organizationStructure;
  }

  public void setOrganizationStructure(@javax.annotation.Nullable GetHrisPositions200ResponseDataInnerTeamOrganizationStructure organizationStructure) {
    this.organizationStructure = organizationStructure;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHrisPositions200ResponseDataInnerTeam getHrisPositions200ResponseDataInnerTeam = (GetHrisPositions200ResponseDataInnerTeam) o;
    return Objects.equals(this.id, getHrisPositions200ResponseDataInnerTeam.id) &&
        Objects.equals(this.name, getHrisPositions200ResponseDataInnerTeam.name) &&
        Objects.equals(this.organizationStructure, getHrisPositions200ResponseDataInnerTeam.organizationStructure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, organizationStructure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHrisPositions200ResponseDataInnerTeam {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationStructure: ").append(toIndentedString(organizationStructure)).append("\n");
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
    openapiFields.add("organization_structure");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetHrisPositions200ResponseDataInnerTeam
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetHrisPositions200ResponseDataInnerTeam.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetHrisPositions200ResponseDataInnerTeam is not found in the empty JSON string", GetHrisPositions200ResponseDataInnerTeam.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetHrisPositions200ResponseDataInnerTeam.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetHrisPositions200ResponseDataInnerTeam` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `organization_structure`
      if (jsonObj.get("organization_structure") != null && !jsonObj.get("organization_structure").isJsonNull()) {
        GetHrisPositions200ResponseDataInnerTeamOrganizationStructure.validateJsonElement(jsonObj.get("organization_structure"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetHrisPositions200ResponseDataInnerTeam.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetHrisPositions200ResponseDataInnerTeam' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetHrisPositions200ResponseDataInnerTeam> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetHrisPositions200ResponseDataInnerTeam.class));

       return (TypeAdapter<T>) new TypeAdapter<GetHrisPositions200ResponseDataInnerTeam>() {
           @Override
           public void write(JsonWriter out, GetHrisPositions200ResponseDataInnerTeam value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetHrisPositions200ResponseDataInnerTeam read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetHrisPositions200ResponseDataInnerTeam given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetHrisPositions200ResponseDataInnerTeam
   * @throws IOException if the JSON string is invalid with respect to GetHrisPositions200ResponseDataInnerTeam
   */
  public static GetHrisPositions200ResponseDataInnerTeam fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetHrisPositions200ResponseDataInnerTeam.class);
  }

  /**
   * Convert an instance of GetHrisPositions200ResponseDataInnerTeam to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

