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
import org.openapitools.client.model.GetGpBankGuide200ResponseDataInnerValidationsInner;
import org.openapitools.client.model.GetGpBankGuide200ResponseDataInnerValuesAllowedInner;

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
 * GetGpBankGuide200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class GetGpBankGuide200ResponseDataInner {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nonnull
  private String key;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  @javax.annotation.Nonnull
  private Boolean required;

  public static final String SERIALIZED_NAME_VALIDATIONS = "validations";
  @SerializedName(SERIALIZED_NAME_VALIDATIONS)
  @javax.annotation.Nullable
  private List<GetGpBankGuide200ResponseDataInnerValidationsInner> validations = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUES_ALLOWED = "values_allowed";
  @SerializedName(SERIALIZED_NAME_VALUES_ALLOWED)
  @javax.annotation.Nullable
  private List<GetGpBankGuide200ResponseDataInnerValuesAllowedInner> valuesAllowed = new ArrayList<>();

  public GetGpBankGuide200ResponseDataInner() {
  }

  public GetGpBankGuide200ResponseDataInner key(@javax.annotation.Nonnull String key) {
    this.key = key;
    return this;
  }

  /**
   * The unique key representing the field.
   * @return key
   */
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nonnull String key) {
    this.key = key;
  }


  public GetGpBankGuide200ResponseDataInner type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the field, such as &#39;Text&#39; or &#39;Dropdown&#39;.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public GetGpBankGuide200ResponseDataInner label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * The label or display name for this field.
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public GetGpBankGuide200ResponseDataInner required(@javax.annotation.Nonnull Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Indicates whether the field is required.
   * @return required
   */
  @javax.annotation.Nonnull
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(@javax.annotation.Nonnull Boolean required) {
    this.required = required;
  }


  public GetGpBankGuide200ResponseDataInner validations(@javax.annotation.Nullable List<GetGpBankGuide200ResponseDataInnerValidationsInner> validations) {
    this.validations = validations;
    return this;
  }

  public GetGpBankGuide200ResponseDataInner addValidationsItem(GetGpBankGuide200ResponseDataInnerValidationsInner validationsItem) {
    if (this.validations == null) {
      this.validations = new ArrayList<>();
    }
    this.validations.add(validationsItem);
    return this;
  }

  /**
   * An array of validation rules applied to the field.
   * @return validations
   */
  @javax.annotation.Nullable
  public List<GetGpBankGuide200ResponseDataInnerValidationsInner> getValidations() {
    return validations;
  }

  public void setValidations(@javax.annotation.Nullable List<GetGpBankGuide200ResponseDataInnerValidationsInner> validations) {
    this.validations = validations;
  }


  public GetGpBankGuide200ResponseDataInner valuesAllowed(@javax.annotation.Nullable List<GetGpBankGuide200ResponseDataInnerValuesAllowedInner> valuesAllowed) {
    this.valuesAllowed = valuesAllowed;
    return this;
  }

  public GetGpBankGuide200ResponseDataInner addValuesAllowedItem(GetGpBankGuide200ResponseDataInnerValuesAllowedInner valuesAllowedItem) {
    if (this.valuesAllowed == null) {
      this.valuesAllowed = new ArrayList<>();
    }
    this.valuesAllowed.add(valuesAllowedItem);
    return this;
  }

  /**
   * An array of allowed values for the field (e.g., for dropdown fields).
   * @return valuesAllowed
   */
  @javax.annotation.Nullable
  public List<GetGpBankGuide200ResponseDataInnerValuesAllowedInner> getValuesAllowed() {
    return valuesAllowed;
  }

  public void setValuesAllowed(@javax.annotation.Nullable List<GetGpBankGuide200ResponseDataInnerValuesAllowedInner> valuesAllowed) {
    this.valuesAllowed = valuesAllowed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGpBankGuide200ResponseDataInner getGpBankGuide200ResponseDataInner = (GetGpBankGuide200ResponseDataInner) o;
    return Objects.equals(this.key, getGpBankGuide200ResponseDataInner.key) &&
        Objects.equals(this.type, getGpBankGuide200ResponseDataInner.type) &&
        Objects.equals(this.label, getGpBankGuide200ResponseDataInner.label) &&
        Objects.equals(this.required, getGpBankGuide200ResponseDataInner.required) &&
        Objects.equals(this.validations, getGpBankGuide200ResponseDataInner.validations) &&
        Objects.equals(this.valuesAllowed, getGpBankGuide200ResponseDataInner.valuesAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, label, required, validations, valuesAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGpBankGuide200ResponseDataInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
    sb.append("    valuesAllowed: ").append(toIndentedString(valuesAllowed)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("label");
    openapiFields.add("required");
    openapiFields.add("validations");
    openapiFields.add("values_allowed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("required");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetGpBankGuide200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetGpBankGuide200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetGpBankGuide200ResponseDataInner is not found in the empty JSON string", GetGpBankGuide200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetGpBankGuide200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetGpBankGuide200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetGpBankGuide200ResponseDataInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
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
            GetGpBankGuide200ResponseDataInnerValidationsInner.validateJsonElement(jsonArrayvalidations.get(i));
          };
        }
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
            GetGpBankGuide200ResponseDataInnerValuesAllowedInner.validateJsonElement(jsonArrayvaluesAllowed.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetGpBankGuide200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetGpBankGuide200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetGpBankGuide200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetGpBankGuide200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetGpBankGuide200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetGpBankGuide200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetGpBankGuide200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetGpBankGuide200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetGpBankGuide200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetGpBankGuide200ResponseDataInner
   */
  public static GetGpBankGuide200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetGpBankGuide200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetGpBankGuide200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

