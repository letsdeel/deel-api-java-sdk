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
 * CreatedHrisDirectEmployeeContainerDataEmployment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class CreatedHrisDirectEmployeeContainerDataEmployment {
  public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
  private String contractId;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  /**
   * Gets or Sets type
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
  private TypeEnum type;

  public static final String SERIALIZED_NAME_PART_TIME_PERCENTAGE = "part_time_percentage";
  @SerializedName(SERIALIZED_NAME_PART_TIME_PERCENTAGE)
  private BigDecimal partTimePercentage;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public CreatedHrisDirectEmployeeContainerDataEmployment() {
  }

  public CreatedHrisDirectEmployeeContainerDataEmployment contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Get contractId
   * @return contractId
   */
  @javax.annotation.Nonnull
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }


  public CreatedHrisDirectEmployeeContainerDataEmployment startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @javax.annotation.Nonnull
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public CreatedHrisDirectEmployeeContainerDataEmployment endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nullable
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public CreatedHrisDirectEmployeeContainerDataEmployment type(TypeEnum type) {
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

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreatedHrisDirectEmployeeContainerDataEmployment partTimePercentage(BigDecimal partTimePercentage) {
    this.partTimePercentage = partTimePercentage;
    return this;
  }

  /**
   * Get partTimePercentage
   * minimum: 1
   * maximum: 99
   * @return partTimePercentage
   */
  @javax.annotation.Nullable
  public BigDecimal getPartTimePercentage() {
    return partTimePercentage;
  }

  public void setPartTimePercentage(BigDecimal partTimePercentage) {
    this.partTimePercentage = partTimePercentage;
  }


  public CreatedHrisDirectEmployeeContainerDataEmployment country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedHrisDirectEmployeeContainerDataEmployment createdHrisDirectEmployeeContainerDataEmployment = (CreatedHrisDirectEmployeeContainerDataEmployment) o;
    return Objects.equals(this.contractId, createdHrisDirectEmployeeContainerDataEmployment.contractId) &&
        Objects.equals(this.startDate, createdHrisDirectEmployeeContainerDataEmployment.startDate) &&
        Objects.equals(this.endDate, createdHrisDirectEmployeeContainerDataEmployment.endDate) &&
        Objects.equals(this.type, createdHrisDirectEmployeeContainerDataEmployment.type) &&
        Objects.equals(this.partTimePercentage, createdHrisDirectEmployeeContainerDataEmployment.partTimePercentage) &&
        Objects.equals(this.country, createdHrisDirectEmployeeContainerDataEmployment.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, startDate, endDate, type, partTimePercentage, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedHrisDirectEmployeeContainerDataEmployment {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    partTimePercentage: ").append(toIndentedString(partTimePercentage)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("contract_id");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("type");
    openapiFields.add("part_time_percentage");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contract_id");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("country");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreatedHrisDirectEmployeeContainerDataEmployment
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatedHrisDirectEmployeeContainerDataEmployment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatedHrisDirectEmployeeContainerDataEmployment is not found in the empty JSON string", CreatedHrisDirectEmployeeContainerDataEmployment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatedHrisDirectEmployeeContainerDataEmployment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatedHrisDirectEmployeeContainerDataEmployment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatedHrisDirectEmployeeContainerDataEmployment.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("contract_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatedHrisDirectEmployeeContainerDataEmployment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatedHrisDirectEmployeeContainerDataEmployment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatedHrisDirectEmployeeContainerDataEmployment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatedHrisDirectEmployeeContainerDataEmployment.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatedHrisDirectEmployeeContainerDataEmployment>() {
           @Override
           public void write(JsonWriter out, CreatedHrisDirectEmployeeContainerDataEmployment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatedHrisDirectEmployeeContainerDataEmployment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreatedHrisDirectEmployeeContainerDataEmployment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatedHrisDirectEmployeeContainerDataEmployment
   * @throws IOException if the JSON string is invalid with respect to CreatedHrisDirectEmployeeContainerDataEmployment
   */
  public static CreatedHrisDirectEmployeeContainerDataEmployment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatedHrisDirectEmployeeContainerDataEmployment.class);
  }

  /**
   * Convert an instance of CreatedHrisDirectEmployeeContainerDataEmployment to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
