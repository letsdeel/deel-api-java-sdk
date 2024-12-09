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
import org.openapitools.client.model.GetCountries200Response;
import org.openapitools.client.model.GetCurrencies200Response;
import org.openapitools.client.model.GetJobTitleList200Response;
import org.openapitools.client.model.GetSeniorityList200Response;
import org.openapitools.client.model.GetTimeoffTypeList200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LookupsApi
 */
@Disabled
public class LookupsApiTest {

    private final LookupsApi api = new LookupsApi();

    /**
     * Retrieve Country List
     *
     * Retrieve a list of countries supported by Deel, along with details about visa and EoR support, sub-territories, and their classifications.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCountriesTest() throws ApiException {
        GetCountries200Response response = api.getCountries()
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve Supported Currency List
     *
     * Retrieve the list of currencies supported by Deel, including their ISO codes and names.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrenciesTest() throws ApiException {
        GetCurrencies200Response response = api.getCurrencies()
                .execute();
        // TODO: test validations
    }

    /**
     * Job titles list
     *
     * Retrieve a list of pre-defined job titles in Deel platform.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getJobTitleListTest() throws ApiException {
        GetJobTitleList200Response response = api.getJobTitleList()
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve Seniority Levels
     *
     * Retrieve a list of predefined seniority levels for roles in the Deel platform, including their names, hierarchical levels, and unique identifiers.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSeniorityListTest() throws ApiException {
        GetSeniorityList200Response response = api.getSeniorityList()
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve Time-Off Types
     *
     * Retrieve a list of predefined time-off types that can be registered in the Deel platform.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimeoffTypeListTest() throws ApiException {
        GetTimeoffTypeList200Response response = api.getTimeoffTypeList()
                .execute();
        // TODO: test validations
    }

}