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
 * Gets or Sets PeopleSortByEnum
 */
@JsonAdapter(PeopleSortByEnum.Adapter.class)
public enum PeopleSortByEnum {
  
  ID("id"),
  
  FIRST_NAME("first_name"),
  
  LAST_NAME("last_name"),
  
  FULL_NAME("full_name"),
  
  EMAIL("email"),
  
  COUNTRY("country"),
  
  BIRTH_DATE("birth_date"),
  
  HIRING_TYPE("hiring_type"),
  
  START_DATE("start_date"),
  
  TEAM("team"),
  
  JOB_TITLE("job_title"),
  
  HIRING_STATUS("hiring_status"),
  
  COMPLETION_DATE("completion_date"),
  
  DIRECT_MANAGER("direct_manager"),
  
  DIRECT_REPORTS_COUNT("direct_reports_count");

  private String value;

  PeopleSortByEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PeopleSortByEnum fromValue(String value) {
    for (PeopleSortByEnum b : PeopleSortByEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PeopleSortByEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final PeopleSortByEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PeopleSortByEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PeopleSortByEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    PeopleSortByEnum.fromValue(value);
  }
}
