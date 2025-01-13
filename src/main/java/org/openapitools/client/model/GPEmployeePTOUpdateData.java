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
import java.time.LocalDate;
import java.util.Arrays;

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
 * GPEmployeePTOUpdateData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:23:41.573776663Z[GMT]", comments = "Generator version: 7.10.0")
public class GPEmployeePTOUpdateData {
  public static final String SERIALIZED_NAME_ACCRUAL_START_DATE = "accrual_start_date";
  @SerializedName(SERIALIZED_NAME_ACCRUAL_START_DATE)
  @javax.annotation.Nonnull
  private LocalDate accrualStartDate;

  public static final String SERIALIZED_NAME_YEARLY_ALLOWANCE = "yearly_allowance";
  @SerializedName(SERIALIZED_NAME_YEARLY_ALLOWANCE)
  @javax.annotation.Nonnull
  private String yearlyAllowance;

  public GPEmployeePTOUpdateData() {
  }

  public GPEmployeePTOUpdateData accrualStartDate(@javax.annotation.Nonnull LocalDate accrualStartDate) {
    this.accrualStartDate = accrualStartDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return accrualStartDate
   */
  @javax.annotation.Nonnull
  public LocalDate getAccrualStartDate() {
    return accrualStartDate;
  }

  public void setAccrualStartDate(@javax.annotation.Nonnull LocalDate accrualStartDate) {
    this.accrualStartDate = accrualStartDate;
  }


  public GPEmployeePTOUpdateData yearlyAllowance(@javax.annotation.Nonnull String yearlyAllowance) {
    this.yearlyAllowance = yearlyAllowance;
    return this;
  }

  /**
   * Enter the number of holidays.
   * @return yearlyAllowance
   */
  @javax.annotation.Nonnull
  public String getYearlyAllowance() {
    return yearlyAllowance;
  }

  public void setYearlyAllowance(@javax.annotation.Nonnull String yearlyAllowance) {
    this.yearlyAllowance = yearlyAllowance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPEmployeePTOUpdateData gpEmployeePTOUpdateData = (GPEmployeePTOUpdateData) o;
    return Objects.equals(this.accrualStartDate, gpEmployeePTOUpdateData.accrualStartDate) &&
        Objects.equals(this.yearlyAllowance, gpEmployeePTOUpdateData.yearlyAllowance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accrualStartDate, yearlyAllowance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPEmployeePTOUpdateData {\n");
    sb.append("    accrualStartDate: ").append(toIndentedString(accrualStartDate)).append("\n");
    sb.append("    yearlyAllowance: ").append(toIndentedString(yearlyAllowance)).append("\n");
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
    openapiFields.add("accrual_start_date");
    openapiFields.add("yearly_allowance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accrual_start_date");
    openapiRequiredFields.add("yearly_allowance");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GPEmployeePTOUpdateData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPEmployeePTOUpdateData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPEmployeePTOUpdateData is not found in the empty JSON string", GPEmployeePTOUpdateData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPEmployeePTOUpdateData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPEmployeePTOUpdateData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GPEmployeePTOUpdateData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("yearly_allowance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yearly_allowance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yearly_allowance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPEmployeePTOUpdateData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPEmployeePTOUpdateData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPEmployeePTOUpdateData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPEmployeePTOUpdateData.class));

       return (TypeAdapter<T>) new TypeAdapter<GPEmployeePTOUpdateData>() {
           @Override
           public void write(JsonWriter out, GPEmployeePTOUpdateData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPEmployeePTOUpdateData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GPEmployeePTOUpdateData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GPEmployeePTOUpdateData
   * @throws IOException if the JSON string is invalid with respect to GPEmployeePTOUpdateData
   */
  public static GPEmployeePTOUpdateData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPEmployeePTOUpdateData.class);
  }

  /**
   * Convert an instance of GPEmployeePTOUpdateData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

