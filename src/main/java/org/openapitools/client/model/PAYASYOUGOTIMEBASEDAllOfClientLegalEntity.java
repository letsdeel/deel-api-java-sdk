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
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfClientTeamId;

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
 * Choose the Deel legal entity for this contract. Use legal entity endpoint to retrieve a list of legal entities in your organization.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:39:46.997965815Z[GMT]", comments = "Generator version: 7.10.0")
public class PAYASYOUGOTIMEBASEDAllOfClientLegalEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private PAYASYOUGOTIMEBASEDAllOfClientTeamId id;

  public PAYASYOUGOTIMEBASEDAllOfClientLegalEntity() {
  }

  public PAYASYOUGOTIMEBASEDAllOfClientLegalEntity id(@javax.annotation.Nonnull PAYASYOUGOTIMEBASEDAllOfClientTeamId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public PAYASYOUGOTIMEBASEDAllOfClientTeamId getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull PAYASYOUGOTIMEBASEDAllOfClientTeamId id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PAYASYOUGOTIMEBASEDAllOfClientLegalEntity paYASYOUGOTIMEBASEDAllOfClientLegalEntity = (PAYASYOUGOTIMEBASEDAllOfClientLegalEntity) o;
    return Objects.equals(this.id, paYASYOUGOTIMEBASEDAllOfClientLegalEntity.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PAYASYOUGOTIMEBASEDAllOfClientLegalEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PAYASYOUGOTIMEBASEDAllOfClientLegalEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PAYASYOUGOTIMEBASEDAllOfClientLegalEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PAYASYOUGOTIMEBASEDAllOfClientLegalEntity is not found in the empty JSON string", PAYASYOUGOTIMEBASEDAllOfClientLegalEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PAYASYOUGOTIMEBASEDAllOfClientLegalEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PAYASYOUGOTIMEBASEDAllOfClientLegalEntity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PAYASYOUGOTIMEBASEDAllOfClientLegalEntity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      PAYASYOUGOTIMEBASEDAllOfClientTeamId.validateJsonElement(jsonObj.get("id"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PAYASYOUGOTIMEBASEDAllOfClientLegalEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PAYASYOUGOTIMEBASEDAllOfClientLegalEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PAYASYOUGOTIMEBASEDAllOfClientLegalEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PAYASYOUGOTIMEBASEDAllOfClientLegalEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PAYASYOUGOTIMEBASEDAllOfClientLegalEntity>() {
           @Override
           public void write(JsonWriter out, PAYASYOUGOTIMEBASEDAllOfClientLegalEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PAYASYOUGOTIMEBASEDAllOfClientLegalEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PAYASYOUGOTIMEBASEDAllOfClientLegalEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PAYASYOUGOTIMEBASEDAllOfClientLegalEntity
   * @throws IOException if the JSON string is invalid with respect to PAYASYOUGOTIMEBASEDAllOfClientLegalEntity
   */
  public static PAYASYOUGOTIMEBASEDAllOfClientLegalEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PAYASYOUGOTIMEBASEDAllOfClientLegalEntity.class);
  }

  /**
   * Convert an instance of PAYASYOUGOTIMEBASEDAllOfClientLegalEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

