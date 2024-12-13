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
import org.openapitools.client.model.GPClient;
import org.openapitools.client.model.GPContractToCreateCompensationDetails;
import org.openapitools.client.model.GPContractToCreateEmployee;
import org.openapitools.client.model.GPContractToCreateEmployment;

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
 * GPContractToCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T11:33:27.931295037Z[GMT]", comments = "Generator version: 7.10.0")
public class GPContractToCreate {
  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  @javax.annotation.Nonnull
  private GPContractToCreateEmployee employee;

  public static final String SERIALIZED_NAME_EMPLOYMENT = "employment";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT)
  @javax.annotation.Nonnull
  private GPContractToCreateEmployment employment;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nonnull
  private String jobTitle;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nonnull
  private GPClient client;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private GPContractToCreateCompensationDetails compensationDetails;

  public GPContractToCreate() {
  }

  public GPContractToCreate employee(@javax.annotation.Nonnull GPContractToCreateEmployee employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
   */
  @javax.annotation.Nonnull
  public GPContractToCreateEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(@javax.annotation.Nonnull GPContractToCreateEmployee employee) {
    this.employee = employee;
  }


  public GPContractToCreate employment(@javax.annotation.Nonnull GPContractToCreateEmployment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   */
  @javax.annotation.Nonnull
  public GPContractToCreateEmployment getEmployment() {
    return employment;
  }

  public void setEmployment(@javax.annotation.Nonnull GPContractToCreateEmployment employment) {
    this.employment = employment;
  }


  public GPContractToCreate jobTitle(@javax.annotation.Nonnull String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Employee&#39;s job title.
   * @return jobTitle
   */
  @javax.annotation.Nonnull
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nonnull String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public GPContractToCreate client(@javax.annotation.Nonnull GPClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nonnull
  public GPClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nonnull GPClient client) {
    this.client = client;
  }


  public GPContractToCreate compensationDetails(@javax.annotation.Nonnull GPContractToCreateCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public GPContractToCreateCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull GPContractToCreateCompensationDetails compensationDetails) {
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
    GPContractToCreate gpContractToCreate = (GPContractToCreate) o;
    return Objects.equals(this.employee, gpContractToCreate.employee) &&
        Objects.equals(this.employment, gpContractToCreate.employment) &&
        Objects.equals(this.jobTitle, gpContractToCreate.jobTitle) &&
        Objects.equals(this.client, gpContractToCreate.client) &&
        Objects.equals(this.compensationDetails, gpContractToCreate.compensationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employee, employment, jobTitle, client, compensationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPContractToCreate {\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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
    openapiFields.add("employee");
    openapiFields.add("employment");
    openapiFields.add("job_title");
    openapiFields.add("client");
    openapiFields.add("compensation_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employee");
    openapiRequiredFields.add("employment");
    openapiRequiredFields.add("job_title");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("compensation_details");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GPContractToCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPContractToCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPContractToCreate is not found in the empty JSON string", GPContractToCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPContractToCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPContractToCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GPContractToCreate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `employee`
      GPContractToCreateEmployee.validateJsonElement(jsonObj.get("employee"));
      // validate the required field `employment`
      GPContractToCreateEmployment.validateJsonElement(jsonObj.get("employment"));
      if (!jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      // validate the required field `client`
      GPClient.validateJsonElement(jsonObj.get("client"));
      // validate the required field `compensation_details`
      GPContractToCreateCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPContractToCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPContractToCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPContractToCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPContractToCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<GPContractToCreate>() {
           @Override
           public void write(JsonWriter out, GPContractToCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPContractToCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GPContractToCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GPContractToCreate
   * @throws IOException if the JSON string is invalid with respect to GPContractToCreate
   */
  public static GPContractToCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPContractToCreate.class);
  }

  /**
   * Convert an instance of GPContractToCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

