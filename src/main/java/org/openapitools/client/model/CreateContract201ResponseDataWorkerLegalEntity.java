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
 * CreateContract201ResponseDataWorkerLegalEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class CreateContract201ResponseDataWorkerLegalEntity {
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
  private TypeEnum type;

  public static final String SERIALIZED_NAME_PERSONAL_NAME = "personal_name";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAME)
  private String personalName;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registration_number";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  private String registrationNumber;

  public CreateContract201ResponseDataWorkerLegalEntity() {
  }

  public CreateContract201ResponseDataWorkerLegalEntity type(TypeEnum type) {
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

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateContract201ResponseDataWorkerLegalEntity personalName(String personalName) {
    this.personalName = personalName;
    return this;
  }

  /**
   * Name of a legal entity
   * @return personalName
   */
  @javax.annotation.Nonnull
  public String getPersonalName() {
    return personalName;
  }

  public void setPersonalName(String personalName) {
    this.personalName = personalName;
  }


  public CreateContract201ResponseDataWorkerLegalEntity registrationNumber(String registrationNumber) {
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

  public void setRegistrationNumber(String registrationNumber) {
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
    CreateContract201ResponseDataWorkerLegalEntity createContract201ResponseDataWorkerLegalEntity = (CreateContract201ResponseDataWorkerLegalEntity) o;
    return Objects.equals(this.type, createContract201ResponseDataWorkerLegalEntity.type) &&
        Objects.equals(this.personalName, createContract201ResponseDataWorkerLegalEntity.personalName) &&
        Objects.equals(this.registrationNumber, createContract201ResponseDataWorkerLegalEntity.registrationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, personalName, registrationNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContract201ResponseDataWorkerLegalEntity {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    personalName: ").append(toIndentedString(personalName)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("personal_name");
    openapiFields.add("registration_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("personal_name");
    openapiRequiredFields.add("registration_number");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateContract201ResponseDataWorkerLegalEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContract201ResponseDataWorkerLegalEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContract201ResponseDataWorkerLegalEntity is not found in the empty JSON string", CreateContract201ResponseDataWorkerLegalEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContract201ResponseDataWorkerLegalEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContract201ResponseDataWorkerLegalEntity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateContract201ResponseDataWorkerLegalEntity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("personal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personal_name").toString()));
      }
      if (!jsonObj.get("registration_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContract201ResponseDataWorkerLegalEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContract201ResponseDataWorkerLegalEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContract201ResponseDataWorkerLegalEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContract201ResponseDataWorkerLegalEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContract201ResponseDataWorkerLegalEntity>() {
           @Override
           public void write(JsonWriter out, CreateContract201ResponseDataWorkerLegalEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContract201ResponseDataWorkerLegalEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContract201ResponseDataWorkerLegalEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContract201ResponseDataWorkerLegalEntity
   * @throws IOException if the JSON string is invalid with respect to CreateContract201ResponseDataWorkerLegalEntity
   */
  public static CreateContract201ResponseDataWorkerLegalEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContract201ResponseDataWorkerLegalEntity.class);
  }

  /**
   * Convert an instance of CreateContract201ResponseDataWorkerLegalEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
