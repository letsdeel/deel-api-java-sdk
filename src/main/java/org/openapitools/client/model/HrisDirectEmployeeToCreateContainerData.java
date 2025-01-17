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
import org.openapitools.client.model.HrisDirectEmployeeToCreateContainerDataClient;
import org.openapitools.client.model.HrisDirectEmployeeToCreateContainerDataCompensationDetails;
import org.openapitools.client.model.HrisDirectEmployeeToCreateContainerDataEmployee;
import org.openapitools.client.model.HrisDirectEmployeeToCreateContainerDataEmployment;
import org.openapitools.client.model.HrisDirectEmployeeToCreateContainerDataSeniority;

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
 * HrisDirectEmployeeToCreateContainerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class HrisDirectEmployeeToCreateContainerData {
  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  @javax.annotation.Nonnull
  private HrisDirectEmployeeToCreateContainerDataEmployee employee;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nonnull
  private HrisDirectEmployeeToCreateContainerDataClient client;

  public static final String SERIALIZED_NAME_EMPLOYMENT = "employment";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT)
  @javax.annotation.Nonnull
  private HrisDirectEmployeeToCreateContainerDataEmployment employment;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private HrisDirectEmployeeToCreateContainerDataCompensationDetails compensationDetails;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nonnull
  private HrisDirectEmployeeToCreateContainerDataSeniority seniority;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nonnull
  private HrisDirectEmployeeToCreateContainerDataSeniority jobTitle;

  public HrisDirectEmployeeToCreateContainerData() {
  }

  public HrisDirectEmployeeToCreateContainerData employee(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataEmployee employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
   */
  @javax.annotation.Nonnull
  public HrisDirectEmployeeToCreateContainerDataEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataEmployee employee) {
    this.employee = employee;
  }


  public HrisDirectEmployeeToCreateContainerData client(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nonnull
  public HrisDirectEmployeeToCreateContainerDataClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataClient client) {
    this.client = client;
  }


  public HrisDirectEmployeeToCreateContainerData employment(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataEmployment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   */
  @javax.annotation.Nonnull
  public HrisDirectEmployeeToCreateContainerDataEmployment getEmployment() {
    return employment;
  }

  public void setEmployment(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataEmployment employment) {
    this.employment = employment;
  }


  public HrisDirectEmployeeToCreateContainerData compensationDetails(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public HrisDirectEmployeeToCreateContainerDataCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
  }


  public HrisDirectEmployeeToCreateContainerData seniority(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataSeniority seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nonnull
  public HrisDirectEmployeeToCreateContainerDataSeniority getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataSeniority seniority) {
    this.seniority = seniority;
  }


  public HrisDirectEmployeeToCreateContainerData jobTitle(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataSeniority jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
   */
  @javax.annotation.Nonnull
  public HrisDirectEmployeeToCreateContainerDataSeniority getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nonnull HrisDirectEmployeeToCreateContainerDataSeniority jobTitle) {
    this.jobTitle = jobTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HrisDirectEmployeeToCreateContainerData hrisDirectEmployeeToCreateContainerData = (HrisDirectEmployeeToCreateContainerData) o;
    return Objects.equals(this.employee, hrisDirectEmployeeToCreateContainerData.employee) &&
        Objects.equals(this.client, hrisDirectEmployeeToCreateContainerData.client) &&
        Objects.equals(this.employment, hrisDirectEmployeeToCreateContainerData.employment) &&
        Objects.equals(this.compensationDetails, hrisDirectEmployeeToCreateContainerData.compensationDetails) &&
        Objects.equals(this.seniority, hrisDirectEmployeeToCreateContainerData.seniority) &&
        Objects.equals(this.jobTitle, hrisDirectEmployeeToCreateContainerData.jobTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employee, client, employment, compensationDetails, seniority, jobTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HrisDirectEmployeeToCreateContainerData {\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    compensationDetails: ").append(toIndentedString(compensationDetails)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
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
    openapiFields.add("client");
    openapiFields.add("employment");
    openapiFields.add("compensation_details");
    openapiFields.add("seniority");
    openapiFields.add("job_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employee");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("employment");
    openapiRequiredFields.add("compensation_details");
    openapiRequiredFields.add("seniority");
    openapiRequiredFields.add("job_title");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HrisDirectEmployeeToCreateContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HrisDirectEmployeeToCreateContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HrisDirectEmployeeToCreateContainerData is not found in the empty JSON string", HrisDirectEmployeeToCreateContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HrisDirectEmployeeToCreateContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HrisDirectEmployeeToCreateContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HrisDirectEmployeeToCreateContainerData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `employee`
      HrisDirectEmployeeToCreateContainerDataEmployee.validateJsonElement(jsonObj.get("employee"));
      // validate the required field `client`
      HrisDirectEmployeeToCreateContainerDataClient.validateJsonElement(jsonObj.get("client"));
      // validate the required field `employment`
      HrisDirectEmployeeToCreateContainerDataEmployment.validateJsonElement(jsonObj.get("employment"));
      // validate the required field `compensation_details`
      HrisDirectEmployeeToCreateContainerDataCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
      // validate the required field `seniority`
      HrisDirectEmployeeToCreateContainerDataSeniority.validateJsonElement(jsonObj.get("seniority"));
      // validate the required field `job_title`
      HrisDirectEmployeeToCreateContainerDataSeniority.validateJsonElement(jsonObj.get("job_title"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HrisDirectEmployeeToCreateContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HrisDirectEmployeeToCreateContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HrisDirectEmployeeToCreateContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HrisDirectEmployeeToCreateContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<HrisDirectEmployeeToCreateContainerData>() {
           @Override
           public void write(JsonWriter out, HrisDirectEmployeeToCreateContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HrisDirectEmployeeToCreateContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HrisDirectEmployeeToCreateContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HrisDirectEmployeeToCreateContainerData
   * @throws IOException if the JSON string is invalid with respect to HrisDirectEmployeeToCreateContainerData
   */
  public static HrisDirectEmployeeToCreateContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HrisDirectEmployeeToCreateContainerData.class);
  }

  /**
   * Convert an instance of HrisDirectEmployeeToCreateContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

