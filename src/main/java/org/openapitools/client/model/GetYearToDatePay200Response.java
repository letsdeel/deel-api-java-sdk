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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GetYearToDatePay200ResponseEmployeesInner;

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
 * GetYearToDatePay200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T18:19:15.469015129Z[GMT]", comments = "Generator version: 7.10.0")
public class GetYearToDatePay200Response {
  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_EMPLOYEES = "employees";
  @SerializedName(SERIALIZED_NAME_EMPLOYEES)
  @javax.annotation.Nullable
  private List<GetYearToDatePay200ResponseEmployeesInner> employees = new ArrayList<>();

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private LocalDate startDate;

  public GetYearToDatePay200Response() {
  }

  public GetYearToDatePay200Response endDate(@javax.annotation.Nullable LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The end date of the pay period.
   * @return endDate
   */
  @javax.annotation.Nullable
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable LocalDate endDate) {
    this.endDate = endDate;
  }


  public GetYearToDatePay200Response employees(@javax.annotation.Nullable List<GetYearToDatePay200ResponseEmployeesInner> employees) {
    this.employees = employees;
    return this;
  }

  public GetYearToDatePay200Response addEmployeesItem(GetYearToDatePay200ResponseEmployeesInner employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<>();
    }
    this.employees.add(employeesItem);
    return this;
  }

  /**
   * Get employees
   * @return employees
   */
  @javax.annotation.Nullable
  public List<GetYearToDatePay200ResponseEmployeesInner> getEmployees() {
    return employees;
  }

  public void setEmployees(@javax.annotation.Nullable List<GetYearToDatePay200ResponseEmployeesInner> employees) {
    this.employees = employees;
  }


  public GetYearToDatePay200Response startDate(@javax.annotation.Nullable LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the pay period.
   * @return startDate
   */
  @javax.annotation.Nullable
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable LocalDate startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetYearToDatePay200Response getYearToDatePay200Response = (GetYearToDatePay200Response) o;
    return Objects.equals(this.endDate, getYearToDatePay200Response.endDate) &&
        Objects.equals(this.employees, getYearToDatePay200Response.employees) &&
        Objects.equals(this.startDate, getYearToDatePay200Response.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, employees, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetYearToDatePay200Response {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("end_date");
    openapiFields.add("employees");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetYearToDatePay200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetYearToDatePay200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetYearToDatePay200Response is not found in the empty JSON string", GetYearToDatePay200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetYearToDatePay200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetYearToDatePay200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("employees") != null && !jsonObj.get("employees").isJsonNull()) {
        JsonArray jsonArrayemployees = jsonObj.getAsJsonArray("employees");
        if (jsonArrayemployees != null) {
          // ensure the json data is an array
          if (!jsonObj.get("employees").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `employees` to be an array in the JSON string but got `%s`", jsonObj.get("employees").toString()));
          }

          // validate the optional field `employees` (array)
          for (int i = 0; i < jsonArrayemployees.size(); i++) {
            GetYearToDatePay200ResponseEmployeesInner.validateJsonElement(jsonArrayemployees.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetYearToDatePay200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetYearToDatePay200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetYearToDatePay200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetYearToDatePay200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetYearToDatePay200Response>() {
           @Override
           public void write(JsonWriter out, GetYearToDatePay200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetYearToDatePay200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetYearToDatePay200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetYearToDatePay200Response
   * @throws IOException if the JSON string is invalid with respect to GetYearToDatePay200Response
   */
  public static GetYearToDatePay200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetYearToDatePay200Response.class);
  }

  /**
   * Convert an instance of GetYearToDatePay200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

