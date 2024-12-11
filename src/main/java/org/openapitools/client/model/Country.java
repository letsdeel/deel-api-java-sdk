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
import org.openapitools.client.model.StateOfCountry;

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
 * Country
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T20:12:16.895242729Z[GMT]", comments = "Generator version: 7.10.0")
public class Country {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nonnull
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_VISA_SUPPORT = "visa_support";
  @SerializedName(SERIALIZED_NAME_VISA_SUPPORT)
  @javax.annotation.Nonnull
  private Boolean visaSupport;

  public static final String SERIALIZED_NAME_EOR_SUPPORT = "eor_support";
  @SerializedName(SERIALIZED_NAME_EOR_SUPPORT)
  @javax.annotation.Nonnull
  private Boolean eorSupport;

  public static final String SERIALIZED_NAME_STATE_TYPE = "state_type";
  @SerializedName(SERIALIZED_NAME_STATE_TYPE)
  @javax.annotation.Nullable
  private String stateType;

  public static final String SERIALIZED_NAME_STATES = "states";
  @SerializedName(SERIALIZED_NAME_STATES)
  @javax.annotation.Nonnull
  private List<StateOfCountry> states = new ArrayList<>();

  public Country() {
  }

  public Country code(@javax.annotation.Nonnull String code) {
    this.code = code;
    return this;
  }

  /**
   * Country code.
   * @return code
   */
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nonnull String code) {
    this.code = code;
  }


  public Country name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Country name.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public Country visaSupport(@javax.annotation.Nonnull Boolean visaSupport) {
    this.visaSupport = visaSupport;
    return this;
  }

  /**
   * Identifies if Deel provides visa support for employees being hired in this country.
   * @return visaSupport
   */
  @javax.annotation.Nonnull
  public Boolean getVisaSupport() {
    return visaSupport;
  }

  public void setVisaSupport(@javax.annotation.Nonnull Boolean visaSupport) {
    this.visaSupport = visaSupport;
  }


  public Country eorSupport(@javax.annotation.Nonnull Boolean eorSupport) {
    this.eorSupport = eorSupport;
    return this;
  }

  /**
   * Identifies if Deel support EoR in this country.
   * @return eorSupport
   */
  @javax.annotation.Nonnull
  public Boolean getEorSupport() {
    return eorSupport;
  }

  public void setEorSupport(@javax.annotation.Nonnull Boolean eorSupport) {
    this.eorSupport = eorSupport;
  }


  public Country stateType(@javax.annotation.Nullable String stateType) {
    this.stateType = stateType;
    return this;
  }

  /**
   * Identifies the type of sub-territory within a country where local laws may apply. Some countries may have states, provinces, prefectures or regions.
   * @return stateType
   */
  @javax.annotation.Nullable
  public String getStateType() {
    return stateType;
  }

  public void setStateType(@javax.annotation.Nullable String stateType) {
    this.stateType = stateType;
  }


  public Country states(@javax.annotation.Nonnull List<StateOfCountry> states) {
    this.states = states;
    return this;
  }

  public Country addStatesItem(StateOfCountry statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

  /**
   * Get states
   * @return states
   */
  @javax.annotation.Nonnull
  public List<StateOfCountry> getStates() {
    return states;
  }

  public void setStates(@javax.annotation.Nonnull List<StateOfCountry> states) {
    this.states = states;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.code, country.code) &&
        Objects.equals(this.name, country.name) &&
        Objects.equals(this.visaSupport, country.visaSupport) &&
        Objects.equals(this.eorSupport, country.eorSupport) &&
        Objects.equals(this.stateType, country.stateType) &&
        Objects.equals(this.states, country.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, visaSupport, eorSupport, stateType, states);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    visaSupport: ").append(toIndentedString(visaSupport)).append("\n");
    sb.append("    eorSupport: ").append(toIndentedString(eorSupport)).append("\n");
    sb.append("    stateType: ").append(toIndentedString(stateType)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("name");
    openapiFields.add("visa_support");
    openapiFields.add("eor_support");
    openapiFields.add("state_type");
    openapiFields.add("states");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("visa_support");
    openapiRequiredFields.add("eor_support");
    openapiRequiredFields.add("state_type");
    openapiRequiredFields.add("states");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Country
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Country.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Country is not found in the empty JSON string", Country.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Country.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Country` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Country.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("state_type") != null && !jsonObj.get("state_type").isJsonNull()) && !jsonObj.get("state_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("states").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `states` to be an array in the JSON string but got `%s`", jsonObj.get("states").toString()));
      }

      JsonArray jsonArraystates = jsonObj.getAsJsonArray("states");
      // validate the required field `states` (array)
      for (int i = 0; i < jsonArraystates.size(); i++) {
        StateOfCountry.validateJsonElement(jsonArraystates.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Country.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Country' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Country> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Country.class));

       return (TypeAdapter<T>) new TypeAdapter<Country>() {
           @Override
           public void write(JsonWriter out, Country value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Country read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Country given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Country
   * @throws IOException if the JSON string is invalid with respect to Country
   */
  public static Country fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Country.class);
  }

  /**
   * Convert an instance of Country to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

