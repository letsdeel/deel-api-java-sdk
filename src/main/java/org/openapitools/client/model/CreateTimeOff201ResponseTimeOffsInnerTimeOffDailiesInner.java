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
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T17:29:26.705508686Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private UUID id;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nonnull
  private OffsetDateTime date;

  /**
   * The type of the time off daily
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    WORKING_DAY("WORKING_DAY"),
    
    NON_WORKING_DAY("NON_WORKING_DAY"),
    
    HOLIDAY("HOLIDAY");

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

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private Float amount;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_TIME_OFF_ID = "time_off_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_ID)
  @javax.annotation.Nonnull
  private UUID timeOffId;

  public CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner() {
  }

  public CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner id(@javax.annotation.Nonnull UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The time off daily id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull UUID id) {
    this.id = id;
  }


  public CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner date(@javax.annotation.Nonnull OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The date of the time off daily
   * @return date
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nonnull OffsetDateTime date) {
    this.date = date;
  }


  public CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the time off daily
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner amount(@javax.annotation.Nonnull Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the time off daily
   * @return amount
   */
  @javax.annotation.Nonnull
  public Float getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull Float amount) {
    this.amount = amount;
  }


  public CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation date of the time off daily
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The update date of the time off daily
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the time off daily
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner timeOffId(@javax.annotation.Nonnull UUID timeOffId) {
    this.timeOffId = timeOffId;
    return this;
  }

  /**
   * The time off id
   * @return timeOffId
   */
  @javax.annotation.Nonnull
  public UUID getTimeOffId() {
    return timeOffId;
  }

  public void setTimeOffId(@javax.annotation.Nonnull UUID timeOffId) {
    this.timeOffId = timeOffId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner createTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner = (CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner) o;
    return Objects.equals(this.id, createTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.id) &&
        Objects.equals(this.date, createTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.date) &&
        Objects.equals(this.type, createTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.type) &&
        Objects.equals(this.amount, createTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.amount) &&
        Objects.equals(this.createdAt, createTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.createdAt) &&
        Objects.equals(this.updatedAt, createTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.updatedAt) &&
        Objects.equals(this.description, createTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.description) &&
        Objects.equals(this.timeOffId, createTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.timeOffId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, type, amount, createdAt, updatedAt, description, timeOffId);
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
    sb.append("class CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timeOffId: ").append(toIndentedString(timeOffId)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("type");
    openapiFields.add("amount");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("description");
    openapiFields.add("time_off_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("time_off_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner is not found in the empty JSON string", CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("time_off_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner>() {
           @Override
           public void write(JsonWriter out, CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner
   * @throws IOException if the JSON string is invalid with respect to CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner
   */
  public static CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.class);
  }

  /**
   * Convert an instance of CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

