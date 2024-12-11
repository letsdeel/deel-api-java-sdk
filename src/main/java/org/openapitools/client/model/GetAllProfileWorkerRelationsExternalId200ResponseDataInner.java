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
import java.util.UUID;
import org.openapitools.client.model.GetAllProfileWorkerRelationsExternalId200ResponseDataInnerChildRelationshipsInner;
import org.openapitools.client.model.GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship;

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
 * GetAllProfileWorkerRelationsExternalId200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T22:20:01.055724240Z[GMT]", comments = "Generator version: 7.10.0")
public class GetAllProfileWorkerRelationsExternalId200ResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_IS_PARENT = "is_parent";
  @SerializedName(SERIALIZED_NAME_IS_PARENT)
  @javax.annotation.Nullable
  private Boolean isParent;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  @javax.annotation.Nullable
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_CHILD_RELATIONSHIPS = "child_relationships";
  @SerializedName(SERIALIZED_NAME_CHILD_RELATIONSHIPS)
  @javax.annotation.Nullable
  private List<GetAllProfileWorkerRelationsExternalId200ResponseDataInnerChildRelationshipsInner> childRelationships = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARENT_RELATIONSHIP = "parent_relationship";
  @SerializedName(SERIALIZED_NAME_PARENT_RELATIONSHIP)
  @javax.annotation.Nullable
  private GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship parentRelationship;

  public GetAllProfileWorkerRelationsExternalId200ResponseDataInner() {
  }

  public GetAllProfileWorkerRelationsExternalId200ResponseDataInner id(@javax.annotation.Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the relation type
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable UUID id) {
    this.id = id;
  }


  public GetAllProfileWorkerRelationsExternalId200ResponseDataInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the relation type
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetAllProfileWorkerRelationsExternalId200ResponseDataInner isParent(@javax.annotation.Nullable Boolean isParent) {
    this.isParent = isParent;
    return this;
  }

  /**
   * Whether this relation is the parent or not
   * @return isParent
   */
  @javax.annotation.Nullable
  public Boolean getIsParent() {
    return isParent;
  }

  public void setIsParent(@javax.annotation.Nullable Boolean isParent) {
    this.isParent = isParent;
  }


  public GetAllProfileWorkerRelationsExternalId200ResponseDataInner isDefault(@javax.annotation.Nullable Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this relation is default or not
   * @return isDefault
   */
  @javax.annotation.Nullable
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(@javax.annotation.Nullable Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public GetAllProfileWorkerRelationsExternalId200ResponseDataInner childRelationships(@javax.annotation.Nullable List<GetAllProfileWorkerRelationsExternalId200ResponseDataInnerChildRelationshipsInner> childRelationships) {
    this.childRelationships = childRelationships;
    return this;
  }

  public GetAllProfileWorkerRelationsExternalId200ResponseDataInner addChildRelationshipsItem(GetAllProfileWorkerRelationsExternalId200ResponseDataInnerChildRelationshipsInner childRelationshipsItem) {
    if (this.childRelationships == null) {
      this.childRelationships = new ArrayList<>();
    }
    this.childRelationships.add(childRelationshipsItem);
    return this;
  }

  /**
   * An array containing the information about the child profiles in the relation.
   * @return childRelationships
   */
  @javax.annotation.Nullable
  public List<GetAllProfileWorkerRelationsExternalId200ResponseDataInnerChildRelationshipsInner> getChildRelationships() {
    return childRelationships;
  }

  public void setChildRelationships(@javax.annotation.Nullable List<GetAllProfileWorkerRelationsExternalId200ResponseDataInnerChildRelationshipsInner> childRelationships) {
    this.childRelationships = childRelationships;
  }


  public GetAllProfileWorkerRelationsExternalId200ResponseDataInner parentRelationship(@javax.annotation.Nullable GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship parentRelationship) {
    this.parentRelationship = parentRelationship;
    return this;
  }

  /**
   * Get parentRelationship
   * @return parentRelationship
   */
  @javax.annotation.Nullable
  public GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship getParentRelationship() {
    return parentRelationship;
  }

  public void setParentRelationship(@javax.annotation.Nullable GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship parentRelationship) {
    this.parentRelationship = parentRelationship;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllProfileWorkerRelationsExternalId200ResponseDataInner getAllProfileWorkerRelationsExternalId200ResponseDataInner = (GetAllProfileWorkerRelationsExternalId200ResponseDataInner) o;
    return Objects.equals(this.id, getAllProfileWorkerRelationsExternalId200ResponseDataInner.id) &&
        Objects.equals(this.name, getAllProfileWorkerRelationsExternalId200ResponseDataInner.name) &&
        Objects.equals(this.isParent, getAllProfileWorkerRelationsExternalId200ResponseDataInner.isParent) &&
        Objects.equals(this.isDefault, getAllProfileWorkerRelationsExternalId200ResponseDataInner.isDefault) &&
        Objects.equals(this.childRelationships, getAllProfileWorkerRelationsExternalId200ResponseDataInner.childRelationships) &&
        Objects.equals(this.parentRelationship, getAllProfileWorkerRelationsExternalId200ResponseDataInner.parentRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isParent, isDefault, childRelationships, parentRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllProfileWorkerRelationsExternalId200ResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isParent: ").append(toIndentedString(isParent)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    childRelationships: ").append(toIndentedString(childRelationships)).append("\n");
    sb.append("    parentRelationship: ").append(toIndentedString(parentRelationship)).append("\n");
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
    openapiFields.add("is_parent");
    openapiFields.add("is_default");
    openapiFields.add("child_relationships");
    openapiFields.add("parent_relationship");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAllProfileWorkerRelationsExternalId200ResponseDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAllProfileWorkerRelationsExternalId200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAllProfileWorkerRelationsExternalId200ResponseDataInner is not found in the empty JSON string", GetAllProfileWorkerRelationsExternalId200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAllProfileWorkerRelationsExternalId200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAllProfileWorkerRelationsExternalId200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("child_relationships") != null && !jsonObj.get("child_relationships").isJsonNull()) {
        JsonArray jsonArraychildRelationships = jsonObj.getAsJsonArray("child_relationships");
        if (jsonArraychildRelationships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("child_relationships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `child_relationships` to be an array in the JSON string but got `%s`", jsonObj.get("child_relationships").toString()));
          }

          // validate the optional field `child_relationships` (array)
          for (int i = 0; i < jsonArraychildRelationships.size(); i++) {
            GetAllProfileWorkerRelationsExternalId200ResponseDataInnerChildRelationshipsInner.validateJsonElement(jsonArraychildRelationships.get(i));
          };
        }
      }
      // validate the optional field `parent_relationship`
      if (jsonObj.get("parent_relationship") != null && !jsonObj.get("parent_relationship").isJsonNull()) {
        GetAllProfileWorkerRelationsExternalId200ResponseDataInnerParentRelationship.validateJsonElement(jsonObj.get("parent_relationship"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAllProfileWorkerRelationsExternalId200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAllProfileWorkerRelationsExternalId200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAllProfileWorkerRelationsExternalId200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAllProfileWorkerRelationsExternalId200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAllProfileWorkerRelationsExternalId200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, GetAllProfileWorkerRelationsExternalId200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAllProfileWorkerRelationsExternalId200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAllProfileWorkerRelationsExternalId200ResponseDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAllProfileWorkerRelationsExternalId200ResponseDataInner
   * @throws IOException if the JSON string is invalid with respect to GetAllProfileWorkerRelationsExternalId200ResponseDataInner
   */
  public static GetAllProfileWorkerRelationsExternalId200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAllProfileWorkerRelationsExternalId200ResponseDataInner.class);
  }

  /**
   * Convert an instance of GetAllProfileWorkerRelationsExternalId200ResponseDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

