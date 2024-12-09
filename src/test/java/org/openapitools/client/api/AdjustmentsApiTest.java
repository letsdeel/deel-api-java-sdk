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
import org.openapitools.client.model.ApiErrorContainer;
import org.openapitools.client.model.CreateAdjustment201Response;
import org.openapitools.client.model.CreateAdjustmentRequestData;
import org.openapitools.client.model.DeleteAdjustment200Response;
import org.openapitools.client.model.GetAdjustments200Response;
import org.openapitools.client.model.GetCategories200Response;
import org.openapitools.client.model.InputToCreateFileRef;
import java.time.LocalDate;
import org.openapitools.client.model.OutputToCreateFileRefContainer;
import org.openapitools.client.model.UpdateAdjustment200Response;
import org.openapitools.client.model.UpdateAdjustmentRequestData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdjustmentsApi
 */
@Disabled
public class AdjustmentsApiTest {

    private final AdjustmentsApi api = new AdjustmentsApi();

    /**
     * Create a new adjustment
     *
     * Create a new adjustment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAdjustmentTest() throws ApiException {
        CreateAdjustmentRequestData data = null;
        CreateAdjustment201Response response = api.createAdjustment(data)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload file to Deel
     *
     * Upload file to Deel storage to use the file attachment feature for other endpoints.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFileRefTest() throws ApiException {
        InputToCreateFileRef inputToCreateFileRef = null;
        OutputToCreateFileRefContainer response = api.createFileRef(inputToCreateFileRef)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an adjustment
     *
     * Delete an adjustment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAdjustmentTest() throws ApiException {
        String id = null;
        DeleteAdjustment200Response response = api.deleteAdjustment(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve adjustments
     *
     * Get all adjustments for the specific contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdjustmentsTest() throws ApiException {
        String contractId = null;
        LocalDate from = null;
        LocalDate to = null;
        GetAdjustments200Response response = api.getAdjustments(contractId)
                .from(from)
                .to(to)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve an adjustment
     *
     * Retrieve an adjustment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAdjustmentsByIdTest() throws ApiException {
        String id = null;
        CreateAdjustment201Response response = api.getAdjustmentsById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve categories
     *
     * Get all categories for your organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCategoriesTest() throws ApiException {
        GetCategories200Response response = api.getCategories()
                .execute();
        // TODO: test validations
    }

    /**
     * Update an adjustment
     *
     * Update an adjustment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAdjustmentTest() throws ApiException {
        String id = null;
        UpdateAdjustmentRequestData data = null;
        UpdateAdjustment200Response response = api.updateAdjustment(id, data)
                .execute();
        // TODO: test validations
    }

}