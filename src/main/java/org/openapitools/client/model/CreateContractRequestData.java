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
import org.openapitools.client.model.ONGOINGTIMEBASED;
import org.openapitools.client.model.PAYASYOUGOTIMEBASED;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfClient;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfCompensationDetails;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfJobTitle;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfMeta;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfSeniority;
import org.openapitools.client.model.PAYASYOUGOTIMEBASEDAllOfWorker;
import org.openapitools.client.model.PAYGMILESTONES;
import org.openapitools.client.model.PAYGTASKS;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T18:53:24.509445193Z[GMT]", comments = "Generator version: 7.10.0")
public class CreateContractRequestData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateContractRequestData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateContractRequestData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateContractRequestData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PAYASYOUGOTIMEBASED> adapterPAYASYOUGOTIMEBASED = gson.getDelegateAdapter(this, TypeToken.get(PAYASYOUGOTIMEBASED.class));
            final TypeAdapter<PAYGTASKS> adapterPAYGTASKS = gson.getDelegateAdapter(this, TypeToken.get(PAYGTASKS.class));
            final TypeAdapter<PAYGMILESTONES> adapterPAYGMILESTONES = gson.getDelegateAdapter(this, TypeToken.get(PAYGMILESTONES.class));
            final TypeAdapter<ONGOINGTIMEBASED> adapterONGOINGTIMEBASED = gson.getDelegateAdapter(this, TypeToken.get(ONGOINGTIMEBASED.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateContractRequestData>() {
                @Override
                public void write(JsonWriter out, CreateContractRequestData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PAYASYOUGOTIMEBASED`
                    if (value.getActualInstance() instanceof PAYASYOUGOTIMEBASED) {
                        JsonElement element = adapterPAYASYOUGOTIMEBASED.toJsonTree((PAYASYOUGOTIMEBASED)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `PAYGTASKS`
                    if (value.getActualInstance() instanceof PAYGTASKS) {
                        JsonElement element = adapterPAYGTASKS.toJsonTree((PAYGTASKS)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `PAYGMILESTONES`
                    if (value.getActualInstance() instanceof PAYGMILESTONES) {
                        JsonElement element = adapterPAYGMILESTONES.toJsonTree((PAYGMILESTONES)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ONGOINGTIMEBASED`
                    if (value.getActualInstance() instanceof ONGOINGTIMEBASED) {
                        JsonElement element = adapterONGOINGTIMEBASED.toJsonTree((ONGOINGTIMEBASED)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ONGOINGTIMEBASED, PAYASYOUGOTIMEBASED, PAYGMILESTONES, PAYGTASKS");
                }

                @Override
                public CreateContractRequestData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PAYASYOUGOTIMEBASED
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PAYASYOUGOTIMEBASED.validateJsonElement(jsonElement);
                        actualAdapter = adapterPAYASYOUGOTIMEBASED;
                        CreateContractRequestData ret = new CreateContractRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PAYASYOUGOTIMEBASED failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PAYASYOUGOTIMEBASED'", e);
                    }
                    // deserialize PAYGTASKS
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PAYGTASKS.validateJsonElement(jsonElement);
                        actualAdapter = adapterPAYGTASKS;
                        CreateContractRequestData ret = new CreateContractRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PAYGTASKS failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PAYGTASKS'", e);
                    }
                    // deserialize PAYGMILESTONES
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PAYGMILESTONES.validateJsonElement(jsonElement);
                        actualAdapter = adapterPAYGMILESTONES;
                        CreateContractRequestData ret = new CreateContractRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PAYGMILESTONES failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PAYGMILESTONES'", e);
                    }
                    // deserialize ONGOINGTIMEBASED
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ONGOINGTIMEBASED.validateJsonElement(jsonElement);
                        actualAdapter = adapterONGOINGTIMEBASED;
                        CreateContractRequestData ret = new CreateContractRequestData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ONGOINGTIMEBASED failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ONGOINGTIMEBASED'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for CreateContractRequestData: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateContractRequestData() {
        super("anyOf", Boolean.FALSE);
    }

    public CreateContractRequestData(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PAYASYOUGOTIMEBASED", PAYASYOUGOTIMEBASED.class);
        schemas.put("PAYGTASKS", PAYGTASKS.class);
        schemas.put("PAYGMILESTONES", PAYGMILESTONES.class);
        schemas.put("ONGOINGTIMEBASED", ONGOINGTIMEBASED.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateContractRequestData.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ONGOINGTIMEBASED, PAYASYOUGOTIMEBASED, PAYGMILESTONES, PAYGTASKS
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PAYASYOUGOTIMEBASED) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PAYGTASKS) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PAYGMILESTONES) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ONGOINGTIMEBASED) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ONGOINGTIMEBASED, PAYASYOUGOTIMEBASED, PAYGMILESTONES, PAYGTASKS");
    }

    /**
     * Get the actual instance, which can be the following:
     * ONGOINGTIMEBASED, PAYASYOUGOTIMEBASED, PAYGMILESTONES, PAYGTASKS
     *
     * @return The actual instance (ONGOINGTIMEBASED, PAYASYOUGOTIMEBASED, PAYGMILESTONES, PAYGTASKS)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PAYASYOUGOTIMEBASED`. If the actual instance is not `PAYASYOUGOTIMEBASED`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PAYASYOUGOTIMEBASED`
     * @throws ClassCastException if the instance is not `PAYASYOUGOTIMEBASED`
     */
    public PAYASYOUGOTIMEBASED getPAYASYOUGOTIMEBASED() throws ClassCastException {
        return (PAYASYOUGOTIMEBASED)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PAYGTASKS`. If the actual instance is not `PAYGTASKS`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PAYGTASKS`
     * @throws ClassCastException if the instance is not `PAYGTASKS`
     */
    public PAYGTASKS getPAYGTASKS() throws ClassCastException {
        return (PAYGTASKS)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PAYGMILESTONES`. If the actual instance is not `PAYGMILESTONES`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PAYGMILESTONES`
     * @throws ClassCastException if the instance is not `PAYGMILESTONES`
     */
    public PAYGMILESTONES getPAYGMILESTONES() throws ClassCastException {
        return (PAYGMILESTONES)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ONGOINGTIMEBASED`. If the actual instance is not `ONGOINGTIMEBASED`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ONGOINGTIMEBASED`
     * @throws ClassCastException if the instance is not `ONGOINGTIMEBASED`
     */
    public ONGOINGTIMEBASED getONGOINGTIMEBASED() throws ClassCastException {
        return (ONGOINGTIMEBASED)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateContractRequestData
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with PAYASYOUGOTIMEBASED
        try {
            PAYASYOUGOTIMEBASED.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PAYASYOUGOTIMEBASED failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with PAYGTASKS
        try {
            PAYGTASKS.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PAYGTASKS failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with PAYGMILESTONES
        try {
            PAYGMILESTONES.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PAYGMILESTONES failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ONGOINGTIMEBASED
        try {
            ONGOINGTIMEBASED.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ONGOINGTIMEBASED failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for CreateContractRequestData with anyOf schemas: ONGOINGTIMEBASED, PAYASYOUGOTIMEBASED, PAYGMILESTONES, PAYGTASKS. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of CreateContractRequestData given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateContractRequestData
     * @throws IOException if the JSON string is invalid with respect to CreateContractRequestData
     */
    public static CreateContractRequestData fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateContractRequestData.class);
    }

    /**
     * Convert an instance of CreateContractRequestData to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

