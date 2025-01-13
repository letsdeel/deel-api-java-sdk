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
 * CreateContract201ResponseDataInvitations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:23:41.573776663Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateContract201ResponseDataInvitations {
  public static final String SERIALIZED_NAME_CLIENT_EMAIL = "client_email";
  @SerializedName(SERIALIZED_NAME_CLIENT_EMAIL)
  @javax.annotation.Nullable
  private String clientEmail;

  public static final String SERIALIZED_NAME_WORKER_EMAIL = "worker_email";
  @SerializedName(SERIALIZED_NAME_WORKER_EMAIL)
  @javax.annotation.Nullable
  private String workerEmail;

  public CreateContract201ResponseDataInvitations() {
  }

  public CreateContract201ResponseDataInvitations clientEmail(@javax.annotation.Nullable String clientEmail) {
    this.clientEmail = clientEmail;
    return this;
  }

  /**
   * User&#39;s email address.
   * @return clientEmail
   */
  @javax.annotation.Nullable
  public String getClientEmail() {
    return clientEmail;
  }

  public void setClientEmail(@javax.annotation.Nullable String clientEmail) {
    this.clientEmail = clientEmail;
  }


  public CreateContract201ResponseDataInvitations workerEmail(@javax.annotation.Nullable String workerEmail) {
    this.workerEmail = workerEmail;
    return this;
  }

  /**
   * User&#39;s email address.
   * @return workerEmail
   */
  @javax.annotation.Nullable
  public String getWorkerEmail() {
    return workerEmail;
  }

  public void setWorkerEmail(@javax.annotation.Nullable String workerEmail) {
    this.workerEmail = workerEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContract201ResponseDataInvitations createContract201ResponseDataInvitations = (CreateContract201ResponseDataInvitations) o;
    return Objects.equals(this.clientEmail, createContract201ResponseDataInvitations.clientEmail) &&
        Objects.equals(this.workerEmail, createContract201ResponseDataInvitations.workerEmail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientEmail, workerEmail);
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
    sb.append("class CreateContract201ResponseDataInvitations {\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    workerEmail: ").append(toIndentedString(workerEmail)).append("\n");
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
    openapiFields.add("client_email");
    openapiFields.add("worker_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateContract201ResponseDataInvitations
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContract201ResponseDataInvitations.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContract201ResponseDataInvitations is not found in the empty JSON string", CreateContract201ResponseDataInvitations.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateContract201ResponseDataInvitations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateContract201ResponseDataInvitations` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("client_email") != null && !jsonObj.get("client_email").isJsonNull()) && !jsonObj.get("client_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_email").toString()));
      }
      if ((jsonObj.get("worker_email") != null && !jsonObj.get("worker_email").isJsonNull()) && !jsonObj.get("worker_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worker_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worker_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContract201ResponseDataInvitations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContract201ResponseDataInvitations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContract201ResponseDataInvitations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContract201ResponseDataInvitations.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContract201ResponseDataInvitations>() {
           @Override
           public void write(JsonWriter out, CreateContract201ResponseDataInvitations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContract201ResponseDataInvitations read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContract201ResponseDataInvitations given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContract201ResponseDataInvitations
   * @throws IOException if the JSON string is invalid with respect to CreateContract201ResponseDataInvitations
   */
  public static CreateContract201ResponseDataInvitations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContract201ResponseDataInvitations.class);
  }

  /**
   * Convert an instance of CreateContract201ResponseDataInvitations to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

