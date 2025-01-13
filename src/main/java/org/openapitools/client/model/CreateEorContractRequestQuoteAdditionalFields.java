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
 * Some countries require additional employee information for employment contracts.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateEorContractRequestQuoteAdditionalFields {
  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  @javax.annotation.Nullable
  private String dob;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  @javax.annotation.Nullable
  private String gender;

  /**
   * Type of worker.
   */
  @JsonAdapter(WorkerTypeEnum.Adapter.class)
  public enum WorkerTypeEnum {
    SKILLED("Skilled"),
    
    UNSKILLED("Unskilled");

    private String value;

    WorkerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkerTypeEnum fromValue(String value) {
      for (WorkerTypeEnum b : WorkerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WorkerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WorkerTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WorkerTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WORKER_TYPE = "worker_type";
  @SerializedName(SERIALIZED_NAME_WORKER_TYPE)
  @javax.annotation.Nullable
  private WorkerTypeEnum workerType;

  public CreateEorContractRequestQuoteAdditionalFields() {
  }

  public CreateEorContractRequestQuoteAdditionalFields dob(@javax.annotation.Nullable String dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Employee&#39;s date of birth.
   * @return dob
   */
  @javax.annotation.Nullable
  public String getDob() {
    return dob;
  }

  public void setDob(@javax.annotation.Nullable String dob) {
    this.dob = dob;
  }


  public CreateEorContractRequestQuoteAdditionalFields gender(@javax.annotation.Nullable String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Employee&#39;s gender.
   * @return gender
   */
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }

  public void setGender(@javax.annotation.Nullable String gender) {
    this.gender = gender;
  }


  public CreateEorContractRequestQuoteAdditionalFields workerType(@javax.annotation.Nullable WorkerTypeEnum workerType) {
    this.workerType = workerType;
    return this;
  }

  /**
   * Type of worker.
   * @return workerType
   */
  @javax.annotation.Nullable
  public WorkerTypeEnum getWorkerType() {
    return workerType;
  }

  public void setWorkerType(@javax.annotation.Nullable WorkerTypeEnum workerType) {
    this.workerType = workerType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEorContractRequestQuoteAdditionalFields createEorContractRequestQuoteAdditionalFields = (CreateEorContractRequestQuoteAdditionalFields) o;
    return Objects.equals(this.dob, createEorContractRequestQuoteAdditionalFields.dob) &&
        Objects.equals(this.gender, createEorContractRequestQuoteAdditionalFields.gender) &&
        Objects.equals(this.workerType, createEorContractRequestQuoteAdditionalFields.workerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dob, gender, workerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEorContractRequestQuoteAdditionalFields {\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    workerType: ").append(toIndentedString(workerType)).append("\n");
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
    openapiFields.add("dob");
    openapiFields.add("gender");
    openapiFields.add("worker_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateEorContractRequestQuoteAdditionalFields
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateEorContractRequestQuoteAdditionalFields.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateEorContractRequestQuoteAdditionalFields is not found in the empty JSON string", CreateEorContractRequestQuoteAdditionalFields.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateEorContractRequestQuoteAdditionalFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateEorContractRequestQuoteAdditionalFields` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dob") != null && !jsonObj.get("dob").isJsonNull()) && !jsonObj.get("dob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dob").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("worker_type") != null && !jsonObj.get("worker_type").isJsonNull()) && !jsonObj.get("worker_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worker_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worker_type").toString()));
      }
      // validate the optional field `worker_type`
      if (jsonObj.get("worker_type") != null && !jsonObj.get("worker_type").isJsonNull()) {
        WorkerTypeEnum.validateJsonElement(jsonObj.get("worker_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateEorContractRequestQuoteAdditionalFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateEorContractRequestQuoteAdditionalFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateEorContractRequestQuoteAdditionalFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateEorContractRequestQuoteAdditionalFields.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateEorContractRequestQuoteAdditionalFields>() {
           @Override
           public void write(JsonWriter out, CreateEorContractRequestQuoteAdditionalFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateEorContractRequestQuoteAdditionalFields read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateEorContractRequestQuoteAdditionalFields given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateEorContractRequestQuoteAdditionalFields
   * @throws IOException if the JSON string is invalid with respect to CreateEorContractRequestQuoteAdditionalFields
   */
  public static CreateEorContractRequestQuoteAdditionalFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateEorContractRequestQuoteAdditionalFields.class);
  }

  /**
   * Convert an instance of CreateEorContractRequestQuoteAdditionalFields to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

