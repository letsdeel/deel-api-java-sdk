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
 * GetCustomFieldsFromPeople200ResponseDataTypeOneOf2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:40:51.396070831Z[GMT]", comments = "Generator version: 7.10.0")
public class GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 {
  /**
   * List types
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    LIST("list"),
    
    MULTISELECT("multiselect");

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

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  @javax.annotation.Nullable
  private List<String> options = new ArrayList<>();

  public GetCustomFieldsFromPeople200ResponseDataTypeOneOf2() {
  }

  public GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 name(@javax.annotation.Nullable NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * List types
   * @return name
   */
  @javax.annotation.Nullable
  public NameEnum getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable NameEnum name) {
    this.name = name;
  }


  public GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 options(@javax.annotation.Nullable List<String> options) {
    this.options = options;
    return this;
  }

  public GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * List of options for the custom field
   * @return options
   */
  @javax.annotation.Nullable
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(@javax.annotation.Nullable List<String> options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 getCustomFieldsFromPeople200ResponseDataTypeOneOf2 = (GetCustomFieldsFromPeople200ResponseDataTypeOneOf2) o;
    return Objects.equals(this.name, getCustomFieldsFromPeople200ResponseDataTypeOneOf2.name) &&
        Objects.equals(this.options, getCustomFieldsFromPeople200ResponseDataTypeOneOf2.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCustomFieldsFromPeople200ResponseDataTypeOneOf2
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCustomFieldsFromPeople200ResponseDataTypeOneOf2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 is not found in the empty JSON string", GetCustomFieldsFromPeople200ResponseDataTypeOneOf2.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCustomFieldsFromPeople200ResponseDataTypeOneOf2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCustomFieldsFromPeople200ResponseDataTypeOneOf2` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull() && !jsonObj.get("options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCustomFieldsFromPeople200ResponseDataTypeOneOf2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCustomFieldsFromPeople200ResponseDataTypeOneOf2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCustomFieldsFromPeople200ResponseDataTypeOneOf2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldsFromPeople200ResponseDataTypeOneOf2.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCustomFieldsFromPeople200ResponseDataTypeOneOf2>() {
           @Override
           public void write(JsonWriter out, GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCustomFieldsFromPeople200ResponseDataTypeOneOf2
   * @throws IOException if the JSON string is invalid with respect to GetCustomFieldsFromPeople200ResponseDataTypeOneOf2
   */
  public static GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCustomFieldsFromPeople200ResponseDataTypeOneOf2.class);
  }

  /**
   * Convert an instance of GetCustomFieldsFromPeople200ResponseDataTypeOneOf2 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

