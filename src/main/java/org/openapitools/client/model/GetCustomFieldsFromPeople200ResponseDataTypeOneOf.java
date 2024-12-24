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
 * GetCustomFieldsFromPeople200ResponseDataTypeOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:29:34.997576605Z[GMT]", comments = "Generator version: 7.10.0")
public class GetCustomFieldsFromPeople200ResponseDataTypeOneOf {
  /**
   * Simple types
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    TEXT("text"),
    
    NUMBER("number"),
    
    DATE("date"),
    
    PERCENTAGE("percentage");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NameEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private NameEnum name;

  public GetCustomFieldsFromPeople200ResponseDataTypeOneOf() {
  }

  public GetCustomFieldsFromPeople200ResponseDataTypeOneOf name(@javax.annotation.Nullable NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Simple types
   * @return name
   */
  @javax.annotation.Nullable
  public NameEnum getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable NameEnum name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomFieldsFromPeople200ResponseDataTypeOneOf getCustomFieldsFromPeople200ResponseDataTypeOneOf = (GetCustomFieldsFromPeople200ResponseDataTypeOneOf) o;
    return Objects.equals(this.name, getCustomFieldsFromPeople200ResponseDataTypeOneOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomFieldsFromPeople200ResponseDataTypeOneOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCustomFieldsFromPeople200ResponseDataTypeOneOf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCustomFieldsFromPeople200ResponseDataTypeOneOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCustomFieldsFromPeople200ResponseDataTypeOneOf is not found in the empty JSON string", GetCustomFieldsFromPeople200ResponseDataTypeOneOf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCustomFieldsFromPeople200ResponseDataTypeOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCustomFieldsFromPeople200ResponseDataTypeOneOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        NameEnum.validateJsonElement(jsonObj.get("name"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCustomFieldsFromPeople200ResponseDataTypeOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCustomFieldsFromPeople200ResponseDataTypeOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCustomFieldsFromPeople200ResponseDataTypeOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldsFromPeople200ResponseDataTypeOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCustomFieldsFromPeople200ResponseDataTypeOneOf>() {
           @Override
           public void write(JsonWriter out, GetCustomFieldsFromPeople200ResponseDataTypeOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCustomFieldsFromPeople200ResponseDataTypeOneOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCustomFieldsFromPeople200ResponseDataTypeOneOf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCustomFieldsFromPeople200ResponseDataTypeOneOf
   * @throws IOException if the JSON string is invalid with respect to GetCustomFieldsFromPeople200ResponseDataTypeOneOf
   */
  public static GetCustomFieldsFromPeople200ResponseDataTypeOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCustomFieldsFromPeople200ResponseDataTypeOneOf.class);
  }

  /**
   * Convert an instance of GetCustomFieldsFromPeople200ResponseDataTypeOneOf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

