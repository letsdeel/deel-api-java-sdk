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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BankAccountValueAllowed;
import org.openapitools.client.model.ValidationType;

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
 * BankAccountGuide
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class BankAccountGuide {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nonnull
  private String key;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  @javax.annotation.Nonnull
  private Boolean required;

  public static final String SERIALIZED_NAME_VALUES_ALLOWED = "values_allowed";
  @SerializedName(SERIALIZED_NAME_VALUES_ALLOWED)
  @javax.annotation.Nullable
  private List<BankAccountValueAllowed> valuesAllowed = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALIDATIONS = "validations";
  @SerializedName(SERIALIZED_NAME_VALIDATIONS)
  @javax.annotation.Nullable
  private List<ValidationType> validations = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public BankAccountGuide() {
  }

  public BankAccountGuide key(@javax.annotation.Nonnull String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the field.
   * @return key
   */
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nonnull String key) {
    this.key = key;
  }


  public BankAccountGuide label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Label for this field.
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public BankAccountGuide required(@javax.annotation.Nonnull Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Whether the field is required or not.
   * @return required
   */
  @javax.annotation.Nonnull
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(@javax.annotation.Nonnull Boolean required) {
    this.required = required;
  }


  public BankAccountGuide valuesAllowed(@javax.annotation.Nullable List<BankAccountValueAllowed> valuesAllowed) {
    this.valuesAllowed = valuesAllowed;
    return this;
  }

  public BankAccountGuide addValuesAllowedItem(BankAccountValueAllowed valuesAllowedItem) {
    if (this.valuesAllowed == null) {
      this.valuesAllowed = new ArrayList<>();
    }
    this.valuesAllowed.add(valuesAllowedItem);
    return this;
  }

  /**
   * Get valuesAllowed
   * @return valuesAllowed
   */
  @javax.annotation.Nullable
  public List<BankAccountValueAllowed> getValuesAllowed() {
    return valuesAllowed;
  }

  public void setValuesAllowed(@javax.annotation.Nullable List<BankAccountValueAllowed> valuesAllowed) {
    this.valuesAllowed = valuesAllowed;
  }


  public BankAccountGuide validations(@javax.annotation.Nullable List<ValidationType> validations) {
    this.validations = validations;
    return this;
  }

  public BankAccountGuide addValidationsItem(ValidationType validationsItem) {
    if (this.validations == null) {
      this.validations = new ArrayList<>();
    }
    this.validations.add(validationsItem);
    return this;
  }

  /**
   * Get validations
   * @return validations
   */
  @javax.annotation.Nullable
  public List<ValidationType> getValidations() {
    return validations;
  }

  public void setValidations(@javax.annotation.Nullable List<ValidationType> validations) {
    this.validations = validations;
  }


  public BankAccountGuide type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the field
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountGuide bankAccountGuide = (BankAccountGuide) o;
    return Objects.equals(this.key, bankAccountGuide.key) &&
        Objects.equals(this.label, bankAccountGuide.label) &&
        Objects.equals(this.required, bankAccountGuide.required) &&
        Objects.equals(this.valuesAllowed, bankAccountGuide.valuesAllowed) &&
        Objects.equals(this.validations, bankAccountGuide.validations) &&
        Objects.equals(this.type, bankAccountGuide.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, label, required, valuesAllowed, validations, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountGuide {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    valuesAllowed: ").append(toIndentedString(valuesAllowed)).append("\n");
    sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("label");
    openapiFields.add("required");
    openapiFields.add("values_allowed");
    openapiFields.add("validations");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("required");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BankAccountGuide
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BankAccountGuide.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BankAccountGuide is not found in the empty JSON string", BankAccountGuide.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BankAccountGuide.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BankAccountGuide` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BankAccountGuide.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (jsonObj.get("values_allowed") != null && !jsonObj.get("values_allowed").isJsonNull()) {
        JsonArray jsonArrayvaluesAllowed = jsonObj.getAsJsonArray("values_allowed");
        if (jsonArrayvaluesAllowed != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values_allowed").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values_allowed` to be an array in the JSON string but got `%s`", jsonObj.get("values_allowed").toString()));
          }

          // validate the optional field `values_allowed` (array)
          for (int i = 0; i < jsonArrayvaluesAllowed.size(); i++) {
            BankAccountValueAllowed.validateJsonElement(jsonArrayvaluesAllowed.get(i));
          };
        }
      }
      if (jsonObj.get("validations") != null && !jsonObj.get("validations").isJsonNull()) {
        JsonArray jsonArrayvalidations = jsonObj.getAsJsonArray("validations");
        if (jsonArrayvalidations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("validations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `validations` to be an array in the JSON string but got `%s`", jsonObj.get("validations").toString()));
          }

          // validate the optional field `validations` (array)
          for (int i = 0; i < jsonArrayvalidations.size(); i++) {
            ValidationType.validateJsonElement(jsonArrayvalidations.get(i));
          };
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BankAccountGuide.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BankAccountGuide' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BankAccountGuide> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BankAccountGuide.class));

       return (TypeAdapter<T>) new TypeAdapter<BankAccountGuide>() {
           @Override
           public void write(JsonWriter out, BankAccountGuide value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BankAccountGuide read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BankAccountGuide given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BankAccountGuide
   * @throws IOException if the JSON string is invalid with respect to BankAccountGuide
   */
  public static BankAccountGuide fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BankAccountGuide.class);
  }

  /**
   * Convert an instance of BankAccountGuide to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

