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


import org.openapitools.client.model.ApiErrorContainer;
import org.openapitools.client.model.ApplyChangesPositionsRequest;
import org.openapitools.client.model.GetHrisPositions200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PositionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PositionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PositionsApi(ApiClient apiClient) {
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

    private okhttp3.Call applyChangesPositionsCall(ApplyChangesPositionsRequest applyChangesPositionsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = applyChangesPositionsRequest;

        // create path and map variables
        String localVarPath = "/hris/positions/apply_changes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "deelToken", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call applyChangesPositionsValidateBeforeCall(ApplyChangesPositionsRequest applyChangesPositionsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applyChangesPositionsRequest' is set
        if (applyChangesPositionsRequest == null) {
            throw new ApiException("Missing the required parameter 'applyChangesPositionsRequest' when calling applyChangesPositions(Async)");
        }

        return applyChangesPositionsCall(applyChangesPositionsRequest, _callback);

    }


    private ApiResponse<Void> applyChangesPositionsWithHttpInfo(ApplyChangesPositionsRequest applyChangesPositionsRequest) throws ApiException {
        okhttp3.Call localVarCall = applyChangesPositionsValidateBeforeCall(applyChangesPositionsRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call applyChangesPositionsAsync(ApplyChangesPositionsRequest applyChangesPositionsRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = applyChangesPositionsValidateBeforeCall(applyChangesPositionsRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIapplyChangesPositionsRequest {
        private final ApplyChangesPositionsRequest applyChangesPositionsRequest;

        private APIapplyChangesPositionsRequest(ApplyChangesPositionsRequest applyChangesPositionsRequest) {
            this.applyChangesPositionsRequest = applyChangesPositionsRequest;
        }

        /**
         * Build call for applyChangesPositions
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request. Invalid input parameters. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized. Invalid or expired token. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. Could not process the request. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return applyChangesPositionsCall(applyChangesPositionsRequest, _callback);
        }

        /**
         * Execute applyChangesPositions request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request. Invalid input parameters. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized. Invalid or expired token. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. Could not process the request. </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            applyChangesPositionsWithHttpInfo(applyChangesPositionsRequest);
        }

        /**
         * Execute applyChangesPositions request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request. Invalid input parameters. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized. Invalid or expired token. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. Could not process the request. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return applyChangesPositionsWithHttpInfo(applyChangesPositionsRequest);
        }

        /**
         * Execute applyChangesPositions request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad Request. Invalid input parameters. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized. Invalid or expired token. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error. Could not process the request. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return applyChangesPositionsAsync(applyChangesPositionsRequest, _callback);
        }
    }

    /**
     * Apply changes to positions.
     * Apply add, edit, and delete operations to profiles.
     * @param applyChangesPositionsRequest  (required)
     * @return APIapplyChangesPositionsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Invalid input parameters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. Invalid or expired token. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation failed. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Operation failed. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error. Could not process the request. </td><td>  -  </td></tr>
     </table>
     */
    public APIapplyChangesPositionsRequest applyChangesPositions(ApplyChangesPositionsRequest applyChangesPositionsRequest) {
        return new APIapplyChangesPositionsRequest(applyChangesPositionsRequest);
    }
    private okhttp3.Call getHrisPositionsCall(String hrisProfileId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/hris/positions/profile/{hrisProfileId}"
            .replace("{" + "hrisProfileId" + "}", localVarApiClient.escapeString(hrisProfileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getHrisPositionsValidateBeforeCall(String hrisProfileId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'hrisProfileId' is set
        if (hrisProfileId == null) {
            throw new ApiException("Missing the required parameter 'hrisProfileId' when calling getHrisPositions(Async)");
        }

        return getHrisPositionsCall(hrisProfileId, _callback);

    }


    private ApiResponse<GetHrisPositions200Response> getHrisPositionsWithHttpInfo(String hrisProfileId) throws ApiException {
        okhttp3.Call localVarCall = getHrisPositionsValidateBeforeCall(hrisProfileId, null);
        Type localVarReturnType = new TypeToken<GetHrisPositions200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getHrisPositionsAsync(String hrisProfileId, final ApiCallback<GetHrisPositions200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHrisPositionsValidateBeforeCall(hrisProfileId, _callback);
        Type localVarReturnType = new TypeToken<GetHrisPositions200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetHrisPositionsRequest {
        private final String hrisProfileId;

        private APIgetHrisPositionsRequest(String hrisProfileId) {
            this.hrisProfileId = hrisProfileId;
        }

        /**
         * Build call for getHrisPositions
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Operation failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getHrisPositionsCall(hrisProfileId, _callback);
        }

        /**
         * Execute getHrisPositions request
         * @return GetHrisPositions200Response
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Operation failed. </td><td>  -  </td></tr>
         </table>
         */
        public GetHrisPositions200Response execute() throws ApiException {
            ApiResponse<GetHrisPositions200Response> localVarResp = getHrisPositionsWithHttpInfo(hrisProfileId);
            return localVarResp.getData();
        }

        /**
         * Execute getHrisPositions request with HTTP info returned
         * @return ApiResponse&lt;GetHrisPositions200Response&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Operation failed. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetHrisPositions200Response> executeWithHttpInfo() throws ApiException {
            return getHrisPositionsWithHttpInfo(hrisProfileId);
        }

        /**
         * Execute getHrisPositions request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Operation failed. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Operation failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetHrisPositions200Response> _callback) throws ApiException {
            return getHrisPositionsAsync(hrisProfileId, _callback);
        }
    }

    /**
     * Fetch HrisPositions from a HrisProfile
     * 
     * @param hrisProfileId HRIS Profile ID (required)
     * @return APIgetHrisPositionsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Operation failed. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Operation failed. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Operation failed. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Operation failed. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Operation failed. </td><td>  -  </td></tr>
     </table>
     */
    public APIgetHrisPositionsRequest getHrisPositions(String hrisProfileId) {
        return new APIgetHrisPositionsRequest(hrisProfileId);
    }
}
