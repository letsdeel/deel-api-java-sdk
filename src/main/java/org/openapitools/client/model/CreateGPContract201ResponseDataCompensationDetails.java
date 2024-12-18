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
 * CreateGPContract201ResponseDataCompensationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateGPContract201ResponseDataCompensationDetails {
  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nullable
  private String scale;

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nullable
  private BigDecimal salary;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public CreateGPContract201ResponseDataCompensationDetails() {
  }

  public CreateGPContract201ResponseDataCompensationDetails scale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Scale at which the salary is paid.
   * @return scale
   */
  @javax.annotation.Nullable
  public String getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
  }


  public CreateGPContract201ResponseDataCompensationDetails salary(@javax.annotation.Nullable BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Gross annual/month salary.
   * @return salary
   */
  @javax.annotation.Nullable
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nullable BigDecimal salary) {
    this.salary = salary;
  }


  public CreateGPContract201ResponseDataCompensationDetails currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency of gross annual/month salary.
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
    CreateGPContract201ResponseDataCompensationDetails createGPContract201ResponseDataCompensationDetails = (CreateGPContract201ResponseDataCompensationDetails) o;
    return Objects.equals(this.scale, createGPContract201ResponseDataCompensationDetails.scale) &&
        Objects.equals(this.salary, createGPContract201ResponseDataCompensationDetails.salary) &&
        Objects.equals(this.currency, createGPContract201ResponseDataCompensationDetails.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, salary, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGPContract201ResponseDataCompensationDetails {\n");
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
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateGPContract201ResponseDataCompensationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateGPContract201ResponseDataCompensationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGPContract201ResponseDataCompensationDetails is not found in the empty JSON string", CreateGPContract201ResponseDataCompensationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateGPContract201ResponseDataCompensationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGPContract201ResponseDataCompensationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGPContract201ResponseDataCompensationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGPContract201ResponseDataCompensationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGPContract201ResponseDataCompensationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGPContract201ResponseDataCompensationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGPContract201ResponseDataCompensationDetails>() {
           @Override
           public void write(JsonWriter out, CreateGPContract201ResponseDataCompensationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGPContract201ResponseDataCompensationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateGPContract201ResponseDataCompensationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateGPContract201ResponseDataCompensationDetails
   * @throws IOException if the JSON string is invalid with respect to CreateGPContract201ResponseDataCompensationDetails
   */
  public static CreateGPContract201ResponseDataCompensationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGPContract201ResponseDataCompensationDetails.class);
  }

  /**
   * Convert an instance of CreateGPContract201ResponseDataCompensationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

