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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.client.model.GetBackgroundChecksByContractId200ResponseDataPackage;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * BgCheckForContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class BgCheckForContract {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_THIRD_PARTY_NAME = "third_party_name";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_NAME)
  @javax.annotation.Nullable
  private String thirdPartyName;

  /**
   * The status of the background check.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    WAITING_CONTRACTOR_SIGNATURE("WAITING_CONTRACTOR_SIGNATURE"),
    
    READY_TO_BE_REQUESTED("READY_TO_BE_REQUESTED"),
    
    REQUESTED("REQUESTED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DRAFT("DRAFT"),
    
    COMPLETE("COMPLETE"),
    
    CANCELLED("CANCELLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_IS_COMPLETE = "is_complete";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETE)
  @javax.annotation.Nullable
  private Boolean isComplete;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime completedAt;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  @javax.annotation.Nullable
  private GetBackgroundChecksByContractId200ResponseDataPackage _package;

  public static final String SERIALIZED_NAME_CANDIDATE_EMAIL = "candidate_email";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_EMAIL)
  @javax.annotation.Nullable
  private String candidateEmail;

  public BgCheckForContract() {
  }

  public BgCheckForContract id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the background check.
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public BgCheckForContract name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the background check.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public BgCheckForContract thirdPartyName(@javax.annotation.Nullable String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
    return this;
  }

  /**
   * Third-party name of the background check.
   * @return thirdPartyName
   */
  @javax.annotation.Nullable
  public String getThirdPartyName() {
    return thirdPartyName;
  }

  public void setThirdPartyName(@javax.annotation.Nullable String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
  }


  public BgCheckForContract status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the background check.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public BgCheckForContract isComplete(@javax.annotation.Nullable Boolean isComplete) {
    this.isComplete = isComplete;
    return this;
  }

  /**
   * Whether the background check is complete.
   * @return isComplete
   */
  @javax.annotation.Nullable
  public Boolean getIsComplete() {
    return isComplete;
  }

  public void setIsComplete(@javax.annotation.Nullable Boolean isComplete) {
    this.isComplete = isComplete;
  }


  public BgCheckForContract createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public BgCheckForContract completedAt(@javax.annotation.Nullable OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return completedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(@javax.annotation.Nullable OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  public BgCheckForContract _package(@javax.annotation.Nullable GetBackgroundChecksByContractId200ResponseDataPackage _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
   */
  @javax.annotation.Nullable
  public GetBackgroundChecksByContractId200ResponseDataPackage getPackage() {
    return _package;
  }

  public void setPackage(@javax.annotation.Nullable GetBackgroundChecksByContractId200ResponseDataPackage _package) {
    this._package = _package;
  }


  public BgCheckForContract candidateEmail(@javax.annotation.Nullable String candidateEmail) {
    this.candidateEmail = candidateEmail;
    return this;
  }

  /**
   * The email of the candidate.
   * @return candidateEmail
   */
  @javax.annotation.Nullable
  public String getCandidateEmail() {
    return candidateEmail;
  }

  public void setCandidateEmail(@javax.annotation.Nullable String candidateEmail) {
    this.candidateEmail = candidateEmail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgCheckForContract bgCheckForContract = (BgCheckForContract) o;
    return Objects.equals(this.id, bgCheckForContract.id) &&
        Objects.equals(this.name, bgCheckForContract.name) &&
        Objects.equals(this.thirdPartyName, bgCheckForContract.thirdPartyName) &&
        Objects.equals(this.status, bgCheckForContract.status) &&
        Objects.equals(this.isComplete, bgCheckForContract.isComplete) &&
        Objects.equals(this.createdAt, bgCheckForContract.createdAt) &&
        Objects.equals(this.completedAt, bgCheckForContract.completedAt) &&
        Objects.equals(this._package, bgCheckForContract._package) &&
        Objects.equals(this.candidateEmail, bgCheckForContract.candidateEmail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, thirdPartyName, status, isComplete, createdAt, completedAt, _package, candidateEmail);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgCheckForContract {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    thirdPartyName: ").append(toIndentedString(thirdPartyName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isComplete: ").append(toIndentedString(isComplete)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    candidateEmail: ").append(toIndentedString(candidateEmail)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("third_party_name");
    openapiFields.add("status");
    openapiFields.add("is_complete");
    openapiFields.add("created_at");
    openapiFields.add("completed_at");
    openapiFields.add("package");
    openapiFields.add("candidate_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BgCheckForContract
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BgCheckForContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BgCheckForContract is not found in the empty JSON string", BgCheckForContract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BgCheckForContract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BgCheckForContract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("third_party_name") != null && !jsonObj.get("third_party_name").isJsonNull()) && !jsonObj.get("third_party_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_party_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_party_name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `package`
      if (jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) {
        GetBackgroundChecksByContractId200ResponseDataPackage.validateJsonElement(jsonObj.get("package"));
      }
      if ((jsonObj.get("candidate_email") != null && !jsonObj.get("candidate_email").isJsonNull()) && !jsonObj.get("candidate_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `candidate_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("candidate_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BgCheckForContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BgCheckForContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BgCheckForContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BgCheckForContract.class));

       return (TypeAdapter<T>) new TypeAdapter<BgCheckForContract>() {
           @Override
           public void write(JsonWriter out, BgCheckForContract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BgCheckForContract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BgCheckForContract given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BgCheckForContract
   * @throws IOException if the JSON string is invalid with respect to BgCheckForContract
   */
  public static BgCheckForContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BgCheckForContract.class);
  }

  /**
   * Convert an instance of BgCheckForContract to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

