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
import org.openapitools.client.model.CustomFieldsObjectSettingsAccess;

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
 * CustomFieldsObjectSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:04:44.564028033Z[GMT]", comments = "Generator version: 7.10.0")
public class CustomFieldsObjectSettings {
  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  @javax.annotation.Nullable
  private CustomFieldsObjectSettingsAccess access;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  @javax.annotation.Nullable
  private Boolean required;

  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  @javax.annotation.Nullable
  private List<String> countries = new ArrayList<>();

  /**
   * Gets or Sets workerTypes
   */
  @JsonAdapter(WorkerTypesEnum.Adapter.class)
  public enum WorkerTypesEnum {
    EOR("eor"),
    
    CONTRACTOR("contractor"),
    
    HRIS_DIRECT_EMPLOYEE("hris_direct_employee"),
    
    DIRECT_EMPLOYEE("direct_employee");

    private String value;

    WorkerTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkerTypesEnum fromValue(String value) {
      for (WorkerTypesEnum b : WorkerTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WorkerTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkerTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkerTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WorkerTypesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WorkerTypesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WORKER_TYPES = "workerTypes";
  @SerializedName(SERIALIZED_NAME_WORKER_TYPES)
  @javax.annotation.Nullable
  private List<WorkerTypesEnum> workerTypes = new ArrayList<>();

  public CustomFieldsObjectSettings() {
  }

  public CustomFieldsObjectSettings access(@javax.annotation.Nullable CustomFieldsObjectSettingsAccess access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
   */
  @javax.annotation.Nullable
  public CustomFieldsObjectSettingsAccess getAccess() {
    return access;
  }

  public void setAccess(@javax.annotation.Nullable CustomFieldsObjectSettingsAccess access) {
    this.access = access;
  }


  public CustomFieldsObjectSettings required(@javax.annotation.Nullable Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Whether the custom field is required
   * @return required
   */
  @javax.annotation.Nullable
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(@javax.annotation.Nullable Boolean required) {
    this.required = required;
  }


  public CustomFieldsObjectSettings countries(@javax.annotation.Nullable List<String> countries) {
    this.countries = countries;
    return this;
  }

  public CustomFieldsObjectSettings addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * Countries for which the custom field is applicable.
   * @return countries
   */
  @javax.annotation.Nullable
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(@javax.annotation.Nullable List<String> countries) {
    this.countries = countries;
  }


  public CustomFieldsObjectSettings workerTypes(@javax.annotation.Nullable List<WorkerTypesEnum> workerTypes) {
    this.workerTypes = workerTypes;
    return this;
  }

  public CustomFieldsObjectSettings addWorkerTypesItem(WorkerTypesEnum workerTypesItem) {
    if (this.workerTypes == null) {
      this.workerTypes = new ArrayList<>();
    }
    this.workerTypes.add(workerTypesItem);
    return this;
  }

  /**
   * Worker types for which the custom field is applicable
   * @return workerTypes
   */
  @javax.annotation.Nullable
  public List<WorkerTypesEnum> getWorkerTypes() {
    return workerTypes;
  }

  public void setWorkerTypes(@javax.annotation.Nullable List<WorkerTypesEnum> workerTypes) {
    this.workerTypes = workerTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldsObjectSettings customFieldsObjectSettings = (CustomFieldsObjectSettings) o;
    return Objects.equals(this.access, customFieldsObjectSettings.access) &&
        Objects.equals(this.required, customFieldsObjectSettings.required) &&
        Objects.equals(this.countries, customFieldsObjectSettings.countries) &&
        Objects.equals(this.workerTypes, customFieldsObjectSettings.workerTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, required, countries, workerTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldsObjectSettings {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    workerTypes: ").append(toIndentedString(workerTypes)).append("\n");
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
    openapiFields.add("access");
    openapiFields.add("required");
    openapiFields.add("countries");
    openapiFields.add("workerTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFieldsObjectSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFieldsObjectSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldsObjectSettings is not found in the empty JSON string", CustomFieldsObjectSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldsObjectSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldsObjectSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `access`
      if (jsonObj.get("access") != null && !jsonObj.get("access").isJsonNull()) {
        CustomFieldsObjectSettingsAccess.validateJsonElement(jsonObj.get("access"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("countries") != null && !jsonObj.get("countries").isJsonNull() && !jsonObj.get("countries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `countries` to be an array in the JSON string but got `%s`", jsonObj.get("countries").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("workerTypes") != null && !jsonObj.get("workerTypes").isJsonNull() && !jsonObj.get("workerTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workerTypes` to be an array in the JSON string but got `%s`", jsonObj.get("workerTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldsObjectSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldsObjectSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldsObjectSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldsObjectSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldsObjectSettings>() {
           @Override
           public void write(JsonWriter out, CustomFieldsObjectSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldsObjectSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFieldsObjectSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFieldsObjectSettings
   * @throws IOException if the JSON string is invalid with respect to CustomFieldsObjectSettings
   */
  public static CustomFieldsObjectSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldsObjectSettings.class);
  }

  /**
   * Convert an instance of CustomFieldsObjectSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

