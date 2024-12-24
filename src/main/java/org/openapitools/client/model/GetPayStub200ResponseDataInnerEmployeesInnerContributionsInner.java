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
 * GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T19:29:34.997576605Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  /**
   * Type of the contribution.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ROTH("Roth"),
    
    TRAD("Trad");

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
  @javax.annotation.Nullable
  private TypeEnum type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal amount;

  public GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner() {
  }

  public GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the contribution.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner type(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the contribution.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }


  public GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner amount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount contributed.
   * @return amount
   */
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner getPayStub200ResponseDataInnerEmployeesInnerContributionsInner = (GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner) o;
    return Objects.equals(this.name, getPayStub200ResponseDataInnerEmployeesInnerContributionsInner.name) &&
        Objects.equals(this.type, getPayStub200ResponseDataInnerEmployeesInnerContributionsInner.type) &&
        Objects.equals(this.amount, getPayStub200ResponseDataInnerEmployeesInnerContributionsInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner is not found in the empty JSON string", GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner>() {
           @Override
           public void write(JsonWriter out, GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner
   * @throws IOException if the JSON string is invalid with respect to GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner
   */
  public static GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner.class);
  }

  /**
   * Convert an instance of GetPayStub200ResponseDataInnerEmployeesInnerContributionsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

