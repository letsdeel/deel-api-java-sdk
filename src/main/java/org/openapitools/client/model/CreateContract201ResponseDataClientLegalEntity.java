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
 * CreateContract201ResponseDataClientLegalEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T20:12:16.895242729Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateContract201ResponseDataClientLegalEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private BigDecimal id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  /**
   * Type of a legal entity
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INDIVIDUAL("individual"),
    
    COMPANY("company");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  @javax.annotation.Nonnull
  private String subtype;

  public static final String SERIALIZED_NAME_VAT_NUMBER = "vat_number";
  @SerializedName(SERIALIZED_NAME_VAT_NUMBER)
  @javax.annotation.Nonnull
  private String vatNumber;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registration_number";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  @javax.annotation.Nonnull
  private String registrationNumber;

  public CreateContract201ResponseDataClientLegalEntity() {
  }

  public CreateContract201ResponseDataClientLegalEntity id(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nonnull
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
  }


  public CreateContract201ResponseDataClientLegalEntity name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of a legal entity
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreateContract201ResponseDataClientLegalEntity type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of a legal entity
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public CreateContract201ResponseDataClientLegalEntity email(@javax.annotation.Nullable String email) {
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


  public CreateContract201ResponseDataClientLegalEntity subtype(@javax.annotation.Nonnull String subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * Subtype of a legal entity
   * @return subtype
   */
  @javax.annotation.Nonnull
  public String getSubtype() {
    return subtype;
  }

  public void setSubtype(@javax.annotation.Nonnull String subtype) {
    this.subtype = subtype;
  }


  public CreateContract201ResponseDataClientLegalEntity vatNumber(@javax.annotation.Nonnull String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

  /**
   * VAT number of a legal entity
   * @return vatNumber
   */
  @javax.annotation.Nonnull
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(@javax.annotation.Nonnull String vatNumber) {
    this.vatNumber = vatNumber;
  }


  public CreateContract201ResponseDataClientLegalEntity registrationNumber(@javax.annotation.Nonnull String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * Registration number of a legal entity
   * @return registrationNumber
   */
  @javax.annotation.Nonnull
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(@javax.annotation.Nonnull String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContract201ResponseDataClientLegalEntity createContract201ResponseDataClientLegalEntity = (CreateContract201ResponseDataClientLegalEntity) o;
    return Objects.equals(this.id, createContract201ResponseDataClientLegalEntity.id) &&
        Objects.equals(this.name, createContract201ResponseDataClientLegalEntity.name) &&
        Objects.equals(this.type, createContract201ResponseDataClientLegalEntity.type) &&
        Objects.equals(this.email, createContract201ResponseDataClientLegalEntity.email) &&
        Objects.equals(this.subtype, createContract201ResponseDataClientLegalEntity.subtype) &&
        Objects.equals(this.vatNumber, createContract201ResponseDataClientLegalEntity.vatNumber) &&
        Objects.equals(this.registrationNumber, createContract201ResponseDataClientLegalEntity.registrationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, email, subtype, vatNumber, registrationNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContract201ResponseDataClientLegalEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("email");
    openapiFields.add("subtype");
    openapiFields.add("vat_number");
    openapiFields.add("registration_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("subtype");
    openapiRequiredFields.add("vat_number");
    openapiRequiredFields.add("registration_number");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateContract201ResponseDataClientLegalEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContract201ResponseDataClientLegalEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContract201ResponseDataClientLegalEntity is not found in the empty JSON string", CreateContract201ResponseDataClientLegalEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContract201ResponseDataClientLegalEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContract201ResponseDataClientLegalEntity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateContract201ResponseDataClientLegalEntity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtype").toString()));
      }
      if (!jsonObj.get("vat_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vat_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vat_number").toString()));
      }
      if (!jsonObj.get("registration_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContract201ResponseDataClientLegalEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContract201ResponseDataClientLegalEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContract201ResponseDataClientLegalEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContract201ResponseDataClientLegalEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContract201ResponseDataClientLegalEntity>() {
           @Override
           public void write(JsonWriter out, CreateContract201ResponseDataClientLegalEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContract201ResponseDataClientLegalEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContract201ResponseDataClientLegalEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContract201ResponseDataClientLegalEntity
   * @throws IOException if the JSON string is invalid with respect to CreateContract201ResponseDataClientLegalEntity
   */
  public static CreateContract201ResponseDataClientLegalEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContract201ResponseDataClientLegalEntity.class);
  }

  /**
   * Convert an instance of CreateContract201ResponseDataClientLegalEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

