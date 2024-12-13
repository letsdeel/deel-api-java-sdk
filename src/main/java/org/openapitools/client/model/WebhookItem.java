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
 * WebhookItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T11:33:27.931295037Z[GMT]", comments = "Generator version: 7.10.0")
public class WebhookItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  /**
   * Status of webhook.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private StatusEnum status;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  @javax.annotation.Nonnull
  private String url;

  public static final String SERIALIZED_NAME_SIGNING_KEY = "signing_key";
  @SerializedName(SERIALIZED_NAME_SIGNING_KEY)
  @javax.annotation.Nullable
  private String signingKey;

  public static final String SERIALIZED_NAME_API_VERSION = "api_version";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @javax.annotation.Nonnull
  private String apiVersion = "v2";

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  @javax.annotation.Nonnull
  private List<String> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private String updatedAt;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  @javax.annotation.Nullable
  private Boolean hidden;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  @javax.annotation.Nullable
  private Boolean internal;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  @javax.annotation.Nullable
  private String deletedAt;

  public WebhookItem() {
  }

  public WebhookItem id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public WebhookItem name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Webhook subscription name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public WebhookItem description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Webhook subscription description.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public WebhookItem status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of webhook.
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }


  public WebhookItem url(@javax.annotation.Nonnull String url) {
    this.url = url;
    return this;
  }

  /**
   * Endpoint to receive webhook.
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(@javax.annotation.Nonnull String url) {
    this.url = url;
  }


  public WebhookItem signingKey(@javax.annotation.Nullable String signingKey) {
    this.signingKey = signingKey;
    return this;
  }

  /**
   * The webhook&#39;s signing key, used to generate webhook signatures.
   * @return signingKey
   */
  @javax.annotation.Nullable
  public String getSigningKey() {
    return signingKey;
  }

  public void setSigningKey(@javax.annotation.Nullable String signingKey) {
    this.signingKey = signingKey;
  }


  public WebhookItem apiVersion(@javax.annotation.Nonnull String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Deel API version. Currently Deel accepts v1 or v2 version.
   * @return apiVersion
   */
  @javax.annotation.Nonnull
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@javax.annotation.Nonnull String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public WebhookItem events(@javax.annotation.Nonnull List<String> events) {
    this.events = events;
    return this;
  }

  public WebhookItem addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * The list of events to enable for this subscription.
   * @return events
   */
  @javax.annotation.Nonnull
  public List<String> getEvents() {
    return events;
  }

  public void setEvents(@javax.annotation.Nonnull List<String> events) {
    this.events = events;
  }


  public WebhookItem createdAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time at which the webhook was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookItem updatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time at which the webhook was updated.
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public WebhookItem hidden(@javax.annotation.Nullable Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Property to hide the webhook from frontend view. Commonly by Dell 3rd party apps
   * @return hidden
   */
  @javax.annotation.Nullable
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(@javax.annotation.Nullable Boolean hidden) {
    this.hidden = hidden;
  }


  public WebhookItem internal(@javax.annotation.Nullable Boolean internal) {
    this.internal = internal;
    return this;
  }

  /**
   * Get internal
   * @return internal
   */
  @javax.annotation.Nullable
  public Boolean getInternal() {
    return internal;
  }

  public void setInternal(@javax.annotation.Nullable Boolean internal) {
    this.internal = internal;
  }


  public WebhookItem deletedAt(@javax.annotation.Nullable String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  /**
   * Time at which the webhook was deleted.
   * @return deletedAt
   */
  @javax.annotation.Nullable
  public String getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(@javax.annotation.Nullable String deletedAt) {
    this.deletedAt = deletedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookItem webhookItem = (WebhookItem) o;
    return Objects.equals(this.id, webhookItem.id) &&
        Objects.equals(this.name, webhookItem.name) &&
        Objects.equals(this.description, webhookItem.description) &&
        Objects.equals(this.status, webhookItem.status) &&
        Objects.equals(this.url, webhookItem.url) &&
        Objects.equals(this.signingKey, webhookItem.signingKey) &&
        Objects.equals(this.apiVersion, webhookItem.apiVersion) &&
        Objects.equals(this.events, webhookItem.events) &&
        Objects.equals(this.createdAt, webhookItem.createdAt) &&
        Objects.equals(this.updatedAt, webhookItem.updatedAt) &&
        Objects.equals(this.hidden, webhookItem.hidden) &&
        Objects.equals(this.internal, webhookItem.internal) &&
        Objects.equals(this.deletedAt, webhookItem.deletedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, status, url, signingKey, apiVersion, events, createdAt, updatedAt, hidden, internal, deletedAt);
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
    sb.append("class WebhookItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("url");
    openapiFields.add("signing_key");
    openapiFields.add("api_version");
    openapiFields.add("events");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("hidden");
    openapiFields.add("internal");
    openapiFields.add("deleted_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("signing_key");
    openapiRequiredFields.add("api_version");
    openapiRequiredFields.add("events");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhookItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookItem is not found in the empty JSON string", WebhookItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("signing_key") != null && !jsonObj.get("signing_key").isJsonNull()) && !jsonObj.get("signing_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signing_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signing_key").toString()));
      }
      if (!jsonObj.get("api_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_version").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("events") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }
      if (!jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (!jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if ((jsonObj.get("deleted_at") != null && !jsonObj.get("deleted_at").isJsonNull()) && !jsonObj.get("deleted_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleted_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deleted_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookItem.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookItem>() {
           @Override
           public void write(JsonWriter out, WebhookItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebhookItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhookItem
   * @throws IOException if the JSON string is invalid with respect to WebhookItem
   */
  public static WebhookItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookItem.class);
  }

  /**
   * Convert an instance of WebhookItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

