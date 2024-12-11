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
import org.openapitools.client.model.ContractStatusEnum;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T23:39:46.997965815Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractSearchFormWithoutCursorStatuses extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ContractSearchFormWithoutCursorStatuses.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContractSearchFormWithoutCursorStatuses.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ContractSearchFormWithoutCursorStatuses' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final Type typeInstanceListContractStatusEnum = new TypeToken<List<ContractStatusEnum>>(){}.getType();
            final TypeAdapter<List<ContractStatusEnum>> adapterListContractStatusEnum = (TypeAdapter<List<ContractStatusEnum>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListContractStatusEnum));
            final TypeAdapter<ContractStatusEnum> adapterContractStatusEnum = gson.getDelegateAdapter(this, TypeToken.get(ContractStatusEnum.class));

            return (TypeAdapter<T>) new TypeAdapter<ContractSearchFormWithoutCursorStatuses>() {
                @Override
                public void write(JsonWriter out, ContractSearchFormWithoutCursorStatuses value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List<ContractStatusEnum>`
                    if (value.getActualInstance() instanceof List<?>) {
                        List<?> list = (List<?>) value.getActualInstance();
                        if (list.get(0) instanceof ContractStatusEnum) {
                            JsonArray array = adapterListContractStatusEnum.toJsonTree((List<ContractStatusEnum>)value.getActualInstance()).getAsJsonArray();
                            elementAdapter.write(out, array);
                            return;
                        }
                    }
                    // check if the actual instance is of the type `ContractStatusEnum`
                    if (value.getActualInstance() instanceof ContractStatusEnum) {
                        JsonElement element = adapterContractStatusEnum.toJsonTree((ContractStatusEnum)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ContractStatusEnum, List<ContractStatusEnum>");
                }

                @Override
                public ContractSearchFormWithoutCursorStatuses read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<ContractStatusEnum>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            ContractStatusEnum.validateJsonElement(element);
                        }
                        actualAdapter = adapterListContractStatusEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<ContractStatusEnum>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<ContractStatusEnum> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<ContractStatusEnum>'", e);
                    }
                    // deserialize ContractStatusEnum
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContractStatusEnum.validateJsonElement(jsonElement);
                        actualAdapter = adapterContractStatusEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContractStatusEnum'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContractStatusEnum failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContractStatusEnum'", e);
                    }

                    if (match == 1) {
                        ContractSearchFormWithoutCursorStatuses ret = new ContractSearchFormWithoutCursorStatuses();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ContractSearchFormWithoutCursorStatuses: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ContractSearchFormWithoutCursorStatuses() {
        super("oneOf", Boolean.FALSE);
    }

    public ContractSearchFormWithoutCursorStatuses(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<ContractStatusEnum>", List.class);
        schemas.put("ContractStatusEnum", ContractStatusEnum.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ContractSearchFormWithoutCursorStatuses.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ContractStatusEnum, List<ContractStatusEnum>
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof ContractStatusEnum) {
                super.setActualInstance(instance);
                return;
            }
        }

        if (instance instanceof ContractStatusEnum) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ContractStatusEnum, List<ContractStatusEnum>");
    }

    /**
     * Get the actual instance, which can be the following:
     * ContractStatusEnum, List<ContractStatusEnum>
     *
     * @return The actual instance (ContractStatusEnum, List<ContractStatusEnum>)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<ContractStatusEnum>`. If the actual instance is not `List<ContractStatusEnum>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<ContractStatusEnum>`
     * @throws ClassCastException if the instance is not `List<ContractStatusEnum>`
     */
    public List<ContractStatusEnum> getListContractStatusEnum() throws ClassCastException {
        return (List<ContractStatusEnum>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContractStatusEnum`. If the actual instance is not `ContractStatusEnum`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContractStatusEnum`
     * @throws ClassCastException if the instance is not `ContractStatusEnum`
     */
    public ContractStatusEnum getContractStatusEnum() throws ClassCastException {
        return (ContractStatusEnum)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ContractSearchFormWithoutCursorStatuses
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with List<ContractStatusEnum>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                ContractStatusEnum.validateJsonElement(element);
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<ContractStatusEnum> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ContractStatusEnum
        try {
            ContractStatusEnum.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContractStatusEnum failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ContractSearchFormWithoutCursorStatuses with oneOf schemas: ContractStatusEnum, List<ContractStatusEnum>. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ContractSearchFormWithoutCursorStatuses given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ContractSearchFormWithoutCursorStatuses
     * @throws IOException if the JSON string is invalid with respect to ContractSearchFormWithoutCursorStatuses
     */
    public static ContractSearchFormWithoutCursorStatuses fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ContractSearchFormWithoutCursorStatuses.class);
    }

    /**
     * Convert an instance of ContractSearchFormWithoutCursorStatuses to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

