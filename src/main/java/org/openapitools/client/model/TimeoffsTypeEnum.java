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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets TimeoffsTypeEnum
 */
@JsonAdapter(TimeoffsTypeEnum.Adapter.class)
public enum TimeoffsTypeEnum {
  
  VACATION("VACATION"),
  
  SICK_LEAVE("SICK_LEAVE"),
  
  OTHER("OTHER");

  private String value;

  TimeoffsTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TimeoffsTypeEnum fromValue(String value) {
    for (TimeoffsTypeEnum b : TimeoffsTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TimeoffsTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final TimeoffsTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TimeoffsTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TimeoffsTypeEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TimeoffsTypeEnum.fromValue(value);
  }
}
