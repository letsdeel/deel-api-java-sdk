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
import org.openapitools.client.model.EorContractToCreateClient;
import org.openapitools.client.model.EorContractToCreateCompensationDetails;
import org.openapitools.client.model.EorContractToCreateEmployee;
import org.openapitools.client.model.EorContractToCreateEmployment;
import org.openapitools.client.model.EorContractToCreateQuoteAdditionalFields;
import org.openapitools.client.model.EorContractToCreateSeniority;
import org.openapitools.client.model.PensionEORContractToCreate;
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
 * EorContractToCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class EorContractToCreate {
  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  @javax.annotation.Nonnull
  private EorContractToCreateEmployee employee;

  public static final String SERIALIZED_NAME_EMPLOYMENT = "employment";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT)
  @javax.annotation.Nonnull
  private EorContractToCreateEmployment employment;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nonnull
  private String jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nonnull
  private EorContractToCreateSeniority seniority;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nonnull
  private EorContractToCreateClient client;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nonnull
  private EorContractToCreateCompensationDetails compensationDetails;

  public static final String SERIALIZED_NAME_QUOTE_ADDITIONAL_FIELDS = "quote_additional_fields";
  @SerializedName(SERIALIZED_NAME_QUOTE_ADDITIONAL_FIELDS)
  @javax.annotation.Nullable
  private EorContractToCreateQuoteAdditionalFields quoteAdditionalFields;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "provider_id";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  @javax.annotation.Nullable
  private String providerId;

  public static final String SERIALIZED_NAME_HEALTH_PLAN_ID = "health_plan_id";
  @SerializedName(SERIALIZED_NAME_HEALTH_PLAN_ID)
  @javax.annotation.Nullable
  private String healthPlanId;

  public static final String SERIALIZED_NAME_PENSION = "pension";
  @SerializedName(SERIALIZED_NAME_PENSION)
  @javax.annotation.Nullable
  private PensionEORContractToCreate pension;

  public EorContractToCreate() {
  }

  public EorContractToCreate employee(@javax.annotation.Nonnull EorContractToCreateEmployee employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
   */
  @javax.annotation.Nonnull
  public EorContractToCreateEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(@javax.annotation.Nonnull EorContractToCreateEmployee employee) {
    this.employee = employee;
  }


  public EorContractToCreate employment(@javax.annotation.Nonnull EorContractToCreateEmployment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   */
  @javax.annotation.Nonnull
  public EorContractToCreateEmployment getEmployment() {
    return employment;
  }

  public void setEmployment(@javax.annotation.Nonnull EorContractToCreateEmployment employment) {
    this.employment = employment;
  }


  public EorContractToCreate jobTitle(@javax.annotation.Nonnull String jobTitle) {
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


  public EorContractToCreate seniority(@javax.annotation.Nonnull EorContractToCreateSeniority seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nonnull
  public EorContractToCreateSeniority getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nonnull EorContractToCreateSeniority seniority) {
    this.seniority = seniority;
  }


  public EorContractToCreate client(@javax.annotation.Nonnull EorContractToCreateClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nonnull
  public EorContractToCreateClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nonnull EorContractToCreateClient client) {
    this.client = client;
  }


  public EorContractToCreate compensationDetails(@javax.annotation.Nonnull EorContractToCreateCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nonnull
  public EorContractToCreateCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nonnull EorContractToCreateCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
  }


  public EorContractToCreate quoteAdditionalFields(@javax.annotation.Nullable EorContractToCreateQuoteAdditionalFields quoteAdditionalFields) {
    this.quoteAdditionalFields = quoteAdditionalFields;
    return this;
  }

  /**
   * Get quoteAdditionalFields
   * @return quoteAdditionalFields
   */
  @javax.annotation.Nullable
  public EorContractToCreateQuoteAdditionalFields getQuoteAdditionalFields() {
    return quoteAdditionalFields;
  }

  public void setQuoteAdditionalFields(@javax.annotation.Nullable EorContractToCreateQuoteAdditionalFields quoteAdditionalFields) {
    this.quoteAdditionalFields = quoteAdditionalFields;
  }


  public EorContractToCreate providerId(@javax.annotation.Nullable String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Provider id. You can see available providers in the country guide endpoint.
   * @return providerId
   */
  @javax.annotation.Nullable
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(@javax.annotation.Nullable String providerId) {
    this.providerId = providerId;
  }


  public EorContractToCreate healthPlanId(@javax.annotation.Nullable String healthPlanId) {
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


  public EorContractToCreate pension(@javax.annotation.Nullable PensionEORContractToCreate pension) {
    this.pension = pension;
    return this;
  }

  /**
   * Get pension
   * @return pension
   */
  @javax.annotation.Nullable
  public PensionEORContractToCreate getPension() {
    return pension;
  }

  public void setPension(@javax.annotation.Nullable PensionEORContractToCreate pension) {
    this.pension = pension;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorContractToCreate eorContractToCreate = (EorContractToCreate) o;
    return Objects.equals(this.employee, eorContractToCreate.employee) &&
        Objects.equals(this.employment, eorContractToCreate.employment) &&
        Objects.equals(this.jobTitle, eorContractToCreate.jobTitle) &&
        Objects.equals(this.seniority, eorContractToCreate.seniority) &&
        Objects.equals(this.client, eorContractToCreate.client) &&
        Objects.equals(this.compensationDetails, eorContractToCreate.compensationDetails) &&
        Objects.equals(this.quoteAdditionalFields, eorContractToCreate.quoteAdditionalFields) &&
        Objects.equals(this.providerId, eorContractToCreate.providerId) &&
        Objects.equals(this.healthPlanId, eorContractToCreate.healthPlanId) &&
        Objects.equals(this.pension, eorContractToCreate.pension);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employee, employment, jobTitle, seniority, client, compensationDetails, quoteAdditionalFields, providerId, healthPlanId, pension);
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
    sb.append("class EorContractToCreate {\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    compensationDetails: ").append(toIndentedString(compensationDetails)).append("\n");
    sb.append("    quoteAdditionalFields: ").append(toIndentedString(quoteAdditionalFields)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    healthPlanId: ").append(toIndentedString(healthPlanId)).append("\n");
    sb.append("    pension: ").append(toIndentedString(pension)).append("\n");
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
    openapiFields.add("seniority");
    openapiFields.add("client");
    openapiFields.add("compensation_details");
    openapiFields.add("quote_additional_fields");
    openapiFields.add("provider_id");
    openapiFields.add("health_plan_id");
    openapiFields.add("pension");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employee");
    openapiRequiredFields.add("employment");
    openapiRequiredFields.add("job_title");
    openapiRequiredFields.add("seniority");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("compensation_details");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorContractToCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorContractToCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorContractToCreate is not found in the empty JSON string", EorContractToCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorContractToCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorContractToCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EorContractToCreate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `employee`
      EorContractToCreateEmployee.validateJsonElement(jsonObj.get("employee"));
      // validate the required field `employment`
      EorContractToCreateEmployment.validateJsonElement(jsonObj.get("employment"));
      if (!jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      // validate the required field `seniority`
      EorContractToCreateSeniority.validateJsonElement(jsonObj.get("seniority"));
      // validate the required field `client`
      EorContractToCreateClient.validateJsonElement(jsonObj.get("client"));
      // validate the required field `compensation_details`
      EorContractToCreateCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
      // validate the optional field `quote_additional_fields`
      if (jsonObj.get("quote_additional_fields") != null && !jsonObj.get("quote_additional_fields").isJsonNull()) {
        EorContractToCreateQuoteAdditionalFields.validateJsonElement(jsonObj.get("quote_additional_fields"));
      }
      if ((jsonObj.get("provider_id") != null && !jsonObj.get("provider_id").isJsonNull()) && !jsonObj.get("provider_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_id").toString()));
      }
      if ((jsonObj.get("health_plan_id") != null && !jsonObj.get("health_plan_id").isJsonNull()) && !jsonObj.get("health_plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_plan_id").toString()));
      }
      // validate the optional field `pension`
      if (jsonObj.get("pension") != null && !jsonObj.get("pension").isJsonNull()) {
        PensionEORContractToCreate.validateJsonElement(jsonObj.get("pension"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorContractToCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorContractToCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorContractToCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorContractToCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<EorContractToCreate>() {
           @Override
           public void write(JsonWriter out, EorContractToCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorContractToCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorContractToCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorContractToCreate
   * @throws IOException if the JSON string is invalid with respect to EorContractToCreate
   */
  public static EorContractToCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorContractToCreate.class);
  }

  /**
   * Convert an instance of EorContractToCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

