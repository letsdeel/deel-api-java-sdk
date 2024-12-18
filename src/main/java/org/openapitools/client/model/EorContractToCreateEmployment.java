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
 * EorContractToCreateEmployment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:45:24.021173966Z[GMT]", comments = "Generator version: 7.10.0")
public class EorContractToCreateEmployment {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nonnull
  private String country;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  /**
   * Is it a full-time contract or a part-time contract?
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FULL_TIME("Full-time"),
    
    PART_TIME("Part-time");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private TypeEnum type;

  public static final String SERIALIZED_NAME_WORK_VISA_REQUIRED = "work_visa_required";
  @SerializedName(SERIALIZED_NAME_WORK_VISA_REQUIRED)
  @javax.annotation.Nonnull
  private Boolean workVisaRequired = false;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_PROBATION_PERIOD = "probation_period";
  @SerializedName(SERIALIZED_NAME_PROBATION_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal probationPeriod;

  public static final String SERIALIZED_NAME_SCOPE_OF_WORK = "scope_of_work";
  @SerializedName(SERIALIZED_NAME_SCOPE_OF_WORK)
  @javax.annotation.Nullable
  private String scopeOfWork;

  /**
   * If you want to use standard number of holidays for this employee, choose \&quot;STANDARD\&quot;. If you want to enter a specific number of holidays, choose \&quot;SPECIFIC\&quot; and enter the number of days in the holidays field.
   */
  @JsonAdapter(TimeOffTypeEnum.Adapter.class)
  public enum TimeOffTypeEnum {
    STANDARD("STANDARD"),
    
    SPECIFIC("SPECIFIC");

    private String value;

    TimeOffTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeOffTypeEnum fromValue(String value) {
      for (TimeOffTypeEnum b : TimeOffTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimeOffTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeOffTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeOffTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimeOffTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TimeOffTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE = "time_off_type";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE)
  @javax.annotation.Nullable
  private TimeOffTypeEnum timeOffType;

  public static final String SERIALIZED_NAME_HOLIDAYS = "holidays";
  @SerializedName(SERIALIZED_NAME_HOLIDAYS)
  @javax.annotation.Nullable
  private BigDecimal holidays;

  public EorContractToCreateEmployment() {
  }

  public EorContractToCreateEmployment country(@javax.annotation.Nonnull String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code.
   * @return country
   */
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nonnull String country) {
    this.country = country;
  }


  public EorContractToCreateEmployment state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * State code of the state/province where the this person will be employed.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public EorContractToCreateEmployment type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Is it a full-time contract or a part-time contract?
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public EorContractToCreateEmployment workVisaRequired(@javax.annotation.Nonnull Boolean workVisaRequired) {
    this.workVisaRequired = workVisaRequired;
    return this;
  }

  /**
   * Do you require Deel to apply for work visa for this person?
   * @return workVisaRequired
   */
  @javax.annotation.Nonnull
  public Boolean getWorkVisaRequired() {
    return workVisaRequired;
  }

  public void setWorkVisaRequired(@javax.annotation.Nonnull Boolean workVisaRequired) {
    this.workVisaRequired = workVisaRequired;
  }


  public EorContractToCreateEmployment startDate(@javax.annotation.Nonnull LocalDate startDate) {
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


  public EorContractToCreateEmployment endDate(@javax.annotation.Nullable LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31.
   * @return endDate
   */
  @javax.annotation.Nullable
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable LocalDate endDate) {
    this.endDate = endDate;
  }


  public EorContractToCreateEmployment probationPeriod(@javax.annotation.Nullable BigDecimal probationPeriod) {
    this.probationPeriod = probationPeriod;
    return this;
  }

  /**
   * Number of probation days.
   * @return probationPeriod
   */
  @javax.annotation.Nullable
  public BigDecimal getProbationPeriod() {
    return probationPeriod;
  }

  public void setProbationPeriod(@javax.annotation.Nullable BigDecimal probationPeriod) {
    this.probationPeriod = probationPeriod;
  }


  public EorContractToCreateEmployment scopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
    return this;
  }

  /**
   * Scope of work description.
   * @return scopeOfWork
   */
  @javax.annotation.Nullable
  public String getScopeOfWork() {
    return scopeOfWork;
  }

  public void setScopeOfWork(@javax.annotation.Nullable String scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
  }


  public EorContractToCreateEmployment timeOffType(@javax.annotation.Nullable TimeOffTypeEnum timeOffType) {
    this.timeOffType = timeOffType;
    return this;
  }

  /**
   * If you want to use standard number of holidays for this employee, choose \&quot;STANDARD\&quot;. If you want to enter a specific number of holidays, choose \&quot;SPECIFIC\&quot; and enter the number of days in the holidays field.
   * @return timeOffType
   */
  @javax.annotation.Nullable
  public TimeOffTypeEnum getTimeOffType() {
    return timeOffType;
  }

  public void setTimeOffType(@javax.annotation.Nullable TimeOffTypeEnum timeOffType) {
    this.timeOffType = timeOffType;
  }


  public EorContractToCreateEmployment holidays(@javax.annotation.Nullable BigDecimal holidays) {
    this.holidays = holidays;
    return this;
  }

  /**
   * Enter the number of holidays. Leave this field blank if you are chooseing \&quot;STANDARD\&quot; time_off_type.
   * @return holidays
   */
  @javax.annotation.Nullable
  public BigDecimal getHolidays() {
    return holidays;
  }

  public void setHolidays(@javax.annotation.Nullable BigDecimal holidays) {
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
    EorContractToCreateEmployment eorContractToCreateEmployment = (EorContractToCreateEmployment) o;
    return Objects.equals(this.country, eorContractToCreateEmployment.country) &&
        Objects.equals(this.state, eorContractToCreateEmployment.state) &&
        Objects.equals(this.type, eorContractToCreateEmployment.type) &&
        Objects.equals(this.workVisaRequired, eorContractToCreateEmployment.workVisaRequired) &&
        Objects.equals(this.startDate, eorContractToCreateEmployment.startDate) &&
        Objects.equals(this.endDate, eorContractToCreateEmployment.endDate) &&
        Objects.equals(this.probationPeriod, eorContractToCreateEmployment.probationPeriod) &&
        Objects.equals(this.scopeOfWork, eorContractToCreateEmployment.scopeOfWork) &&
        Objects.equals(this.timeOffType, eorContractToCreateEmployment.timeOffType) &&
        Objects.equals(this.holidays, eorContractToCreateEmployment.holidays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, state, type, workVisaRequired, startDate, endDate, probationPeriod, scopeOfWork, timeOffType, holidays);
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
    sb.append("class EorContractToCreateEmployment {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workVisaRequired: ").append(toIndentedString(workVisaRequired)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    probationPeriod: ").append(toIndentedString(probationPeriod)).append("\n");
    sb.append("    scopeOfWork: ").append(toIndentedString(scopeOfWork)).append("\n");
    sb.append("    timeOffType: ").append(toIndentedString(timeOffType)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("state");
    openapiFields.add("type");
    openapiFields.add("work_visa_required");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("probation_period");
    openapiFields.add("scope_of_work");
    openapiFields.add("time_off_type");
    openapiFields.add("holidays");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("work_visa_required");
    openapiRequiredFields.add("start_date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorContractToCreateEmployment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorContractToCreateEmployment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorContractToCreateEmployment is not found in the empty JSON string", EorContractToCreateEmployment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorContractToCreateEmployment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorContractToCreateEmployment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EorContractToCreateEmployment.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("scope_of_work") != null && !jsonObj.get("scope_of_work").isJsonNull()) && !jsonObj.get("scope_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_of_work").toString()));
      }
      if ((jsonObj.get("time_off_type") != null && !jsonObj.get("time_off_type").isJsonNull()) && !jsonObj.get("time_off_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_type").toString()));
      }
      // validate the optional field `time_off_type`
      if (jsonObj.get("time_off_type") != null && !jsonObj.get("time_off_type").isJsonNull()) {
        TimeOffTypeEnum.validateJsonElement(jsonObj.get("time_off_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorContractToCreateEmployment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorContractToCreateEmployment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorContractToCreateEmployment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorContractToCreateEmployment.class));

       return (TypeAdapter<T>) new TypeAdapter<EorContractToCreateEmployment>() {
           @Override
           public void write(JsonWriter out, EorContractToCreateEmployment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorContractToCreateEmployment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorContractToCreateEmployment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorContractToCreateEmployment
   * @throws IOException if the JSON string is invalid with respect to EorContractToCreateEmployment
   */
  public static EorContractToCreateEmployment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorContractToCreateEmployment.class);
  }

  /**
   * Convert an instance of EorContractToCreateEmployment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

