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
 * UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T14:19:15.487453130Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner {
  /**
   * The type of the phone number.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PERSONAL("PERSONAL"),
    
    WORK("WORK"),
    
    HOME("HOME");

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

  public static final String SERIALIZED_NAME_DIAL_CODE = "dial_code";
  @SerializedName(SERIALIZED_NAME_DIAL_CODE)
  @javax.annotation.Nonnull
  private String dialCode;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  @javax.annotation.Nonnull
  private String phoneNumber;

  public UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner() {
  }

  public UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the phone number.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner dialCode(@javax.annotation.Nonnull String dialCode) {
    this.dialCode = dialCode;
    return this;
  }

  /**
   * The dial code (also known as country code).
   * @return dialCode
   */
  @javax.annotation.Nonnull
  public String getDialCode() {
    return dialCode;
  }

  public void setDialCode(@javax.annotation.Nonnull String dialCode) {
    this.dialCode = dialCode;
  }


  public UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner phoneNumber(@javax.annotation.Nonnull String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The phone number.
   * @return phoneNumber
   */
  @javax.annotation.Nonnull
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@javax.annotation.Nonnull String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner updatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner = (UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner) o;
    return Objects.equals(this.type, updatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner.type) &&
        Objects.equals(this.dialCode, updatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner.dialCode) &&
        Objects.equals(this.phoneNumber, updatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dialCode, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dialCode: ").append(toIndentedString(dialCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
    openapiFields.add("dial_code");
    openapiFields.add("phone_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("dial_code");
    openapiRequiredFields.add("phone_number");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner is not found in the empty JSON string", UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner.openapiRequiredFields) {
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
      if (!jsonObj.get("dial_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dial_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dial_code").toString()));
      }
      if (!jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner>() {
           @Override
           public void write(JsonWriter out, UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner
   * @throws IOException if the JSON string is invalid with respect to UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner
   */
  public static UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner.class);
  }

  /**
   * Convert an instance of UpdatePeoplePersonalInformationByIdRequestDataPhoneNumbersInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

