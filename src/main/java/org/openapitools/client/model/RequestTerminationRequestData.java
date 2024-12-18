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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.RequestTerminationRequestDataSeverance;

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
 * RequestTerminationRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:17:35.281321822Z[GMT]", comments = "Generator version: 7.10.0")
public class RequestTerminationRequestData {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nonnull
  private String message;

  public static final String SERIALIZED_NAME_SEVERANCE = "severance";
  @SerializedName(SERIALIZED_NAME_SEVERANCE)
  @javax.annotation.Nonnull
  private RequestTerminationRequestDataSeverance severance;

  public static final String SERIALIZED_NAME_IS_VOLUNTARY = "is_voluntary";
  @SerializedName(SERIALIZED_NAME_IS_VOLUNTARY)
  @javax.annotation.Nonnull
  private Boolean isVoluntary;

  public static final String SERIALIZED_NAME_DESIRED_END_DATE = "desired_end_date";
  @SerializedName(SERIALIZED_NAME_DESIRED_END_DATE)
  @javax.annotation.Nonnull
  private LocalDate desiredEndDate;

  public static final String SERIALIZED_NAME_LAST_DATE_OF_WORK = "last_date_of_work";
  @SerializedName(SERIALIZED_NAME_LAST_DATE_OF_WORK)
  @javax.annotation.Nonnull
  private LocalDate lastDateOfWork;

  public RequestTerminationRequestData() {
  }

  public RequestTerminationRequestData message(@javax.annotation.Nonnull String message) {
    this.message = message;
    return this;
  }

  /**
   * The reason for terminating the worker&#39;s engagement.
   * @return message
   */
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nonnull String message) {
    this.message = message;
  }


  public RequestTerminationRequestData severance(@javax.annotation.Nonnull RequestTerminationRequestDataSeverance severance) {
    this.severance = severance;
    return this;
  }

  /**
   * Get severance
   * @return severance
   */
  @javax.annotation.Nonnull
  public RequestTerminationRequestDataSeverance getSeverance() {
    return severance;
  }

  public void setSeverance(@javax.annotation.Nonnull RequestTerminationRequestDataSeverance severance) {
    this.severance = severance;
  }


  public RequestTerminationRequestData isVoluntary(@javax.annotation.Nonnull Boolean isVoluntary) {
    this.isVoluntary = isVoluntary;
    return this;
  }

  /**
   * Indicates whether the worker termination is voluntary (true) or involuntary (false).
   * @return isVoluntary
   */
  @javax.annotation.Nonnull
  public Boolean getIsVoluntary() {
    return isVoluntary;
  }

  public void setIsVoluntary(@javax.annotation.Nonnull Boolean isVoluntary) {
    this.isVoluntary = isVoluntary;
  }


  public RequestTerminationRequestData desiredEndDate(@javax.annotation.Nonnull LocalDate desiredEndDate) {
    this.desiredEndDate = desiredEndDate;
    return this;
  }

  /**
   * The preferred end date for terminating the worker&#39;s engagement, in ISO-8601 format (YYYY-MM-DD).
   * @return desiredEndDate
   */
  @javax.annotation.Nonnull
  public LocalDate getDesiredEndDate() {
    return desiredEndDate;
  }

  public void setDesiredEndDate(@javax.annotation.Nonnull LocalDate desiredEndDate) {
    this.desiredEndDate = desiredEndDate;
  }


  public RequestTerminationRequestData lastDateOfWork(@javax.annotation.Nonnull LocalDate lastDateOfWork) {
    this.lastDateOfWork = lastDateOfWork;
    return this;
  }

  /**
   * The effective termination date of the worker&#39;s employment, in ISO-8601 format (YYYY-MM-DD).
   * @return lastDateOfWork
   */
  @javax.annotation.Nonnull
  public LocalDate getLastDateOfWork() {
    return lastDateOfWork;
  }

  public void setLastDateOfWork(@javax.annotation.Nonnull LocalDate lastDateOfWork) {
    this.lastDateOfWork = lastDateOfWork;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestTerminationRequestData requestTerminationRequestData = (RequestTerminationRequestData) o;
    return Objects.equals(this.message, requestTerminationRequestData.message) &&
        Objects.equals(this.severance, requestTerminationRequestData.severance) &&
        Objects.equals(this.isVoluntary, requestTerminationRequestData.isVoluntary) &&
        Objects.equals(this.desiredEndDate, requestTerminationRequestData.desiredEndDate) &&
        Objects.equals(this.lastDateOfWork, requestTerminationRequestData.lastDateOfWork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, severance, isVoluntary, desiredEndDate, lastDateOfWork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestTerminationRequestData {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    severance: ").append(toIndentedString(severance)).append("\n");
    sb.append("    isVoluntary: ").append(toIndentedString(isVoluntary)).append("\n");
    sb.append("    desiredEndDate: ").append(toIndentedString(desiredEndDate)).append("\n");
    sb.append("    lastDateOfWork: ").append(toIndentedString(lastDateOfWork)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("severance");
    openapiFields.add("is_voluntary");
    openapiFields.add("desired_end_date");
    openapiFields.add("last_date_of_work");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("severance");
    openapiRequiredFields.add("is_voluntary");
    openapiRequiredFields.add("desired_end_date");
    openapiRequiredFields.add("last_date_of_work");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RequestTerminationRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RequestTerminationRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestTerminationRequestData is not found in the empty JSON string", RequestTerminationRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RequestTerminationRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestTerminationRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RequestTerminationRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the required field `severance`
      RequestTerminationRequestDataSeverance.validateJsonElement(jsonObj.get("severance"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestTerminationRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestTerminationRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestTerminationRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestTerminationRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestTerminationRequestData>() {
           @Override
           public void write(JsonWriter out, RequestTerminationRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestTerminationRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RequestTerminationRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RequestTerminationRequestData
   * @throws IOException if the JSON string is invalid with respect to RequestTerminationRequestData
   */
  public static RequestTerminationRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestTerminationRequestData.class);
  }

  /**
   * Convert an instance of RequestTerminationRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

