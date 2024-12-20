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
import org.openapitools.client.model.TimeTrackingShiftMetaSchemaBreaksInnerEnd;
import org.openapitools.client.model.TimeTrackingShiftMetaSchemaBreaksInnerStart;

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
 * TimeTrackingShiftMetaSchemaBreaksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T14:19:15.487453130Z[GMT]", comments = "Generator version: 7.10.0")
public class TimeTrackingShiftMetaSchemaBreaksInner {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  @javax.annotation.Nonnull
  private TimeTrackingShiftMetaSchemaBreaksInnerStart start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  @javax.annotation.Nonnull
  private TimeTrackingShiftMetaSchemaBreaksInnerEnd end;

  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  @javax.annotation.Nonnull
  private Boolean isPaid;

  public TimeTrackingShiftMetaSchemaBreaksInner() {
  }

  public TimeTrackingShiftMetaSchemaBreaksInner start(@javax.annotation.Nonnull TimeTrackingShiftMetaSchemaBreaksInnerStart start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @javax.annotation.Nonnull
  public TimeTrackingShiftMetaSchemaBreaksInnerStart getStart() {
    return start;
  }

  public void setStart(@javax.annotation.Nonnull TimeTrackingShiftMetaSchemaBreaksInnerStart start) {
    this.start = start;
  }


  public TimeTrackingShiftMetaSchemaBreaksInner end(@javax.annotation.Nonnull TimeTrackingShiftMetaSchemaBreaksInnerEnd end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @javax.annotation.Nonnull
  public TimeTrackingShiftMetaSchemaBreaksInnerEnd getEnd() {
    return end;
  }

  public void setEnd(@javax.annotation.Nonnull TimeTrackingShiftMetaSchemaBreaksInnerEnd end) {
    this.end = end;
  }


  public TimeTrackingShiftMetaSchemaBreaksInner isPaid(@javax.annotation.Nonnull Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  /**
   * Indicates if the break is paid
   * @return isPaid
   */
  @javax.annotation.Nonnull
  public Boolean getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(@javax.annotation.Nonnull Boolean isPaid) {
    this.isPaid = isPaid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingShiftMetaSchemaBreaksInner timeTrackingShiftMetaSchemaBreaksInner = (TimeTrackingShiftMetaSchemaBreaksInner) o;
    return Objects.equals(this.start, timeTrackingShiftMetaSchemaBreaksInner.start) &&
        Objects.equals(this.end, timeTrackingShiftMetaSchemaBreaksInner.end) &&
        Objects.equals(this.isPaid, timeTrackingShiftMetaSchemaBreaksInner.isPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, isPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingShiftMetaSchemaBreaksInner {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
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
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("is_paid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("end");
    openapiRequiredFields.add("is_paid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimeTrackingShiftMetaSchemaBreaksInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimeTrackingShiftMetaSchemaBreaksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeTrackingShiftMetaSchemaBreaksInner is not found in the empty JSON string", TimeTrackingShiftMetaSchemaBreaksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimeTrackingShiftMetaSchemaBreaksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeTrackingShiftMetaSchemaBreaksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeTrackingShiftMetaSchemaBreaksInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `start`
      TimeTrackingShiftMetaSchemaBreaksInnerStart.validateJsonElement(jsonObj.get("start"));
      // validate the required field `end`
      TimeTrackingShiftMetaSchemaBreaksInnerEnd.validateJsonElement(jsonObj.get("end"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeTrackingShiftMetaSchemaBreaksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeTrackingShiftMetaSchemaBreaksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeTrackingShiftMetaSchemaBreaksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeTrackingShiftMetaSchemaBreaksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeTrackingShiftMetaSchemaBreaksInner>() {
           @Override
           public void write(JsonWriter out, TimeTrackingShiftMetaSchemaBreaksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeTrackingShiftMetaSchemaBreaksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimeTrackingShiftMetaSchemaBreaksInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimeTrackingShiftMetaSchemaBreaksInner
   * @throws IOException if the JSON string is invalid with respect to TimeTrackingShiftMetaSchemaBreaksInner
   */
  public static TimeTrackingShiftMetaSchemaBreaksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeTrackingShiftMetaSchemaBreaksInner.class);
  }

  /**
   * Convert an instance of TimeTrackingShiftMetaSchemaBreaksInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

