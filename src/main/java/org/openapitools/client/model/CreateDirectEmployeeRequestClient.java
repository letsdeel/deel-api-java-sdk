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
import org.openapitools.client.model.CreateDirectEmployeeRequestClientDepartment;
import org.openapitools.client.model.CreateDirectEmployeeRequestClientTeam;

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
 * The entity that is hiring the employee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateDirectEmployeeRequestClient {
  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestClientTeam team;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  @javax.annotation.Nullable
  private CreateDirectEmployeeRequestClientDepartment department;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY = "legal_entity";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestClientDepartment legalEntity;

  public CreateDirectEmployeeRequestClient() {
  }

  public CreateDirectEmployeeRequestClient team(@javax.annotation.Nonnull CreateDirectEmployeeRequestClientTeam team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestClientTeam getTeam() {
    return team;
  }

  public void setTeam(@javax.annotation.Nonnull CreateDirectEmployeeRequestClientTeam team) {
    this.team = team;
  }


  public CreateDirectEmployeeRequestClient department(@javax.annotation.Nullable CreateDirectEmployeeRequestClientDepartment department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
   */
  @javax.annotation.Nullable
  public CreateDirectEmployeeRequestClientDepartment getDepartment() {
    return department;
  }

  public void setDepartment(@javax.annotation.Nullable CreateDirectEmployeeRequestClientDepartment department) {
    this.department = department;
  }


  public CreateDirectEmployeeRequestClient legalEntity(@javax.annotation.Nonnull CreateDirectEmployeeRequestClientDepartment legalEntity) {
    this.legalEntity = legalEntity;
    return this;
  }

  /**
   * Get legalEntity
   * @return legalEntity
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestClientDepartment getLegalEntity() {
    return legalEntity;
  }

  public void setLegalEntity(@javax.annotation.Nonnull CreateDirectEmployeeRequestClientDepartment legalEntity) {
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
    CreateDirectEmployeeRequestClient createDirectEmployeeRequestClient = (CreateDirectEmployeeRequestClient) o;
    return Objects.equals(this.team, createDirectEmployeeRequestClient.team) &&
        Objects.equals(this.department, createDirectEmployeeRequestClient.department) &&
        Objects.equals(this.legalEntity, createDirectEmployeeRequestClient.legalEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(team, department, legalEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDirectEmployeeRequestClient {\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
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
    openapiFields.add("department");
    openapiFields.add("legal_entity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("team");
    openapiRequiredFields.add("legal_entity");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateDirectEmployeeRequestClient
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDirectEmployeeRequestClient.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDirectEmployeeRequestClient is not found in the empty JSON string", CreateDirectEmployeeRequestClient.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDirectEmployeeRequestClient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDirectEmployeeRequestClient` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDirectEmployeeRequestClient.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `team`
      CreateDirectEmployeeRequestClientTeam.validateJsonElement(jsonObj.get("team"));
      // validate the optional field `department`
      if (jsonObj.get("department") != null && !jsonObj.get("department").isJsonNull()) {
        CreateDirectEmployeeRequestClientDepartment.validateJsonElement(jsonObj.get("department"));
      }
      // validate the required field `legal_entity`
      CreateDirectEmployeeRequestClientDepartment.validateJsonElement(jsonObj.get("legal_entity"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDirectEmployeeRequestClient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDirectEmployeeRequestClient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDirectEmployeeRequestClient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDirectEmployeeRequestClient.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDirectEmployeeRequestClient>() {
           @Override
           public void write(JsonWriter out, CreateDirectEmployeeRequestClient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDirectEmployeeRequestClient read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateDirectEmployeeRequestClient given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateDirectEmployeeRequestClient
   * @throws IOException if the JSON string is invalid with respect to CreateDirectEmployeeRequestClient
   */
  public static CreateDirectEmployeeRequestClient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDirectEmployeeRequestClient.class);
  }

  /**
   * Convert an instance of CreateDirectEmployeeRequestClient to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

