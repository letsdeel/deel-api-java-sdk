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
 * HrisJobInformationTitleId
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class HrisJobInformationTitleId {
  public static final String SERIALIZED_NAME_SENIORITY_ID = "seniority_id";
  @SerializedName(SERIALIZED_NAME_SENIORITY_ID)
  @javax.annotation.Nonnull
  private BigDecimal seniorityId;

  public static final String SERIALIZED_NAME_JOB_TITLE_ID = "job_title_id";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE_ID)
  @javax.annotation.Nonnull
  private BigDecimal jobTitleId;

  public HrisJobInformationTitleId() {
  }

  public HrisJobInformationTitleId seniorityId(@javax.annotation.Nonnull BigDecimal seniorityId) {
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

  public void setSeniorityId(@javax.annotation.Nonnull BigDecimal seniorityId) {
    this.seniorityId = seniorityId;
  }


  public HrisJobInformationTitleId jobTitleId(@javax.annotation.Nonnull BigDecimal jobTitleId) {
    this.jobTitleId = jobTitleId;
    return this;
  }

  /**
   * Get jobTitleId
   * @return jobTitleId
   */
  @javax.annotation.Nonnull
  public BigDecimal getJobTitleId() {
    return jobTitleId;
  }

  public void setJobTitleId(@javax.annotation.Nonnull BigDecimal jobTitleId) {
    this.jobTitleId = jobTitleId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HrisJobInformationTitleId hrisJobInformationTitleId = (HrisJobInformationTitleId) o;
    return Objects.equals(this.seniorityId, hrisJobInformationTitleId.seniorityId) &&
        Objects.equals(this.jobTitleId, hrisJobInformationTitleId.jobTitleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seniorityId, jobTitleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HrisJobInformationTitleId {\n");
    sb.append("    seniorityId: ").append(toIndentedString(seniorityId)).append("\n");
    sb.append("    jobTitleId: ").append(toIndentedString(jobTitleId)).append("\n");
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
    openapiFields.add("job_title_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("seniority_id");
    openapiRequiredFields.add("job_title_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HrisJobInformationTitleId
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HrisJobInformationTitleId.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HrisJobInformationTitleId is not found in the empty JSON string", HrisJobInformationTitleId.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HrisJobInformationTitleId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HrisJobInformationTitleId` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HrisJobInformationTitleId.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HrisJobInformationTitleId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HrisJobInformationTitleId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HrisJobInformationTitleId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HrisJobInformationTitleId.class));

       return (TypeAdapter<T>) new TypeAdapter<HrisJobInformationTitleId>() {
           @Override
           public void write(JsonWriter out, HrisJobInformationTitleId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HrisJobInformationTitleId read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HrisJobInformationTitleId given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HrisJobInformationTitleId
   * @throws IOException if the JSON string is invalid with respect to HrisJobInformationTitleId
   */
  public static HrisJobInformationTitleId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HrisJobInformationTitleId.class);
  }

  /**
   * Convert an instance of HrisJobInformationTitleId to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

