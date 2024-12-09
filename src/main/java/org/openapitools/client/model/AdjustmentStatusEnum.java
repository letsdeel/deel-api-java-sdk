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
 * Adjustment status
 */
@JsonAdapter(AdjustmentStatusEnum.Adapter.class)
public enum AdjustmentStatusEnum {
  
  OPEN("open"),
  
  PENDING_APPROVAL("pending_approval"),
  
  OVERWRITTEN("overwritten"),
  
  FAILED("failed"),
  
  SUCCESS("success");

  private String value;

  AdjustmentStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdjustmentStatusEnum fromValue(String value) {
    for (AdjustmentStatusEnum b : AdjustmentStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdjustmentStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdjustmentStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdjustmentStatusEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdjustmentStatusEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AdjustmentStatusEnum.fromValue(value);
  }
}
