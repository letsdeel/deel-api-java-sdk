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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.ClientOfBasicContract;
import org.openapitools.client.model.ContractStatusEnum;
import org.openapitools.client.model.ContractTypeEnum;
import org.openapitools.client.model.ContractWhoReportsEnum;
import org.openapitools.client.model.InvitationsOfBasicContract;
import org.openapitools.client.model.SignaturesOfBasicContract;
import org.openapitools.client.model.WorkerOfBasicContract;
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
 * BasicContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:39:46.997965815Z[GMT]", comments = "Generator version: 7.10.0")
public class BasicContract {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private ContractTypeEnum type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private ContractStatusEnum status;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nonnull
  private ClientOfBasicContract client;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  @javax.annotation.Nullable
  private WorkerOfBasicContract worker;

  public static final String SERIALIZED_NAME_INVITATIONS = "invitations";
  @SerializedName(SERIALIZED_NAME_INVITATIONS)
  @javax.annotation.Nonnull
  private InvitationsOfBasicContract invitations;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  @javax.annotation.Nonnull
  private SignaturesOfBasicContract signatures;

  public static final String SERIALIZED_NAME_IS_SHIELDED = "is_shielded";
  @SerializedName(SERIALIZED_NAME_IS_SHIELDED)
  @javax.annotation.Nonnull
  private Boolean isShielded;

  public static final String SERIALIZED_NAME_IS_ARCHIVED = "is_archived";
  @SerializedName(SERIALIZED_NAME_IS_ARCHIVED)
  @javax.annotation.Nonnull
  private Boolean isArchived;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime terminationDate;

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal noticePeriod = new BigDecimal("0");

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nullable
  private String scale;

  public static final String SERIALIZED_NAME_WHO_REPORTS = "who_reports";
  @SerializedName(SERIALIZED_NAME_WHO_REPORTS)
  @javax.annotation.Nullable
  private ContractWhoReportsEnum whoReports;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public BasicContract() {
  }

  public BasicContract id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public BasicContract title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public BasicContract type(@javax.annotation.Nonnull ContractTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public ContractTypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull ContractTypeEnum type) {
    this.type = type;
  }


  public BasicContract status(@javax.annotation.Nonnull ContractStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public ContractStatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull ContractStatusEnum status) {
    this.status = status;
  }


  public BasicContract client(@javax.annotation.Nonnull ClientOfBasicContract client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nonnull
  public ClientOfBasicContract getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nonnull ClientOfBasicContract client) {
    this.client = client;
  }


  public BasicContract worker(@javax.annotation.Nullable WorkerOfBasicContract worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
   */
  @javax.annotation.Nullable
  public WorkerOfBasicContract getWorker() {
    return worker;
  }

  public void setWorker(@javax.annotation.Nullable WorkerOfBasicContract worker) {
    this.worker = worker;
  }


  public BasicContract invitations(@javax.annotation.Nonnull InvitationsOfBasicContract invitations) {
    this.invitations = invitations;
    return this;
  }

  /**
   * Get invitations
   * @return invitations
   */
  @javax.annotation.Nonnull
  public InvitationsOfBasicContract getInvitations() {
    return invitations;
  }

  public void setInvitations(@javax.annotation.Nonnull InvitationsOfBasicContract invitations) {
    this.invitations = invitations;
  }


  public BasicContract signatures(@javax.annotation.Nonnull SignaturesOfBasicContract signatures) {
    this.signatures = signatures;
    return this;
  }

  /**
   * Get signatures
   * @return signatures
   */
  @javax.annotation.Nonnull
  public SignaturesOfBasicContract getSignatures() {
    return signatures;
  }

  public void setSignatures(@javax.annotation.Nonnull SignaturesOfBasicContract signatures) {
    this.signatures = signatures;
  }


  public BasicContract isShielded(@javax.annotation.Nonnull Boolean isShielded) {
    this.isShielded = isShielded;
    return this;
  }

  /**
   * Get isShielded
   * @return isShielded
   */
  @javax.annotation.Nonnull
  public Boolean getIsShielded() {
    return isShielded;
  }

  public void setIsShielded(@javax.annotation.Nonnull Boolean isShielded) {
    this.isShielded = isShielded;
  }


  public BasicContract isArchived(@javax.annotation.Nonnull Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * Get isArchived
   * @return isArchived
   */
  @javax.annotation.Nonnull
  public Boolean getIsArchived() {
    return isArchived;
  }

  public void setIsArchived(@javax.annotation.Nonnull Boolean isArchived) {
    this.isArchived = isArchived;
  }


  public BasicContract createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
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


  public BasicContract terminationDate(@javax.annotation.Nullable OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

  /**
   * Long date-time format following ISO-8601
   * @return terminationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(@javax.annotation.Nullable OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
  }


  public BasicContract noticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
    this.noticePeriod = noticePeriod;
    return this;
  }

  /**
   * Days before to notice the termination of contract for eather party.
   * minimum: 0
   * @return noticePeriod
   */
  @javax.annotation.Nullable
  public BigDecimal getNoticePeriod() {
    return noticePeriod;
  }

  public void setNoticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
    this.noticePeriod = noticePeriod;
  }


  public BasicContract scale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * The payment scale (e.g., hourly, weekly, monthly, etc.)
   * @return scale
   */
  @javax.annotation.Nullable
  public String getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
  }


  public BasicContract whoReports(@javax.annotation.Nullable ContractWhoReportsEnum whoReports) {
    this.whoReports = whoReports;
    return this;
  }

  /**
   * Get whoReports
   * @return whoReports
   */
  @javax.annotation.Nullable
  public ContractWhoReportsEnum getWhoReports() {
    return whoReports;
  }

  public void setWhoReports(@javax.annotation.Nullable ContractWhoReportsEnum whoReports) {
    this.whoReports = whoReports;
  }


  public BasicContract externalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * A unique identifier for the object provided by an external system.
   * @return externalId
   */
  @javax.annotation.Nullable
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicContract basicContract = (BasicContract) o;
    return Objects.equals(this.id, basicContract.id) &&
        Objects.equals(this.title, basicContract.title) &&
        Objects.equals(this.type, basicContract.type) &&
        Objects.equals(this.status, basicContract.status) &&
        Objects.equals(this.client, basicContract.client) &&
        Objects.equals(this.worker, basicContract.worker) &&
        Objects.equals(this.invitations, basicContract.invitations) &&
        Objects.equals(this.signatures, basicContract.signatures) &&
        Objects.equals(this.isShielded, basicContract.isShielded) &&
        Objects.equals(this.isArchived, basicContract.isArchived) &&
        Objects.equals(this.createdAt, basicContract.createdAt) &&
        Objects.equals(this.terminationDate, basicContract.terminationDate) &&
        Objects.equals(this.noticePeriod, basicContract.noticePeriod) &&
        Objects.equals(this.scale, basicContract.scale) &&
        Objects.equals(this.whoReports, basicContract.whoReports) &&
        Objects.equals(this.externalId, basicContract.externalId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, type, status, client, worker, invitations, signatures, isShielded, isArchived, createdAt, terminationDate, noticePeriod, scale, whoReports, externalId);
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
    sb.append("class BasicContract {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    isShielded: ").append(toIndentedString(isShielded)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    whoReports: ").append(toIndentedString(whoReports)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("client");
    openapiFields.add("worker");
    openapiFields.add("invitations");
    openapiFields.add("signatures");
    openapiFields.add("is_shielded");
    openapiFields.add("is_archived");
    openapiFields.add("created_at");
    openapiFields.add("termination_date");
    openapiFields.add("notice_period");
    openapiFields.add("scale");
    openapiFields.add("who_reports");
    openapiFields.add("external_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("worker");
    openapiRequiredFields.add("invitations");
    openapiRequiredFields.add("signatures");
    openapiRequiredFields.add("is_shielded");
    openapiRequiredFields.add("is_archived");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("termination_date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BasicContract
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BasicContract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BasicContract is not found in the empty JSON string", BasicContract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BasicContract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BasicContract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BasicContract.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the required field `type`
      ContractTypeEnum.validateJsonElement(jsonObj.get("type"));
      // validate the required field `status`
      ContractStatusEnum.validateJsonElement(jsonObj.get("status"));
      // validate the required field `client`
      ClientOfBasicContract.validateJsonElement(jsonObj.get("client"));
      // validate the required field `worker`
      WorkerOfBasicContract.validateJsonElement(jsonObj.get("worker"));
      // validate the required field `invitations`
      InvitationsOfBasicContract.validateJsonElement(jsonObj.get("invitations"));
      // validate the required field `signatures`
      SignaturesOfBasicContract.validateJsonElement(jsonObj.get("signatures"));
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      // validate the optional field `who_reports`
      if (jsonObj.get("who_reports") != null && !jsonObj.get("who_reports").isJsonNull()) {
        ContractWhoReportsEnum.validateJsonElement(jsonObj.get("who_reports"));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BasicContract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BasicContract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BasicContract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BasicContract.class));

       return (TypeAdapter<T>) new TypeAdapter<BasicContract>() {
           @Override
           public void write(JsonWriter out, BasicContract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BasicContract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BasicContract given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BasicContract
   * @throws IOException if the JSON string is invalid with respect to BasicContract
   */
  public static BasicContract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BasicContract.class);
  }

  /**
   * Convert an instance of BasicContract to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

