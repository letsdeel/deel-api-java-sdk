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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.FileObject;

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
 * RequestCustomVerificationLetterWithFile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class RequestCustomVerificationLetterWithFile {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nonnull
  private String description;

  public static final String SERIALIZED_NAME_INCLUDE_Q_R_CODE = "includeQRCode";
  @SerializedName(SERIALIZED_NAME_INCLUDE_Q_R_CODE)
  @javax.annotation.Nullable
  private Boolean includeQRCode;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VISA_APPLICATION_FOR_PERSONAL_TRIP("VISA_APPLICATION_FOR_PERSONAL_TRIP"),
    
    VISA_APPLICATION_FOR_BUSINESS_TRIP("VISA_APPLICATION_FOR_BUSINESS_TRIP"),
    
    VISA_RENEWAL_CERTIFICATE("VISA_RENEWAL_CERTIFICATE"),
    
    NO_OBJECTION_CERTIFICATE_FOR_TRAVELLING("NO_OBJECTION_CERTIFICATE_FOR_TRAVELLING"),
    
    BANK_VERIFICATION_OR_SALARY_CERTIFICATE("BANK_VERIFICATION_OR_SALARY_CERTIFICATE"),
    
    CUSTOMISED("CUSTOMISED");

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

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  @javax.annotation.Nonnull
  private List<FileObject> files = new ArrayList<>();

  public RequestCustomVerificationLetterWithFile() {
  }

  public RequestCustomVerificationLetterWithFile description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the letter (minimum 25 characters)
   * @return description
   */
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public RequestCustomVerificationLetterWithFile includeQRCode(@javax.annotation.Nullable Boolean includeQRCode) {
    this.includeQRCode = includeQRCode;
    return this;
  }

  /**
   * Flag indicating whether to include a QR code
   * @return includeQRCode
   */
  @javax.annotation.Nullable
  public Boolean getIncludeQRCode() {
    return includeQRCode;
  }

  public void setIncludeQRCode(@javax.annotation.Nullable Boolean includeQRCode) {
    this.includeQRCode = includeQRCode;
  }


  public RequestCustomVerificationLetterWithFile type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public RequestCustomVerificationLetterWithFile files(@javax.annotation.Nonnull List<FileObject> files) {
    this.files = files;
    return this;
  }

  public RequestCustomVerificationLetterWithFile addFilesItem(FileObject filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
   */
  @javax.annotation.Nonnull
  public List<FileObject> getFiles() {
    return files;
  }

  public void setFiles(@javax.annotation.Nonnull List<FileObject> files) {
    this.files = files;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCustomVerificationLetterWithFile requestCustomVerificationLetterWithFile = (RequestCustomVerificationLetterWithFile) o;
    return Objects.equals(this.description, requestCustomVerificationLetterWithFile.description) &&
        Objects.equals(this.includeQRCode, requestCustomVerificationLetterWithFile.includeQRCode) &&
        Objects.equals(this.type, requestCustomVerificationLetterWithFile.type) &&
        Objects.equals(this.files, requestCustomVerificationLetterWithFile.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, includeQRCode, type, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCustomVerificationLetterWithFile {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    includeQRCode: ").append(toIndentedString(includeQRCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("includeQRCode");
    openapiFields.add("type");
    openapiFields.add("files");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("files");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RequestCustomVerificationLetterWithFile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RequestCustomVerificationLetterWithFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestCustomVerificationLetterWithFile is not found in the empty JSON string", RequestCustomVerificationLetterWithFile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RequestCustomVerificationLetterWithFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestCustomVerificationLetterWithFile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RequestCustomVerificationLetterWithFile.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      // ensure the json data is an array
      if (!jsonObj.get("files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
      }

      JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
      // validate the required field `files` (array)
      for (int i = 0; i < jsonArrayfiles.size(); i++) {
        FileObject.validateJsonElement(jsonArrayfiles.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestCustomVerificationLetterWithFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestCustomVerificationLetterWithFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestCustomVerificationLetterWithFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestCustomVerificationLetterWithFile.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestCustomVerificationLetterWithFile>() {
           @Override
           public void write(JsonWriter out, RequestCustomVerificationLetterWithFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestCustomVerificationLetterWithFile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RequestCustomVerificationLetterWithFile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RequestCustomVerificationLetterWithFile
   * @throws IOException if the JSON string is invalid with respect to RequestCustomVerificationLetterWithFile
   */
  public static RequestCustomVerificationLetterWithFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestCustomVerificationLetterWithFile.class);
  }

  /**
   * Convert an instance of RequestCustomVerificationLetterWithFile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

