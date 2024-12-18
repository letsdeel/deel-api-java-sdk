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
import java.util.Arrays;
import org.openapitools.client.model.ProfileTypeEnum;
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
 * People object representing a Deel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class PeopleMe {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private BigDecimal id;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private BigDecimal userId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nullable
  private String username;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  @javax.annotation.Nullable
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  @javax.annotation.Nullable
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  @javax.annotation.Nullable
  private String lastName;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  @javax.annotation.Nullable
  private String fullName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  @javax.annotation.Nullable
  private String avatarUrl;

  public static final String SERIALIZED_NAME_PROFILE_TYPE = "profile_type";
  @SerializedName(SERIALIZED_NAME_PROFILE_TYPE)
  @javax.annotation.Nullable
  private ProfileTypeEnum profileType;

  public static final String SERIALIZED_NAME_SLACK_USER_ID = "slack_user_id";
  @SerializedName(SERIALIZED_NAME_SLACK_USER_ID)
  @javax.annotation.Nullable
  private String slackUserId;

  public static final String SERIALIZED_NAME_SLACK_TEAM_ID = "slack_team_id";
  @SerializedName(SERIALIZED_NAME_SLACK_TEAM_ID)
  @javax.annotation.Nullable
  private String slackTeamId;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  @javax.annotation.Nullable
  private BigDecimal organizationId;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organization_name";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  @javax.annotation.Nullable
  private String organizationName;

  public static final String SERIALIZED_NAME_CLIENT_COUNTRY = "client_country";
  @SerializedName(SERIALIZED_NAME_CLIENT_COUNTRY)
  @javax.annotation.Nullable
  private String clientCountry;

  public static final String SERIALIZED_NAME_CONTRACTOR_COUNTRY = "contractor_country";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_COUNTRY)
  @javax.annotation.Nullable
  private String contractorCountry;

  public static final String SERIALIZED_NAME_HRIS_ENABLED = "hris_enabled";
  @SerializedName(SERIALIZED_NAME_HRIS_ENABLED)
  @javax.annotation.Nullable
  private Boolean hrisEnabled;

  public PeopleMe() {
  }

  public PeopleMe id(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the user profile
   * @return id
   */
  @javax.annotation.Nullable
  public BigDecimal getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
  }


  public PeopleMe userId(@javax.annotation.Nullable BigDecimal userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Unique identifier for the user
   * @return userId
   */
  @javax.annotation.Nullable
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable BigDecimal userId) {
    this.userId = userId;
  }


  public PeopleMe username(@javax.annotation.Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Username of the user
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }


  public PeopleMe firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the user
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }


  public PeopleMe middleName(@javax.annotation.Nullable String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name of the user
   * @return middleName
   */
  @javax.annotation.Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@javax.annotation.Nullable String middleName) {
    this.middleName = middleName;
  }


  public PeopleMe lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the user
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }


  public PeopleMe fullName(@javax.annotation.Nullable String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name of the user
   * @return fullName
   */
  @javax.annotation.Nullable
  public String getFullName() {
    return fullName;
  }

  public void setFullName(@javax.annotation.Nullable String fullName) {
    this.fullName = fullName;
  }


  public PeopleMe email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the user
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public PeopleMe avatarUrl(@javax.annotation.Nullable String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * URL of the user&#39;s avatar
   * @return avatarUrl
   */
  @javax.annotation.Nullable
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(@javax.annotation.Nullable String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public PeopleMe profileType(@javax.annotation.Nullable ProfileTypeEnum profileType) {
    this.profileType = profileType;
    return this;
  }

  /**
   * Get profileType
   * @return profileType
   */
  @javax.annotation.Nullable
  public ProfileTypeEnum getProfileType() {
    return profileType;
  }

  public void setProfileType(@javax.annotation.Nullable ProfileTypeEnum profileType) {
    this.profileType = profileType;
  }


  public PeopleMe slackUserId(@javax.annotation.Nullable String slackUserId) {
    this.slackUserId = slackUserId;
    return this;
  }

  /**
   * User&#39;s slack id
   * @return slackUserId
   */
  @javax.annotation.Nullable
  public String getSlackUserId() {
    return slackUserId;
  }

  public void setSlackUserId(@javax.annotation.Nullable String slackUserId) {
    this.slackUserId = slackUserId;
  }


  public PeopleMe slackTeamId(@javax.annotation.Nullable String slackTeamId) {
    this.slackTeamId = slackTeamId;
    return this;
  }

  /**
   * User&#39;s team slack id
   * @return slackTeamId
   */
  @javax.annotation.Nullable
  public String getSlackTeamId() {
    return slackTeamId;
  }

  public void setSlackTeamId(@javax.annotation.Nullable String slackTeamId) {
    this.slackTeamId = slackTeamId;
  }


  public PeopleMe organizationId(@javax.annotation.Nullable BigDecimal organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Unique identifier for the organization
   * @return organizationId
   */
  @javax.annotation.Nullable
  public BigDecimal getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(@javax.annotation.Nullable BigDecimal organizationId) {
    this.organizationId = organizationId;
  }


  public PeopleMe organizationName(@javax.annotation.Nullable String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  /**
   * Name of the organization
   * @return organizationName
   */
  @javax.annotation.Nullable
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(@javax.annotation.Nullable String organizationName) {
    this.organizationName = organizationName;
  }


  public PeopleMe clientCountry(@javax.annotation.Nullable String clientCountry) {
    this.clientCountry = clientCountry;
    return this;
  }

  /**
   * Country code.
   * @return clientCountry
   */
  @javax.annotation.Nullable
  public String getClientCountry() {
    return clientCountry;
  }

  public void setClientCountry(@javax.annotation.Nullable String clientCountry) {
    this.clientCountry = clientCountry;
  }


  public PeopleMe contractorCountry(@javax.annotation.Nullable String contractorCountry) {
    this.contractorCountry = contractorCountry;
    return this;
  }

  /**
   * Country code.
   * @return contractorCountry
   */
  @javax.annotation.Nullable
  public String getContractorCountry() {
    return contractorCountry;
  }

  public void setContractorCountry(@javax.annotation.Nullable String contractorCountry) {
    this.contractorCountry = contractorCountry;
  }


  public PeopleMe hrisEnabled(@javax.annotation.Nullable Boolean hrisEnabled) {
    this.hrisEnabled = hrisEnabled;
    return this;
  }

  /**
   * HRIS feature enabled.
   * @return hrisEnabled
   */
  @javax.annotation.Nullable
  public Boolean getHrisEnabled() {
    return hrisEnabled;
  }

  public void setHrisEnabled(@javax.annotation.Nullable Boolean hrisEnabled) {
    this.hrisEnabled = hrisEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeopleMe peopleMe = (PeopleMe) o;
    return Objects.equals(this.id, peopleMe.id) &&
        Objects.equals(this.userId, peopleMe.userId) &&
        Objects.equals(this.username, peopleMe.username) &&
        Objects.equals(this.firstName, peopleMe.firstName) &&
        Objects.equals(this.middleName, peopleMe.middleName) &&
        Objects.equals(this.lastName, peopleMe.lastName) &&
        Objects.equals(this.fullName, peopleMe.fullName) &&
        Objects.equals(this.email, peopleMe.email) &&
        Objects.equals(this.avatarUrl, peopleMe.avatarUrl) &&
        Objects.equals(this.profileType, peopleMe.profileType) &&
        Objects.equals(this.slackUserId, peopleMe.slackUserId) &&
        Objects.equals(this.slackTeamId, peopleMe.slackTeamId) &&
        Objects.equals(this.organizationId, peopleMe.organizationId) &&
        Objects.equals(this.organizationName, peopleMe.organizationName) &&
        Objects.equals(this.clientCountry, peopleMe.clientCountry) &&
        Objects.equals(this.contractorCountry, peopleMe.contractorCountry) &&
        Objects.equals(this.hrisEnabled, peopleMe.hrisEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, username, firstName, middleName, lastName, fullName, email, avatarUrl, profileType, slackUserId, slackTeamId, organizationId, organizationName, clientCountry, contractorCountry, hrisEnabled);
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
    sb.append("class PeopleMe {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    slackUserId: ").append(toIndentedString(slackUserId)).append("\n");
    sb.append("    slackTeamId: ").append(toIndentedString(slackTeamId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    clientCountry: ").append(toIndentedString(clientCountry)).append("\n");
    sb.append("    contractorCountry: ").append(toIndentedString(contractorCountry)).append("\n");
    sb.append("    hrisEnabled: ").append(toIndentedString(hrisEnabled)).append("\n");
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
    openapiFields.add("user_id");
    openapiFields.add("username");
    openapiFields.add("first_name");
    openapiFields.add("middle_name");
    openapiFields.add("last_name");
    openapiFields.add("full_name");
    openapiFields.add("email");
    openapiFields.add("avatar_url");
    openapiFields.add("profile_type");
    openapiFields.add("slack_user_id");
    openapiFields.add("slack_team_id");
    openapiFields.add("organization_id");
    openapiFields.add("organization_name");
    openapiFields.add("client_country");
    openapiFields.add("contractor_country");
    openapiFields.add("hris_enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PeopleMe
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PeopleMe.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeopleMe is not found in the empty JSON string", PeopleMe.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PeopleMe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PeopleMe` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("middle_name") != null && !jsonObj.get("middle_name").isJsonNull()) && !jsonObj.get("middle_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("full_name") != null && !jsonObj.get("full_name").isJsonNull()) && !jsonObj.get("full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("avatar_url") != null && !jsonObj.get("avatar_url").isJsonNull()) && !jsonObj.get("avatar_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar_url").toString()));
      }
      // validate the optional field `profile_type`
      if (jsonObj.get("profile_type") != null && !jsonObj.get("profile_type").isJsonNull()) {
        ProfileTypeEnum.validateJsonElement(jsonObj.get("profile_type"));
      }
      if ((jsonObj.get("slack_user_id") != null && !jsonObj.get("slack_user_id").isJsonNull()) && !jsonObj.get("slack_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slack_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slack_user_id").toString()));
      }
      if ((jsonObj.get("slack_team_id") != null && !jsonObj.get("slack_team_id").isJsonNull()) && !jsonObj.get("slack_team_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slack_team_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slack_team_id").toString()));
      }
      if ((jsonObj.get("organization_name") != null && !jsonObj.get("organization_name").isJsonNull()) && !jsonObj.get("organization_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_name").toString()));
      }
      if ((jsonObj.get("client_country") != null && !jsonObj.get("client_country").isJsonNull()) && !jsonObj.get("client_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_country").toString()));
      }
      if ((jsonObj.get("contractor_country") != null && !jsonObj.get("contractor_country").isJsonNull()) && !jsonObj.get("contractor_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractor_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractor_country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeopleMe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeopleMe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeopleMe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeopleMe.class));

       return (TypeAdapter<T>) new TypeAdapter<PeopleMe>() {
           @Override
           public void write(JsonWriter out, PeopleMe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PeopleMe read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PeopleMe given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PeopleMe
   * @throws IOException if the JSON string is invalid with respect to PeopleMe
   */
  public static PeopleMe fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeopleMe.class);
  }

  /**
   * Convert an instance of PeopleMe to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

