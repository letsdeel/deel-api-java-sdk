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
 * GetEmployeeComplianceDocumentsContainerDataDocumentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T18:19:15.469015129Z[GMT]", comments = "Generator version: 7.10.0")
public class GetEmployeeComplianceDocumentsContainerDataDocumentsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_HAS_TEMPLATE = "has_template";
  @SerializedName(SERIALIZED_NAME_HAS_TEMPLATE)
  @javax.annotation.Nullable
  private Boolean hasTemplate;

  public static final String SERIALIZED_NAME_FILLABLE = "fillable";
  @SerializedName(SERIALIZED_NAME_FILLABLE)
  @javax.annotation.Nullable
  private Boolean fillable;

  public static final String SERIALIZED_NAME_IS_OPTIONAL = "is_optional";
  @SerializedName(SERIALIZED_NAME_IS_OPTIONAL)
  @javax.annotation.Nullable
  private Boolean isOptional;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_UPLOADED_AT = "uploaded_at";
  @SerializedName(SERIALIZED_NAME_UPLOADED_AT)
  @javax.annotation.Nullable
  private String uploadedAt;

  public static final String SERIALIZED_NAME_FILENAMES = "filenames";
  @SerializedName(SERIALIZED_NAME_FILENAMES)
  @javax.annotation.Nullable
  private List<String> filenames = new ArrayList<>();

  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner() {
  }

  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the document.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * A short description of the document.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner hasTemplate(@javax.annotation.Nullable Boolean hasTemplate) {
    this.hasTemplate = hasTemplate;
    return this;
  }

  /**
   * Denotes if this document has a template available for download
   * @return hasTemplate
   */
  @javax.annotation.Nullable
  public Boolean getHasTemplate() {
    return hasTemplate;
  }

  public void setHasTemplate(@javax.annotation.Nullable Boolean hasTemplate) {
    this.hasTemplate = hasTemplate;
  }


  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner fillable(@javax.annotation.Nullable Boolean fillable) {
    this.fillable = fillable;
    return this;
  }

  /**
   * Denotes if the document is available to fill out on Deel.
   * @return fillable
   */
  @javax.annotation.Nullable
  public Boolean getFillable() {
    return fillable;
  }

  public void setFillable(@javax.annotation.Nullable Boolean fillable) {
    this.fillable = fillable;
  }


  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner isOptional(@javax.annotation.Nullable Boolean isOptional) {
    this.isOptional = isOptional;
    return this;
  }

  /**
   * Denotes if the document is optional or required.
   * @return isOptional
   */
  @javax.annotation.Nullable
  public Boolean getIsOptional() {
    return isOptional;
  }

  public void setIsOptional(@javax.annotation.Nullable Boolean isOptional) {
    this.isOptional = isOptional;
  }


  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The country associated with this document.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner uploadedAt(@javax.annotation.Nullable String uploadedAt) {
    this.uploadedAt = uploadedAt;
    return this;
  }

  /**
   * The timestamp when this document was uploaded / supplied to Deel.
   * @return uploadedAt
   */
  @javax.annotation.Nullable
  public String getUploadedAt() {
    return uploadedAt;
  }

  public void setUploadedAt(@javax.annotation.Nullable String uploadedAt) {
    this.uploadedAt = uploadedAt;
  }


  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner filenames(@javax.annotation.Nullable List<String> filenames) {
    this.filenames = filenames;
    return this;
  }

  public GetEmployeeComplianceDocumentsContainerDataDocumentsInner addFilenamesItem(String filenamesItem) {
    if (this.filenames == null) {
      this.filenames = new ArrayList<>();
    }
    this.filenames.add(filenamesItem);
    return this;
  }

  /**
   * The list of filenames for the associated uploaded documents.
   * @return filenames
   */
  @javax.annotation.Nullable
  public List<String> getFilenames() {
    return filenames;
  }

  public void setFilenames(@javax.annotation.Nullable List<String> filenames) {
    this.filenames = filenames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEmployeeComplianceDocumentsContainerDataDocumentsInner getEmployeeComplianceDocumentsContainerDataDocumentsInner = (GetEmployeeComplianceDocumentsContainerDataDocumentsInner) o;
    return Objects.equals(this.id, getEmployeeComplianceDocumentsContainerDataDocumentsInner.id) &&
        Objects.equals(this.name, getEmployeeComplianceDocumentsContainerDataDocumentsInner.name) &&
        Objects.equals(this.description, getEmployeeComplianceDocumentsContainerDataDocumentsInner.description) &&
        Objects.equals(this.hasTemplate, getEmployeeComplianceDocumentsContainerDataDocumentsInner.hasTemplate) &&
        Objects.equals(this.fillable, getEmployeeComplianceDocumentsContainerDataDocumentsInner.fillable) &&
        Objects.equals(this.isOptional, getEmployeeComplianceDocumentsContainerDataDocumentsInner.isOptional) &&
        Objects.equals(this.country, getEmployeeComplianceDocumentsContainerDataDocumentsInner.country) &&
        Objects.equals(this.uploadedAt, getEmployeeComplianceDocumentsContainerDataDocumentsInner.uploadedAt) &&
        Objects.equals(this.filenames, getEmployeeComplianceDocumentsContainerDataDocumentsInner.filenames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, hasTemplate, fillable, isOptional, country, uploadedAt, filenames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEmployeeComplianceDocumentsContainerDataDocumentsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasTemplate: ").append(toIndentedString(hasTemplate)).append("\n");
    sb.append("    fillable: ").append(toIndentedString(fillable)).append("\n");
    sb.append("    isOptional: ").append(toIndentedString(isOptional)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    uploadedAt: ").append(toIndentedString(uploadedAt)).append("\n");
    sb.append("    filenames: ").append(toIndentedString(filenames)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("has_template");
    openapiFields.add("fillable");
    openapiFields.add("is_optional");
    openapiFields.add("country");
    openapiFields.add("uploaded_at");
    openapiFields.add("filenames");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetEmployeeComplianceDocumentsContainerDataDocumentsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetEmployeeComplianceDocumentsContainerDataDocumentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEmployeeComplianceDocumentsContainerDataDocumentsInner is not found in the empty JSON string", GetEmployeeComplianceDocumentsContainerDataDocumentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetEmployeeComplianceDocumentsContainerDataDocumentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEmployeeComplianceDocumentsContainerDataDocumentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("uploaded_at") != null && !jsonObj.get("uploaded_at").isJsonNull()) && !jsonObj.get("uploaded_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uploaded_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uploaded_at").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("filenames") != null && !jsonObj.get("filenames").isJsonNull() && !jsonObj.get("filenames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filenames` to be an array in the JSON string but got `%s`", jsonObj.get("filenames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEmployeeComplianceDocumentsContainerDataDocumentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEmployeeComplianceDocumentsContainerDataDocumentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEmployeeComplianceDocumentsContainerDataDocumentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEmployeeComplianceDocumentsContainerDataDocumentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEmployeeComplianceDocumentsContainerDataDocumentsInner>() {
           @Override
           public void write(JsonWriter out, GetEmployeeComplianceDocumentsContainerDataDocumentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEmployeeComplianceDocumentsContainerDataDocumentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetEmployeeComplianceDocumentsContainerDataDocumentsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetEmployeeComplianceDocumentsContainerDataDocumentsInner
   * @throws IOException if the JSON string is invalid with respect to GetEmployeeComplianceDocumentsContainerDataDocumentsInner
   */
  public static GetEmployeeComplianceDocumentsContainerDataDocumentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEmployeeComplianceDocumentsContainerDataDocumentsInner.class);
  }

  /**
   * Convert an instance of GetEmployeeComplianceDocumentsContainerDataDocumentsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

