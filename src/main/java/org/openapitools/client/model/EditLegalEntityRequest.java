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
import org.openapitools.client.model.EditLegalEntityRequestAddress;
import org.openapitools.client.model.EditLegalEntityRequestCompanyIdentifiers;

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
 * EditLegalEntityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class EditLegalEntityRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  @javax.annotation.Nullable
  private String phone;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nullable
  private EditLegalEntityRequestAddress address;

  public static final String SERIALIZED_NAME_SIC_NUMBER = "sic_number";
  @SerializedName(SERIALIZED_NAME_SIC_NUMBER)
  @javax.annotation.Nullable
  private String sicNumber;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  @javax.annotation.Nullable
  private String entityType;

  public static final String SERIALIZED_NAME_INDUSTRY_NAME = "industry_name";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_NAME)
  @javax.annotation.Nullable
  private String industryName;

  public static final String SERIALIZED_NAME_COMPANY_IDENTIFIERS = "company_identifiers";
  @SerializedName(SERIALIZED_NAME_COMPANY_IDENTIFIERS)
  @javax.annotation.Nullable
  private EditLegalEntityRequestCompanyIdentifiers companyIdentifiers;

  public EditLegalEntityRequest() {
  }

  public EditLegalEntityRequest name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the legal entity.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public EditLegalEntityRequest phone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * The phone number of the legal entity.
   * @return phone
   */
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = phone;
  }


  public EditLegalEntityRequest address(@javax.annotation.Nullable EditLegalEntityRequestAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public EditLegalEntityRequestAddress getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nullable EditLegalEntityRequestAddress address) {
    this.address = address;
  }


  public EditLegalEntityRequest sicNumber(@javax.annotation.Nullable String sicNumber) {
    this.sicNumber = sicNumber;
    return this;
  }

  /**
   * The SIC number of the legal entity.
   * @return sicNumber
   */
  @javax.annotation.Nullable
  public String getSicNumber() {
    return sicNumber;
  }

  public void setSicNumber(@javax.annotation.Nullable String sicNumber) {
    this.sicNumber = sicNumber;
  }


  public EditLegalEntityRequest entityType(@javax.annotation.Nullable String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * The type of the legal entity.
   * @return entityType
   */
  @javax.annotation.Nullable
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(@javax.annotation.Nullable String entityType) {
    this.entityType = entityType;
  }


  public EditLegalEntityRequest industryName(@javax.annotation.Nullable String industryName) {
    this.industryName = industryName;
    return this;
  }

  /**
   * The industry name of the legal entity.
   * @return industryName
   */
  @javax.annotation.Nullable
  public String getIndustryName() {
    return industryName;
  }

  public void setIndustryName(@javax.annotation.Nullable String industryName) {
    this.industryName = industryName;
  }


  public EditLegalEntityRequest companyIdentifiers(@javax.annotation.Nullable EditLegalEntityRequestCompanyIdentifiers companyIdentifiers) {
    this.companyIdentifiers = companyIdentifiers;
    return this;
  }

  /**
   * Get companyIdentifiers
   * @return companyIdentifiers
   */
  @javax.annotation.Nullable
  public EditLegalEntityRequestCompanyIdentifiers getCompanyIdentifiers() {
    return companyIdentifiers;
  }

  public void setCompanyIdentifiers(@javax.annotation.Nullable EditLegalEntityRequestCompanyIdentifiers companyIdentifiers) {
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
    EditLegalEntityRequest editLegalEntityRequest = (EditLegalEntityRequest) o;
    return Objects.equals(this.name, editLegalEntityRequest.name) &&
        Objects.equals(this.phone, editLegalEntityRequest.phone) &&
        Objects.equals(this.address, editLegalEntityRequest.address) &&
        Objects.equals(this.sicNumber, editLegalEntityRequest.sicNumber) &&
        Objects.equals(this.entityType, editLegalEntityRequest.entityType) &&
        Objects.equals(this.industryName, editLegalEntityRequest.industryName) &&
        Objects.equals(this.companyIdentifiers, editLegalEntityRequest.companyIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phone, address, sicNumber, entityType, industryName, companyIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditLegalEntityRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    sicNumber: ").append(toIndentedString(sicNumber)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    industryName: ").append(toIndentedString(industryName)).append("\n");
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
    openapiFields.add("industry_name");
    openapiFields.add("company_identifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EditLegalEntityRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EditLegalEntityRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EditLegalEntityRequest is not found in the empty JSON string", EditLegalEntityRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EditLegalEntityRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EditLegalEntityRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        EditLegalEntityRequestAddress.validateJsonElement(jsonObj.get("address"));
      }
      if ((jsonObj.get("sic_number") != null && !jsonObj.get("sic_number").isJsonNull()) && !jsonObj.get("sic_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sic_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sic_number").toString()));
      }
      if ((jsonObj.get("entity_type") != null && !jsonObj.get("entity_type").isJsonNull()) && !jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
      }
      if ((jsonObj.get("industry_name") != null && !jsonObj.get("industry_name").isJsonNull()) && !jsonObj.get("industry_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `industry_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industry_name").toString()));
      }
      // validate the optional field `company_identifiers`
      if (jsonObj.get("company_identifiers") != null && !jsonObj.get("company_identifiers").isJsonNull()) {
        EditLegalEntityRequestCompanyIdentifiers.validateJsonElement(jsonObj.get("company_identifiers"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EditLegalEntityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EditLegalEntityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EditLegalEntityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EditLegalEntityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EditLegalEntityRequest>() {
           @Override
           public void write(JsonWriter out, EditLegalEntityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EditLegalEntityRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EditLegalEntityRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EditLegalEntityRequest
   * @throws IOException if the JSON string is invalid with respect to EditLegalEntityRequest
   */
  public static EditLegalEntityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EditLegalEntityRequest.class);
  }

  /**
   * Convert an instance of EditLegalEntityRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

