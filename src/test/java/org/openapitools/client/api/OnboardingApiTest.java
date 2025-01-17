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
import org.openapitools.client.model.ListOnboardingTracker200Response;
import org.openapitools.client.model.ListOnboardingTrackerPaginationParameter;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OnboardingTrackerHrisProfileOidGet200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OnboardingApi
 */
@Disabled
public class OnboardingApiTest {

    private final OnboardingApi api = new OnboardingApi();

    /**
     * List onboarding employees
     *
     * List all onboarding  **Token scopes**: &#x60;contracts:read&#x60;, &#x60;people:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listOnboardingTrackerTest() throws ApiException {
        String search = null;
        List<String> contractOid = null;
        List<String> hiringTypes = null;
        List<String> progressStatuses = null;
        List<String> countries = null;
        List<String> teams = null;
        List<String> legalEntities = null;
        List<String> hrisDirectManagers = null;
        OffsetDateTime fromDate = null;
        OffsetDateTime toDate = null;
        List<String> actions = null;
        Integer limit = null;
        String sortBy = null;
        String sortOrder = null;
        ListOnboardingTrackerPaginationParameter pagination = null;
        Boolean includeOverview = null;
        ListOnboardingTracker200Response response = api.listOnboardingTracker()
                .search(search)
                .contractOid(contractOid)
                .hiringTypes(hiringTypes)
                .progressStatuses(progressStatuses)
                .countries(countries)
                .teams(teams)
                .legalEntities(legalEntities)
                .hrisDirectManagers(hrisDirectManagers)
                .fromDate(fromDate)
                .toDate(toDate)
                .actions(actions)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .pagination(pagination)
                .includeOverview(includeOverview)
                .execute();
        // TODO: test validations
    }

    /**
     * Get onboarding details by onboarding hris profile oid
     *
     * Get onboarding overview  **Token scopes**: &#x60;contracts:read&#x60;, &#x60;people:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void onboardingTrackerHrisProfileOidGetTest() throws ApiException {
        String oid = null;
        OnboardingTrackerHrisProfileOidGet200Response response = api.onboardingTrackerHrisProfileOidGet(oid)
                .execute();
        // TODO: test validations
    }

    /**
     * Get onboarding details by onboarding tracker ID
     *
     * Get onboarding overview  **Token scopes**: &#x60;contracts:read&#x60;, &#x60;people:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void onboardingTrackerIdGetTest() throws ApiException {
        String id = null;
        OnboardingTrackerHrisProfileOidGet200Response response = api.onboardingTrackerIdGet(id)
                .execute();
        // TODO: test validations
    }

}
