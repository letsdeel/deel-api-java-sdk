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
import java.time.OffsetDateTime;
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
 * WorkerDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T15:22:04.472468916Z[GMT]", comments = "Generator version: 7.10.0")
public class WorkerDocument {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_CONTRACTOR_SIGNED_AT = "contractor_signed_at";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_SIGNED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime contractorSignedAt;

  public static final String SERIALIZED_NAME_CLIENT_SIGNED_AT = "client_signed_at";
  @SerializedName(SERIALIZED_NAME_CLIENT_SIGNED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime clientSignedAt;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public WorkerDocument() {
  }

  public WorkerDocument id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Document unique ID.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public WorkerDocument type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Document type.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public WorkerDocument contractorSignedAt(@javax.annotation.Nullable OffsetDateTime contractorSignedAt) {
    this.contractorSignedAt = contractorSignedAt;
    return this;
  }

  /**
   * Date the contractor singed the document.
   * @return contractorSignedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getContractorSignedAt() {
    return contractorSignedAt;
  }

  public void setContractorSignedAt(@javax.annotation.Nullable OffsetDateTime contractorSignedAt) {
    this.contractorSignedAt = contractorSignedAt;
  }


  public WorkerDocument clientSignedAt(@javax.annotation.Nullable OffsetDateTime clientSignedAt) {
    this.clientSignedAt = clientSignedAt;
    return this;
  }

  /**
   * Date the client singed the document.
   * @return clientSignedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getClientSignedAt() {
    return clientSignedAt;
  }

  public void setClientSignedAt(@javax.annotation.Nullable OffsetDateTime clientSignedAt) {
    this.clientSignedAt = clientSignedAt;
  }


  public WorkerDocument label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Document name.
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerDocument workerDocument = (WorkerDocument) o;
    return Objects.equals(this.id, workerDocument.id) &&
        Objects.equals(this.type, workerDocument.type) &&
        Objects.equals(this.contractorSignedAt, workerDocument.contractorSignedAt) &&
        Objects.equals(this.clientSignedAt, workerDocument.clientSignedAt) &&
        Objects.equals(this.label, workerDocument.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, contractorSignedAt, clientSignedAt, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerDocument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contractorSignedAt: ").append(toIndentedString(contractorSignedAt)).append("\n");
    sb.append("    clientSignedAt: ").append(toIndentedString(clientSignedAt)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("contractor_signed_at");
    openapiFields.add("client_signed_at");
    openapiFields.add("label");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WorkerDocument
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkerDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkerDocument is not found in the empty JSON string", WorkerDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkerDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkerDocument` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkerDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkerDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkerDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkerDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkerDocument>() {
           @Override
           public void write(JsonWriter out, WorkerDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkerDocument read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WorkerDocument given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WorkerDocument
   * @throws IOException if the JSON string is invalid with respect to WorkerDocument
   */
  public static WorkerDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkerDocument.class);
  }

  /**
   * Convert an instance of WorkerDocument to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

