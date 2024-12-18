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
import org.openapitools.client.model.OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner;

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
 * OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T14:46:34.496883852Z[GMT]", comments = "Generator version: 7.10.0")
public class OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist {
  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  @javax.annotation.Nullable
  private List<OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner> steps = new ArrayList<>();

  public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist() {
  }

  public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist steps(@javax.annotation.Nullable List<OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner> steps) {
    this.steps = steps;
    return this;
  }

  public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist addStepsItem(OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * List of checklist steps
   * @return steps
   */
  @javax.annotation.Nullable
  public List<OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner> getSteps() {
    return steps;
  }

  public void setSteps(@javax.annotation.Nullable List<OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner> steps) {
    this.steps = steps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist onboardingTrackerHrisProfileOidGet200ResponseDataChecklist = (OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist) o;
    return Objects.equals(this.steps, onboardingTrackerHrisProfileOidGet200ResponseDataChecklist.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist {\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
    openapiFields.add("steps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist is not found in the empty JSON string", OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("steps") != null && !jsonObj.get("steps").isJsonNull()) {
        JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
        if (jsonArraysteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("steps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
          }

          // validate the optional field `steps` (array)
          for (int i = 0; i < jsonArraysteps.size(); i++) {
            OnboardingTrackerHrisProfileOidGet200ResponseDataChecklistStepsInner.validateJsonElement(jsonArraysteps.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist>() {
           @Override
           public void write(JsonWriter out, OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist
   * @throws IOException if the JSON string is invalid with respect to OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist
   */
  public static OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist.class);
  }

  /**
   * Convert an instance of OnboardingTrackerHrisProfileOidGet200ResponseDataChecklist to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

