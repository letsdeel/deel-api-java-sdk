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
import java.util.Arrays;
import org.openapitools.client.model.GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity;
import org.openapitools.client.model.GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsGender;

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
 * GetPeoplePersonalInformationByExternalId200ResponseDataDemographics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:05:54.444639311Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPeoplePersonalInformationByExternalId200ResponseDataDemographics {
  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  @javax.annotation.Nullable
  private GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsGender gender;

  public static final String SERIALIZED_NAME_ETHNICITY = "ethnicity";
  @SerializedName(SERIALIZED_NAME_ETHNICITY)
  @javax.annotation.Nullable
  private GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity ethnicity;

  public GetPeoplePersonalInformationByExternalId200ResponseDataDemographics() {
  }

  public GetPeoplePersonalInformationByExternalId200ResponseDataDemographics gender(@javax.annotation.Nullable GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsGender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nullable
  public GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsGender getGender() {
    return gender;
  }

  public void setGender(@javax.annotation.Nullable GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsGender gender) {
    this.gender = gender;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseDataDemographics ethnicity(@javax.annotation.Nullable GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity ethnicity) {
    this.ethnicity = ethnicity;
    return this;
  }

  /**
   * Get ethnicity
   * @return ethnicity
   */
  @javax.annotation.Nullable
  public GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity getEthnicity() {
    return ethnicity;
  }

  public void setEthnicity(@javax.annotation.Nullable GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity ethnicity) {
    this.ethnicity = ethnicity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPeoplePersonalInformationByExternalId200ResponseDataDemographics getPeoplePersonalInformationByExternalId200ResponseDataDemographics = (GetPeoplePersonalInformationByExternalId200ResponseDataDemographics) o;
    return Objects.equals(this.gender, getPeoplePersonalInformationByExternalId200ResponseDataDemographics.gender) &&
        Objects.equals(this.ethnicity, getPeoplePersonalInformationByExternalId200ResponseDataDemographics.ethnicity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, ethnicity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeoplePersonalInformationByExternalId200ResponseDataDemographics {\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
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
    openapiFields.add("gender");
    openapiFields.add("ethnicity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gender");
    openapiRequiredFields.add("ethnicity");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPeoplePersonalInformationByExternalId200ResponseDataDemographics
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPeoplePersonalInformationByExternalId200ResponseDataDemographics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPeoplePersonalInformationByExternalId200ResponseDataDemographics is not found in the empty JSON string", GetPeoplePersonalInformationByExternalId200ResponseDataDemographics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPeoplePersonalInformationByExternalId200ResponseDataDemographics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPeoplePersonalInformationByExternalId200ResponseDataDemographics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPeoplePersonalInformationByExternalId200ResponseDataDemographics.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `gender`
      GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsGender.validateJsonElement(jsonObj.get("gender"));
      // validate the required field `ethnicity`
      GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.validateJsonElement(jsonObj.get("ethnicity"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPeoplePersonalInformationByExternalId200ResponseDataDemographics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPeoplePersonalInformationByExternalId200ResponseDataDemographics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPeoplePersonalInformationByExternalId200ResponseDataDemographics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPeoplePersonalInformationByExternalId200ResponseDataDemographics.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPeoplePersonalInformationByExternalId200ResponseDataDemographics>() {
           @Override
           public void write(JsonWriter out, GetPeoplePersonalInformationByExternalId200ResponseDataDemographics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPeoplePersonalInformationByExternalId200ResponseDataDemographics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPeoplePersonalInformationByExternalId200ResponseDataDemographics given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPeoplePersonalInformationByExternalId200ResponseDataDemographics
   * @throws IOException if the JSON string is invalid with respect to GetPeoplePersonalInformationByExternalId200ResponseDataDemographics
   */
  public static GetPeoplePersonalInformationByExternalId200ResponseDataDemographics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPeoplePersonalInformationByExternalId200ResponseDataDemographics.class);
  }

  /**
   * Convert an instance of GetPeoplePersonalInformationByExternalId200ResponseDataDemographics to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

