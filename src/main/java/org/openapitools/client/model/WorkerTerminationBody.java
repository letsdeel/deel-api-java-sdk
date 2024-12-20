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
import org.openapitools.client.model.WorkerTerminationBodySeverance;

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
 * WorkerTerminationBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T13:30:34.884345844Z[GMT]", comments = "Generator version: 7.10.0")
public class WorkerTerminationBody {
  public static final String SERIALIZED_NAME_DESIRED_END_DATE = "desired_end_date";
  @SerializedName(SERIALIZED_NAME_DESIRED_END_DATE)
  @javax.annotation.Nonnull
  private LocalDate desiredEndDate;

  public static final String SERIALIZED_NAME_LAST_DATE_OF_WORK = "last_date_of_work";
  @SerializedName(SERIALIZED_NAME_LAST_DATE_OF_WORK)
  @javax.annotation.Nonnull
  private LocalDate lastDateOfWork;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nonnull
  private String message;

  public static final String SERIALIZED_NAME_IS_VOLUNTARY = "is_voluntary";
  @SerializedName(SERIALIZED_NAME_IS_VOLUNTARY)
  @javax.annotation.Nonnull
  private Boolean isVoluntary;

  public static final String SERIALIZED_NAME_SEVERANCE = "severance";
  @SerializedName(SERIALIZED_NAME_SEVERANCE)
  @javax.annotation.Nonnull
  private WorkerTerminationBodySeverance severance;

  public WorkerTerminationBody() {
  }

  public WorkerTerminationBody desiredEndDate(@javax.annotation.Nonnull LocalDate desiredEndDate) {
    this.desiredEndDate = desiredEndDate;
    return this;
  }

  /**
   * The preferred end date for terminating the worker&#39;s engagement.
   * @return desiredEndDate
   */
  @javax.annotation.Nonnull
  public LocalDate getDesiredEndDate() {
    return desiredEndDate;
  }

  public void setDesiredEndDate(@javax.annotation.Nonnull LocalDate desiredEndDate) {
    this.desiredEndDate = desiredEndDate;
  }


  public WorkerTerminationBody lastDateOfWork(@javax.annotation.Nonnull LocalDate lastDateOfWork) {
    this.lastDateOfWork = lastDateOfWork;
    return this;
  }

  /**
   * The effective termination date of the worker&#39;s employment.
   * @return lastDateOfWork
   */
  @javax.annotation.Nonnull
  public LocalDate getLastDateOfWork() {
    return lastDateOfWork;
  }

  public void setLastDateOfWork(@javax.annotation.Nonnull LocalDate lastDateOfWork) {
    this.lastDateOfWork = lastDateOfWork;
  }


  public WorkerTerminationBody message(@javax.annotation.Nonnull String message) {
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


  public WorkerTerminationBody isVoluntary(@javax.annotation.Nonnull Boolean isVoluntary) {
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


  public WorkerTerminationBody severance(@javax.annotation.Nonnull WorkerTerminationBodySeverance severance) {
    this.severance = severance;
    return this;
  }

  /**
   * Get severance
   * @return severance
   */
  @javax.annotation.Nonnull
  public WorkerTerminationBodySeverance getSeverance() {
    return severance;
  }

  public void setSeverance(@javax.annotation.Nonnull WorkerTerminationBodySeverance severance) {
    this.severance = severance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerTerminationBody workerTerminationBody = (WorkerTerminationBody) o;
    return Objects.equals(this.desiredEndDate, workerTerminationBody.desiredEndDate) &&
        Objects.equals(this.lastDateOfWork, workerTerminationBody.lastDateOfWork) &&
        Objects.equals(this.message, workerTerminationBody.message) &&
        Objects.equals(this.isVoluntary, workerTerminationBody.isVoluntary) &&
        Objects.equals(this.severance, workerTerminationBody.severance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desiredEndDate, lastDateOfWork, message, isVoluntary, severance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerTerminationBody {\n");
    sb.append("    desiredEndDate: ").append(toIndentedString(desiredEndDate)).append("\n");
    sb.append("    lastDateOfWork: ").append(toIndentedString(lastDateOfWork)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    isVoluntary: ").append(toIndentedString(isVoluntary)).append("\n");
    sb.append("    severance: ").append(toIndentedString(severance)).append("\n");
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
    openapiFields.add("desired_end_date");
    openapiFields.add("last_date_of_work");
    openapiFields.add("message");
    openapiFields.add("is_voluntary");
    openapiFields.add("severance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("desired_end_date");
    openapiRequiredFields.add("last_date_of_work");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("is_voluntary");
    openapiRequiredFields.add("severance");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkerTerminationBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkerTerminationBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkerTerminationBody is not found in the empty JSON string", WorkerTerminationBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkerTerminationBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkerTerminationBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkerTerminationBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the required field `severance`
      WorkerTerminationBodySeverance.validateJsonElement(jsonObj.get("severance"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkerTerminationBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkerTerminationBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkerTerminationBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkerTerminationBody.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkerTerminationBody>() {
           @Override
           public void write(JsonWriter out, WorkerTerminationBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkerTerminationBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkerTerminationBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkerTerminationBody
   * @throws IOException if the JSON string is invalid with respect to WorkerTerminationBody
   */
  public static WorkerTerminationBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkerTerminationBody.class);
  }

  /**
   * Convert an instance of WorkerTerminationBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

