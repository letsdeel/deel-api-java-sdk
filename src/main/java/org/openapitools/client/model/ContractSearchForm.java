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
import org.openapitools.client.model.ContractSearchFormWithCursor;
import org.openapitools.client.model.ContractSearchFormWithoutCursor;
import org.openapitools.client.model.ContractSearchFormWithoutCursorCountries;
import org.openapitools.client.model.ContractSearchFormWithoutCursorCurrencies;
import org.openapitools.client.model.ContractSearchFormWithoutCursorStatuses;
import org.openapitools.client.model.ContractSearchFormWithoutCursorTypes;
import org.openapitools.client.model.ContractsSortByEnum;
import org.openapitools.client.model.IdentifierValueForFilter;
import org.openapitools.client.model.SortDirEnum;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T14:23:41.573776663Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractSearchForm extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ContractSearchForm.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContractSearchForm.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ContractSearchForm' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ContractSearchFormWithCursor> adapterContractSearchFormWithCursor = gson.getDelegateAdapter(this, TypeToken.get(ContractSearchFormWithCursor.class));
            final TypeAdapter<ContractSearchFormWithoutCursor> adapterContractSearchFormWithoutCursor = gson.getDelegateAdapter(this, TypeToken.get(ContractSearchFormWithoutCursor.class));

            return (TypeAdapter<T>) new TypeAdapter<ContractSearchForm>() {
                @Override
                public void write(JsonWriter out, ContractSearchForm value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ContractSearchFormWithCursor`
                    if (value.getActualInstance() instanceof ContractSearchFormWithCursor) {
                        JsonElement element = adapterContractSearchFormWithCursor.toJsonTree((ContractSearchFormWithCursor)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ContractSearchFormWithoutCursor`
                    if (value.getActualInstance() instanceof ContractSearchFormWithoutCursor) {
                        JsonElement element = adapterContractSearchFormWithoutCursor.toJsonTree((ContractSearchFormWithoutCursor)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ContractSearchFormWithCursor, ContractSearchFormWithoutCursor");
                }

                @Override
                public ContractSearchForm read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ContractSearchFormWithCursor
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContractSearchFormWithCursor.validateJsonElement(jsonElement);
                        actualAdapter = adapterContractSearchFormWithCursor;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContractSearchFormWithCursor'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContractSearchFormWithCursor failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContractSearchFormWithCursor'", e);
                    }
                    // deserialize ContractSearchFormWithoutCursor
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContractSearchFormWithoutCursor.validateJsonElement(jsonElement);
                        actualAdapter = adapterContractSearchFormWithoutCursor;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContractSearchFormWithoutCursor'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContractSearchFormWithoutCursor failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContractSearchFormWithoutCursor'", e);
                    }

                    if (match == 1) {
                        ContractSearchForm ret = new ContractSearchForm();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ContractSearchForm: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ContractSearchForm() {
        super("oneOf", Boolean.FALSE);
    }

    public ContractSearchForm(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ContractSearchFormWithCursor", ContractSearchFormWithCursor.class);
        schemas.put("ContractSearchFormWithoutCursor", ContractSearchFormWithoutCursor.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ContractSearchForm.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ContractSearchFormWithCursor, ContractSearchFormWithoutCursor
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ContractSearchFormWithCursor) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContractSearchFormWithoutCursor) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ContractSearchFormWithCursor, ContractSearchFormWithoutCursor");
    }

    /**
     * Get the actual instance, which can be the following:
     * ContractSearchFormWithCursor, ContractSearchFormWithoutCursor
     *
     * @return The actual instance (ContractSearchFormWithCursor, ContractSearchFormWithoutCursor)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContractSearchFormWithCursor`. If the actual instance is not `ContractSearchFormWithCursor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContractSearchFormWithCursor`
     * @throws ClassCastException if the instance is not `ContractSearchFormWithCursor`
     */
    public ContractSearchFormWithCursor getContractSearchFormWithCursor() throws ClassCastException {
        return (ContractSearchFormWithCursor)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContractSearchFormWithoutCursor`. If the actual instance is not `ContractSearchFormWithoutCursor`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContractSearchFormWithoutCursor`
     * @throws ClassCastException if the instance is not `ContractSearchFormWithoutCursor`
     */
    public ContractSearchFormWithoutCursor getContractSearchFormWithoutCursor() throws ClassCastException {
        return (ContractSearchFormWithoutCursor)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ContractSearchForm
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ContractSearchFormWithCursor
        try {
            ContractSearchFormWithCursor.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContractSearchFormWithCursor failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ContractSearchFormWithoutCursor
        try {
            ContractSearchFormWithoutCursor.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContractSearchFormWithoutCursor failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ContractSearchForm with oneOf schemas: ContractSearchFormWithCursor, ContractSearchFormWithoutCursor. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ContractSearchForm given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ContractSearchForm
     * @throws IOException if the JSON string is invalid with respect to ContractSearchForm
     */
    public static ContractSearchForm fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ContractSearchForm.class);
    }

    /**
     * Convert an instance of ContractSearchForm to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

