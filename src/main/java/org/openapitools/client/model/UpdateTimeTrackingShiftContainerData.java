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
import org.openapitools.client.model.TimeTrackingShiftMetaSchema;
import org.openapitools.client.model.TimeTrackingShiftSummarySchema;

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
 * Data for the shift
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:25:45.183107737Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateTimeTrackingShiftContainerData {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_DATE_OF_WORK = "date_of_work";
  @SerializedName(SERIALIZED_NAME_DATE_OF_WORK)
  @javax.annotation.Nullable
  private String dateOfWork;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  @javax.annotation.Nullable
  private TimeTrackingShiftMetaSchema meta;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  @javax.annotation.Nullable
  private TimeTrackingShiftSummarySchema summary;

  public UpdateTimeTrackingShiftContainerData() {
  }

  public UpdateTimeTrackingShiftContainerData description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the shift
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public UpdateTimeTrackingShiftContainerData dateOfWork(@javax.annotation.Nullable String dateOfWork) {
    this.dateOfWork = dateOfWork;
    return this;
  }

  /**
   * Date of work in YYYY-MM-DD format
   * @return dateOfWork
   */
  @javax.annotation.Nullable
  public String getDateOfWork() {
    return dateOfWork;
  }

  public void setDateOfWork(@javax.annotation.Nullable String dateOfWork) {
    this.dateOfWork = dateOfWork;
  }


  public UpdateTimeTrackingShiftContainerData meta(@javax.annotation.Nullable TimeTrackingShiftMetaSchema meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  public TimeTrackingShiftMetaSchema getMeta() {
    return meta;
  }

  public void setMeta(@javax.annotation.Nullable TimeTrackingShiftMetaSchema meta) {
    this.meta = meta;
  }


  public UpdateTimeTrackingShiftContainerData summary(@javax.annotation.Nullable TimeTrackingShiftSummarySchema summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @javax.annotation.Nullable
  public TimeTrackingShiftSummarySchema getSummary() {
    return summary;
  }

  public void setSummary(@javax.annotation.Nullable TimeTrackingShiftSummarySchema summary) {
    this.summary = summary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTimeTrackingShiftContainerData updateTimeTrackingShiftContainerData = (UpdateTimeTrackingShiftContainerData) o;
    return Objects.equals(this.description, updateTimeTrackingShiftContainerData.description) &&
        Objects.equals(this.dateOfWork, updateTimeTrackingShiftContainerData.dateOfWork) &&
        Objects.equals(this.meta, updateTimeTrackingShiftContainerData.meta) &&
        Objects.equals(this.summary, updateTimeTrackingShiftContainerData.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dateOfWork, meta, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTimeTrackingShiftContainerData {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateOfWork: ").append(toIndentedString(dateOfWork)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("date_of_work");
    openapiFields.add("meta");
    openapiFields.add("summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateTimeTrackingShiftContainerData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateTimeTrackingShiftContainerData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTimeTrackingShiftContainerData is not found in the empty JSON string", UpdateTimeTrackingShiftContainerData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateTimeTrackingShiftContainerData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateTimeTrackingShiftContainerData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("date_of_work") != null && !jsonObj.get("date_of_work").isJsonNull()) && !jsonObj.get("date_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_work").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        TimeTrackingShiftMetaSchema.validateJsonElement(jsonObj.get("meta"));
      }
      // validate the optional field `summary`
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        TimeTrackingShiftSummarySchema.validateJsonElement(jsonObj.get("summary"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTimeTrackingShiftContainerData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTimeTrackingShiftContainerData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTimeTrackingShiftContainerData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTimeTrackingShiftContainerData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTimeTrackingShiftContainerData>() {
           @Override
           public void write(JsonWriter out, UpdateTimeTrackingShiftContainerData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTimeTrackingShiftContainerData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateTimeTrackingShiftContainerData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateTimeTrackingShiftContainerData
   * @throws IOException if the JSON string is invalid with respect to UpdateTimeTrackingShiftContainerData
   */
  public static UpdateTimeTrackingShiftContainerData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTimeTrackingShiftContainerData.class);
  }

  /**
   * Convert an instance of UpdateTimeTrackingShiftContainerData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

