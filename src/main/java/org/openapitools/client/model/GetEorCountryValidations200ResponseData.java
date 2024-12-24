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
import org.openapitools.client.model.GetEorCountryValidations200ResponseDataHealthInsurance;
import org.openapitools.client.model.GetEorCountryValidations200ResponseDataHoliday;
import org.openapitools.client.model.GetEorCountryValidations200ResponseDataProbation;
import org.openapitools.client.model.GetEorCountryValidations200ResponseDataSalary;
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
 * GetEorCountryValidations200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:40:51.396070831Z[GMT]", comments = "Generator version: 7.10.0")
public class GetEorCountryValidations200ResponseData {
  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nullable
  private GetEorCountryValidations200ResponseDataSalary salary;

  public static final String SERIALIZED_NAME_HOLIDAY = "holiday";
  @SerializedName(SERIALIZED_NAME_HOLIDAY)
  @javax.annotation.Nullable
  private GetEorCountryValidations200ResponseDataHoliday holiday;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_PROBATION = "probation";
  @SerializedName(SERIALIZED_NAME_PROBATION)
  @javax.annotation.Nullable
  private GetEorCountryValidations200ResponseDataProbation probation;

  public static final String SERIALIZED_NAME_HEALTH_INSURANCE = "health_insurance";
  @SerializedName(SERIALIZED_NAME_HEALTH_INSURANCE)
  @javax.annotation.Nullable
  private GetEorCountryValidations200ResponseDataHealthInsurance healthInsurance;

  public GetEorCountryValidations200ResponseData() {
  }

  public GetEorCountryValidations200ResponseData salary(@javax.annotation.Nullable GetEorCountryValidations200ResponseDataSalary salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   */
  @javax.annotation.Nullable
  public GetEorCountryValidations200ResponseDataSalary getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nullable GetEorCountryValidations200ResponseDataSalary salary) {
    this.salary = salary;
  }


  public GetEorCountryValidations200ResponseData holiday(@javax.annotation.Nullable GetEorCountryValidations200ResponseDataHoliday holiday) {
    this.holiday = holiday;
    return this;
  }

  /**
   * Get holiday
   * @return holiday
   */
  @javax.annotation.Nullable
  public GetEorCountryValidations200ResponseDataHoliday getHoliday() {
    return holiday;
  }

  public void setHoliday(@javax.annotation.Nullable GetEorCountryValidations200ResponseDataHoliday holiday) {
    this.holiday = holiday;
  }


  public GetEorCountryValidations200ResponseData currency(@javax.annotation.Nullable String currency) {
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


  public GetEorCountryValidations200ResponseData probation(@javax.annotation.Nullable GetEorCountryValidations200ResponseDataProbation probation) {
    this.probation = probation;
    return this;
  }

  /**
   * Get probation
   * @return probation
   */
  @javax.annotation.Nullable
  public GetEorCountryValidations200ResponseDataProbation getProbation() {
    return probation;
  }

  public void setProbation(@javax.annotation.Nullable GetEorCountryValidations200ResponseDataProbation probation) {
    this.probation = probation;
  }


  public GetEorCountryValidations200ResponseData healthInsurance(@javax.annotation.Nullable GetEorCountryValidations200ResponseDataHealthInsurance healthInsurance) {
    this.healthInsurance = healthInsurance;
    return this;
  }

  /**
   * Get healthInsurance
   * @return healthInsurance
   */
  @javax.annotation.Nullable
  public GetEorCountryValidations200ResponseDataHealthInsurance getHealthInsurance() {
    return healthInsurance;
  }

  public void setHealthInsurance(@javax.annotation.Nullable GetEorCountryValidations200ResponseDataHealthInsurance healthInsurance) {
    this.healthInsurance = healthInsurance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEorCountryValidations200ResponseData getEorCountryValidations200ResponseData = (GetEorCountryValidations200ResponseData) o;
    return Objects.equals(this.salary, getEorCountryValidations200ResponseData.salary) &&
        Objects.equals(this.holiday, getEorCountryValidations200ResponseData.holiday) &&
        Objects.equals(this.currency, getEorCountryValidations200ResponseData.currency) &&
        Objects.equals(this.probation, getEorCountryValidations200ResponseData.probation) &&
        Objects.equals(this.healthInsurance, getEorCountryValidations200ResponseData.healthInsurance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(salary, holiday, currency, probation, healthInsurance);
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
    sb.append("class GetEorCountryValidations200ResponseData {\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    holiday: ").append(toIndentedString(holiday)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    probation: ").append(toIndentedString(probation)).append("\n");
    sb.append("    healthInsurance: ").append(toIndentedString(healthInsurance)).append("\n");
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
    openapiFields.add("holiday");
    openapiFields.add("currency");
    openapiFields.add("probation");
    openapiFields.add("health_insurance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetEorCountryValidations200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEorCountryValidations200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEorCountryValidations200ResponseData is not found in the empty JSON string", GetEorCountryValidations200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEorCountryValidations200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEorCountryValidations200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `salary`
      if (jsonObj.get("salary") != null && !jsonObj.get("salary").isJsonNull()) {
        GetEorCountryValidations200ResponseDataSalary.validateJsonElement(jsonObj.get("salary"));
      }
      // validate the optional field `holiday`
      if (jsonObj.get("holiday") != null && !jsonObj.get("holiday").isJsonNull()) {
        GetEorCountryValidations200ResponseDataHoliday.validateJsonElement(jsonObj.get("holiday"));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the optional field `probation`
      if (jsonObj.get("probation") != null && !jsonObj.get("probation").isJsonNull()) {
        GetEorCountryValidations200ResponseDataProbation.validateJsonElement(jsonObj.get("probation"));
      }
      // validate the optional field `health_insurance`
      if (jsonObj.get("health_insurance") != null && !jsonObj.get("health_insurance").isJsonNull()) {
        GetEorCountryValidations200ResponseDataHealthInsurance.validateJsonElement(jsonObj.get("health_insurance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEorCountryValidations200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEorCountryValidations200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEorCountryValidations200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEorCountryValidations200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEorCountryValidations200ResponseData>() {
           @Override
           public void write(JsonWriter out, GetEorCountryValidations200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEorCountryValidations200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetEorCountryValidations200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetEorCountryValidations200ResponseData
   * @throws IOException if the JSON string is invalid with respect to GetEorCountryValidations200ResponseData
   */
  public static GetEorCountryValidations200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEorCountryValidations200ResponseData.class);
  }

  /**
   * Convert an instance of GetEorCountryValidations200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

