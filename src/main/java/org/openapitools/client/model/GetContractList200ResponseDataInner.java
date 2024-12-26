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
import org.openapitools.client.model.GetContractList200ResponseDataInnerClient;
import org.openapitools.client.model.GetContractList200ResponseDataInnerInvitations;
import org.openapitools.client.model.GetContractList200ResponseDataInnerSignatures;
import org.openapitools.client.model.GetContractList200ResponseDataInnerWorker;
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
 * GetContractList200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:33:56.604502650Z[GMT]", comments = "Generator version: 7.10.0")
public class GetContractList200ResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  /**
   * Type of a contract.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONGOING_TIME_BASED("ongoing_time_based"),
    
    MILESTONES("milestones"),
    
    TIME_BASED("time_based"),
    
    PAY_AS_YOU_GO_TIME_BASED("pay_as_you_go_time_based"),
    
    COMMISSION("commission"),
    
    PAYG_MILESTONES("payg_milestones"),
    
    PAYG_TASKS("payg_tasks"),
    
    EOR("eor"),
    
    UNKNOWN("unknown"),
    
    PEO("peo"),
    
    EMPLOYEE("employee"),
    
    GLOBAL_PAYROLL("global_payroll"),
    
    SHIELD_MSA("shield_msa"),
    
    HRIS_DIRECT_EMPLOYEE("hris_direct_employee");

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

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  @javax.annotation.Nullable
  private String scale;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  @javax.annotation.Nonnull
  private GetContractList200ResponseDataInnerClient client;

  /**
   * Status of a contract in Deel workflow.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("new"),
    
    UNDER_REVIEW("under_review"),
    
    WAITING_FOR_EMPLOYEE_CONTRACT("waiting_for_employee_contract"),
    
    WAITING_FOR_CLIENT_SIGN("waiting_for_client_sign"),
    
    PROCESSING_PAYMENT("processing_payment"),
    
    WAITING_FOR_CONTRACTOR_SIGN("waiting_for_contractor_sign"),
    
    WAITING_FOR_EOR_SIGN("waiting_for_eor_sign"),
    
    WAITING_FOR_EMPLOYEE_SIGN("waiting_for_employee_sign"),
    
    AWAITING_DEPOSIT_PAYMENT("awaiting_deposit_payment"),
    
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed"),
    
    CANCELLED("cancelled"),
    
    USER_CANCELLED("user_cancelled"),
    
    REJECTED("rejected"),
    
    WAITING_FOR_CLIENT_PAYMENT("waiting_for_client_payment");

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
  @javax.annotation.Nonnull
  private StatusEnum status;

  public static final String SERIALIZED_NAME_WORKER = "worker";
  @SerializedName(SERIALIZED_NAME_WORKER)
  @javax.annotation.Nullable
  private GetContractList200ResponseDataInnerWorker worker;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  @javax.annotation.Nonnull
  private GetContractList200ResponseDataInnerSignatures signatures;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private String externalId;

  public static final String SERIALIZED_NAME_INVITATIONS = "invitations";
  @SerializedName(SERIALIZED_NAME_INVITATIONS)
  @javax.annotation.Nonnull
  private GetContractList200ResponseDataInnerInvitations invitations;

  public static final String SERIALIZED_NAME_IS_ARCHIVED = "is_archived";
  @SerializedName(SERIALIZED_NAME_IS_ARCHIVED)
  @javax.annotation.Nonnull
  private Boolean isArchived;

  public static final String SERIALIZED_NAME_IS_SHIELDED = "is_shielded";
  @SerializedName(SERIALIZED_NAME_IS_SHIELDED)
  @javax.annotation.Nonnull
  private Boolean isShielded;

  /**
   * Indicates who is responsible for providing regular reports.
   */
  @JsonAdapter(WhoReportsEnum.Adapter.class)
  public enum WhoReportsEnum {
    BOTH("both"),
    
    CLIENT("client"),
    
    CONTRACTOR("contractor");

    private String value;

    WhoReportsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WhoReportsEnum fromValue(String value) {
      for (WhoReportsEnum b : WhoReportsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WhoReportsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WhoReportsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WhoReportsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WhoReportsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WhoReportsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WHO_REPORTS = "who_reports";
  @SerializedName(SERIALIZED_NAME_WHO_REPORTS)
  @javax.annotation.Nullable
  private WhoReportsEnum whoReports;

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal noticePeriod = new BigDecimal("0");

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime terminationDate;

  public GetContractList200ResponseDataInner() {
  }

  public GetContractList200ResponseDataInner id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * UUID of the contract.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public GetContractList200ResponseDataInner type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of a contract.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public GetContractList200ResponseDataInner scale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * The payment scale (e.g., hourly, weekly, monthly, etc.).
   * @return scale
   */
  @javax.annotation.Nullable
  public String getScale() {
    return scale;
  }

  public void setScale(@javax.annotation.Nullable String scale) {
    this.scale = scale;
  }


  public GetContractList200ResponseDataInner title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the contract.
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public GetContractList200ResponseDataInner client(@javax.annotation.Nonnull GetContractList200ResponseDataInnerClient client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
   */
  @javax.annotation.Nonnull
  public GetContractList200ResponseDataInnerClient getClient() {
    return client;
  }

  public void setClient(@javax.annotation.Nonnull GetContractList200ResponseDataInnerClient client) {
    this.client = client;
  }


  public GetContractList200ResponseDataInner status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of a contract in Deel workflow.
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }


  public GetContractList200ResponseDataInner worker(@javax.annotation.Nullable GetContractList200ResponseDataInnerWorker worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
   */
  @javax.annotation.Nullable
  public GetContractList200ResponseDataInnerWorker getWorker() {
    return worker;
  }

  public void setWorker(@javax.annotation.Nullable GetContractList200ResponseDataInnerWorker worker) {
    this.worker = worker;
  }


  public GetContractList200ResponseDataInner createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the contract was created, in ISO-8601 format.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetContractList200ResponseDataInner signatures(@javax.annotation.Nonnull GetContractList200ResponseDataInnerSignatures signatures) {
    this.signatures = signatures;
    return this;
  }

  /**
   * Get signatures
   * @return signatures
   */
  @javax.annotation.Nonnull
  public GetContractList200ResponseDataInnerSignatures getSignatures() {
    return signatures;
  }

  public void setSignatures(@javax.annotation.Nonnull GetContractList200ResponseDataInnerSignatures signatures) {
    this.signatures = signatures;
  }


  public GetContractList200ResponseDataInner externalId(@javax.annotation.Nullable String externalId) {
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


  public GetContractList200ResponseDataInner invitations(@javax.annotation.Nonnull GetContractList200ResponseDataInnerInvitations invitations) {
    this.invitations = invitations;
    return this;
  }

  /**
   * Get invitations
   * @return invitations
   */
  @javax.annotation.Nonnull
  public GetContractList200ResponseDataInnerInvitations getInvitations() {
    return invitations;
  }

  public void setInvitations(@javax.annotation.Nonnull GetContractList200ResponseDataInnerInvitations invitations) {
    this.invitations = invitations;
  }


  public GetContractList200ResponseDataInner isArchived(@javax.annotation.Nonnull Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * Indicates whether the contract is archived.
   * @return isArchived
   */
  @javax.annotation.Nonnull
  public Boolean getIsArchived() {
    return isArchived;
  }

  public void setIsArchived(@javax.annotation.Nonnull Boolean isArchived) {
    this.isArchived = isArchived;
  }


  public GetContractList200ResponseDataInner isShielded(@javax.annotation.Nonnull Boolean isShielded) {
    this.isShielded = isShielded;
    return this;
  }

  /**
   * Indicates whether the contract is shielded.
   * @return isShielded
   */
  @javax.annotation.Nonnull
  public Boolean getIsShielded() {
    return isShielded;
  }

  public void setIsShielded(@javax.annotation.Nonnull Boolean isShielded) {
    this.isShielded = isShielded;
  }


  public GetContractList200ResponseDataInner whoReports(@javax.annotation.Nullable WhoReportsEnum whoReports) {
    this.whoReports = whoReports;
    return this;
  }

  /**
   * Indicates who is responsible for providing regular reports.
   * @return whoReports
   */
  @javax.annotation.Nullable
  public WhoReportsEnum getWhoReports() {
    return whoReports;
  }

  public void setWhoReports(@javax.annotation.Nullable WhoReportsEnum whoReports) {
    this.whoReports = whoReports;
  }


  public GetContractList200ResponseDataInner noticePeriod(@javax.annotation.Nullable BigDecimal noticePeriod) {
    this.noticePeriod = noticePeriod;
    return this;
  }

  /**
   * Number of days required to give notice before terminating the contract.
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


  public GetContractList200ResponseDataInner terminationDate(@javax.annotation.Nullable OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

  /**
   * Date when the contract is terminated, in ISO-8601 format.
   * @return terminationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(@javax.annotation.Nullable OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractList200ResponseDataInner getContractList200ResponseDataInner = (GetContractList200ResponseDataInner) o;
    return Objects.equals(this.id, getContractList200ResponseDataInner.id) &&
        Objects.equals(this.type, getContractList200ResponseDataInner.type) &&
        Objects.equals(this.scale, getContractList200ResponseDataInner.scale) &&
        Objects.equals(this.title, getContractList200ResponseDataInner.title) &&
        Objects.equals(this.client, getContractList200ResponseDataInner.client) &&
        Objects.equals(this.status, getContractList200ResponseDataInner.status) &&
        Objects.equals(this.worker, getContractList200ResponseDataInner.worker) &&
        Objects.equals(this.createdAt, getContractList200ResponseDataInner.createdAt) &&
        Objects.equals(this.signatures, getContractList200ResponseDataInner.signatures) &&
        Objects.equals(this.externalId, getContractList200ResponseDataInner.externalId) &&
        Objects.equals(this.invitations, getContractList200ResponseDataInner.invitations) &&
        Objects.equals(this.isArchived, getContractList200ResponseDataInner.isArchived) &&
        Objects.equals(this.isShielded, getContractList200ResponseDataInner.isShielded) &&
        Objects.equals(this.whoReports, getContractList200ResponseDataInner.whoReports) &&
        Objects.equals(this.noticePeriod, getContractList200ResponseDataInner.noticePeriod) &&
        Objects.equals(this.terminationDate, getContractList200ResponseDataInner.terminationDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, scale, title, client, status, worker, createdAt, signatures, externalId, invitations, isArchived, isShielded, whoReports, noticePeriod, terminationDate);
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
    sb.append("class GetContractList200ResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    isShielded: ").append(toIndentedString(isShielded)).append("\n");
    sb.append("    whoReports: ").append(toIndentedString(whoReports)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("scale");
    openapiFields.add("title");
    openapiFields.add("client");
    openapiFields.add("status");
    openapiFields.add("worker");
    openapiFields.add("created_at");
    openapiFields.add("signatures");
    openapiFields.add("external_id");
    openapiFields.add("invitations");
    openapiFields.add("is_archived");
    openapiFields.add("is_shielded");
    openapiFields.add("who_reports");
    openapiFields.add("notice_period");
    openapiFields.add("termination_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("signatures");
    openapiRequiredFields.add("invitations");
    openapiRequiredFields.add("is_archived");
    openapiRequiredFields.add("is_shielded");
    openapiRequiredFields.add("termination_date");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetContractList200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetContractList200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetContractList200ResponseDataInner is not found in the empty JSON string", GetContractList200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetContractList200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetContractList200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetContractList200ResponseDataInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("scale") != null && !jsonObj.get("scale").isJsonNull()) && !jsonObj.get("scale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scale").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the required field `client`
      GetContractList200ResponseDataInnerClient.validateJsonElement(jsonObj.get("client"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      // validate the optional field `worker`
      if (jsonObj.get("worker") != null && !jsonObj.get("worker").isJsonNull()) {
        GetContractList200ResponseDataInnerWorker.validateJsonElement(jsonObj.get("worker"));
      }
      // validate the required field `signatures`
      GetContractList200ResponseDataInnerSignatures.validateJsonElement(jsonObj.get("signatures"));
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      // validate the required field `invitations`
      GetContractList200ResponseDataInnerInvitations.validateJsonElement(jsonObj.get("invitations"));
      if ((jsonObj.get("who_reports") != null && !jsonObj.get("who_reports").isJsonNull()) && !jsonObj.get("who_reports").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `who_reports` to be a primitive type in the JSON string but got `%s`", jsonObj.get("who_reports").toString()));
      }
      // validate the optional field `who_reports`
      if (jsonObj.get("who_reports") != null && !jsonObj.get("who_reports").isJsonNull()) {
        WhoReportsEnum.validateJsonElement(jsonObj.get("who_reports"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetContractList200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetContractList200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetContractList200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetContractList200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetContractList200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetContractList200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetContractList200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetContractList200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetContractList200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetContractList200ResponseDataInner
   */
  public static GetContractList200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetContractList200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetContractList200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

