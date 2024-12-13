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
import org.openapitools.client.model.ApplyChangesPositionsRequest;
import org.openapitools.client.model.GetHrisPositions200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PositionsApi
 */
@Disabled
public class PositionsApiTest {

    private final PositionsApi api = new PositionsApi();

    /**
     * Apply changes to positions.
     *
     * Apply add, edit, and delete operations to profiles.  **Token scopes**: &#x60;profile:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void applyChangesPositionsTest() throws ApiException {
        ApplyChangesPositionsRequest applyChangesPositionsRequest = null;
        api.applyChangesPositions(applyChangesPositionsRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch HrisPositions from a HrisProfile
     *
     * undefined  **Token scopes**: &#x60;profile:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHrisPositionsTest() throws ApiException {
        String hrisProfileId = null;
        GetHrisPositions200Response response = api.getHrisPositions(hrisProfileId)
                .execute();
        // TODO: test validations
    }

}
