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
import java.time.LocalDate;
import java.util.Arrays;
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
 * HrisContractPartTime
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:45:24.021173966Z[GMT]", comments = "Generator version: 7.10.0")
public class HrisContractPartTime {
  public static final String SERIALIZED_NAME_CONTRACT_OID = "contract_oid";
  @SerializedName(SERIALIZED_NAME_CONTRACT_OID)
  @javax.annotation.Nonnull
  private String contractOid;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employee_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  @javax.annotation.Nullable
  private BigDecimal employeeNumber;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private LocalDate endDate;

  /**
   * Gets or Sets employmentType
   */
  @JsonAdapter(EmploymentTypeEnum.Adapter.class)
  public enum EmploymentTypeEnum {
    PART_TIME("PART_TIME");

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
  @javax.annotation.Nonnull
  private EmploymentTypeEnum employmentType;

  public static final String SERIALIZED_NAME_PART_TIME_PERCENTAGE = "part_time_percentage";
  @SerializedName(SERIALIZED_NAME_PART_TIME_PERCENTAGE)
  @javax.annotation.Nonnull
  private BigDecimal partTimePercentage;

  public HrisContractPartTime() {
  }

  public HrisContractPartTime contractOid(@javax.annotation.Nonnull String contractOid) {
    this.contractOid = contractOid;
    return this;
  }

  /**
   * The Hris Direct employee contract ID
   * @return contractOid
   */
  @javax.annotation.Nonnull
  public String getContractOid() {
    return contractOid;
  }

  public void setContractOid(@javax.annotation.Nonnull String contractOid) {
    this.contractOid = contractOid;
  }


  public HrisContractPartTime startDate(@javax.annotation.Nonnull LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return startDate
   */
  @javax.annotation.Nonnull
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nonnull LocalDate startDate) {
    this.startDate = startDate;
  }


  public HrisContractPartTime employeeNumber(@javax.annotation.Nullable BigDecimal employeeNumber) {
    this.employeeNumber = employeeNumber;
    return this;
  }

  /**
   * Get employeeNumber
   * @return employeeNumber
   */
  @javax.annotation.Nullable
  public BigDecimal getEmployeeNumber() {
    return employeeNumber;
  }

  public void setEmployeeNumber(@javax.annotation.Nullable BigDecimal employeeNumber) {
    this.employeeNumber = employeeNumber;
  }


  public HrisContractPartTime endDate(@javax.annotation.Nullable LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31.
   * @return endDate
   */
  @javax.annotation.Nullable
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable LocalDate endDate) {
    this.endDate = endDate;
  }


  public HrisContractPartTime employmentType(@javax.annotation.Nonnull EmploymentTypeEnum employmentType) {
    this.employmentType = employmentType;
    return this;
  }

  /**
   * Get employmentType
   * @return employmentType
   */
  @javax.annotation.Nonnull
  public EmploymentTypeEnum getEmploymentType() {
    return employmentType;
  }

  public void setEmploymentType(@javax.annotation.Nonnull EmploymentTypeEnum employmentType) {
    this.employmentType = employmentType;
  }


  public HrisContractPartTime partTimePercentage(@javax.annotation.Nonnull BigDecimal partTimePercentage) {
    this.partTimePercentage = partTimePercentage;
    return this;
  }

  /**
   * required if employmentType is \&quot;PART_TIME\&quot;
   * minimum: 1
   * maximum: 99
   * @return partTimePercentage
   */
  @javax.annotation.Nonnull
  public BigDecimal getPartTimePercentage() {
    return partTimePercentage;
  }

  public void setPartTimePercentage(@javax.annotation.Nonnull BigDecimal partTimePercentage) {
    this.partTimePercentage = partTimePercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HrisContractPartTime hrisContractPartTime = (HrisContractPartTime) o;
    return Objects.equals(this.contractOid, hrisContractPartTime.contractOid) &&
        Objects.equals(this.startDate, hrisContractPartTime.startDate) &&
        Objects.equals(this.employeeNumber, hrisContractPartTime.employeeNumber) &&
        Objects.equals(this.endDate, hrisContractPartTime.endDate) &&
        Objects.equals(this.employmentType, hrisContractPartTime.employmentType) &&
        Objects.equals(this.partTimePercentage, hrisContractPartTime.partTimePercentage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractOid, startDate, employeeNumber, endDate, employmentType, partTimePercentage);
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
    sb.append("class HrisContractPartTime {\n");
    sb.append("    contractOid: ").append(toIndentedString(contractOid)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    partTimePercentage: ").append(toIndentedString(partTimePercentage)).append("\n");
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
    openapiFields.add("contract_oid");
    openapiFields.add("start_date");
    openapiFields.add("employee_number");
    openapiFields.add("end_date");
    openapiFields.add("employment_type");
    openapiFields.add("part_time_percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_oid");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("employment_type");
    openapiRequiredFields.add("part_time_percentage");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HrisContractPartTime
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HrisContractPartTime.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HrisContractPartTime is not found in the empty JSON string", HrisContractPartTime.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HrisContractPartTime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HrisContractPartTime` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HrisContractPartTime.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contract_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_oid").toString()));
      }
      if (!jsonObj.get("employment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employment_type").toString()));
      }
      // validate the required field `employment_type`
      EmploymentTypeEnum.validateJsonElement(jsonObj.get("employment_type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HrisContractPartTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HrisContractPartTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HrisContractPartTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HrisContractPartTime.class));

       return (TypeAdapter<T>) new TypeAdapter<HrisContractPartTime>() {
           @Override
           public void write(JsonWriter out, HrisContractPartTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HrisContractPartTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HrisContractPartTime given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HrisContractPartTime
   * @throws IOException if the JSON string is invalid with respect to HrisContractPartTime
   */
  public static HrisContractPartTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HrisContractPartTime.class);
  }

  /**
   * Convert an instance of HrisContractPartTime to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

