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
import org.openapitools.client.model.CreateDirectEmployeeRequestDataClient;
import org.openapitools.client.model.CreateDirectEmployeeRequestDataCompensationDetails;
import org.openapitools.client.model.CreateDirectEmployeeRequestDataEmployee;
import org.openapitools.client.model.CreateDirectEmployeeRequestDataEmployment;

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
 * CreateDirectEmployeeRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateDirectEmployeeRequestData {
  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestDataClient client;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestDataEmployee employee;

  public static final String SERIALIZED_NAME_EMPLOYMENT = "employment";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestDataEmployment employment;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestDataCompensationDetails compensationDetails;

  public CreateDirectEmployeeRequestData() {
  }

  public CreateDirectEmployeeRequestData client(@javax.annotation.Nonnull CreateDirectEmployeeRequestDataClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestDataClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nonnull CreateDirectEmployeeRequestDataClient client) {
    this.client = client;
  }


  public CreateDirectEmployeeRequestData employee(@javax.annotation.Nonnull CreateDirectEmployeeRequestDataEmployee employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestDataEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(@javax.annotation.Nonnull CreateDirectEmployeeRequestDataEmployee employee) {
    this.employee = employee;
  }


  public CreateDirectEmployeeRequestData employment(@javax.annotation.Nonnull CreateDirectEmployeeRequestDataEmployment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestDataEmployment getEmployment() {
    return employment;
  }

  public void setEmployment(@javax.annotation.Nonnull CreateDirectEmployeeRequestDataEmployment employment) {
    this.employment = employment;
  }


  public CreateDirectEmployeeRequestData compensationDetails(@javax.annotation.Nonnull CreateDirectEmployeeRequestDataCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestDataCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull CreateDirectEmployeeRequestDataCompensationDetails compensationDetails) {
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
    CreateDirectEmployeeRequestData createDirectEmployeeRequestData = (CreateDirectEmployeeRequestData) o;
    return Objects.equals(this.client, createDirectEmployeeRequestData.client) &&
        Objects.equals(this.employee, createDirectEmployeeRequestData.employee) &&
        Objects.equals(this.employment, createDirectEmployeeRequestData.employment) &&
        Objects.equals(this.compensationDetails, createDirectEmployeeRequestData.compensationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, employee, employment, compensationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDirectEmployeeRequestData {\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
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
    openapiFields.add("client");
    openapiFields.add("employee");
    openapiFields.add("employment");
    openapiFields.add("compensation_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("employee");
    openapiRequiredFields.add("employment");
    openapiRequiredFields.add("compensation_details");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateDirectEmployeeRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDirectEmployeeRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDirectEmployeeRequestData is not found in the empty JSON string", CreateDirectEmployeeRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDirectEmployeeRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDirectEmployeeRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDirectEmployeeRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `client`
      CreateDirectEmployeeRequestDataClient.validateJsonElement(jsonObj.get("client"));
      // validate the required field `employee`
      CreateDirectEmployeeRequestDataEmployee.validateJsonElement(jsonObj.get("employee"));
      // validate the required field `employment`
      CreateDirectEmployeeRequestDataEmployment.validateJsonElement(jsonObj.get("employment"));
      // validate the required field `compensation_details`
      CreateDirectEmployeeRequestDataCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDirectEmployeeRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDirectEmployeeRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDirectEmployeeRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDirectEmployeeRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDirectEmployeeRequestData>() {
           @Override
           public void write(JsonWriter out, CreateDirectEmployeeRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDirectEmployeeRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateDirectEmployeeRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateDirectEmployeeRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateDirectEmployeeRequestData
   */
  public static CreateDirectEmployeeRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDirectEmployeeRequestData.class);
  }

  /**
   * Convert an instance of CreateDirectEmployeeRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

