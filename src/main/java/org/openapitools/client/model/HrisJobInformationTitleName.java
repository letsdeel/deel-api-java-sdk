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
 * HrisJobInformationTitleName
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class HrisJobInformationTitleName {
  public static final String SERIALIZED_NAME_SENIORITY_ID = "seniority_id";
  @SerializedName(SERIALIZED_NAME_SENIORITY_ID)
  private BigDecimal seniorityId;

  public static final String SERIALIZED_NAME_JOB_TITLE_NAME = "job_title_name";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE_NAME)
  private String jobTitleName;

  public HrisJobInformationTitleName() {
  }

  public HrisJobInformationTitleName seniorityId(BigDecimal seniorityId) {
    this.seniorityId = seniorityId;
    return this;
  }

  /**
   * Get seniorityId
   * @return seniorityId
   */
  @javax.annotation.Nonnull
  public BigDecimal getSeniorityId() {
    return seniorityId;
  }

  public void setSeniorityId(BigDecimal seniorityId) {
    this.seniorityId = seniorityId;
  }


  public HrisJobInformationTitleName jobTitleName(String jobTitleName) {
    this.jobTitleName = jobTitleName;
    return this;
  }

  /**
   * Get jobTitleName
   * @return jobTitleName
   */
  @javax.annotation.Nonnull
  public String getJobTitleName() {
    return jobTitleName;
  }

  public void setJobTitleName(String jobTitleName) {
    this.jobTitleName = jobTitleName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HrisJobInformationTitleName hrisJobInformationTitleName = (HrisJobInformationTitleName) o;
    return Objects.equals(this.seniorityId, hrisJobInformationTitleName.seniorityId) &&
        Objects.equals(this.jobTitleName, hrisJobInformationTitleName.jobTitleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seniorityId, jobTitleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HrisJobInformationTitleName {\n");
    sb.append("    seniorityId: ").append(toIndentedString(seniorityId)).append("\n");
    sb.append("    jobTitleName: ").append(toIndentedString(jobTitleName)).append("\n");
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
    openapiFields.add("seniority_id");
    openapiFields.add("job_title_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("seniority_id");
    openapiRequiredFields.add("job_title_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HrisJobInformationTitleName
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HrisJobInformationTitleName.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HrisJobInformationTitleName is not found in the empty JSON string", HrisJobInformationTitleName.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HrisJobInformationTitleName.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HrisJobInformationTitleName` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HrisJobInformationTitleName.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("job_title_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HrisJobInformationTitleName.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HrisJobInformationTitleName' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HrisJobInformationTitleName> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HrisJobInformationTitleName.class));

       return (TypeAdapter<T>) new TypeAdapter<HrisJobInformationTitleName>() {
           @Override
           public void write(JsonWriter out, HrisJobInformationTitleName value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HrisJobInformationTitleName read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HrisJobInformationTitleName given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HrisJobInformationTitleName
   * @throws IOException if the JSON string is invalid with respect to HrisJobInformationTitleName
   */
  public static HrisJobInformationTitleName fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HrisJobInformationTitleName.class);
  }

  /**
   * Convert an instance of HrisJobInformationTitleName to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

