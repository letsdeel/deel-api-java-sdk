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
 * OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:45:23.308834949Z[GMT]", comments = "Generator version: 7.10.0")
public class OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile {
  public static final String SERIALIZED_NAME_OID = "oid";
  @SerializedName(SERIALIZED_NAME_OID)
  @javax.annotation.Nullable
  private String oid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  @javax.annotation.Nullable
  private String workEmail;

  public OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile() {
  }

  public OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile oid(@javax.annotation.Nullable String oid) {
    this.oid = oid;
    return this;
  }

  /**
   * HRIS Profile OID
   * @return oid
   */
  @javax.annotation.Nullable
  public String getOid() {
    return oid;
  }

  public void setOid(@javax.annotation.Nullable String oid) {
    this.oid = oid;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * HRIS Profile name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the HRIS profile
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile workEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
    return this;
  }

  /**
   * Work email of the HRIS profile
   * @return workEmail
   */
  @javax.annotation.Nullable
  public String getWorkEmail() {
    return workEmail;
  }

  public void setWorkEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile onboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile = (OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile) o;
    return Objects.equals(this.oid, onboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.oid) &&
        Objects.equals(this.name, onboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.name) &&
        Objects.equals(this.email, onboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.email) &&
        Objects.equals(this.workEmail, onboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.workEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, name, email, workEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
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
    openapiFields.add("oid");
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("work_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile is not found in the empty JSON string", OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("oid") != null && !jsonObj.get("oid").isJsonNull()) && !jsonObj.get("oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("work_email") != null && !jsonObj.get("work_email").isJsonNull()) && !jsonObj.get("work_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile>() {
           @Override
           public void write(JsonWriter out, OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile
   * @throws IOException if the JSON string is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile
   */
  public static OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile.class);
  }

  /**
   * Convert an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataHrisProfile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

