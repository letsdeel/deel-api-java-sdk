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
 * Worker&#39;s job title. You can enter a custom job title or use a pre-defiled job title using the Id retrieved in job-titles endpoint.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class PAYASYOUGOTIMEBASEDAllOfJobTitle {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private PAYASYOUGOTIMEBASEDAllOfClientTeamId id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public PAYASYOUGOTIMEBASEDAllOfJobTitle() {
  }

  public PAYASYOUGOTIMEBASEDAllOfJobTitle id(@javax.annotation.Nullable PAYASYOUGOTIMEBASEDAllOfClientTeamId id) {
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


  public PAYASYOUGOTIMEBASEDAllOfJobTitle name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Job title. Please leave it blank when entering an Id.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PAYASYOUGOTIMEBASEDAllOfJobTitle paYASYOUGOTIMEBASEDAllOfJobTitle = (PAYASYOUGOTIMEBASEDAllOfJobTitle) o;
    return Objects.equals(this.id, paYASYOUGOTIMEBASEDAllOfJobTitle.id) &&
        Objects.equals(this.name, paYASYOUGOTIMEBASEDAllOfJobTitle.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
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
    sb.append("class PAYASYOUGOTIMEBASEDAllOfJobTitle {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PAYASYOUGOTIMEBASEDAllOfJobTitle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PAYASYOUGOTIMEBASEDAllOfJobTitle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PAYASYOUGOTIMEBASEDAllOfJobTitle is not found in the empty JSON string", PAYASYOUGOTIMEBASEDAllOfJobTitle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PAYASYOUGOTIMEBASEDAllOfJobTitle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PAYASYOUGOTIMEBASEDAllOfJobTitle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        PAYASYOUGOTIMEBASEDAllOfClientTeamId.validateJsonElement(jsonObj.get("id"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PAYASYOUGOTIMEBASEDAllOfJobTitle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PAYASYOUGOTIMEBASEDAllOfJobTitle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PAYASYOUGOTIMEBASEDAllOfJobTitle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PAYASYOUGOTIMEBASEDAllOfJobTitle.class));

       return (TypeAdapter<T>) new TypeAdapter<PAYASYOUGOTIMEBASEDAllOfJobTitle>() {
           @Override
           public void write(JsonWriter out, PAYASYOUGOTIMEBASEDAllOfJobTitle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PAYASYOUGOTIMEBASEDAllOfJobTitle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PAYASYOUGOTIMEBASEDAllOfJobTitle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PAYASYOUGOTIMEBASEDAllOfJobTitle
   * @throws IOException if the JSON string is invalid with respect to PAYASYOUGOTIMEBASEDAllOfJobTitle
   */
  public static PAYASYOUGOTIMEBASEDAllOfJobTitle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PAYASYOUGOTIMEBASEDAllOfJobTitle.class);
  }

  /**
   * Convert an instance of PAYASYOUGOTIMEBASEDAllOfJobTitle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

