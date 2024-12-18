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
 * EditLegalEntity200ResponseDataCompanyIdentifiers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:45:24.021173966Z[GMT]", comments = "Generator version: 7.10.0")
public class EditLegalEntity200ResponseDataCompanyIdentifiers {
  public static final String SERIALIZED_NAME_TAX_NUMBER = "tax_number";
  @SerializedName(SERIALIZED_NAME_TAX_NUMBER)
  @javax.annotation.Nullable
  private String taxNumber;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registration_number";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  @javax.annotation.Nullable
  private String registrationNumber;

  public EditLegalEntity200ResponseDataCompanyIdentifiers() {
  }

  public EditLegalEntity200ResponseDataCompanyIdentifiers taxNumber(@javax.annotation.Nullable String taxNumber) {
    this.taxNumber = taxNumber;
    return this;
  }

  /**
   * The tax identification number of the legal entity.
   * @return taxNumber
   */
  @javax.annotation.Nullable
  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(@javax.annotation.Nullable String taxNumber) {
    this.taxNumber = taxNumber;
  }


  public EditLegalEntity200ResponseDataCompanyIdentifiers registrationNumber(@javax.annotation.Nullable String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

  /**
   * The registration number of the legal entity.
   * @return registrationNumber
   */
  @javax.annotation.Nullable
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(@javax.annotation.Nullable String registrationNumber) {
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
    EditLegalEntity200ResponseDataCompanyIdentifiers editLegalEntity200ResponseDataCompanyIdentifiers = (EditLegalEntity200ResponseDataCompanyIdentifiers) o;
    return Objects.equals(this.taxNumber, editLegalEntity200ResponseDataCompanyIdentifiers.taxNumber) &&
        Objects.equals(this.registrationNumber, editLegalEntity200ResponseDataCompanyIdentifiers.registrationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxNumber, registrationNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditLegalEntity200ResponseDataCompanyIdentifiers {\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
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
    openapiFields.add("tax_number");
    openapiFields.add("registration_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EditLegalEntity200ResponseDataCompanyIdentifiers
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EditLegalEntity200ResponseDataCompanyIdentifiers.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EditLegalEntity200ResponseDataCompanyIdentifiers is not found in the empty JSON string", EditLegalEntity200ResponseDataCompanyIdentifiers.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EditLegalEntity200ResponseDataCompanyIdentifiers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EditLegalEntity200ResponseDataCompanyIdentifiers` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tax_number") != null && !jsonObj.get("tax_number").isJsonNull()) && !jsonObj.get("tax_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_number").toString()));
      }
      if ((jsonObj.get("registration_number") != null && !jsonObj.get("registration_number").isJsonNull()) && !jsonObj.get("registration_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EditLegalEntity200ResponseDataCompanyIdentifiers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EditLegalEntity200ResponseDataCompanyIdentifiers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EditLegalEntity200ResponseDataCompanyIdentifiers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EditLegalEntity200ResponseDataCompanyIdentifiers.class));

       return (TypeAdapter<T>) new TypeAdapter<EditLegalEntity200ResponseDataCompanyIdentifiers>() {
           @Override
           public void write(JsonWriter out, EditLegalEntity200ResponseDataCompanyIdentifiers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EditLegalEntity200ResponseDataCompanyIdentifiers read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EditLegalEntity200ResponseDataCompanyIdentifiers given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EditLegalEntity200ResponseDataCompanyIdentifiers
   * @throws IOException if the JSON string is invalid with respect to EditLegalEntity200ResponseDataCompanyIdentifiers
   */
  public static EditLegalEntity200ResponseDataCompanyIdentifiers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EditLegalEntity200ResponseDataCompanyIdentifiers.class);
  }

  /**
   * Convert an instance of EditLegalEntity200ResponseDataCompanyIdentifiers to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

