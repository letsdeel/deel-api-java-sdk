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
import org.openapitools.client.model.WorkerTerminationBodySeveranceOneOf;
import org.openapitools.client.model.WorkerTerminationBodySeveranceOneOf1;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:40:51.396070831Z[GMT]", comments = "Generator version: 7.10.0")
public class WorkerTerminationBodySeverance extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WorkerTerminationBodySeverance.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WorkerTerminationBodySeverance.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WorkerTerminationBodySeverance' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WorkerTerminationBodySeveranceOneOf> adapterWorkerTerminationBodySeveranceOneOf = gson.getDelegateAdapter(this, TypeToken.get(WorkerTerminationBodySeveranceOneOf.class));
            final TypeAdapter<WorkerTerminationBodySeveranceOneOf1> adapterWorkerTerminationBodySeveranceOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(WorkerTerminationBodySeveranceOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<WorkerTerminationBodySeverance>() {
                @Override
                public void write(JsonWriter out, WorkerTerminationBodySeverance value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `WorkerTerminationBodySeveranceOneOf`
                    if (value.getActualInstance() instanceof WorkerTerminationBodySeveranceOneOf) {
                        JsonElement element = adapterWorkerTerminationBodySeveranceOneOf.toJsonTree((WorkerTerminationBodySeveranceOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `WorkerTerminationBodySeveranceOneOf1`
                    if (value.getActualInstance() instanceof WorkerTerminationBodySeveranceOneOf1) {
                        JsonElement element = adapterWorkerTerminationBodySeveranceOneOf1.toJsonTree((WorkerTerminationBodySeveranceOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: WorkerTerminationBodySeveranceOneOf, WorkerTerminationBodySeveranceOneOf1");
                }

                @Override
                public WorkerTerminationBodySeverance read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize WorkerTerminationBodySeveranceOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkerTerminationBodySeveranceOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkerTerminationBodySeveranceOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkerTerminationBodySeveranceOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkerTerminationBodySeveranceOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkerTerminationBodySeveranceOneOf'", e);
                    }
                    // deserialize WorkerTerminationBodySeveranceOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkerTerminationBodySeveranceOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterWorkerTerminationBodySeveranceOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkerTerminationBodySeveranceOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkerTerminationBodySeveranceOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkerTerminationBodySeveranceOneOf1'", e);
                    }

                    if (match == 1) {
                        WorkerTerminationBodySeverance ret = new WorkerTerminationBodySeverance();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for WorkerTerminationBodySeverance: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public WorkerTerminationBodySeverance() {
        super("oneOf", Boolean.FALSE);
    }

    public WorkerTerminationBodySeverance(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("WorkerTerminationBodySeveranceOneOf", WorkerTerminationBodySeveranceOneOf.class);
        schemas.put("WorkerTerminationBodySeveranceOneOf1", WorkerTerminationBodySeveranceOneOf1.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return WorkerTerminationBodySeverance.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * WorkerTerminationBodySeveranceOneOf, WorkerTerminationBodySeveranceOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof WorkerTerminationBodySeveranceOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WorkerTerminationBodySeveranceOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be WorkerTerminationBodySeveranceOneOf, WorkerTerminationBodySeveranceOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * WorkerTerminationBodySeveranceOneOf, WorkerTerminationBodySeveranceOneOf1
     *
     * @return The actual instance (WorkerTerminationBodySeveranceOneOf, WorkerTerminationBodySeveranceOneOf1)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `WorkerTerminationBodySeveranceOneOf`. If the actual instance is not `WorkerTerminationBodySeveranceOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkerTerminationBodySeveranceOneOf`
     * @throws ClassCastException if the instance is not `WorkerTerminationBodySeveranceOneOf`
     */
    public WorkerTerminationBodySeveranceOneOf getWorkerTerminationBodySeveranceOneOf() throws ClassCastException {
        return (WorkerTerminationBodySeveranceOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WorkerTerminationBodySeveranceOneOf1`. If the actual instance is not `WorkerTerminationBodySeveranceOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkerTerminationBodySeveranceOneOf1`
     * @throws ClassCastException if the instance is not `WorkerTerminationBodySeveranceOneOf1`
     */
    public WorkerTerminationBodySeveranceOneOf1 getWorkerTerminationBodySeveranceOneOf1() throws ClassCastException {
        return (WorkerTerminationBodySeveranceOneOf1)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WorkerTerminationBodySeverance
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with WorkerTerminationBodySeveranceOneOf
        try {
            WorkerTerminationBodySeveranceOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkerTerminationBodySeveranceOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with WorkerTerminationBodySeveranceOneOf1
        try {
            WorkerTerminationBodySeveranceOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for WorkerTerminationBodySeveranceOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for WorkerTerminationBodySeverance with oneOf schemas: WorkerTerminationBodySeveranceOneOf, WorkerTerminationBodySeveranceOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of WorkerTerminationBodySeverance given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WorkerTerminationBodySeverance
     * @throws IOException if the JSON string is invalid with respect to WorkerTerminationBodySeverance
     */
    public static WorkerTerminationBodySeverance fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WorkerTerminationBodySeverance.class);
    }

    /**
     * Convert an instance of WorkerTerminationBodySeverance to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

