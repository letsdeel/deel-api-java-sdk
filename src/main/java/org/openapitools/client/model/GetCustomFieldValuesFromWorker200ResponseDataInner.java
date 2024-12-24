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
import java.util.UUID;
import org.openapitools.client.model.GetCustomFieldValuesFromWorker200ResponseDataInnerData;

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
 * GetCustomFieldValuesFromWorker200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:16:06.545846627Z[GMT]", comments = "Generator version: 7.10.0")
public class GetCustomFieldValuesFromWorker200ResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private GetCustomFieldValuesFromWorker200ResponseDataInnerData data;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  /**
   * Type of the custom field
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEXT("text"),
    
    NUMBER("number"),
    
    CURRENCY("currency"),
    
    DATE("date"),
    
    PERCENTAGE("percentage"),
    
    LIST("list"),
    
    MULTISELECT("multiselect");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private TypeEnum type;

  public GetCustomFieldValuesFromWorker200ResponseDataInner() {
  }

  public GetCustomFieldValuesFromWorker200ResponseDataInner id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * UUID for the custom field value
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public GetCustomFieldValuesFromWorker200ResponseDataInner data(@javax.annotation.Nullable GetCustomFieldValuesFromWorker200ResponseDataInnerData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public GetCustomFieldValuesFromWorker200ResponseDataInnerData getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable GetCustomFieldValuesFromWorker200ResponseDataInnerData data) {
    this.data = data;
  }


  public GetCustomFieldValuesFromWorker200ResponseDataInner name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the custom field
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GetCustomFieldValuesFromWorker200ResponseDataInner type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the custom field
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomFieldValuesFromWorker200ResponseDataInner getCustomFieldValuesFromWorker200ResponseDataInner = (GetCustomFieldValuesFromWorker200ResponseDataInner) o;
    return Objects.equals(this.id, getCustomFieldValuesFromWorker200ResponseDataInner.id) &&
        Objects.equals(this.data, getCustomFieldValuesFromWorker200ResponseDataInner.data) &&
        Objects.equals(this.name, getCustomFieldValuesFromWorker200ResponseDataInner.name) &&
        Objects.equals(this.type, getCustomFieldValuesFromWorker200ResponseDataInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomFieldValuesFromWorker200ResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCustomFieldValuesFromWorker200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCustomFieldValuesFromWorker200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCustomFieldValuesFromWorker200ResponseDataInner is not found in the empty JSON string", GetCustomFieldValuesFromWorker200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCustomFieldValuesFromWorker200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCustomFieldValuesFromWorker200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetCustomFieldValuesFromWorker200ResponseDataInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        GetCustomFieldValuesFromWorker200ResponseDataInnerData.validateJsonElement(jsonObj.get("data"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCustomFieldValuesFromWorker200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCustomFieldValuesFromWorker200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCustomFieldValuesFromWorker200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldValuesFromWorker200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCustomFieldValuesFromWorker200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetCustomFieldValuesFromWorker200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCustomFieldValuesFromWorker200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCustomFieldValuesFromWorker200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCustomFieldValuesFromWorker200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetCustomFieldValuesFromWorker200ResponseDataInner
   */
  public static GetCustomFieldValuesFromWorker200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCustomFieldValuesFromWorker200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetCustomFieldValuesFromWorker200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

