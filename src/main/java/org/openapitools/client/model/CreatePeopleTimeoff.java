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
import java.io.File;
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
 * CreatePeopleTimeoff
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class CreatePeopleTimeoff {
  /**
   * Time off type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VACATION("VACATION"),
    
    SICK_LEAVE("SICK_LEAVE"),
    
    OTHER("OTHER");

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

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nonnull
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  @javax.annotation.Nonnull
  private String endDate;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @javax.annotation.Nonnull
  private String reason;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  @javax.annotation.Nullable
  private File attachments;

  public CreatePeopleTimeoff() {
  }

  public CreatePeopleTimeoff type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Time off type.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public CreatePeopleTimeoff startDate(@javax.annotation.Nonnull String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of employee&#39;s time off.
   * @return startDate
   */
  @javax.annotation.Nonnull
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nonnull String startDate) {
    this.startDate = startDate;
  }


  public CreatePeopleTimeoff endDate(@javax.annotation.Nonnull String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of employee&#39;s time off.
   * @return endDate
   */
  @javax.annotation.Nonnull
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(@javax.annotation.Nonnull String endDate) {
    this.endDate = endDate;
  }


  public CreatePeopleTimeoff reason(@javax.annotation.Nonnull String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Description for employee&#39;s time off.
   * @return reason
   */
  @javax.annotation.Nonnull
  public String getReason() {
    return reason;
  }

  public void setReason(@javax.annotation.Nonnull String reason) {
    this.reason = reason;
  }


  public CreatePeopleTimeoff attachments(@javax.annotation.Nullable File attachments) {
    this.attachments = attachments;
    return this;
  }

  /**
   * Attachments for employee&#39;s time off.
   * @return attachments
   */
  @javax.annotation.Nullable
  public File getAttachments() {
    return attachments;
  }

  public void setAttachments(@javax.annotation.Nullable File attachments) {
    this.attachments = attachments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePeopleTimeoff createPeopleTimeoff = (CreatePeopleTimeoff) o;
    return Objects.equals(this.type, createPeopleTimeoff.type) &&
        Objects.equals(this.startDate, createPeopleTimeoff.startDate) &&
        Objects.equals(this.endDate, createPeopleTimeoff.endDate) &&
        Objects.equals(this.reason, createPeopleTimeoff.reason) &&
        Objects.equals(this.attachments, createPeopleTimeoff.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startDate, endDate, reason, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePeopleTimeoff {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("reason");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("reason");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreatePeopleTimeoff
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatePeopleTimeoff.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePeopleTimeoff is not found in the empty JSON string", CreatePeopleTimeoff.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatePeopleTimeoff.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePeopleTimeoff` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePeopleTimeoff.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if (!jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if (!jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePeopleTimeoff.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePeopleTimeoff' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePeopleTimeoff> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePeopleTimeoff.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePeopleTimeoff>() {
           @Override
           public void write(JsonWriter out, CreatePeopleTimeoff value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePeopleTimeoff read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreatePeopleTimeoff given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatePeopleTimeoff
   * @throws IOException if the JSON string is invalid with respect to CreatePeopleTimeoff
   */
  public static CreatePeopleTimeoff fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePeopleTimeoff.class);
  }

  /**
   * Convert an instance of CreatePeopleTimeoff to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

