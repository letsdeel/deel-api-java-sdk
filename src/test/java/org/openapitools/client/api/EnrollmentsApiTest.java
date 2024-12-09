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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Delete401kEnrollmentsDefinitionRequest;
import org.openapitools.client.model.Get401kEnrollmentsDefinition200ResponseInner;
import org.openapitools.client.model.Post401kEnrollmentsDefinition200Response;
import org.openapitools.client.model.Post401kEnrollmentsDefinitionRequest;
import org.openapitools.client.model.Put401kEnrollmentsDefinition200Response;
import org.openapitools.client.model.Put401kEnrollmentsDefinitionRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnrollmentsApi
 */
@Disabled
public class EnrollmentsApiTest {

    private final EnrollmentsApi api = new EnrollmentsApi();

    /**
     * Delete enrollment settings from an employee in a 401k plan
     *
     * Delete enrollment settings from an employee in a 401k plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void delete401kEnrollmentsDefinitionTest() throws ApiException {
        String id = null;
        String contractId = null;
        String planId = null;
        Delete401kEnrollmentsDefinitionRequest delete401kEnrollmentsDefinitionRequest = null;
        Object response = api.delete401kEnrollmentsDefinition(id, contractId, planId, delete401kEnrollmentsDefinitionRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Get enrollment settings from an employee in a 401k plan
     *
     * Get enrollment settings from an employee in a 401k plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get401kEnrollmentsDefinitionTest() throws ApiException {
        String id = null;
        String contractId = null;
        String planId = null;
        List<Get401kEnrollmentsDefinition200ResponseInner> response = api.get401kEnrollmentsDefinition(id, contractId, planId)
                .execute();
        // TODO: test validations
    }

    /**
     * Enroll an employee in a 401k plan
     *
     * Enroll an employee in a 401k plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void post401kEnrollmentsDefinitionTest() throws ApiException {
        String id = null;
        String contractId = null;
        String planId = null;
        Post401kEnrollmentsDefinitionRequest post401kEnrollmentsDefinitionRequest = null;
        Post401kEnrollmentsDefinition200Response response = api.post401kEnrollmentsDefinition(id, contractId, planId, post401kEnrollmentsDefinitionRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Change enrollment settings from an employee in a 401k plan
     *
     * Change enrollment settings from an employee in a 401k plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void put401kEnrollmentsDefinitionTest() throws ApiException {
        String id = null;
        String contractId = null;
        String planId = null;
        Put401kEnrollmentsDefinitionRequest put401kEnrollmentsDefinitionRequest = null;
        Put401kEnrollmentsDefinition200Response response = api.put401kEnrollmentsDefinition(id, contractId, planId, put401kEnrollmentsDefinitionRequest)
                .execute();
        // TODO: test validations
    }

}
