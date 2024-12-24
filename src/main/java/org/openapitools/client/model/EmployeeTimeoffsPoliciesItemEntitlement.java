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
 * EmployeeTimeoffsPoliciesItemEntitlement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:03:48.437639881Z[GMT]", comments = "Generator version: 7.10.0")
public class EmployeeTimeoffsPoliciesItemEntitlement {
  public static final String SERIALIZED_NAME_ACCRUAL_AMOUNT = "accrual_amount";
  @SerializedName(SERIALIZED_NAME_ACCRUAL_AMOUNT)
  @javax.annotation.Nullable
  private String accrualAmount;

  public static final String SERIALIZED_NAME_ACCRUAL_UNIT = "accrual_unit";
  @SerializedName(SERIALIZED_NAME_ACCRUAL_UNIT)
  @javax.annotation.Nullable
  private String accrualUnit;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private String total;

  public static final String SERIALIZED_NAME_UNIT_AMOUNT = "unit_amount";
  @SerializedName(SERIALIZED_NAME_UNIT_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal unitAmount;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  @javax.annotation.Nullable
  private String unit;

  public static final String SERIALIZED_NAME_ACCRUED = "accrued";
  @SerializedName(SERIALIZED_NAME_ACCRUED)
  @javax.annotation.Nullable
  private String accrued;

  public EmployeeTimeoffsPoliciesItemEntitlement() {
  }

  public EmployeeTimeoffsPoliciesItemEntitlement accrualAmount(@javax.annotation.Nullable String accrualAmount) {
    this.accrualAmount = accrualAmount;
    return this;
  }

  /**
   * Accrual amount of the time off policy.
   * @return accrualAmount
   */
  @javax.annotation.Nullable
  public String getAccrualAmount() {
    return accrualAmount;
  }

  public void setAccrualAmount(@javax.annotation.Nullable String accrualAmount) {
    this.accrualAmount = accrualAmount;
  }


  public EmployeeTimeoffsPoliciesItemEntitlement accrualUnit(@javax.annotation.Nullable String accrualUnit) {
    this.accrualUnit = accrualUnit;
    return this;
  }

  /**
   * Accrual unit of the time off policy.
   * @return accrualUnit
   */
  @javax.annotation.Nullable
  public String getAccrualUnit() {
    return accrualUnit;
  }

  public void setAccrualUnit(@javax.annotation.Nullable String accrualUnit) {
    this.accrualUnit = accrualUnit;
  }


  public EmployeeTimeoffsPoliciesItemEntitlement total(@javax.annotation.Nullable String total) {
    this.total = total;
    return this;
  }

  /**
   * Total time off policy.
   * @return total
   */
  @javax.annotation.Nullable
  public String getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nullable String total) {
    this.total = total;
  }


  public EmployeeTimeoffsPoliciesItemEntitlement unitAmount(@javax.annotation.Nullable BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
    return this;
  }

  /**
   * Unit amount of the time off policy.
   * @return unitAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getUnitAmount() {
    return unitAmount;
  }

  public void setUnitAmount(@javax.annotation.Nullable BigDecimal unitAmount) {
    this.unitAmount = unitAmount;
  }


  public EmployeeTimeoffsPoliciesItemEntitlement unit(@javax.annotation.Nullable String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Unit of the time off policy.
   * @return unit
   */
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }

  public void setUnit(@javax.annotation.Nullable String unit) {
    this.unit = unit;
  }


  public EmployeeTimeoffsPoliciesItemEntitlement accrued(@javax.annotation.Nullable String accrued) {
    this.accrued = accrued;
    return this;
  }

  /**
   * Accrued time off policy.
   * @return accrued
   */
  @javax.annotation.Nullable
  public String getAccrued() {
    return accrued;
  }

  public void setAccrued(@javax.annotation.Nullable String accrued) {
    this.accrued = accrued;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTimeoffsPoliciesItemEntitlement employeeTimeoffsPoliciesItemEntitlement = (EmployeeTimeoffsPoliciesItemEntitlement) o;
    return Objects.equals(this.accrualAmount, employeeTimeoffsPoliciesItemEntitlement.accrualAmount) &&
        Objects.equals(this.accrualUnit, employeeTimeoffsPoliciesItemEntitlement.accrualUnit) &&
        Objects.equals(this.total, employeeTimeoffsPoliciesItemEntitlement.total) &&
        Objects.equals(this.unitAmount, employeeTimeoffsPoliciesItemEntitlement.unitAmount) &&
        Objects.equals(this.unit, employeeTimeoffsPoliciesItemEntitlement.unit) &&
        Objects.equals(this.accrued, employeeTimeoffsPoliciesItemEntitlement.accrued);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accrualAmount, accrualUnit, total, unitAmount, unit, accrued);
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
    sb.append("class EmployeeTimeoffsPoliciesItemEntitlement {\n");
    sb.append("    accrualAmount: ").append(toIndentedString(accrualAmount)).append("\n");
    sb.append("    accrualUnit: ").append(toIndentedString(accrualUnit)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    unitAmount: ").append(toIndentedString(unitAmount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    accrued: ").append(toIndentedString(accrued)).append("\n");
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
    openapiFields.add("accrual_amount");
    openapiFields.add("accrual_unit");
    openapiFields.add("total");
    openapiFields.add("unit_amount");
    openapiFields.add("unit");
    openapiFields.add("accrued");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmployeeTimeoffsPoliciesItemEntitlement
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmployeeTimeoffsPoliciesItemEntitlement.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeTimeoffsPoliciesItemEntitlement is not found in the empty JSON string", EmployeeTimeoffsPoliciesItemEntitlement.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmployeeTimeoffsPoliciesItemEntitlement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmployeeTimeoffsPoliciesItemEntitlement` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accrual_amount") != null && !jsonObj.get("accrual_amount").isJsonNull()) && !jsonObj.get("accrual_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accrual_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accrual_amount").toString()));
      }
      if ((jsonObj.get("accrual_unit") != null && !jsonObj.get("accrual_unit").isJsonNull()) && !jsonObj.get("accrual_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accrual_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accrual_unit").toString()));
      }
      if ((jsonObj.get("total") != null && !jsonObj.get("total").isJsonNull()) && !jsonObj.get("total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total").toString()));
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      if ((jsonObj.get("accrued") != null && !jsonObj.get("accrued").isJsonNull()) && !jsonObj.get("accrued").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accrued` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accrued").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeTimeoffsPoliciesItemEntitlement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeTimeoffsPoliciesItemEntitlement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeTimeoffsPoliciesItemEntitlement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeTimeoffsPoliciesItemEntitlement.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeTimeoffsPoliciesItemEntitlement>() {
           @Override
           public void write(JsonWriter out, EmployeeTimeoffsPoliciesItemEntitlement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeeTimeoffsPoliciesItemEntitlement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmployeeTimeoffsPoliciesItemEntitlement given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmployeeTimeoffsPoliciesItemEntitlement
   * @throws IOException if the JSON string is invalid with respect to EmployeeTimeoffsPoliciesItemEntitlement
   */
  public static EmployeeTimeoffsPoliciesItemEntitlement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeTimeoffsPoliciesItemEntitlement.class);
  }

  /**
   * Convert an instance of EmployeeTimeoffsPoliciesItemEntitlement to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

