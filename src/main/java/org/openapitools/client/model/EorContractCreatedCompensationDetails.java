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
 * EorContractCreatedCompensationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:40:51.396070831Z[GMT]", comments = "Generator version: 7.10.0")
public class EorContractCreatedCompensationDetails {
  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nullable
  private BigDecimal salary;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_VARIABLE_COMPENSATION = "variable_compensation";
  @SerializedName(SERIALIZED_NAME_VARIABLE_COMPENSATION)
  @javax.annotation.Nullable
  private String variableCompensation;

  public static final String SERIALIZED_NAME_VARIABLE_COMPENSATION_TYPE = "variable_compensation_type";
  @SerializedName(SERIALIZED_NAME_VARIABLE_COMPENSATION_TYPE)
  @javax.annotation.Nullable
  private String variableCompensationType;

  public EorContractCreatedCompensationDetails() {
  }

  public EorContractCreatedCompensationDetails salary(@javax.annotation.Nullable BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Gross annual salary.
   * @return salary
   */
  @javax.annotation.Nullable
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nullable BigDecimal salary) {
    this.salary = salary;
  }


  public EorContractCreatedCompensationDetails currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency of gross annual salary.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public EorContractCreatedCompensationDetails variableCompensation(@javax.annotation.Nullable String variableCompensation) {
    this.variableCompensation = variableCompensation;
    return this;
  }

  /**
   * Variable compensation acount or percentage.
   * @return variableCompensation
   */
  @javax.annotation.Nullable
  public String getVariableCompensation() {
    return variableCompensation;
  }

  public void setVariableCompensation(@javax.annotation.Nullable String variableCompensation) {
    this.variableCompensation = variableCompensation;
  }


  public EorContractCreatedCompensationDetails variableCompensationType(@javax.annotation.Nullable String variableCompensationType) {
    this.variableCompensationType = variableCompensationType;
    return this;
  }

  /**
   * Type fo variable compensation.
   * @return variableCompensationType
   */
  @javax.annotation.Nullable
  public String getVariableCompensationType() {
    return variableCompensationType;
  }

  public void setVariableCompensationType(@javax.annotation.Nullable String variableCompensationType) {
    this.variableCompensationType = variableCompensationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorContractCreatedCompensationDetails eorContractCreatedCompensationDetails = (EorContractCreatedCompensationDetails) o;
    return Objects.equals(this.salary, eorContractCreatedCompensationDetails.salary) &&
        Objects.equals(this.currency, eorContractCreatedCompensationDetails.currency) &&
        Objects.equals(this.variableCompensation, eorContractCreatedCompensationDetails.variableCompensation) &&
        Objects.equals(this.variableCompensationType, eorContractCreatedCompensationDetails.variableCompensationType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(salary, currency, variableCompensation, variableCompensationType);
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
    sb.append("class EorContractCreatedCompensationDetails {\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    variableCompensation: ").append(toIndentedString(variableCompensation)).append("\n");
    sb.append("    variableCompensationType: ").append(toIndentedString(variableCompensationType)).append("\n");
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
    openapiFields.add("variable_compensation");
    openapiFields.add("variable_compensation_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorContractCreatedCompensationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorContractCreatedCompensationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorContractCreatedCompensationDetails is not found in the empty JSON string", EorContractCreatedCompensationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorContractCreatedCompensationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorContractCreatedCompensationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("variable_compensation") != null && !jsonObj.get("variable_compensation").isJsonNull()) && !jsonObj.get("variable_compensation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable_compensation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variable_compensation").toString()));
      }
      if ((jsonObj.get("variable_compensation_type") != null && !jsonObj.get("variable_compensation_type").isJsonNull()) && !jsonObj.get("variable_compensation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable_compensation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variable_compensation_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorContractCreatedCompensationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorContractCreatedCompensationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorContractCreatedCompensationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorContractCreatedCompensationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<EorContractCreatedCompensationDetails>() {
           @Override
           public void write(JsonWriter out, EorContractCreatedCompensationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorContractCreatedCompensationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorContractCreatedCompensationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorContractCreatedCompensationDetails
   * @throws IOException if the JSON string is invalid with respect to EorContractCreatedCompensationDetails
   */
  public static EorContractCreatedCompensationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorContractCreatedCompensationDetails.class);
  }

  /**
   * Convert an instance of EorContractCreatedCompensationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

