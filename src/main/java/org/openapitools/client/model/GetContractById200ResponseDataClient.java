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
import org.openapitools.client.model.GetContractById200ResponseDataClientId;
import org.openapitools.client.model.GetContractById200ResponseDataClientTeam;
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
 * GetContractById200ResponseDataClient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class GetContractById200ResponseDataClient {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private GetContractById200ResponseDataClientId id;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private GetContractById200ResponseDataClientTeam team;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public GetContractById200ResponseDataClient() {
  }

  public GetContractById200ResponseDataClient id(GetContractById200ResponseDataClientId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public GetContractById200ResponseDataClientId getId() {
    return id;
  }

  public void setId(GetContractById200ResponseDataClientId id) {
    this.id = id;
  }


  public GetContractById200ResponseDataClient team(GetContractById200ResponseDataClientTeam team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @javax.annotation.Nonnull
  public GetContractById200ResponseDataClientTeam getTeam() {
    return team;
  }

  public void setTeam(GetContractById200ResponseDataClientTeam team) {
    this.team = team;
  }


  public GetContractById200ResponseDataClient email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User&#39;s email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public GetContractById200ResponseDataClient fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name of the client.
   * @return fullName
   */
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractById200ResponseDataClient getContractById200ResponseDataClient = (GetContractById200ResponseDataClient) o;
    return Objects.equals(this.id, getContractById200ResponseDataClient.id) &&
        Objects.equals(this.team, getContractById200ResponseDataClient.team) &&
        Objects.equals(this.email, getContractById200ResponseDataClient.email) &&
        Objects.equals(this.fullName, getContractById200ResponseDataClient.fullName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, team, email, fullName);
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
    sb.append("class GetContractById200ResponseDataClient {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
    openapiFields.add("team");
    openapiFields.add("email");
    openapiFields.add("full_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("team");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractById200ResponseDataClient
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractById200ResponseDataClient.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractById200ResponseDataClient is not found in the empty JSON string", GetContractById200ResponseDataClient.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractById200ResponseDataClient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractById200ResponseDataClient` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetContractById200ResponseDataClient.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        GetContractById200ResponseDataClientId.validateJsonElement(jsonObj.get("id"));
      }
      // validate the required field `team`
      GetContractById200ResponseDataClientTeam.validateJsonElement(jsonObj.get("team"));
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractById200ResponseDataClient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractById200ResponseDataClient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractById200ResponseDataClient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractById200ResponseDataClient.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractById200ResponseDataClient>() {
           @Override
           public void write(JsonWriter out, GetContractById200ResponseDataClient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractById200ResponseDataClient read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractById200ResponseDataClient given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractById200ResponseDataClient
   * @throws IOException if the JSON string is invalid with respect to GetContractById200ResponseDataClient
   */
  public static GetContractById200ResponseDataClient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractById200ResponseDataClient.class);
  }

  /**
   * Convert an instance of GetContractById200ResponseDataClient to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
