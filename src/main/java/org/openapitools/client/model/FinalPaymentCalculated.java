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
import org.openapitools.client.model.FinalPaymentCalculatedLastCycle;

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
 * FinalPaymentCalculated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:11:44.252131062Z[GMT]", comments = "Generator version: 7.10.0")
public class FinalPaymentCalculated {
  public static final String SERIALIZED_NAME_DAILY_RATE = "daily_rate";
  @SerializedName(SERIALIZED_NAME_DAILY_RATE)
  @javax.annotation.Nonnull
  private String dailyRate;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nonnull
  private String total;

  public static final String SERIALIZED_NAME_REMAINING_DAYS = "remaining_days";
  @SerializedName(SERIALIZED_NAME_REMAINING_DAYS)
  @javax.annotation.Nonnull
  private String remainingDays;

  public static final String SERIALIZED_NAME_LAST_CYCLE = "last_cycle";
  @SerializedName(SERIALIZED_NAME_LAST_CYCLE)
  @javax.annotation.Nonnull
  private FinalPaymentCalculatedLastCycle lastCycle;

  /**
   * Either works days or calendar days
   */
  @JsonAdapter(CalculationTypeEnum.Adapter.class)
  public enum CalculationTypeEnum {
    CUSTOM_AMOUNT("CUSTOM_AMOUNT"),
    
    WORK_DAYS("WORK_DAYS"),
    
    CALENDAR_DAYS("CALENDAR_DAYS"),
    
    FULL_AMOUNT("FULL_AMOUNT");

    private String value;

    CalculationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CalculationTypeEnum fromValue(String value) {
      for (CalculationTypeEnum b : CalculationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CalculationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CalculationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CalculationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CalculationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CalculationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CALCULATION_TYPE = "calculation_type";
  @SerializedName(SERIALIZED_NAME_CALCULATION_TYPE)
  @javax.annotation.Nonnull
  private CalculationTypeEnum calculationType;

  public static final String SERIALIZED_NAME_WORKWEEK_START = "workweek_start";
  @SerializedName(SERIALIZED_NAME_WORKWEEK_START)
  @javax.annotation.Nonnull
  private BigDecimal workweekStart = new BigDecimal("1");

  public static final String SERIALIZED_NAME_WORKWEEK_END = "workweek_end";
  @SerializedName(SERIALIZED_NAME_WORKWEEK_END)
  @javax.annotation.Nonnull
  private BigDecimal workweekEnd = new BigDecimal("5");

  public FinalPaymentCalculated() {
  }

  public FinalPaymentCalculated dailyRate(@javax.annotation.Nonnull String dailyRate) {
    this.dailyRate = dailyRate;
    return this;
  }

  /**
   * The daily rate paid.
   * @return dailyRate
   */
  @javax.annotation.Nonnull
  public String getDailyRate() {
    return dailyRate;
  }

  public void setDailyRate(@javax.annotation.Nonnull String dailyRate) {
    this.dailyRate = dailyRate;
  }


  public FinalPaymentCalculated total(@javax.annotation.Nonnull String total) {
    this.total = total;
    return this;
  }

  /**
   * Total amount to pay.
   * @return total
   */
  @javax.annotation.Nonnull
  public String getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nonnull String total) {
    this.total = total;
  }


  public FinalPaymentCalculated remainingDays(@javax.annotation.Nonnull String remainingDays) {
    this.remainingDays = remainingDays;
    return this;
  }

  /**
   * Dais remaining to end the contract.
   * @return remainingDays
   */
  @javax.annotation.Nonnull
  public String getRemainingDays() {
    return remainingDays;
  }

  public void setRemainingDays(@javax.annotation.Nonnull String remainingDays) {
    this.remainingDays = remainingDays;
  }


  public FinalPaymentCalculated lastCycle(@javax.annotation.Nonnull FinalPaymentCalculatedLastCycle lastCycle) {
    this.lastCycle = lastCycle;
    return this;
  }

  /**
   * Get lastCycle
   * @return lastCycle
   */
  @javax.annotation.Nonnull
  public FinalPaymentCalculatedLastCycle getLastCycle() {
    return lastCycle;
  }

  public void setLastCycle(@javax.annotation.Nonnull FinalPaymentCalculatedLastCycle lastCycle) {
    this.lastCycle = lastCycle;
  }


  public FinalPaymentCalculated calculationType(@javax.annotation.Nonnull CalculationTypeEnum calculationType) {
    this.calculationType = calculationType;
    return this;
  }

  /**
   * Either works days or calendar days
   * @return calculationType
   */
  @javax.annotation.Nonnull
  public CalculationTypeEnum getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(@javax.annotation.Nonnull CalculationTypeEnum calculationType) {
    this.calculationType = calculationType;
  }


  public FinalPaymentCalculated workweekStart(@javax.annotation.Nonnull BigDecimal workweekStart) {
    this.workweekStart = workweekStart;
    return this;
  }

  /**
   * The day the work week starts, 0 to 6
   * @return workweekStart
   */
  @javax.annotation.Nonnull
  public BigDecimal getWorkweekStart() {
    return workweekStart;
  }

  public void setWorkweekStart(@javax.annotation.Nonnull BigDecimal workweekStart) {
    this.workweekStart = workweekStart;
  }


  public FinalPaymentCalculated workweekEnd(@javax.annotation.Nonnull BigDecimal workweekEnd) {
    this.workweekEnd = workweekEnd;
    return this;
  }

  /**
   * The day the work week starts, 0 to 6
   * @return workweekEnd
   */
  @javax.annotation.Nonnull
  public BigDecimal getWorkweekEnd() {
    return workweekEnd;
  }

  public void setWorkweekEnd(@javax.annotation.Nonnull BigDecimal workweekEnd) {
    this.workweekEnd = workweekEnd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinalPaymentCalculated finalPaymentCalculated = (FinalPaymentCalculated) o;
    return Objects.equals(this.dailyRate, finalPaymentCalculated.dailyRate) &&
        Objects.equals(this.total, finalPaymentCalculated.total) &&
        Objects.equals(this.remainingDays, finalPaymentCalculated.remainingDays) &&
        Objects.equals(this.lastCycle, finalPaymentCalculated.lastCycle) &&
        Objects.equals(this.calculationType, finalPaymentCalculated.calculationType) &&
        Objects.equals(this.workweekStart, finalPaymentCalculated.workweekStart) &&
        Objects.equals(this.workweekEnd, finalPaymentCalculated.workweekEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyRate, total, remainingDays, lastCycle, calculationType, workweekStart, workweekEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalPaymentCalculated {\n");
    sb.append("    dailyRate: ").append(toIndentedString(dailyRate)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    remainingDays: ").append(toIndentedString(remainingDays)).append("\n");
    sb.append("    lastCycle: ").append(toIndentedString(lastCycle)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    workweekStart: ").append(toIndentedString(workweekStart)).append("\n");
    sb.append("    workweekEnd: ").append(toIndentedString(workweekEnd)).append("\n");
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
    openapiFields.add("daily_rate");
    openapiFields.add("total");
    openapiFields.add("remaining_days");
    openapiFields.add("last_cycle");
    openapiFields.add("calculation_type");
    openapiFields.add("workweek_start");
    openapiFields.add("workweek_end");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("daily_rate");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("remaining_days");
    openapiRequiredFields.add("last_cycle");
    openapiRequiredFields.add("calculation_type");
    openapiRequiredFields.add("workweek_start");
    openapiRequiredFields.add("workweek_end");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FinalPaymentCalculated
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinalPaymentCalculated.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinalPaymentCalculated is not found in the empty JSON string", FinalPaymentCalculated.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FinalPaymentCalculated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinalPaymentCalculated` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinalPaymentCalculated.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("daily_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_rate").toString()));
      }
      if (!jsonObj.get("total").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total").toString()));
      }
      if (!jsonObj.get("remaining_days").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remaining_days` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remaining_days").toString()));
      }
      // validate the required field `last_cycle`
      FinalPaymentCalculatedLastCycle.validateJsonElement(jsonObj.get("last_cycle"));
      if (!jsonObj.get("calculation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calculation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calculation_type").toString()));
      }
      // validate the required field `calculation_type`
      CalculationTypeEnum.validateJsonElement(jsonObj.get("calculation_type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinalPaymentCalculated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinalPaymentCalculated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinalPaymentCalculated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinalPaymentCalculated.class));

       return (TypeAdapter<T>) new TypeAdapter<FinalPaymentCalculated>() {
           @Override
           public void write(JsonWriter out, FinalPaymentCalculated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinalPaymentCalculated read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FinalPaymentCalculated given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FinalPaymentCalculated
   * @throws IOException if the JSON string is invalid with respect to FinalPaymentCalculated
   */
  public static FinalPaymentCalculated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinalPaymentCalculated.class);
  }

  /**
   * Convert an instance of FinalPaymentCalculated to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

