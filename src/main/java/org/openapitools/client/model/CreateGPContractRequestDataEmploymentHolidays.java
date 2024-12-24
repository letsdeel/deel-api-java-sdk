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
 * CreateGPContractRequestDataEmploymentHolidays
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:29:34.997576605Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateGPContractRequestDataEmploymentHolidays {
  public static final String SERIALIZED_NAME_ALLOWANCE = "allowance";
  @SerializedName(SERIALIZED_NAME_ALLOWANCE)
  @javax.annotation.Nonnull
  private BigDecimal allowance;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private LocalDate startDate;

  public CreateGPContractRequestDataEmploymentHolidays() {
  }

  public CreateGPContractRequestDataEmploymentHolidays allowance(@javax.annotation.Nonnull BigDecimal allowance) {
    this.allowance = allowance;
    return this;
  }

  /**
   * Enter the number of holidays.
   * @return allowance
   */
  @javax.annotation.Nonnull
  public BigDecimal getAllowance() {
    return allowance;
  }

  public void setAllowance(@javax.annotation.Nonnull BigDecimal allowance) {
    this.allowance = allowance;
  }


  public CreateGPContractRequestDataEmploymentHolidays startDate(@javax.annotation.Nonnull LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return startDate
   */
  @javax.annotation.Nonnull
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nonnull LocalDate startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGPContractRequestDataEmploymentHolidays createGPContractRequestDataEmploymentHolidays = (CreateGPContractRequestDataEmploymentHolidays) o;
    return Objects.equals(this.allowance, createGPContractRequestDataEmploymentHolidays.allowance) &&
        Objects.equals(this.startDate, createGPContractRequestDataEmploymentHolidays.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowance, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGPContractRequestDataEmploymentHolidays {\n");
    sb.append("    allowance: ").append(toIndentedString(allowance)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("allowance");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("allowance");
    openapiRequiredFields.add("start_date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateGPContractRequestDataEmploymentHolidays
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateGPContractRequestDataEmploymentHolidays.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGPContractRequestDataEmploymentHolidays is not found in the empty JSON string", CreateGPContractRequestDataEmploymentHolidays.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateGPContractRequestDataEmploymentHolidays.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGPContractRequestDataEmploymentHolidays` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateGPContractRequestDataEmploymentHolidays.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGPContractRequestDataEmploymentHolidays.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGPContractRequestDataEmploymentHolidays' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGPContractRequestDataEmploymentHolidays> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGPContractRequestDataEmploymentHolidays.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGPContractRequestDataEmploymentHolidays>() {
           @Override
           public void write(JsonWriter out, CreateGPContractRequestDataEmploymentHolidays value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGPContractRequestDataEmploymentHolidays read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateGPContractRequestDataEmploymentHolidays given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateGPContractRequestDataEmploymentHolidays
   * @throws IOException if the JSON string is invalid with respect to CreateGPContractRequestDataEmploymentHolidays
   */
  public static CreateGPContractRequestDataEmploymentHolidays fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGPContractRequestDataEmploymentHolidays.class);
  }

  /**
   * Convert an instance of CreateGPContractRequestDataEmploymentHolidays to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

