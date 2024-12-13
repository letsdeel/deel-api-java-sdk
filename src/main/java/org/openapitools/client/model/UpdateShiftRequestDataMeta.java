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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.UpdateShiftRequestDataMetaBreaksInner;
import org.openapitools.client.model.UpdateShiftRequestDataMetaEnd;
import org.openapitools.client.model.UpdateShiftRequestDataMetaStart;

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
 * UpdateShiftRequestDataMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T11:33:27.931295037Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateShiftRequestDataMeta {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  @javax.annotation.Nullable
  private UpdateShiftRequestDataMetaEnd end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  @javax.annotation.Nullable
  private UpdateShiftRequestDataMetaStart start;

  public static final String SERIALIZED_NAME_BREAKS = "breaks";
  @SerializedName(SERIALIZED_NAME_BREAKS)
  @javax.annotation.Nullable
  private List<UpdateShiftRequestDataMetaBreaksInner> breaks = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPROVAL_DATE = "approval_date";
  @SerializedName(SERIALIZED_NAME_APPROVAL_DATE)
  @javax.annotation.Nullable
  private String approvalDate;

  public UpdateShiftRequestDataMeta() {
  }

  public UpdateShiftRequestDataMeta end(@javax.annotation.Nullable UpdateShiftRequestDataMetaEnd end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @javax.annotation.Nullable
  public UpdateShiftRequestDataMetaEnd getEnd() {
    return end;
  }

  public void setEnd(@javax.annotation.Nullable UpdateShiftRequestDataMetaEnd end) {
    this.end = end;
  }


  public UpdateShiftRequestDataMeta start(@javax.annotation.Nullable UpdateShiftRequestDataMetaStart start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @javax.annotation.Nullable
  public UpdateShiftRequestDataMetaStart getStart() {
    return start;
  }

  public void setStart(@javax.annotation.Nullable UpdateShiftRequestDataMetaStart start) {
    this.start = start;
  }


  public UpdateShiftRequestDataMeta breaks(@javax.annotation.Nullable List<UpdateShiftRequestDataMetaBreaksInner> breaks) {
    this.breaks = breaks;
    return this;
  }

  public UpdateShiftRequestDataMeta addBreaksItem(UpdateShiftRequestDataMetaBreaksInner breaksItem) {
    if (this.breaks == null) {
      this.breaks = new ArrayList<>();
    }
    this.breaks.add(breaksItem);
    return this;
  }

  /**
   * Get breaks
   * @return breaks
   */
  @javax.annotation.Nullable
  public List<UpdateShiftRequestDataMetaBreaksInner> getBreaks() {
    return breaks;
  }

  public void setBreaks(@javax.annotation.Nullable List<UpdateShiftRequestDataMetaBreaksInner> breaks) {
    this.breaks = breaks;
  }


  public UpdateShiftRequestDataMeta approvalDate(@javax.annotation.Nullable String approvalDate) {
    this.approvalDate = approvalDate;
    return this;
  }

  /**
   * The approval date for the shift.
   * @return approvalDate
   */
  @javax.annotation.Nullable
  public String getApprovalDate() {
    return approvalDate;
  }

  public void setApprovalDate(@javax.annotation.Nullable String approvalDate) {
    this.approvalDate = approvalDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShiftRequestDataMeta updateShiftRequestDataMeta = (UpdateShiftRequestDataMeta) o;
    return Objects.equals(this.end, updateShiftRequestDataMeta.end) &&
        Objects.equals(this.start, updateShiftRequestDataMeta.start) &&
        Objects.equals(this.breaks, updateShiftRequestDataMeta.breaks) &&
        Objects.equals(this.approvalDate, updateShiftRequestDataMeta.approvalDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, breaks, approvalDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShiftRequestDataMeta {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    breaks: ").append(toIndentedString(breaks)).append("\n");
    sb.append("    approvalDate: ").append(toIndentedString(approvalDate)).append("\n");
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
    openapiFields.add("breaks");
    openapiFields.add("approval_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateShiftRequestDataMeta
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateShiftRequestDataMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateShiftRequestDataMeta is not found in the empty JSON string", UpdateShiftRequestDataMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateShiftRequestDataMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateShiftRequestDataMeta` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `end`
      if (jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) {
        UpdateShiftRequestDataMetaEnd.validateJsonElement(jsonObj.get("end"));
      }
      // validate the optional field `start`
      if (jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) {
        UpdateShiftRequestDataMetaStart.validateJsonElement(jsonObj.get("start"));
      }
      if (jsonObj.get("breaks") != null && !jsonObj.get("breaks").isJsonNull()) {
        JsonArray jsonArraybreaks = jsonObj.getAsJsonArray("breaks");
        if (jsonArraybreaks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("breaks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `breaks` to be an array in the JSON string but got `%s`", jsonObj.get("breaks").toString()));
          }

          // validate the optional field `breaks` (array)
          for (int i = 0; i < jsonArraybreaks.size(); i++) {
            UpdateShiftRequestDataMetaBreaksInner.validateJsonElement(jsonArraybreaks.get(i));
          };
        }
      }
      if ((jsonObj.get("approval_date") != null && !jsonObj.get("approval_date").isJsonNull()) && !jsonObj.get("approval_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approval_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approval_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateShiftRequestDataMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateShiftRequestDataMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateShiftRequestDataMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateShiftRequestDataMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateShiftRequestDataMeta>() {
           @Override
           public void write(JsonWriter out, UpdateShiftRequestDataMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateShiftRequestDataMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateShiftRequestDataMeta given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateShiftRequestDataMeta
   * @throws IOException if the JSON string is invalid with respect to UpdateShiftRequestDataMeta
   */
  public static UpdateShiftRequestDataMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateShiftRequestDataMeta.class);
  }

  /**
   * Convert an instance of UpdateShiftRequestDataMeta to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

