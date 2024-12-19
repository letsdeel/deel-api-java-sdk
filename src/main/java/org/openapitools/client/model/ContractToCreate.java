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
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.ContractToCreateOngoingTimeBased;
import org.openapitools.client.model.ContractToCreateOngoingTimeBasedAllOfCompensationDetails;
import org.openapitools.client.model.ContractToCreatePayAsYouGoTimeBased;
import org.openapitools.client.model.ContractToCreatePaygMilestones;
import org.openapitools.client.model.ContractToCreatePaygTasks;
import org.openapitools.client.model.ContractToCreateSharedClient;
import org.openapitools.client.model.ContractToCreateSharedJobTitle;
import org.openapitools.client.model.ContractToCreateSharedSeniority;
import org.openapitools.client.model.ContractToCreateSharedWorker;
import org.openapitools.client.model.ContractWhoReportsEnum;
import org.openapitools.client.model.MetaDataOfContractToCreate;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T15:39:23.803918573Z[GMT]", comments = "Generator version: 7.10.0")
public class ContractToCreate extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ContractToCreate.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContractToCreate.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ContractToCreate' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ContractToCreatePayAsYouGoTimeBased> adapterContractToCreatePayAsYouGoTimeBased = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreatePayAsYouGoTimeBased.class));
            final TypeAdapter<ContractToCreatePaygTasks> adapterContractToCreatePaygTasks = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreatePaygTasks.class));
            final TypeAdapter<ContractToCreatePaygMilestones> adapterContractToCreatePaygMilestones = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreatePaygMilestones.class));
            final TypeAdapter<ContractToCreateOngoingTimeBased> adapterContractToCreateOngoingTimeBased = gson.getDelegateAdapter(this, TypeToken.get(ContractToCreateOngoingTimeBased.class));

            return (TypeAdapter<T>) new TypeAdapter<ContractToCreate>() {
                @Override
                public void write(JsonWriter out, ContractToCreate value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ContractToCreatePayAsYouGoTimeBased`
                    if (value.getActualInstance() instanceof ContractToCreatePayAsYouGoTimeBased) {
                        JsonElement element = adapterContractToCreatePayAsYouGoTimeBased.toJsonTree((ContractToCreatePayAsYouGoTimeBased)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ContractToCreatePaygTasks`
                    if (value.getActualInstance() instanceof ContractToCreatePaygTasks) {
                        JsonElement element = adapterContractToCreatePaygTasks.toJsonTree((ContractToCreatePaygTasks)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ContractToCreatePaygMilestones`
                    if (value.getActualInstance() instanceof ContractToCreatePaygMilestones) {
                        JsonElement element = adapterContractToCreatePaygMilestones.toJsonTree((ContractToCreatePaygMilestones)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ContractToCreateOngoingTimeBased`
                    if (value.getActualInstance() instanceof ContractToCreateOngoingTimeBased) {
                        JsonElement element = adapterContractToCreateOngoingTimeBased.toJsonTree((ContractToCreateOngoingTimeBased)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ContractToCreateOngoingTimeBased, ContractToCreatePayAsYouGoTimeBased, ContractToCreatePaygMilestones, ContractToCreatePaygTasks");
                }

                @Override
                public ContractToCreate read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ContractToCreatePayAsYouGoTimeBased
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContractToCreatePayAsYouGoTimeBased.validateJsonElement(jsonElement);
                        actualAdapter = adapterContractToCreatePayAsYouGoTimeBased;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContractToCreatePayAsYouGoTimeBased'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContractToCreatePayAsYouGoTimeBased failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContractToCreatePayAsYouGoTimeBased'", e);
                    }
                    // deserialize ContractToCreatePaygTasks
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContractToCreatePaygTasks.validateJsonElement(jsonElement);
                        actualAdapter = adapterContractToCreatePaygTasks;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContractToCreatePaygTasks'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContractToCreatePaygTasks failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContractToCreatePaygTasks'", e);
                    }
                    // deserialize ContractToCreatePaygMilestones
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContractToCreatePaygMilestones.validateJsonElement(jsonElement);
                        actualAdapter = adapterContractToCreatePaygMilestones;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContractToCreatePaygMilestones'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContractToCreatePaygMilestones failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContractToCreatePaygMilestones'", e);
                    }
                    // deserialize ContractToCreateOngoingTimeBased
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContractToCreateOngoingTimeBased.validateJsonElement(jsonElement);
                        actualAdapter = adapterContractToCreateOngoingTimeBased;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContractToCreateOngoingTimeBased'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContractToCreateOngoingTimeBased failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContractToCreateOngoingTimeBased'", e);
                    }

                    if (match == 1) {
                        ContractToCreate ret = new ContractToCreate();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ContractToCreate: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ContractToCreate() {
        super("oneOf", Boolean.FALSE);
    }

    public ContractToCreate(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ContractToCreatePayAsYouGoTimeBased", ContractToCreatePayAsYouGoTimeBased.class);
        schemas.put("ContractToCreatePaygTasks", ContractToCreatePaygTasks.class);
        schemas.put("ContractToCreatePaygMilestones", ContractToCreatePaygMilestones.class);
        schemas.put("ContractToCreateOngoingTimeBased", ContractToCreateOngoingTimeBased.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ContractToCreate.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ContractToCreateOngoingTimeBased, ContractToCreatePayAsYouGoTimeBased, ContractToCreatePaygMilestones, ContractToCreatePaygTasks
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ContractToCreatePayAsYouGoTimeBased) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContractToCreatePaygTasks) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContractToCreatePaygMilestones) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContractToCreateOngoingTimeBased) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ContractToCreateOngoingTimeBased, ContractToCreatePayAsYouGoTimeBased, ContractToCreatePaygMilestones, ContractToCreatePaygTasks");
    }

    /**
     * Get the actual instance, which can be the following:
     * ContractToCreateOngoingTimeBased, ContractToCreatePayAsYouGoTimeBased, ContractToCreatePaygMilestones, ContractToCreatePaygTasks
     *
     * @return The actual instance (ContractToCreateOngoingTimeBased, ContractToCreatePayAsYouGoTimeBased, ContractToCreatePaygMilestones, ContractToCreatePaygTasks)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContractToCreatePayAsYouGoTimeBased`. If the actual instance is not `ContractToCreatePayAsYouGoTimeBased`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContractToCreatePayAsYouGoTimeBased`
     * @throws ClassCastException if the instance is not `ContractToCreatePayAsYouGoTimeBased`
     */
    public ContractToCreatePayAsYouGoTimeBased getContractToCreatePayAsYouGoTimeBased() throws ClassCastException {
        return (ContractToCreatePayAsYouGoTimeBased)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContractToCreatePaygTasks`. If the actual instance is not `ContractToCreatePaygTasks`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContractToCreatePaygTasks`
     * @throws ClassCastException if the instance is not `ContractToCreatePaygTasks`
     */
    public ContractToCreatePaygTasks getContractToCreatePaygTasks() throws ClassCastException {
        return (ContractToCreatePaygTasks)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContractToCreatePaygMilestones`. If the actual instance is not `ContractToCreatePaygMilestones`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContractToCreatePaygMilestones`
     * @throws ClassCastException if the instance is not `ContractToCreatePaygMilestones`
     */
    public ContractToCreatePaygMilestones getContractToCreatePaygMilestones() throws ClassCastException {
        return (ContractToCreatePaygMilestones)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContractToCreateOngoingTimeBased`. If the actual instance is not `ContractToCreateOngoingTimeBased`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContractToCreateOngoingTimeBased`
     * @throws ClassCastException if the instance is not `ContractToCreateOngoingTimeBased`
     */
    public ContractToCreateOngoingTimeBased getContractToCreateOngoingTimeBased() throws ClassCastException {
        return (ContractToCreateOngoingTimeBased)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ContractToCreate
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ContractToCreatePayAsYouGoTimeBased
        try {
            ContractToCreatePayAsYouGoTimeBased.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContractToCreatePayAsYouGoTimeBased failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ContractToCreatePaygTasks
        try {
            ContractToCreatePaygTasks.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContractToCreatePaygTasks failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ContractToCreatePaygMilestones
        try {
            ContractToCreatePaygMilestones.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContractToCreatePaygMilestones failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ContractToCreateOngoingTimeBased
        try {
            ContractToCreateOngoingTimeBased.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ContractToCreateOngoingTimeBased failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ContractToCreate with oneOf schemas: ContractToCreateOngoingTimeBased, ContractToCreatePayAsYouGoTimeBased, ContractToCreatePaygMilestones, ContractToCreatePaygTasks. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ContractToCreate given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ContractToCreate
     * @throws IOException if the JSON string is invalid with respect to ContractToCreate
     */
    public static ContractToCreate fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ContractToCreate.class);
    }

    /**
     * Convert an instance of ContractToCreate to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

