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
 * GetCustomFieldFromPeopleById200ResponseDataTypeOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class GetCustomFieldFromPeopleById200ResponseDataTypeOneOf {
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

  public GetCustomFieldFromPeopleById200ResponseDataTypeOneOf() {
  }

  public GetCustomFieldFromPeopleById200ResponseDataTypeOneOf name(@javax.annotation.Nullable NameEnum name) {
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


  public GetCustomFieldFromPeopleById200ResponseDataTypeOneOf options(@javax.annotation.Nullable List<String> options) {
    this.options = options;
    return this;
  }

  public GetCustomFieldFromPeopleById200ResponseDataTypeOneOf addOptionsItem(String optionsItem) {
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
    GetCustomFieldFromPeopleById200ResponseDataTypeOneOf getCustomFieldFromPeopleById200ResponseDataTypeOneOf = (GetCustomFieldFromPeopleById200ResponseDataTypeOneOf) o;
    return Objects.equals(this.name, getCustomFieldFromPeopleById200ResponseDataTypeOneOf.name) &&
        Objects.equals(this.options, getCustomFieldFromPeopleById200ResponseDataTypeOneOf.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomFieldFromPeopleById200ResponseDataTypeOneOf {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to GetCustomFieldFromPeopleById200ResponseDataTypeOneOf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCustomFieldFromPeopleById200ResponseDataTypeOneOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCustomFieldFromPeopleById200ResponseDataTypeOneOf is not found in the empty JSON string", GetCustomFieldFromPeopleById200ResponseDataTypeOneOf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCustomFieldFromPeopleById200ResponseDataTypeOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCustomFieldFromPeopleById200ResponseDataTypeOneOf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!GetCustomFieldFromPeopleById200ResponseDataTypeOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCustomFieldFromPeopleById200ResponseDataTypeOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCustomFieldFromPeopleById200ResponseDataTypeOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCustomFieldFromPeopleById200ResponseDataTypeOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCustomFieldFromPeopleById200ResponseDataTypeOneOf>() {
           @Override
           public void write(JsonWriter out, GetCustomFieldFromPeopleById200ResponseDataTypeOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCustomFieldFromPeopleById200ResponseDataTypeOneOf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCustomFieldFromPeopleById200ResponseDataTypeOneOf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCustomFieldFromPeopleById200ResponseDataTypeOneOf
   * @throws IOException if the JSON string is invalid with respect to GetCustomFieldFromPeopleById200ResponseDataTypeOneOf
   */
  public static GetCustomFieldFromPeopleById200ResponseDataTypeOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCustomFieldFromPeopleById200ResponseDataTypeOneOf.class);
  }

  /**
   * Convert an instance of GetCustomFieldFromPeopleById200ResponseDataTypeOneOf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

