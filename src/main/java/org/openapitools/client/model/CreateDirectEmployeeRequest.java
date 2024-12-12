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
import org.openapitools.client.model.CreateDirectEmployeeRequestClient;
import org.openapitools.client.model.CreateDirectEmployeeRequestCompensationDetails;
import org.openapitools.client.model.CreateDirectEmployeeRequestEmployee;
import org.openapitools.client.model.CreateDirectEmployeeRequestEmployment;
import org.openapitools.client.model.CreateDirectEmployeeRequestJobTitle;
import org.openapitools.client.model.CreateDirectEmployeeRequestSeniority;

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
 * CreateDirectEmployeeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T13:30:33.173921421Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateDirectEmployeeRequest {
  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestClient client;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestEmployee employee;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestJobTitle jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestSeniority seniority;

  public static final String SERIALIZED_NAME_EMPLOYMENT = "employment";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestEmployment employment;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private CreateDirectEmployeeRequestCompensationDetails compensationDetails;

  public CreateDirectEmployeeRequest() {
  }

  public CreateDirectEmployeeRequest client(@javax.annotation.Nonnull CreateDirectEmployeeRequestClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nonnull CreateDirectEmployeeRequestClient client) {
    this.client = client;
  }


  public CreateDirectEmployeeRequest employee(@javax.annotation.Nonnull CreateDirectEmployeeRequestEmployee employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(@javax.annotation.Nonnull CreateDirectEmployeeRequestEmployee employee) {
    this.employee = employee;
  }


  public CreateDirectEmployeeRequest jobTitle(@javax.annotation.Nonnull CreateDirectEmployeeRequestJobTitle jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestJobTitle getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nonnull CreateDirectEmployeeRequestJobTitle jobTitle) {
    this.jobTitle = jobTitle;
  }


  public CreateDirectEmployeeRequest seniority(@javax.annotation.Nonnull CreateDirectEmployeeRequestSeniority seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestSeniority getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nonnull CreateDirectEmployeeRequestSeniority seniority) {
    this.seniority = seniority;
  }


  public CreateDirectEmployeeRequest employment(@javax.annotation.Nonnull CreateDirectEmployeeRequestEmployment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestEmployment getEmployment() {
    return employment;
  }

  public void setEmployment(@javax.annotation.Nonnull CreateDirectEmployeeRequestEmployment employment) {
    this.employment = employment;
  }


  public CreateDirectEmployeeRequest compensationDetails(@javax.annotation.Nonnull CreateDirectEmployeeRequestCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public CreateDirectEmployeeRequestCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull CreateDirectEmployeeRequestCompensationDetails compensationDetails) {
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
    CreateDirectEmployeeRequest createDirectEmployeeRequest = (CreateDirectEmployeeRequest) o;
    return Objects.equals(this.client, createDirectEmployeeRequest.client) &&
        Objects.equals(this.employee, createDirectEmployeeRequest.employee) &&
        Objects.equals(this.jobTitle, createDirectEmployeeRequest.jobTitle) &&
        Objects.equals(this.seniority, createDirectEmployeeRequest.seniority) &&
        Objects.equals(this.employment, createDirectEmployeeRequest.employment) &&
        Objects.equals(this.compensationDetails, createDirectEmployeeRequest.compensationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, employee, jobTitle, seniority, employment, compensationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDirectEmployeeRequest {\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
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
    openapiFields.add("job_title");
    openapiFields.add("seniority");
    openapiFields.add("employment");
    openapiFields.add("compensation_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("employee");
    openapiRequiredFields.add("job_title");
    openapiRequiredFields.add("seniority");
    openapiRequiredFields.add("employment");
    openapiRequiredFields.add("compensation_details");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateDirectEmployeeRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDirectEmployeeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDirectEmployeeRequest is not found in the empty JSON string", CreateDirectEmployeeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDirectEmployeeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDirectEmployeeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDirectEmployeeRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `client`
      CreateDirectEmployeeRequestClient.validateJsonElement(jsonObj.get("client"));
      // validate the required field `employee`
      CreateDirectEmployeeRequestEmployee.validateJsonElement(jsonObj.get("employee"));
      // validate the required field `job_title`
      CreateDirectEmployeeRequestJobTitle.validateJsonElement(jsonObj.get("job_title"));
      // validate the required field `seniority`
      CreateDirectEmployeeRequestSeniority.validateJsonElement(jsonObj.get("seniority"));
      // validate the required field `employment`
      CreateDirectEmployeeRequestEmployment.validateJsonElement(jsonObj.get("employment"));
      // validate the required field `compensation_details`
      CreateDirectEmployeeRequestCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDirectEmployeeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDirectEmployeeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDirectEmployeeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDirectEmployeeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDirectEmployeeRequest>() {
           @Override
           public void write(JsonWriter out, CreateDirectEmployeeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDirectEmployeeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateDirectEmployeeRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateDirectEmployeeRequest
   * @throws IOException if the JSON string is invalid with respect to CreateDirectEmployeeRequest
   */
  public static CreateDirectEmployeeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDirectEmployeeRequest.class);
  }

  /**
   * Convert an instance of CreateDirectEmployeeRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

