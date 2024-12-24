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
import org.openapitools.client.model.CreateLegalEntityRequestDataAddress;
import org.openapitools.client.model.CreateLegalEntityRequestDataCompanyIdentifiers;

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
 * CreateLegalEntityRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateLegalEntityRequestData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nonnull
  private String phone;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nonnull
  private CreateLegalEntityRequestDataAddress address;

  public static final String SERIALIZED_NAME_SIC_NUMBER = "sic_number";
  @SerializedName(SERIALIZED_NAME_SIC_NUMBER)
  @javax.annotation.Nonnull
  private String sicNumber;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  @javax.annotation.Nonnull
  private String entityType;

  public static final String SERIALIZED_NAME_COMPANY_IDENTIFIERS = "company_identifiers";
  @SerializedName(SERIALIZED_NAME_COMPANY_IDENTIFIERS)
  @javax.annotation.Nonnull
  private CreateLegalEntityRequestDataCompanyIdentifiers companyIdentifiers;

  public CreateLegalEntityRequestData() {
  }

  public CreateLegalEntityRequestData name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The legal name of the entity.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreateLegalEntityRequestData phone(@javax.annotation.Nonnull String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Contact phone number for the entity.
   * @return phone
   */
  @javax.annotation.Nonnull
  public String getPhone() {
    return phone;
  }

  public void setPhone(@javax.annotation.Nonnull String phone) {
    this.phone = phone;
  }


  public CreateLegalEntityRequestData address(@javax.annotation.Nonnull CreateLegalEntityRequestDataAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nonnull
  public CreateLegalEntityRequestDataAddress getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nonnull CreateLegalEntityRequestDataAddress address) {
    this.address = address;
  }


  public CreateLegalEntityRequestData sicNumber(@javax.annotation.Nonnull String sicNumber) {
    this.sicNumber = sicNumber;
    return this;
  }

  /**
   * The SIC number for the entity.
   * @return sicNumber
   */
  @javax.annotation.Nonnull
  public String getSicNumber() {
    return sicNumber;
  }

  public void setSicNumber(@javax.annotation.Nonnull String sicNumber) {
    this.sicNumber = sicNumber;
  }


  public CreateLegalEntityRequestData entityType(@javax.annotation.Nonnull String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Type of the entity.
   * @return entityType
   */
  @javax.annotation.Nonnull
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(@javax.annotation.Nonnull String entityType) {
    this.entityType = entityType;
  }


  public CreateLegalEntityRequestData companyIdentifiers(@javax.annotation.Nonnull CreateLegalEntityRequestDataCompanyIdentifiers companyIdentifiers) {
    this.companyIdentifiers = companyIdentifiers;
    return this;
  }

  /**
   * Get companyIdentifiers
   * @return companyIdentifiers
   */
  @javax.annotation.Nonnull
  public CreateLegalEntityRequestDataCompanyIdentifiers getCompanyIdentifiers() {
    return companyIdentifiers;
  }

  public void setCompanyIdentifiers(@javax.annotation.Nonnull CreateLegalEntityRequestDataCompanyIdentifiers companyIdentifiers) {
    this.companyIdentifiers = companyIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLegalEntityRequestData createLegalEntityRequestData = (CreateLegalEntityRequestData) o;
    return Objects.equals(this.name, createLegalEntityRequestData.name) &&
        Objects.equals(this.phone, createLegalEntityRequestData.phone) &&
        Objects.equals(this.address, createLegalEntityRequestData.address) &&
        Objects.equals(this.sicNumber, createLegalEntityRequestData.sicNumber) &&
        Objects.equals(this.entityType, createLegalEntityRequestData.entityType) &&
        Objects.equals(this.companyIdentifiers, createLegalEntityRequestData.companyIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, address, sicNumber, entityType, companyIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLegalEntityRequestData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    sicNumber: ").append(toIndentedString(sicNumber)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    companyIdentifiers: ").append(toIndentedString(companyIdentifiers)).append("\n");
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
    openapiFields.add("phone");
    openapiFields.add("address");
    openapiFields.add("sic_number");
    openapiFields.add("entity_type");
    openapiFields.add("company_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("sic_number");
    openapiRequiredFields.add("entity_type");
    openapiRequiredFields.add("company_identifiers");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateLegalEntityRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateLegalEntityRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateLegalEntityRequestData is not found in the empty JSON string", CreateLegalEntityRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateLegalEntityRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateLegalEntityRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateLegalEntityRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // validate the required field `address`
      CreateLegalEntityRequestDataAddress.validateJsonElement(jsonObj.get("address"));
      if (!jsonObj.get("sic_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sic_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sic_number").toString()));
      }
      if (!jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
      }
      // validate the required field `company_identifiers`
      CreateLegalEntityRequestDataCompanyIdentifiers.validateJsonElement(jsonObj.get("company_identifiers"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLegalEntityRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLegalEntityRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLegalEntityRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLegalEntityRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLegalEntityRequestData>() {
           @Override
           public void write(JsonWriter out, CreateLegalEntityRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLegalEntityRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateLegalEntityRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateLegalEntityRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateLegalEntityRequestData
   */
  public static CreateLegalEntityRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLegalEntityRequestData.class);
  }

  /**
   * Convert an instance of CreateLegalEntityRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

