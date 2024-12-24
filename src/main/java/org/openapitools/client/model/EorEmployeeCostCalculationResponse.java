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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.EorEmployeeCostCalculationResponseAdditionalData;
import org.openapitools.client.model.EorEmployeeCostCalculationResponseBenefitsDataInner;
import org.openapitools.client.model.EorEmployeeCostCalculationResponseCostsInner;

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
 * EorEmployeeCostCalculationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class EorEmployeeCostCalculationResponse {
  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nullable
  private String salary;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  @javax.annotation.Nullable
  private String countryCode;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nullable
  private String frequency;

  public static final String SERIALIZED_NAME_DEEL_FEE = "deel_fee";
  @SerializedName(SERIALIZED_NAME_DEEL_FEE)
  @javax.annotation.Nullable
  private String deelFee;

  public static final String SERIALIZED_NAME_SEVERANCE_ACCURAL = "severance_accural";
  @SerializedName(SERIALIZED_NAME_SEVERANCE_ACCURAL)
  @javax.annotation.Nullable
  private String severanceAccural;

  public static final String SERIALIZED_NAME_TOTAL_COSTS = "total_costs";
  @SerializedName(SERIALIZED_NAME_TOTAL_COSTS)
  @javax.annotation.Nullable
  private String totalCosts;

  public static final String SERIALIZED_NAME_EMPLOYER_COSTS = "employer_costs";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_COSTS)
  @javax.annotation.Nullable
  private String employerCosts;

  public static final String SERIALIZED_NAME_COSTS = "costs";
  @SerializedName(SERIALIZED_NAME_COSTS)
  @javax.annotation.Nullable
  private List<EorEmployeeCostCalculationResponseCostsInner> costs = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additional_data";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  @javax.annotation.Nullable
  private EorEmployeeCostCalculationResponseAdditionalData additionalData;

  public static final String SERIALIZED_NAME_BENEFITS_DATA = "benefits_data";
  @SerializedName(SERIALIZED_NAME_BENEFITS_DATA)
  @javax.annotation.Nullable
  private List<EorEmployeeCostCalculationResponseBenefitsDataInner> benefitsData = new ArrayList<>();

  public EorEmployeeCostCalculationResponse() {
  }

  public EorEmployeeCostCalculationResponse salary(@javax.annotation.Nullable String salary) {
    this.salary = salary;
    return this;
  }

  /**
   * The gross annual salary of the employee.
   * @return salary
   */
  @javax.annotation.Nullable
  public String getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nullable String salary) {
    this.salary = salary;
  }


  public EorEmployeeCostCalculationResponse currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency of the employee salary.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public EorEmployeeCostCalculationResponse country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The country of employment.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public EorEmployeeCostCalculationResponse countryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The country code for the country of employment.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
  }


  public EorEmployeeCostCalculationResponse frequency(@javax.annotation.Nullable String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * The frequency that the salary is paid out to the employee.
   * @return frequency
   */
  @javax.annotation.Nullable
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nullable String frequency) {
    this.frequency = frequency;
  }


  public EorEmployeeCostCalculationResponse deelFee(@javax.annotation.Nullable String deelFee) {
    this.deelFee = deelFee;
    return this;
  }

  /**
   * The monthly Deel fee.
   * @return deelFee
   */
  @javax.annotation.Nullable
  public String getDeelFee() {
    return deelFee;
  }

  public void setDeelFee(@javax.annotation.Nullable String deelFee) {
    this.deelFee = deelFee;
  }


  public EorEmployeeCostCalculationResponse severanceAccural(@javax.annotation.Nullable String severanceAccural) {
    this.severanceAccural = severanceAccural;
    return this;
  }

  /**
   * Monthly funds to cover future potential severance payments to the employee.
   * @return severanceAccural
   */
  @javax.annotation.Nullable
  public String getSeveranceAccural() {
    return severanceAccural;
  }

  public void setSeveranceAccural(@javax.annotation.Nullable String severanceAccural) {
    this.severanceAccural = severanceAccural;
  }


  public EorEmployeeCostCalculationResponse totalCosts(@javax.annotation.Nullable String totalCosts) {
    this.totalCosts = totalCosts;
    return this;
  }

  /**
   * Total monthly cost including salary, Deel fee, severance accrual and employer costs.
   * @return totalCosts
   */
  @javax.annotation.Nullable
  public String getTotalCosts() {
    return totalCosts;
  }

  public void setTotalCosts(@javax.annotation.Nullable String totalCosts) {
    this.totalCosts = totalCosts;
  }


  public EorEmployeeCostCalculationResponse employerCosts(@javax.annotation.Nullable String employerCosts) {
    this.employerCosts = employerCosts;
    return this;
  }

  /**
   * Total monthly employer costs. Does not include Deel fee, salary and severance accrual.
   * @return employerCosts
   */
  @javax.annotation.Nullable
  public String getEmployerCosts() {
    return employerCosts;
  }

  public void setEmployerCosts(@javax.annotation.Nullable String employerCosts) {
    this.employerCosts = employerCosts;
  }


  public EorEmployeeCostCalculationResponse costs(@javax.annotation.Nullable List<EorEmployeeCostCalculationResponseCostsInner> costs) {
    this.costs = costs;
    return this;
  }

  public EorEmployeeCostCalculationResponse addCostsItem(EorEmployeeCostCalculationResponseCostsInner costsItem) {
    if (this.costs == null) {
      this.costs = new ArrayList<>();
    }
    this.costs.add(costsItem);
    return this;
  }

  /**
   * The various costs associated with employment in the specified country.
   * @return costs
   */
  @javax.annotation.Nullable
  public List<EorEmployeeCostCalculationResponseCostsInner> getCosts() {
    return costs;
  }

  public void setCosts(@javax.annotation.Nullable List<EorEmployeeCostCalculationResponseCostsInner> costs) {
    this.costs = costs;
  }


  public EorEmployeeCostCalculationResponse additionalData(@javax.annotation.Nullable EorEmployeeCostCalculationResponseAdditionalData additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  /**
   * Get additionalData
   * @return additionalData
   */
  @javax.annotation.Nullable
  public EorEmployeeCostCalculationResponseAdditionalData getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(@javax.annotation.Nullable EorEmployeeCostCalculationResponseAdditionalData additionalData) {
    this.additionalData = additionalData;
  }


  public EorEmployeeCostCalculationResponse benefitsData(@javax.annotation.Nullable List<EorEmployeeCostCalculationResponseBenefitsDataInner> benefitsData) {
    this.benefitsData = benefitsData;
    return this;
  }

  public EorEmployeeCostCalculationResponse addBenefitsDataItem(EorEmployeeCostCalculationResponseBenefitsDataInner benefitsDataItem) {
    if (this.benefitsData == null) {
      this.benefitsData = new ArrayList<>();
    }
    this.benefitsData.add(benefitsDataItem);
    return this;
  }

  /**
   * The various benefits costs involved in the calculation, if any.
   * @return benefitsData
   */
  @javax.annotation.Nullable
  public List<EorEmployeeCostCalculationResponseBenefitsDataInner> getBenefitsData() {
    return benefitsData;
  }

  public void setBenefitsData(@javax.annotation.Nullable List<EorEmployeeCostCalculationResponseBenefitsDataInner> benefitsData) {
    this.benefitsData = benefitsData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorEmployeeCostCalculationResponse eorEmployeeCostCalculationResponse = (EorEmployeeCostCalculationResponse) o;
    return Objects.equals(this.salary, eorEmployeeCostCalculationResponse.salary) &&
        Objects.equals(this.currency, eorEmployeeCostCalculationResponse.currency) &&
        Objects.equals(this.country, eorEmployeeCostCalculationResponse.country) &&
        Objects.equals(this.countryCode, eorEmployeeCostCalculationResponse.countryCode) &&
        Objects.equals(this.frequency, eorEmployeeCostCalculationResponse.frequency) &&
        Objects.equals(this.deelFee, eorEmployeeCostCalculationResponse.deelFee) &&
        Objects.equals(this.severanceAccural, eorEmployeeCostCalculationResponse.severanceAccural) &&
        Objects.equals(this.totalCosts, eorEmployeeCostCalculationResponse.totalCosts) &&
        Objects.equals(this.employerCosts, eorEmployeeCostCalculationResponse.employerCosts) &&
        Objects.equals(this.costs, eorEmployeeCostCalculationResponse.costs) &&
        Objects.equals(this.additionalData, eorEmployeeCostCalculationResponse.additionalData) &&
        Objects.equals(this.benefitsData, eorEmployeeCostCalculationResponse.benefitsData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salary, currency, country, countryCode, frequency, deelFee, severanceAccural, totalCosts, employerCosts, costs, additionalData, benefitsData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorEmployeeCostCalculationResponse {\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    deelFee: ").append(toIndentedString(deelFee)).append("\n");
    sb.append("    severanceAccural: ").append(toIndentedString(severanceAccural)).append("\n");
    sb.append("    totalCosts: ").append(toIndentedString(totalCosts)).append("\n");
    sb.append("    employerCosts: ").append(toIndentedString(employerCosts)).append("\n");
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    benefitsData: ").append(toIndentedString(benefitsData)).append("\n");
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
    openapiFields.add("salary");
    openapiFields.add("currency");
    openapiFields.add("country");
    openapiFields.add("country_code");
    openapiFields.add("frequency");
    openapiFields.add("deel_fee");
    openapiFields.add("severance_accural");
    openapiFields.add("total_costs");
    openapiFields.add("employer_costs");
    openapiFields.add("costs");
    openapiFields.add("additional_data");
    openapiFields.add("benefits_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorEmployeeCostCalculationResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorEmployeeCostCalculationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorEmployeeCostCalculationResponse is not found in the empty JSON string", EorEmployeeCostCalculationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorEmployeeCostCalculationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorEmployeeCostCalculationResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("salary") != null && !jsonObj.get("salary").isJsonNull()) && !jsonObj.get("salary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if ((jsonObj.get("deel_fee") != null && !jsonObj.get("deel_fee").isJsonNull()) && !jsonObj.get("deel_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deel_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deel_fee").toString()));
      }
      if ((jsonObj.get("severance_accural") != null && !jsonObj.get("severance_accural").isJsonNull()) && !jsonObj.get("severance_accural").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severance_accural` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severance_accural").toString()));
      }
      if ((jsonObj.get("total_costs") != null && !jsonObj.get("total_costs").isJsonNull()) && !jsonObj.get("total_costs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_costs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_costs").toString()));
      }
      if ((jsonObj.get("employer_costs") != null && !jsonObj.get("employer_costs").isJsonNull()) && !jsonObj.get("employer_costs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_costs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_costs").toString()));
      }
      if (jsonObj.get("costs") != null && !jsonObj.get("costs").isJsonNull()) {
        JsonArray jsonArraycosts = jsonObj.getAsJsonArray("costs");
        if (jsonArraycosts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("costs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `costs` to be an array in the JSON string but got `%s`", jsonObj.get("costs").toString()));
          }

          // validate the optional field `costs` (array)
          for (int i = 0; i < jsonArraycosts.size(); i++) {
            EorEmployeeCostCalculationResponseCostsInner.validateJsonElement(jsonArraycosts.get(i));
          };
        }
      }
      // validate the optional field `additional_data`
      if (jsonObj.get("additional_data") != null && !jsonObj.get("additional_data").isJsonNull()) {
        EorEmployeeCostCalculationResponseAdditionalData.validateJsonElement(jsonObj.get("additional_data"));
      }
      if (jsonObj.get("benefits_data") != null && !jsonObj.get("benefits_data").isJsonNull()) {
        JsonArray jsonArraybenefitsData = jsonObj.getAsJsonArray("benefits_data");
        if (jsonArraybenefitsData != null) {
          // ensure the json data is an array
          if (!jsonObj.get("benefits_data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `benefits_data` to be an array in the JSON string but got `%s`", jsonObj.get("benefits_data").toString()));
          }

          // validate the optional field `benefits_data` (array)
          for (int i = 0; i < jsonArraybenefitsData.size(); i++) {
            EorEmployeeCostCalculationResponseBenefitsDataInner.validateJsonElement(jsonArraybenefitsData.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorEmployeeCostCalculationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorEmployeeCostCalculationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorEmployeeCostCalculationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorEmployeeCostCalculationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EorEmployeeCostCalculationResponse>() {
           @Override
           public void write(JsonWriter out, EorEmployeeCostCalculationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorEmployeeCostCalculationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorEmployeeCostCalculationResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorEmployeeCostCalculationResponse
   * @throws IOException if the JSON string is invalid with respect to EorEmployeeCostCalculationResponse
   */
  public static EorEmployeeCostCalculationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorEmployeeCostCalculationResponse.class);
  }

  /**
   * Convert an instance of EorEmployeeCostCalculationResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

