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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.HrisDirectEmployeeContractFullTime;
import org.openapitools.client.model.HrisDirectEmployeeContractPartTime;
import org.openapitools.jackson.nullable.JsonNullable;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T00:01:04.080474088Z[GMT]", comments = "Generator version: 7.10.0")
public class HrisDirectEmployeeToCreateContainerDataEmployment extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(HrisDirectEmployeeToCreateContainerDataEmployment.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!HrisDirectEmployeeToCreateContainerDataEmployment.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'HrisDirectEmployeeToCreateContainerDataEmployment' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<HrisDirectEmployeeContractPartTime> adapterHrisDirectEmployeeContractPartTime = gson.getDelegateAdapter(this, TypeToken.get(HrisDirectEmployeeContractPartTime.class));
            final TypeAdapter<HrisDirectEmployeeContractFullTime> adapterHrisDirectEmployeeContractFullTime = gson.getDelegateAdapter(this, TypeToken.get(HrisDirectEmployeeContractFullTime.class));

            return (TypeAdapter<T>) new TypeAdapter<HrisDirectEmployeeToCreateContainerDataEmployment>() {
                @Override
                public void write(JsonWriter out, HrisDirectEmployeeToCreateContainerDataEmployment value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `HrisDirectEmployeeContractPartTime`
                    if (value.getActualInstance() instanceof HrisDirectEmployeeContractPartTime) {
                        JsonElement element = adapterHrisDirectEmployeeContractPartTime.toJsonTree((HrisDirectEmployeeContractPartTime)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `HrisDirectEmployeeContractFullTime`
                    if (value.getActualInstance() instanceof HrisDirectEmployeeContractFullTime) {
                        JsonElement element = adapterHrisDirectEmployeeContractFullTime.toJsonTree((HrisDirectEmployeeContractFullTime)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: HrisDirectEmployeeContractFullTime, HrisDirectEmployeeContractPartTime");
                }

                @Override
                public HrisDirectEmployeeToCreateContainerDataEmployment read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize HrisDirectEmployeeContractPartTime
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HrisDirectEmployeeContractPartTime.validateJsonElement(jsonElement);
                        actualAdapter = adapterHrisDirectEmployeeContractPartTime;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HrisDirectEmployeeContractPartTime'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HrisDirectEmployeeContractPartTime failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HrisDirectEmployeeContractPartTime'", e);
                    }
                    // deserialize HrisDirectEmployeeContractFullTime
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HrisDirectEmployeeContractFullTime.validateJsonElement(jsonElement);
                        actualAdapter = adapterHrisDirectEmployeeContractFullTime;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HrisDirectEmployeeContractFullTime'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HrisDirectEmployeeContractFullTime failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HrisDirectEmployeeContractFullTime'", e);
                    }

                    if (match == 1) {
                        HrisDirectEmployeeToCreateContainerDataEmployment ret = new HrisDirectEmployeeToCreateContainerDataEmployment();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for HrisDirectEmployeeToCreateContainerDataEmployment: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public HrisDirectEmployeeToCreateContainerDataEmployment() {
        super("oneOf", Boolean.FALSE);
    }

    public HrisDirectEmployeeToCreateContainerDataEmployment(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("HrisDirectEmployeeContractPartTime", HrisDirectEmployeeContractPartTime.class);
        schemas.put("HrisDirectEmployeeContractFullTime", HrisDirectEmployeeContractFullTime.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return HrisDirectEmployeeToCreateContainerDataEmployment.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * HrisDirectEmployeeContractFullTime, HrisDirectEmployeeContractPartTime
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof HrisDirectEmployeeContractPartTime) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof HrisDirectEmployeeContractFullTime) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be HrisDirectEmployeeContractFullTime, HrisDirectEmployeeContractPartTime");
    }

    /**
     * Get the actual instance, which can be the following:
     * HrisDirectEmployeeContractFullTime, HrisDirectEmployeeContractPartTime
     *
     * @return The actual instance (HrisDirectEmployeeContractFullTime, HrisDirectEmployeeContractPartTime)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `HrisDirectEmployeeContractPartTime`. If the actual instance is not `HrisDirectEmployeeContractPartTime`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HrisDirectEmployeeContractPartTime`
     * @throws ClassCastException if the instance is not `HrisDirectEmployeeContractPartTime`
     */
    public HrisDirectEmployeeContractPartTime getHrisDirectEmployeeContractPartTime() throws ClassCastException {
        return (HrisDirectEmployeeContractPartTime)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HrisDirectEmployeeContractFullTime`. If the actual instance is not `HrisDirectEmployeeContractFullTime`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HrisDirectEmployeeContractFullTime`
     * @throws ClassCastException if the instance is not `HrisDirectEmployeeContractFullTime`
     */
    public HrisDirectEmployeeContractFullTime getHrisDirectEmployeeContractFullTime() throws ClassCastException {
        return (HrisDirectEmployeeContractFullTime)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to HrisDirectEmployeeToCreateContainerDataEmployment
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with HrisDirectEmployeeContractPartTime
        try {
            HrisDirectEmployeeContractPartTime.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for HrisDirectEmployeeContractPartTime failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with HrisDirectEmployeeContractFullTime
        try {
            HrisDirectEmployeeContractFullTime.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for HrisDirectEmployeeContractFullTime failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for HrisDirectEmployeeToCreateContainerDataEmployment with oneOf schemas: HrisDirectEmployeeContractFullTime, HrisDirectEmployeeContractPartTime. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of HrisDirectEmployeeToCreateContainerDataEmployment given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of HrisDirectEmployeeToCreateContainerDataEmployment
     * @throws IOException if the JSON string is invalid with respect to HrisDirectEmployeeToCreateContainerDataEmployment
     */
    public static HrisDirectEmployeeToCreateContainerDataEmployment fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, HrisDirectEmployeeToCreateContainerDataEmployment.class);
    }

    /**
     * Convert an instance of HrisDirectEmployeeToCreateContainerDataEmployment to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

