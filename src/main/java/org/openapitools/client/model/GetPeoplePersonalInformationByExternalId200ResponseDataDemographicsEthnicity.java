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
import java.util.UUID;

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
 * GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T10:53:39.811706390Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_OTHER_NAME = "other_name";
  @SerializedName(SERIALIZED_NAME_OTHER_NAME)
  @javax.annotation.Nullable
  private String otherName;

  public GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity() {
  }

  public GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the ethnicity.
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the ethnicity.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity otherName(@javax.annotation.Nullable String otherName) {
    this.otherName = otherName;
    return this;
  }

  /**
   * Ethnicity added by user when \&quot;Other\&quot; option was chosen.
   * @return otherName
   */
  @javax.annotation.Nullable
  public String getOtherName() {
    return otherName;
  }

  public void setOtherName(@javax.annotation.Nullable String otherName) {
    this.otherName = otherName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity getPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity = (GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity) o;
    return Objects.equals(this.id, getPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.id) &&
        Objects.equals(this.name, getPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.name) &&
        Objects.equals(this.otherName, getPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.otherName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, otherName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("other_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("other_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity is not found in the empty JSON string", GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("other_name") != null && !jsonObj.get("other_name").isJsonNull()) && !jsonObj.get("other_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity>() {
           @Override
           public void write(JsonWriter out, GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity
   * @throws IOException if the JSON string is invalid with respect to GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity
   */
  public static GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity.class);
  }

  /**
   * Convert an instance of GetPeoplePersonalInformationByExternalId200ResponseDataDemographicsEthnicity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

