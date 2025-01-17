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
 * Details about the compensations.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class GetBenefitEmployee200ResponseContractsInnerCompensationsInner {
  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  @javax.annotation.Nullable
  private BigDecimal rate;

  /**
   * The type of compensation, either MAIN or VARIABLE.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MAIN("MAIN"),
    
    VARIABLE("VARIABLE");

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
  @javax.annotation.Nullable
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nullable
  private String scale;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_CYCLE_SCALE = "cycle_scale";
  @SerializedName(SERIALIZED_NAME_CYCLE_SCALE)
  @javax.annotation.Nullable
  private String cycleScale;

  /**
   * The type of variable compensation, either FIXED or PERCENTAGE.
   */
  @JsonAdapter(VariableCompensationTypeEnum.Adapter.class)
  public enum VariableCompensationTypeEnum {
    FIXED("FIXED"),
    
    PERCENTAGE("PERCENTAGE");

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

  public GetBenefitEmployee200ResponseContractsInnerCompensationsInner() {
  }

  public GetBenefitEmployee200ResponseContractsInnerCompensationsInner rate(@javax.annotation.Nullable BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The rate of compensation.
   * @return rate
   */
  @javax.annotation.Nullable
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(@javax.annotation.Nullable BigDecimal rate) {
    this.rate = rate;
  }


  public GetBenefitEmployee200ResponseContractsInnerCompensationsInner type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of compensation, either MAIN or VARIABLE.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public GetBenefitEmployee200ResponseContractsInnerCompensationsInner scale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * The scale of the compensation.
   * @return scale
   */
  @javax.annotation.Nullable
  public String getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
  }


  public GetBenefitEmployee200ResponseContractsInnerCompensationsInner currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency of the compensation.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public GetBenefitEmployee200ResponseContractsInnerCompensationsInner cycleScale(@javax.annotation.Nullable String cycleScale) {
    this.cycleScale = cycleScale;
    return this;
  }

  /**
   * The cycle scale of the compensation.
   * @return cycleScale
   */
  @javax.annotation.Nullable
  public String getCycleScale() {
    return cycleScale;
  }

  public void setCycleScale(@javax.annotation.Nullable String cycleScale) {
    this.cycleScale = cycleScale;
  }


  public GetBenefitEmployee200ResponseContractsInnerCompensationsInner variableCompensationType(@javax.annotation.Nullable VariableCompensationTypeEnum variableCompensationType) {
    this.variableCompensationType = variableCompensationType;
    return this;
  }

  /**
   * The type of variable compensation, either FIXED or PERCENTAGE.
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
    GetBenefitEmployee200ResponseContractsInnerCompensationsInner getBenefitEmployee200ResponseContractsInnerCompensationsInner = (GetBenefitEmployee200ResponseContractsInnerCompensationsInner) o;
    return Objects.equals(this.rate, getBenefitEmployee200ResponseContractsInnerCompensationsInner.rate) &&
        Objects.equals(this.type, getBenefitEmployee200ResponseContractsInnerCompensationsInner.type) &&
        Objects.equals(this.scale, getBenefitEmployee200ResponseContractsInnerCompensationsInner.scale) &&
        Objects.equals(this.currency, getBenefitEmployee200ResponseContractsInnerCompensationsInner.currency) &&
        Objects.equals(this.cycleScale, getBenefitEmployee200ResponseContractsInnerCompensationsInner.cycleScale) &&
        Objects.equals(this.variableCompensationType, getBenefitEmployee200ResponseContractsInnerCompensationsInner.variableCompensationType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, type, scale, currency, cycleScale, variableCompensationType);
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
    sb.append("class GetBenefitEmployee200ResponseContractsInnerCompensationsInner {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    cycleScale: ").append(toIndentedString(cycleScale)).append("\n");
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
    openapiFields.add("rate");
    openapiFields.add("type");
    openapiFields.add("scale");
    openapiFields.add("currency");
    openapiFields.add("cycle_scale");
    openapiFields.add("variable_compensation_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetBenefitEmployee200ResponseContractsInnerCompensationsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBenefitEmployee200ResponseContractsInnerCompensationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBenefitEmployee200ResponseContractsInnerCompensationsInner is not found in the empty JSON string", GetBenefitEmployee200ResponseContractsInnerCompensationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBenefitEmployee200ResponseContractsInnerCompensationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBenefitEmployee200ResponseContractsInnerCompensationsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("cycle_scale") != null && !jsonObj.get("cycle_scale").isJsonNull()) && !jsonObj.get("cycle_scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cycle_scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cycle_scale").toString()));
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
       if (!GetBenefitEmployee200ResponseContractsInnerCompensationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBenefitEmployee200ResponseContractsInnerCompensationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBenefitEmployee200ResponseContractsInnerCompensationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBenefitEmployee200ResponseContractsInnerCompensationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBenefitEmployee200ResponseContractsInnerCompensationsInner>() {
           @Override
           public void write(JsonWriter out, GetBenefitEmployee200ResponseContractsInnerCompensationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBenefitEmployee200ResponseContractsInnerCompensationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBenefitEmployee200ResponseContractsInnerCompensationsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBenefitEmployee200ResponseContractsInnerCompensationsInner
   * @throws IOException if the JSON string is invalid with respect to GetBenefitEmployee200ResponseContractsInnerCompensationsInner
   */
  public static GetBenefitEmployee200ResponseContractsInnerCompensationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBenefitEmployee200ResponseContractsInnerCompensationsInner.class);
  }

  /**
   * Convert an instance of GetBenefitEmployee200ResponseContractsInnerCompensationsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

