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
import org.openapitools.client.model.GetBenefitEmployee200ResponseContractsInnerCompensationsInner;

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
 * GetBenefitEmployee200ResponseContractsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T11:33:27.931295037Z[GMT]", comments = "Generator version: 7.10.0")
public class GetBenefitEmployee200ResponseContractsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_FLSA = "flsa";
  @SerializedName(SERIALIZED_NAME_FLSA)
  @javax.annotation.Nullable
  private Boolean flsa;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private String endDate;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nullable
  private String jobTitle;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private String startDate;

  public static final String SERIALIZED_NAME_COMPENSATIONS = "compensations";
  @SerializedName(SERIALIZED_NAME_COMPENSATIONS)
  @javax.annotation.Nullable
  private List<GetBenefitEmployee200ResponseContractsInnerCompensationsInner> compensations = new ArrayList<>();

  /**
   * The type of contract.
   */
  @JsonAdapter(ContractTypeEnum.Adapter.class)
  public enum ContractTypeEnum {
    DIRECT_EMPLOYEE("direct_employee"),
    
    CONTRACTOR("contractor");

    private String value;

    ContractTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContractTypeEnum fromValue(String value) {
      for (ContractTypeEnum b : ContractTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContractTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContractTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContractTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContractTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ContractTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONTRACT_TYPE = "contract_type";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPE)
  @javax.annotation.Nullable
  private ContractTypeEnum contractType;

  /**
   * The employment type, e.g., full-time or part-time.
   */
  @JsonAdapter(EmploymentTypeEnum.Adapter.class)
  public enum EmploymentTypeEnum {
    FULL_TIME("full_time"),
    
    PART_TIME("part_time");

    private String value;

    EmploymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmploymentTypeEnum fromValue(String value) {
      for (EmploymentTypeEnum b : EmploymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EmploymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmploymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmploymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmploymentTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EmploymentTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EMPLOYMENT_TYPE = "employment_type";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_TYPE)
  @javax.annotation.Nullable
  private EmploymentTypeEnum employmentType;

  public static final String SERIALIZED_NAME_ESTIMATED_WEEK_WORKING_HOURS = "estimated_week_working_hours";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_WEEK_WORKING_HOURS)
  @javax.annotation.Nullable
  private BigDecimal estimatedWeekWorkingHours;

  public GetBenefitEmployee200ResponseContractsInner() {
  }

  public GetBenefitEmployee200ResponseContractsInner id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the contract.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetBenefitEmployee200ResponseContractsInner flsa(@javax.annotation.Nullable Boolean flsa) {
    this.flsa = flsa;
    return this;
  }

  /**
   * Indicates if the contract is compliant with the Fair Labor Standards Act.
   * @return flsa
   */
  @javax.annotation.Nullable
  public Boolean getFlsa() {
    return flsa;
  }

  public void setFlsa(@javax.annotation.Nullable Boolean flsa) {
    this.flsa = flsa;
  }


  public GetBenefitEmployee200ResponseContractsInner status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * The contract status.
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public GetBenefitEmployee200ResponseContractsInner endDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The end date of the contract, if applicable.
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
  }


  public GetBenefitEmployee200ResponseContractsInner jobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Job title or name of the contract.
   * @return jobTitle
   */
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public GetBenefitEmployee200ResponseContractsInner startDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the contract.
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
  }


  public GetBenefitEmployee200ResponseContractsInner compensations(@javax.annotation.Nullable List<GetBenefitEmployee200ResponseContractsInnerCompensationsInner> compensations) {
    this.compensations = compensations;
    return this;
  }

  public GetBenefitEmployee200ResponseContractsInner addCompensationsItem(GetBenefitEmployee200ResponseContractsInnerCompensationsInner compensationsItem) {
    if (this.compensations == null) {
      this.compensations = new ArrayList<>();
    }
    this.compensations.add(compensationsItem);
    return this;
  }

  /**
   * List of compensations associated with the contract.
   * @return compensations
   */
  @javax.annotation.Nullable
  public List<GetBenefitEmployee200ResponseContractsInnerCompensationsInner> getCompensations() {
    return compensations;
  }

  public void setCompensations(@javax.annotation.Nullable List<GetBenefitEmployee200ResponseContractsInnerCompensationsInner> compensations) {
    this.compensations = compensations;
  }


  public GetBenefitEmployee200ResponseContractsInner contractType(@javax.annotation.Nullable ContractTypeEnum contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * The type of contract.
   * @return contractType
   */
  @javax.annotation.Nullable
  public ContractTypeEnum getContractType() {
    return contractType;
  }

  public void setContractType(@javax.annotation.Nullable ContractTypeEnum contractType) {
    this.contractType = contractType;
  }


  public GetBenefitEmployee200ResponseContractsInner employmentType(@javax.annotation.Nullable EmploymentTypeEnum employmentType) {
    this.employmentType = employmentType;
    return this;
  }

  /**
   * The employment type, e.g., full-time or part-time.
   * @return employmentType
   */
  @javax.annotation.Nullable
  public EmploymentTypeEnum getEmploymentType() {
    return employmentType;
  }

  public void setEmploymentType(@javax.annotation.Nullable EmploymentTypeEnum employmentType) {
    this.employmentType = employmentType;
  }


  public GetBenefitEmployee200ResponseContractsInner estimatedWeekWorkingHours(@javax.annotation.Nullable BigDecimal estimatedWeekWorkingHours) {
    this.estimatedWeekWorkingHours = estimatedWeekWorkingHours;
    return this;
  }

  /**
   * Estimated number of working hours per week.
   * @return estimatedWeekWorkingHours
   */
  @javax.annotation.Nullable
  public BigDecimal getEstimatedWeekWorkingHours() {
    return estimatedWeekWorkingHours;
  }

  public void setEstimatedWeekWorkingHours(@javax.annotation.Nullable BigDecimal estimatedWeekWorkingHours) {
    this.estimatedWeekWorkingHours = estimatedWeekWorkingHours;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBenefitEmployee200ResponseContractsInner getBenefitEmployee200ResponseContractsInner = (GetBenefitEmployee200ResponseContractsInner) o;
    return Objects.equals(this.id, getBenefitEmployee200ResponseContractsInner.id) &&
        Objects.equals(this.flsa, getBenefitEmployee200ResponseContractsInner.flsa) &&
        Objects.equals(this.status, getBenefitEmployee200ResponseContractsInner.status) &&
        Objects.equals(this.endDate, getBenefitEmployee200ResponseContractsInner.endDate) &&
        Objects.equals(this.jobTitle, getBenefitEmployee200ResponseContractsInner.jobTitle) &&
        Objects.equals(this.startDate, getBenefitEmployee200ResponseContractsInner.startDate) &&
        Objects.equals(this.compensations, getBenefitEmployee200ResponseContractsInner.compensations) &&
        Objects.equals(this.contractType, getBenefitEmployee200ResponseContractsInner.contractType) &&
        Objects.equals(this.employmentType, getBenefitEmployee200ResponseContractsInner.employmentType) &&
        Objects.equals(this.estimatedWeekWorkingHours, getBenefitEmployee200ResponseContractsInner.estimatedWeekWorkingHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, flsa, status, endDate, jobTitle, startDate, compensations, contractType, employmentType, estimatedWeekWorkingHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBenefitEmployee200ResponseContractsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    flsa: ").append(toIndentedString(flsa)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    compensations: ").append(toIndentedString(compensations)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    estimatedWeekWorkingHours: ").append(toIndentedString(estimatedWeekWorkingHours)).append("\n");
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
    openapiFields.add("flsa");
    openapiFields.add("status");
    openapiFields.add("end_date");
    openapiFields.add("job_title");
    openapiFields.add("start_date");
    openapiFields.add("compensations");
    openapiFields.add("contract_type");
    openapiFields.add("employment_type");
    openapiFields.add("estimated_week_working_hours");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetBenefitEmployee200ResponseContractsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBenefitEmployee200ResponseContractsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBenefitEmployee200ResponseContractsInner is not found in the empty JSON string", GetBenefitEmployee200ResponseContractsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBenefitEmployee200ResponseContractsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBenefitEmployee200ResponseContractsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if ((jsonObj.get("job_title") != null && !jsonObj.get("job_title").isJsonNull()) && !jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if (jsonObj.get("compensations") != null && !jsonObj.get("compensations").isJsonNull()) {
        JsonArray jsonArraycompensations = jsonObj.getAsJsonArray("compensations");
        if (jsonArraycompensations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("compensations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `compensations` to be an array in the JSON string but got `%s`", jsonObj.get("compensations").toString()));
          }

          // validate the optional field `compensations` (array)
          for (int i = 0; i < jsonArraycompensations.size(); i++) {
            GetBenefitEmployee200ResponseContractsInnerCompensationsInner.validateJsonElement(jsonArraycompensations.get(i));
          };
        }
      }
      if ((jsonObj.get("contract_type") != null && !jsonObj.get("contract_type").isJsonNull()) && !jsonObj.get("contract_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_type").toString()));
      }
      // validate the optional field `contract_type`
      if (jsonObj.get("contract_type") != null && !jsonObj.get("contract_type").isJsonNull()) {
        ContractTypeEnum.validateJsonElement(jsonObj.get("contract_type"));
      }
      if ((jsonObj.get("employment_type") != null && !jsonObj.get("employment_type").isJsonNull()) && !jsonObj.get("employment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employment_type").toString()));
      }
      // validate the optional field `employment_type`
      if (jsonObj.get("employment_type") != null && !jsonObj.get("employment_type").isJsonNull()) {
        EmploymentTypeEnum.validateJsonElement(jsonObj.get("employment_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBenefitEmployee200ResponseContractsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBenefitEmployee200ResponseContractsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBenefitEmployee200ResponseContractsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBenefitEmployee200ResponseContractsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBenefitEmployee200ResponseContractsInner>() {
           @Override
           public void write(JsonWriter out, GetBenefitEmployee200ResponseContractsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBenefitEmployee200ResponseContractsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBenefitEmployee200ResponseContractsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBenefitEmployee200ResponseContractsInner
   * @throws IOException if the JSON string is invalid with respect to GetBenefitEmployee200ResponseContractsInner
   */
  public static GetBenefitEmployee200ResponseContractsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBenefitEmployee200ResponseContractsInner.class);
  }

  /**
   * Convert an instance of GetBenefitEmployee200ResponseContractsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

