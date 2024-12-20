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
import java.time.OffsetDateTime;
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
 * CreateGPContract201ResponseDataEmploymentHolidays
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T12:32:05.400762149Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateGPContract201ResponseDataEmploymentHolidays {
  public static final String SERIALIZED_NAME_ALLOWANCE = "allowance";
  @SerializedName(SERIALIZED_NAME_ALLOWANCE)
  @javax.annotation.Nullable
  private BigDecimal allowance;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime startDate;

  public CreateGPContract201ResponseDataEmploymentHolidays() {
  }

  public CreateGPContract201ResponseDataEmploymentHolidays allowance(@javax.annotation.Nullable BigDecimal allowance) {
    this.allowance = allowance;
    return this;
  }

  /**
   * Number of holidays.
   * @return allowance
   */
  @javax.annotation.Nullable
  public BigDecimal getAllowance() {
    return allowance;
  }

  public void setAllowance(@javax.annotation.Nullable BigDecimal allowance) {
    this.allowance = allowance;
  }


  public CreateGPContract201ResponseDataEmploymentHolidays startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return startDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable OffsetDateTime startDate) {
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
    CreateGPContract201ResponseDataEmploymentHolidays createGPContract201ResponseDataEmploymentHolidays = (CreateGPContract201ResponseDataEmploymentHolidays) o;
    return Objects.equals(this.allowance, createGPContract201ResponseDataEmploymentHolidays.allowance) &&
        Objects.equals(this.startDate, createGPContract201ResponseDataEmploymentHolidays.startDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowance, startDate);
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
    sb.append("class CreateGPContract201ResponseDataEmploymentHolidays {\n");
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
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateGPContract201ResponseDataEmploymentHolidays
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateGPContract201ResponseDataEmploymentHolidays.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGPContract201ResponseDataEmploymentHolidays is not found in the empty JSON string", CreateGPContract201ResponseDataEmploymentHolidays.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateGPContract201ResponseDataEmploymentHolidays.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGPContract201ResponseDataEmploymentHolidays` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGPContract201ResponseDataEmploymentHolidays.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGPContract201ResponseDataEmploymentHolidays' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGPContract201ResponseDataEmploymentHolidays> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGPContract201ResponseDataEmploymentHolidays.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGPContract201ResponseDataEmploymentHolidays>() {
           @Override
           public void write(JsonWriter out, CreateGPContract201ResponseDataEmploymentHolidays value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGPContract201ResponseDataEmploymentHolidays read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateGPContract201ResponseDataEmploymentHolidays given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateGPContract201ResponseDataEmploymentHolidays
   * @throws IOException if the JSON string is invalid with respect to CreateGPContract201ResponseDataEmploymentHolidays
   */
  public static CreateGPContract201ResponseDataEmploymentHolidays fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGPContract201ResponseDataEmploymentHolidays.class);
  }

  /**
   * Convert an instance of CreateGPContract201ResponseDataEmploymentHolidays to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

