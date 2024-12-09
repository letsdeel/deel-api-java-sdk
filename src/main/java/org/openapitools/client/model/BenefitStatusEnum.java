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
 * Gets or Sets BenefitStatusEnum
 */
@JsonAdapter(BenefitStatusEnum.Adapter.class)
public enum BenefitStatusEnum {
  
  REQUIRED("REQUIRED"),
  
  ENABLED("ENABLED"),
  
  DISABLED("DISABLED");

  private String value;

  BenefitStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BenefitStatusEnum fromValue(String value) {
    for (BenefitStatusEnum b : BenefitStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BenefitStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final BenefitStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BenefitStatusEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BenefitStatusEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    BenefitStatusEnum.fromValue(value);
  }
}

