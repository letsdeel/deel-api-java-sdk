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
 * UpdateShiftRequestDataMetaEnd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:17:35.281321822Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateShiftRequestDataMetaEnd {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nullable
  private String date;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  @javax.annotation.Nullable
  private String time;

  public static final String SERIALIZED_NAME_IS_REST_DAY = "is_rest_day";
  @SerializedName(SERIALIZED_NAME_IS_REST_DAY)
  @javax.annotation.Nullable
  private Boolean isRestDay;

  public static final String SERIALIZED_NAME_IS_PUBLIC_HOLIDAY = "is_public_holiday";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC_HOLIDAY)
  @javax.annotation.Nullable
  private Boolean isPublicHoliday;

  public UpdateShiftRequestDataMetaEnd() {
  }

  public UpdateShiftRequestDataMetaEnd date(@javax.annotation.Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * End date of shift.
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nullable String date) {
    this.date = date;
  }


  public UpdateShiftRequestDataMetaEnd time(@javax.annotation.Nullable String time) {
    this.time = time;
    return this;
  }

  /**
   * End time of shift.
   * @return time
   */
  @javax.annotation.Nullable
  public String getTime() {
    return time;
  }

  public void setTime(@javax.annotation.Nullable String time) {
    this.time = time;
  }


  public UpdateShiftRequestDataMetaEnd isRestDay(@javax.annotation.Nullable Boolean isRestDay) {
    this.isRestDay = isRestDay;
    return this;
  }

  /**
   * Indicates if the shift ends on a rest day.
   * @return isRestDay
   */
  @javax.annotation.Nullable
  public Boolean getIsRestDay() {
    return isRestDay;
  }

  public void setIsRestDay(@javax.annotation.Nullable Boolean isRestDay) {
    this.isRestDay = isRestDay;
  }


  public UpdateShiftRequestDataMetaEnd isPublicHoliday(@javax.annotation.Nullable Boolean isPublicHoliday) {
    this.isPublicHoliday = isPublicHoliday;
    return this;
  }

  /**
   * Indicates if the shift ends on a public holiday.
   * @return isPublicHoliday
   */
  @javax.annotation.Nullable
  public Boolean getIsPublicHoliday() {
    return isPublicHoliday;
  }

  public void setIsPublicHoliday(@javax.annotation.Nullable Boolean isPublicHoliday) {
    this.isPublicHoliday = isPublicHoliday;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShiftRequestDataMetaEnd updateShiftRequestDataMetaEnd = (UpdateShiftRequestDataMetaEnd) o;
    return Objects.equals(this.date, updateShiftRequestDataMetaEnd.date) &&
        Objects.equals(this.time, updateShiftRequestDataMetaEnd.time) &&
        Objects.equals(this.isRestDay, updateShiftRequestDataMetaEnd.isRestDay) &&
        Objects.equals(this.isPublicHoliday, updateShiftRequestDataMetaEnd.isPublicHoliday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, time, isRestDay, isPublicHoliday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShiftRequestDataMetaEnd {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    isRestDay: ").append(toIndentedString(isRestDay)).append("\n");
    sb.append("    isPublicHoliday: ").append(toIndentedString(isPublicHoliday)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("time");
    openapiFields.add("is_rest_day");
    openapiFields.add("is_public_holiday");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateShiftRequestDataMetaEnd
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateShiftRequestDataMetaEnd.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateShiftRequestDataMetaEnd is not found in the empty JSON string", UpdateShiftRequestDataMetaEnd.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateShiftRequestDataMetaEnd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateShiftRequestDataMetaEnd` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("time") != null && !jsonObj.get("time").isJsonNull()) && !jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateShiftRequestDataMetaEnd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateShiftRequestDataMetaEnd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateShiftRequestDataMetaEnd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateShiftRequestDataMetaEnd.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateShiftRequestDataMetaEnd>() {
           @Override
           public void write(JsonWriter out, UpdateShiftRequestDataMetaEnd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateShiftRequestDataMetaEnd read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateShiftRequestDataMetaEnd given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateShiftRequestDataMetaEnd
   * @throws IOException if the JSON string is invalid with respect to UpdateShiftRequestDataMetaEnd
   */
  public static UpdateShiftRequestDataMetaEnd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateShiftRequestDataMetaEnd.class);
  }

  /**
   * Convert an instance of UpdateShiftRequestDataMetaEnd to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

