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
 * CreatedHrisDirectEmployeeContainerDataCompensationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:15:13.914237102Z[GMT]", comments = "Generator version: 7.10.0")
public class CreatedHrisDirectEmployeeContainerDataCompensationDetails {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nonnull
  private String currency;

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nonnull
  private Float salary;

  public CreatedHrisDirectEmployeeContainerDataCompensationDetails() {
  }

  public CreatedHrisDirectEmployeeContainerDataCompensationDetails currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
  }


  public CreatedHrisDirectEmployeeContainerDataCompensationDetails salary(@javax.annotation.Nonnull Float salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   */
  @javax.annotation.Nonnull
  public Float getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nonnull Float salary) {
    this.salary = salary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedHrisDirectEmployeeContainerDataCompensationDetails createdHrisDirectEmployeeContainerDataCompensationDetails = (CreatedHrisDirectEmployeeContainerDataCompensationDetails) o;
    return Objects.equals(this.currency, createdHrisDirectEmployeeContainerDataCompensationDetails.currency) &&
        Objects.equals(this.salary, createdHrisDirectEmployeeContainerDataCompensationDetails.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, salary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedHrisDirectEmployeeContainerDataCompensationDetails {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("salary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("salary");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreatedHrisDirectEmployeeContainerDataCompensationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatedHrisDirectEmployeeContainerDataCompensationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatedHrisDirectEmployeeContainerDataCompensationDetails is not found in the empty JSON string", CreatedHrisDirectEmployeeContainerDataCompensationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatedHrisDirectEmployeeContainerDataCompensationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatedHrisDirectEmployeeContainerDataCompensationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatedHrisDirectEmployeeContainerDataCompensationDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatedHrisDirectEmployeeContainerDataCompensationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatedHrisDirectEmployeeContainerDataCompensationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatedHrisDirectEmployeeContainerDataCompensationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatedHrisDirectEmployeeContainerDataCompensationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatedHrisDirectEmployeeContainerDataCompensationDetails>() {
           @Override
           public void write(JsonWriter out, CreatedHrisDirectEmployeeContainerDataCompensationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatedHrisDirectEmployeeContainerDataCompensationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreatedHrisDirectEmployeeContainerDataCompensationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatedHrisDirectEmployeeContainerDataCompensationDetails
   * @throws IOException if the JSON string is invalid with respect to CreatedHrisDirectEmployeeContainerDataCompensationDetails
   */
  public static CreatedHrisDirectEmployeeContainerDataCompensationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatedHrisDirectEmployeeContainerDataCompensationDetails.class);
  }

  /**
   * Convert an instance of CreatedHrisDirectEmployeeContainerDataCompensationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

