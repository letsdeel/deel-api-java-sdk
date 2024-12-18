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
import org.openapitools.client.model.CreateShiftsRequestDataShiftsInnerMeta;
import org.openapitools.client.model.CreateShiftsRequestDataShiftsInnerSummary;

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
 * CreateShiftsRequestDataShiftsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:17:35.281321822Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateShiftsRequestDataShiftsInner {
  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  @javax.annotation.Nonnull
  private CreateShiftsRequestDataShiftsInnerMeta meta;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  @javax.annotation.Nonnull
  private CreateShiftsRequestDataShiftsInnerSummary summary;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nonnull
  private String externalId;

  public static final String SERIALIZED_NAME_DATE_OF_WORK = "date_of_work";
  @SerializedName(SERIALIZED_NAME_DATE_OF_WORK)
  @javax.annotation.Nonnull
  private String dateOfWork;

  public CreateShiftsRequestDataShiftsInner() {
  }

  public CreateShiftsRequestDataShiftsInner meta(@javax.annotation.Nonnull CreateShiftsRequestDataShiftsInnerMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nonnull
  public CreateShiftsRequestDataShiftsInnerMeta getMeta() {
    return meta;
  }

  public void setMeta(@javax.annotation.Nonnull CreateShiftsRequestDataShiftsInnerMeta meta) {
    this.meta = meta;
  }


  public CreateShiftsRequestDataShiftsInner summary(@javax.annotation.Nonnull CreateShiftsRequestDataShiftsInnerSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @javax.annotation.Nonnull
  public CreateShiftsRequestDataShiftsInnerSummary getSummary() {
    return summary;
  }

  public void setSummary(@javax.annotation.Nonnull CreateShiftsRequestDataShiftsInnerSummary summary) {
    this.summary = summary;
  }


  public CreateShiftsRequestDataShiftsInner description(@javax.annotation.Nullable String description) {
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


  public CreateShiftsRequestDataShiftsInner externalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Extrenal ID of the shift.
   * @return externalId
   */
  @javax.annotation.Nonnull
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
  }


  public CreateShiftsRequestDataShiftsInner dateOfWork(@javax.annotation.Nonnull String dateOfWork) {
    this.dateOfWork = dateOfWork;
    return this;
  }

  /**
   * Date of shift work
   * @return dateOfWork
   */
  @javax.annotation.Nonnull
  public String getDateOfWork() {
    return dateOfWork;
  }

  public void setDateOfWork(@javax.annotation.Nonnull String dateOfWork) {
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
    CreateShiftsRequestDataShiftsInner createShiftsRequestDataShiftsInner = (CreateShiftsRequestDataShiftsInner) o;
    return Objects.equals(this.meta, createShiftsRequestDataShiftsInner.meta) &&
        Objects.equals(this.summary, createShiftsRequestDataShiftsInner.summary) &&
        Objects.equals(this.description, createShiftsRequestDataShiftsInner.description) &&
        Objects.equals(this.externalId, createShiftsRequestDataShiftsInner.externalId) &&
        Objects.equals(this.dateOfWork, createShiftsRequestDataShiftsInner.dateOfWork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, summary, description, externalId, dateOfWork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShiftsRequestDataShiftsInner {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
    openapiFields.add("summary");
    openapiFields.add("description");
    openapiFields.add("external_id");
    openapiFields.add("date_of_work");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("meta");
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("external_id");
    openapiRequiredFields.add("date_of_work");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateShiftsRequestDataShiftsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateShiftsRequestDataShiftsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateShiftsRequestDataShiftsInner is not found in the empty JSON string", CreateShiftsRequestDataShiftsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateShiftsRequestDataShiftsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateShiftsRequestDataShiftsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateShiftsRequestDataShiftsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `meta`
      CreateShiftsRequestDataShiftsInnerMeta.validateJsonElement(jsonObj.get("meta"));
      // validate the required field `summary`
      CreateShiftsRequestDataShiftsInnerSummary.validateJsonElement(jsonObj.get("summary"));
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (!jsonObj.get("date_of_work").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_work` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_work").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateShiftsRequestDataShiftsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateShiftsRequestDataShiftsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateShiftsRequestDataShiftsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateShiftsRequestDataShiftsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateShiftsRequestDataShiftsInner>() {
           @Override
           public void write(JsonWriter out, CreateShiftsRequestDataShiftsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateShiftsRequestDataShiftsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateShiftsRequestDataShiftsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateShiftsRequestDataShiftsInner
   * @throws IOException if the JSON string is invalid with respect to CreateShiftsRequestDataShiftsInner
   */
  public static CreateShiftsRequestDataShiftsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateShiftsRequestDataShiftsInner.class);
  }

  /**
   * Convert an instance of CreateShiftsRequestDataShiftsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

