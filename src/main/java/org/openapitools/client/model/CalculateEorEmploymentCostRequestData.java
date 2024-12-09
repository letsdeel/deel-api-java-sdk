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
import org.openapitools.client.model.CalculateEorEmploymentCostRequestDataBenefitsInner;
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
 * CalculateEorEmploymentCostRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class CalculateEorEmploymentCostRequestData {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  private BigDecimal salary;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_BENEFITS = "benefits";
  @SerializedName(SERIALIZED_NAME_BENEFITS)
  private List<CalculateEorEmploymentCostRequestDataBenefitsInner> benefits;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public CalculateEorEmploymentCostRequestData() {
  }

  public CalculateEorEmploymentCostRequestData state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state or region within the country, if applicable.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public CalculateEorEmploymentCostRequestData salary(BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * The base salary for the employee.
   * minimum: 1
   * @return salary
   */
  @javax.annotation.Nonnull
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }


  public CalculateEorEmploymentCostRequestData country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The country where the employee is based.
   * @return country
   */
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public CalculateEorEmploymentCostRequestData benefits(List<CalculateEorEmploymentCostRequestDataBenefitsInner> benefits) {
    this.benefits = benefits;
    return this;
  }

  public CalculateEorEmploymentCostRequestData addBenefitsItem(CalculateEorEmploymentCostRequestDataBenefitsInner benefitsItem) {
    if (this.benefits == null) {
      this.benefits = new ArrayList<>();
    }
    this.benefits.add(benefitsItem);
    return this;
  }

  /**
   * A list of selected benefit plans for the employee.
   * @return benefits
   */
  @javax.annotation.Nullable
  public List<CalculateEorEmploymentCostRequestDataBenefitsInner> getBenefits() {
    return benefits;
  }

  public void setBenefits(List<CalculateEorEmploymentCostRequestDataBenefitsInner> benefits) {
    this.benefits = benefits;
  }


  public CalculateEorEmploymentCostRequestData currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency in which the costs are calculated.
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateEorEmploymentCostRequestData calculateEorEmploymentCostRequestData = (CalculateEorEmploymentCostRequestData) o;
    return Objects.equals(this.state, calculateEorEmploymentCostRequestData.state) &&
        Objects.equals(this.salary, calculateEorEmploymentCostRequestData.salary) &&
        Objects.equals(this.country, calculateEorEmploymentCostRequestData.country) &&
        Objects.equals(this.benefits, calculateEorEmploymentCostRequestData.benefits) &&
        Objects.equals(this.currency, calculateEorEmploymentCostRequestData.currency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, salary, country, benefits, currency);
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
    sb.append("class CalculateEorEmploymentCostRequestData {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("salary");
    openapiFields.add("country");
    openapiFields.add("benefits");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("salary");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("currency");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CalculateEorEmploymentCostRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CalculateEorEmploymentCostRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CalculateEorEmploymentCostRequestData is not found in the empty JSON string", CalculateEorEmploymentCostRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CalculateEorEmploymentCostRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CalculateEorEmploymentCostRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CalculateEorEmploymentCostRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("benefits") != null && !jsonObj.get("benefits").isJsonNull()) {
        JsonArray jsonArraybenefits = jsonObj.getAsJsonArray("benefits");
        if (jsonArraybenefits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("benefits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `benefits` to be an array in the JSON string but got `%s`", jsonObj.get("benefits").toString()));
          }

          // validate the optional field `benefits` (array)
          for (int i = 0; i < jsonArraybenefits.size(); i++) {
            CalculateEorEmploymentCostRequestDataBenefitsInner.validateJsonElement(jsonArraybenefits.get(i));
          };
        }
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CalculateEorEmploymentCostRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CalculateEorEmploymentCostRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CalculateEorEmploymentCostRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CalculateEorEmploymentCostRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CalculateEorEmploymentCostRequestData>() {
           @Override
           public void write(JsonWriter out, CalculateEorEmploymentCostRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CalculateEorEmploymentCostRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CalculateEorEmploymentCostRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CalculateEorEmploymentCostRequestData
   * @throws IOException if the JSON string is invalid with respect to CalculateEorEmploymentCostRequestData
   */
  public static CalculateEorEmploymentCostRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CalculateEorEmploymentCostRequestData.class);
  }

  /**
   * Convert an instance of CalculateEorEmploymentCostRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

