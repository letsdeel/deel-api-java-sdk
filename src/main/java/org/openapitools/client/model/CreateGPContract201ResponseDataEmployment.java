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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.CreateGPContract201ResponseDataEmploymentHolidays;
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
 * CreateGPContract201ResponseDataEmployment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateGPContract201ResponseDataEmployment {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_HOLIDAYS = "holidays";
  @SerializedName(SERIALIZED_NAME_HOLIDAYS)
  @javax.annotation.Nullable
  private CreateGPContract201ResponseDataEmploymentHolidays holidays;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_WORK_VISA_REQUIRED = "work_visa_required";
  @SerializedName(SERIALIZED_NAME_WORK_VISA_REQUIRED)
  @javax.annotation.Nullable
  private Boolean workVisaRequired;

  public CreateGPContract201ResponseDataEmployment() {
  }

  public CreateGPContract201ResponseDataEmployment type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Is it a full-time contract or a part-time contract?
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public CreateGPContract201ResponseDataEmployment state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * State code of the state/province where this person will be employed.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public CreateGPContract201ResponseDataEmployment country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of employment.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public CreateGPContract201ResponseDataEmployment endDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return endDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public CreateGPContract201ResponseDataEmployment holidays(@javax.annotation.Nullable CreateGPContract201ResponseDataEmploymentHolidays holidays) {
    this.holidays = holidays;
    return this;
  }

  /**
   * Get holidays
   * @return holidays
   */
  @javax.annotation.Nullable
  public CreateGPContract201ResponseDataEmploymentHolidays getHolidays() {
    return holidays;
  }

  public void setHolidays(@javax.annotation.Nullable CreateGPContract201ResponseDataEmploymentHolidays holidays) {
    this.holidays = holidays;
  }


  public CreateGPContract201ResponseDataEmployment startDate(@javax.annotation.Nullable OffsetDateTime startDate) {
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


  public CreateGPContract201ResponseDataEmployment workVisaRequired(@javax.annotation.Nullable Boolean workVisaRequired) {
    this.workVisaRequired = workVisaRequired;
    return this;
  }

  /**
   * Do you require Deel to apply for a work visa for this person?
   * @return workVisaRequired
   */
  @javax.annotation.Nullable
  public Boolean getWorkVisaRequired() {
    return workVisaRequired;
  }

  public void setWorkVisaRequired(@javax.annotation.Nullable Boolean workVisaRequired) {
    this.workVisaRequired = workVisaRequired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGPContract201ResponseDataEmployment createGPContract201ResponseDataEmployment = (CreateGPContract201ResponseDataEmployment) o;
    return Objects.equals(this.type, createGPContract201ResponseDataEmployment.type) &&
        Objects.equals(this.state, createGPContract201ResponseDataEmployment.state) &&
        Objects.equals(this.country, createGPContract201ResponseDataEmployment.country) &&
        Objects.equals(this.endDate, createGPContract201ResponseDataEmployment.endDate) &&
        Objects.equals(this.holidays, createGPContract201ResponseDataEmployment.holidays) &&
        Objects.equals(this.startDate, createGPContract201ResponseDataEmployment.startDate) &&
        Objects.equals(this.workVisaRequired, createGPContract201ResponseDataEmployment.workVisaRequired);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, state, country, endDate, holidays, startDate, workVisaRequired);
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
    sb.append("class CreateGPContract201ResponseDataEmployment {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    holidays: ").append(toIndentedString(holidays)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    workVisaRequired: ").append(toIndentedString(workVisaRequired)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("country");
    openapiFields.add("end_date");
    openapiFields.add("holidays");
    openapiFields.add("start_date");
    openapiFields.add("work_visa_required");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateGPContract201ResponseDataEmployment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateGPContract201ResponseDataEmployment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGPContract201ResponseDataEmployment is not found in the empty JSON string", CreateGPContract201ResponseDataEmployment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateGPContract201ResponseDataEmployment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGPContract201ResponseDataEmployment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // validate the optional field `holidays`
      if (jsonObj.get("holidays") != null && !jsonObj.get("holidays").isJsonNull()) {
        CreateGPContract201ResponseDataEmploymentHolidays.validateJsonElement(jsonObj.get("holidays"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGPContract201ResponseDataEmployment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGPContract201ResponseDataEmployment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGPContract201ResponseDataEmployment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGPContract201ResponseDataEmployment.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGPContract201ResponseDataEmployment>() {
           @Override
           public void write(JsonWriter out, CreateGPContract201ResponseDataEmployment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGPContract201ResponseDataEmployment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateGPContract201ResponseDataEmployment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateGPContract201ResponseDataEmployment
   * @throws IOException if the JSON string is invalid with respect to CreateGPContract201ResponseDataEmployment
   */
  public static CreateGPContract201ResponseDataEmployment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGPContract201ResponseDataEmployment.class);
  }

  /**
   * Convert an instance of CreateGPContract201ResponseDataEmployment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

