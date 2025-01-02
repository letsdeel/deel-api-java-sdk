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
import java.util.UUID;
import org.openapitools.client.model.CustomFieldsObjectSettings;
import org.openapitools.client.model.CustomFieldsObjectType;

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
 * CustomFieldsObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-02T14:25:45.544976271Z[GMT]", comments = "Generator version: 7.10.0")
public class CustomFieldsObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private CustomFieldsObjectType type;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  @javax.annotation.Nullable
  private CustomFieldsObjectSettings settings;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private LocalDate createdAt;

  /**
   * Valid placements for custom field
   */
  @JsonAdapter(PlacementEnum.Adapter.class)
  public enum PlacementEnum {
    PROFILE("profile"),
    
    CONTRACT("contract");

    private String value;

    PlacementEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlacementEnum fromValue(String value) {
      for (PlacementEnum b : PlacementEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlacementEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlacementEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlacementEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlacementEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PlacementEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PLACEMENT = "placement";
  @SerializedName(SERIALIZED_NAME_PLACEMENT)
  @javax.annotation.Nullable
  private PlacementEnum placement;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public CustomFieldsObject() {
  }

  public CustomFieldsObject id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public CustomFieldsObject name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the custom field
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public CustomFieldsObject type(@javax.annotation.Nullable CustomFieldsObjectType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public CustomFieldsObjectType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable CustomFieldsObjectType type) {
    this.type = type;
  }


  public CustomFieldsObject settings(@javax.annotation.Nullable CustomFieldsObjectSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
   */
  @javax.annotation.Nullable
  public CustomFieldsObjectSettings getSettings() {
    return settings;
  }

  public void setSettings(@javax.annotation.Nullable CustomFieldsObjectSettings settings) {
    this.settings = settings;
  }


  public CustomFieldsObject createdAt(@javax.annotation.Nullable LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date of the custom field
   * @return createdAt
   */
  @javax.annotation.Nullable
  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  public CustomFieldsObject placement(@javax.annotation.Nullable PlacementEnum placement) {
    this.placement = placement;
    return this;
  }

  /**
   * Valid placements for custom field
   * @return placement
   */
  @javax.annotation.Nullable
  public PlacementEnum getPlacement() {
    return placement;
  }

  public void setPlacement(@javax.annotation.Nullable PlacementEnum placement) {
    this.placement = placement;
  }


  public CustomFieldsObject description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the custom field
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldsObject customFieldsObject = (CustomFieldsObject) o;
    return Objects.equals(this.id, customFieldsObject.id) &&
        Objects.equals(this.name, customFieldsObject.name) &&
        Objects.equals(this.type, customFieldsObject.type) &&
        Objects.equals(this.settings, customFieldsObject.settings) &&
        Objects.equals(this.createdAt, customFieldsObject.createdAt) &&
        Objects.equals(this.placement, customFieldsObject.placement) &&
        Objects.equals(this.description, customFieldsObject.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, settings, createdAt, placement, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldsObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("settings");
    openapiFields.add("createdAt");
    openapiFields.add("placement");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CustomFieldsObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomFieldsObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldsObject is not found in the empty JSON string", CustomFieldsObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldsObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldsObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        CustomFieldsObjectType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        CustomFieldsObjectSettings.validateJsonElement(jsonObj.get("settings"));
      }
      if ((jsonObj.get("placement") != null && !jsonObj.get("placement").isJsonNull()) && !jsonObj.get("placement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placement").toString()));
      }
      // validate the optional field `placement`
      if (jsonObj.get("placement") != null && !jsonObj.get("placement").isJsonNull()) {
        PlacementEnum.validateJsonElement(jsonObj.get("placement"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldsObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldsObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldsObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldsObject.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldsObject>() {
           @Override
           public void write(JsonWriter out, CustomFieldsObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldsObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CustomFieldsObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomFieldsObject
   * @throws IOException if the JSON string is invalid with respect to CustomFieldsObject
   */
  public static CustomFieldsObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldsObject.class);
  }

  /**
   * Convert an instance of CustomFieldsObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

