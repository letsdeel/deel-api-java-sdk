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
import java.time.OffsetDateTime;
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
 * The last payment cycle.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T14:19:15.487453130Z[GMT]", comments = "Generator version: 7.10.0")
public class FinalPaymentCalculatedLastCycle {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  @javax.annotation.Nullable
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  @javax.annotation.Nullable
  private OffsetDateTime end;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "completion_date";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime completionDate;

  public FinalPaymentCalculatedLastCycle() {
  }

  public FinalPaymentCalculatedLastCycle start(@javax.annotation.Nullable OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return start
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(@javax.annotation.Nullable OffsetDateTime start) {
    this.start = start;
  }


  public FinalPaymentCalculatedLastCycle end(@javax.annotation.Nullable OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return end
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(@javax.annotation.Nullable OffsetDateTime end) {
    this.end = end;
  }


  public FinalPaymentCalculatedLastCycle completionDate(@javax.annotation.Nullable OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return completionDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(@javax.annotation.Nullable OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinalPaymentCalculatedLastCycle finalPaymentCalculatedLastCycle = (FinalPaymentCalculatedLastCycle) o;
    return Objects.equals(this.start, finalPaymentCalculatedLastCycle.start) &&
        Objects.equals(this.end, finalPaymentCalculatedLastCycle.end) &&
        Objects.equals(this.completionDate, finalPaymentCalculatedLastCycle.completionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, completionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalPaymentCalculatedLastCycle {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
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
    openapiFields.add("completion_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FinalPaymentCalculatedLastCycle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FinalPaymentCalculatedLastCycle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinalPaymentCalculatedLastCycle is not found in the empty JSON string", FinalPaymentCalculatedLastCycle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FinalPaymentCalculatedLastCycle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinalPaymentCalculatedLastCycle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinalPaymentCalculatedLastCycle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinalPaymentCalculatedLastCycle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinalPaymentCalculatedLastCycle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinalPaymentCalculatedLastCycle.class));

       return (TypeAdapter<T>) new TypeAdapter<FinalPaymentCalculatedLastCycle>() {
           @Override
           public void write(JsonWriter out, FinalPaymentCalculatedLastCycle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinalPaymentCalculatedLastCycle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FinalPaymentCalculatedLastCycle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FinalPaymentCalculatedLastCycle
   * @throws IOException if the JSON string is invalid with respect to FinalPaymentCalculatedLastCycle
   */
  public static FinalPaymentCalculatedLastCycle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinalPaymentCalculatedLastCycle.class);
  }

  /**
   * Convert an instance of FinalPaymentCalculatedLastCycle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

