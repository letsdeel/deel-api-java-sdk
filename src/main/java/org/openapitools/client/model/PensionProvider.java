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
import org.openapitools.client.model.Contribution;

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
 * Pension provider.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-10T18:53:15.717716351Z[GMT]", comments = "Generator version: 7.10.0")
public class PensionProvider {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_HOME_PAGE_URL = "home_page_url";
  @SerializedName(SERIALIZED_NAME_HOME_PAGE_URL)
  @javax.annotation.Nullable
  private String homePageUrl;

  public static final String SERIALIZED_NAME_CONTRIBUTION = "contribution";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION)
  @javax.annotation.Nullable
  private Contribution contribution;

  public PensionProvider() {
  }

  public PensionProvider id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this resource.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public PensionProvider name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of pension provider.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public PensionProvider homePageUrl(@javax.annotation.Nullable String homePageUrl) {
    this.homePageUrl = homePageUrl;
    return this;
  }

  /**
   * Pension provider&#39;s home page url.
   * @return homePageUrl
   */
  @javax.annotation.Nullable
  public String getHomePageUrl() {
    return homePageUrl;
  }

  public void setHomePageUrl(@javax.annotation.Nullable String homePageUrl) {
    this.homePageUrl = homePageUrl;
  }


  public PensionProvider contribution(@javax.annotation.Nullable Contribution contribution) {
    this.contribution = contribution;
    return this;
  }

  /**
   * Get contribution
   * @return contribution
   */
  @javax.annotation.Nullable
  public Contribution getContribution() {
    return contribution;
  }

  public void setContribution(@javax.annotation.Nullable Contribution contribution) {
    this.contribution = contribution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PensionProvider pensionProvider = (PensionProvider) o;
    return Objects.equals(this.id, pensionProvider.id) &&
        Objects.equals(this.name, pensionProvider.name) &&
        Objects.equals(this.homePageUrl, pensionProvider.homePageUrl) &&
        Objects.equals(this.contribution, pensionProvider.contribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, homePageUrl, contribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PensionProvider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    homePageUrl: ").append(toIndentedString(homePageUrl)).append("\n");
    sb.append("    contribution: ").append(toIndentedString(contribution)).append("\n");
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
    openapiFields.add("home_page_url");
    openapiFields.add("contribution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PensionProvider
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PensionProvider.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PensionProvider is not found in the empty JSON string", PensionProvider.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PensionProvider.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PensionProvider` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("home_page_url") != null && !jsonObj.get("home_page_url").isJsonNull()) && !jsonObj.get("home_page_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `home_page_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("home_page_url").toString()));
      }
      // validate the optional field `contribution`
      if (jsonObj.get("contribution") != null && !jsonObj.get("contribution").isJsonNull()) {
        Contribution.validateJsonElement(jsonObj.get("contribution"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PensionProvider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PensionProvider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PensionProvider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PensionProvider.class));

       return (TypeAdapter<T>) new TypeAdapter<PensionProvider>() {
           @Override
           public void write(JsonWriter out, PensionProvider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PensionProvider read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PensionProvider given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PensionProvider
   * @throws IOException if the JSON string is invalid with respect to PensionProvider
   */
  public static PensionProvider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PensionProvider.class);
  }

  /**
   * Convert an instance of PensionProvider to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

