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
import org.openapitools.client.model.UpdateShiftRequestDataMetaBreaksInnerEnd;
import org.openapitools.client.model.UpdateShiftRequestDataMetaBreaksInnerStart;

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
 * UpdateShiftRequestDataMetaBreaksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T15:39:23.803918573Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateShiftRequestDataMetaBreaksInner {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  @javax.annotation.Nullable
  private UpdateShiftRequestDataMetaBreaksInnerEnd end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  @javax.annotation.Nullable
  private UpdateShiftRequestDataMetaBreaksInnerStart start;

  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  @javax.annotation.Nullable
  private Boolean isPaid;

  public UpdateShiftRequestDataMetaBreaksInner() {
  }

  public UpdateShiftRequestDataMetaBreaksInner end(@javax.annotation.Nullable UpdateShiftRequestDataMetaBreaksInnerEnd end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @javax.annotation.Nullable
  public UpdateShiftRequestDataMetaBreaksInnerEnd getEnd() {
    return end;
  }

  public void setEnd(@javax.annotation.Nullable UpdateShiftRequestDataMetaBreaksInnerEnd end) {
    this.end = end;
  }


  public UpdateShiftRequestDataMetaBreaksInner start(@javax.annotation.Nullable UpdateShiftRequestDataMetaBreaksInnerStart start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @javax.annotation.Nullable
  public UpdateShiftRequestDataMetaBreaksInnerStart getStart() {
    return start;
  }

  public void setStart(@javax.annotation.Nullable UpdateShiftRequestDataMetaBreaksInnerStart start) {
    this.start = start;
  }


  public UpdateShiftRequestDataMetaBreaksInner isPaid(@javax.annotation.Nullable Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  /**
   * Indicates if the break is paid.
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
    UpdateShiftRequestDataMetaBreaksInner updateShiftRequestDataMetaBreaksInner = (UpdateShiftRequestDataMetaBreaksInner) o;
    return Objects.equals(this.end, updateShiftRequestDataMetaBreaksInner.end) &&
        Objects.equals(this.start, updateShiftRequestDataMetaBreaksInner.start) &&
        Objects.equals(this.isPaid, updateShiftRequestDataMetaBreaksInner.isPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, isPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShiftRequestDataMetaBreaksInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to UpdateShiftRequestDataMetaBreaksInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateShiftRequestDataMetaBreaksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateShiftRequestDataMetaBreaksInner is not found in the empty JSON string", UpdateShiftRequestDataMetaBreaksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateShiftRequestDataMetaBreaksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateShiftRequestDataMetaBreaksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `end`
      if (jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) {
        UpdateShiftRequestDataMetaBreaksInnerEnd.validateJsonElement(jsonObj.get("end"));
      }
      // validate the optional field `start`
      if (jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) {
        UpdateShiftRequestDataMetaBreaksInnerStart.validateJsonElement(jsonObj.get("start"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateShiftRequestDataMetaBreaksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateShiftRequestDataMetaBreaksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateShiftRequestDataMetaBreaksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateShiftRequestDataMetaBreaksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateShiftRequestDataMetaBreaksInner>() {
           @Override
           public void write(JsonWriter out, UpdateShiftRequestDataMetaBreaksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateShiftRequestDataMetaBreaksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateShiftRequestDataMetaBreaksInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateShiftRequestDataMetaBreaksInner
   * @throws IOException if the JSON string is invalid with respect to UpdateShiftRequestDataMetaBreaksInner
   */
  public static UpdateShiftRequestDataMetaBreaksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateShiftRequestDataMetaBreaksInner.class);
  }

  /**
   * Convert an instance of UpdateShiftRequestDataMetaBreaksInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

