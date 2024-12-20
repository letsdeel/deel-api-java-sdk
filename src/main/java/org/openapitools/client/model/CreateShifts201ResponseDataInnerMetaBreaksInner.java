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
import org.openapitools.client.model.CreateShifts201ResponseDataInnerMetaBreaksInnerEnd;
import org.openapitools.client.model.CreateShifts201ResponseDataInnerMetaBreaksInnerStart;

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
 * CreateShifts201ResponseDataInnerMetaBreaksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T13:30:34.884345844Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateShifts201ResponseDataInnerMetaBreaksInner {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  @javax.annotation.Nullable
  private CreateShifts201ResponseDataInnerMetaBreaksInnerEnd end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  @javax.annotation.Nullable
  private CreateShifts201ResponseDataInnerMetaBreaksInnerStart start;

  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  @javax.annotation.Nullable
  private Boolean isPaid;

  public CreateShifts201ResponseDataInnerMetaBreaksInner() {
  }

  public CreateShifts201ResponseDataInnerMetaBreaksInner end(@javax.annotation.Nullable CreateShifts201ResponseDataInnerMetaBreaksInnerEnd end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @javax.annotation.Nullable
  public CreateShifts201ResponseDataInnerMetaBreaksInnerEnd getEnd() {
    return end;
  }

  public void setEnd(@javax.annotation.Nullable CreateShifts201ResponseDataInnerMetaBreaksInnerEnd end) {
    this.end = end;
  }


  public CreateShifts201ResponseDataInnerMetaBreaksInner start(@javax.annotation.Nullable CreateShifts201ResponseDataInnerMetaBreaksInnerStart start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @javax.annotation.Nullable
  public CreateShifts201ResponseDataInnerMetaBreaksInnerStart getStart() {
    return start;
  }

  public void setStart(@javax.annotation.Nullable CreateShifts201ResponseDataInnerMetaBreaksInnerStart start) {
    this.start = start;
  }


  public CreateShifts201ResponseDataInnerMetaBreaksInner isPaid(@javax.annotation.Nullable Boolean isPaid) {
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
    CreateShifts201ResponseDataInnerMetaBreaksInner createShifts201ResponseDataInnerMetaBreaksInner = (CreateShifts201ResponseDataInnerMetaBreaksInner) o;
    return Objects.equals(this.end, createShifts201ResponseDataInnerMetaBreaksInner.end) &&
        Objects.equals(this.start, createShifts201ResponseDataInnerMetaBreaksInner.start) &&
        Objects.equals(this.isPaid, createShifts201ResponseDataInnerMetaBreaksInner.isPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, isPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShifts201ResponseDataInnerMetaBreaksInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to CreateShifts201ResponseDataInnerMetaBreaksInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateShifts201ResponseDataInnerMetaBreaksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateShifts201ResponseDataInnerMetaBreaksInner is not found in the empty JSON string", CreateShifts201ResponseDataInnerMetaBreaksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateShifts201ResponseDataInnerMetaBreaksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateShifts201ResponseDataInnerMetaBreaksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `end`
      if (jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) {
        CreateShifts201ResponseDataInnerMetaBreaksInnerEnd.validateJsonElement(jsonObj.get("end"));
      }
      // validate the optional field `start`
      if (jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) {
        CreateShifts201ResponseDataInnerMetaBreaksInnerStart.validateJsonElement(jsonObj.get("start"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateShifts201ResponseDataInnerMetaBreaksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateShifts201ResponseDataInnerMetaBreaksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateShifts201ResponseDataInnerMetaBreaksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateShifts201ResponseDataInnerMetaBreaksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateShifts201ResponseDataInnerMetaBreaksInner>() {
           @Override
           public void write(JsonWriter out, CreateShifts201ResponseDataInnerMetaBreaksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateShifts201ResponseDataInnerMetaBreaksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateShifts201ResponseDataInnerMetaBreaksInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateShifts201ResponseDataInnerMetaBreaksInner
   * @throws IOException if the JSON string is invalid with respect to CreateShifts201ResponseDataInnerMetaBreaksInner
   */
  public static CreateShifts201ResponseDataInnerMetaBreaksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateShifts201ResponseDataInnerMetaBreaksInner.class);
  }

  /**
   * Convert an instance of CreateShifts201ResponseDataInnerMetaBreaksInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

