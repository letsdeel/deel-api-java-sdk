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
import org.openapitools.client.model.EorEmployeeCostCalculationRequestBodyBenefitsInner;
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
 * EorEmployeeCostCalculationRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T19:12:08.356438549Z[GMT]", comments = "Generator version: 7.10.0")
public class EorEmployeeCostCalculationRequestBody {
  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nonnull
  private BigDecimal salary;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nonnull
  private String country;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nonnull
  private String currency;

  public static final String SERIALIZED_NAME_BENEFITS = "benefits";
  @SerializedName(SERIALIZED_NAME_BENEFITS)
  @javax.annotation.Nullable
  private List<EorEmployeeCostCalculationRequestBodyBenefitsInner> benefits;

  public EorEmployeeCostCalculationRequestBody() {
  }

  public EorEmployeeCostCalculationRequestBody salary(@javax.annotation.Nonnull BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * The gross annual salary of the employee.
   * minimum: 1
   * @return salary
   */
  @javax.annotation.Nonnull
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nonnull BigDecimal salary) {
    this.salary = salary;
  }


  public EorEmployeeCostCalculationRequestBody country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * The country of employment.
   * @return country
   */
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nonnull String country) {
    this.country = country;
  }


  public EorEmployeeCostCalculationRequestBody state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * The state of employment.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public EorEmployeeCostCalculationRequestBody currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency that the salary is paid in.
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
  }


  public EorEmployeeCostCalculationRequestBody benefits(@javax.annotation.Nullable List<EorEmployeeCostCalculationRequestBodyBenefitsInner> benefits) {
    this.benefits = benefits;
    return this;
  }

  public EorEmployeeCostCalculationRequestBody addBenefitsItem(EorEmployeeCostCalculationRequestBodyBenefitsInner benefitsItem) {
    if (this.benefits == null) {
      this.benefits = new ArrayList<>();
    }
    this.benefits.add(benefitsItem);
    return this;
  }

  /**
   * Benefits which should be included in the calculation.
   * @return benefits
   */
  @javax.annotation.Nullable
  public List<EorEmployeeCostCalculationRequestBodyBenefitsInner> getBenefits() {
    return benefits;
  }

  public void setBenefits(@javax.annotation.Nullable List<EorEmployeeCostCalculationRequestBodyBenefitsInner> benefits) {
    this.benefits = benefits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorEmployeeCostCalculationRequestBody eorEmployeeCostCalculationRequestBody = (EorEmployeeCostCalculationRequestBody) o;
    return Objects.equals(this.salary, eorEmployeeCostCalculationRequestBody.salary) &&
        Objects.equals(this.country, eorEmployeeCostCalculationRequestBody.country) &&
        Objects.equals(this.state, eorEmployeeCostCalculationRequestBody.state) &&
        Objects.equals(this.currency, eorEmployeeCostCalculationRequestBody.currency) &&
        Objects.equals(this.benefits, eorEmployeeCostCalculationRequestBody.benefits);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(salary, country, state, currency, benefits);
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
    sb.append("class EorEmployeeCostCalculationRequestBody {\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("state");
    openapiFields.add("currency");
    openapiFields.add("benefits");

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
   * @throws IOException if the JSON Element is invalid with respect to EorEmployeeCostCalculationRequestBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorEmployeeCostCalculationRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorEmployeeCostCalculationRequestBody is not found in the empty JSON string", EorEmployeeCostCalculationRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorEmployeeCostCalculationRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorEmployeeCostCalculationRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EorEmployeeCostCalculationRequestBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
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
            EorEmployeeCostCalculationRequestBodyBenefitsInner.validateJsonElement(jsonArraybenefits.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorEmployeeCostCalculationRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorEmployeeCostCalculationRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorEmployeeCostCalculationRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorEmployeeCostCalculationRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<EorEmployeeCostCalculationRequestBody>() {
           @Override
           public void write(JsonWriter out, EorEmployeeCostCalculationRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorEmployeeCostCalculationRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorEmployeeCostCalculationRequestBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorEmployeeCostCalculationRequestBody
   * @throws IOException if the JSON string is invalid with respect to EorEmployeeCostCalculationRequestBody
   */
  public static EorEmployeeCostCalculationRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorEmployeeCostCalculationRequestBody.class);
  }

  /**
   * Convert an instance of EorEmployeeCostCalculationRequestBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

