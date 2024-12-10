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
import org.openapitools.client.model.UpdateShiftRequestDataMeta;

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
 * UpdateShiftRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T19:12:08.356438549Z[GMT]", comments = "Generator version: 7.10.0")
public class UpdateShiftRequestData {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  @javax.annotation.Nullable
  private UpdateShiftRequestDataMeta meta;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_DATE_OF_WORK = "date_of_work";
  @SerializedName(SERIALIZED_NAME_DATE_OF_WORK)
  @javax.annotation.Nullable
  private String dateOfWork;

  public UpdateShiftRequestData() {
  }

  public UpdateShiftRequestData meta(@javax.annotation.Nullable UpdateShiftRequestDataMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nullable
  public UpdateShiftRequestDataMeta getMeta() {
    return meta;
  }

  public void setMeta(@javax.annotation.Nullable UpdateShiftRequestDataMeta meta) {
    this.meta = meta;
  }


  public UpdateShiftRequestData description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the shift.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public UpdateShiftRequestData dateOfWork(@javax.annotation.Nullable String dateOfWork) {
    this.dateOfWork = dateOfWork;
    return this;
  }

  /**
   * The date of the shift.
   * @return dateOfWork
   */
  @javax.annotation.Nullable
  public String getDateOfWork() {
    return dateOfWork;
  }

  public void setDateOfWork(@javax.annotation.Nullable String dateOfWork) {
    this.dateOfWork = dateOfWork;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShiftRequestData updateShiftRequestData = (UpdateShiftRequestData) o;
    return Objects.equals(this.meta, updateShiftRequestData.meta) &&
        Objects.equals(this.description, updateShiftRequestData.description) &&
        Objects.equals(this.dateOfWork, updateShiftRequestData.dateOfWork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, description, dateOfWork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShiftRequestData {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateOfWork: ").append(toIndentedString(dateOfWork)).append("\n");
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
    openapiFields.add("meta");
    openapiFields.add("description");
    openapiFields.add("date_of_work");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateShiftRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateShiftRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateShiftRequestData is not found in the empty JSON string", UpdateShiftRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateShiftRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateShiftRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        UpdateShiftRequestDataMeta.validateJsonElement(jsonObj.get("meta"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("date_of_work") != null && !jsonObj.get("date_of_work").isJsonNull()) && !jsonObj.get("date_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_work").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateShiftRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateShiftRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateShiftRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateShiftRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateShiftRequestData>() {
           @Override
           public void write(JsonWriter out, UpdateShiftRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateShiftRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateShiftRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateShiftRequestData
   * @throws IOException if the JSON string is invalid with respect to UpdateShiftRequestData
   */
  public static UpdateShiftRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateShiftRequestData.class);
  }

  /**
   * Convert an instance of UpdateShiftRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

