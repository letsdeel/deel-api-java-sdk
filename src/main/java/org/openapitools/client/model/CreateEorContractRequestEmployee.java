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
import org.openapitools.client.model.CreateEorContractRequestEmployeeAddress;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CreateEorContractRequestEmployee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T13:30:34.884345844Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateEorContractRequestEmployee {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nullable
  private CreateEorContractRequestEmployeeAddress address;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nonnull
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nonnull
  private String firstName;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  @javax.annotation.Nonnull
  private String nationality;

  public CreateEorContractRequestEmployee() {
  }

  public CreateEorContractRequestEmployee email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Employee&#39;s email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public CreateEorContractRequestEmployee address(@javax.annotation.Nullable CreateEorContractRequestEmployeeAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public CreateEorContractRequestEmployeeAddress getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nullable CreateEorContractRequestEmployeeAddress address) {
    this.address = address;
  }


  public CreateEorContractRequestEmployee lastName(@javax.annotation.Nonnull String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Employee&#39;s last name.
   * @return lastName
   */
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nonnull String lastName) {
    this.lastName = lastName;
  }


  public CreateEorContractRequestEmployee firstName(@javax.annotation.Nonnull String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Employee&#39;s first name.
   * @return firstName
   */
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nonnull String firstName) {
    this.firstName = firstName;
  }


  public CreateEorContractRequestEmployee externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * External identifier of the employee.
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }


  public CreateEorContractRequestEmployee nationality(@javax.annotation.Nonnull String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Employee&#39;s nationality.
   * @return nationality
   */
  @javax.annotation.Nonnull
  public String getNationality() {
    return nationality;
  }

  public void setNationality(@javax.annotation.Nonnull String nationality) {
    this.nationality = nationality;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEorContractRequestEmployee createEorContractRequestEmployee = (CreateEorContractRequestEmployee) o;
    return Objects.equals(this.email, createEorContractRequestEmployee.email) &&
        Objects.equals(this.address, createEorContractRequestEmployee.address) &&
        Objects.equals(this.lastName, createEorContractRequestEmployee.lastName) &&
        Objects.equals(this.firstName, createEorContractRequestEmployee.firstName) &&
        Objects.equals(this.externalId, createEorContractRequestEmployee.externalId) &&
        Objects.equals(this.nationality, createEorContractRequestEmployee.nationality);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, address, lastName, firstName, externalId, nationality);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEorContractRequestEmployee {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("address");
    openapiFields.add("last_name");
    openapiFields.add("first_name");
    openapiFields.add("external_id");
    openapiFields.add("nationality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("last_name");
    openapiRequiredFields.add("first_name");
    openapiRequiredFields.add("nationality");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEorContractRequestEmployee
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEorContractRequestEmployee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEorContractRequestEmployee is not found in the empty JSON string", CreateEorContractRequestEmployee.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEorContractRequestEmployee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEorContractRequestEmployee` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEorContractRequestEmployee.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        CreateEorContractRequestEmployeeAddress.validateJsonElement(jsonObj.get("address"));
      }
      if (!jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if (!jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (!jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEorContractRequestEmployee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEorContractRequestEmployee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEorContractRequestEmployee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEorContractRequestEmployee.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEorContractRequestEmployee>() {
           @Override
           public void write(JsonWriter out, CreateEorContractRequestEmployee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEorContractRequestEmployee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEorContractRequestEmployee given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEorContractRequestEmployee
   * @throws IOException if the JSON string is invalid with respect to CreateEorContractRequestEmployee
   */
  public static CreateEorContractRequestEmployee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEorContractRequestEmployee.class);
  }

  /**
   * Convert an instance of CreateEorContractRequestEmployee to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

