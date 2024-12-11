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
import java.time.LocalDate;
import java.util.Arrays;
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
 * UpdateGPEmployeeInformationRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateGPEmployeeInformationRequestData {
  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  @javax.annotation.Nullable
  private String gender;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  @javax.annotation.Nullable
  private String middleName;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  @javax.annotation.Nullable
  private LocalDate dateOfBirth;

  /**
   * Employee&#39;s marital status.
   */
  @JsonAdapter(MaritalStatusEnum.Adapter.class)
  public enum MaritalStatusEnum {
    SINGLE("Single"),
    
    MARRIED("Married"),
    
    WIDOWED("Widowed"),
    
    DIVORCED("Divorced"),
    
    SEPARATED("Separated"),
    
    REGISTERED_PARTNERSHIP("Registered Partnership"),
    
    COMMON_LAW("Common Law");

    private String value;

    MaritalStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MaritalStatusEnum fromValue(String value) {
      for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MaritalStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MaritalStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MaritalStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MaritalStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MaritalStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "marital_status";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  @javax.annotation.Nullable
  private MaritalStatusEnum maritalStatus;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employee_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  @javax.annotation.Nullable
  private String employeeNumber;

  public UpdateGPEmployeeInformationRequestData() {
  }

  public UpdateGPEmployeeInformationRequestData gender(@javax.annotation.Nullable String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Employee&#39;s gender.
   * @return gender
   */
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }

  public void setGender(@javax.annotation.Nullable String gender) {
    this.gender = gender;
  }


  public UpdateGPEmployeeInformationRequestData lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the employee.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public UpdateGPEmployeeInformationRequestData firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the employee.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public UpdateGPEmployeeInformationRequestData middleName(@javax.annotation.Nullable String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name of the employee.
   * @return middleName
   */
  @javax.annotation.Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@javax.annotation.Nullable String middleName) {
    this.middleName = middleName;
  }


  public UpdateGPEmployeeInformationRequestData dateOfBirth(@javax.annotation.Nullable LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Short date in ISO-8601 format (YYYY-MM-DD). For example: 2022-12-31.
   * @return dateOfBirth
   */
  @javax.annotation.Nullable
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(@javax.annotation.Nullable LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public UpdateGPEmployeeInformationRequestData maritalStatus(@javax.annotation.Nullable MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Employee&#39;s marital status.
   * @return maritalStatus
   */
  @javax.annotation.Nullable
  public MaritalStatusEnum getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(@javax.annotation.Nullable MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  public UpdateGPEmployeeInformationRequestData employeeNumber(@javax.annotation.Nullable String employeeNumber) {
    this.employeeNumber = employeeNumber;
    return this;
  }

  /**
   * Employee&#39;s unique number.
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
    UpdateGPEmployeeInformationRequestData updateGPEmployeeInformationRequestData = (UpdateGPEmployeeInformationRequestData) o;
    return Objects.equals(this.gender, updateGPEmployeeInformationRequestData.gender) &&
        Objects.equals(this.lastName, updateGPEmployeeInformationRequestData.lastName) &&
        Objects.equals(this.firstName, updateGPEmployeeInformationRequestData.firstName) &&
        Objects.equals(this.middleName, updateGPEmployeeInformationRequestData.middleName) &&
        Objects.equals(this.dateOfBirth, updateGPEmployeeInformationRequestData.dateOfBirth) &&
        Objects.equals(this.maritalStatus, updateGPEmployeeInformationRequestData.maritalStatus) &&
        Objects.equals(this.employeeNumber, updateGPEmployeeInformationRequestData.employeeNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, lastName, firstName, middleName, dateOfBirth, maritalStatus, employeeNumber);
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
    sb.append("class UpdateGPEmployeeInformationRequestData {\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
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
    openapiFields.add("gender");
    openapiFields.add("last_name");
    openapiFields.add("first_name");
    openapiFields.add("middle_name");
    openapiFields.add("date_of_birth");
    openapiFields.add("marital_status");
    openapiFields.add("employee_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateGPEmployeeInformationRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateGPEmployeeInformationRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGPEmployeeInformationRequestData is not found in the empty JSON string", UpdateGPEmployeeInformationRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateGPEmployeeInformationRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGPEmployeeInformationRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("middle_name") != null && !jsonObj.get("middle_name").isJsonNull()) && !jsonObj.get("middle_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle_name").toString()));
      }
      if ((jsonObj.get("marital_status") != null && !jsonObj.get("marital_status").isJsonNull()) && !jsonObj.get("marital_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marital_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marital_status").toString()));
      }
      // validate the optional field `marital_status`
      if (jsonObj.get("marital_status") != null && !jsonObj.get("marital_status").isJsonNull()) {
        MaritalStatusEnum.validateJsonElement(jsonObj.get("marital_status"));
      }
      if ((jsonObj.get("employee_number") != null && !jsonObj.get("employee_number").isJsonNull()) && !jsonObj.get("employee_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGPEmployeeInformationRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGPEmployeeInformationRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGPEmployeeInformationRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGPEmployeeInformationRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGPEmployeeInformationRequestData>() {
           @Override
           public void write(JsonWriter out, UpdateGPEmployeeInformationRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGPEmployeeInformationRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateGPEmployeeInformationRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateGPEmployeeInformationRequestData
   * @throws IOException if the JSON string is invalid with respect to UpdateGPEmployeeInformationRequestData
   */
  public static UpdateGPEmployeeInformationRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGPEmployeeInformationRequestData.class);
  }

  /**
   * Convert an instance of UpdateGPEmployeeInformationRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

