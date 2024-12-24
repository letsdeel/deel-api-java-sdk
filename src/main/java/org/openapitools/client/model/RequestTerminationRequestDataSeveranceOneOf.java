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
 * RequestTerminationRequestDataSeveranceOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class RequestTerminationRequestDataSeveranceOneOf {
  /**
   * The type of severance, either in time off.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TIME("TIME");

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

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nonnull
  private String currency;

  /**
   * The unit of time for severance (e.g., DAYS, WEEKS, MONTHS).
   */
  @JsonAdapter(TimeUnitEnum.Adapter.class)
  public enum TimeUnitEnum {
    DAYS("DAYS"),
    
    WEEKS("WEEKS"),
    
    MONTHS("MONTHS");

    private String value;

    TimeUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeUnitEnum fromValue(String value) {
      for (TimeUnitEnum b : TimeUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimeUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimeUnitEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TimeUnitEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIME_UNIT = "time_unit";
  @SerializedName(SERIALIZED_NAME_TIME_UNIT)
  @javax.annotation.Nonnull
  private TimeUnitEnum timeUnit;

  public RequestTerminationRequestDataSeveranceOneOf() {
  }

  public RequestTerminationRequestDataSeveranceOneOf type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of severance, either in time off.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public RequestTerminationRequestDataSeveranceOneOf amount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of severance, specified in the designated currency or time unit.
   * @return amount
   */
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
  }


  public RequestTerminationRequestDataSeveranceOneOf currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code for severance.
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
  }


  public RequestTerminationRequestDataSeveranceOneOf timeUnit(@javax.annotation.Nonnull TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  /**
   * The unit of time for severance (e.g., DAYS, WEEKS, MONTHS).
   * @return timeUnit
   */
  @javax.annotation.Nonnull
  public TimeUnitEnum getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(@javax.annotation.Nonnull TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestTerminationRequestDataSeveranceOneOf requestTerminationRequestDataSeveranceOneOf = (RequestTerminationRequestDataSeveranceOneOf) o;
    return Objects.equals(this.type, requestTerminationRequestDataSeveranceOneOf.type) &&
        Objects.equals(this.amount, requestTerminationRequestDataSeveranceOneOf.amount) &&
        Objects.equals(this.currency, requestTerminationRequestDataSeveranceOneOf.currency) &&
        Objects.equals(this.timeUnit, requestTerminationRequestDataSeveranceOneOf.timeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount, currency, timeUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestTerminationRequestDataSeveranceOneOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("time_unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("time_unit");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RequestTerminationRequestDataSeveranceOneOf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RequestTerminationRequestDataSeveranceOneOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestTerminationRequestDataSeveranceOneOf is not found in the empty JSON string", RequestTerminationRequestDataSeveranceOneOf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RequestTerminationRequestDataSeveranceOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestTerminationRequestDataSeveranceOneOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RequestTerminationRequestDataSeveranceOneOf.openapiRequiredFields) {
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
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("time_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_unit").toString()));
      }
      // validate the required field `time_unit`
      TimeUnitEnum.validateJsonElement(jsonObj.get("time_unit"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestTerminationRequestDataSeveranceOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestTerminationRequestDataSeveranceOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestTerminationRequestDataSeveranceOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestTerminationRequestDataSeveranceOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestTerminationRequestDataSeveranceOneOf>() {
           @Override
           public void write(JsonWriter out, RequestTerminationRequestDataSeveranceOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestTerminationRequestDataSeveranceOneOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RequestTerminationRequestDataSeveranceOneOf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RequestTerminationRequestDataSeveranceOneOf
   * @throws IOException if the JSON string is invalid with respect to RequestTerminationRequestDataSeveranceOneOf
   */
  public static RequestTerminationRequestDataSeveranceOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestTerminationRequestDataSeveranceOneOf.class);
  }

  /**
   * Convert an instance of RequestTerminationRequestDataSeveranceOneOf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

