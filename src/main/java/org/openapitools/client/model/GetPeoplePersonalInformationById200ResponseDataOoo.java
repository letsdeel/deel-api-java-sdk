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
import java.time.LocalDate;
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
 * GetPeoplePersonalInformationById200ResponseDataOoo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class GetPeoplePersonalInformationById200ResponseDataOoo {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  /**
   * The worker leave type.
   */
  @JsonAdapter(LeaveTypeEnum.Adapter.class)
  public enum LeaveTypeEnum {
    LONG_TERM_LEAVE("LONG_TERM_LEAVE"),
    
    SHORT_TERM_LEAVE("SHORT_TERM_LEAVE");

    private String value;

    LeaveTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LeaveTypeEnum fromValue(String value) {
      for (LeaveTypeEnum b : LeaveTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LeaveTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LeaveTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LeaveTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LeaveTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LeaveTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LEAVE_TYPE = "leave_type";
  @SerializedName(SERIALIZED_NAME_LEAVE_TYPE)
  private LeaveTypeEnum leaveType;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public GetPeoplePersonalInformationById200ResponseDataOoo() {
  }

  public GetPeoplePersonalInformationById200ResponseDataOoo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The worker out of office name.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GetPeoplePersonalInformationById200ResponseDataOoo endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The worker out of office end date.
   * @return endDate
   */
  @javax.annotation.Nonnull
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public GetPeoplePersonalInformationById200ResponseDataOoo leaveType(LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
    return this;
  }

  /**
   * The worker leave type.
   * @return leaveType
   */
  @javax.annotation.Nonnull
  public LeaveTypeEnum getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
  }


  public GetPeoplePersonalInformationById200ResponseDataOoo startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The worker out of office start date.
   * @return startDate
   */
  @javax.annotation.Nonnull
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPeoplePersonalInformationById200ResponseDataOoo getPeoplePersonalInformationById200ResponseDataOoo = (GetPeoplePersonalInformationById200ResponseDataOoo) o;
    return Objects.equals(this.name, getPeoplePersonalInformationById200ResponseDataOoo.name) &&
        Objects.equals(this.endDate, getPeoplePersonalInformationById200ResponseDataOoo.endDate) &&
        Objects.equals(this.leaveType, getPeoplePersonalInformationById200ResponseDataOoo.leaveType) &&
        Objects.equals(this.startDate, getPeoplePersonalInformationById200ResponseDataOoo.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, endDate, leaveType, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeoplePersonalInformationById200ResponseDataOoo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("end_date");
    openapiFields.add("leave_type");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("leave_type");
    openapiRequiredFields.add("start_date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPeoplePersonalInformationById200ResponseDataOoo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPeoplePersonalInformationById200ResponseDataOoo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPeoplePersonalInformationById200ResponseDataOoo is not found in the empty JSON string", GetPeoplePersonalInformationById200ResponseDataOoo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPeoplePersonalInformationById200ResponseDataOoo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPeoplePersonalInformationById200ResponseDataOoo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPeoplePersonalInformationById200ResponseDataOoo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if (!jsonObj.get("leave_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leave_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leave_type").toString()));
      }
      // validate the required field `leave_type`
      LeaveTypeEnum.validateJsonElement(jsonObj.get("leave_type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPeoplePersonalInformationById200ResponseDataOoo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPeoplePersonalInformationById200ResponseDataOoo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPeoplePersonalInformationById200ResponseDataOoo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPeoplePersonalInformationById200ResponseDataOoo.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPeoplePersonalInformationById200ResponseDataOoo>() {
           @Override
           public void write(JsonWriter out, GetPeoplePersonalInformationById200ResponseDataOoo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPeoplePersonalInformationById200ResponseDataOoo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPeoplePersonalInformationById200ResponseDataOoo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPeoplePersonalInformationById200ResponseDataOoo
   * @throws IOException if the JSON string is invalid with respect to GetPeoplePersonalInformationById200ResponseDataOoo
   */
  public static GetPeoplePersonalInformationById200ResponseDataOoo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPeoplePersonalInformationById200ResponseDataOoo.class);
  }

  /**
   * Convert an instance of GetPeoplePersonalInformationById200ResponseDataOoo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
