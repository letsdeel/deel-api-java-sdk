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
import org.openapitools.client.model.TimesheetTypeEnum;



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
public class TimesheetSearchContainerTypes extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TimesheetSearchContainerTypes.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TimesheetSearchContainerTypes.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TimesheetSearchContainerTypes' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final Type typeInstanceListTimesheetTypeEnum = new TypeToken<List<TimesheetTypeEnum>>(){}.getType();
            final TypeAdapter<List<TimesheetTypeEnum>> adapterListTimesheetTypeEnum = (TypeAdapter<List<TimesheetTypeEnum>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListTimesheetTypeEnum));
            final TypeAdapter<TimesheetTypeEnum> adapterTimesheetTypeEnum = gson.getDelegateAdapter(this, TypeToken.get(TimesheetTypeEnum.class));

            return (TypeAdapter<T>) new TypeAdapter<TimesheetSearchContainerTypes>() {
                @Override
                public void write(JsonWriter out, TimesheetSearchContainerTypes value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List<TimesheetTypeEnum>`
                    if (value.getActualInstance() instanceof List<?>) {
                        List<?> list = (List<?>) value.getActualInstance();
                        if (list.get(0) instanceof TimesheetTypeEnum) {
                            JsonArray array = adapterListTimesheetTypeEnum.toJsonTree((List<TimesheetTypeEnum>)value.getActualInstance()).getAsJsonArray();
                            elementAdapter.write(out, array);
                            return;
                        }
                    }
                    // check if the actual instance is of the type `TimesheetTypeEnum`
                    if (value.getActualInstance() instanceof TimesheetTypeEnum) {
                        JsonElement element = adapterTimesheetTypeEnum.toJsonTree((TimesheetTypeEnum)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: List<TimesheetTypeEnum>, TimesheetTypeEnum");
                }

                @Override
                public TimesheetSearchContainerTypes read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<TimesheetTypeEnum>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            TimesheetTypeEnum.validateJsonElement(element);
                        }
                        actualAdapter = adapterListTimesheetTypeEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<TimesheetTypeEnum>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<TimesheetTypeEnum> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<TimesheetTypeEnum>'", e);
                    }
                    // deserialize TimesheetTypeEnum
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TimesheetTypeEnum.validateJsonElement(jsonElement);
                        actualAdapter = adapterTimesheetTypeEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TimesheetTypeEnum'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TimesheetTypeEnum failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TimesheetTypeEnum'", e);
                    }

                    if (match == 1) {
                        TimesheetSearchContainerTypes ret = new TimesheetSearchContainerTypes();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TimesheetSearchContainerTypes: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TimesheetSearchContainerTypes() {
        super("oneOf", Boolean.FALSE);
    }

    public TimesheetSearchContainerTypes(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<TimesheetTypeEnum>", List.class);
        schemas.put("TimesheetTypeEnum", TimesheetTypeEnum.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TimesheetSearchContainerTypes.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<TimesheetTypeEnum>, TimesheetTypeEnum
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof TimesheetTypeEnum) {
                super.setActualInstance(instance);
                return;
            }
        }

        if (instance instanceof TimesheetTypeEnum) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be List<TimesheetTypeEnum>, TimesheetTypeEnum");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<TimesheetTypeEnum>, TimesheetTypeEnum
     *
     * @return The actual instance (List<TimesheetTypeEnum>, TimesheetTypeEnum)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<TimesheetTypeEnum>`. If the actual instance is not `List<TimesheetTypeEnum>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<TimesheetTypeEnum>`
     * @throws ClassCastException if the instance is not `List<TimesheetTypeEnum>`
     */
    public List<TimesheetTypeEnum> getListTimesheetTypeEnum() throws ClassCastException {
        return (List<TimesheetTypeEnum>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimesheetTypeEnum`. If the actual instance is not `TimesheetTypeEnum`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimesheetTypeEnum`
     * @throws ClassCastException if the instance is not `TimesheetTypeEnum`
     */
    public TimesheetTypeEnum getTimesheetTypeEnum() throws ClassCastException {
        return (TimesheetTypeEnum)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TimesheetSearchContainerTypes
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with List<TimesheetTypeEnum>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                TimesheetTypeEnum.validateJsonElement(element);
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<TimesheetTypeEnum> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TimesheetTypeEnum
        try {
            TimesheetTypeEnum.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TimesheetTypeEnum failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for TimesheetSearchContainerTypes with oneOf schemas: List<TimesheetTypeEnum>, TimesheetTypeEnum. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of TimesheetSearchContainerTypes given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TimesheetSearchContainerTypes
     * @throws IOException if the JSON string is invalid with respect to TimesheetSearchContainerTypes
     */
    public static TimesheetSearchContainerTypes fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TimesheetSearchContainerTypes.class);
    }

    /**
     * Convert an instance of TimesheetSearchContainerTypes to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

