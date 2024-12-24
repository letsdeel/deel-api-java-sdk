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
import java.time.OffsetDateTime;
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
 * OnboardingTrackerHrisProfileOidGet200ResponseDataProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:40:51.396070831Z[GMT]", comments = "Generator version: 7.10.0")
public class OnboardingTrackerHrisProfileOidGet200ResponseDataProfile {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "last_login";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  @javax.annotation.Nullable
  private OffsetDateTime lastLogin;

  public static final String SERIALIZED_NAME_PREVIOUSLY_ONBOARDED = "previously_onboarded";
  @SerializedName(SERIALIZED_NAME_PREVIOUSLY_ONBOARDED)
  @javax.annotation.Nullable
  private Boolean previouslyOnboarded;

  public OnboardingTrackerHrisProfileOidGet200ResponseDataProfile() {
  }

  public OnboardingTrackerHrisProfileOidGet200ResponseDataProfile name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name associated with the profile
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataProfile email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the profile
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataProfile country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataProfile lastLogin(@javax.annotation.Nullable OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Last login timestamp
   * @return lastLogin
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(@javax.annotation.Nullable OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }


  public OnboardingTrackerHrisProfileOidGet200ResponseDataProfile previouslyOnboarded(@javax.annotation.Nullable Boolean previouslyOnboarded) {
    this.previouslyOnboarded = previouslyOnboarded;
    return this;
  }

  /**
   * Indicates if the contractor has previously onboarded
   * @return previouslyOnboarded
   */
  @javax.annotation.Nullable
  public Boolean getPreviouslyOnboarded() {
    return previouslyOnboarded;
  }

  public void setPreviouslyOnboarded(@javax.annotation.Nullable Boolean previouslyOnboarded) {
    this.previouslyOnboarded = previouslyOnboarded;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingTrackerHrisProfileOidGet200ResponseDataProfile onboardingTrackerHrisProfileOidGet200ResponseDataProfile = (OnboardingTrackerHrisProfileOidGet200ResponseDataProfile) o;
    return Objects.equals(this.name, onboardingTrackerHrisProfileOidGet200ResponseDataProfile.name) &&
        Objects.equals(this.email, onboardingTrackerHrisProfileOidGet200ResponseDataProfile.email) &&
        Objects.equals(this.country, onboardingTrackerHrisProfileOidGet200ResponseDataProfile.country) &&
        Objects.equals(this.lastLogin, onboardingTrackerHrisProfileOidGet200ResponseDataProfile.lastLogin) &&
        Objects.equals(this.previouslyOnboarded, onboardingTrackerHrisProfileOidGet200ResponseDataProfile.previouslyOnboarded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, country, lastLogin, previouslyOnboarded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingTrackerHrisProfileOidGet200ResponseDataProfile {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    previouslyOnboarded: ").append(toIndentedString(previouslyOnboarded)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("country");
    openapiFields.add("last_login");
    openapiFields.add("previously_onboarded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataProfile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingTrackerHrisProfileOidGet200ResponseDataProfile is not found in the empty JSON string", OnboardingTrackerHrisProfileOidGet200ResponseDataProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnboardingTrackerHrisProfileOidGet200ResponseDataProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingTrackerHrisProfileOidGet200ResponseDataProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingTrackerHrisProfileOidGet200ResponseDataProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingTrackerHrisProfileOidGet200ResponseDataProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataProfile>() {
           @Override
           public void write(JsonWriter out, OnboardingTrackerHrisProfileOidGet200ResponseDataProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardingTrackerHrisProfileOidGet200ResponseDataProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataProfile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnboardingTrackerHrisProfileOidGet200ResponseDataProfile
   * @throws IOException if the JSON string is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataProfile
   */
  public static OnboardingTrackerHrisProfileOidGet200ResponseDataProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingTrackerHrisProfileOidGet200ResponseDataProfile.class);
  }

  /**
   * Convert an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataProfile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

