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
import org.openapitools.client.model.GetProfileEntitlements200ResponseEntitlementsInner;

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
 * GetProfileEntitlements200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:03:48.437639881Z[GMT]", comments = "Generator version: 7.10.0")
public class GetProfileEntitlements200Response {
  public static final String SERIALIZED_NAME_ENTITLEMENTS = "entitlements";
  @SerializedName(SERIALIZED_NAME_ENTITLEMENTS)
  @javax.annotation.Nonnull
  private List<GetProfileEntitlements200ResponseEntitlementsInner> entitlements = new ArrayList<>();

  public static final String SERIALIZED_NAME_HRIS_PROFILE_ID = "hris_profile_id";
  @SerializedName(SERIALIZED_NAME_HRIS_PROFILE_ID)
  @javax.annotation.Nonnull
  private String hrisProfileId;

  public GetProfileEntitlements200Response() {
  }

  public GetProfileEntitlements200Response entitlements(@javax.annotation.Nonnull List<GetProfileEntitlements200ResponseEntitlementsInner> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public GetProfileEntitlements200Response addEntitlementsItem(GetProfileEntitlements200ResponseEntitlementsInner entitlementsItem) {
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
  @javax.annotation.Nonnull
  public List<GetProfileEntitlements200ResponseEntitlementsInner> getEntitlements() {
    return entitlements;
  }

  public void setEntitlements(@javax.annotation.Nonnull List<GetProfileEntitlements200ResponseEntitlementsInner> entitlements) {
    this.entitlements = entitlements;
  }


  public GetProfileEntitlements200Response hrisProfileId(@javax.annotation.Nonnull String hrisProfileId) {
    this.hrisProfileId = hrisProfileId;
    return this;
  }

  /**
   * HRIS profile ID
   * @return hrisProfileId
   */
  @javax.annotation.Nonnull
  public String getHrisProfileId() {
    return hrisProfileId;
  }

  public void setHrisProfileId(@javax.annotation.Nonnull String hrisProfileId) {
    this.hrisProfileId = hrisProfileId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProfileEntitlements200Response getProfileEntitlements200Response = (GetProfileEntitlements200Response) o;
    return Objects.equals(this.entitlements, getProfileEntitlements200Response.entitlements) &&
        Objects.equals(this.hrisProfileId, getProfileEntitlements200Response.hrisProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlements, hrisProfileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfileEntitlements200Response {\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
    sb.append("    hrisProfileId: ").append(toIndentedString(hrisProfileId)).append("\n");
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
    openapiFields.add("entitlements");
    openapiFields.add("hris_profile_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entitlements");
    openapiRequiredFields.add("hris_profile_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetProfileEntitlements200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetProfileEntitlements200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProfileEntitlements200Response is not found in the empty JSON string", GetProfileEntitlements200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetProfileEntitlements200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetProfileEntitlements200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetProfileEntitlements200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("entitlements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entitlements` to be an array in the JSON string but got `%s`", jsonObj.get("entitlements").toString()));
      }

      JsonArray jsonArrayentitlements = jsonObj.getAsJsonArray("entitlements");
      // validate the required field `entitlements` (array)
      for (int i = 0; i < jsonArrayentitlements.size(); i++) {
        GetProfileEntitlements200ResponseEntitlementsInner.validateJsonElement(jsonArrayentitlements.get(i));
      };
      if (!jsonObj.get("hris_profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_profile_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProfileEntitlements200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProfileEntitlements200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProfileEntitlements200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProfileEntitlements200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProfileEntitlements200Response>() {
           @Override
           public void write(JsonWriter out, GetProfileEntitlements200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProfileEntitlements200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetProfileEntitlements200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetProfileEntitlements200Response
   * @throws IOException if the JSON string is invalid with respect to GetProfileEntitlements200Response
   */
  public static GetProfileEntitlements200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProfileEntitlements200Response.class);
  }

  /**
   * Convert an instance of GetProfileEntitlements200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

