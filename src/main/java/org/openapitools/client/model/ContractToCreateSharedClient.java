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
import org.openapitools.client.model.ContractToCreateSharedClientLegalEntity;
import org.openapitools.client.model.ContractToCreateSharedClientTeam;

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
 * ContractToCreateSharedClient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractToCreateSharedClient {
  public static final String SERIALIZED_NAME_LEGAL_ENTITY = "legal_entity";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY)
  @javax.annotation.Nonnull
  private ContractToCreateSharedClientLegalEntity legalEntity;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  @javax.annotation.Nonnull
  private ContractToCreateSharedClientTeam team;

  public ContractToCreateSharedClient() {
  }

  public ContractToCreateSharedClient legalEntity(@javax.annotation.Nonnull ContractToCreateSharedClientLegalEntity legalEntity) {
    this.legalEntity = legalEntity;
    return this;
  }

  /**
   * Get legalEntity
   * @return legalEntity
   */
  @javax.annotation.Nonnull
  public ContractToCreateSharedClientLegalEntity getLegalEntity() {
    return legalEntity;
  }

  public void setLegalEntity(@javax.annotation.Nonnull ContractToCreateSharedClientLegalEntity legalEntity) {
    this.legalEntity = legalEntity;
  }


  public ContractToCreateSharedClient team(@javax.annotation.Nonnull ContractToCreateSharedClientTeam team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @javax.annotation.Nonnull
  public ContractToCreateSharedClientTeam getTeam() {
    return team;
  }

  public void setTeam(@javax.annotation.Nonnull ContractToCreateSharedClientTeam team) {
    this.team = team;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractToCreateSharedClient contractToCreateSharedClient = (ContractToCreateSharedClient) o;
    return Objects.equals(this.legalEntity, contractToCreateSharedClient.legalEntity) &&
        Objects.equals(this.team, contractToCreateSharedClient.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalEntity, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractToCreateSharedClient {\n");
    sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
    openapiFields.add("legal_entity");
    openapiFields.add("team");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("legal_entity");
    openapiRequiredFields.add("team");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContractToCreateSharedClient
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContractToCreateSharedClient.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContractToCreateSharedClient is not found in the empty JSON string", ContractToCreateSharedClient.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContractToCreateSharedClient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContractToCreateSharedClient` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContractToCreateSharedClient.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `legal_entity`
      ContractToCreateSharedClientLegalEntity.validateJsonElement(jsonObj.get("legal_entity"));
      // validate the required field `team`
      ContractToCreateSharedClientTeam.validateJsonElement(jsonObj.get("team"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContractToCreateSharedClient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContractToCreateSharedClient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContractToCreateSharedClient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreateSharedClient.class));

       return (TypeAdapter<T>) new TypeAdapter<ContractToCreateSharedClient>() {
           @Override
           public void write(JsonWriter out, ContractToCreateSharedClient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContractToCreateSharedClient read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContractToCreateSharedClient given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContractToCreateSharedClient
   * @throws IOException if the JSON string is invalid with respect to ContractToCreateSharedClient
   */
  public static ContractToCreateSharedClient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContractToCreateSharedClient.class);
  }

  /**
   * Convert an instance of ContractToCreateSharedClient to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

