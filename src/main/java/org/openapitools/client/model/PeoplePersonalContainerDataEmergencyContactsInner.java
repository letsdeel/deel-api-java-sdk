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
import java.util.UUID;
import org.openapitools.client.model.PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage;

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
 * PeoplePersonalContainerDataEmergencyContactsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:16:06.545846627Z[GMT]", comments = "Generator version: 7.10.0")
public class PeoplePersonalContainerDataEmergencyContactsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_RELATIONSHIP = "relationship";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP)
  @javax.annotation.Nonnull
  private String relationship;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nonnull
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nonnull
  private String email;

  public static final String SERIALIZED_NAME_PREFERRED_LANGUAGE = "preferred_language";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LANGUAGE)
  @javax.annotation.Nullable
  private PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage preferredLanguage;

  public PeoplePersonalContainerDataEmergencyContactsInner() {
  }

  public PeoplePersonalContainerDataEmergencyContactsInner id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the emergency contact.
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public PeoplePersonalContainerDataEmergencyContactsInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the emergency contact.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public PeoplePersonalContainerDataEmergencyContactsInner relationship(@javax.annotation.Nonnull String relationship) {
    this.relationship = relationship;
    return this;
  }

  /**
   * The type of relationship between the owner and the emergency contact.
   * @return relationship
   */
  @javax.annotation.Nonnull
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(@javax.annotation.Nonnull String relationship) {
    this.relationship = relationship;
  }


  public PeoplePersonalContainerDataEmergencyContactsInner phone(@javax.annotation.Nonnull String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * The phone number of the emergency contact.
   * @return phone
   */
  @javax.annotation.Nonnull
  public String getPhone() {
    return phone;
  }

  public void setPhone(@javax.annotation.Nonnull String phone) {
    this.phone = phone;
  }


  public PeoplePersonalContainerDataEmergencyContactsInner email(@javax.annotation.Nonnull String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the emergency contact.
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nonnull String email) {
    this.email = email;
  }


  public PeoplePersonalContainerDataEmergencyContactsInner preferredLanguage(@javax.annotation.Nullable PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
    return this;
  }

  /**
   * Get preferredLanguage
   * @return preferredLanguage
   */
  @javax.annotation.Nullable
  public PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage getPreferredLanguage() {
    return preferredLanguage;
  }

  public void setPreferredLanguage(@javax.annotation.Nullable PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeoplePersonalContainerDataEmergencyContactsInner peoplePersonalContainerDataEmergencyContactsInner = (PeoplePersonalContainerDataEmergencyContactsInner) o;
    return Objects.equals(this.id, peoplePersonalContainerDataEmergencyContactsInner.id) &&
        Objects.equals(this.name, peoplePersonalContainerDataEmergencyContactsInner.name) &&
        Objects.equals(this.relationship, peoplePersonalContainerDataEmergencyContactsInner.relationship) &&
        Objects.equals(this.phone, peoplePersonalContainerDataEmergencyContactsInner.phone) &&
        Objects.equals(this.email, peoplePersonalContainerDataEmergencyContactsInner.email) &&
        Objects.equals(this.preferredLanguage, peoplePersonalContainerDataEmergencyContactsInner.preferredLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, relationship, phone, email, preferredLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeoplePersonalContainerDataEmergencyContactsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
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
    openapiFields.add("relationship");
    openapiFields.add("phone");
    openapiFields.add("email");
    openapiFields.add("preferred_language");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("relationship");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("preferred_language");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PeoplePersonalContainerDataEmergencyContactsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PeoplePersonalContainerDataEmergencyContactsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeoplePersonalContainerDataEmergencyContactsInner is not found in the empty JSON string", PeoplePersonalContainerDataEmergencyContactsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PeoplePersonalContainerDataEmergencyContactsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PeoplePersonalContainerDataEmergencyContactsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PeoplePersonalContainerDataEmergencyContactsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("relationship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relationship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relationship").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the required field `preferred_language`
      PeoplePersonalContainerDataEmergencyContactsInnerPreferredLanguage.validateJsonElement(jsonObj.get("preferred_language"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeoplePersonalContainerDataEmergencyContactsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeoplePersonalContainerDataEmergencyContactsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeoplePersonalContainerDataEmergencyContactsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeoplePersonalContainerDataEmergencyContactsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PeoplePersonalContainerDataEmergencyContactsInner>() {
           @Override
           public void write(JsonWriter out, PeoplePersonalContainerDataEmergencyContactsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PeoplePersonalContainerDataEmergencyContactsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PeoplePersonalContainerDataEmergencyContactsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PeoplePersonalContainerDataEmergencyContactsInner
   * @throws IOException if the JSON string is invalid with respect to PeoplePersonalContainerDataEmergencyContactsInner
   */
  public static PeoplePersonalContainerDataEmergencyContactsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeoplePersonalContainerDataEmergencyContactsInner.class);
  }

  /**
   * Convert an instance of PeoplePersonalContainerDataEmergencyContactsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

