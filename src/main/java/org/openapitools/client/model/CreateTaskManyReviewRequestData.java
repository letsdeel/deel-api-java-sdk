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
import java.util.UUID;
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
 * CreateTaskManyReviewRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T12:32:05.400762149Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateTaskManyReviewRequestData {
  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  @javax.annotation.Nonnull
  private List<UUID> ids = new ArrayList<>();

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @javax.annotation.Nullable
  private String reason;

  /**
   * The review status of the tasks. Possible values are &#39;approved&#39; or &#39;declined&#39;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    APPROVED("approved"),
    
    DECLINED("declined");

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

  public CreateTaskManyReviewRequestData() {
  }

  public CreateTaskManyReviewRequestData ids(@javax.annotation.Nonnull List<UUID> ids) {
    this.ids = ids;
    return this;
  }

  public CreateTaskManyReviewRequestData addIdsItem(UUID idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * An array of task IDs to review. A maximum of 1000 task IDs is allowed per request.
   * @return ids
   */
  @javax.annotation.Nonnull
  public List<UUID> getIds() {
    return ids;
  }

  public void setIds(@javax.annotation.Nonnull List<UUID> ids) {
    this.ids = ids;
  }


  public CreateTaskManyReviewRequestData reason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Optional reason for declining the tasks.
   * @return reason
   */
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }

  public void setReason(@javax.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public CreateTaskManyReviewRequestData status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The review status of the tasks. Possible values are &#39;approved&#39; or &#39;declined&#39;.
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTaskManyReviewRequestData createTaskManyReviewRequestData = (CreateTaskManyReviewRequestData) o;
    return Objects.equals(this.ids, createTaskManyReviewRequestData.ids) &&
        Objects.equals(this.reason, createTaskManyReviewRequestData.reason) &&
        Objects.equals(this.status, createTaskManyReviewRequestData.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, reason, status);
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
    sb.append("class CreateTaskManyReviewRequestData {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("ids");
    openapiFields.add("reason");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ids");
    openapiRequiredFields.add("status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTaskManyReviewRequestData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTaskManyReviewRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTaskManyReviewRequestData is not found in the empty JSON string", CreateTaskManyReviewRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTaskManyReviewRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTaskManyReviewRequestData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTaskManyReviewRequestData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTaskManyReviewRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTaskManyReviewRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTaskManyReviewRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTaskManyReviewRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTaskManyReviewRequestData>() {
           @Override
           public void write(JsonWriter out, CreateTaskManyReviewRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTaskManyReviewRequestData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTaskManyReviewRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTaskManyReviewRequestData
   * @throws IOException if the JSON string is invalid with respect to CreateTaskManyReviewRequestData
   */
  public static CreateTaskManyReviewRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTaskManyReviewRequestData.class);
  }

  /**
   * Convert an instance of CreateTaskManyReviewRequestData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

