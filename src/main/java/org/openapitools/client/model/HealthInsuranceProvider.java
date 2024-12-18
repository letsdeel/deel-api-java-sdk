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
import org.openapitools.client.model.HealthInsuranceProviderAttachmentsInner;
import org.openapitools.client.model.HealthInsuranceProviderPlansInner;

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
 * Health insurance provider.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class HealthInsuranceProvider {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_IS_UNISURE = "is_unisure";
  @SerializedName(SERIALIZED_NAME_IS_UNISURE)
  @javax.annotation.Nullable
  private Boolean isUnisure;

  public static final String SERIALIZED_NAME_HOME_PAGE_URL = "home_page_url";
  @SerializedName(SERIALIZED_NAME_HOME_PAGE_URL)
  @javax.annotation.Nullable
  private String homePageUrl;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_ENDING_RULE = "ending_rule";
  @SerializedName(SERIALIZED_NAME_ENDING_RULE)
  @javax.annotation.Nullable
  private String endingRule;

  public static final String SERIALIZED_NAME_DAYS_TO_CANCEL = "days_to_cancel";
  @SerializedName(SERIALIZED_NAME_DAYS_TO_CANCEL)
  @javax.annotation.Nullable
  private String daysToCancel;

  public static final String SERIALIZED_NAME_PRICING_INFO_LINK = "pricing_info_link";
  @SerializedName(SERIALIZED_NAME_PRICING_INFO_LINK)
  @javax.annotation.Nullable
  private String pricingInfoLink;

  public static final String SERIALIZED_NAME_FIXED_PRICE = "fixed_price";
  @SerializedName(SERIALIZED_NAME_FIXED_PRICE)
  @javax.annotation.Nullable
  private Boolean fixedPrice;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  @javax.annotation.Nullable
  private List<HealthInsuranceProviderAttachmentsInner> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENT_INFO_BANNER = "client_info_banner";
  @SerializedName(SERIALIZED_NAME_CLIENT_INFO_BANNER)
  @javax.annotation.Nullable
  private String clientInfoBanner;

  public static final String SERIALIZED_NAME_IS_AVAILABLE_FOR_NEW_QUOTES = "is_available_for_new_quotes";
  @SerializedName(SERIALIZED_NAME_IS_AVAILABLE_FOR_NEW_QUOTES)
  @javax.annotation.Nullable
  private Boolean isAvailableForNewQuotes;

  public static final String SERIALIZED_NAME_PLANS = "plans";
  @SerializedName(SERIALIZED_NAME_PLANS)
  @javax.annotation.Nullable
  private List<HealthInsuranceProviderPlansInner> plans = new ArrayList<>();

  public HealthInsuranceProvider() {
  }

  public HealthInsuranceProvider id(@javax.annotation.Nullable String id) {
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


  public HealthInsuranceProvider name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of insurance provider.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public HealthInsuranceProvider isUnisure(@javax.annotation.Nullable Boolean isUnisure) {
    this.isUnisure = isUnisure;
    return this;
  }

  /**
   * Get isUnisure
   * @return isUnisure
   */
  @javax.annotation.Nullable
  public Boolean getIsUnisure() {
    return isUnisure;
  }

  public void setIsUnisure(@javax.annotation.Nullable Boolean isUnisure) {
    this.isUnisure = isUnisure;
  }


  public HealthInsuranceProvider homePageUrl(@javax.annotation.Nullable String homePageUrl) {
    this.homePageUrl = homePageUrl;
    return this;
  }

  /**
   * Insurance provider&#39;s home page url.
   * @return homePageUrl
   */
  @javax.annotation.Nullable
  public String getHomePageUrl() {
    return homePageUrl;
  }

  public void setHomePageUrl(@javax.annotation.Nullable String homePageUrl) {
    this.homePageUrl = homePageUrl;
  }


  public HealthInsuranceProvider currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Payment currency.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public HealthInsuranceProvider type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Insurance type.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public HealthInsuranceProvider endingRule(@javax.annotation.Nullable String endingRule) {
    this.endingRule = endingRule;
    return this;
  }

  /**
   * Insurance cycle ending rule.
   * @return endingRule
   */
  @javax.annotation.Nullable
  public String getEndingRule() {
    return endingRule;
  }

  public void setEndingRule(@javax.annotation.Nullable String endingRule) {
    this.endingRule = endingRule;
  }


  public HealthInsuranceProvider daysToCancel(@javax.annotation.Nullable String daysToCancel) {
    this.daysToCancel = daysToCancel;
    return this;
  }

  /**
   * Days to cancel the insurance.
   * @return daysToCancel
   */
  @javax.annotation.Nullable
  public String getDaysToCancel() {
    return daysToCancel;
  }

  public void setDaysToCancel(@javax.annotation.Nullable String daysToCancel) {
    this.daysToCancel = daysToCancel;
  }


  public HealthInsuranceProvider pricingInfoLink(@javax.annotation.Nullable String pricingInfoLink) {
    this.pricingInfoLink = pricingInfoLink;
    return this;
  }

  /**
   * URL to price info.
   * @return pricingInfoLink
   */
  @javax.annotation.Nullable
  public String getPricingInfoLink() {
    return pricingInfoLink;
  }

  public void setPricingInfoLink(@javax.annotation.Nullable String pricingInfoLink) {
    this.pricingInfoLink = pricingInfoLink;
  }


  public HealthInsuranceProvider fixedPrice(@javax.annotation.Nullable Boolean fixedPrice) {
    this.fixedPrice = fixedPrice;
    return this;
  }

  /**
   * URL to price info.
   * @return fixedPrice
   */
  @javax.annotation.Nullable
  public Boolean getFixedPrice() {
    return fixedPrice;
  }

  public void setFixedPrice(@javax.annotation.Nullable Boolean fixedPrice) {
    this.fixedPrice = fixedPrice;
  }


  public HealthInsuranceProvider attachments(@javax.annotation.Nullable List<HealthInsuranceProviderAttachmentsInner> attachments) {
    this.attachments = attachments;
    return this;
  }

  public HealthInsuranceProvider addAttachmentsItem(HealthInsuranceProviderAttachmentsInner attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * File attachments.
   * @return attachments
   */
  @javax.annotation.Nullable
  public List<HealthInsuranceProviderAttachmentsInner> getAttachments() {
    return attachments;
  }

  public void setAttachments(@javax.annotation.Nullable List<HealthInsuranceProviderAttachmentsInner> attachments) {
    this.attachments = attachments;
  }


  public HealthInsuranceProvider clientInfoBanner(@javax.annotation.Nullable String clientInfoBanner) {
    this.clientInfoBanner = clientInfoBanner;
    return this;
  }

  /**
   * Health insurance info banner.
   * @return clientInfoBanner
   */
  @javax.annotation.Nullable
  public String getClientInfoBanner() {
    return clientInfoBanner;
  }

  public void setClientInfoBanner(@javax.annotation.Nullable String clientInfoBanner) {
    this.clientInfoBanner = clientInfoBanner;
  }


  public HealthInsuranceProvider isAvailableForNewQuotes(@javax.annotation.Nullable Boolean isAvailableForNewQuotes) {
    this.isAvailableForNewQuotes = isAvailableForNewQuotes;
    return this;
  }

  /**
   * Get isAvailableForNewQuotes
   * @return isAvailableForNewQuotes
   */
  @javax.annotation.Nullable
  public Boolean getIsAvailableForNewQuotes() {
    return isAvailableForNewQuotes;
  }

  public void setIsAvailableForNewQuotes(@javax.annotation.Nullable Boolean isAvailableForNewQuotes) {
    this.isAvailableForNewQuotes = isAvailableForNewQuotes;
  }


  public HealthInsuranceProvider plans(@javax.annotation.Nullable List<HealthInsuranceProviderPlansInner> plans) {
    this.plans = plans;
    return this;
  }

  public HealthInsuranceProvider addPlansItem(HealthInsuranceProviderPlansInner plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<>();
    }
    this.plans.add(plansItem);
    return this;
  }

  /**
   * Get plans
   * @return plans
   */
  @javax.annotation.Nullable
  public List<HealthInsuranceProviderPlansInner> getPlans() {
    return plans;
  }

  public void setPlans(@javax.annotation.Nullable List<HealthInsuranceProviderPlansInner> plans) {
    this.plans = plans;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthInsuranceProvider healthInsuranceProvider = (HealthInsuranceProvider) o;
    return Objects.equals(this.id, healthInsuranceProvider.id) &&
        Objects.equals(this.name, healthInsuranceProvider.name) &&
        Objects.equals(this.isUnisure, healthInsuranceProvider.isUnisure) &&
        Objects.equals(this.homePageUrl, healthInsuranceProvider.homePageUrl) &&
        Objects.equals(this.currency, healthInsuranceProvider.currency) &&
        Objects.equals(this.type, healthInsuranceProvider.type) &&
        Objects.equals(this.endingRule, healthInsuranceProvider.endingRule) &&
        Objects.equals(this.daysToCancel, healthInsuranceProvider.daysToCancel) &&
        Objects.equals(this.pricingInfoLink, healthInsuranceProvider.pricingInfoLink) &&
        Objects.equals(this.fixedPrice, healthInsuranceProvider.fixedPrice) &&
        Objects.equals(this.attachments, healthInsuranceProvider.attachments) &&
        Objects.equals(this.clientInfoBanner, healthInsuranceProvider.clientInfoBanner) &&
        Objects.equals(this.isAvailableForNewQuotes, healthInsuranceProvider.isAvailableForNewQuotes) &&
        Objects.equals(this.plans, healthInsuranceProvider.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isUnisure, homePageUrl, currency, type, endingRule, daysToCancel, pricingInfoLink, fixedPrice, attachments, clientInfoBanner, isAvailableForNewQuotes, plans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthInsuranceProvider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isUnisure: ").append(toIndentedString(isUnisure)).append("\n");
    sb.append("    homePageUrl: ").append(toIndentedString(homePageUrl)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    endingRule: ").append(toIndentedString(endingRule)).append("\n");
    sb.append("    daysToCancel: ").append(toIndentedString(daysToCancel)).append("\n");
    sb.append("    pricingInfoLink: ").append(toIndentedString(pricingInfoLink)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    clientInfoBanner: ").append(toIndentedString(clientInfoBanner)).append("\n");
    sb.append("    isAvailableForNewQuotes: ").append(toIndentedString(isAvailableForNewQuotes)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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
    openapiFields.add("is_unisure");
    openapiFields.add("home_page_url");
    openapiFields.add("currency");
    openapiFields.add("type");
    openapiFields.add("ending_rule");
    openapiFields.add("days_to_cancel");
    openapiFields.add("pricing_info_link");
    openapiFields.add("fixed_price");
    openapiFields.add("attachments");
    openapiFields.add("client_info_banner");
    openapiFields.add("is_available_for_new_quotes");
    openapiFields.add("plans");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HealthInsuranceProvider
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HealthInsuranceProvider.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HealthInsuranceProvider is not found in the empty JSON string", HealthInsuranceProvider.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HealthInsuranceProvider.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HealthInsuranceProvider` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("ending_rule") != null && !jsonObj.get("ending_rule").isJsonNull()) && !jsonObj.get("ending_rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ending_rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ending_rule").toString()));
      }
      if ((jsonObj.get("days_to_cancel") != null && !jsonObj.get("days_to_cancel").isJsonNull()) && !jsonObj.get("days_to_cancel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days_to_cancel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days_to_cancel").toString()));
      }
      if ((jsonObj.get("pricing_info_link") != null && !jsonObj.get("pricing_info_link").isJsonNull()) && !jsonObj.get("pricing_info_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricing_info_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricing_info_link").toString()));
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            HealthInsuranceProviderAttachmentsInner.validateJsonElement(jsonArrayattachments.get(i));
          };
        }
      }
      if ((jsonObj.get("client_info_banner") != null && !jsonObj.get("client_info_banner").isJsonNull()) && !jsonObj.get("client_info_banner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_info_banner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_info_banner").toString()));
      }
      if (jsonObj.get("plans") != null && !jsonObj.get("plans").isJsonNull()) {
        JsonArray jsonArrayplans = jsonObj.getAsJsonArray("plans");
        if (jsonArrayplans != null) {
          // ensure the json data is an array
          if (!jsonObj.get("plans").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `plans` to be an array in the JSON string but got `%s`", jsonObj.get("plans").toString()));
          }

          // validate the optional field `plans` (array)
          for (int i = 0; i < jsonArrayplans.size(); i++) {
            HealthInsuranceProviderPlansInner.validateJsonElement(jsonArrayplans.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HealthInsuranceProvider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HealthInsuranceProvider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HealthInsuranceProvider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HealthInsuranceProvider.class));

       return (TypeAdapter<T>) new TypeAdapter<HealthInsuranceProvider>() {
           @Override
           public void write(JsonWriter out, HealthInsuranceProvider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HealthInsuranceProvider read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HealthInsuranceProvider given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HealthInsuranceProvider
   * @throws IOException if the JSON string is invalid with respect to HealthInsuranceProvider
   */
  public static HealthInsuranceProvider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HealthInsuranceProvider.class);
  }

  /**
   * Convert an instance of HealthInsuranceProvider to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

