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
 * Mandatory EOR field.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class EorField {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_PROPERTY_NAME = "property_name";
  @SerializedName(SERIALIZED_NAME_PROPERTY_NAME)
  @javax.annotation.Nullable
  private String propertyName;

  public static final String SERIALIZED_NAME_INPUT_TYPE = "input_type";
  @SerializedName(SERIALIZED_NAME_INPUT_TYPE)
  @javax.annotation.Nullable
  private String inputType;

  public static final String SERIALIZED_NAME_IS_OPTIONAL = "is_optional";
  @SerializedName(SERIALIZED_NAME_IS_OPTIONAL)
  @javax.annotation.Nullable
  private Boolean isOptional;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  @javax.annotation.Nullable
  private List<String> options = new ArrayList<>();

  public EorField() {
  }

  public EorField label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public EorField propertyName(@javax.annotation.Nullable String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * Get propertyName
   * @return propertyName
   */
  @javax.annotation.Nullable
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(@javax.annotation.Nullable String propertyName) {
    this.propertyName = propertyName;
  }


  public EorField inputType(@javax.annotation.Nullable String inputType) {
    this.inputType = inputType;
    return this;
  }

  /**
   * Get inputType
   * @return inputType
   */
  @javax.annotation.Nullable
  public String getInputType() {
    return inputType;
  }

  public void setInputType(@javax.annotation.Nullable String inputType) {
    this.inputType = inputType;
  }


  public EorField isOptional(@javax.annotation.Nullable Boolean isOptional) {
    this.isOptional = isOptional;
    return this;
  }

  /**
   * Get isOptional
   * @return isOptional
   */
  @javax.annotation.Nullable
  public Boolean getIsOptional() {
    return isOptional;
  }

  public void setIsOptional(@javax.annotation.Nullable Boolean isOptional) {
    this.isOptional = isOptional;
  }


  public EorField options(@javax.annotation.Nullable List<String> options) {
    this.options = options;
    return this;
  }

  public EorField addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nullable
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(@javax.annotation.Nullable List<String> options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EorField eorField = (EorField) o;
    return Objects.equals(this.label, eorField.label) &&
        Objects.equals(this.propertyName, eorField.propertyName) &&
        Objects.equals(this.inputType, eorField.inputType) &&
        Objects.equals(this.isOptional, eorField.isOptional) &&
        Objects.equals(this.options, eorField.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, propertyName, inputType, isOptional, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EorField {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    isOptional: ").append(toIndentedString(isOptional)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("property_name");
    openapiFields.add("input_type");
    openapiFields.add("is_optional");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EorField
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EorField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EorField is not found in the empty JSON string", EorField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EorField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EorField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("property_name") != null && !jsonObj.get("property_name").isJsonNull()) && !jsonObj.get("property_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("property_name").toString()));
      }
      if ((jsonObj.get("input_type") != null && !jsonObj.get("input_type").isJsonNull()) && !jsonObj.get("input_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input_type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull() && !jsonObj.get("options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EorField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EorField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EorField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EorField.class));

       return (TypeAdapter<T>) new TypeAdapter<EorField>() {
           @Override
           public void write(JsonWriter out, EorField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EorField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EorField given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EorField
   * @throws IOException if the JSON string is invalid with respect to EorField
   */
  public static EorField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EorField.class);
  }

  /**
   * Convert an instance of EorField to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

