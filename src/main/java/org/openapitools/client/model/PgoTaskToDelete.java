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
 * PgoTaskToDelete
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T14:19:15.487453130Z[GMT]", comments = "Generator version: 7.10.0")
public class PgoTaskToDelete {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_DELETE_RECURRING_REPORT = "delete_recurring_report";
  @SerializedName(SERIALIZED_NAME_DELETE_RECURRING_REPORT)
  @javax.annotation.Nullable
  private Boolean deleteRecurringReport;

  public PgoTaskToDelete() {
  }

  public PgoTaskToDelete description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of exclusion.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public PgoTaskToDelete deleteRecurringReport(@javax.annotation.Nullable Boolean deleteRecurringReport) {
    this.deleteRecurringReport = deleteRecurringReport;
    return this;
  }

  /**
   * Request to delete recurring report.
   * @return deleteRecurringReport
   */
  @javax.annotation.Nullable
  public Boolean getDeleteRecurringReport() {
    return deleteRecurringReport;
  }

  public void setDeleteRecurringReport(@javax.annotation.Nullable Boolean deleteRecurringReport) {
    this.deleteRecurringReport = deleteRecurringReport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgoTaskToDelete pgoTaskToDelete = (PgoTaskToDelete) o;
    return Objects.equals(this.description, pgoTaskToDelete.description) &&
        Objects.equals(this.deleteRecurringReport, pgoTaskToDelete.deleteRecurringReport);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, deleteRecurringReport);
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
    sb.append("class PgoTaskToDelete {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deleteRecurringReport: ").append(toIndentedString(deleteRecurringReport)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("delete_recurring_report");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PgoTaskToDelete
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PgoTaskToDelete.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PgoTaskToDelete is not found in the empty JSON string", PgoTaskToDelete.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PgoTaskToDelete.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PgoTaskToDelete` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PgoTaskToDelete.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PgoTaskToDelete' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PgoTaskToDelete> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PgoTaskToDelete.class));

       return (TypeAdapter<T>) new TypeAdapter<PgoTaskToDelete>() {
           @Override
           public void write(JsonWriter out, PgoTaskToDelete value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PgoTaskToDelete read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PgoTaskToDelete given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PgoTaskToDelete
   * @throws IOException if the JSON string is invalid with respect to PgoTaskToDelete
   */
  public static PgoTaskToDelete fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PgoTaskToDelete.class);
  }

  /**
   * Convert an instance of PgoTaskToDelete to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

