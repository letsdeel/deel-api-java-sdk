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
import java.util.UUID;
import org.openapitools.client.model.CreatedHrisDirectEmployeeContainerDataCompensationDetails;
import org.openapitools.client.model.CreatedHrisDirectEmployeeContainerDataEmployee;
import org.openapitools.client.model.CreatedHrisDirectEmployeeContainerDataEmployment;

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
 * CreatedHrisDirectEmployeeContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class CreatedHrisDirectEmployeeContainerData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_EMPLOYMENT = "employment";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT)
  @javax.annotation.Nonnull
  private CreatedHrisDirectEmployeeContainerDataEmployment employment;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  @javax.annotation.Nonnull
  private CreatedHrisDirectEmployeeContainerDataEmployee employee;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private CreatedHrisDirectEmployeeContainerDataCompensationDetails compensationDetails;

  public CreatedHrisDirectEmployeeContainerData() {
  }

  public CreatedHrisDirectEmployeeContainerData id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The Hris Direct employee ID
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public CreatedHrisDirectEmployeeContainerData employment(@javax.annotation.Nonnull CreatedHrisDirectEmployeeContainerDataEmployment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   */
  @javax.annotation.Nonnull
  public CreatedHrisDirectEmployeeContainerDataEmployment getEmployment() {
    return employment;
  }

  public void setEmployment(@javax.annotation.Nonnull CreatedHrisDirectEmployeeContainerDataEmployment employment) {
    this.employment = employment;
  }


  public CreatedHrisDirectEmployeeContainerData employee(@javax.annotation.Nonnull CreatedHrisDirectEmployeeContainerDataEmployee employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
   */
  @javax.annotation.Nonnull
  public CreatedHrisDirectEmployeeContainerDataEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(@javax.annotation.Nonnull CreatedHrisDirectEmployeeContainerDataEmployee employee) {
    this.employee = employee;
  }


  public CreatedHrisDirectEmployeeContainerData compensationDetails(@javax.annotation.Nonnull CreatedHrisDirectEmployeeContainerDataCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public CreatedHrisDirectEmployeeContainerDataCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull CreatedHrisDirectEmployeeContainerDataCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedHrisDirectEmployeeContainerData createdHrisDirectEmployeeContainerData = (CreatedHrisDirectEmployeeContainerData) o;
    return Objects.equals(this.id, createdHrisDirectEmployeeContainerData.id) &&
        Objects.equals(this.employment, createdHrisDirectEmployeeContainerData.employment) &&
        Objects.equals(this.employee, createdHrisDirectEmployeeContainerData.employee) &&
        Objects.equals(this.compensationDetails, createdHrisDirectEmployeeContainerData.compensationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employment, employee, compensationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedHrisDirectEmployeeContainerData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    compensationDetails: ").append(toIndentedString(compensationDetails)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("employment");
    openapiFields.add("employee");
    openapiFields.add("compensation_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("employment");
    openapiRequiredFields.add("employee");
    openapiRequiredFields.add("compensation_details");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreatedHrisDirectEmployeeContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatedHrisDirectEmployeeContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatedHrisDirectEmployeeContainerData is not found in the empty JSON string", CreatedHrisDirectEmployeeContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatedHrisDirectEmployeeContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatedHrisDirectEmployeeContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatedHrisDirectEmployeeContainerData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `employment`
      CreatedHrisDirectEmployeeContainerDataEmployment.validateJsonElement(jsonObj.get("employment"));
      // validate the required field `employee`
      CreatedHrisDirectEmployeeContainerDataEmployee.validateJsonElement(jsonObj.get("employee"));
      // validate the required field `compensation_details`
      CreatedHrisDirectEmployeeContainerDataCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatedHrisDirectEmployeeContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatedHrisDirectEmployeeContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatedHrisDirectEmployeeContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatedHrisDirectEmployeeContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatedHrisDirectEmployeeContainerData>() {
           @Override
           public void write(JsonWriter out, CreatedHrisDirectEmployeeContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatedHrisDirectEmployeeContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreatedHrisDirectEmployeeContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatedHrisDirectEmployeeContainerData
   * @throws IOException if the JSON string is invalid with respect to CreatedHrisDirectEmployeeContainerData
   */
  public static CreatedHrisDirectEmployeeContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatedHrisDirectEmployeeContainerData.class);
  }

  /**
   * Convert an instance of CreatedHrisDirectEmployeeContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

