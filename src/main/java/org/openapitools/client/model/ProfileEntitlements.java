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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Entitlements;

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
 * ProfileEntitlements
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:44:17.413238492Z[GMT]", comments = "Generator version: 7.10.0")
public class ProfileEntitlements {
  public static final String SERIALIZED_NAME_HRIS_PROFILE_ID = "hris_profile_id";
  @SerializedName(SERIALIZED_NAME_HRIS_PROFILE_ID)
  @javax.annotation.Nullable
  private String hrisProfileId;

  public static final String SERIALIZED_NAME_ENTITLEMENTS = "entitlements";
  @SerializedName(SERIALIZED_NAME_ENTITLEMENTS)
  @javax.annotation.Nullable
  private List<Entitlements> entitlements = new ArrayList<>();

  public ProfileEntitlements() {
  }

  public ProfileEntitlements hrisProfileId(@javax.annotation.Nullable String hrisProfileId) {
    this.hrisProfileId = hrisProfileId;
    return this;
  }

  /**
   * Get hrisProfileId
   * @return hrisProfileId
   */
  @javax.annotation.Nullable
  public String getHrisProfileId() {
    return hrisProfileId;
  }

  public void setHrisProfileId(@javax.annotation.Nullable String hrisProfileId) {
    this.hrisProfileId = hrisProfileId;
  }


  public ProfileEntitlements entitlements(@javax.annotation.Nullable List<Entitlements> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public ProfileEntitlements addEntitlementsItem(Entitlements entitlementsItem) {
    if (this.entitlements == null) {
      this.entitlements = new ArrayList<>();
    }
    this.entitlements.add(entitlementsItem);
    return this;
  }

  /**
   * Get entitlements
   * @return entitlements
   */
  @javax.annotation.Nullable
  public List<Entitlements> getEntitlements() {
    return entitlements;
  }

  public void setEntitlements(@javax.annotation.Nullable List<Entitlements> entitlements) {
    this.entitlements = entitlements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileEntitlements profileEntitlements = (ProfileEntitlements) o;
    return Objects.equals(this.hrisProfileId, profileEntitlements.hrisProfileId) &&
        Objects.equals(this.entitlements, profileEntitlements.entitlements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hrisProfileId, entitlements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileEntitlements {\n");
    sb.append("    hrisProfileId: ").append(toIndentedString(hrisProfileId)).append("\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
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
    openapiFields.add("hris_profile_id");
    openapiFields.add("entitlements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProfileEntitlements
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProfileEntitlements.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProfileEntitlements is not found in the empty JSON string", ProfileEntitlements.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProfileEntitlements.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProfileEntitlements` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hris_profile_id") != null && !jsonObj.get("hris_profile_id").isJsonNull()) && !jsonObj.get("hris_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_profile_id").toString()));
      }
      if (jsonObj.get("entitlements") != null && !jsonObj.get("entitlements").isJsonNull()) {
        JsonArray jsonArrayentitlements = jsonObj.getAsJsonArray("entitlements");
        if (jsonArrayentitlements != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entitlements").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entitlements` to be an array in the JSON string but got `%s`", jsonObj.get("entitlements").toString()));
          }

          // validate the optional field `entitlements` (array)
          for (int i = 0; i < jsonArrayentitlements.size(); i++) {
            Entitlements.validateJsonElement(jsonArrayentitlements.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProfileEntitlements.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProfileEntitlements' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProfileEntitlements> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProfileEntitlements.class));

       return (TypeAdapter<T>) new TypeAdapter<ProfileEntitlements>() {
           @Override
           public void write(JsonWriter out, ProfileEntitlements value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProfileEntitlements read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProfileEntitlements given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProfileEntitlements
   * @throws IOException if the JSON string is invalid with respect to ProfileEntitlements
   */
  public static ProfileEntitlements fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProfileEntitlements.class);
  }

  /**
   * Convert an instance of ProfileEntitlements to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

