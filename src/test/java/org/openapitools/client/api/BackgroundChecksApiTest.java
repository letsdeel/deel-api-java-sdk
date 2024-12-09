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
import org.openapitools.client.model.CreateBackgroundCheckForContracts201Response;
import org.openapitools.client.model.CreateBackgroundCheckForContractsRequest;
import org.openapitools.client.model.GetBackgroundChecksByContractId200Response;
import org.openapitools.client.model.GetBackgroundChecksOptions200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BackgroundChecksApi
 */
@Disabled
public class BackgroundChecksApiTest {

    private final BackgroundChecksApi api = new BackgroundChecksApi();

    /**
     * Create background check
     *
     * Create background check.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBackgroundCheckForContractsTest() throws ApiException {
        CreateBackgroundCheckForContractsRequest createBackgroundCheckForContractsRequest = null;
        CreateBackgroundCheckForContracts201Response response = api.createBackgroundCheckForContracts(createBackgroundCheckForContractsRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * List background checks by contract
     *
     * List background checks by contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBackgroundChecksByContractIdTest() throws ApiException {
        String contractId = null;
        GetBackgroundChecksByContractId200Response response = api.getBackgroundChecksByContractId(contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * List of background check options
     *
     * Retrieve the list of background check options.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBackgroundChecksOptionsTest() throws ApiException {
        String country = null;
        String prices = null;
        GetBackgroundChecksOptions200Response response = api.getBackgroundChecksOptions()
                .country(country)
                .prices(prices)
                .execute();
        // TODO: test validations
    }

}
