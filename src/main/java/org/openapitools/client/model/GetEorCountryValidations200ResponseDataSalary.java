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
 * GetEorCountryValidations200ResponseDataSalary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T19:12:08.356438549Z[GMT]", comments = "Generator version: 7.10.0")
public class GetEorCountryValidations200ResponseDataSalary {
  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  @javax.annotation.Nullable
  private String max;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  @javax.annotation.Nullable
  private String min;

  /**
   * Frequency of the salary payment.
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    ANNUALLY("annually"),
    
    SPECIFIC_MONTH("specific_month"),
    
    SPECIFIC_DATE("specific_date");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FrequencyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nullable
  private FrequencyEnum frequency;

  public GetEorCountryValidations200ResponseDataSalary() {
  }

  public GetEorCountryValidations200ResponseDataSalary max(@javax.annotation.Nullable String max) {
    this.max = max;
    return this;
  }

  /**
   * Maximum salary.
   * @return max
   */
  @javax.annotation.Nullable
  public String getMax() {
    return max;
  }

  public void setMax(@javax.annotation.Nullable String max) {
    this.max = max;
  }


  public GetEorCountryValidations200ResponseDataSalary min(@javax.annotation.Nullable String min) {
    this.min = min;
    return this;
  }

  /**
   * Minimum salary.
   * @return min
   */
  @javax.annotation.Nullable
  public String getMin() {
    return min;
  }

  public void setMin(@javax.annotation.Nullable String min) {
    this.min = min;
  }


  public GetEorCountryValidations200ResponseDataSalary frequency(@javax.annotation.Nullable FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Frequency of the salary payment.
   * @return frequency
   */
  @javax.annotation.Nullable
  public FrequencyEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nullable FrequencyEnum frequency) {
    this.frequency = frequency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEorCountryValidations200ResponseDataSalary getEorCountryValidations200ResponseDataSalary = (GetEorCountryValidations200ResponseDataSalary) o;
    return Objects.equals(this.max, getEorCountryValidations200ResponseDataSalary.max) &&
        Objects.equals(this.min, getEorCountryValidations200ResponseDataSalary.min) &&
        Objects.equals(this.frequency, getEorCountryValidations200ResponseDataSalary.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEorCountryValidations200ResponseDataSalary {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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
    openapiFields.add("max");
    openapiFields.add("min");
    openapiFields.add("frequency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetEorCountryValidations200ResponseDataSalary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEorCountryValidations200ResponseDataSalary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEorCountryValidations200ResponseDataSalary is not found in the empty JSON string", GetEorCountryValidations200ResponseDataSalary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEorCountryValidations200ResponseDataSalary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEorCountryValidations200ResponseDataSalary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("max") != null && !jsonObj.get("max").isJsonNull()) && !jsonObj.get("max").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max").toString()));
      }
      if ((jsonObj.get("min") != null && !jsonObj.get("min").isJsonNull()) && !jsonObj.get("min").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min").toString()));
      }
      if ((jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      // validate the optional field `frequency`
      if (jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonNull()) {
        FrequencyEnum.validateJsonElement(jsonObj.get("frequency"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEorCountryValidations200ResponseDataSalary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEorCountryValidations200ResponseDataSalary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEorCountryValidations200ResponseDataSalary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEorCountryValidations200ResponseDataSalary.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEorCountryValidations200ResponseDataSalary>() {
           @Override
           public void write(JsonWriter out, GetEorCountryValidations200ResponseDataSalary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEorCountryValidations200ResponseDataSalary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetEorCountryValidations200ResponseDataSalary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetEorCountryValidations200ResponseDataSalary
   * @throws IOException if the JSON string is invalid with respect to GetEorCountryValidations200ResponseDataSalary
   */
  public static GetEorCountryValidations200ResponseDataSalary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEorCountryValidations200ResponseDataSalary.class);
  }

  /**
   * Convert an instance of GetEorCountryValidations200ResponseDataSalary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

