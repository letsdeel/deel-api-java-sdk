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
import org.openapitools.client.model.HrisJobInformationTitleId;
import org.openapitools.client.model.HrisJobInformationTitleName;



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
public class HrisDirectEmployeeJobInformation extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(HrisDirectEmployeeJobInformation.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!HrisDirectEmployeeJobInformation.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'HrisDirectEmployeeJobInformation' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<HrisJobInformationTitleId> adapterHrisJobInformationTitleId = gson.getDelegateAdapter(this, TypeToken.get(HrisJobInformationTitleId.class));
            final TypeAdapter<HrisJobInformationTitleName> adapterHrisJobInformationTitleName = gson.getDelegateAdapter(this, TypeToken.get(HrisJobInformationTitleName.class));

            return (TypeAdapter<T>) new TypeAdapter<HrisDirectEmployeeJobInformation>() {
                @Override
                public void write(JsonWriter out, HrisDirectEmployeeJobInformation value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `HrisJobInformationTitleId`
                    if (value.getActualInstance() instanceof HrisJobInformationTitleId) {
                        JsonElement element = adapterHrisJobInformationTitleId.toJsonTree((HrisJobInformationTitleId)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `HrisJobInformationTitleName`
                    if (value.getActualInstance() instanceof HrisJobInformationTitleName) {
                        JsonElement element = adapterHrisJobInformationTitleName.toJsonTree((HrisJobInformationTitleName)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: HrisJobInformationTitleId, HrisJobInformationTitleName");
                }

                @Override
                public HrisDirectEmployeeJobInformation read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize HrisJobInformationTitleId
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HrisJobInformationTitleId.validateJsonElement(jsonElement);
                        actualAdapter = adapterHrisJobInformationTitleId;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HrisJobInformationTitleId'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HrisJobInformationTitleId failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HrisJobInformationTitleId'", e);
                    }
                    // deserialize HrisJobInformationTitleName
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HrisJobInformationTitleName.validateJsonElement(jsonElement);
                        actualAdapter = adapterHrisJobInformationTitleName;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HrisJobInformationTitleName'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HrisJobInformationTitleName failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HrisJobInformationTitleName'", e);
                    }

                    if (match == 1) {
                        HrisDirectEmployeeJobInformation ret = new HrisDirectEmployeeJobInformation();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for HrisDirectEmployeeJobInformation: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public HrisDirectEmployeeJobInformation() {
        super("oneOf", Boolean.FALSE);
    }

    public HrisDirectEmployeeJobInformation(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("HrisJobInformationTitleId", HrisJobInformationTitleId.class);
        schemas.put("HrisJobInformationTitleName", HrisJobInformationTitleName.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return HrisDirectEmployeeJobInformation.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * HrisJobInformationTitleId, HrisJobInformationTitleName
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof HrisJobInformationTitleId) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof HrisJobInformationTitleName) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be HrisJobInformationTitleId, HrisJobInformationTitleName");
    }

    /**
     * Get the actual instance, which can be the following:
     * HrisJobInformationTitleId, HrisJobInformationTitleName
     *
     * @return The actual instance (HrisJobInformationTitleId, HrisJobInformationTitleName)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `HrisJobInformationTitleId`. If the actual instance is not `HrisJobInformationTitleId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HrisJobInformationTitleId`
     * @throws ClassCastException if the instance is not `HrisJobInformationTitleId`
     */
    public HrisJobInformationTitleId getHrisJobInformationTitleId() throws ClassCastException {
        return (HrisJobInformationTitleId)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HrisJobInformationTitleName`. If the actual instance is not `HrisJobInformationTitleName`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HrisJobInformationTitleName`
     * @throws ClassCastException if the instance is not `HrisJobInformationTitleName`
     */
    public HrisJobInformationTitleName getHrisJobInformationTitleName() throws ClassCastException {
        return (HrisJobInformationTitleName)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to HrisDirectEmployeeJobInformation
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with HrisJobInformationTitleId
        try {
            HrisJobInformationTitleId.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for HrisJobInformationTitleId failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with HrisJobInformationTitleName
        try {
            HrisJobInformationTitleName.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for HrisJobInformationTitleName failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for HrisDirectEmployeeJobInformation with oneOf schemas: HrisJobInformationTitleId, HrisJobInformationTitleName. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of HrisDirectEmployeeJobInformation given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of HrisDirectEmployeeJobInformation
     * @throws IOException if the JSON string is invalid with respect to HrisDirectEmployeeJobInformation
     */
    public static HrisDirectEmployeeJobInformation fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, HrisDirectEmployeeJobInformation.class);
    }

    /**
     * Convert an instance of HrisDirectEmployeeJobInformation to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

