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
 * CreateDirectEmployee201ResponseDataEmployee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateDirectEmployee201ResponseDataEmployee {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nonnull
  private String email;

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
  @javax.annotation.Nullable
  private String workEmail;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  @javax.annotation.Nonnull
  private String nationality;

  public CreateDirectEmployee201ResponseDataEmployee() {
  }

  public CreateDirectEmployee201ResponseDataEmployee email(@javax.annotation.Nonnull String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nonnull String email) {
    this.email = email;
  }


  public CreateDirectEmployee201ResponseDataEmployee lastName(@javax.annotation.Nonnull String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nonnull String lastName) {
    this.lastName = lastName;
  }


  public CreateDirectEmployee201ResponseDataEmployee firstName(@javax.annotation.Nonnull String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nonnull String firstName) {
    this.firstName = firstName;
  }


  public CreateDirectEmployee201ResponseDataEmployee workEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
    return this;
  }

  /**
   * Get workEmail
   * @return workEmail
   */
  @javax.annotation.Nullable
  public String getWorkEmail() {
    return workEmail;
  }

  public void setWorkEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
  }


  public CreateDirectEmployee201ResponseDataEmployee nationality(@javax.annotation.Nonnull String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
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
    CreateDirectEmployee201ResponseDataEmployee createDirectEmployee201ResponseDataEmployee = (CreateDirectEmployee201ResponseDataEmployee) o;
    return Objects.equals(this.email, createDirectEmployee201ResponseDataEmployee.email) &&
        Objects.equals(this.lastName, createDirectEmployee201ResponseDataEmployee.lastName) &&
        Objects.equals(this.firstName, createDirectEmployee201ResponseDataEmployee.firstName) &&
        Objects.equals(this.workEmail, createDirectEmployee201ResponseDataEmployee.workEmail) &&
        Objects.equals(this.nationality, createDirectEmployee201ResponseDataEmployee.nationality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, lastName, firstName, workEmail, nationality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDirectEmployee201ResponseDataEmployee {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
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
    openapiFields.add("last_name");
    openapiFields.add("first_name");
    openapiFields.add("work_email");
    openapiFields.add("nationality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("last_name");
    openapiRequiredFields.add("first_name");
    openapiRequiredFields.add("nationality");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateDirectEmployee201ResponseDataEmployee
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDirectEmployee201ResponseDataEmployee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDirectEmployee201ResponseDataEmployee is not found in the empty JSON string", CreateDirectEmployee201ResponseDataEmployee.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDirectEmployee201ResponseDataEmployee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDirectEmployee201ResponseDataEmployee` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDirectEmployee201ResponseDataEmployee.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if (!jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("work_email") != null && !jsonObj.get("work_email").isJsonNull()) && !jsonObj.get("work_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_email").toString()));
      }
      if (!jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDirectEmployee201ResponseDataEmployee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDirectEmployee201ResponseDataEmployee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDirectEmployee201ResponseDataEmployee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDirectEmployee201ResponseDataEmployee.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDirectEmployee201ResponseDataEmployee>() {
           @Override
           public void write(JsonWriter out, CreateDirectEmployee201ResponseDataEmployee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDirectEmployee201ResponseDataEmployee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateDirectEmployee201ResponseDataEmployee given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateDirectEmployee201ResponseDataEmployee
   * @throws IOException if the JSON string is invalid with respect to CreateDirectEmployee201ResponseDataEmployee
   */
  public static CreateDirectEmployee201ResponseDataEmployee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDirectEmployee201ResponseDataEmployee.class);
  }

  /**
   * Convert an instance of CreateDirectEmployee201ResponseDataEmployee to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

