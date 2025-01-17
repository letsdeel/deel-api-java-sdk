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
import org.openapitools.client.model.GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerChildRelationshipsInner;
import org.openapitools.client.model.GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerParentRelationship;

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
 * GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private UUID id;

  public static final String SERIALIZED_NAME_IS_PARENT = "is_parent";
  @SerializedName(SERIALIZED_NAME_IS_PARENT)
  @javax.annotation.Nullable
  private Boolean isParent;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  @javax.annotation.Nullable
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  @javax.annotation.Nullable
  private UUID externalId;

  public static final String SERIALIZED_NAME_PARENT_RELATIONSHIP = "parent_relationship";
  @SerializedName(SERIALIZED_NAME_PARENT_RELATIONSHIP)
  @javax.annotation.Nullable
  private GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerParentRelationship parentRelationship;

  public static final String SERIALIZED_NAME_CHILD_RELATIONSHIPS = "child_relationships";
  @SerializedName(SERIALIZED_NAME_CHILD_RELATIONSHIPS)
  @javax.annotation.Nullable
  private List<GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerChildRelationshipsInner> childRelationships = new ArrayList<>();

  public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner() {
  }

  public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner id(@javax.annotation.Nullable UUID id) {
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


  public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner isParent(@javax.annotation.Nullable Boolean isParent) {
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


  public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner isDefault(@javax.annotation.Nullable Boolean isDefault) {
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


  public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner name(@javax.annotation.Nullable String name) {
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


  public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner externalId(@javax.annotation.Nullable UUID externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * The external ID of the relation type
   * @return externalId
   */
  @javax.annotation.Nullable
  public UUID getExternalId() {
    return externalId;
  }

  public void setExternalId(@javax.annotation.Nullable UUID externalId) {
    this.externalId = externalId;
  }


  public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner parentRelationship(@javax.annotation.Nullable GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerParentRelationship parentRelationship) {
    this.parentRelationship = parentRelationship;
    return this;
  }

  /**
   * Get parentRelationship
   * @return parentRelationship
   */
  @javax.annotation.Nullable
  public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerParentRelationship getParentRelationship() {
    return parentRelationship;
  }

  public void setParentRelationship(@javax.annotation.Nullable GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerParentRelationship parentRelationship) {
    this.parentRelationship = parentRelationship;
  }


  public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner childRelationships(@javax.annotation.Nullable List<GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerChildRelationshipsInner> childRelationships) {
    this.childRelationships = childRelationships;
    return this;
  }

  public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner addChildRelationshipsItem(GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerChildRelationshipsInner childRelationshipsItem) {
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
  public List<GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerChildRelationshipsInner> getChildRelationships() {
    return childRelationships;
  }

  public void setChildRelationships(@javax.annotation.Nullable List<GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerChildRelationshipsInner> childRelationships) {
    this.childRelationships = childRelationships;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner getAllProfileWorkerRelationsExternalIdResponseContainerDataInner = (GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner) o;
    return Objects.equals(this.id, getAllProfileWorkerRelationsExternalIdResponseContainerDataInner.id) &&
        Objects.equals(this.isParent, getAllProfileWorkerRelationsExternalIdResponseContainerDataInner.isParent) &&
        Objects.equals(this.isDefault, getAllProfileWorkerRelationsExternalIdResponseContainerDataInner.isDefault) &&
        Objects.equals(this.name, getAllProfileWorkerRelationsExternalIdResponseContainerDataInner.name) &&
        Objects.equals(this.externalId, getAllProfileWorkerRelationsExternalIdResponseContainerDataInner.externalId) &&
        Objects.equals(this.parentRelationship, getAllProfileWorkerRelationsExternalIdResponseContainerDataInner.parentRelationship) &&
        Objects.equals(this.childRelationships, getAllProfileWorkerRelationsExternalIdResponseContainerDataInner.childRelationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isParent, isDefault, name, externalId, parentRelationship, childRelationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isParent: ").append(toIndentedString(isParent)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    parentRelationship: ").append(toIndentedString(parentRelationship)).append("\n");
    sb.append("    childRelationships: ").append(toIndentedString(childRelationships)).append("\n");
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
    openapiFields.add("is_parent");
    openapiFields.add("is_default");
    openapiFields.add("name");
    openapiFields.add("external_id");
    openapiFields.add("parent_relationship");
    openapiFields.add("child_relationships");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner is not found in the empty JSON string", GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      // validate the optional field `parent_relationship`
      if (jsonObj.get("parent_relationship") != null && !jsonObj.get("parent_relationship").isJsonNull()) {
        GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerParentRelationship.validateJsonElement(jsonObj.get("parent_relationship"));
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
            GetAllProfileWorkerRelationsExternalIdResponseContainerDataInnerChildRelationshipsInner.validateJsonElement(jsonArraychildRelationships.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner>() {
           @Override
           public void write(JsonWriter out, GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner
   * @throws IOException if the JSON string is invalid with respect to GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner
   */
  public static GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner.class);
  }

  /**
   * Convert an instance of GetAllProfileWorkerRelationsExternalIdResponseContainerDataInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

