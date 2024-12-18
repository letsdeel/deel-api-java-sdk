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
import org.openapitools.client.model.GPContractStatusTypeEnum;
import org.openapitools.client.model.GPContractToCreateEmploymentHolidays;

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
 * GPContractToCreateEmployment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:17:35.281321822Z[GMT]", comments = "Generator version: 7.10.0")
public class GPContractToCreateEmployment {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private GPContractStatusTypeEnum type;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_HOLIDAYS = "holidays";
  @SerializedName(SERIALIZED_NAME_HOLIDAYS)
  @javax.annotation.Nonnull
  private GPContractToCreateEmploymentHolidays holidays;

  public GPContractToCreateEmployment() {
  }

  public GPContractToCreateEmployment type(@javax.annotation.Nonnull GPContractStatusTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public GPContractStatusTypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull GPContractStatusTypeEnum type) {
    this.type = type;
  }


  public GPContractToCreateEmployment startDate(@javax.annotation.Nonnull LocalDate startDate) {
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


  public GPContractToCreateEmployment holidays(@javax.annotation.Nonnull GPContractToCreateEmploymentHolidays holidays) {
    this.holidays = holidays;
    return this;
  }

  /**
   * Get holidays
   * @return holidays
   */
  @javax.annotation.Nonnull
  public GPContractToCreateEmploymentHolidays getHolidays() {
    return holidays;
  }

  public void setHolidays(@javax.annotation.Nonnull GPContractToCreateEmploymentHolidays holidays) {
    this.holidays = holidays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPContractToCreateEmployment gpContractToCreateEmployment = (GPContractToCreateEmployment) o;
    return Objects.equals(this.type, gpContractToCreateEmployment.type) &&
        Objects.equals(this.startDate, gpContractToCreateEmployment.startDate) &&
        Objects.equals(this.holidays, gpContractToCreateEmployment.holidays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startDate, holidays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPContractToCreateEmployment {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    holidays: ").append(toIndentedString(holidays)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("start_date");
    openapiFields.add("holidays");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("holidays");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GPContractToCreateEmployment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPContractToCreateEmployment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPContractToCreateEmployment is not found in the empty JSON string", GPContractToCreateEmployment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPContractToCreateEmployment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPContractToCreateEmployment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GPContractToCreateEmployment.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `type`
      GPContractStatusTypeEnum.validateJsonElement(jsonObj.get("type"));
      // validate the required field `holidays`
      GPContractToCreateEmploymentHolidays.validateJsonElement(jsonObj.get("holidays"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPContractToCreateEmployment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPContractToCreateEmployment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPContractToCreateEmployment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPContractToCreateEmployment.class));

       return (TypeAdapter<T>) new TypeAdapter<GPContractToCreateEmployment>() {
           @Override
           public void write(JsonWriter out, GPContractToCreateEmployment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPContractToCreateEmployment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GPContractToCreateEmployment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GPContractToCreateEmployment
   * @throws IOException if the JSON string is invalid with respect to GPContractToCreateEmployment
   */
  public static GPContractToCreateEmployment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPContractToCreateEmployment.class);
  }

  /**
   * Convert an instance of GPContractToCreateEmployment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

