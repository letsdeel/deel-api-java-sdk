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
import org.openapitools.client.model.CreateBenefitProviderIntegrationClient200Response;
import org.openapitools.client.model.Get401kPlansDefinition200ResponseInner;
import org.openapitools.client.model.Post401kPlansDefinition200Response;
import org.openapitools.client.model.Post401kPlansDefinitionRequest;
import org.openapitools.client.model.Put401kPlansDefinition200Response;
import org.openapitools.client.model.Put401kPlansDefinitionRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Class401KPlansApi
 */
@Disabled
public class Class401KPlansApiTest {

    private final Class401KPlansApi api = new Class401KPlansApi();

    /**
     * Clean up plan for a given legal entity
     *
     * Clean up plan for a given legal entity  **Token scopes**: &#x60;benefits:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cleanUpPlanTest() throws ApiException {
        String id = null;
        api.cleanUpPlan(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Activate the 401k integration for the legal entity
     *
     * Activate the 401k integration for the legal entity  **Token scopes**: &#x60;benefits:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBenefitProviderIntegrationClientTest() throws ApiException {
        String id = null;
        CreateBenefitProviderIntegrationClient200Response response = api.createBenefitProviderIntegrationClient(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a 401k plan
     *
     * Delete a 401k plan  **Token scopes**: &#x60;benefits:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void delete401kPlanDefinitionTest() throws ApiException {
        String id = null;
        String planId = null;
        Object response = api.delete401kPlanDefinition(id, planId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get 401k plans for legal entity
     *
     * Get 401k plans legal entity  **Token scopes**: &#x60;benefits:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void get401kPlansDefinitionTest() throws ApiException {
        String id = null;
        List<Get401kPlansDefinition200ResponseInner> response = api.get401kPlansDefinition(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Create 401k plan for legal entity
     *
     * Create a new 401k plan for existing provider to legal entity  **Token scopes**: &#x60;benefits:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void post401kPlansDefinitionTest() throws ApiException {
        String id = null;
        Post401kPlansDefinitionRequest post401kPlansDefinitionRequest = null;
        Post401kPlansDefinition200Response response = api.post401kPlansDefinition(id, post401kPlansDefinitionRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Update 401k plan
     *
     * Update 401k plan  **Token scopes**: &#x60;benefits:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void put401kPlansDefinitionTest() throws ApiException {
        String id = null;
        String planId = null;
        Put401kPlansDefinitionRequest put401kPlansDefinitionRequest = null;
        Put401kPlansDefinition200Response response = api.put401kPlansDefinition(id, planId, put401kPlansDefinitionRequest)
                .execute();
        // TODO: test validations
    }

}
