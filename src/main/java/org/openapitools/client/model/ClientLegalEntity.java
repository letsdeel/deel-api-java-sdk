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
import org.openapitools.client.model.LegalEntityType;

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
 * ClientLegalEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:05:54.444639311Z[GMT]", comments = "Generator version: 7.10.0")
public class ClientLegalEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private LegalEntityType type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  @javax.annotation.Nonnull
  private String subtype;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registration_number";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  @javax.annotation.Nonnull
  private String registrationNumber;

  public static final String SERIALIZED_NAME_VAT_NUMBER = "vat_number";
  @SerializedName(SERIALIZED_NAME_VAT_NUMBER)
  @javax.annotation.Nonnull
  private String vatNumber;

  public ClientLegalEntity() {
  }

  public ClientLegalEntity id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public ClientLegalEntity name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public ClientLegalEntity email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * User&#39;s email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public ClientLegalEntity type(@javax.annotation.Nonnull LegalEntityType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public LegalEntityType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull LegalEntityType type) {
    this.type = type;
  }


  public ClientLegalEntity subtype(@javax.annotation.Nonnull String subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * Get subtype
   * @return subtype
   */
  @javax.annotation.Nonnull
  public String getSubtype() {
    return subtype;
  }

  public void setSubtype(@javax.annotation.Nonnull String subtype) {
    this.subtype = subtype;
  }


  public ClientLegalEntity registrationNumber(@javax.annotation.Nonnull String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * Get registrationNumber
   * @return registrationNumber
   */
  @javax.annotation.Nonnull
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(@javax.annotation.Nonnull String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }


  public ClientLegalEntity vatNumber(@javax.annotation.Nonnull String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

  /**
   * Get vatNumber
   * @return vatNumber
   */
  @javax.annotation.Nonnull
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(@javax.annotation.Nonnull String vatNumber) {
    this.vatNumber = vatNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientLegalEntity clientLegalEntity = (ClientLegalEntity) o;
    return Objects.equals(this.id, clientLegalEntity.id) &&
        Objects.equals(this.name, clientLegalEntity.name) &&
        Objects.equals(this.email, clientLegalEntity.email) &&
        Objects.equals(this.type, clientLegalEntity.type) &&
        Objects.equals(this.subtype, clientLegalEntity.subtype) &&
        Objects.equals(this.registrationNumber, clientLegalEntity.registrationNumber) &&
        Objects.equals(this.vatNumber, clientLegalEntity.vatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, type, subtype, registrationNumber, vatNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientLegalEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("type");
    openapiFields.add("subtype");
    openapiFields.add("registration_number");
    openapiFields.add("vat_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("subtype");
    openapiRequiredFields.add("registration_number");
    openapiRequiredFields.add("vat_number");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ClientLegalEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClientLegalEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientLegalEntity is not found in the empty JSON string", ClientLegalEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClientLegalEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientLegalEntity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClientLegalEntity.openapiRequiredFields) {
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
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the required field `type`
      LegalEntityType.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtype").toString()));
      }
      if (!jsonObj.get("registration_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_number").toString()));
      }
      if (!jsonObj.get("vat_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vat_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vat_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientLegalEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientLegalEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientLegalEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientLegalEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientLegalEntity>() {
           @Override
           public void write(JsonWriter out, ClientLegalEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientLegalEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ClientLegalEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ClientLegalEntity
   * @throws IOException if the JSON string is invalid with respect to ClientLegalEntity
   */
  public static ClientLegalEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientLegalEntity.class);
  }

  /**
   * Convert an instance of ClientLegalEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

