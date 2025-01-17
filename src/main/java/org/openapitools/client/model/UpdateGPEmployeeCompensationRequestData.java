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
 * UpdateGPEmployeeCompensationRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateGPEmployeeCompensationRequestData {
  /**
   * The scale to which a given salary applies.
   */
  @JsonAdapter(ScaleEnum.Adapter.class)
  public enum ScaleEnum {
    YEAR("YEAR"),
    
    MONTH("MONTH"),
    
    HOUR("HOUR");

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
  private ScaleEnum scale;

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nonnull
  private BigDecimal salary;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  @javax.annotation.Nonnull
  private LocalDate effectiveDate;

  public UpdateGPEmployeeCompensationRequestData() {
  }

  public UpdateGPEmployeeCompensationRequestData scale(@javax.annotation.Nonnull ScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * The scale to which a given salary applies.
   * @return scale
   */
  @javax.annotation.Nonnull
  public ScaleEnum getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nonnull ScaleEnum scale) {
    this.scale = scale;
  }


  public UpdateGPEmployeeCompensationRequestData salary(@javax.annotation.Nonnull BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Compensation salary.
   * @return salary
   */
  @javax.annotation.Nonnull
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nonnull BigDecimal salary) {
    this.salary = salary;
  }


  public UpdateGPEmployeeCompensationRequestData effectiveDate(@javax.annotation.Nonnull LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return effectiveDate
   */
  @javax.annotation.Nonnull
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(@javax.annotation.Nonnull LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGPEmployeeCompensationRequestData updateGPEmployeeCompensationRequestData = (UpdateGPEmployeeCompensationRequestData) o;
    return Objects.equals(this.scale, updateGPEmployeeCompensationRequestData.scale) &&
        Objects.equals(this.salary, updateGPEmployeeCompensationRequestData.salary) &&
        Objects.equals(this.effectiveDate, updateGPEmployeeCompensationRequestData.effectiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, salary, effectiveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGPEmployeeCompensationRequestData {\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
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
    openapiFields.add("effective_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scale");
    openapiRequiredFields.add("salary");
    openapiRequiredFields.add("effective_date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateGPEmployeeCompensationRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateGPEmployeeCompensationRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGPEmployeeCompensationRequestData is not found in the empty JSON string", UpdateGPEmployeeCompensationRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateGPEmployeeCompensationRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGPEmployeeCompensationRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateGPEmployeeCompensationRequestData.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGPEmployeeCompensationRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGPEmployeeCompensationRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGPEmployeeCompensationRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGPEmployeeCompensationRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGPEmployeeCompensationRequestData>() {
           @Override
           public void write(JsonWriter out, UpdateGPEmployeeCompensationRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGPEmployeeCompensationRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateGPEmployeeCompensationRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateGPEmployeeCompensationRequestData
   * @throws IOException if the JSON string is invalid with respect to UpdateGPEmployeeCompensationRequestData
   */
  public static UpdateGPEmployeeCompensationRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGPEmployeeCompensationRequestData.class);
  }

  /**
   * Convert an instance of UpdateGPEmployeeCompensationRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

