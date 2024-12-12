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
import org.openapitools.client.model.EorCountryValidationsDefiniteContract;
import org.openapitools.client.model.EorCountryValidationsHealthInsurance;
import org.openapitools.client.model.EorCountryValidationsHoliday;
import org.openapitools.client.model.EorCountryValidationsPartTimeHoliday;
import org.openapitools.client.model.EorCountryValidationsPartTimeProbation;
import org.openapitools.client.model.EorCountryValidationsPension;
import org.openapitools.client.model.EorCountryValidationsProbation;
import org.openapitools.client.model.EorCountryValidationsSalary;
import org.openapitools.client.model.EorCountryValidationsSickDays;
import org.openapitools.client.model.EorCountryValidationsWorkSchedule;
import org.openapitools.client.model.EorField;
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
 * EorCountryValidations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T13:30:33.173921421Z[GMT]", comments = "Generator version: 7.10.0")
public class EorCountryValidations {
  public static final String SERIALIZED_NAME_HOLIDAY = "holiday";
  @SerializedName(SERIALIZED_NAME_HOLIDAY)
  @javax.annotation.Nullable
  private EorCountryValidationsHoliday holiday;

  public static final String SERIALIZED_NAME_PART_TIME_HOLIDAY = "part_time_holiday";
  @SerializedName(SERIALIZED_NAME_PART_TIME_HOLIDAY)
  @javax.annotation.Nullable
  private EorCountryValidationsPartTimeHoliday partTimeHoliday;

  public static final String SERIALIZED_NAME_SICK_DAYS = "sick_days";
  @SerializedName(SERIALIZED_NAME_SICK_DAYS)
  @javax.annotation.Nullable
  private EorCountryValidationsSickDays sickDays;

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nullable
  private EorCountryValidationsSalary salary;

  public static final String SERIALIZED_NAME_PROBATION = "probation";
  @SerializedName(SERIALIZED_NAME_PROBATION)
  @javax.annotation.Nullable
  private EorCountryValidationsProbation probation;

  public static final String SERIALIZED_NAME_PART_TIME_PROBATION = "part_time_probation";
  @SerializedName(SERIALIZED_NAME_PART_TIME_PROBATION)
  @javax.annotation.Nullable
  private EorCountryValidationsPartTimeProbation partTimeProbation;

  public static final String SERIALIZED_NAME_WORK_SCHEDULE = "work_schedule";
  @SerializedName(SERIALIZED_NAME_WORK_SCHEDULE)
  @javax.annotation.Nullable
  private EorCountryValidationsWorkSchedule workSchedule;

  public static final String SERIALIZED_NAME_INSURANCE_FEE = "insurance_fee";
  @SerializedName(SERIALIZED_NAME_INSURANCE_FEE)
  @javax.annotation.Nullable
  private String insuranceFee;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_HIRING_GUIDE_COUNTRY_NAME = "hiring_guide_country_name";
  @SerializedName(SERIALIZED_NAME_HIRING_GUIDE_COUNTRY_NAME)
  @javax.annotation.Nullable
  private String hiringGuideCountryName;

  public static final String SERIALIZED_NAME_START_DATE_BUFFER = "start_date_buffer";
  @SerializedName(SERIALIZED_NAME_START_DATE_BUFFER)
  @javax.annotation.Nullable
  private BigDecimal startDateBuffer;

  public static final String SERIALIZED_NAME_DEFINITE_CONTRACT = "definite_contract";
  @SerializedName(SERIALIZED_NAME_DEFINITE_CONTRACT)
  @javax.annotation.Nullable
  private EorCountryValidationsDefiniteContract definiteContract;

  public static final String SERIALIZED_NAME_ADJUSTMENTS_INFORMATION_BOX = "adjustments_information_box";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENTS_INFORMATION_BOX)
  @javax.annotation.Nullable
  private String adjustmentsInformationBox;

  public static final String SERIALIZED_NAME_HEALTH_INSURANCE = "health_insurance";
  @SerializedName(SERIALIZED_NAME_HEALTH_INSURANCE)
  @javax.annotation.Nullable
  private EorCountryValidationsHealthInsurance healthInsurance;

  public static final String SERIALIZED_NAME_PENSION = "pension";
  @SerializedName(SERIALIZED_NAME_PENSION)
  @javax.annotation.Nullable
  private EorCountryValidationsPension pension;

  public static final String SERIALIZED_NAME_MANDATORY_FIELDS = "mandatory_fields";
  @SerializedName(SERIALIZED_NAME_MANDATORY_FIELDS)
  @javax.annotation.Nullable
  private List<EorField> mandatoryFields = new ArrayList<>();

  public EorCountryValidations() {
  }

  public EorCountryValidations holiday(@javax.annotation.Nullable EorCountryValidationsHoliday holiday) {
    this.holiday = holiday;
    return this;
  }

  /**
   * Get holiday
   * @return holiday
   */
  @javax.annotation.Nullable
  public EorCountryValidationsHoliday getHoliday() {
    return holiday;
  }

  public void setHoliday(@javax.annotation.Nullable EorCountryValidationsHoliday holiday) {
    this.holiday = holiday;
  }


  public EorCountryValidations partTimeHoliday(@javax.annotation.Nullable EorCountryValidationsPartTimeHoliday partTimeHoliday) {
    this.partTimeHoliday = partTimeHoliday;
    return this;
  }

  /**
   * Get partTimeHoliday
   * @return partTimeHoliday
   */
  @javax.annotation.Nullable
  public EorCountryValidationsPartTimeHoliday getPartTimeHoliday() {
    return partTimeHoliday;
  }

  public void setPartTimeHoliday(@javax.annotation.Nullable EorCountryValidationsPartTimeHoliday partTimeHoliday) {
    this.partTimeHoliday = partTimeHoliday;
  }


  public EorCountryValidations sickDays(@javax.annotation.Nullable EorCountryValidationsSickDays sickDays) {
    this.sickDays = sickDays;
    return this;
  }

  /**
   * Get sickDays
   * @return sickDays
   */
  @javax.annotation.Nullable
  public EorCountryValidationsSickDays getSickDays() {
    return sickDays;
  }

  public void setSickDays(@javax.annotation.Nullable EorCountryValidationsSickDays sickDays) {
    this.sickDays = sickDays;
  }


  public EorCountryValidations salary(@javax.annotation.Nullable EorCountryValidationsSalary salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   */
  @javax.annotation.Nullable
  public EorCountryValidationsSalary getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nullable EorCountryValidationsSalary salary) {
    this.salary = salary;
  }


  public EorCountryValidations probation(@javax.annotation.Nullable EorCountryValidationsProbation probation) {
    this.probation = probation;
    return this;
  }

  /**
   * Get probation
   * @return probation
   */
  @javax.annotation.Nullable
  public EorCountryValidationsProbation getProbation() {
    return probation;
  }

  public void setProbation(@javax.annotation.Nullable EorCountryValidationsProbation probation) {
    this.probation = probation;
  }


  public EorCountryValidations partTimeProbation(@javax.annotation.Nullable EorCountryValidationsPartTimeProbation partTimeProbation) {
    this.partTimeProbation = partTimeProbation;
    return this;
  }

  /**
   * Get partTimeProbation
   * @return partTimeProbation
   */
  @javax.annotation.Nullable
  public EorCountryValidationsPartTimeProbation getPartTimeProbation() {
    return partTimeProbation;
  }

  public void setPartTimeProbation(@javax.annotation.Nullable EorCountryValidationsPartTimeProbation partTimeProbation) {
    this.partTimeProbation = partTimeProbation;
  }


  public EorCountryValidations workSchedule(@javax.annotation.Nullable EorCountryValidationsWorkSchedule workSchedule) {
    this.workSchedule = workSchedule;
    return this;
  }

  /**
   * Get workSchedule
   * @return workSchedule
   */
  @javax.annotation.Nullable
  public EorCountryValidationsWorkSchedule getWorkSchedule() {
    return workSchedule;
  }

  public void setWorkSchedule(@javax.annotation.Nullable EorCountryValidationsWorkSchedule workSchedule) {
    this.workSchedule = workSchedule;
  }


  public EorCountryValidations insuranceFee(@javax.annotation.Nullable String insuranceFee) {
    this.insuranceFee = insuranceFee;
    return this;
  }

  /**
   * Insurance fee.
   * @return insuranceFee
   */
  @javax.annotation.Nullable
  public String getInsuranceFee() {
    return insuranceFee;
  }

  public void setInsuranceFee(@javax.annotation.Nullable String insuranceFee) {
    this.insuranceFee = insuranceFee;
  }


  public EorCountryValidations currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Country currency.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public EorCountryValidations hiringGuideCountryName(@javax.annotation.Nullable String hiringGuideCountryName) {
    this.hiringGuideCountryName = hiringGuideCountryName;
    return this;
  }

  /**
   * Country name.
   * @return hiringGuideCountryName
   */
  @javax.annotation.Nullable
  public String getHiringGuideCountryName() {
    return hiringGuideCountryName;
  }

  public void setHiringGuideCountryName(@javax.annotation.Nullable String hiringGuideCountryName) {
    this.hiringGuideCountryName = hiringGuideCountryName;
  }


  public EorCountryValidations startDateBuffer(@javax.annotation.Nullable BigDecimal startDateBuffer) {
    this.startDateBuffer = startDateBuffer;
    return this;
  }

  /**
   * Calculate employee&#39;s minimum start date using the start date buffer. Today&#39;s date + (number of business days x start_date_buffer) &#x3D; Minimum start date.
   * @return startDateBuffer
   */
  @javax.annotation.Nullable
  public BigDecimal getStartDateBuffer() {
    return startDateBuffer;
  }

  public void setStartDateBuffer(@javax.annotation.Nullable BigDecimal startDateBuffer) {
    this.startDateBuffer = startDateBuffer;
  }


  public EorCountryValidations definiteContract(@javax.annotation.Nullable EorCountryValidationsDefiniteContract definiteContract) {
    this.definiteContract = definiteContract;
    return this;
  }

  /**
   * Get definiteContract
   * @return definiteContract
   */
  @javax.annotation.Nullable
  public EorCountryValidationsDefiniteContract getDefiniteContract() {
    return definiteContract;
  }

  public void setDefiniteContract(@javax.annotation.Nullable EorCountryValidationsDefiniteContract definiteContract) {
    this.definiteContract = definiteContract;
  }


  public EorCountryValidations adjustmentsInformationBox(@javax.annotation.Nullable String adjustmentsInformationBox) {
    this.adjustmentsInformationBox = adjustmentsInformationBox;
    return this;
  }

  /**
   * Country specific notes and information.
   * @return adjustmentsInformationBox
   */
  @javax.annotation.Nullable
  public String getAdjustmentsInformationBox() {
    return adjustmentsInformationBox;
  }

  public void setAdjustmentsInformationBox(@javax.annotation.Nullable String adjustmentsInformationBox) {
    this.adjustmentsInformationBox = adjustmentsInformationBox;
  }


  public EorCountryValidations healthInsurance(@javax.annotation.Nullable EorCountryValidationsHealthInsurance healthInsurance) {
    this.healthInsurance = healthInsurance;
    return this;
  }

  /**
   * Get healthInsurance
   * @return healthInsurance
   */
  @javax.annotation.Nullable
  public EorCountryValidationsHealthInsurance getHealthInsurance() {
    return healthInsurance;
  }

  public void setHealthInsurance(@javax.annotation.Nullable EorCountryValidationsHealthInsurance healthInsurance) {
    this.healthInsurance = healthInsurance;
  }


  public EorCountryValidations pension(@javax.annotation.Nullable EorCountryValidationsPension pension) {
    this.pension = pension;
    return this;
  }

  /**
   * Get pension
   * @return pension
   */
  @javax.annotation.Nullable
  public EorCountryValidationsPension getPension() {
    return pension;
  }

  public void setPension(@javax.annotation.Nullable EorCountryValidationsPension pension) {
    this.pension = pension;
  }


  public EorCountryValidations mandatoryFields(@javax.annotation.Nullable List<EorField> mandatoryFields) {
    this.mandatoryFields = mandatoryFields;
    return this;
  }

  public EorCountryValidations addMandatoryFieldsItem(EorField mandatoryFieldsItem) {
    if (this.mandatoryFields == null) {
      this.mandatoryFields = new ArrayList<>();
    }
    this.mandatoryFields.add(mandatoryFieldsItem);
    return this;
  }

  /**
   * Get mandatoryFields
   * @return mandatoryFields
   */
  @javax.annotation.Nullable
  public List<EorField> getMandatoryFields() {
    return mandatoryFields;
  }

  public void setMandatoryFields(@javax.annotation.Nullable List<EorField> mandatoryFields) {
    this.mandatoryFields = mandatoryFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorCountryValidations eorCountryValidations = (EorCountryValidations) o;
    return Objects.equals(this.holiday, eorCountryValidations.holiday) &&
        Objects.equals(this.partTimeHoliday, eorCountryValidations.partTimeHoliday) &&
        Objects.equals(this.sickDays, eorCountryValidations.sickDays) &&
        Objects.equals(this.salary, eorCountryValidations.salary) &&
        Objects.equals(this.probation, eorCountryValidations.probation) &&
        Objects.equals(this.partTimeProbation, eorCountryValidations.partTimeProbation) &&
        Objects.equals(this.workSchedule, eorCountryValidations.workSchedule) &&
        Objects.equals(this.insuranceFee, eorCountryValidations.insuranceFee) &&
        Objects.equals(this.currency, eorCountryValidations.currency) &&
        Objects.equals(this.hiringGuideCountryName, eorCountryValidations.hiringGuideCountryName) &&
        Objects.equals(this.startDateBuffer, eorCountryValidations.startDateBuffer) &&
        Objects.equals(this.definiteContract, eorCountryValidations.definiteContract) &&
        Objects.equals(this.adjustmentsInformationBox, eorCountryValidations.adjustmentsInformationBox) &&
        Objects.equals(this.healthInsurance, eorCountryValidations.healthInsurance) &&
        Objects.equals(this.pension, eorCountryValidations.pension) &&
        Objects.equals(this.mandatoryFields, eorCountryValidations.mandatoryFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(holiday, partTimeHoliday, sickDays, salary, probation, partTimeProbation, workSchedule, insuranceFee, currency, hiringGuideCountryName, startDateBuffer, definiteContract, adjustmentsInformationBox, healthInsurance, pension, mandatoryFields);
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
    sb.append("class EorCountryValidations {\n");
    sb.append("    holiday: ").append(toIndentedString(holiday)).append("\n");
    sb.append("    partTimeHoliday: ").append(toIndentedString(partTimeHoliday)).append("\n");
    sb.append("    sickDays: ").append(toIndentedString(sickDays)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    probation: ").append(toIndentedString(probation)).append("\n");
    sb.append("    partTimeProbation: ").append(toIndentedString(partTimeProbation)).append("\n");
    sb.append("    workSchedule: ").append(toIndentedString(workSchedule)).append("\n");
    sb.append("    insuranceFee: ").append(toIndentedString(insuranceFee)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    hiringGuideCountryName: ").append(toIndentedString(hiringGuideCountryName)).append("\n");
    sb.append("    startDateBuffer: ").append(toIndentedString(startDateBuffer)).append("\n");
    sb.append("    definiteContract: ").append(toIndentedString(definiteContract)).append("\n");
    sb.append("    adjustmentsInformationBox: ").append(toIndentedString(adjustmentsInformationBox)).append("\n");
    sb.append("    healthInsurance: ").append(toIndentedString(healthInsurance)).append("\n");
    sb.append("    pension: ").append(toIndentedString(pension)).append("\n");
    sb.append("    mandatoryFields: ").append(toIndentedString(mandatoryFields)).append("\n");
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
    openapiFields.add("holiday");
    openapiFields.add("part_time_holiday");
    openapiFields.add("sick_days");
    openapiFields.add("salary");
    openapiFields.add("probation");
    openapiFields.add("part_time_probation");
    openapiFields.add("work_schedule");
    openapiFields.add("insurance_fee");
    openapiFields.add("currency");
    openapiFields.add("hiring_guide_country_name");
    openapiFields.add("start_date_buffer");
    openapiFields.add("definite_contract");
    openapiFields.add("adjustments_information_box");
    openapiFields.add("health_insurance");
    openapiFields.add("pension");
    openapiFields.add("mandatory_fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorCountryValidations
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorCountryValidations.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorCountryValidations is not found in the empty JSON string", EorCountryValidations.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorCountryValidations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorCountryValidations` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `holiday`
      if (jsonObj.get("holiday") != null && !jsonObj.get("holiday").isJsonNull()) {
        EorCountryValidationsHoliday.validateJsonElement(jsonObj.get("holiday"));
      }
      // validate the optional field `part_time_holiday`
      if (jsonObj.get("part_time_holiday") != null && !jsonObj.get("part_time_holiday").isJsonNull()) {
        EorCountryValidationsPartTimeHoliday.validateJsonElement(jsonObj.get("part_time_holiday"));
      }
      // validate the optional field `sick_days`
      if (jsonObj.get("sick_days") != null && !jsonObj.get("sick_days").isJsonNull()) {
        EorCountryValidationsSickDays.validateJsonElement(jsonObj.get("sick_days"));
      }
      // validate the optional field `salary`
      if (jsonObj.get("salary") != null && !jsonObj.get("salary").isJsonNull()) {
        EorCountryValidationsSalary.validateJsonElement(jsonObj.get("salary"));
      }
      // validate the optional field `probation`
      if (jsonObj.get("probation") != null && !jsonObj.get("probation").isJsonNull()) {
        EorCountryValidationsProbation.validateJsonElement(jsonObj.get("probation"));
      }
      // validate the optional field `part_time_probation`
      if (jsonObj.get("part_time_probation") != null && !jsonObj.get("part_time_probation").isJsonNull()) {
        EorCountryValidationsPartTimeProbation.validateJsonElement(jsonObj.get("part_time_probation"));
      }
      // validate the optional field `work_schedule`
      if (jsonObj.get("work_schedule") != null && !jsonObj.get("work_schedule").isJsonNull()) {
        EorCountryValidationsWorkSchedule.validateJsonElement(jsonObj.get("work_schedule"));
      }
      if ((jsonObj.get("insurance_fee") != null && !jsonObj.get("insurance_fee").isJsonNull()) && !jsonObj.get("insurance_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insurance_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insurance_fee").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("hiring_guide_country_name") != null && !jsonObj.get("hiring_guide_country_name").isJsonNull()) && !jsonObj.get("hiring_guide_country_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hiring_guide_country_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hiring_guide_country_name").toString()));
      }
      // validate the optional field `definite_contract`
      if (jsonObj.get("definite_contract") != null && !jsonObj.get("definite_contract").isJsonNull()) {
        EorCountryValidationsDefiniteContract.validateJsonElement(jsonObj.get("definite_contract"));
      }
      if ((jsonObj.get("adjustments_information_box") != null && !jsonObj.get("adjustments_information_box").isJsonNull()) && !jsonObj.get("adjustments_information_box").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adjustments_information_box` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adjustments_information_box").toString()));
      }
      // validate the optional field `health_insurance`
      if (jsonObj.get("health_insurance") != null && !jsonObj.get("health_insurance").isJsonNull()) {
        EorCountryValidationsHealthInsurance.validateJsonElement(jsonObj.get("health_insurance"));
      }
      // validate the optional field `pension`
      if (jsonObj.get("pension") != null && !jsonObj.get("pension").isJsonNull()) {
        EorCountryValidationsPension.validateJsonElement(jsonObj.get("pension"));
      }
      if (jsonObj.get("mandatory_fields") != null && !jsonObj.get("mandatory_fields").isJsonNull()) {
        JsonArray jsonArraymandatoryFields = jsonObj.getAsJsonArray("mandatory_fields");
        if (jsonArraymandatoryFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mandatory_fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mandatory_fields` to be an array in the JSON string but got `%s`", jsonObj.get("mandatory_fields").toString()));
          }

          // validate the optional field `mandatory_fields` (array)
          for (int i = 0; i < jsonArraymandatoryFields.size(); i++) {
            EorField.validateJsonElement(jsonArraymandatoryFields.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorCountryValidations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorCountryValidations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorCountryValidations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorCountryValidations.class));

       return (TypeAdapter<T>) new TypeAdapter<EorCountryValidations>() {
           @Override
           public void write(JsonWriter out, EorCountryValidations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorCountryValidations read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorCountryValidations given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorCountryValidations
   * @throws IOException if the JSON string is invalid with respect to EorCountryValidations
   */
  public static EorCountryValidations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorCountryValidations.class);
  }

  /**
   * Convert an instance of EorCountryValidations to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

