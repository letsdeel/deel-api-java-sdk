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
import org.openapitools.client.model.CreateShiftsRequestDataShiftsInnerMetaBreaksInnerEnd;
import org.openapitools.client.model.CreateShiftsRequestDataShiftsInnerMetaBreaksInnerStart;

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
 * CreateShiftsRequestDataShiftsInnerMetaBreaksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateShiftsRequestDataShiftsInnerMetaBreaksInner {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  @javax.annotation.Nullable
  private CreateShiftsRequestDataShiftsInnerMetaBreaksInnerEnd end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  @javax.annotation.Nullable
  private CreateShiftsRequestDataShiftsInnerMetaBreaksInnerStart start;

  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  @javax.annotation.Nullable
  private Boolean isPaid;

  public CreateShiftsRequestDataShiftsInnerMetaBreaksInner() {
  }

  public CreateShiftsRequestDataShiftsInnerMetaBreaksInner end(@javax.annotation.Nullable CreateShiftsRequestDataShiftsInnerMetaBreaksInnerEnd end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @javax.annotation.Nullable
  public CreateShiftsRequestDataShiftsInnerMetaBreaksInnerEnd getEnd() {
    return end;
  }

  public void setEnd(@javax.annotation.Nullable CreateShiftsRequestDataShiftsInnerMetaBreaksInnerEnd end) {
    this.end = end;
  }


  public CreateShiftsRequestDataShiftsInnerMetaBreaksInner start(@javax.annotation.Nullable CreateShiftsRequestDataShiftsInnerMetaBreaksInnerStart start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @javax.annotation.Nullable
  public CreateShiftsRequestDataShiftsInnerMetaBreaksInnerStart getStart() {
    return start;
  }

  public void setStart(@javax.annotation.Nullable CreateShiftsRequestDataShiftsInnerMetaBreaksInnerStart start) {
    this.start = start;
  }


  public CreateShiftsRequestDataShiftsInnerMetaBreaksInner isPaid(@javax.annotation.Nullable Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  /**
   * Is break paid
   * @return isPaid
   */
  @javax.annotation.Nullable
  public Boolean getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(@javax.annotation.Nullable Boolean isPaid) {
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
    CreateShiftsRequestDataShiftsInnerMetaBreaksInner createShiftsRequestDataShiftsInnerMetaBreaksInner = (CreateShiftsRequestDataShiftsInnerMetaBreaksInner) o;
    return Objects.equals(this.end, createShiftsRequestDataShiftsInnerMetaBreaksInner.end) &&
        Objects.equals(this.start, createShiftsRequestDataShiftsInnerMetaBreaksInner.start) &&
        Objects.equals(this.isPaid, createShiftsRequestDataShiftsInnerMetaBreaksInner.isPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, isPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShiftsRequestDataShiftsInnerMetaBreaksInner {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
    openapiFields.add("end");
    openapiFields.add("start");
    openapiFields.add("is_paid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateShiftsRequestDataShiftsInnerMetaBreaksInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateShiftsRequestDataShiftsInnerMetaBreaksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateShiftsRequestDataShiftsInnerMetaBreaksInner is not found in the empty JSON string", CreateShiftsRequestDataShiftsInnerMetaBreaksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateShiftsRequestDataShiftsInnerMetaBreaksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateShiftsRequestDataShiftsInnerMetaBreaksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `end`
      if (jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) {
        CreateShiftsRequestDataShiftsInnerMetaBreaksInnerEnd.validateJsonElement(jsonObj.get("end"));
      }
      // validate the optional field `start`
      if (jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) {
        CreateShiftsRequestDataShiftsInnerMetaBreaksInnerStart.validateJsonElement(jsonObj.get("start"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateShiftsRequestDataShiftsInnerMetaBreaksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateShiftsRequestDataShiftsInnerMetaBreaksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateShiftsRequestDataShiftsInnerMetaBreaksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateShiftsRequestDataShiftsInnerMetaBreaksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateShiftsRequestDataShiftsInnerMetaBreaksInner>() {
           @Override
           public void write(JsonWriter out, CreateShiftsRequestDataShiftsInnerMetaBreaksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateShiftsRequestDataShiftsInnerMetaBreaksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateShiftsRequestDataShiftsInnerMetaBreaksInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateShiftsRequestDataShiftsInnerMetaBreaksInner
   * @throws IOException if the JSON string is invalid with respect to CreateShiftsRequestDataShiftsInnerMetaBreaksInner
   */
  public static CreateShiftsRequestDataShiftsInnerMetaBreaksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateShiftsRequestDataShiftsInnerMetaBreaksInner.class);
  }

  /**
   * Convert an instance of CreateShiftsRequestDataShiftsInnerMetaBreaksInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

