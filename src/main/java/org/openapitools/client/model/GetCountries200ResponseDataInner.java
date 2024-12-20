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
import org.openapitools.client.model.GetCountries200ResponseDataInnerStatesInner;

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
 * GetCountries200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T12:32:05.400762149Z[GMT]", comments = "Generator version: 7.10.0")
public class GetCountries200ResponseDataInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nonnull
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_STATES = "states";
  @SerializedName(SERIALIZED_NAME_STATES)
  @javax.annotation.Nonnull
  private List<GetCountries200ResponseDataInnerStatesInner> states = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATE_TYPE = "state_type";
  @SerializedName(SERIALIZED_NAME_STATE_TYPE)
  @javax.annotation.Nullable
  private String stateType;

  public static final String SERIALIZED_NAME_EOR_SUPPORT = "eor_support";
  @SerializedName(SERIALIZED_NAME_EOR_SUPPORT)
  @javax.annotation.Nonnull
  private Boolean eorSupport;

  public static final String SERIALIZED_NAME_VISA_SUPPORT = "visa_support";
  @SerializedName(SERIALIZED_NAME_VISA_SUPPORT)
  @javax.annotation.Nonnull
  private Boolean visaSupport;

  public GetCountries200ResponseDataInner() {
  }

  public GetCountries200ResponseDataInner code(@javax.annotation.Nonnull String code) {
    this.code = code;
    return this;
  }

  /**
   * The ISO 3166-1 alpha-2 country code.
   * @return code
   */
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nonnull String code) {
    this.code = code;
  }


  public GetCountries200ResponseDataInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The official name of the country.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetCountries200ResponseDataInner states(@javax.annotation.Nonnull List<GetCountries200ResponseDataInnerStatesInner> states) {
    this.states = states;
    return this;
  }

  public GetCountries200ResponseDataInner addStatesItem(GetCountries200ResponseDataInnerStatesInner statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

  /**
   * List of sub-territories within the country. These may be called states, provinces, prefectures, regions, or may not exist.
   * @return states
   */
  @javax.annotation.Nonnull
  public List<GetCountries200ResponseDataInnerStatesInner> getStates() {
    return states;
  }

  public void setStates(@javax.annotation.Nonnull List<GetCountries200ResponseDataInnerStatesInner> states) {
    this.states = states;
  }


  public GetCountries200ResponseDataInner stateType(@javax.annotation.Nullable String stateType) {
    this.stateType = stateType;
    return this;
  }

  /**
   * The designation for sub-territories within the country, such as &#39;state&#39;, &#39;province&#39;, &#39;prefecture&#39;, or &#39;region&#39;. If none, this field will be null.
   * @return stateType
   */
  @javax.annotation.Nullable
  public String getStateType() {
    return stateType;
  }

  public void setStateType(@javax.annotation.Nullable String stateType) {
    this.stateType = stateType;
  }


  public GetCountries200ResponseDataInner eorSupport(@javax.annotation.Nonnull Boolean eorSupport) {
    this.eorSupport = eorSupport;
    return this;
  }

  /**
   * Indicates whether Deel provides Employer of Record (EoR) support in this country.
   * @return eorSupport
   */
  @javax.annotation.Nonnull
  public Boolean getEorSupport() {
    return eorSupport;
  }

  public void setEorSupport(@javax.annotation.Nonnull Boolean eorSupport) {
    this.eorSupport = eorSupport;
  }


  public GetCountries200ResponseDataInner visaSupport(@javax.annotation.Nonnull Boolean visaSupport) {
    this.visaSupport = visaSupport;
    return this;
  }

  /**
   * Indicates whether Deel provides visa support for employees being hired in this country.
   * @return visaSupport
   */
  @javax.annotation.Nonnull
  public Boolean getVisaSupport() {
    return visaSupport;
  }

  public void setVisaSupport(@javax.annotation.Nonnull Boolean visaSupport) {
    this.visaSupport = visaSupport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCountries200ResponseDataInner getCountries200ResponseDataInner = (GetCountries200ResponseDataInner) o;
    return Objects.equals(this.code, getCountries200ResponseDataInner.code) &&
        Objects.equals(this.name, getCountries200ResponseDataInner.name) &&
        Objects.equals(this.states, getCountries200ResponseDataInner.states) &&
        Objects.equals(this.stateType, getCountries200ResponseDataInner.stateType) &&
        Objects.equals(this.eorSupport, getCountries200ResponseDataInner.eorSupport) &&
        Objects.equals(this.visaSupport, getCountries200ResponseDataInner.visaSupport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, states, stateType, eorSupport, visaSupport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCountries200ResponseDataInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    stateType: ").append(toIndentedString(stateType)).append("\n");
    sb.append("    eorSupport: ").append(toIndentedString(eorSupport)).append("\n");
    sb.append("    visaSupport: ").append(toIndentedString(visaSupport)).append("\n");
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
    openapiFields.add("states");
    openapiFields.add("state_type");
    openapiFields.add("eor_support");
    openapiFields.add("visa_support");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("states");
    openapiRequiredFields.add("state_type");
    openapiRequiredFields.add("eor_support");
    openapiRequiredFields.add("visa_support");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCountries200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCountries200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCountries200ResponseDataInner is not found in the empty JSON string", GetCountries200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCountries200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCountries200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetCountries200ResponseDataInner.openapiRequiredFields) {
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
      // ensure the json data is an array
      if (!jsonObj.get("states").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `states` to be an array in the JSON string but got `%s`", jsonObj.get("states").toString()));
      }

      JsonArray jsonArraystates = jsonObj.getAsJsonArray("states");
      // validate the required field `states` (array)
      for (int i = 0; i < jsonArraystates.size(); i++) {
        GetCountries200ResponseDataInnerStatesInner.validateJsonElement(jsonArraystates.get(i));
      };
      if ((jsonObj.get("state_type") != null && !jsonObj.get("state_type").isJsonNull()) && !jsonObj.get("state_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCountries200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCountries200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCountries200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCountries200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCountries200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetCountries200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCountries200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCountries200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCountries200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetCountries200ResponseDataInner
   */
  public static GetCountries200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCountries200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetCountries200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

