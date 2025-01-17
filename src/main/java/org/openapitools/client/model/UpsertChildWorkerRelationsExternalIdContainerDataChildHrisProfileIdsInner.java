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
import org.openapitools.client.model.UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:33:09.703830198Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf> adapterUpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf = gson.getDelegateAdapter(this, TypeToken.get(UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf.class));

            return (TypeAdapter<T>) new TypeAdapter<UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner>() {
                @Override
                public void write(JsonWriter out, UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf`
                    if (value.getActualInstance() instanceof UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf) {
                        JsonElement element = adapterUpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf.toJsonTree((UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf");
                }

                @Override
                public UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf'", e);
                    }

                    if (match == 1) {
                        UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner ret = new UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf", UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf
     *
     * @return The actual instance (UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf`. If the actual instance is not `UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf`
     * @throws ClassCastException if the instance is not `UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf`
     */
    public UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf getUpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf() throws ClassCastException {
        return (UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf
        try {
            UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner with oneOf schemas: UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInnerOneOf. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner
     * @throws IOException if the JSON string is invalid with respect to UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner
     */
    public static UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner.class);
    }

    /**
     * Convert an instance of UpsertChildWorkerRelationsExternalIdContainerDataChildHrisProfileIdsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

