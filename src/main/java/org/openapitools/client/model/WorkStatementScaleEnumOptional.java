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
 * Defines the scale at which the amount is paid. For example, enter &#39;hourly&#39; to define the amount per hour. This field can be excluded when creating a Pay-as-you-go task-based or Milestone contracts.
 */
@JsonAdapter(WorkStatementScaleEnumOptional.Adapter.class)
public enum WorkStatementScaleEnumOptional {
  
  HOURLY("hourly"),
  
  DAILY("daily"),
  
  WEEKLY("weekly"),
  
  MONTHLY("monthly"),
  
  BIWEEKLY("biweekly"),
  
  SEMIMONTHLY("semimonthly"),
  
  CUSTOM("custom");

  private String value;

  WorkStatementScaleEnumOptional(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WorkStatementScaleEnumOptional fromValue(String value) {
    for (WorkStatementScaleEnumOptional b : WorkStatementScaleEnumOptional.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WorkStatementScaleEnumOptional> {
    @Override
    public void write(final JsonWriter jsonWriter, final WorkStatementScaleEnumOptional enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WorkStatementScaleEnumOptional read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WorkStatementScaleEnumOptional.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    WorkStatementScaleEnumOptional.fromValue(value);
  }
}

