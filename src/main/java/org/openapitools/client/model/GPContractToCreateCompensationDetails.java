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
 * GPContractToCreateCompensationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:45:24.021173966Z[GMT]", comments = "Generator version: 7.10.0")
public class GPContractToCreateCompensationDetails {
  /**
   * Defines the scale at which the salary is paid.
   */
  @JsonAdapter(ScaleEnum.Adapter.class)
  public enum ScaleEnum {
    YEAR("YEAR"),
    
    MONTH("MONTH");

    private String value;

    ScaleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScaleEnum fromValue(String value) {
      for (ScaleEnum b : ScaleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScaleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScaleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScaleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScaleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScaleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nonnull
  private ScaleEnum scale = ScaleEnum.YEAR;

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nonnull
  private BigDecimal salary;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public GPContractToCreateCompensationDetails() {
  }

  public GPContractToCreateCompensationDetails scale(@javax.annotation.Nonnull ScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Defines the scale at which the salary is paid.
   * @return scale
   */
  @javax.annotation.Nonnull
  public ScaleEnum getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nonnull ScaleEnum scale) {
    this.scale = scale;
  }


  public GPContractToCreateCompensationDetails salary(@javax.annotation.Nonnull BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Employee&#39;s gross annual/month salary.
   * @return salary
   */
  @javax.annotation.Nonnull
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nonnull BigDecimal salary) {
    this.salary = salary;
  }


  public GPContractToCreateCompensationDetails currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPContractToCreateCompensationDetails gpContractToCreateCompensationDetails = (GPContractToCreateCompensationDetails) o;
    return Objects.equals(this.scale, gpContractToCreateCompensationDetails.scale) &&
        Objects.equals(this.salary, gpContractToCreateCompensationDetails.salary) &&
        Objects.equals(this.currency, gpContractToCreateCompensationDetails.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, salary, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPContractToCreateCompensationDetails {\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("scale");
    openapiFields.add("salary");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scale");
    openapiRequiredFields.add("salary");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GPContractToCreateCompensationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GPContractToCreateCompensationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GPContractToCreateCompensationDetails is not found in the empty JSON string", GPContractToCreateCompensationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GPContractToCreateCompensationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GPContractToCreateCompensationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GPContractToCreateCompensationDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      // validate the required field `scale`
      ScaleEnum.validateJsonElement(jsonObj.get("scale"));
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GPContractToCreateCompensationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GPContractToCreateCompensationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GPContractToCreateCompensationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GPContractToCreateCompensationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<GPContractToCreateCompensationDetails>() {
           @Override
           public void write(JsonWriter out, GPContractToCreateCompensationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GPContractToCreateCompensationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GPContractToCreateCompensationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GPContractToCreateCompensationDetails
   * @throws IOException if the JSON string is invalid with respect to GPContractToCreateCompensationDetails
   */
  public static GPContractToCreateCompensationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GPContractToCreateCompensationDetails.class);
  }

  /**
   * Convert an instance of GPContractToCreateCompensationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

