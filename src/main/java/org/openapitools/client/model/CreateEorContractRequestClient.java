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
import org.openapitools.client.model.CreateEorContractRequestClientLegalEntity;
import org.openapitools.client.model.CreateEorContractRequestClientTeam;

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
 * CreateEorContractRequestClient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T12:32:05.400762149Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateEorContractRequestClient {
  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  @javax.annotation.Nonnull
  private CreateEorContractRequestClientTeam team;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY = "legal_entity";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY)
  @javax.annotation.Nullable
  private CreateEorContractRequestClientLegalEntity legalEntity;

  public CreateEorContractRequestClient() {
  }

  public CreateEorContractRequestClient team(@javax.annotation.Nonnull CreateEorContractRequestClientTeam team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @javax.annotation.Nonnull
  public CreateEorContractRequestClientTeam getTeam() {
    return team;
  }

  public void setTeam(@javax.annotation.Nonnull CreateEorContractRequestClientTeam team) {
    this.team = team;
  }


  public CreateEorContractRequestClient legalEntity(@javax.annotation.Nullable CreateEorContractRequestClientLegalEntity legalEntity) {
    this.legalEntity = legalEntity;
    return this;
  }

  /**
   * Get legalEntity
   * @return legalEntity
   */
  @javax.annotation.Nullable
  public CreateEorContractRequestClientLegalEntity getLegalEntity() {
    return legalEntity;
  }

  public void setLegalEntity(@javax.annotation.Nullable CreateEorContractRequestClientLegalEntity legalEntity) {
    this.legalEntity = legalEntity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEorContractRequestClient createEorContractRequestClient = (CreateEorContractRequestClient) o;
    return Objects.equals(this.team, createEorContractRequestClient.team) &&
        Objects.equals(this.legalEntity, createEorContractRequestClient.legalEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(team, legalEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEorContractRequestClient {\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
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
    openapiFields.add("team");
    openapiFields.add("legal_entity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("team");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEorContractRequestClient
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEorContractRequestClient.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEorContractRequestClient is not found in the empty JSON string", CreateEorContractRequestClient.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEorContractRequestClient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEorContractRequestClient` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEorContractRequestClient.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `team`
      CreateEorContractRequestClientTeam.validateJsonElement(jsonObj.get("team"));
      // validate the optional field `legal_entity`
      if (jsonObj.get("legal_entity") != null && !jsonObj.get("legal_entity").isJsonNull()) {
        CreateEorContractRequestClientLegalEntity.validateJsonElement(jsonObj.get("legal_entity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEorContractRequestClient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEorContractRequestClient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEorContractRequestClient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEorContractRequestClient.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEorContractRequestClient>() {
           @Override
           public void write(JsonWriter out, CreateEorContractRequestClient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEorContractRequestClient read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEorContractRequestClient given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEorContractRequestClient
   * @throws IOException if the JSON string is invalid with respect to CreateEorContractRequestClient
   */
  public static CreateEorContractRequestClient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEorContractRequestClient.class);
  }

  /**
   * Convert an instance of CreateEorContractRequestClient to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

