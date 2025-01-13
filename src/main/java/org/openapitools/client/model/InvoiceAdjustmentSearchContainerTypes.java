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
import org.openapitools.client.model.InvoiceAdjustmentTypeEnum;



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
public class InvoiceAdjustmentSearchContainerTypes extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(InvoiceAdjustmentSearchContainerTypes.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!InvoiceAdjustmentSearchContainerTypes.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'InvoiceAdjustmentSearchContainerTypes' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            final Type typeInstanceListInvoiceAdjustmentTypeEnum = new TypeToken<List<InvoiceAdjustmentTypeEnum>>(){}.getType();
            final TypeAdapter<List<InvoiceAdjustmentTypeEnum>> adapterListInvoiceAdjustmentTypeEnum = (TypeAdapter<List<InvoiceAdjustmentTypeEnum>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListInvoiceAdjustmentTypeEnum));
            final TypeAdapter<InvoiceAdjustmentTypeEnum> adapterInvoiceAdjustmentTypeEnum = gson.getDelegateAdapter(this, TypeToken.get(InvoiceAdjustmentTypeEnum.class));

            return (TypeAdapter<T>) new TypeAdapter<InvoiceAdjustmentSearchContainerTypes>() {
                @Override
                public void write(JsonWriter out, InvoiceAdjustmentSearchContainerTypes value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `List<InvoiceAdjustmentTypeEnum>`
                    if (value.getActualInstance() instanceof List<?>) {
                        List<?> list = (List<?>) value.getActualInstance();
                        if (list.get(0) instanceof InvoiceAdjustmentTypeEnum) {
                            JsonArray array = adapterListInvoiceAdjustmentTypeEnum.toJsonTree((List<InvoiceAdjustmentTypeEnum>)value.getActualInstance()).getAsJsonArray();
                            elementAdapter.write(out, array);
                            return;
                        }
                    }
                    // check if the actual instance is of the type `InvoiceAdjustmentTypeEnum`
                    if (value.getActualInstance() instanceof InvoiceAdjustmentTypeEnum) {
                        JsonElement element = adapterInvoiceAdjustmentTypeEnum.toJsonTree((InvoiceAdjustmentTypeEnum)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: InvoiceAdjustmentTypeEnum, List<InvoiceAdjustmentTypeEnum>");
                }

                @Override
                public InvoiceAdjustmentSearchContainerTypes read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize List<InvoiceAdjustmentTypeEnum>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            InvoiceAdjustmentTypeEnum.validateJsonElement(element);
                        }
                        actualAdapter = adapterListInvoiceAdjustmentTypeEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<InvoiceAdjustmentTypeEnum>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<InvoiceAdjustmentTypeEnum> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<InvoiceAdjustmentTypeEnum>'", e);
                    }
                    // deserialize InvoiceAdjustmentTypeEnum
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvoiceAdjustmentTypeEnum.validateJsonElement(jsonElement);
                        actualAdapter = adapterInvoiceAdjustmentTypeEnum;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvoiceAdjustmentTypeEnum'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for InvoiceAdjustmentTypeEnum failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'InvoiceAdjustmentTypeEnum'", e);
                    }

                    if (match == 1) {
                        InvoiceAdjustmentSearchContainerTypes ret = new InvoiceAdjustmentSearchContainerTypes();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for InvoiceAdjustmentSearchContainerTypes: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public InvoiceAdjustmentSearchContainerTypes() {
        super("oneOf", Boolean.FALSE);
    }

    public InvoiceAdjustmentSearchContainerTypes(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<InvoiceAdjustmentTypeEnum>", List.class);
        schemas.put("InvoiceAdjustmentTypeEnum", InvoiceAdjustmentTypeEnum.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return InvoiceAdjustmentSearchContainerTypes.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * InvoiceAdjustmentTypeEnum, List<InvoiceAdjustmentTypeEnum>
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof InvoiceAdjustmentTypeEnum) {
                super.setActualInstance(instance);
                return;
            }
        }

        if (instance instanceof InvoiceAdjustmentTypeEnum) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be InvoiceAdjustmentTypeEnum, List<InvoiceAdjustmentTypeEnum>");
    }

    /**
     * Get the actual instance, which can be the following:
     * InvoiceAdjustmentTypeEnum, List<InvoiceAdjustmentTypeEnum>
     *
     * @return The actual instance (InvoiceAdjustmentTypeEnum, List<InvoiceAdjustmentTypeEnum>)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<InvoiceAdjustmentTypeEnum>`. If the actual instance is not `List<InvoiceAdjustmentTypeEnum>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<InvoiceAdjustmentTypeEnum>`
     * @throws ClassCastException if the instance is not `List<InvoiceAdjustmentTypeEnum>`
     */
    public List<InvoiceAdjustmentTypeEnum> getListInvoiceAdjustmentTypeEnum() throws ClassCastException {
        return (List<InvoiceAdjustmentTypeEnum>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvoiceAdjustmentTypeEnum`. If the actual instance is not `InvoiceAdjustmentTypeEnum`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvoiceAdjustmentTypeEnum`
     * @throws ClassCastException if the instance is not `InvoiceAdjustmentTypeEnum`
     */
    public InvoiceAdjustmentTypeEnum getInvoiceAdjustmentTypeEnum() throws ClassCastException {
        return (InvoiceAdjustmentTypeEnum)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to InvoiceAdjustmentSearchContainerTypes
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with List<InvoiceAdjustmentTypeEnum>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                InvoiceAdjustmentTypeEnum.validateJsonElement(element);
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<InvoiceAdjustmentTypeEnum> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with InvoiceAdjustmentTypeEnum
        try {
            InvoiceAdjustmentTypeEnum.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for InvoiceAdjustmentTypeEnum failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for InvoiceAdjustmentSearchContainerTypes with oneOf schemas: InvoiceAdjustmentTypeEnum, List<InvoiceAdjustmentTypeEnum>. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of InvoiceAdjustmentSearchContainerTypes given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of InvoiceAdjustmentSearchContainerTypes
     * @throws IOException if the JSON string is invalid with respect to InvoiceAdjustmentSearchContainerTypes
     */
    public static InvoiceAdjustmentSearchContainerTypes fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, InvoiceAdjustmentSearchContainerTypes.class);
    }

    /**
     * Convert an instance of InvoiceAdjustmentSearchContainerTypes to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

