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
 * CreateEorContractRequestCompensationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateEorContractRequestCompensationDetails {
  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  @javax.annotation.Nullable
  private BigDecimal salary;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nonnull
  private String currency;

  public static final String SERIALIZED_NAME_VARIABLE_COMPENSATION = "variable_compensation";
  @SerializedName(SERIALIZED_NAME_VARIABLE_COMPENSATION)
  @javax.annotation.Nullable
  private BigDecimal variableCompensation;

  /**
   * Should be set only if variable_compensation is set. It can be PERCENTAGE or FIXED.
   */
  @JsonAdapter(VariableCompensationTypeEnum.Adapter.class)
  public enum VariableCompensationTypeEnum {
    PERCENTAGE("PERCENTAGE"),
    
    FIXED("FIXED");

    private String value;

    VariableCompensationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VariableCompensationTypeEnum fromValue(String value) {
      for (VariableCompensationTypeEnum b : VariableCompensationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VariableCompensationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VariableCompensationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VariableCompensationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VariableCompensationTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VariableCompensationTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VARIABLE_COMPENSATION_TYPE = "variable_compensation_type";
  @SerializedName(SERIALIZED_NAME_VARIABLE_COMPENSATION_TYPE)
  @javax.annotation.Nullable
  private VariableCompensationTypeEnum variableCompensationType;

  public CreateEorContractRequestCompensationDetails() {
  }

  public CreateEorContractRequestCompensationDetails salary(@javax.annotation.Nullable BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Employee&#39;s gross annual salary.
   * @return salary
   */
  @javax.annotation.Nullable
  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(@javax.annotation.Nullable BigDecimal salary) {
    this.salary = salary;
  }


  public CreateEorContractRequestCompensationDetails currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Salary currency.
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
  }


  public CreateEorContractRequestCompensationDetails variableCompensation(@javax.annotation.Nullable BigDecimal variableCompensation) {
    this.variableCompensation = variableCompensation;
    return this;
  }

  /**
   * Variable compensation. For example, if the person will earn 5% of the gross annual salary as the variable compensation, enter 5.
   * @return variableCompensation
   */
  @javax.annotation.Nullable
  public BigDecimal getVariableCompensation() {
    return variableCompensation;
  }

  public void setVariableCompensation(@javax.annotation.Nullable BigDecimal variableCompensation) {
    this.variableCompensation = variableCompensation;
  }


  public CreateEorContractRequestCompensationDetails variableCompensationType(@javax.annotation.Nullable VariableCompensationTypeEnum variableCompensationType) {
    this.variableCompensationType = variableCompensationType;
    return this;
  }

  /**
   * Should be set only if variable_compensation is set. It can be PERCENTAGE or FIXED.
   * @return variableCompensationType
   */
  @javax.annotation.Nullable
  public VariableCompensationTypeEnum getVariableCompensationType() {
    return variableCompensationType;
  }

  public void setVariableCompensationType(@javax.annotation.Nullable VariableCompensationTypeEnum variableCompensationType) {
    this.variableCompensationType = variableCompensationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEorContractRequestCompensationDetails createEorContractRequestCompensationDetails = (CreateEorContractRequestCompensationDetails) o;
    return Objects.equals(this.salary, createEorContractRequestCompensationDetails.salary) &&
        Objects.equals(this.currency, createEorContractRequestCompensationDetails.currency) &&
        Objects.equals(this.variableCompensation, createEorContractRequestCompensationDetails.variableCompensation) &&
        Objects.equals(this.variableCompensationType, createEorContractRequestCompensationDetails.variableCompensationType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(salary, currency, variableCompensation, variableCompensationType);
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
    sb.append("class CreateEorContractRequestCompensationDetails {\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    variableCompensation: ").append(toIndentedString(variableCompensation)).append("\n");
    sb.append("    variableCompensationType: ").append(toIndentedString(variableCompensationType)).append("\n");
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
    openapiFields.add("salary");
    openapiFields.add("currency");
    openapiFields.add("variable_compensation");
    openapiFields.add("variable_compensation_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEorContractRequestCompensationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEorContractRequestCompensationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEorContractRequestCompensationDetails is not found in the empty JSON string", CreateEorContractRequestCompensationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEorContractRequestCompensationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEorContractRequestCompensationDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateEorContractRequestCompensationDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("variable_compensation_type") != null && !jsonObj.get("variable_compensation_type").isJsonNull()) && !jsonObj.get("variable_compensation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable_compensation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variable_compensation_type").toString()));
      }
      // validate the optional field `variable_compensation_type`
      if (jsonObj.get("variable_compensation_type") != null && !jsonObj.get("variable_compensation_type").isJsonNull()) {
        VariableCompensationTypeEnum.validateJsonElement(jsonObj.get("variable_compensation_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEorContractRequestCompensationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEorContractRequestCompensationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEorContractRequestCompensationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEorContractRequestCompensationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEorContractRequestCompensationDetails>() {
           @Override
           public void write(JsonWriter out, CreateEorContractRequestCompensationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEorContractRequestCompensationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEorContractRequestCompensationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEorContractRequestCompensationDetails
   * @throws IOException if the JSON string is invalid with respect to CreateEorContractRequestCompensationDetails
   */
  public static CreateEorContractRequestCompensationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEorContractRequestCompensationDetails.class);
  }

  /**
   * Convert an instance of CreateEorContractRequestCompensationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

