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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity;
import org.openapitools.client.model.GetPeopleList200ResponseDataInnerEmploymentsInnerPayment;
import org.openapitools.client.model.GetPeopleList200ResponseDataInnerEmploymentsInnerTeam;

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
 * GetPeopleList200ResponseDataInnerEmploymentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class GetPeopleList200ResponseDataInnerEmploymentsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  @javax.annotation.Nullable
  private GetPeopleList200ResponseDataInnerEmploymentsInnerTeam team;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  @javax.annotation.Nullable
  private GetPeopleList200ResponseDataInnerEmploymentsInnerPayment payment;

  public static final String SERIALIZED_NAME_IS_ENDED = "is_ended";
  @SerializedName(SERIALIZED_NAME_IS_ENDED)
  @javax.annotation.Nullable
  private Boolean isEnded;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  @javax.annotation.Nullable
  private String timezone;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  @javax.annotation.Nullable
  private String jobTitle;

  public static final String SERIALIZED_NAME_SENIORITY = "seniority";
  @SerializedName(SERIALIZED_NAME_SENIORITY)
  @javax.annotation.Nullable
  private String seniority;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  @javax.annotation.Nullable
  private String workEmail;

  public static final String SERIALIZED_NAME_HIRING_TYPE = "hiring_type";
  @SerializedName(SERIALIZED_NAME_HIRING_TYPE)
  @javax.annotation.Nullable
  private String hiringType;

  public static final String SERIALIZED_NAME_HIRING_STATUS = "hiring_status";
  @SerializedName(SERIALIZED_NAME_HIRING_STATUS)
  @javax.annotation.Nullable
  private String hiringStatus;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "completion_date";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  @javax.annotation.Nullable
  private String completionDate;

  public static final String SERIALIZED_NAME_CONTRACT_STATUS = "contract_status";
  @SerializedName(SERIALIZED_NAME_CONTRACT_STATUS)
  @javax.annotation.Nullable
  private String contractStatus;

  public static final String SERIALIZED_NAME_VOLUNTARILY_LEFT = "voluntarily_left";
  @SerializedName(SERIALIZED_NAME_VOLUNTARILY_LEFT)
  @javax.annotation.Nullable
  private String voluntarilyLeft;

  public static final String SERIALIZED_NAME_CONTRACT_COVERAGE = "contract_coverage";
  @SerializedName(SERIALIZED_NAME_CONTRACT_COVERAGE)
  @javax.annotation.Nullable
  private List<String> contractCoverage = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEW_HIRING_STATUS = "new_hiring_status";
  @SerializedName(SERIALIZED_NAME_NEW_HIRING_STATUS)
  @javax.annotation.Nullable
  private String newHiringStatus;

  public static final String SERIALIZED_NAME_CLIENT_LEGAL_ENTITY = "client_legal_entity";
  @SerializedName(SERIALIZED_NAME_CLIENT_LEGAL_ENTITY)
  @javax.annotation.Nullable
  private GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity clientLegalEntity;

  public static final String SERIALIZED_NAME_HAS_EOR_TERMINATION = "has_eor_termination";
  @SerializedName(SERIALIZED_NAME_HAS_EOR_TERMINATION)
  @javax.annotation.Nullable
  private String hasEorTermination;

  public static final String SERIALIZED_NAME_CONTRACT_IS_ARCHIVED = "contract_is_archived";
  @SerializedName(SERIALIZED_NAME_CONTRACT_IS_ARCHIVED)
  @javax.annotation.Nullable
  private Boolean contractIsArchived;

  public static final String SERIALIZED_NAME_TERMINATION_LAST_DAY = "termination_last_day";
  @SerializedName(SERIALIZED_NAME_TERMINATION_LAST_DAY)
  @javax.annotation.Nullable
  private OffsetDateTime terminationLastDay;

  public static final String SERIALIZED_NAME_CONTRACT_HAS_CONTRACTOR = "contract_has_contractor";
  @SerializedName(SERIALIZED_NAME_CONTRACT_HAS_CONTRACTOR)
  @javax.annotation.Nullable
  private Boolean contractHasContractor;

  public static final String SERIALIZED_NAME_IS_USER_CONTRACT_DELETED = "is_user_contract_deleted";
  @SerializedName(SERIALIZED_NAME_IS_USER_CONTRACT_DELETED)
  @javax.annotation.Nullable
  private Boolean isUserContractDeleted;

  public static final String SERIALIZED_NAME_HRIS_DIRECT_EMPLOYEE_INVITATION = "hris_direct_employee_invitation";
  @SerializedName(SERIALIZED_NAME_HRIS_DIRECT_EMPLOYEE_INVITATION)
  @javax.annotation.Nullable
  private String hrisDirectEmployeeInvitation;

  public GetPeopleList200ResponseDataInnerEmploymentsInner() {
  }

  public GetPeopleList200ResponseDataInnerEmploymentsInner id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the employment.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the employee.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner team(@javax.annotation.Nullable GetPeopleList200ResponseDataInnerEmploymentsInnerTeam team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @javax.annotation.Nullable
  public GetPeopleList200ResponseDataInnerEmploymentsInnerTeam getTeam() {
    return team;
  }

  public void setTeam(@javax.annotation.Nullable GetPeopleList200ResponseDataInnerEmploymentsInnerTeam team) {
    this.team = team;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * The work email of the employee.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * The state of employment.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The country of employment.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner payment(@javax.annotation.Nullable GetPeopleList200ResponseDataInnerEmploymentsInnerPayment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
   */
  @javax.annotation.Nullable
  public GetPeopleList200ResponseDataInnerEmploymentsInnerPayment getPayment() {
    return payment;
  }

  public void setPayment(@javax.annotation.Nullable GetPeopleList200ResponseDataInnerEmploymentsInnerPayment payment) {
    this.payment = payment;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner isEnded(@javax.annotation.Nullable Boolean isEnded) {
    this.isEnded = isEnded;
    return this;
  }

  /**
   * Whether the employment has ended.
   * @return isEnded
   */
  @javax.annotation.Nullable
  public Boolean getIsEnded() {
    return isEnded;
  }

  public void setIsEnded(@javax.annotation.Nullable Boolean isEnded) {
    this.isEnded = isEnded;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner timezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone of the employment.
   * @return timezone
   */
  @javax.annotation.Nullable
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(@javax.annotation.Nullable String timezone) {
    this.timezone = timezone;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner jobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * The job title of the employment.
   * @return jobTitle
   */
  @javax.annotation.Nullable
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(@javax.annotation.Nullable String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner seniority(@javax.annotation.Nullable String seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * The seniority level of the employment.
   * @return seniority
   */
  @javax.annotation.Nullable
  public String getSeniority() {
    return seniority;
  }

  public void setSeniority(@javax.annotation.Nullable String seniority) {
    this.seniority = seniority;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner startDate(@javax.annotation.Nullable LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the employment.
   * @return startDate
   */
  @javax.annotation.Nullable
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable LocalDate startDate) {
    this.startDate = startDate;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner workEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
    return this;
  }

  /**
   * The work email of the employment.
   * @return workEmail
   */
  @javax.annotation.Nullable
  public String getWorkEmail() {
    return workEmail;
  }

  public void setWorkEmail(@javax.annotation.Nullable String workEmail) {
    this.workEmail = workEmail;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner hiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
    return this;
  }

  /**
   * The type of hiring of the employment.
   * @return hiringType
   */
  @javax.annotation.Nullable
  public String getHiringType() {
    return hiringType;
  }

  public void setHiringType(@javax.annotation.Nullable String hiringType) {
    this.hiringType = hiringType;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner hiringStatus(@javax.annotation.Nullable String hiringStatus) {
    this.hiringStatus = hiringStatus;
    return this;
  }

  /**
   * The current hiring status of the employment.
   * @return hiringStatus
   */
  @javax.annotation.Nullable
  public String getHiringStatus() {
    return hiringStatus;
  }

  public void setHiringStatus(@javax.annotation.Nullable String hiringStatus) {
    this.hiringStatus = hiringStatus;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner completionDate(@javax.annotation.Nullable String completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * The completion date of the employment contract.
   * @return completionDate
   */
  @javax.annotation.Nullable
  public String getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(@javax.annotation.Nullable String completionDate) {
    this.completionDate = completionDate;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner contractStatus(@javax.annotation.Nullable String contractStatus) {
    this.contractStatus = contractStatus;
    return this;
  }

  /**
   * The status of the employment contract.
   * @return contractStatus
   */
  @javax.annotation.Nullable
  public String getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(@javax.annotation.Nullable String contractStatus) {
    this.contractStatus = contractStatus;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner voluntarilyLeft(@javax.annotation.Nullable String voluntarilyLeft) {
    this.voluntarilyLeft = voluntarilyLeft;
    return this;
  }

  /**
   * Whether the employee voluntarily left the employment.
   * @return voluntarilyLeft
   */
  @javax.annotation.Nullable
  public String getVoluntarilyLeft() {
    return voluntarilyLeft;
  }

  public void setVoluntarilyLeft(@javax.annotation.Nullable String voluntarilyLeft) {
    this.voluntarilyLeft = voluntarilyLeft;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner contractCoverage(@javax.annotation.Nullable List<String> contractCoverage) {
    this.contractCoverage = contractCoverage;
    return this;
  }

  public GetPeopleList200ResponseDataInnerEmploymentsInner addContractCoverageItem(String contractCoverageItem) {
    if (this.contractCoverage == null) {
      this.contractCoverage = new ArrayList<>();
    }
    this.contractCoverage.add(contractCoverageItem);
    return this;
  }

  /**
   * The coverage of the employment contract.
   * @return contractCoverage
   */
  @javax.annotation.Nullable
  public List<String> getContractCoverage() {
    return contractCoverage;
  }

  public void setContractCoverage(@javax.annotation.Nullable List<String> contractCoverage) {
    this.contractCoverage = contractCoverage;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner newHiringStatus(@javax.annotation.Nullable String newHiringStatus) {
    this.newHiringStatus = newHiringStatus;
    return this;
  }

  /**
   * The new hiring status of the employment.
   * @return newHiringStatus
   */
  @javax.annotation.Nullable
  public String getNewHiringStatus() {
    return newHiringStatus;
  }

  public void setNewHiringStatus(@javax.annotation.Nullable String newHiringStatus) {
    this.newHiringStatus = newHiringStatus;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner clientLegalEntity(@javax.annotation.Nullable GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity clientLegalEntity) {
    this.clientLegalEntity = clientLegalEntity;
    return this;
  }

  /**
   * Get clientLegalEntity
   * @return clientLegalEntity
   */
  @javax.annotation.Nullable
  public GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity getClientLegalEntity() {
    return clientLegalEntity;
  }

  public void setClientLegalEntity(@javax.annotation.Nullable GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity clientLegalEntity) {
    this.clientLegalEntity = clientLegalEntity;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner hasEorTermination(@javax.annotation.Nullable String hasEorTermination) {
    this.hasEorTermination = hasEorTermination;
    return this;
  }

  /**
   * Whether the employment has an EOR termination.
   * @return hasEorTermination
   */
  @javax.annotation.Nullable
  public String getHasEorTermination() {
    return hasEorTermination;
  }

  public void setHasEorTermination(@javax.annotation.Nullable String hasEorTermination) {
    this.hasEorTermination = hasEorTermination;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner contractIsArchived(@javax.annotation.Nullable Boolean contractIsArchived) {
    this.contractIsArchived = contractIsArchived;
    return this;
  }

  /**
   * Whether the employment contract is archived.
   * @return contractIsArchived
   */
  @javax.annotation.Nullable
  public Boolean getContractIsArchived() {
    return contractIsArchived;
  }

  public void setContractIsArchived(@javax.annotation.Nullable Boolean contractIsArchived) {
    this.contractIsArchived = contractIsArchived;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner terminationLastDay(@javax.annotation.Nullable OffsetDateTime terminationLastDay) {
    this.terminationLastDay = terminationLastDay;
    return this;
  }

  /**
   * The last day of work mentioned on the contract termination.
   * @return terminationLastDay
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTerminationLastDay() {
    return terminationLastDay;
  }

  public void setTerminationLastDay(@javax.annotation.Nullable OffsetDateTime terminationLastDay) {
    this.terminationLastDay = terminationLastDay;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner contractHasContractor(@javax.annotation.Nullable Boolean contractHasContractor) {
    this.contractHasContractor = contractHasContractor;
    return this;
  }

  /**
   * Whether the contract has a contractor.
   * @return contractHasContractor
   */
  @javax.annotation.Nullable
  public Boolean getContractHasContractor() {
    return contractHasContractor;
  }

  public void setContractHasContractor(@javax.annotation.Nullable Boolean contractHasContractor) {
    this.contractHasContractor = contractHasContractor;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner isUserContractDeleted(@javax.annotation.Nullable Boolean isUserContractDeleted) {
    this.isUserContractDeleted = isUserContractDeleted;
    return this;
  }

  /**
   * Whether the user contract is deleted.
   * @return isUserContractDeleted
   */
  @javax.annotation.Nullable
  public Boolean getIsUserContractDeleted() {
    return isUserContractDeleted;
  }

  public void setIsUserContractDeleted(@javax.annotation.Nullable Boolean isUserContractDeleted) {
    this.isUserContractDeleted = isUserContractDeleted;
  }


  public GetPeopleList200ResponseDataInnerEmploymentsInner hrisDirectEmployeeInvitation(@javax.annotation.Nullable String hrisDirectEmployeeInvitation) {
    this.hrisDirectEmployeeInvitation = hrisDirectEmployeeInvitation;
    return this;
  }

  /**
   * The HRIS direct employee invitation status.
   * @return hrisDirectEmployeeInvitation
   */
  @javax.annotation.Nullable
  public String getHrisDirectEmployeeInvitation() {
    return hrisDirectEmployeeInvitation;
  }

  public void setHrisDirectEmployeeInvitation(@javax.annotation.Nullable String hrisDirectEmployeeInvitation) {
    this.hrisDirectEmployeeInvitation = hrisDirectEmployeeInvitation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPeopleList200ResponseDataInnerEmploymentsInner getPeopleList200ResponseDataInnerEmploymentsInner = (GetPeopleList200ResponseDataInnerEmploymentsInner) o;
    return Objects.equals(this.id, getPeopleList200ResponseDataInnerEmploymentsInner.id) &&
        Objects.equals(this.name, getPeopleList200ResponseDataInnerEmploymentsInner.name) &&
        Objects.equals(this.team, getPeopleList200ResponseDataInnerEmploymentsInner.team) &&
        Objects.equals(this.email, getPeopleList200ResponseDataInnerEmploymentsInner.email) &&
        Objects.equals(this.state, getPeopleList200ResponseDataInnerEmploymentsInner.state) &&
        Objects.equals(this.country, getPeopleList200ResponseDataInnerEmploymentsInner.country) &&
        Objects.equals(this.payment, getPeopleList200ResponseDataInnerEmploymentsInner.payment) &&
        Objects.equals(this.isEnded, getPeopleList200ResponseDataInnerEmploymentsInner.isEnded) &&
        Objects.equals(this.timezone, getPeopleList200ResponseDataInnerEmploymentsInner.timezone) &&
        Objects.equals(this.jobTitle, getPeopleList200ResponseDataInnerEmploymentsInner.jobTitle) &&
        Objects.equals(this.seniority, getPeopleList200ResponseDataInnerEmploymentsInner.seniority) &&
        Objects.equals(this.startDate, getPeopleList200ResponseDataInnerEmploymentsInner.startDate) &&
        Objects.equals(this.workEmail, getPeopleList200ResponseDataInnerEmploymentsInner.workEmail) &&
        Objects.equals(this.hiringType, getPeopleList200ResponseDataInnerEmploymentsInner.hiringType) &&
        Objects.equals(this.hiringStatus, getPeopleList200ResponseDataInnerEmploymentsInner.hiringStatus) &&
        Objects.equals(this.completionDate, getPeopleList200ResponseDataInnerEmploymentsInner.completionDate) &&
        Objects.equals(this.contractStatus, getPeopleList200ResponseDataInnerEmploymentsInner.contractStatus) &&
        Objects.equals(this.voluntarilyLeft, getPeopleList200ResponseDataInnerEmploymentsInner.voluntarilyLeft) &&
        Objects.equals(this.contractCoverage, getPeopleList200ResponseDataInnerEmploymentsInner.contractCoverage) &&
        Objects.equals(this.newHiringStatus, getPeopleList200ResponseDataInnerEmploymentsInner.newHiringStatus) &&
        Objects.equals(this.clientLegalEntity, getPeopleList200ResponseDataInnerEmploymentsInner.clientLegalEntity) &&
        Objects.equals(this.hasEorTermination, getPeopleList200ResponseDataInnerEmploymentsInner.hasEorTermination) &&
        Objects.equals(this.contractIsArchived, getPeopleList200ResponseDataInnerEmploymentsInner.contractIsArchived) &&
        Objects.equals(this.terminationLastDay, getPeopleList200ResponseDataInnerEmploymentsInner.terminationLastDay) &&
        Objects.equals(this.contractHasContractor, getPeopleList200ResponseDataInnerEmploymentsInner.contractHasContractor) &&
        Objects.equals(this.isUserContractDeleted, getPeopleList200ResponseDataInnerEmploymentsInner.isUserContractDeleted) &&
        Objects.equals(this.hrisDirectEmployeeInvitation, getPeopleList200ResponseDataInnerEmploymentsInner.hrisDirectEmployeeInvitation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, team, email, state, country, payment, isEnded, timezone, jobTitle, seniority, startDate, workEmail, hiringType, hiringStatus, completionDate, contractStatus, voluntarilyLeft, contractCoverage, newHiringStatus, clientLegalEntity, hasEorTermination, contractIsArchived, terminationLastDay, contractHasContractor, isUserContractDeleted, hrisDirectEmployeeInvitation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPeopleList200ResponseDataInnerEmploymentsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    isEnded: ").append(toIndentedString(isEnded)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
    sb.append("    hiringType: ").append(toIndentedString(hiringType)).append("\n");
    sb.append("    hiringStatus: ").append(toIndentedString(hiringStatus)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    voluntarilyLeft: ").append(toIndentedString(voluntarilyLeft)).append("\n");
    sb.append("    contractCoverage: ").append(toIndentedString(contractCoverage)).append("\n");
    sb.append("    newHiringStatus: ").append(toIndentedString(newHiringStatus)).append("\n");
    sb.append("    clientLegalEntity: ").append(toIndentedString(clientLegalEntity)).append("\n");
    sb.append("    hasEorTermination: ").append(toIndentedString(hasEorTermination)).append("\n");
    sb.append("    contractIsArchived: ").append(toIndentedString(contractIsArchived)).append("\n");
    sb.append("    terminationLastDay: ").append(toIndentedString(terminationLastDay)).append("\n");
    sb.append("    contractHasContractor: ").append(toIndentedString(contractHasContractor)).append("\n");
    sb.append("    isUserContractDeleted: ").append(toIndentedString(isUserContractDeleted)).append("\n");
    sb.append("    hrisDirectEmployeeInvitation: ").append(toIndentedString(hrisDirectEmployeeInvitation)).append("\n");
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
    openapiFields.add("team");
    openapiFields.add("email");
    openapiFields.add("state");
    openapiFields.add("country");
    openapiFields.add("payment");
    openapiFields.add("is_ended");
    openapiFields.add("timezone");
    openapiFields.add("job_title");
    openapiFields.add("seniority");
    openapiFields.add("start_date");
    openapiFields.add("work_email");
    openapiFields.add("hiring_type");
    openapiFields.add("hiring_status");
    openapiFields.add("completion_date");
    openapiFields.add("contract_status");
    openapiFields.add("voluntarily_left");
    openapiFields.add("contract_coverage");
    openapiFields.add("new_hiring_status");
    openapiFields.add("client_legal_entity");
    openapiFields.add("has_eor_termination");
    openapiFields.add("contract_is_archived");
    openapiFields.add("termination_last_day");
    openapiFields.add("contract_has_contractor");
    openapiFields.add("is_user_contract_deleted");
    openapiFields.add("hris_direct_employee_invitation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPeopleList200ResponseDataInnerEmploymentsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPeopleList200ResponseDataInnerEmploymentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPeopleList200ResponseDataInnerEmploymentsInner is not found in the empty JSON string", GetPeopleList200ResponseDataInnerEmploymentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPeopleList200ResponseDataInnerEmploymentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPeopleList200ResponseDataInnerEmploymentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `team`
      if (jsonObj.get("team") != null && !jsonObj.get("team").isJsonNull()) {
        GetPeopleList200ResponseDataInnerEmploymentsInnerTeam.validateJsonElement(jsonObj.get("team"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // validate the optional field `payment`
      if (jsonObj.get("payment") != null && !jsonObj.get("payment").isJsonNull()) {
        GetPeopleList200ResponseDataInnerEmploymentsInnerPayment.validateJsonElement(jsonObj.get("payment"));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("job_title") != null && !jsonObj.get("job_title").isJsonNull()) && !jsonObj.get("job_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_title").toString()));
      }
      if ((jsonObj.get("seniority") != null && !jsonObj.get("seniority").isJsonNull()) && !jsonObj.get("seniority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seniority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seniority").toString()));
      }
      if ((jsonObj.get("work_email") != null && !jsonObj.get("work_email").isJsonNull()) && !jsonObj.get("work_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_email").toString()));
      }
      if ((jsonObj.get("hiring_type") != null && !jsonObj.get("hiring_type").isJsonNull()) && !jsonObj.get("hiring_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hiring_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hiring_type").toString()));
      }
      if ((jsonObj.get("hiring_status") != null && !jsonObj.get("hiring_status").isJsonNull()) && !jsonObj.get("hiring_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hiring_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hiring_status").toString()));
      }
      if ((jsonObj.get("completion_date") != null && !jsonObj.get("completion_date").isJsonNull()) && !jsonObj.get("completion_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completion_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completion_date").toString()));
      }
      if ((jsonObj.get("contract_status") != null && !jsonObj.get("contract_status").isJsonNull()) && !jsonObj.get("contract_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_status").toString()));
      }
      if ((jsonObj.get("voluntarily_left") != null && !jsonObj.get("voluntarily_left").isJsonNull()) && !jsonObj.get("voluntarily_left").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voluntarily_left` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voluntarily_left").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("contract_coverage") != null && !jsonObj.get("contract_coverage").isJsonNull() && !jsonObj.get("contract_coverage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_coverage` to be an array in the JSON string but got `%s`", jsonObj.get("contract_coverage").toString()));
      }
      if ((jsonObj.get("new_hiring_status") != null && !jsonObj.get("new_hiring_status").isJsonNull()) && !jsonObj.get("new_hiring_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_hiring_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_hiring_status").toString()));
      }
      // validate the optional field `client_legal_entity`
      if (jsonObj.get("client_legal_entity") != null && !jsonObj.get("client_legal_entity").isJsonNull()) {
        GetPeopleList200ResponseDataInnerEmploymentsInnerClientLegalEntity.validateJsonElement(jsonObj.get("client_legal_entity"));
      }
      if ((jsonObj.get("has_eor_termination") != null && !jsonObj.get("has_eor_termination").isJsonNull()) && !jsonObj.get("has_eor_termination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `has_eor_termination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("has_eor_termination").toString()));
      }
      if ((jsonObj.get("hris_direct_employee_invitation") != null && !jsonObj.get("hris_direct_employee_invitation").isJsonNull()) && !jsonObj.get("hris_direct_employee_invitation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hris_direct_employee_invitation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hris_direct_employee_invitation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetPeopleList200ResponseDataInnerEmploymentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPeopleList200ResponseDataInnerEmploymentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPeopleList200ResponseDataInnerEmploymentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPeopleList200ResponseDataInnerEmploymentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPeopleList200ResponseDataInnerEmploymentsInner>() {
           @Override
           public void write(JsonWriter out, GetPeopleList200ResponseDataInnerEmploymentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPeopleList200ResponseDataInnerEmploymentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPeopleList200ResponseDataInnerEmploymentsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPeopleList200ResponseDataInnerEmploymentsInner
   * @throws IOException if the JSON string is invalid with respect to GetPeopleList200ResponseDataInnerEmploymentsInner
   */
  public static GetPeopleList200ResponseDataInnerEmploymentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPeopleList200ResponseDataInnerEmploymentsInner.class);
  }

  /**
   * Convert an instance of GetPeopleList200ResponseDataInnerEmploymentsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

