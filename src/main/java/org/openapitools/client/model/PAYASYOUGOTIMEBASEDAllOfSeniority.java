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
 * Job seniority level. Please use the seniority levels endpoint to retrieve the list of seniority levels.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T18:19:15.469015129Z[GMT]", comments = "Generator version: 7.10.0")
public class PAYASYOUGOTIMEBASEDAllOfSeniority {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private PAYASYOUGOTIMEBASEDAllOfClientTeamId id;

  public PAYASYOUGOTIMEBASEDAllOfSeniority() {
  }

  public PAYASYOUGOTIMEBASEDAllOfSeniority id(@javax.annotation.Nullable PAYASYOUGOTIMEBASEDAllOfClientTeamId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public PAYASYOUGOTIMEBASEDAllOfClientTeamId getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable PAYASYOUGOTIMEBASEDAllOfClientTeamId id) {
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
    PAYASYOUGOTIMEBASEDAllOfSeniority paYASYOUGOTIMEBASEDAllOfSeniority = (PAYASYOUGOTIMEBASEDAllOfSeniority) o;
    return Objects.equals(this.id, paYASYOUGOTIMEBASEDAllOfSeniority.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PAYASYOUGOTIMEBASEDAllOfSeniority {\n");
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
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PAYASYOUGOTIMEBASEDAllOfSeniority
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PAYASYOUGOTIMEBASEDAllOfSeniority.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PAYASYOUGOTIMEBASEDAllOfSeniority is not found in the empty JSON string", PAYASYOUGOTIMEBASEDAllOfSeniority.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PAYASYOUGOTIMEBASEDAllOfSeniority.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PAYASYOUGOTIMEBASEDAllOfSeniority` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        PAYASYOUGOTIMEBASEDAllOfClientTeamId.validateJsonElement(jsonObj.get("id"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PAYASYOUGOTIMEBASEDAllOfSeniority.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PAYASYOUGOTIMEBASEDAllOfSeniority' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PAYASYOUGOTIMEBASEDAllOfSeniority> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PAYASYOUGOTIMEBASEDAllOfSeniority.class));

       return (TypeAdapter<T>) new TypeAdapter<PAYASYOUGOTIMEBASEDAllOfSeniority>() {
           @Override
           public void write(JsonWriter out, PAYASYOUGOTIMEBASEDAllOfSeniority value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PAYASYOUGOTIMEBASEDAllOfSeniority read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PAYASYOUGOTIMEBASEDAllOfSeniority given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PAYASYOUGOTIMEBASEDAllOfSeniority
   * @throws IOException if the JSON string is invalid with respect to PAYASYOUGOTIMEBASEDAllOfSeniority
   */
  public static PAYASYOUGOTIMEBASEDAllOfSeniority fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PAYASYOUGOTIMEBASEDAllOfSeniority.class);
  }

  /**
   * Convert an instance of PAYASYOUGOTIMEBASEDAllOfSeniority to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
