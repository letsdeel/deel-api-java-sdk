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
 * type of files allowed when uploading attachments
 */
@JsonAdapter(FileRefTypeEnum.Adapter.class)
public enum FileRefTypeEnum {
  
  APPLICATION_PDF("application/pdf"),
  
  TEXT_CSV("text/csv"),
  
  TEXT_PLAIN("text/plain"),
  
  IMAGE_JPEG("image/jpeg"),
  
  IMAGE_PNG("image/png");

  private String value;

  FileRefTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileRefTypeEnum fromValue(String value) {
    for (FileRefTypeEnum b : FileRefTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileRefTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileRefTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileRefTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileRefTypeEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    FileRefTypeEnum.fromValue(value);
  }
}
