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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.FileAttachmentInfo;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * PgoTaskToCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class PgoTaskToCreate {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private String amount;

  public static final String SERIALIZED_NAME_DATE_SUBMITTED = "date_submitted";
  @SerializedName(SERIALIZED_NAME_DATE_SUBMITTED)
  @javax.annotation.Nonnull
  private LocalDate dateSubmitted;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  @javax.annotation.Nullable
  private FileAttachmentInfo attachment;

  public PgoTaskToCreate() {
  }

  public PgoTaskToCreate amount(@javax.annotation.Nonnull String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Fixed rate for this task.
   * @return amount
   */
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull String amount) {
    this.amount = amount;
  }


  public PgoTaskToCreate dateSubmitted(@javax.annotation.Nonnull LocalDate dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
    return this;
  }

  /**
   * Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31.
   * @return dateSubmitted
   */
  @javax.annotation.Nonnull
  public LocalDate getDateSubmitted() {
    return dateSubmitted;
  }

  public void setDateSubmitted(@javax.annotation.Nonnull LocalDate dateSubmitted) {
    this.dateSubmitted = dateSubmitted;
  }


  public PgoTaskToCreate description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Task description.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public PgoTaskToCreate attachment(@javax.annotation.Nullable FileAttachmentInfo attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
   */
  @javax.annotation.Nullable
  public FileAttachmentInfo getAttachment() {
    return attachment;
  }

  public void setAttachment(@javax.annotation.Nullable FileAttachmentInfo attachment) {
    this.attachment = attachment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgoTaskToCreate pgoTaskToCreate = (PgoTaskToCreate) o;
    return Objects.equals(this.amount, pgoTaskToCreate.amount) &&
        Objects.equals(this.dateSubmitted, pgoTaskToCreate.dateSubmitted) &&
        Objects.equals(this.description, pgoTaskToCreate.description) &&
        Objects.equals(this.attachment, pgoTaskToCreate.attachment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, dateSubmitted, description, attachment);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgoTaskToCreate {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dateSubmitted: ").append(toIndentedString(dateSubmitted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("date_submitted");
    openapiFields.add("description");
    openapiFields.add("attachment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("date_submitted");
    openapiRequiredFields.add("description");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PgoTaskToCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PgoTaskToCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PgoTaskToCreate is not found in the empty JSON string", PgoTaskToCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PgoTaskToCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PgoTaskToCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PgoTaskToCreate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `attachment`
      if (jsonObj.get("attachment") != null && !jsonObj.get("attachment").isJsonNull()) {
        FileAttachmentInfo.validateJsonElement(jsonObj.get("attachment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PgoTaskToCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PgoTaskToCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PgoTaskToCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PgoTaskToCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<PgoTaskToCreate>() {
           @Override
           public void write(JsonWriter out, PgoTaskToCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PgoTaskToCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PgoTaskToCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PgoTaskToCreate
   * @throws IOException if the JSON string is invalid with respect to PgoTaskToCreate
   */
  public static PgoTaskToCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PgoTaskToCreate.class);
  }

  /**
   * Convert an instance of PgoTaskToCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

