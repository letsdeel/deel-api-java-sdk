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
import org.openapitools.client.model.GPContractSalaryStatusEnum;

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
 * GPEmployeeCompensationUpdatedInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class GPEmployeeCompensationUpdatedInner {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private GPContractSalaryStatusEnum status;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nullable
  private GPContractSalaryScaleEnum scale;

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nullable
  private BigDecimal salary;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  @javax.annotation.Nullable
  private LocalDate effectiveDate;

  public GPEmployeeCompensationUpdatedInner() {
  }

  public GPEmployeeCompensationUpdatedInner status(@javax.annotation.Nullable GPContractSalaryStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public GPContractSalaryStatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable GPContractSalaryStatusEnum status) {
    this.status = status;
  }


  public GPEmployeeCompensationUpdatedInner scale(@javax.annotation.Nullable GPContractSalaryScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
   */
  @javax.annotation.Nullable
  public GPContractSalaryScaleEnum getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nullable GPContractSalaryScaleEnum scale) {
    this.scale = scale;
  }


  public GPEmployeeCompensationUpdatedInner salary(@javax.annotation.Nullable BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Compensation salary.
   * @return salary
   */
  @javax.annotation.Nullable
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nullable BigDecimal salary) {
    this.salary = salary;
  }


  public GPEmployeeCompensationUpdatedInner effectiveDate(@javax.annotation.Nullable LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return effectiveDate
   */
  @javax.annotation.Nullable
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(@javax.annotation.Nullable LocalDate effectiveDate) {
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
    GPEmployeeCompensationUpdatedInner gpEmployeeCompensationUpdatedInner = (GPEmployeeCompensationUpdatedInner) o;
    return Objects.equals(this.status, gpEmployeeCompensationUpdatedInner.status) &&
        Objects.equals(this.scale, gpEmployeeCompensationUpdatedInner.scale) &&
        Objects.equals(this.salary, gpEmployeeCompensationUpdatedInner.salary) &&
        Objects.equals(this.effectiveDate, gpEmployeeCompensationUpdatedInner.effectiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, scale, salary, effectiveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPEmployeeCompensationUpdatedInner {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("scale");
    openapiFields.add("salary");
    openapiFields.add("effective_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GPEmployeeCompensationUpdatedInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPEmployeeCompensationUpdatedInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPEmployeeCompensationUpdatedInner is not found in the empty JSON string", GPEmployeeCompensationUpdatedInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPEmployeeCompensationUpdatedInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPEmployeeCompensationUpdatedInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        GPContractSalaryStatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `scale`
      if (jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) {
        GPContractSalaryScaleEnum.validateJsonElement(jsonObj.get("scale"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPEmployeeCompensationUpdatedInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPEmployeeCompensationUpdatedInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPEmployeeCompensationUpdatedInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPEmployeeCompensationUpdatedInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GPEmployeeCompensationUpdatedInner>() {
           @Override
           public void write(JsonWriter out, GPEmployeeCompensationUpdatedInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPEmployeeCompensationUpdatedInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GPEmployeeCompensationUpdatedInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GPEmployeeCompensationUpdatedInner
   * @throws IOException if the JSON string is invalid with respect to GPEmployeeCompensationUpdatedInner
   */
  public static GPEmployeeCompensationUpdatedInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPEmployeeCompensationUpdatedInner.class);
  }

  /**
   * Convert an instance of GPEmployeeCompensationUpdatedInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

