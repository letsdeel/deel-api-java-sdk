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
import org.openapitools.client.model.CreateEorContractRequestClient;
import org.openapitools.client.model.CreateEorContractRequestClientLegalEntity;
import org.openapitools.client.model.CreateEorContractRequestCompensationDetails;
import org.openapitools.client.model.CreateEorContractRequestEmployee;
import org.openapitools.client.model.CreateEorContractRequestEmployment;
import org.openapitools.client.model.CreateEorContractRequestPension;
import org.openapitools.client.model.CreateEorContractRequestQuoteAdditionalFields;
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
 * CreateEorContractRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:40:51.396070831Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateEorContractRequest {
  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nonnull
  private CreateEorContractRequestClient client;

  public static final String SERIALIZED_NAME_PENSION = "pension";
  @SerializedName(SERIALIZED_NAME_PENSION)
  @javax.annotation.Nullable
  private CreateEorContractRequestPension pension;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  @javax.annotation.Nonnull
  private CreateEorContractRequestEmployee employee;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nonnull
  private String jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nonnull
  private CreateEorContractRequestClientLegalEntity seniority;

  public static final String SERIALIZED_NAME_EMPLOYMENT = "employment";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT)
  @javax.annotation.Nonnull
  private CreateEorContractRequestEmployment employment;

  public static final String SERIALIZED_NAME_HEALTH_PLAN_ID = "health_plan_id";
  @SerializedName(SERIALIZED_NAME_HEALTH_PLAN_ID)
  @javax.annotation.Nullable
  private String healthPlanId;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private CreateEorContractRequestCompensationDetails compensationDetails;

  public static final String SERIALIZED_NAME_QUOTE_ADDITIONAL_FIELDS = "quote_additional_fields";
  @SerializedName(SERIALIZED_NAME_QUOTE_ADDITIONAL_FIELDS)
  @javax.annotation.Nullable
  private CreateEorContractRequestQuoteAdditionalFields quoteAdditionalFields;

  public CreateEorContractRequest() {
  }

  public CreateEorContractRequest client(@javax.annotation.Nonnull CreateEorContractRequestClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nonnull
  public CreateEorContractRequestClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nonnull CreateEorContractRequestClient client) {
    this.client = client;
  }


  public CreateEorContractRequest pension(@javax.annotation.Nullable CreateEorContractRequestPension pension) {
    this.pension = pension;
    return this;
  }

  /**
   * Get pension
   * @return pension
   */
  @javax.annotation.Nullable
  public CreateEorContractRequestPension getPension() {
    return pension;
  }

  public void setPension(@javax.annotation.Nullable CreateEorContractRequestPension pension) {
    this.pension = pension;
  }


  public CreateEorContractRequest employee(@javax.annotation.Nonnull CreateEorContractRequestEmployee employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
   */
  @javax.annotation.Nonnull
  public CreateEorContractRequestEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(@javax.annotation.Nonnull CreateEorContractRequestEmployee employee) {
    this.employee = employee;
  }


  public CreateEorContractRequest jobTitle(@javax.annotation.Nonnull String jobTitle) {
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


  public CreateEorContractRequest seniority(@javax.annotation.Nonnull CreateEorContractRequestClientLegalEntity seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nonnull
  public CreateEorContractRequestClientLegalEntity getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nonnull CreateEorContractRequestClientLegalEntity seniority) {
    this.seniority = seniority;
  }


  public CreateEorContractRequest employment(@javax.annotation.Nonnull CreateEorContractRequestEmployment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   */
  @javax.annotation.Nonnull
  public CreateEorContractRequestEmployment getEmployment() {
    return employment;
  }

  public void setEmployment(@javax.annotation.Nonnull CreateEorContractRequestEmployment employment) {
    this.employment = employment;
  }


  public CreateEorContractRequest healthPlanId(@javax.annotation.Nullable String healthPlanId) {
    this.healthPlanId = healthPlanId;
    return this;
  }

  /**
   * Healthcare plan id. You can see available healthcare plans in the country guide endpoint.
   * @return healthPlanId
   */
  @javax.annotation.Nullable
  public String getHealthPlanId() {
    return healthPlanId;
  }

  public void setHealthPlanId(@javax.annotation.Nullable String healthPlanId) {
    this.healthPlanId = healthPlanId;
  }


  public CreateEorContractRequest compensationDetails(@javax.annotation.Nonnull CreateEorContractRequestCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public CreateEorContractRequestCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull CreateEorContractRequestCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
  }


  public CreateEorContractRequest quoteAdditionalFields(@javax.annotation.Nullable CreateEorContractRequestQuoteAdditionalFields quoteAdditionalFields) {
    this.quoteAdditionalFields = quoteAdditionalFields;
    return this;
  }

  /**
   * Get quoteAdditionalFields
   * @return quoteAdditionalFields
   */
  @javax.annotation.Nullable
  public CreateEorContractRequestQuoteAdditionalFields getQuoteAdditionalFields() {
    return quoteAdditionalFields;
  }

  public void setQuoteAdditionalFields(@javax.annotation.Nullable CreateEorContractRequestQuoteAdditionalFields quoteAdditionalFields) {
    this.quoteAdditionalFields = quoteAdditionalFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEorContractRequest createEorContractRequest = (CreateEorContractRequest) o;
    return Objects.equals(this.client, createEorContractRequest.client) &&
        Objects.equals(this.pension, createEorContractRequest.pension) &&
        Objects.equals(this.employee, createEorContractRequest.employee) &&
        Objects.equals(this.jobTitle, createEorContractRequest.jobTitle) &&
        Objects.equals(this.seniority, createEorContractRequest.seniority) &&
        Objects.equals(this.employment, createEorContractRequest.employment) &&
        Objects.equals(this.healthPlanId, createEorContractRequest.healthPlanId) &&
        Objects.equals(this.compensationDetails, createEorContractRequest.compensationDetails) &&
        Objects.equals(this.quoteAdditionalFields, createEorContractRequest.quoteAdditionalFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, pension, employee, jobTitle, seniority, employment, healthPlanId, compensationDetails, quoteAdditionalFields);
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
    sb.append("class CreateEorContractRequest {\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    pension: ").append(toIndentedString(pension)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    healthPlanId: ").append(toIndentedString(healthPlanId)).append("\n");
    sb.append("    compensationDetails: ").append(toIndentedString(compensationDetails)).append("\n");
    sb.append("    quoteAdditionalFields: ").append(toIndentedString(quoteAdditionalFields)).append("\n");
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
    openapiFields.add("pension");
    openapiFields.add("employee");
    openapiFields.add("job_title");
    openapiFields.add("seniority");
    openapiFields.add("employment");
    openapiFields.add("health_plan_id");
    openapiFields.add("compensation_details");
    openapiFields.add("quote_additional_fields");

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
   * @throws IOException if the JSON Element is invalid with respect to CreateEorContractRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEorContractRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEorContractRequest is not found in the empty JSON string", CreateEorContractRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEorContractRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEorContractRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEorContractRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `client`
      CreateEorContractRequestClient.validateJsonElement(jsonObj.get("client"));
      // validate the optional field `pension`
      if (jsonObj.get("pension") != null && !jsonObj.get("pension").isJsonNull()) {
        CreateEorContractRequestPension.validateJsonElement(jsonObj.get("pension"));
      }
      // validate the required field `employee`
      CreateEorContractRequestEmployee.validateJsonElement(jsonObj.get("employee"));
      if (!jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      // validate the required field `seniority`
      CreateEorContractRequestClientLegalEntity.validateJsonElement(jsonObj.get("seniority"));
      // validate the required field `employment`
      CreateEorContractRequestEmployment.validateJsonElement(jsonObj.get("employment"));
      if ((jsonObj.get("health_plan_id") != null && !jsonObj.get("health_plan_id").isJsonNull()) && !jsonObj.get("health_plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_plan_id").toString()));
      }
      // validate the required field `compensation_details`
      CreateEorContractRequestCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
      // validate the optional field `quote_additional_fields`
      if (jsonObj.get("quote_additional_fields") != null && !jsonObj.get("quote_additional_fields").isJsonNull()) {
        CreateEorContractRequestQuoteAdditionalFields.validateJsonElement(jsonObj.get("quote_additional_fields"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEorContractRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEorContractRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEorContractRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEorContractRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEorContractRequest>() {
           @Override
           public void write(JsonWriter out, CreateEorContractRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEorContractRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEorContractRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEorContractRequest
   * @throws IOException if the JSON string is invalid with respect to CreateEorContractRequest
   */
  public static CreateEorContractRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEorContractRequest.class);
  }

  /**
   * Convert an instance of CreateEorContractRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

