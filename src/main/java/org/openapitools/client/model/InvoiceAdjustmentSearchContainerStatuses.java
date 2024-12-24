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
import org.openapitools.client.model.InvoiceAdjustmentStatusEnum;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-24T15:41:11.686012113Z[GMT]", comments = "Generator version: 7.10.0")
public class InvoiceAdjustmentSearchContainerStatuses extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(InvoiceAdjustmentSearchContainerStatuses.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!InvoiceAdjustmentSearchContainerStatuses.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'InvoiceAdjustmentSearchContainerStatuses' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final Type typeInstanceListInvoiceAdjustmentStatusEnum = new TypeToken<List<InvoiceAdjustmentStatusEnum>>(){}.getType();
            final TypeAdapter<List<InvoiceAdjustmentStatusEnum>> adapterListInvoiceAdjustmentStatusEnum = (TypeAdapter<List<InvoiceAdjustmentStatusEnum>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListInvoiceAdjustmentStatusEnum));
            final TypeAdapter<InvoiceAdjustmentStatusEnum> adapterInvoiceAdjustmentStatusEnum = gson.getDelegateAdapter(this, TypeToken.get(InvoiceAdjustmentStatusEnum.class));

            return (TypeAdapter<T>) new TypeAdapter<InvoiceAdjustmentSearchContainerStatuses>() {
                @Override
                public void write(JsonWriter out, InvoiceAdjustmentSearchContainerStatuses value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List<InvoiceAdjustmentStatusEnum>`
                    if (value.getActualInstance() instanceof List<?>) {
                        List<?> list = (List<?>) value.getActualInstance();
                        if (list.get(0) instanceof InvoiceAdjustmentStatusEnum) {
                            JsonArray array = adapterListInvoiceAdjustmentStatusEnum.toJsonTree((List<InvoiceAdjustmentStatusEnum>)value.getActualInstance()).getAsJsonArray();
                            elementAdapter.write(out, array);
                            return;
                        }
                    }
                    // check if the actual instance is of the type `InvoiceAdjustmentStatusEnum`
                    if (value.getActualInstance() instanceof InvoiceAdjustmentStatusEnum) {
                        JsonElement element = adapterInvoiceAdjustmentStatusEnum.toJsonTree((InvoiceAdjustmentStatusEnum)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: InvoiceAdjustmentStatusEnum, List<InvoiceAdjustmentStatusEnum>");
                }

                @Override
                public InvoiceAdjustmentSearchContainerStatuses read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<InvoiceAdjustmentStatusEnum>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            InvoiceAdjustmentStatusEnum.validateJsonElement(element);
                        }
                        actualAdapter = adapterListInvoiceAdjustmentStatusEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<InvoiceAdjustmentStatusEnum>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<InvoiceAdjustmentStatusEnum> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<InvoiceAdjustmentStatusEnum>'", e);
                    }
                    // deserialize InvoiceAdjustmentStatusEnum
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvoiceAdjustmentStatusEnum.validateJsonElement(jsonElement);
                        actualAdapter = adapterInvoiceAdjustmentStatusEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvoiceAdjustmentStatusEnum'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for InvoiceAdjustmentStatusEnum failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'InvoiceAdjustmentStatusEnum'", e);
                    }

                    if (match == 1) {
                        InvoiceAdjustmentSearchContainerStatuses ret = new InvoiceAdjustmentSearchContainerStatuses();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for InvoiceAdjustmentSearchContainerStatuses: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public InvoiceAdjustmentSearchContainerStatuses() {
        super("oneOf", Boolean.FALSE);
    }

    public InvoiceAdjustmentSearchContainerStatuses(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<InvoiceAdjustmentStatusEnum>", List.class);
        schemas.put("InvoiceAdjustmentStatusEnum", InvoiceAdjustmentStatusEnum.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return InvoiceAdjustmentSearchContainerStatuses.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * InvoiceAdjustmentStatusEnum, List<InvoiceAdjustmentStatusEnum>
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof InvoiceAdjustmentStatusEnum) {
                super.setActualInstance(instance);
                return;
            }
        }

        if (instance instanceof InvoiceAdjustmentStatusEnum) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be InvoiceAdjustmentStatusEnum, List<InvoiceAdjustmentStatusEnum>");
    }

    /**
     * Get the actual instance, which can be the following:
     * InvoiceAdjustmentStatusEnum, List<InvoiceAdjustmentStatusEnum>
     *
     * @return The actual instance (InvoiceAdjustmentStatusEnum, List<InvoiceAdjustmentStatusEnum>)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<InvoiceAdjustmentStatusEnum>`. If the actual instance is not `List<InvoiceAdjustmentStatusEnum>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<InvoiceAdjustmentStatusEnum>`
     * @throws ClassCastException if the instance is not `List<InvoiceAdjustmentStatusEnum>`
     */
    public List<InvoiceAdjustmentStatusEnum> getListInvoiceAdjustmentStatusEnum() throws ClassCastException {
        return (List<InvoiceAdjustmentStatusEnum>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvoiceAdjustmentStatusEnum`. If the actual instance is not `InvoiceAdjustmentStatusEnum`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvoiceAdjustmentStatusEnum`
     * @throws ClassCastException if the instance is not `InvoiceAdjustmentStatusEnum`
     */
    public InvoiceAdjustmentStatusEnum getInvoiceAdjustmentStatusEnum() throws ClassCastException {
        return (InvoiceAdjustmentStatusEnum)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to InvoiceAdjustmentSearchContainerStatuses
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with List<InvoiceAdjustmentStatusEnum>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                InvoiceAdjustmentStatusEnum.validateJsonElement(element);
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<InvoiceAdjustmentStatusEnum> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with InvoiceAdjustmentStatusEnum
        try {
            InvoiceAdjustmentStatusEnum.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for InvoiceAdjustmentStatusEnum failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for InvoiceAdjustmentSearchContainerStatuses with oneOf schemas: InvoiceAdjustmentStatusEnum, List<InvoiceAdjustmentStatusEnum>. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of InvoiceAdjustmentSearchContainerStatuses given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of InvoiceAdjustmentSearchContainerStatuses
     * @throws IOException if the JSON string is invalid with respect to InvoiceAdjustmentSearchContainerStatuses
     */
    public static InvoiceAdjustmentSearchContainerStatuses fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, InvoiceAdjustmentSearchContainerStatuses.class);
    }

    /**
     * Convert an instance of InvoiceAdjustmentSearchContainerStatuses to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

