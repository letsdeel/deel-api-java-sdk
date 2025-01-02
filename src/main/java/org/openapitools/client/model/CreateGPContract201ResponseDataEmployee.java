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
 * CreateGPContract201ResponseDataEmployee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-02T14:25:45.544976271Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateGPContract201ResponseDataEmployee {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employee_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  @javax.annotation.Nullable
  private String employeeNumber;

  public CreateGPContract201ResponseDataEmployee() {
  }

  public CreateGPContract201ResponseDataEmployee email(@javax.annotation.Nullable String email) {
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


  public CreateGPContract201ResponseDataEmployee lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Employee&#39;s last name.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public CreateGPContract201ResponseDataEmployee firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Employee&#39;s first name.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public CreateGPContract201ResponseDataEmployee employeeNumber(@javax.annotation.Nullable String employeeNumber) {
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
    CreateGPContract201ResponseDataEmployee createGPContract201ResponseDataEmployee = (CreateGPContract201ResponseDataEmployee) o;
    return Objects.equals(this.email, createGPContract201ResponseDataEmployee.email) &&
        Objects.equals(this.lastName, createGPContract201ResponseDataEmployee.lastName) &&
        Objects.equals(this.firstName, createGPContract201ResponseDataEmployee.firstName) &&
        Objects.equals(this.employeeNumber, createGPContract201ResponseDataEmployee.employeeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, lastName, firstName, employeeNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGPContract201ResponseDataEmployee {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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
    openapiFields.add("last_name");
    openapiFields.add("first_name");
    openapiFields.add("employee_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateGPContract201ResponseDataEmployee
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateGPContract201ResponseDataEmployee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGPContract201ResponseDataEmployee is not found in the empty JSON string", CreateGPContract201ResponseDataEmployee.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateGPContract201ResponseDataEmployee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGPContract201ResponseDataEmployee` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("employee_number") != null && !jsonObj.get("employee_number").isJsonNull()) && !jsonObj.get("employee_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGPContract201ResponseDataEmployee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGPContract201ResponseDataEmployee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGPContract201ResponseDataEmployee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGPContract201ResponseDataEmployee.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGPContract201ResponseDataEmployee>() {
           @Override
           public void write(JsonWriter out, CreateGPContract201ResponseDataEmployee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGPContract201ResponseDataEmployee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateGPContract201ResponseDataEmployee given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateGPContract201ResponseDataEmployee
   * @throws IOException if the JSON string is invalid with respect to CreateGPContract201ResponseDataEmployee
   */
  public static CreateGPContract201ResponseDataEmployee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGPContract201ResponseDataEmployee.class);
  }

  /**
   * Convert an instance of CreateGPContract201ResponseDataEmployee to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

