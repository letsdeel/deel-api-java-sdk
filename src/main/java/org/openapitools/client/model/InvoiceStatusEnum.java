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
 * Current status of the invoice.
 */
@JsonAdapter(InvoiceStatusEnum.Adapter.class)
public enum InvoiceStatusEnum {
  
  PENDING("pending"),
  
  PAID("paid"),
  
  PROCESSING("processing"),
  
  CANCELED("canceled"),
  
  SKIPPED("skipped"),
  
  FAILED("failed"),
  
  REFUNDED("refunded");

  private String value;

  InvoiceStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InvoiceStatusEnum fromValue(String value) {
    for (InvoiceStatusEnum b : InvoiceStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InvoiceStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final InvoiceStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InvoiceStatusEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InvoiceStatusEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    InvoiceStatusEnum.fromValue(value);
  }
}

