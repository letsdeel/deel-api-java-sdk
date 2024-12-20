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
import org.openapitools.client.model.UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-20T14:19:15.487453130Z[GMT]", comments = "Generator version: 7.10.0")
public class UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf> adapterUpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf = gson.getDelegateAdapter(this, TypeToken.get(UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf.class));

            return (TypeAdapter<T>) new TypeAdapter<UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner>() {
                @Override
                public void write(JsonWriter out, UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf`
                    if (value.getActualInstance() instanceof UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf) {
                        JsonElement element = adapterUpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf.toJsonTree((UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf");
                }

                @Override
                public UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterUpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf'", e);
                    }

                    if (match == 1) {
                        UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner ret = new UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf", UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf
     *
     * @return The actual instance (UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf`. If the actual instance is not `UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf`
     * @throws ClassCastException if the instance is not `UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf`
     */
    public UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf getUpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf() throws ClassCastException {
        return (UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf
        try {
            UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner with oneOf schemas: UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInnerOneOf. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner
     * @throws IOException if the JSON string is invalid with respect to UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner
     */
    public static UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner.class);
    }

    /**
     * Convert an instance of UpsertChildWorkerRelationsExternalIdRequestDataChildHrisProfileIdsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

