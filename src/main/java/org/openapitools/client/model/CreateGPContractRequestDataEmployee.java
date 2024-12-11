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
import org.openapitools.client.model.CreateGPContractRequestDataEmployeeAddress;

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
 * CreateGPContractRequestDataEmployee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:11:44.252131062Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateGPContractRequestDataEmployee {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nonnull
  private String email;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  @javax.annotation.Nonnull
  private CreateGPContractRequestDataEmployeeAddress address;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nonnull
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nonnull
  private String firstName;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  @javax.annotation.Nonnull
  private String workEmail;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  @javax.annotation.Nullable
  private String nationality;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employee_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  @javax.annotation.Nullable
  private String employeeNumber;

  public CreateGPContractRequestDataEmployee() {
  }

  public CreateGPContractRequestDataEmployee email(@javax.annotation.Nonnull String email) {
    this.email = email;
    return this;
  }

  /**
   * Worker&#39;s email address.
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nonnull String email) {
    this.email = email;
  }


  public CreateGPContractRequestDataEmployee address(@javax.annotation.Nonnull CreateGPContractRequestDataEmployeeAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nonnull
  public CreateGPContractRequestDataEmployeeAddress getAddress() {
    return address;
  }

  public void setAddress(@javax.annotation.Nonnull CreateGPContractRequestDataEmployeeAddress address) {
    this.address = address;
  }


  public CreateGPContractRequestDataEmployee lastName(@javax.annotation.Nonnull String lastName) {
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


  public CreateGPContractRequestDataEmployee firstName(@javax.annotation.Nonnull String firstName) {
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


  public CreateGPContractRequestDataEmployee workEmail(@javax.annotation.Nonnull String workEmail) {
    this.workEmail = workEmail;
    return this;
  }

  /**
   * Worker&#39;s email address.
   * @return workEmail
   */
  @javax.annotation.Nonnull
  public String getWorkEmail() {
    return workEmail;
  }

  public void setWorkEmail(@javax.annotation.Nonnull String workEmail) {
    this.workEmail = workEmail;
  }


  public CreateGPContractRequestDataEmployee nationality(@javax.annotation.Nullable String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Employee&#39;s nationality.
   * @return nationality
   */
  @javax.annotation.Nullable
  public String getNationality() {
    return nationality;
  }

  public void setNationality(@javax.annotation.Nullable String nationality) {
    this.nationality = nationality;
  }


  public CreateGPContractRequestDataEmployee employeeNumber(@javax.annotation.Nullable String employeeNumber) {
    this.employeeNumber = employeeNumber;
    return this;
  }

  /**
   * Employee&#39;s number.
   * @return employeeNumber
   */
  @javax.annotation.Nullable
  public String getEmployeeNumber() {
    return employeeNumber;
  }

  public void setEmployeeNumber(@javax.annotation.Nullable String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGPContractRequestDataEmployee createGPContractRequestDataEmployee = (CreateGPContractRequestDataEmployee) o;
    return Objects.equals(this.email, createGPContractRequestDataEmployee.email) &&
        Objects.equals(this.address, createGPContractRequestDataEmployee.address) &&
        Objects.equals(this.lastName, createGPContractRequestDataEmployee.lastName) &&
        Objects.equals(this.firstName, createGPContractRequestDataEmployee.firstName) &&
        Objects.equals(this.workEmail, createGPContractRequestDataEmployee.workEmail) &&
        Objects.equals(this.nationality, createGPContractRequestDataEmployee.nationality) &&
        Objects.equals(this.employeeNumber, createGPContractRequestDataEmployee.employeeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, address, lastName, firstName, workEmail, nationality, employeeNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGPContractRequestDataEmployee {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
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
    openapiFields.add("work_email");
    openapiFields.add("nationality");
    openapiFields.add("employee_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("last_name");
    openapiRequiredFields.add("first_name");
    openapiRequiredFields.add("work_email");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateGPContractRequestDataEmployee
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateGPContractRequestDataEmployee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGPContractRequestDataEmployee is not found in the empty JSON string", CreateGPContractRequestDataEmployee.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateGPContractRequestDataEmployee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGPContractRequestDataEmployee` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateGPContractRequestDataEmployee.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the required field `address`
      CreateGPContractRequestDataEmployeeAddress.validateJsonElement(jsonObj.get("address"));
      if (!jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if (!jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (!jsonObj.get("work_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_email").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("employee_number") != null && !jsonObj.get("employee_number").isJsonNull()) && !jsonObj.get("employee_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGPContractRequestDataEmployee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGPContractRequestDataEmployee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGPContractRequestDataEmployee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGPContractRequestDataEmployee.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGPContractRequestDataEmployee>() {
           @Override
           public void write(JsonWriter out, CreateGPContractRequestDataEmployee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGPContractRequestDataEmployee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateGPContractRequestDataEmployee given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateGPContractRequestDataEmployee
   * @throws IOException if the JSON string is invalid with respect to CreateGPContractRequestDataEmployee
   */
  public static CreateGPContractRequestDataEmployee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGPContractRequestDataEmployee.class);
  }

  /**
   * Convert an instance of CreateGPContractRequestDataEmployee to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

