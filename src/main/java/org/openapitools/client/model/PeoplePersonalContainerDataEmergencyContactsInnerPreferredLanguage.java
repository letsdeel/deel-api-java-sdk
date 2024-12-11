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
import java.math.BigDecimal;
import java.util.Arrays;

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
 * The preferred language in which the emergency contact should be contacted.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T20:12:16.895242729Z[GMT]", comments = "Generator version: 7.10.0")
public class PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private BigDecimal id;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  @javax.annotation.Nonnull
  private String language;

  public PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage() {
  }

  public PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage id(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the preferred language.
   * @return id
   */
  @javax.annotation.Nonnull
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
  }


  public PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage language(@javax.annotation.Nonnull String language) {
    this.language = language;
    return this;
  }

  /**
   * The name of the language.
   * @return language
   */
  @javax.annotation.Nonnull
  public String getLanguage() {
    return language;
  }

  public void setLanguage(@javax.annotation.Nonnull String language) {
    this.language = language;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage peoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage = (PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage) o;
    return Objects.equals(this.id, peoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage.id) &&
        Objects.equals(this.language, peoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
    openapiFields.add("language");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("language");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage is not found in the empty JSON string", PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage.class));

       return (TypeAdapter<T>) new TypeAdapter<PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage>() {
           @Override
           public void write(JsonWriter out, PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage
   * @throws IOException if the JSON string is invalid with respect to PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage
   */
  public static PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage.class);
  }

  /**
   * Convert an instance of PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

