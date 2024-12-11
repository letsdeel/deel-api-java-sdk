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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GetContractList200ResponseDataInnerClientTeamId;
import org.openapitools.client.model.RootSchema;
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
 * GetContractList200ResponseDataInnerWorker
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractList200ResponseDataInnerWorker {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private GetContractList200ResponseDataInnerClientTeamId id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  @javax.annotation.Nullable
  private URI image;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  @javax.annotation.Nonnull
  private String fullName;

  public static final String SERIALIZED_NAME_ALTERNATE_EMAIL = "alternate_email";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_EMAIL)
  @javax.annotation.Nullable
  private List<RootSchema> alternateEmail = new ArrayList<>();

  public GetContractList200ResponseDataInnerWorker() {
  }

  public GetContractList200ResponseDataInnerWorker id(@javax.annotation.Nonnull GetContractList200ResponseDataInnerClientTeamId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public GetContractList200ResponseDataInnerClientTeamId getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull GetContractList200ResponseDataInnerClientTeamId id) {
    this.id = id;
  }


  public GetContractList200ResponseDataInnerWorker email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * User&#39;s email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public GetContractList200ResponseDataInnerWorker image(@javax.annotation.Nullable URI image) {
    this.image = image;
    return this;
  }

  /**
   * URL of the worker&#39;s profile image.
   * @return image
   */
  @javax.annotation.Nullable
  public URI getImage() {
    return image;
  }

  public void setImage(@javax.annotation.Nullable URI image) {
    this.image = image;
  }


  public GetContractList200ResponseDataInnerWorker fullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name of the worker.
   * @return fullName
   */
  @javax.annotation.Nonnull
  public String getFullName() {
    return fullName;
  }

  public void setFullName(@javax.annotation.Nonnull String fullName) {
    this.fullName = fullName;
  }


  public GetContractList200ResponseDataInnerWorker alternateEmail(@javax.annotation.Nullable List<RootSchema> alternateEmail) {
    this.alternateEmail = alternateEmail;
    return this;
  }

  public GetContractList200ResponseDataInnerWorker addAlternateEmailItem(RootSchema alternateEmailItem) {
    if (this.alternateEmail == null) {
      this.alternateEmail = new ArrayList<>();
    }
    this.alternateEmail.add(alternateEmailItem);
    return this;
  }

  /**
   * List of alternate email addresses.
   * @return alternateEmail
   */
  @javax.annotation.Nullable
  public List<RootSchema> getAlternateEmail() {
    return alternateEmail;
  }

  public void setAlternateEmail(@javax.annotation.Nullable List<RootSchema> alternateEmail) {
    this.alternateEmail = alternateEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractList200ResponseDataInnerWorker getContractList200ResponseDataInnerWorker = (GetContractList200ResponseDataInnerWorker) o;
    return Objects.equals(this.id, getContractList200ResponseDataInnerWorker.id) &&
        Objects.equals(this.email, getContractList200ResponseDataInnerWorker.email) &&
        Objects.equals(this.image, getContractList200ResponseDataInnerWorker.image) &&
        Objects.equals(this.fullName, getContractList200ResponseDataInnerWorker.fullName) &&
        Objects.equals(this.alternateEmail, getContractList200ResponseDataInnerWorker.alternateEmail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, image, fullName, alternateEmail);
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
    sb.append("class GetContractList200ResponseDataInnerWorker {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    alternateEmail: ").append(toIndentedString(alternateEmail)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("image");
    openapiFields.add("full_name");
    openapiFields.add("alternate_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("full_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractList200ResponseDataInnerWorker
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractList200ResponseDataInnerWorker.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractList200ResponseDataInnerWorker is not found in the empty JSON string", GetContractList200ResponseDataInnerWorker.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractList200ResponseDataInnerWorker.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractList200ResponseDataInnerWorker` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetContractList200ResponseDataInnerWorker.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `id`
      GetContractList200ResponseDataInnerClientTeamId.validateJsonElement(jsonObj.get("id"));
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if (!jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if (jsonObj.get("alternate_email") != null && !jsonObj.get("alternate_email").isJsonNull()) {
        JsonArray jsonArrayalternateEmail = jsonObj.getAsJsonArray("alternate_email");
        if (jsonArrayalternateEmail != null) {
          // ensure the json data is an array
          if (!jsonObj.get("alternate_email").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `alternate_email` to be an array in the JSON string but got `%s`", jsonObj.get("alternate_email").toString()));
          }

          // validate the optional field `alternate_email` (array)
          for (int i = 0; i < jsonArrayalternateEmail.size(); i++) {
            RootSchema.validateJsonElement(jsonArrayalternateEmail.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractList200ResponseDataInnerWorker.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractList200ResponseDataInnerWorker' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractList200ResponseDataInnerWorker> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractList200ResponseDataInnerWorker.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractList200ResponseDataInnerWorker>() {
           @Override
           public void write(JsonWriter out, GetContractList200ResponseDataInnerWorker value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractList200ResponseDataInnerWorker read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractList200ResponseDataInnerWorker given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractList200ResponseDataInnerWorker
   * @throws IOException if the JSON string is invalid with respect to GetContractList200ResponseDataInnerWorker
   */
  public static GetContractList200ResponseDataInnerWorker fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractList200ResponseDataInnerWorker.class);
  }

  /**
   * Convert an instance of GetContractList200ResponseDataInnerWorker to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

