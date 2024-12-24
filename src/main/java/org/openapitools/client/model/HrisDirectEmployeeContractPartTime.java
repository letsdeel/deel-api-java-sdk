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
 * HrisDirectEmployeeContractPartTime
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T16:45:23.308834949Z[GMT]", comments = "Generator version: 7.10.0")
public class HrisDirectEmployeeContractPartTime {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nullable
  private LocalDate endDate;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
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
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String SERIALIZED_NAME_PART_TIME_PERCENTAGE = "part_time_percentage";
  @SerializedName(SERIALIZED_NAME_PART_TIME_PERCENTAGE)
  @javax.annotation.Nonnull
  private BigDecimal partTimePercentage;

  public HrisDirectEmployeeContractPartTime() {
  }

  public HrisDirectEmployeeContractPartTime startDate(@javax.annotation.Nonnull LocalDate startDate) {
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


  public HrisDirectEmployeeContractPartTime endDate(@javax.annotation.Nullable LocalDate endDate) {
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


  public HrisDirectEmployeeContractPartTime type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public HrisDirectEmployeeContractPartTime partTimePercentage(@javax.annotation.Nonnull BigDecimal partTimePercentage) {
    this.partTimePercentage = partTimePercentage;
    return this;
  }

  /**
   * required if employmentType is \&quot;Part-time\&quot;
   * minimum: 1
   * maximum: 99
   * @return partTimePercentage
   */
  @javax.annotation.Nonnull
  public BigDecimal getPartTimePercentage() {
    return partTimePercentage;
  }

  public void setPartTimePercentage(@javax.annotation.Nonnull BigDecimal partTimePercentage) {
    this.partTimePercentage = partTimePercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HrisDirectEmployeeContractPartTime hrisDirectEmployeeContractPartTime = (HrisDirectEmployeeContractPartTime) o;
    return Objects.equals(this.startDate, hrisDirectEmployeeContractPartTime.startDate) &&
        Objects.equals(this.endDate, hrisDirectEmployeeContractPartTime.endDate) &&
        Objects.equals(this.type, hrisDirectEmployeeContractPartTime.type) &&
        Objects.equals(this.partTimePercentage, hrisDirectEmployeeContractPartTime.partTimePercentage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, type, partTimePercentage);
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
    sb.append("class HrisDirectEmployeeContractPartTime {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    partTimePercentage: ").append(toIndentedString(partTimePercentage)).append("\n");
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
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("type");
    openapiFields.add("part_time_percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("part_time_percentage");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HrisDirectEmployeeContractPartTime
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HrisDirectEmployeeContractPartTime.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HrisDirectEmployeeContractPartTime is not found in the empty JSON string", HrisDirectEmployeeContractPartTime.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HrisDirectEmployeeContractPartTime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HrisDirectEmployeeContractPartTime` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HrisDirectEmployeeContractPartTime.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HrisDirectEmployeeContractPartTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HrisDirectEmployeeContractPartTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HrisDirectEmployeeContractPartTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HrisDirectEmployeeContractPartTime.class));

       return (TypeAdapter<T>) new TypeAdapter<HrisDirectEmployeeContractPartTime>() {
           @Override
           public void write(JsonWriter out, HrisDirectEmployeeContractPartTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HrisDirectEmployeeContractPartTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HrisDirectEmployeeContractPartTime given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HrisDirectEmployeeContractPartTime
   * @throws IOException if the JSON string is invalid with respect to HrisDirectEmployeeContractPartTime
   */
  public static HrisDirectEmployeeContractPartTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HrisDirectEmployeeContractPartTime.class);
  }

  /**
   * Convert an instance of HrisDirectEmployeeContractPartTime to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

