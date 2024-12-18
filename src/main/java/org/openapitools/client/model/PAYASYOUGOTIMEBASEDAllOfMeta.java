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
 * Additional custom info about a contract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:45:24.021173966Z[GMT]", comments = "Generator version: 7.10.0")
public class PAYASYOUGOTIMEBASEDAllOfMeta {
  public static final String SERIALIZED_NAME_IS_MAIN_INCOME = "is_main_income";
  @SerializedName(SERIALIZED_NAME_IS_MAIN_INCOME)
  @javax.annotation.Nullable
  private Boolean isMainIncome;

  public static final String SERIALIZED_NAME_DOCUMENTS_REQUIRED = "documents_required";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS_REQUIRED)
  @javax.annotation.Nonnull
  private Boolean documentsRequired;

  public PAYASYOUGOTIMEBASEDAllOfMeta() {
  }

  public PAYASYOUGOTIMEBASEDAllOfMeta isMainIncome(@javax.annotation.Nullable Boolean isMainIncome) {
    this.isMainIncome = isMainIncome;
    return this;
  }

  /**
   * Flag to indicate if the contract is the main income for the contractor.
   * @return isMainIncome
   */
  @javax.annotation.Nullable
  public Boolean getIsMainIncome() {
    return isMainIncome;
  }

  public void setIsMainIncome(@javax.annotation.Nullable Boolean isMainIncome) {
    this.isMainIncome = isMainIncome;
  }


  public PAYASYOUGOTIMEBASEDAllOfMeta documentsRequired(@javax.annotation.Nonnull Boolean documentsRequired) {
    this.documentsRequired = documentsRequired;
    return this;
  }

  /**
   * Require the contractor to upload necessary compliance documents as per their country’s labor laws.
   * @return documentsRequired
   */
  @javax.annotation.Nonnull
  public Boolean getDocumentsRequired() {
    return documentsRequired;
  }

  public void setDocumentsRequired(@javax.annotation.Nonnull Boolean documentsRequired) {
    this.documentsRequired = documentsRequired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PAYASYOUGOTIMEBASEDAllOfMeta paYASYOUGOTIMEBASEDAllOfMeta = (PAYASYOUGOTIMEBASEDAllOfMeta) o;
    return Objects.equals(this.isMainIncome, paYASYOUGOTIMEBASEDAllOfMeta.isMainIncome) &&
        Objects.equals(this.documentsRequired, paYASYOUGOTIMEBASEDAllOfMeta.documentsRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMainIncome, documentsRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PAYASYOUGOTIMEBASEDAllOfMeta {\n");
    sb.append("    isMainIncome: ").append(toIndentedString(isMainIncome)).append("\n");
    sb.append("    documentsRequired: ").append(toIndentedString(documentsRequired)).append("\n");
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
    openapiFields.add("is_main_income");
    openapiFields.add("documents_required");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("documents_required");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PAYASYOUGOTIMEBASEDAllOfMeta
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PAYASYOUGOTIMEBASEDAllOfMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PAYASYOUGOTIMEBASEDAllOfMeta is not found in the empty JSON string", PAYASYOUGOTIMEBASEDAllOfMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PAYASYOUGOTIMEBASEDAllOfMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PAYASYOUGOTIMEBASEDAllOfMeta` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PAYASYOUGOTIMEBASEDAllOfMeta.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PAYASYOUGOTIMEBASEDAllOfMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PAYASYOUGOTIMEBASEDAllOfMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PAYASYOUGOTIMEBASEDAllOfMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PAYASYOUGOTIMEBASEDAllOfMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<PAYASYOUGOTIMEBASEDAllOfMeta>() {
           @Override
           public void write(JsonWriter out, PAYASYOUGOTIMEBASEDAllOfMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PAYASYOUGOTIMEBASEDAllOfMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PAYASYOUGOTIMEBASEDAllOfMeta given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PAYASYOUGOTIMEBASEDAllOfMeta
   * @throws IOException if the JSON string is invalid with respect to PAYASYOUGOTIMEBASEDAllOfMeta
   */
  public static PAYASYOUGOTIMEBASEDAllOfMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PAYASYOUGOTIMEBASEDAllOfMeta.class);
  }

  /**
   * Convert an instance of PAYASYOUGOTIMEBASEDAllOfMeta to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

