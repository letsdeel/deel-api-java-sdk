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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.GetBenefitEmployee200Response;
import org.openapitools.client.model.GetBenefitEmployees200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmployeesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmployeesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getBenefitEmployeeCall(String id, String employeeId, Boolean activeContracts, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/benefits/legal-entities/{id}/employees/{employee_id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()))
            .replace("{" + "employee_id" + "}", localVarApiClient.escapeString(employeeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (activeContracts != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("active_contracts", activeContracts));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "deelToken", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBenefitEmployeeValidateBeforeCall(String id, String employeeId, Boolean activeContracts, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getBenefitEmployee(Async)");
        }

        // verify the required parameter 'employeeId' is set
        if (employeeId == null) {
            throw new ApiException("Missing the required parameter 'employeeId' when calling getBenefitEmployee(Async)");
        }

        return getBenefitEmployeeCall(id, employeeId, activeContracts, _callback);

    }


    private ApiResponse<GetBenefitEmployee200Response> getBenefitEmployeeWithHttpInfo(String id, String employeeId, Boolean activeContracts) throws ApiException {
        okhttp3.Call localVarCall = getBenefitEmployeeValidateBeforeCall(id, employeeId, activeContracts, null);
        Type localVarReturnType = new TypeToken<GetBenefitEmployee200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getBenefitEmployeeAsync(String id, String employeeId, Boolean activeContracts, final ApiCallback<GetBenefitEmployee200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBenefitEmployeeValidateBeforeCall(id, employeeId, activeContracts, _callback);
        Type localVarReturnType = new TypeToken<GetBenefitEmployee200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetBenefitEmployeeRequest {
        private final String id;
        private final String employeeId;
        private Boolean activeContracts;

        private APIgetBenefitEmployeeRequest(String id, String employeeId) {
            this.id = id;
            this.employeeId = employeeId;
        }

        /**
         * Set activeContracts
         * @param activeContracts Fetch only active contracts for employees (optional, default to true)
         * @return APIgetBenefitEmployeeRequest
         */
        public APIgetBenefitEmployeeRequest activeContracts(Boolean activeContracts) {
            this.activeContracts = activeContracts;
            return this;
        }

        /**
         * Build call for getBenefitEmployee
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getBenefitEmployeeCall(id, employeeId, activeContracts, _callback);
        }

        /**
         * Execute getBenefitEmployee request
         * @return GetBenefitEmployee200Response
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public GetBenefitEmployee200Response execute() throws ApiException {
            ApiResponse<GetBenefitEmployee200Response> localVarResp = getBenefitEmployeeWithHttpInfo(id, employeeId, activeContracts);
            return localVarResp.getData();
        }

        /**
         * Execute getBenefitEmployee request with HTTP info returned
         * @return ApiResponse&lt;GetBenefitEmployee200Response&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetBenefitEmployee200Response> executeWithHttpInfo() throws ApiException {
            return getBenefitEmployeeWithHttpInfo(id, employeeId, activeContracts);
        }

        /**
         * Execute getBenefitEmployee request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetBenefitEmployee200Response> _callback) throws ApiException {
            return getBenefitEmployeeAsync(id, employeeId, activeContracts, _callback);
        }
    }

    /**
     * Get employee from organization integrated with external benefits vendor
     * Get employee from organization integrated with external benefits vendor  **Token scopes**: &#x60;Users:read&#x60;
     * @param id Id from the legal entity to fetch data (required)
     * @param employeeId Employee id from the legal entity to fetch data (required)
     * @return APIgetBenefitEmployeeRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public APIgetBenefitEmployeeRequest getBenefitEmployee(String id, String employeeId) {
        return new APIgetBenefitEmployeeRequest(id, employeeId);
    }
    private okhttp3.Call getBenefitEmployeesCall(String id, Boolean activeContracts, Integer itemsPerPage, Integer offset, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/benefits/legal-entities/{id}/employees"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (activeContracts != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("active_contracts", activeContracts));
        }

        if (itemsPerPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("items_per_page", itemsPerPage));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "deelToken", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBenefitEmployeesValidateBeforeCall(String id, Boolean activeContracts, Integer itemsPerPage, Integer offset, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getBenefitEmployees(Async)");
        }

        return getBenefitEmployeesCall(id, activeContracts, itemsPerPage, offset, _callback);

    }


    private ApiResponse<GetBenefitEmployees200Response> getBenefitEmployeesWithHttpInfo(String id, Boolean activeContracts, Integer itemsPerPage, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = getBenefitEmployeesValidateBeforeCall(id, activeContracts, itemsPerPage, offset, null);
        Type localVarReturnType = new TypeToken<GetBenefitEmployees200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getBenefitEmployeesAsync(String id, Boolean activeContracts, Integer itemsPerPage, Integer offset, final ApiCallback<GetBenefitEmployees200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBenefitEmployeesValidateBeforeCall(id, activeContracts, itemsPerPage, offset, _callback);
        Type localVarReturnType = new TypeToken<GetBenefitEmployees200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetBenefitEmployeesRequest {
        private final String id;
        private Boolean activeContracts;
        private Integer itemsPerPage;
        private Integer offset;

        private APIgetBenefitEmployeesRequest(String id) {
            this.id = id;
        }

        /**
         * Set activeContracts
         * @param activeContracts Fetch only active contracts for employees (optional, default to true)
         * @return APIgetBenefitEmployeesRequest
         */
        public APIgetBenefitEmployeesRequest activeContracts(Boolean activeContracts) {
            this.activeContracts = activeContracts;
            return this;
        }

        /**
         * Set itemsPerPage
         * @param itemsPerPage Items per page (optional, default to 100)
         * @return APIgetBenefitEmployeesRequest
         */
        public APIgetBenefitEmployeesRequest itemsPerPage(Integer itemsPerPage) {
            this.itemsPerPage = itemsPerPage;
            return this;
        }

        /**
         * Set offset
         * @param offset Items to be skipped when searching (optional, default to 0)
         * @return APIgetBenefitEmployeesRequest
         */
        public APIgetBenefitEmployeesRequest offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Build call for getBenefitEmployees
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getBenefitEmployeesCall(id, activeContracts, itemsPerPage, offset, _callback);
        }

        /**
         * Execute getBenefitEmployees request
         * @return GetBenefitEmployees200Response
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public GetBenefitEmployees200Response execute() throws ApiException {
            ApiResponse<GetBenefitEmployees200Response> localVarResp = getBenefitEmployeesWithHttpInfo(id, activeContracts, itemsPerPage, offset);
            return localVarResp.getData();
        }

        /**
         * Execute getBenefitEmployees request with HTTP info returned
         * @return ApiResponse&lt;GetBenefitEmployees200Response&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetBenefitEmployees200Response> executeWithHttpInfo() throws ApiException {
            return getBenefitEmployeesWithHttpInfo(id, activeContracts, itemsPerPage, offset);
        }

        /**
         * Execute getBenefitEmployees request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetBenefitEmployees200Response> _callback) throws ApiException {
            return getBenefitEmployeesAsync(id, activeContracts, itemsPerPage, offset, _callback);
        }
    }

    /**
     * Get employees from organization integrated with external benefits vendor
     * Get employees from organization integrated with external benefits vendor  **Token scopes**: &#x60;Users:read&#x60;
     * @param id Id from the legal entity to fetch data (required)
     * @return APIgetBenefitEmployeesRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
     </table>
     */
    public APIgetBenefitEmployeesRequest getBenefitEmployees(String id) {
        return new APIgetBenefitEmployeesRequest(id);
    }
}
