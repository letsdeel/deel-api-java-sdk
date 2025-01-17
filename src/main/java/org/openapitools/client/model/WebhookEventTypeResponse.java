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
import java.math.BigDecimal;
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
 * WebhookEventTypeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class WebhookEventTypeResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private BigDecimal id;

  public static final String SERIALIZED_NAME_MODULE_NAME = "module_name";
  @SerializedName(SERIALIZED_NAME_MODULE_NAME)
  @javax.annotation.Nonnull
  private String moduleName;

  public static final String SERIALIZED_NAME_MODULE_LABEL = "module_label";
  @SerializedName(SERIALIZED_NAME_MODULE_LABEL)
  @javax.annotation.Nonnull
  private String moduleLabel;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_PAYLOAD_EXAMPLE = "payload_example";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_EXAMPLE)
  @javax.annotation.Nullable
  private String payloadExample;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private String updatedAt;

  public WebhookEventTypeResponse() {
  }

  public WebhookEventTypeResponse id(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Event type unique identifier.
   * @return id
   */
  @javax.annotation.Nonnull
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull BigDecimal id) {
    this.id = id;
  }


  public WebhookEventTypeResponse moduleName(@javax.annotation.Nonnull String moduleName) {
    this.moduleName = moduleName;
    return this;
  }

  /**
   * Name of the rabbit queue.
   * @return moduleName
   */
  @javax.annotation.Nonnull
  public String getModuleName() {
    return moduleName;
  }

  public void setModuleName(@javax.annotation.Nonnull String moduleName) {
    this.moduleName = moduleName;
  }


  public WebhookEventTypeResponse moduleLabel(@javax.annotation.Nonnull String moduleLabel) {
    this.moduleLabel = moduleLabel;
    return this;
  }

  /**
   * Display name of the rabbit queue in Deel UI.
   * @return moduleLabel
   */
  @javax.annotation.Nonnull
  public String getModuleLabel() {
    return moduleLabel;
  }

  public void setModuleLabel(@javax.annotation.Nonnull String moduleLabel) {
    this.moduleLabel = moduleLabel;
  }


  public WebhookEventTypeResponse name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the webhook event.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public WebhookEventTypeResponse description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Describes the webhook event and other pertinent info.
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public WebhookEventTypeResponse payloadExample(@javax.annotation.Nullable String payloadExample) {
    this.payloadExample = payloadExample;
    return this;
  }

  /**
   * JSON payload example of the specific event.
   * @return payloadExample
   */
  @javax.annotation.Nullable
  public String getPayloadExample() {
    return payloadExample;
  }

  public void setPayloadExample(@javax.annotation.Nullable String payloadExample) {
    this.payloadExample = payloadExample;
  }


  public WebhookEventTypeResponse createdAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time at which the event type was created.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable String createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookEventTypeResponse updatedAt(@javax.annotation.Nullable String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time at which the event type was updated.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nullable String updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEventTypeResponse webhookEventTypeResponse = (WebhookEventTypeResponse) o;
    return Objects.equals(this.id, webhookEventTypeResponse.id) &&
        Objects.equals(this.moduleName, webhookEventTypeResponse.moduleName) &&
        Objects.equals(this.moduleLabel, webhookEventTypeResponse.moduleLabel) &&
        Objects.equals(this.name, webhookEventTypeResponse.name) &&
        Objects.equals(this.description, webhookEventTypeResponse.description) &&
        Objects.equals(this.payloadExample, webhookEventTypeResponse.payloadExample) &&
        Objects.equals(this.createdAt, webhookEventTypeResponse.createdAt) &&
        Objects.equals(this.updatedAt, webhookEventTypeResponse.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, moduleName, moduleLabel, name, description, payloadExample, createdAt, updatedAt);
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
    sb.append("class WebhookEventTypeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    moduleLabel: ").append(toIndentedString(moduleLabel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    payloadExample: ").append(toIndentedString(payloadExample)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("module_name");
    openapiFields.add("module_label");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("payload_example");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("module_name");
    openapiRequiredFields.add("module_label");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhookEventTypeResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookEventTypeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookEventTypeResponse is not found in the empty JSON string", WebhookEventTypeResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookEventTypeResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookEventTypeResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookEventTypeResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("module_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_name").toString()));
      }
      if (!jsonObj.get("module_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module_label").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("payload_example") != null && !jsonObj.get("payload_example").isJsonNull()) && !jsonObj.get("payload_example").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload_example` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload_example").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookEventTypeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookEventTypeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookEventTypeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookEventTypeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookEventTypeResponse>() {
           @Override
           public void write(JsonWriter out, WebhookEventTypeResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookEventTypeResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebhookEventTypeResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhookEventTypeResponse
   * @throws IOException if the JSON string is invalid with respect to WebhookEventTypeResponse
   */
  public static WebhookEventTypeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookEventTypeResponse.class);
  }

  /**
   * Convert an instance of WebhookEventTypeResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

