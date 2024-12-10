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
import org.openapitools.client.model.UpdateShift200ResponseDataMetaBreaksInnerEnd;
import org.openapitools.client.model.UpdateShift200ResponseDataMetaBreaksInnerStart;

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
 * UpdateShift200ResponseDataMetaBreaksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T19:12:08.356438549Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateShift200ResponseDataMetaBreaksInner {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  @javax.annotation.Nullable
  private UpdateShift200ResponseDataMetaBreaksInnerEnd end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  @javax.annotation.Nullable
  private UpdateShift200ResponseDataMetaBreaksInnerStart start;

  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  @javax.annotation.Nullable
  private Boolean isPaid;

  public UpdateShift200ResponseDataMetaBreaksInner() {
  }

  public UpdateShift200ResponseDataMetaBreaksInner end(@javax.annotation.Nullable UpdateShift200ResponseDataMetaBreaksInnerEnd end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @javax.annotation.Nullable
  public UpdateShift200ResponseDataMetaBreaksInnerEnd getEnd() {
    return end;
  }

  public void setEnd(@javax.annotation.Nullable UpdateShift200ResponseDataMetaBreaksInnerEnd end) {
    this.end = end;
  }


  public UpdateShift200ResponseDataMetaBreaksInner start(@javax.annotation.Nullable UpdateShift200ResponseDataMetaBreaksInnerStart start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @javax.annotation.Nullable
  public UpdateShift200ResponseDataMetaBreaksInnerStart getStart() {
    return start;
  }

  public void setStart(@javax.annotation.Nullable UpdateShift200ResponseDataMetaBreaksInnerStart start) {
    this.start = start;
  }


  public UpdateShift200ResponseDataMetaBreaksInner isPaid(@javax.annotation.Nullable Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  /**
   * Is break paid.
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
    UpdateShift200ResponseDataMetaBreaksInner updateShift200ResponseDataMetaBreaksInner = (UpdateShift200ResponseDataMetaBreaksInner) o;
    return Objects.equals(this.end, updateShift200ResponseDataMetaBreaksInner.end) &&
        Objects.equals(this.start, updateShift200ResponseDataMetaBreaksInner.start) &&
        Objects.equals(this.isPaid, updateShift200ResponseDataMetaBreaksInner.isPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, isPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShift200ResponseDataMetaBreaksInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to UpdateShift200ResponseDataMetaBreaksInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateShift200ResponseDataMetaBreaksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateShift200ResponseDataMetaBreaksInner is not found in the empty JSON string", UpdateShift200ResponseDataMetaBreaksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateShift200ResponseDataMetaBreaksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateShift200ResponseDataMetaBreaksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `end`
      if (jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) {
        UpdateShift200ResponseDataMetaBreaksInnerEnd.validateJsonElement(jsonObj.get("end"));
      }
      // validate the optional field `start`
      if (jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) {
        UpdateShift200ResponseDataMetaBreaksInnerStart.validateJsonElement(jsonObj.get("start"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateShift200ResponseDataMetaBreaksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateShift200ResponseDataMetaBreaksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateShift200ResponseDataMetaBreaksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateShift200ResponseDataMetaBreaksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateShift200ResponseDataMetaBreaksInner>() {
           @Override
           public void write(JsonWriter out, UpdateShift200ResponseDataMetaBreaksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateShift200ResponseDataMetaBreaksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateShift200ResponseDataMetaBreaksInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateShift200ResponseDataMetaBreaksInner
   * @throws IOException if the JSON string is invalid with respect to UpdateShift200ResponseDataMetaBreaksInner
   */
  public static UpdateShift200ResponseDataMetaBreaksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateShift200ResponseDataMetaBreaksInner.class);
  }

  /**
   * Convert an instance of UpdateShift200ResponseDataMetaBreaksInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

