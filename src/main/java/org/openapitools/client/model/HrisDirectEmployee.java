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
import org.openapitools.client.model.HrisCompensation;
import org.openapitools.client.model.HrisDirectEmployeeContract;
import org.openapitools.client.model.HrisDirectEmployeeDetails;
import org.openapitools.client.model.HrisDirectEmployeeJobInformation;
import org.openapitools.client.model.HrisDirectEmployeeVacationInfo;
import org.openapitools.client.model.HrisTeamInformation;
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
 * HrisDirectEmployee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class HrisDirectEmployee {
  public static final String SERIALIZED_NAME_EMPLOYEE_DETAILS = "employee_details";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_DETAILS)
  @javax.annotation.Nonnull
  private HrisDirectEmployeeDetails employeeDetails;

  public static final String SERIALIZED_NAME_TEAM_INFORMATION = "team_information";
  @SerializedName(SERIALIZED_NAME_TEAM_INFORMATION)
  @javax.annotation.Nonnull
  private HrisTeamInformation teamInformation;

  public static final String SERIALIZED_NAME_JOB_INFORMATION = "job_information";
  @SerializedName(SERIALIZED_NAME_JOB_INFORMATION)
  @javax.annotation.Nonnull
  private HrisDirectEmployeeJobInformation jobInformation;

  public static final String SERIALIZED_NAME_COMPENSATION = "compensation";
  @SerializedName(SERIALIZED_NAME_COMPENSATION)
  @javax.annotation.Nonnull
  private HrisCompensation compensation;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  @javax.annotation.Nonnull
  private HrisDirectEmployeeContract contract;

  public static final String SERIALIZED_NAME_VACATION_INFO = "vacation_info";
  @SerializedName(SERIALIZED_NAME_VACATION_INFO)
  @javax.annotation.Nullable
  private HrisDirectEmployeeVacationInfo vacationInfo;

  public HrisDirectEmployee() {
  }

  public HrisDirectEmployee employeeDetails(@javax.annotation.Nonnull HrisDirectEmployeeDetails employeeDetails) {
    this.employeeDetails = employeeDetails;
    return this;
  }

  /**
   * Get employeeDetails
   * @return employeeDetails
   */
  @javax.annotation.Nonnull
  public HrisDirectEmployeeDetails getEmployeeDetails() {
    return employeeDetails;
  }

  public void setEmployeeDetails(@javax.annotation.Nonnull HrisDirectEmployeeDetails employeeDetails) {
    this.employeeDetails = employeeDetails;
  }


  public HrisDirectEmployee teamInformation(@javax.annotation.Nonnull HrisTeamInformation teamInformation) {
    this.teamInformation = teamInformation;
    return this;
  }

  /**
   * Get teamInformation
   * @return teamInformation
   */
  @javax.annotation.Nonnull
  public HrisTeamInformation getTeamInformation() {
    return teamInformation;
  }

  public void setTeamInformation(@javax.annotation.Nonnull HrisTeamInformation teamInformation) {
    this.teamInformation = teamInformation;
  }


  public HrisDirectEmployee jobInformation(@javax.annotation.Nonnull HrisDirectEmployeeJobInformation jobInformation) {
    this.jobInformation = jobInformation;
    return this;
  }

  /**
   * Get jobInformation
   * @return jobInformation
   */
  @javax.annotation.Nonnull
  public HrisDirectEmployeeJobInformation getJobInformation() {
    return jobInformation;
  }

  public void setJobInformation(@javax.annotation.Nonnull HrisDirectEmployeeJobInformation jobInformation) {
    this.jobInformation = jobInformation;
  }


  public HrisDirectEmployee compensation(@javax.annotation.Nonnull HrisCompensation compensation) {
    this.compensation = compensation;
    return this;
  }

  /**
   * Get compensation
   * @return compensation
   */
  @javax.annotation.Nonnull
  public HrisCompensation getCompensation() {
    return compensation;
  }

  public void setCompensation(@javax.annotation.Nonnull HrisCompensation compensation) {
    this.compensation = compensation;
  }


  public HrisDirectEmployee contract(@javax.annotation.Nonnull HrisDirectEmployeeContract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
   */
  @javax.annotation.Nonnull
  public HrisDirectEmployeeContract getContract() {
    return contract;
  }

  public void setContract(@javax.annotation.Nonnull HrisDirectEmployeeContract contract) {
    this.contract = contract;
  }


  public HrisDirectEmployee vacationInfo(@javax.annotation.Nullable HrisDirectEmployeeVacationInfo vacationInfo) {
    this.vacationInfo = vacationInfo;
    return this;
  }

  /**
   * Get vacationInfo
   * @return vacationInfo
   */
  @javax.annotation.Nullable
  public HrisDirectEmployeeVacationInfo getVacationInfo() {
    return vacationInfo;
  }

  public void setVacationInfo(@javax.annotation.Nullable HrisDirectEmployeeVacationInfo vacationInfo) {
    this.vacationInfo = vacationInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HrisDirectEmployee hrisDirectEmployee = (HrisDirectEmployee) o;
    return Objects.equals(this.employeeDetails, hrisDirectEmployee.employeeDetails) &&
        Objects.equals(this.teamInformation, hrisDirectEmployee.teamInformation) &&
        Objects.equals(this.jobInformation, hrisDirectEmployee.jobInformation) &&
        Objects.equals(this.compensation, hrisDirectEmployee.compensation) &&
        Objects.equals(this.contract, hrisDirectEmployee.contract) &&
        Objects.equals(this.vacationInfo, hrisDirectEmployee.vacationInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeDetails, teamInformation, jobInformation, compensation, contract, vacationInfo);
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
    sb.append("class HrisDirectEmployee {\n");
    sb.append("    employeeDetails: ").append(toIndentedString(employeeDetails)).append("\n");
    sb.append("    teamInformation: ").append(toIndentedString(teamInformation)).append("\n");
    sb.append("    jobInformation: ").append(toIndentedString(jobInformation)).append("\n");
    sb.append("    compensation: ").append(toIndentedString(compensation)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    vacationInfo: ").append(toIndentedString(vacationInfo)).append("\n");
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
    openapiFields.add("employee_details");
    openapiFields.add("team_information");
    openapiFields.add("job_information");
    openapiFields.add("compensation");
    openapiFields.add("contract");
    openapiFields.add("vacation_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employee_details");
    openapiRequiredFields.add("team_information");
    openapiRequiredFields.add("job_information");
    openapiRequiredFields.add("compensation");
    openapiRequiredFields.add("contract");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HrisDirectEmployee
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HrisDirectEmployee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HrisDirectEmployee is not found in the empty JSON string", HrisDirectEmployee.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HrisDirectEmployee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HrisDirectEmployee` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HrisDirectEmployee.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `employee_details`
      HrisDirectEmployeeDetails.validateJsonElement(jsonObj.get("employee_details"));
      // validate the required field `team_information`
      HrisTeamInformation.validateJsonElement(jsonObj.get("team_information"));
      // validate the required field `job_information`
      HrisDirectEmployeeJobInformation.validateJsonElement(jsonObj.get("job_information"));
      // validate the required field `compensation`
      HrisCompensation.validateJsonElement(jsonObj.get("compensation"));
      // validate the required field `contract`
      HrisDirectEmployeeContract.validateJsonElement(jsonObj.get("contract"));
      // validate the optional field `vacation_info`
      if (jsonObj.get("vacation_info") != null && !jsonObj.get("vacation_info").isJsonNull()) {
        HrisDirectEmployeeVacationInfo.validateJsonElement(jsonObj.get("vacation_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HrisDirectEmployee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HrisDirectEmployee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HrisDirectEmployee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HrisDirectEmployee.class));

       return (TypeAdapter<T>) new TypeAdapter<HrisDirectEmployee>() {
           @Override
           public void write(JsonWriter out, HrisDirectEmployee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HrisDirectEmployee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HrisDirectEmployee given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HrisDirectEmployee
   * @throws IOException if the JSON string is invalid with respect to HrisDirectEmployee
   */
  public static HrisDirectEmployee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HrisDirectEmployee.class);
  }

  /**
   * Convert an instance of HrisDirectEmployee to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

