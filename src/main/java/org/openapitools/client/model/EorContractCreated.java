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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.ContractStatusEnum;
import org.openapitools.client.model.ContractTypeEnum;
import org.openapitools.client.model.CreateGPContract201ResponseDataClient;
import org.openapitools.client.model.EorContractCreatedCompensationDetails;
import org.openapitools.client.model.EorContractCreatedEmployee;
import org.openapitools.client.model.EorContractCreatedEmployment;
import org.openapitools.client.model.EorContractCreatedHealthPlan;
import org.openapitools.client.model.Seniority;
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
 * EorContractCreated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:29:34.997576605Z[GMT]", comments = "Generator version: 7.10.0")
public class EorContractCreated {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private ContractTypeEnum type;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private ContractStatusEnum status;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nullable
  private String jobTitle;

  public static final String SERIALIZED_NAME_EMPLOYMENT = "employment";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT)
  @javax.annotation.Nullable
  private EorContractCreatedEmployment employment;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nullable
  private CreateGPContract201ResponseDataClient client;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nullable
  private EorContractCreatedCompensationDetails compensationDetails;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  @javax.annotation.Nullable
  private EorContractCreatedEmployee employee;

  public static final String SERIALIZED_NAME_HEALTH_PLAN = "health_plan";
  @SerializedName(SERIALIZED_NAME_HEALTH_PLAN)
  @javax.annotation.Nullable
  private EorContractCreatedHealthPlan healthPlan;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nullable
  private Seniority seniority;

  public EorContractCreated() {
  }

  public EorContractCreated id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the contract quote created
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public EorContractCreated type(@javax.annotation.Nullable ContractTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public ContractTypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable ContractTypeEnum type) {
    this.type = type;
  }


  public EorContractCreated createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EorContractCreated status(@javax.annotation.Nullable ContractStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public ContractStatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable ContractStatusEnum status) {
    this.status = status;
  }


  public EorContractCreated jobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Employee&#39;s job title.
   * @return jobTitle
   */
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public EorContractCreated employment(@javax.annotation.Nullable EorContractCreatedEmployment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   */
  @javax.annotation.Nullable
  public EorContractCreatedEmployment getEmployment() {
    return employment;
  }

  public void setEmployment(@javax.annotation.Nullable EorContractCreatedEmployment employment) {
    this.employment = employment;
  }


  public EorContractCreated client(@javax.annotation.Nullable CreateGPContract201ResponseDataClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nullable
  public CreateGPContract201ResponseDataClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nullable CreateGPContract201ResponseDataClient client) {
    this.client = client;
  }


  public EorContractCreated compensationDetails(@javax.annotation.Nullable EorContractCreatedCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nullable
  public EorContractCreatedCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nullable EorContractCreatedCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
  }


  public EorContractCreated employee(@javax.annotation.Nullable EorContractCreatedEmployee employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
   */
  @javax.annotation.Nullable
  public EorContractCreatedEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(@javax.annotation.Nullable EorContractCreatedEmployee employee) {
    this.employee = employee;
  }


  public EorContractCreated healthPlan(@javax.annotation.Nullable EorContractCreatedHealthPlan healthPlan) {
    this.healthPlan = healthPlan;
    return this;
  }

  /**
   * Get healthPlan
   * @return healthPlan
   */
  @javax.annotation.Nullable
  public EorContractCreatedHealthPlan getHealthPlan() {
    return healthPlan;
  }

  public void setHealthPlan(@javax.annotation.Nullable EorContractCreatedHealthPlan healthPlan) {
    this.healthPlan = healthPlan;
  }


  public EorContractCreated seniority(@javax.annotation.Nullable Seniority seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
   */
  @javax.annotation.Nullable
  public Seniority getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nullable Seniority seniority) {
    this.seniority = seniority;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorContractCreated eorContractCreated = (EorContractCreated) o;
    return Objects.equals(this.id, eorContractCreated.id) &&
        Objects.equals(this.type, eorContractCreated.type) &&
        Objects.equals(this.createdAt, eorContractCreated.createdAt) &&
        Objects.equals(this.status, eorContractCreated.status) &&
        Objects.equals(this.jobTitle, eorContractCreated.jobTitle) &&
        Objects.equals(this.employment, eorContractCreated.employment) &&
        Objects.equals(this.client, eorContractCreated.client) &&
        Objects.equals(this.compensationDetails, eorContractCreated.compensationDetails) &&
        Objects.equals(this.employee, eorContractCreated.employee) &&
        Objects.equals(this.healthPlan, eorContractCreated.healthPlan) &&
        Objects.equals(this.seniority, eorContractCreated.seniority);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, createdAt, status, jobTitle, employment, client, compensationDetails, employee, healthPlan, seniority);
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
    sb.append("class EorContractCreated {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    compensationDetails: ").append(toIndentedString(compensationDetails)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    healthPlan: ").append(toIndentedString(healthPlan)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("created_at");
    openapiFields.add("status");
    openapiFields.add("job_title");
    openapiFields.add("employment");
    openapiFields.add("client");
    openapiFields.add("compensation_details");
    openapiFields.add("employee");
    openapiFields.add("health_plan");
    openapiFields.add("seniority");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorContractCreated
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorContractCreated.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorContractCreated is not found in the empty JSON string", EorContractCreated.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorContractCreated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorContractCreated` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        ContractTypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        ContractStatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("job_title") != null && !jsonObj.get("job_title").isJsonNull()) && !jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      // validate the optional field `employment`
      if (jsonObj.get("employment") != null && !jsonObj.get("employment").isJsonNull()) {
        EorContractCreatedEmployment.validateJsonElement(jsonObj.get("employment"));
      }
      // validate the optional field `client`
      if (jsonObj.get("client") != null && !jsonObj.get("client").isJsonNull()) {
        CreateGPContract201ResponseDataClient.validateJsonElement(jsonObj.get("client"));
      }
      // validate the optional field `compensation_details`
      if (jsonObj.get("compensation_details") != null && !jsonObj.get("compensation_details").isJsonNull()) {
        EorContractCreatedCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
      }
      // validate the optional field `employee`
      if (jsonObj.get("employee") != null && !jsonObj.get("employee").isJsonNull()) {
        EorContractCreatedEmployee.validateJsonElement(jsonObj.get("employee"));
      }
      // validate the optional field `health_plan`
      if (jsonObj.get("health_plan") != null && !jsonObj.get("health_plan").isJsonNull()) {
        EorContractCreatedHealthPlan.validateJsonElement(jsonObj.get("health_plan"));
      }
      // validate the optional field `seniority`
      if (jsonObj.get("seniority") != null && !jsonObj.get("seniority").isJsonNull()) {
        Seniority.validateJsonElement(jsonObj.get("seniority"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorContractCreated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorContractCreated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorContractCreated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorContractCreated.class));

       return (TypeAdapter<T>) new TypeAdapter<EorContractCreated>() {
           @Override
           public void write(JsonWriter out, EorContractCreated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorContractCreated read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorContractCreated given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorContractCreated
   * @throws IOException if the JSON string is invalid with respect to EorContractCreated
   */
  public static EorContractCreated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorContractCreated.class);
  }

  /**
   * Convert an instance of EorContractCreated to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

