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
import org.openapitools.client.model.GPContractSalaryScaleEnum;

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
 * GPEmployeeCompensationUpdateData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T14:19:15.487453130Z[GMT]", comments = "Generator version: 7.10.0")
public class GPEmployeeCompensationUpdateData {
  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nonnull
  private GPContractSalaryScaleEnum scale;

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nonnull
  private BigDecimal salary;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  @javax.annotation.Nonnull
  private LocalDate effectiveDate;

  public GPEmployeeCompensationUpdateData() {
  }

  public GPEmployeeCompensationUpdateData scale(@javax.annotation.Nonnull GPContractSalaryScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
   */
  @javax.annotation.Nonnull
  public GPContractSalaryScaleEnum getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nonnull GPContractSalaryScaleEnum scale) {
    this.scale = scale;
  }


  public GPEmployeeCompensationUpdateData salary(@javax.annotation.Nonnull BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Compensation salary.
   * @return salary
   */
  @javax.annotation.Nonnull
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nonnull BigDecimal salary) {
    this.salary = salary;
  }


  public GPEmployeeCompensationUpdateData effectiveDate(@javax.annotation.Nonnull LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return effectiveDate
   */
  @javax.annotation.Nonnull
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(@javax.annotation.Nonnull LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPEmployeeCompensationUpdateData gpEmployeeCompensationUpdateData = (GPEmployeeCompensationUpdateData) o;
    return Objects.equals(this.scale, gpEmployeeCompensationUpdateData.scale) &&
        Objects.equals(this.salary, gpEmployeeCompensationUpdateData.salary) &&
        Objects.equals(this.effectiveDate, gpEmployeeCompensationUpdateData.effectiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, salary, effectiveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPEmployeeCompensationUpdateData {\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
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
    openapiFields.add("scale");
    openapiFields.add("salary");
    openapiFields.add("effective_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scale");
    openapiRequiredFields.add("salary");
    openapiRequiredFields.add("effective_date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GPEmployeeCompensationUpdateData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPEmployeeCompensationUpdateData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPEmployeeCompensationUpdateData is not found in the empty JSON string", GPEmployeeCompensationUpdateData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPEmployeeCompensationUpdateData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPEmployeeCompensationUpdateData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GPEmployeeCompensationUpdateData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `scale`
      GPContractSalaryScaleEnum.validateJsonElement(jsonObj.get("scale"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPEmployeeCompensationUpdateData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPEmployeeCompensationUpdateData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPEmployeeCompensationUpdateData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPEmployeeCompensationUpdateData.class));

       return (TypeAdapter<T>) new TypeAdapter<GPEmployeeCompensationUpdateData>() {
           @Override
           public void write(JsonWriter out, GPEmployeeCompensationUpdateData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPEmployeeCompensationUpdateData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GPEmployeeCompensationUpdateData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GPEmployeeCompensationUpdateData
   * @throws IOException if the JSON string is invalid with respect to GPEmployeeCompensationUpdateData
   */
  public static GPEmployeeCompensationUpdateData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPEmployeeCompensationUpdateData.class);
  }

  /**
   * Convert an instance of GPEmployeeCompensationUpdateData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

