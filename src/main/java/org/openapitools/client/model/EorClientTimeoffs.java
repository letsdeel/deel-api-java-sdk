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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.EorTimeoffsEmployeeItem;

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
 * EorClientTimeoffs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:44:17.413238492Z[GMT]", comments = "Generator version: 7.10.0")
public class EorClientTimeoffs {
  public static final String SERIALIZED_NAME_EMPLOYEES = "employees";
  @SerializedName(SERIALIZED_NAME_EMPLOYEES)
  @javax.annotation.Nonnull
  private List<EorTimeoffsEmployeeItem> employees = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_REQUESTS = "total_requests";
  @SerializedName(SERIALIZED_NAME_TOTAL_REQUESTS)
  @javax.annotation.Nonnull
  private BigDecimal totalRequests;

  public EorClientTimeoffs() {
  }

  public EorClientTimeoffs employees(@javax.annotation.Nonnull List<EorTimeoffsEmployeeItem> employees) {
    this.employees = employees;
    return this;
  }

  public EorClientTimeoffs addEmployeesItem(EorTimeoffsEmployeeItem employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<>();
    }
    this.employees.add(employeesItem);
    return this;
  }

  /**
   * List of employee time offs.
   * @return employees
   */
  @javax.annotation.Nonnull
  public List<EorTimeoffsEmployeeItem> getEmployees() {
    return employees;
  }

  public void setEmployees(@javax.annotation.Nonnull List<EorTimeoffsEmployeeItem> employees) {
    this.employees = employees;
  }


  public EorClientTimeoffs totalRequests(@javax.annotation.Nonnull BigDecimal totalRequests) {
    this.totalRequests = totalRequests;
    return this;
  }

  /**
   * Get totalRequests
   * @return totalRequests
   */
  @javax.annotation.Nonnull
  public BigDecimal getTotalRequests() {
    return totalRequests;
  }

  public void setTotalRequests(@javax.annotation.Nonnull BigDecimal totalRequests) {
    this.totalRequests = totalRequests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorClientTimeoffs eorClientTimeoffs = (EorClientTimeoffs) o;
    return Objects.equals(this.employees, eorClientTimeoffs.employees) &&
        Objects.equals(this.totalRequests, eorClientTimeoffs.totalRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employees, totalRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorClientTimeoffs {\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
    sb.append("    totalRequests: ").append(toIndentedString(totalRequests)).append("\n");
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
    openapiFields.add("employees");
    openapiFields.add("total_requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employees");
    openapiRequiredFields.add("total_requests");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorClientTimeoffs
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorClientTimeoffs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorClientTimeoffs is not found in the empty JSON string", EorClientTimeoffs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorClientTimeoffs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorClientTimeoffs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EorClientTimeoffs.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("employees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `employees` to be an array in the JSON string but got `%s`", jsonObj.get("employees").toString()));
      }

      JsonArray jsonArrayemployees = jsonObj.getAsJsonArray("employees");
      // validate the required field `employees` (array)
      for (int i = 0; i < jsonArrayemployees.size(); i++) {
        EorTimeoffsEmployeeItem.validateJsonElement(jsonArrayemployees.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorClientTimeoffs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorClientTimeoffs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorClientTimeoffs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorClientTimeoffs.class));

       return (TypeAdapter<T>) new TypeAdapter<EorClientTimeoffs>() {
           @Override
           public void write(JsonWriter out, EorClientTimeoffs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorClientTimeoffs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorClientTimeoffs given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorClientTimeoffs
   * @throws IOException if the JSON string is invalid with respect to EorClientTimeoffs
   */
  public static EorClientTimeoffs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorClientTimeoffs.class);
  }

  /**
   * Convert an instance of EorClientTimeoffs to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

