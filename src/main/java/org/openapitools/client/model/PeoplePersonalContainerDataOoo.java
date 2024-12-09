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
 * PeoplePersonalContainerDataOoo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T12:37:40.520952+01:00[Europe/Warsaw]", comments = "Generator version: 7.9.0")
public class PeoplePersonalContainerDataOoo {
  /**
   * The type of leave.
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

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public PeoplePersonalContainerDataOoo() {
  }

  public PeoplePersonalContainerDataOoo leaveType(LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
    return this;
  }

  /**
   * The type of leave.
   * @return leaveType
   */
  @javax.annotation.Nullable
  public LeaveTypeEnum getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(LeaveTypeEnum leaveType) {
    this.leaveType = leaveType;
  }


  public PeoplePersonalContainerDataOoo startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the leave.
   * @return startDate
   */
  @javax.annotation.Nullable
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public PeoplePersonalContainerDataOoo endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The end date of the leave.
   * @return endDate
   */
  @javax.annotation.Nullable
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public PeoplePersonalContainerDataOoo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the leave.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeoplePersonalContainerDataOoo peoplePersonalContainerDataOoo = (PeoplePersonalContainerDataOoo) o;
    return Objects.equals(this.leaveType, peoplePersonalContainerDataOoo.leaveType) &&
        Objects.equals(this.startDate, peoplePersonalContainerDataOoo.startDate) &&
        Objects.equals(this.endDate, peoplePersonalContainerDataOoo.endDate) &&
        Objects.equals(this.name, peoplePersonalContainerDataOoo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveType, startDate, endDate, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeoplePersonalContainerDataOoo {\n");
    sb.append("    leaveType: ").append(toIndentedString(leaveType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("leave_type");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PeoplePersonalContainerDataOoo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PeoplePersonalContainerDataOoo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeoplePersonalContainerDataOoo is not found in the empty JSON string", PeoplePersonalContainerDataOoo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PeoplePersonalContainerDataOoo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PeoplePersonalContainerDataOoo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("leave_type") != null && !jsonObj.get("leave_type").isJsonNull()) && !jsonObj.get("leave_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leave_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leave_type").toString()));
      }
      // validate the optional field `leave_type`
      if (jsonObj.get("leave_type") != null && !jsonObj.get("leave_type").isJsonNull()) {
        LeaveTypeEnum.validateJsonElement(jsonObj.get("leave_type"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeoplePersonalContainerDataOoo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeoplePersonalContainerDataOoo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeoplePersonalContainerDataOoo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeoplePersonalContainerDataOoo.class));

       return (TypeAdapter<T>) new TypeAdapter<PeoplePersonalContainerDataOoo>() {
           @Override
           public void write(JsonWriter out, PeoplePersonalContainerDataOoo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PeoplePersonalContainerDataOoo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PeoplePersonalContainerDataOoo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PeoplePersonalContainerDataOoo
   * @throws IOException if the JSON string is invalid with respect to PeoplePersonalContainerDataOoo
   */
  public static PeoplePersonalContainerDataOoo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeoplePersonalContainerDataOoo.class);
  }

  /**
   * Convert an instance of PeoplePersonalContainerDataOoo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
