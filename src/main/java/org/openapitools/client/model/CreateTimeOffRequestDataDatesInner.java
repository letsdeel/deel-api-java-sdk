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
 * CreateTimeOffRequestDataDatesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:44:17.413238492Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateTimeOffRequestDataDatesInner {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  @javax.annotation.Nullable
  private Float hours;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private Float amount;

  /**
   * The type of the time off daily
   */
  @JsonAdapter(DayTypeEnum.Adapter.class)
  public enum DayTypeEnum {
    HALF_DAY("HALF_DAY"),
    
    FULL_DAY("FULL_DAY");

    private String value;

    DayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayTypeEnum fromValue(String value) {
      for (DayTypeEnum b : DayTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DayTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DayTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DAY_TYPE = "day_type";
  @SerializedName(SERIALIZED_NAME_DAY_TYPE)
  @javax.annotation.Nullable
  private DayTypeEnum dayType;

  public CreateTimeOffRequestDataDatesInner() {
  }

  public CreateTimeOffRequestDataDatesInner date(@javax.annotation.Nonnull OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The date of the time off daily
   * @return date
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nonnull OffsetDateTime date) {
    this.date = date;
  }


  public CreateTimeOffRequestDataDatesInner hours(@javax.annotation.Nullable Float hours) {
    this.hours = hours;
    return this;
  }

  /**
   * The amount of the time off daily
   * @return hours
   */
  @javax.annotation.Nullable
  public Float getHours() {
    return hours;
  }

  public void setHours(@javax.annotation.Nullable Float hours) {
    this.hours = hours;
  }


  public CreateTimeOffRequestDataDatesInner amount(@javax.annotation.Nullable Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the time off daily
   * @return amount
   */
  @javax.annotation.Nullable
  public Float getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable Float amount) {
    this.amount = amount;
  }


  public CreateTimeOffRequestDataDatesInner dayType(@javax.annotation.Nullable DayTypeEnum dayType) {
    this.dayType = dayType;
    return this;
  }

  /**
   * The type of the time off daily
   * @return dayType
   */
  @javax.annotation.Nullable
  public DayTypeEnum getDayType() {
    return dayType;
  }

  public void setDayType(@javax.annotation.Nullable DayTypeEnum dayType) {
    this.dayType = dayType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTimeOffRequestDataDatesInner createTimeOffRequestDataDatesInner = (CreateTimeOffRequestDataDatesInner) o;
    return Objects.equals(this.date, createTimeOffRequestDataDatesInner.date) &&
        Objects.equals(this.hours, createTimeOffRequestDataDatesInner.hours) &&
        Objects.equals(this.amount, createTimeOffRequestDataDatesInner.amount) &&
        Objects.equals(this.dayType, createTimeOffRequestDataDatesInner.dayType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, hours, amount, dayType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTimeOffRequestDataDatesInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dayType: ").append(toIndentedString(dayType)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("hours");
    openapiFields.add("amount");
    openapiFields.add("day_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTimeOffRequestDataDatesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTimeOffRequestDataDatesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTimeOffRequestDataDatesInner is not found in the empty JSON string", CreateTimeOffRequestDataDatesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTimeOffRequestDataDatesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTimeOffRequestDataDatesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTimeOffRequestDataDatesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("day_type") != null && !jsonObj.get("day_type").isJsonNull()) && !jsonObj.get("day_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `day_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("day_type").toString()));
      }
      // validate the optional field `day_type`
      if (jsonObj.get("day_type") != null && !jsonObj.get("day_type").isJsonNull()) {
        DayTypeEnum.validateJsonElement(jsonObj.get("day_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTimeOffRequestDataDatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTimeOffRequestDataDatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTimeOffRequestDataDatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTimeOffRequestDataDatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTimeOffRequestDataDatesInner>() {
           @Override
           public void write(JsonWriter out, CreateTimeOffRequestDataDatesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTimeOffRequestDataDatesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTimeOffRequestDataDatesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTimeOffRequestDataDatesInner
   * @throws IOException if the JSON string is invalid with respect to CreateTimeOffRequestDataDatesInner
   */
  public static CreateTimeOffRequestDataDatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTimeOffRequestDataDatesInner.class);
  }

  /**
   * Convert an instance of CreateTimeOffRequestDataDatesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

