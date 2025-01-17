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
 * InviteToSignContractRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class InviteToSignContractRequestData {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  /**
   * Locale of the email
   */
  @JsonAdapter(LocaleEnum.Adapter.class)
  public enum LocaleEnum {
    EN("en"),
    
    ES("es"),
    
    FR("fr"),
    
    DE("de"),
    
    IT("it"),
    
    PT("pt"),
    
    PL("pl"),
    
    NN("nn"),
    
    NL("nl"),
    
    DA("da"),
    
    DE_AT("deAT"),
    
    FI("fi"),
    
    SV("sv"),
    
    NL_BE("nlBE"),
    
    JA("ja");

    private String value;

    LocaleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LocaleEnum fromValue(String value) {
      for (LocaleEnum b : LocaleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LocaleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LocaleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LocaleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LocaleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LocaleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  @javax.annotation.Nullable
  private LocaleEnum locale = LocaleEnum.EN;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public InviteToSignContractRequestData() {
  }

  public InviteToSignContractRequestData email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Worker email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public InviteToSignContractRequestData locale(@javax.annotation.Nullable LocaleEnum locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Locale of the email
   * @return locale
   */
  @javax.annotation.Nullable
  public LocaleEnum getLocale() {
    return locale;
  }

  public void setLocale(@javax.annotation.Nullable LocaleEnum locale) {
    this.locale = locale;
  }


  public InviteToSignContractRequestData message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Message to the worker
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteToSignContractRequestData inviteToSignContractRequestData = (InviteToSignContractRequestData) o;
    return Objects.equals(this.email, inviteToSignContractRequestData.email) &&
        Objects.equals(this.locale, inviteToSignContractRequestData.locale) &&
        Objects.equals(this.message, inviteToSignContractRequestData.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, locale, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteToSignContractRequestData {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("locale");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InviteToSignContractRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InviteToSignContractRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InviteToSignContractRequestData is not found in the empty JSON string", InviteToSignContractRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InviteToSignContractRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InviteToSignContractRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      // validate the optional field `locale`
      if (jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) {
        LocaleEnum.validateJsonElement(jsonObj.get("locale"));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InviteToSignContractRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InviteToSignContractRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InviteToSignContractRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InviteToSignContractRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<InviteToSignContractRequestData>() {
           @Override
           public void write(JsonWriter out, InviteToSignContractRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InviteToSignContractRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InviteToSignContractRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InviteToSignContractRequestData
   * @throws IOException if the JSON string is invalid with respect to InviteToSignContractRequestData
   */
  public static InviteToSignContractRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InviteToSignContractRequestData.class);
  }

  /**
   * Convert an instance of InviteToSignContractRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

