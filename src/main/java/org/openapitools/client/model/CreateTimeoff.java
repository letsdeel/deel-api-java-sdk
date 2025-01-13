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
 * CreateTimeoff
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:23:41.573776663Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateTimeoff {
  /**
   * Time off type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VACATION("VACATION"),
    
    SICK_LEAVE("SICK_LEAVE"),
    
    OTHER("OTHER");

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
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private String endDate;

  public static final String SERIALIZED_NAME_WITH_MULTIPLE_DATES = "with_multiple_dates";
  @SerializedName(SERIALIZED_NAME_WITH_MULTIPLE_DATES)
  @javax.annotation.Nonnull
  private Boolean withMultipleDates;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @javax.annotation.Nullable
  private String reason;

  public static final String SERIALIZED_NAME_IS_START_DATE_HALF_DAY = "is_start_date_half_day";
  @SerializedName(SERIALIZED_NAME_IS_START_DATE_HALF_DAY)
  @javax.annotation.Nullable
  private Boolean isStartDateHalfDay;

  public static final String SERIALIZED_NAME_IS_END_DATE_HALF_DAY = "is_end_date_half_day";
  @SerializedName(SERIALIZED_NAME_IS_END_DATE_HALF_DAY)
  @javax.annotation.Nullable
  private Boolean isEndDateHalfDay;

  public static final String SERIALIZED_NAME_OTHER_TIMEOFF_NAME = "other_timeoff_name";
  @SerializedName(SERIALIZED_NAME_OTHER_TIMEOFF_NAME)
  @javax.annotation.Nullable
  private String otherTimeoffName;

  public CreateTimeoff() {
  }

  public CreateTimeoff type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Time off type.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public CreateTimeoff startDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of employee&#39;s time off.
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
  }


  public CreateTimeoff endDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of employee&#39;s time off.
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nullable String endDate) {
    this.endDate = endDate;
  }


  public CreateTimeoff withMultipleDates(@javax.annotation.Nonnull Boolean withMultipleDates) {
    this.withMultipleDates = withMultipleDates;
    return this;
  }

  /**
   * If true, then multiple time off days were requested. You must supply a start and end date. If false, end date is ignored
   * @return withMultipleDates
   */
  @javax.annotation.Nonnull
  public Boolean getWithMultipleDates() {
    return withMultipleDates;
  }

  public void setWithMultipleDates(@javax.annotation.Nonnull Boolean withMultipleDates) {
    this.withMultipleDates = withMultipleDates;
  }


  public CreateTimeoff reason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Description for employee&#39;s time off.
   * @return reason
   */
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }

  public void setReason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public CreateTimeoff isStartDateHalfDay(@javax.annotation.Nullable Boolean isStartDateHalfDay) {
    this.isStartDateHalfDay = isStartDateHalfDay;
    return this;
  }

  /**
   * Is the start day a half day?
   * @return isStartDateHalfDay
   */
  @javax.annotation.Nullable
  public Boolean getIsStartDateHalfDay() {
    return isStartDateHalfDay;
  }

  public void setIsStartDateHalfDay(@javax.annotation.Nullable Boolean isStartDateHalfDay) {
    this.isStartDateHalfDay = isStartDateHalfDay;
  }


  public CreateTimeoff isEndDateHalfDay(@javax.annotation.Nullable Boolean isEndDateHalfDay) {
    this.isEndDateHalfDay = isEndDateHalfDay;
    return this;
  }

  /**
   * Is the start day a half day?
   * @return isEndDateHalfDay
   */
  @javax.annotation.Nullable
  public Boolean getIsEndDateHalfDay() {
    return isEndDateHalfDay;
  }

  public void setIsEndDateHalfDay(@javax.annotation.Nullable Boolean isEndDateHalfDay) {
    this.isEndDateHalfDay = isEndDateHalfDay;
  }


  public CreateTimeoff otherTimeoffName(@javax.annotation.Nullable String otherTimeoffName) {
    this.otherTimeoffName = otherTimeoffName;
    return this;
  }

  /**
   * Custom name for this time off.
   * @return otherTimeoffName
   */
  @javax.annotation.Nullable
  public String getOtherTimeoffName() {
    return otherTimeoffName;
  }

  public void setOtherTimeoffName(@javax.annotation.Nullable String otherTimeoffName) {
    this.otherTimeoffName = otherTimeoffName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTimeoff createTimeoff = (CreateTimeoff) o;
    return Objects.equals(this.type, createTimeoff.type) &&
        Objects.equals(this.startDate, createTimeoff.startDate) &&
        Objects.equals(this.endDate, createTimeoff.endDate) &&
        Objects.equals(this.withMultipleDates, createTimeoff.withMultipleDates) &&
        Objects.equals(this.reason, createTimeoff.reason) &&
        Objects.equals(this.isStartDateHalfDay, createTimeoff.isStartDateHalfDay) &&
        Objects.equals(this.isEndDateHalfDay, createTimeoff.isEndDateHalfDay) &&
        Objects.equals(this.otherTimeoffName, createTimeoff.otherTimeoffName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startDate, endDate, withMultipleDates, reason, isStartDateHalfDay, isEndDateHalfDay, otherTimeoffName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTimeoff {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    withMultipleDates: ").append(toIndentedString(withMultipleDates)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    isStartDateHalfDay: ").append(toIndentedString(isStartDateHalfDay)).append("\n");
    sb.append("    isEndDateHalfDay: ").append(toIndentedString(isEndDateHalfDay)).append("\n");
    sb.append("    otherTimeoffName: ").append(toIndentedString(otherTimeoffName)).append("\n");
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
    openapiFields.add("end_date");
    openapiFields.add("with_multiple_dates");
    openapiFields.add("reason");
    openapiFields.add("is_start_date_half_day");
    openapiFields.add("is_end_date_half_day");
    openapiFields.add("other_timeoff_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("with_multiple_dates");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTimeoff
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTimeoff.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTimeoff is not found in the empty JSON string", CreateTimeoff.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTimeoff.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTimeoff` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTimeoff.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("other_timeoff_name") != null && !jsonObj.get("other_timeoff_name").isJsonNull()) && !jsonObj.get("other_timeoff_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_timeoff_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_timeoff_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTimeoff.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTimeoff' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTimeoff> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTimeoff.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTimeoff>() {
           @Override
           public void write(JsonWriter out, CreateTimeoff value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTimeoff read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTimeoff given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTimeoff
   * @throws IOException if the JSON string is invalid with respect to CreateTimeoff
   */
  public static CreateTimeoff fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTimeoff.class);
  }

  /**
   * Convert an instance of CreateTimeoff to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

