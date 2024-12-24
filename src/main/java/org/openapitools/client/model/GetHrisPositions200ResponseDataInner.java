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
import org.openapitools.client.model.GetHrisPositions200ResponseDataInnerRole;
import org.openapitools.client.model.GetHrisPositions200ResponseDataInnerTeam;

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
 * GetHrisPositions200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class GetHrisPositions200ResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  @javax.annotation.Nullable
  private GetHrisPositions200ResponseDataInnerRole role;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  @javax.annotation.Nullable
  private GetHrisPositions200ResponseDataInnerTeam team;

  public static final String SERIALIZED_NAME_IS_SUPPORTIVE = "is_supportive";
  @SerializedName(SERIALIZED_NAME_IS_SUPPORTIVE)
  @javax.annotation.Nullable
  private Boolean isSupportive;

  public GetHrisPositions200ResponseDataInner() {
  }

  public GetHrisPositions200ResponseDataInner id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * HRIS Position ID
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public GetHrisPositions200ResponseDataInner role(@javax.annotation.Nullable GetHrisPositions200ResponseDataInnerRole role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @javax.annotation.Nullable
  public GetHrisPositions200ResponseDataInnerRole getRole() {
    return role;
  }

  public void setRole(@javax.annotation.Nullable GetHrisPositions200ResponseDataInnerRole role) {
    this.role = role;
  }


  public GetHrisPositions200ResponseDataInner team(@javax.annotation.Nullable GetHrisPositions200ResponseDataInnerTeam team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @javax.annotation.Nullable
  public GetHrisPositions200ResponseDataInnerTeam getTeam() {
    return team;
  }

  public void setTeam(@javax.annotation.Nullable GetHrisPositions200ResponseDataInnerTeam team) {
    this.team = team;
  }


  public GetHrisPositions200ResponseDataInner isSupportive(@javax.annotation.Nullable Boolean isSupportive) {
    this.isSupportive = isSupportive;
    return this;
  }

  /**
   * Is Supportive Position
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
    GetHrisPositions200ResponseDataInner getHrisPositions200ResponseDataInner = (GetHrisPositions200ResponseDataInner) o;
    return Objects.equals(this.id, getHrisPositions200ResponseDataInner.id) &&
        Objects.equals(this.role, getHrisPositions200ResponseDataInner.role) &&
        Objects.equals(this.team, getHrisPositions200ResponseDataInner.team) &&
        Objects.equals(this.isSupportive, getHrisPositions200ResponseDataInner.isSupportive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, team, isSupportive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHrisPositions200ResponseDataInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetHrisPositions200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetHrisPositions200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetHrisPositions200ResponseDataInner is not found in the empty JSON string", GetHrisPositions200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetHrisPositions200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetHrisPositions200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `role`
      if (jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) {
        GetHrisPositions200ResponseDataInnerRole.validateJsonElement(jsonObj.get("role"));
      }
      // validate the optional field `team`
      if (jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) {
        GetHrisPositions200ResponseDataInnerTeam.validateJsonElement(jsonObj.get("team"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetHrisPositions200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetHrisPositions200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetHrisPositions200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetHrisPositions200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetHrisPositions200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetHrisPositions200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetHrisPositions200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetHrisPositions200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetHrisPositions200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetHrisPositions200ResponseDataInner
   */
  public static GetHrisPositions200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetHrisPositions200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetHrisPositions200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

