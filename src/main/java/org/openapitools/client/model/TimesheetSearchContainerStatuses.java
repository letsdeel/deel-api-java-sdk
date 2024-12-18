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
import java.util.List;
import org.openapitools.client.model.TimesheetStatusEnum;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T16:04:44.564028033Z[GMT]", comments = "Generator version: 7.10.0")
public class TimesheetSearchContainerStatuses extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TimesheetSearchContainerStatuses.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TimesheetSearchContainerStatuses.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TimesheetSearchContainerStatuses' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final Type typeInstanceListTimesheetStatusEnum = new TypeToken<List<TimesheetStatusEnum>>(){}.getType();
            final TypeAdapter<List<TimesheetStatusEnum>> adapterListTimesheetStatusEnum = (TypeAdapter<List<TimesheetStatusEnum>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListTimesheetStatusEnum));
            final TypeAdapter<TimesheetStatusEnum> adapterTimesheetStatusEnum = gson.getDelegateAdapter(this, TypeToken.get(TimesheetStatusEnum.class));

            return (TypeAdapter<T>) new TypeAdapter<TimesheetSearchContainerStatuses>() {
                @Override
                public void write(JsonWriter out, TimesheetSearchContainerStatuses value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List<TimesheetStatusEnum>`
                    if (value.getActualInstance() instanceof List<?>) {
                        List<?> list = (List<?>) value.getActualInstance();
                        if (list.get(0) instanceof TimesheetStatusEnum) {
                            JsonArray array = adapterListTimesheetStatusEnum.toJsonTree((List<TimesheetStatusEnum>)value.getActualInstance()).getAsJsonArray();
                            elementAdapter.write(out, array);
                            return;
                        }
                    }
                    // check if the actual instance is of the type `TimesheetStatusEnum`
                    if (value.getActualInstance() instanceof TimesheetStatusEnum) {
                        JsonElement element = adapterTimesheetStatusEnum.toJsonTree((TimesheetStatusEnum)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: List<TimesheetStatusEnum>, TimesheetStatusEnum");
                }

                @Override
                public TimesheetSearchContainerStatuses read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<TimesheetStatusEnum>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            TimesheetStatusEnum.validateJsonElement(element);
                        }
                        actualAdapter = adapterListTimesheetStatusEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<TimesheetStatusEnum>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<TimesheetStatusEnum> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<TimesheetStatusEnum>'", e);
                    }
                    // deserialize TimesheetStatusEnum
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TimesheetStatusEnum.validateJsonElement(jsonElement);
                        actualAdapter = adapterTimesheetStatusEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TimesheetStatusEnum'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TimesheetStatusEnum failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TimesheetStatusEnum'", e);
                    }

                    if (match == 1) {
                        TimesheetSearchContainerStatuses ret = new TimesheetSearchContainerStatuses();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TimesheetSearchContainerStatuses: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TimesheetSearchContainerStatuses() {
        super("oneOf", Boolean.FALSE);
    }

    public TimesheetSearchContainerStatuses(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<TimesheetStatusEnum>", List.class);
        schemas.put("TimesheetStatusEnum", TimesheetStatusEnum.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TimesheetSearchContainerStatuses.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<TimesheetStatusEnum>, TimesheetStatusEnum
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof TimesheetStatusEnum) {
                super.setActualInstance(instance);
                return;
            }
        }

        if (instance instanceof TimesheetStatusEnum) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be List<TimesheetStatusEnum>, TimesheetStatusEnum");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<TimesheetStatusEnum>, TimesheetStatusEnum
     *
     * @return The actual instance (List<TimesheetStatusEnum>, TimesheetStatusEnum)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<TimesheetStatusEnum>`. If the actual instance is not `List<TimesheetStatusEnum>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<TimesheetStatusEnum>`
     * @throws ClassCastException if the instance is not `List<TimesheetStatusEnum>`
     */
    public List<TimesheetStatusEnum> getListTimesheetStatusEnum() throws ClassCastException {
        return (List<TimesheetStatusEnum>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimesheetStatusEnum`. If the actual instance is not `TimesheetStatusEnum`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimesheetStatusEnum`
     * @throws ClassCastException if the instance is not `TimesheetStatusEnum`
     */
    public TimesheetStatusEnum getTimesheetStatusEnum() throws ClassCastException {
        return (TimesheetStatusEnum)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TimesheetSearchContainerStatuses
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with List<TimesheetStatusEnum>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                TimesheetStatusEnum.validateJsonElement(element);
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<TimesheetStatusEnum> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TimesheetStatusEnum
        try {
            TimesheetStatusEnum.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TimesheetStatusEnum failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for TimesheetSearchContainerStatuses with oneOf schemas: List<TimesheetStatusEnum>, TimesheetStatusEnum. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of TimesheetSearchContainerStatuses given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TimesheetSearchContainerStatuses
     * @throws IOException if the JSON string is invalid with respect to TimesheetSearchContainerStatuses
     */
    public static TimesheetSearchContainerStatuses fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TimesheetSearchContainerStatuses.class);
    }

    /**
     * Convert an instance of TimesheetSearchContainerStatuses to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

