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
 * Access settings for the custom field
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T15:39:23.803918573Z[GMT]", comments = "Generator version: 7.10.0")
public class CustomFieldsObjectSettingsAccess {
  /**
   * Gets or Sets providedBy
   */
  @JsonAdapter(ProvidedByEnum.Adapter.class)
  public enum ProvidedByEnum {
    ORGANIZATION("organization"),
    
    WORKER("worker");

    private String value;

    ProvidedByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProvidedByEnum fromValue(String value) {
      for (ProvidedByEnum b : ProvidedByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProvidedByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProvidedByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProvidedByEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProvidedByEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProvidedByEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROVIDED_BY = "providedBy";
  @SerializedName(SERIALIZED_NAME_PROVIDED_BY)
  @javax.annotation.Nullable
  private List<ProvidedByEnum> providedBy = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_SENSITIVE = "isSensitive";
  @SerializedName(SERIALIZED_NAME_IS_SENSITIVE)
  @javax.annotation.Nullable
  private Boolean isSensitive;

  public CustomFieldsObjectSettingsAccess() {
  }

  public CustomFieldsObjectSettingsAccess providedBy(@javax.annotation.Nullable List<ProvidedByEnum> providedBy) {
    this.providedBy = providedBy;
    return this;
  }

  public CustomFieldsObjectSettingsAccess addProvidedByItem(ProvidedByEnum providedByItem) {
    if (this.providedBy == null) {
      this.providedBy = new ArrayList<>();
    }
    this.providedBy.add(providedByItem);
    return this;
  }

  /**
   * Entities providing access to the custom field
   * @return providedBy
   */
  @javax.annotation.Nullable
  public List<ProvidedByEnum> getProvidedBy() {
    return providedBy;
  }

  public void setProvidedBy(@javax.annotation.Nullable List<ProvidedByEnum> providedBy) {
    this.providedBy = providedBy;
  }


  public CustomFieldsObjectSettingsAccess isSensitive(@javax.annotation.Nullable Boolean isSensitive) {
    this.isSensitive = isSensitive;
    return this;
  }

  /**
   * Whether the custom field is sensitive
   * @return isSensitive
   */
  @javax.annotation.Nullable
  public Boolean getIsSensitive() {
    return isSensitive;
  }

  public void setIsSensitive(@javax.annotation.Nullable Boolean isSensitive) {
    this.isSensitive = isSensitive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldsObjectSettingsAccess customFieldsObjectSettingsAccess = (CustomFieldsObjectSettingsAccess) o;
    return Objects.equals(this.providedBy, customFieldsObjectSettingsAccess.providedBy) &&
        Objects.equals(this.isSensitive, customFieldsObjectSettingsAccess.isSensitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providedBy, isSensitive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldsObjectSettingsAccess {\n");
    sb.append("    providedBy: ").append(toIndentedString(providedBy)).append("\n");
    sb.append("    isSensitive: ").append(toIndentedString(isSensitive)).append("\n");
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
    openapiFields.add("providedBy");
    openapiFields.add("isSensitive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFieldsObjectSettingsAccess
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFieldsObjectSettingsAccess.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldsObjectSettingsAccess is not found in the empty JSON string", CustomFieldsObjectSettingsAccess.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldsObjectSettingsAccess.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldsObjectSettingsAccess` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("providedBy") != null && !jsonObj.get("providedBy").isJsonNull() && !jsonObj.get("providedBy").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `providedBy` to be an array in the JSON string but got `%s`", jsonObj.get("providedBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldsObjectSettingsAccess.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldsObjectSettingsAccess' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldsObjectSettingsAccess> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldsObjectSettingsAccess.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldsObjectSettingsAccess>() {
           @Override
           public void write(JsonWriter out, CustomFieldsObjectSettingsAccess value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldsObjectSettingsAccess read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFieldsObjectSettingsAccess given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFieldsObjectSettingsAccess
   * @throws IOException if the JSON string is invalid with respect to CustomFieldsObjectSettingsAccess
   */
  public static CustomFieldsObjectSettingsAccess fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldsObjectSettingsAccess.class);
  }

  /**
   * Convert an instance of CustomFieldsObjectSettingsAccess to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

