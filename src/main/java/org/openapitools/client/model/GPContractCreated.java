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
import org.openapitools.client.model.GPContractCreatedCompensationDetails;
import org.openapitools.client.model.GPContractCreatedEmployee;
import org.openapitools.client.model.GPContractCreatedEmployment;
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
 * GPContractCreated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:06:48.603230199Z[GMT]", comments = "Generator version: 7.10.0")
public class GPContractCreated {
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
  private GPContractCreatedEmployment employment;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nullable
  private CreateGPContract201ResponseDataClient client;

  public static final String SERIALIZED_NAME_COMPENSATION_DETAILS = "compensation_details";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_DETAILS)
  @javax.annotation.Nullable
  private GPContractCreatedCompensationDetails compensationDetails;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  @javax.annotation.Nullable
  private GPContractCreatedEmployee employee;

  public GPContractCreated() {
  }

  public GPContractCreated id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the contract created.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GPContractCreated type(@javax.annotation.Nullable ContractTypeEnum type) {
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


  public GPContractCreated createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
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


  public GPContractCreated status(@javax.annotation.Nullable ContractStatusEnum status) {
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


  public GPContractCreated jobTitle(@javax.annotation.Nullable String jobTitle) {
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


  public GPContractCreated employment(@javax.annotation.Nullable GPContractCreatedEmployment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   */
  @javax.annotation.Nullable
  public GPContractCreatedEmployment getEmployment() {
    return employment;
  }

  public void setEmployment(@javax.annotation.Nullable GPContractCreatedEmployment employment) {
    this.employment = employment;
  }


  public GPContractCreated client(@javax.annotation.Nullable CreateGPContract201ResponseDataClient client) {
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


  public GPContractCreated compensationDetails(@javax.annotation.Nullable GPContractCreatedCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
    return this;
  }

  /**
   * Get compensationDetails
   * @return compensationDetails
   */
  @javax.annotation.Nullable
  public GPContractCreatedCompensationDetails getCompensationDetails() {
    return compensationDetails;
  }

  public void setCompensationDetails(@javax.annotation.Nullable GPContractCreatedCompensationDetails compensationDetails) {
    this.compensationDetails = compensationDetails;
  }


  public GPContractCreated employee(@javax.annotation.Nullable GPContractCreatedEmployee employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
   */
  @javax.annotation.Nullable
  public GPContractCreatedEmployee getEmployee() {
    return employee;
  }

  public void setEmployee(@javax.annotation.Nullable GPContractCreatedEmployee employee) {
    this.employee = employee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPContractCreated gpContractCreated = (GPContractCreated) o;
    return Objects.equals(this.id, gpContractCreated.id) &&
        Objects.equals(this.type, gpContractCreated.type) &&
        Objects.equals(this.createdAt, gpContractCreated.createdAt) &&
        Objects.equals(this.status, gpContractCreated.status) &&
        Objects.equals(this.jobTitle, gpContractCreated.jobTitle) &&
        Objects.equals(this.employment, gpContractCreated.employment) &&
        Objects.equals(this.client, gpContractCreated.client) &&
        Objects.equals(this.compensationDetails, gpContractCreated.compensationDetails) &&
        Objects.equals(this.employee, gpContractCreated.employee);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, createdAt, status, jobTitle, employment, client, compensationDetails, employee);
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
    sb.append("class GPContractCreated {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    compensationDetails: ").append(toIndentedString(compensationDetails)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GPContractCreated
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPContractCreated.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPContractCreated is not found in the empty JSON string", GPContractCreated.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPContractCreated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPContractCreated` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
        GPContractCreatedEmployment.validateJsonElement(jsonObj.get("employment"));
      }
      // validate the optional field `client`
      if (jsonObj.get("client") != null && !jsonObj.get("client").isJsonNull()) {
        CreateGPContract201ResponseDataClient.validateJsonElement(jsonObj.get("client"));
      }
      // validate the optional field `compensation_details`
      if (jsonObj.get("compensation_details") != null && !jsonObj.get("compensation_details").isJsonNull()) {
        GPContractCreatedCompensationDetails.validateJsonElement(jsonObj.get("compensation_details"));
      }
      // validate the optional field `employee`
      if (jsonObj.get("employee") != null && !jsonObj.get("employee").isJsonNull()) {
        GPContractCreatedEmployee.validateJsonElement(jsonObj.get("employee"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPContractCreated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPContractCreated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPContractCreated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPContractCreated.class));

       return (TypeAdapter<T>) new TypeAdapter<GPContractCreated>() {
           @Override
           public void write(JsonWriter out, GPContractCreated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPContractCreated read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GPContractCreated given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GPContractCreated
   * @throws IOException if the JSON string is invalid with respect to GPContractCreated
   */
  public static GPContractCreated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPContractCreated.class);
  }

  /**
   * Convert an instance of GPContractCreated to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

