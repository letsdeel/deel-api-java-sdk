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
import org.openapitools.client.model.UpdateShift200ResponseDataMetaBreaksInner;
import org.openapitools.client.model.UpdateShift200ResponseDataMetaEnd;
import org.openapitools.client.model.UpdateShift200ResponseDataMetaStart;

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
 * UpdateShift200ResponseDataMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T13:30:33.173921421Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateShift200ResponseDataMeta {
  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  @javax.annotation.Nullable
  private UpdateShift200ResponseDataMetaEnd end;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  @javax.annotation.Nullable
  private UpdateShift200ResponseDataMetaStart start;

  public static final String SERIALIZED_NAME_BREAKS = "breaks";
  @SerializedName(SERIALIZED_NAME_BREAKS)
  @javax.annotation.Nullable
  private List<UpdateShift200ResponseDataMetaBreaksInner> breaks = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPROVAL_DATE = "approval_date";
  @SerializedName(SERIALIZED_NAME_APPROVAL_DATE)
  @javax.annotation.Nullable
  private String approvalDate;

  public UpdateShift200ResponseDataMeta() {
  }

  public UpdateShift200ResponseDataMeta end(@javax.annotation.Nullable UpdateShift200ResponseDataMetaEnd end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @javax.annotation.Nullable
  public UpdateShift200ResponseDataMetaEnd getEnd() {
    return end;
  }

  public void setEnd(@javax.annotation.Nullable UpdateShift200ResponseDataMetaEnd end) {
    this.end = end;
  }


  public UpdateShift200ResponseDataMeta start(@javax.annotation.Nullable UpdateShift200ResponseDataMetaStart start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @javax.annotation.Nullable
  public UpdateShift200ResponseDataMetaStart getStart() {
    return start;
  }

  public void setStart(@javax.annotation.Nullable UpdateShift200ResponseDataMetaStart start) {
    this.start = start;
  }


  public UpdateShift200ResponseDataMeta breaks(@javax.annotation.Nullable List<UpdateShift200ResponseDataMetaBreaksInner> breaks) {
    this.breaks = breaks;
    return this;
  }

  public UpdateShift200ResponseDataMeta addBreaksItem(UpdateShift200ResponseDataMetaBreaksInner breaksItem) {
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
  public List<UpdateShift200ResponseDataMetaBreaksInner> getBreaks() {
    return breaks;
  }

  public void setBreaks(@javax.annotation.Nullable List<UpdateShift200ResponseDataMetaBreaksInner> breaks) {
    this.breaks = breaks;
  }


  public UpdateShift200ResponseDataMeta approvalDate(@javax.annotation.Nullable String approvalDate) {
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
    UpdateShift200ResponseDataMeta updateShift200ResponseDataMeta = (UpdateShift200ResponseDataMeta) o;
    return Objects.equals(this.end, updateShift200ResponseDataMeta.end) &&
        Objects.equals(this.start, updateShift200ResponseDataMeta.start) &&
        Objects.equals(this.breaks, updateShift200ResponseDataMeta.breaks) &&
        Objects.equals(this.approvalDate, updateShift200ResponseDataMeta.approvalDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, breaks, approvalDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShift200ResponseDataMeta {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to UpdateShift200ResponseDataMeta
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateShift200ResponseDataMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateShift200ResponseDataMeta is not found in the empty JSON string", UpdateShift200ResponseDataMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateShift200ResponseDataMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateShift200ResponseDataMeta` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `end`
      if (jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) {
        UpdateShift200ResponseDataMetaEnd.validateJsonElement(jsonObj.get("end"));
      }
      // validate the optional field `start`
      if (jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) {
        UpdateShift200ResponseDataMetaStart.validateJsonElement(jsonObj.get("start"));
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
            UpdateShift200ResponseDataMetaBreaksInner.validateJsonElement(jsonArraybreaks.get(i));
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
       if (!UpdateShift200ResponseDataMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateShift200ResponseDataMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateShift200ResponseDataMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateShift200ResponseDataMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateShift200ResponseDataMeta>() {
           @Override
           public void write(JsonWriter out, UpdateShift200ResponseDataMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateShift200ResponseDataMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateShift200ResponseDataMeta given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateShift200ResponseDataMeta
   * @throws IOException if the JSON string is invalid with respect to UpdateShift200ResponseDataMeta
   */
  public static UpdateShift200ResponseDataMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateShift200ResponseDataMeta.class);
  }

  /**
   * Convert an instance of UpdateShift200ResponseDataMeta to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

