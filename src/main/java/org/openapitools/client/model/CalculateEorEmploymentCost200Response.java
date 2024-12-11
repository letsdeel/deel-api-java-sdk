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
import org.openapitools.client.model.CalculateEorEmploymentCost200ResponseAdditionalData;
import org.openapitools.client.model.CalculateEorEmploymentCost200ResponseBenefitsDataInner;
import org.openapitools.client.model.CalculateEorEmploymentCost200ResponseCostsInner;

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
 * CalculateEorEmploymentCost200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class CalculateEorEmploymentCost200Response {
  public static final String SERIALIZED_NAME_COSTS = "costs";
  @SerializedName(SERIALIZED_NAME_COSTS)
  @javax.annotation.Nullable
  private List<CalculateEorEmploymentCost200ResponseCostsInner> costs = new ArrayList<>();

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nullable
  private String salary;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_DEEL_FEE = "deel_fee";
  @SerializedName(SERIALIZED_NAME_DEEL_FEE)
  @javax.annotation.Nullable
  private String deelFee;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nullable
  private String frequency;

  public static final String SERIALIZED_NAME_TOTAL_COSTS = "total_costs";
  @SerializedName(SERIALIZED_NAME_TOTAL_COSTS)
  @javax.annotation.Nullable
  private String totalCosts;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  @javax.annotation.Nullable
  private String countryCode;

  public static final String SERIALIZED_NAME_BENEFITS_DATA = "benefits_data";
  @SerializedName(SERIALIZED_NAME_BENEFITS_DATA)
  @javax.annotation.Nullable
  private List<CalculateEorEmploymentCost200ResponseBenefitsDataInner> benefitsData = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMPLOYER_COSTS = "employer_costs";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_COSTS)
  @javax.annotation.Nullable
  private String employerCosts;

  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additional_data";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  @javax.annotation.Nullable
  private CalculateEorEmploymentCost200ResponseAdditionalData additionalData;

  public static final String SERIALIZED_NAME_SEVERANCE_ACCURAL = "severance_accural";
  @SerializedName(SERIALIZED_NAME_SEVERANCE_ACCURAL)
  @javax.annotation.Nullable
  private String severanceAccural;

  public CalculateEorEmploymentCost200Response() {
  }

  public CalculateEorEmploymentCost200Response costs(@javax.annotation.Nullable List<CalculateEorEmploymentCost200ResponseCostsInner> costs) {
    this.costs = costs;
    return this;
  }

  public CalculateEorEmploymentCost200Response addCostsItem(CalculateEorEmploymentCost200ResponseCostsInner costsItem) {
    if (this.costs == null) {
      this.costs = new ArrayList<>();
    }
    this.costs.add(costsItem);
    return this;
  }

  /**
   * Get costs
   * @return costs
   */
  @javax.annotation.Nullable
  public List<CalculateEorEmploymentCost200ResponseCostsInner> getCosts() {
    return costs;
  }

  public void setCosts(@javax.annotation.Nullable List<CalculateEorEmploymentCost200ResponseCostsInner> costs) {
    this.costs = costs;
  }


  public CalculateEorEmploymentCost200Response salary(@javax.annotation.Nullable String salary) {
    this.salary = salary;
    return this;
  }

  /**
   * The base salary for the employee.
   * @return salary
   */
  @javax.annotation.Nullable
  public String getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nullable String salary) {
    this.salary = salary;
  }


  public CalculateEorEmploymentCost200Response country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The country where the employee is based.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public CalculateEorEmploymentCost200Response currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency used for cost calculation.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public CalculateEorEmploymentCost200Response deelFee(@javax.annotation.Nullable String deelFee) {
    this.deelFee = deelFee;
    return this;
  }

  /**
   * The Deel fee for managing the employee.
   * @return deelFee
   */
  @javax.annotation.Nullable
  public String getDeelFee() {
    return deelFee;
  }

  public void setDeelFee(@javax.annotation.Nullable String deelFee) {
    this.deelFee = deelFee;
  }


  public CalculateEorEmploymentCost200Response frequency(@javax.annotation.Nullable String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Frequency of the salary payment (e.g., monthly).
   * @return frequency
   */
  @javax.annotation.Nullable
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nullable String frequency) {
    this.frequency = frequency;
  }


  public CalculateEorEmploymentCost200Response totalCosts(@javax.annotation.Nullable String totalCosts) {
    this.totalCosts = totalCosts;
    return this;
  }

  /**
   * Total employment costs.
   * @return totalCosts
   */
  @javax.annotation.Nullable
  public String getTotalCosts() {
    return totalCosts;
  }

  public void setTotalCosts(@javax.annotation.Nullable String totalCosts) {
    this.totalCosts = totalCosts;
  }


  public CalculateEorEmploymentCost200Response countryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * ISO Alpha-2 code of the country.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
  }


  public CalculateEorEmploymentCost200Response benefitsData(@javax.annotation.Nullable List<CalculateEorEmploymentCost200ResponseBenefitsDataInner> benefitsData) {
    this.benefitsData = benefitsData;
    return this;
  }

  public CalculateEorEmploymentCost200Response addBenefitsDataItem(CalculateEorEmploymentCost200ResponseBenefitsDataInner benefitsDataItem) {
    if (this.benefitsData == null) {
      this.benefitsData = new ArrayList<>();
    }
    this.benefitsData.add(benefitsDataItem);
    return this;
  }

  /**
   * Get benefitsData
   * @return benefitsData
   */
  @javax.annotation.Nullable
  public List<CalculateEorEmploymentCost200ResponseBenefitsDataInner> getBenefitsData() {
    return benefitsData;
  }

  public void setBenefitsData(@javax.annotation.Nullable List<CalculateEorEmploymentCost200ResponseBenefitsDataInner> benefitsData) {
    this.benefitsData = benefitsData;
  }


  public CalculateEorEmploymentCost200Response employerCosts(@javax.annotation.Nullable String employerCosts) {
    this.employerCosts = employerCosts;
    return this;
  }

  /**
   * Costs incurred by the employer.
   * @return employerCosts
   */
  @javax.annotation.Nullable
  public String getEmployerCosts() {
    return employerCosts;
  }

  public void setEmployerCosts(@javax.annotation.Nullable String employerCosts) {
    this.employerCosts = employerCosts;
  }


  public CalculateEorEmploymentCost200Response additionalData(@javax.annotation.Nullable CalculateEorEmploymentCost200ResponseAdditionalData additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  /**
   * Get additionalData
   * @return additionalData
   */
  @javax.annotation.Nullable
  public CalculateEorEmploymentCost200ResponseAdditionalData getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(@javax.annotation.Nullable CalculateEorEmploymentCost200ResponseAdditionalData additionalData) {
    this.additionalData = additionalData;
  }


  public CalculateEorEmploymentCost200Response severanceAccural(@javax.annotation.Nullable String severanceAccural) {
    this.severanceAccural = severanceAccural;
    return this;
  }

  /**
   * Severance accrual costs.
   * @return severanceAccural
   */
  @javax.annotation.Nullable
  public String getSeveranceAccural() {
    return severanceAccural;
  }

  public void setSeveranceAccural(@javax.annotation.Nullable String severanceAccural) {
    this.severanceAccural = severanceAccural;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateEorEmploymentCost200Response calculateEorEmploymentCost200Response = (CalculateEorEmploymentCost200Response) o;
    return Objects.equals(this.costs, calculateEorEmploymentCost200Response.costs) &&
        Objects.equals(this.salary, calculateEorEmploymentCost200Response.salary) &&
        Objects.equals(this.country, calculateEorEmploymentCost200Response.country) &&
        Objects.equals(this.currency, calculateEorEmploymentCost200Response.currency) &&
        Objects.equals(this.deelFee, calculateEorEmploymentCost200Response.deelFee) &&
        Objects.equals(this.frequency, calculateEorEmploymentCost200Response.frequency) &&
        Objects.equals(this.totalCosts, calculateEorEmploymentCost200Response.totalCosts) &&
        Objects.equals(this.countryCode, calculateEorEmploymentCost200Response.countryCode) &&
        Objects.equals(this.benefitsData, calculateEorEmploymentCost200Response.benefitsData) &&
        Objects.equals(this.employerCosts, calculateEorEmploymentCost200Response.employerCosts) &&
        Objects.equals(this.additionalData, calculateEorEmploymentCost200Response.additionalData) &&
        Objects.equals(this.severanceAccural, calculateEorEmploymentCost200Response.severanceAccural);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costs, salary, country, currency, deelFee, frequency, totalCosts, countryCode, benefitsData, employerCosts, additionalData, severanceAccural);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateEorEmploymentCost200Response {\n");
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    deelFee: ").append(toIndentedString(deelFee)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    totalCosts: ").append(toIndentedString(totalCosts)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    benefitsData: ").append(toIndentedString(benefitsData)).append("\n");
    sb.append("    employerCosts: ").append(toIndentedString(employerCosts)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    severanceAccural: ").append(toIndentedString(severanceAccural)).append("\n");
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
    openapiFields.add("costs");
    openapiFields.add("salary");
    openapiFields.add("country");
    openapiFields.add("currency");
    openapiFields.add("deel_fee");
    openapiFields.add("frequency");
    openapiFields.add("total_costs");
    openapiFields.add("country_code");
    openapiFields.add("benefits_data");
    openapiFields.add("employer_costs");
    openapiFields.add("additional_data");
    openapiFields.add("severance_accural");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CalculateEorEmploymentCost200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CalculateEorEmploymentCost200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CalculateEorEmploymentCost200Response is not found in the empty JSON string", CalculateEorEmploymentCost200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CalculateEorEmploymentCost200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CalculateEorEmploymentCost200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("costs") != null && !jsonObj.get("costs").isJsonNull()) {
        JsonArray jsonArraycosts = jsonObj.getAsJsonArray("costs");
        if (jsonArraycosts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("costs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `costs` to be an array in the JSON string but got `%s`", jsonObj.get("costs").toString()));
          }

          // validate the optional field `costs` (array)
          for (int i = 0; i < jsonArraycosts.size(); i++) {
            CalculateEorEmploymentCost200ResponseCostsInner.validateJsonElement(jsonArraycosts.get(i));
          };
        }
      }
      if ((jsonObj.get("salary") != null && !jsonObj.get("salary").isJsonNull()) && !jsonObj.get("salary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("deel_fee") != null && !jsonObj.get("deel_fee").isJsonNull()) && !jsonObj.get("deel_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deel_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deel_fee").toString()));
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if ((jsonObj.get("total_costs") != null && !jsonObj.get("total_costs").isJsonNull()) && !jsonObj.get("total_costs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_costs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_costs").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
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
            CalculateEorEmploymentCost200ResponseBenefitsDataInner.validateJsonElement(jsonArraybenefitsData.get(i));
          };
        }
      }
      if ((jsonObj.get("employer_costs") != null && !jsonObj.get("employer_costs").isJsonNull()) && !jsonObj.get("employer_costs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_costs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_costs").toString()));
      }
      // validate the optional field `additional_data`
      if (jsonObj.get("additional_data") != null && !jsonObj.get("additional_data").isJsonNull()) {
        CalculateEorEmploymentCost200ResponseAdditionalData.validateJsonElement(jsonObj.get("additional_data"));
      }
      if ((jsonObj.get("severance_accural") != null && !jsonObj.get("severance_accural").isJsonNull()) && !jsonObj.get("severance_accural").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severance_accural` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severance_accural").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CalculateEorEmploymentCost200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CalculateEorEmploymentCost200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CalculateEorEmploymentCost200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CalculateEorEmploymentCost200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CalculateEorEmploymentCost200Response>() {
           @Override
           public void write(JsonWriter out, CalculateEorEmploymentCost200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CalculateEorEmploymentCost200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CalculateEorEmploymentCost200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CalculateEorEmploymentCost200Response
   * @throws IOException if the JSON string is invalid with respect to CalculateEorEmploymentCost200Response
   */
  public static CalculateEorEmploymentCost200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CalculateEorEmploymentCost200Response.class);
  }

  /**
   * Convert an instance of CalculateEorEmploymentCost200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

