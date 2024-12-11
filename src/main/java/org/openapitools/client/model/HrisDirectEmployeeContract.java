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
import org.openapitools.client.model.HrisContractFullTime;
import org.openapitools.client.model.HrisContractPartTime;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T19:18:25.377714672Z[GMT]", comments = "Generator version: 7.10.0")
public class HrisDirectEmployeeContract extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(HrisDirectEmployeeContract.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!HrisDirectEmployeeContract.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'HrisDirectEmployeeContract' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<HrisContractPartTime> adapterHrisContractPartTime = gson.getDelegateAdapter(this, TypeToken.get(HrisContractPartTime.class));
            final TypeAdapter<HrisContractFullTime> adapterHrisContractFullTime = gson.getDelegateAdapter(this, TypeToken.get(HrisContractFullTime.class));

            return (TypeAdapter<T>) new TypeAdapter<HrisDirectEmployeeContract>() {
                @Override
                public void write(JsonWriter out, HrisDirectEmployeeContract value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `HrisContractPartTime`
                    if (value.getActualInstance() instanceof HrisContractPartTime) {
                        JsonElement element = adapterHrisContractPartTime.toJsonTree((HrisContractPartTime)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `HrisContractFullTime`
                    if (value.getActualInstance() instanceof HrisContractFullTime) {
                        JsonElement element = adapterHrisContractFullTime.toJsonTree((HrisContractFullTime)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: HrisContractFullTime, HrisContractPartTime");
                }

                @Override
                public HrisDirectEmployeeContract read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize HrisContractPartTime
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HrisContractPartTime.validateJsonElement(jsonElement);
                        actualAdapter = adapterHrisContractPartTime;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HrisContractPartTime'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HrisContractPartTime failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HrisContractPartTime'", e);
                    }
                    // deserialize HrisContractFullTime
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HrisContractFullTime.validateJsonElement(jsonElement);
                        actualAdapter = adapterHrisContractFullTime;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HrisContractFullTime'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HrisContractFullTime failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HrisContractFullTime'", e);
                    }

                    if (match == 1) {
                        HrisDirectEmployeeContract ret = new HrisDirectEmployeeContract();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for HrisDirectEmployeeContract: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public HrisDirectEmployeeContract() {
        super("oneOf", Boolean.FALSE);
    }

    public HrisDirectEmployeeContract(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("HrisContractPartTime", HrisContractPartTime.class);
        schemas.put("HrisContractFullTime", HrisContractFullTime.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return HrisDirectEmployeeContract.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * HrisContractFullTime, HrisContractPartTime
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof HrisContractPartTime) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof HrisContractFullTime) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be HrisContractFullTime, HrisContractPartTime");
    }

    /**
     * Get the actual instance, which can be the following:
     * HrisContractFullTime, HrisContractPartTime
     *
     * @return The actual instance (HrisContractFullTime, HrisContractPartTime)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `HrisContractPartTime`. If the actual instance is not `HrisContractPartTime`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HrisContractPartTime`
     * @throws ClassCastException if the instance is not `HrisContractPartTime`
     */
    public HrisContractPartTime getHrisContractPartTime() throws ClassCastException {
        return (HrisContractPartTime)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HrisContractFullTime`. If the actual instance is not `HrisContractFullTime`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HrisContractFullTime`
     * @throws ClassCastException if the instance is not `HrisContractFullTime`
     */
    public HrisContractFullTime getHrisContractFullTime() throws ClassCastException {
        return (HrisContractFullTime)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to HrisDirectEmployeeContract
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with HrisContractPartTime
        try {
            HrisContractPartTime.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for HrisContractPartTime failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with HrisContractFullTime
        try {
            HrisContractFullTime.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for HrisContractFullTime failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for HrisDirectEmployeeContract with oneOf schemas: HrisContractFullTime, HrisContractPartTime. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of HrisDirectEmployeeContract given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of HrisDirectEmployeeContract
     * @throws IOException if the JSON string is invalid with respect to HrisDirectEmployeeContract
     */
    public static HrisDirectEmployeeContract fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, HrisDirectEmployeeContract.class);
    }

    /**
     * Convert an instance of HrisDirectEmployeeContract to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

