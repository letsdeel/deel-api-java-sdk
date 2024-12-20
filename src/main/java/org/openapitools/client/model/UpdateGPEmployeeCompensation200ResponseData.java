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
 * UpdateGPEmployeeCompensation200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T12:32:05.400762149Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateGPEmployeeCompensation200ResponseData {
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
  @javax.annotation.Nullable
  private ScaleEnum scale;

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nullable
  private BigDecimal salary;

  /**
   * The status of a salary amendment.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    UPCOMING("UPCOMING"),
    
    OUTDATED("OUTDATED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  @javax.annotation.Nullable
  private LocalDate effectiveDate;

  public UpdateGPEmployeeCompensation200ResponseData() {
  }

  public UpdateGPEmployeeCompensation200ResponseData scale(@javax.annotation.Nullable ScaleEnum scale) {
    this.scale = scale;
    return this;
  }

  /**
   * The scale to which a given salary applies.
   * @return scale
   */
  @javax.annotation.Nullable
  public ScaleEnum getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nullable ScaleEnum scale) {
    this.scale = scale;
  }


  public UpdateGPEmployeeCompensation200ResponseData salary(@javax.annotation.Nullable BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Compensation salary.
   * @return salary
   */
  @javax.annotation.Nullable
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nullable BigDecimal salary) {
    this.salary = salary;
  }


  public UpdateGPEmployeeCompensation200ResponseData status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of a salary amendment.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public UpdateGPEmployeeCompensation200ResponseData effectiveDate(@javax.annotation.Nullable LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return effectiveDate
   */
  @javax.annotation.Nullable
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(@javax.annotation.Nullable LocalDate effectiveDate) {
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
    UpdateGPEmployeeCompensation200ResponseData updateGPEmployeeCompensation200ResponseData = (UpdateGPEmployeeCompensation200ResponseData) o;
    return Objects.equals(this.scale, updateGPEmployeeCompensation200ResponseData.scale) &&
        Objects.equals(this.salary, updateGPEmployeeCompensation200ResponseData.salary) &&
        Objects.equals(this.status, updateGPEmployeeCompensation200ResponseData.status) &&
        Objects.equals(this.effectiveDate, updateGPEmployeeCompensation200ResponseData.effectiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, salary, status, effectiveDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGPEmployeeCompensation200ResponseData {\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("effective_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateGPEmployeeCompensation200ResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateGPEmployeeCompensation200ResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGPEmployeeCompensation200ResponseData is not found in the empty JSON string", UpdateGPEmployeeCompensation200ResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateGPEmployeeCompensation200ResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGPEmployeeCompensation200ResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      // validate the optional field `scale`
      if (jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) {
        ScaleEnum.validateJsonElement(jsonObj.get("scale"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGPEmployeeCompensation200ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGPEmployeeCompensation200ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGPEmployeeCompensation200ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGPEmployeeCompensation200ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGPEmployeeCompensation200ResponseData>() {
           @Override
           public void write(JsonWriter out, UpdateGPEmployeeCompensation200ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGPEmployeeCompensation200ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateGPEmployeeCompensation200ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateGPEmployeeCompensation200ResponseData
   * @throws IOException if the JSON string is invalid with respect to UpdateGPEmployeeCompensation200ResponseData
   */
  public static UpdateGPEmployeeCompensation200ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGPEmployeeCompensation200ResponseData.class);
  }

  /**
   * Convert an instance of UpdateGPEmployeeCompensation200ResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

