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
 * TimesheetApprover
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class TimesheetApprover {
  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  @javax.annotation.Nonnull
  private String fullName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nonnull
  private String email;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  @javax.annotation.Nonnull
  private Boolean approved;

  public TimesheetApprover() {
  }

  public TimesheetApprover fullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   */
  @javax.annotation.Nonnull
  public String getFullName() {
    return fullName;
  }

  public void setFullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
  }


  public TimesheetApprover email(@javax.annotation.Nonnull String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nonnull String email) {
    this.email = email;
  }


  public TimesheetApprover approved(@javax.annotation.Nonnull Boolean approved) {
    this.approved = approved;
    return this;
  }

  /**
   * Get approved
   * @return approved
   */
  @javax.annotation.Nonnull
  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(@javax.annotation.Nonnull Boolean approved) {
    this.approved = approved;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimesheetApprover timesheetApprover = (TimesheetApprover) o;
    return Objects.equals(this.fullName, timesheetApprover.fullName) &&
        Objects.equals(this.email, timesheetApprover.email) &&
        Objects.equals(this.approved, timesheetApprover.approved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, email, approved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesheetApprover {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
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
    openapiFields.add("full_name");
    openapiFields.add("email");
    openapiFields.add("approved");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("full_name");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("approved");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TimesheetApprover
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TimesheetApprover.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimesheetApprover is not found in the empty JSON string", TimesheetApprover.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TimesheetApprover.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimesheetApprover` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimesheetApprover.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimesheetApprover.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimesheetApprover' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimesheetApprover> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimesheetApprover.class));

       return (TypeAdapter<T>) new TypeAdapter<TimesheetApprover>() {
           @Override
           public void write(JsonWriter out, TimesheetApprover value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimesheetApprover read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TimesheetApprover given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TimesheetApprover
   * @throws IOException if the JSON string is invalid with respect to TimesheetApprover
   */
  public static TimesheetApprover fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimesheetApprover.class);
  }

  /**
   * Convert an instance of TimesheetApprover to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

