# TimeTrackingRatesApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShiftRate**](TimeTrackingRatesApi.md#createShiftRate) | **POST** /time_tracking/shift_rates | Create a New Shift Rate |
| [**deleteShiftRateExternalId**](TimeTrackingRatesApi.md#deleteShiftRateExternalId) | **DELETE** /time_tracking/shift_rates/{external_id} | Delete a ShiftRate by external ID |
| [**getShiftRate**](TimeTrackingRatesApi.md#getShiftRate) | **GET** /time_tracking/shift_rates/{external_id} | Retrieve a Shift Rate by External ID |
| [**getShiftRates**](TimeTrackingRatesApi.md#getShiftRates) | **GET** /time_tracking/shift_rates | Retrieve a Paginated List of Shift Rates |
| [**updateShiftRate**](TimeTrackingRatesApi.md#updateShiftRate) | **PATCH** /time_tracking/shift_rates/{external_id} | Update a shift rate |


<a id="createShiftRate"></a>
# **createShiftRate**
> CreateShiftRate201Response createShiftRate().createShiftRateRequest(createShiftRateRequest).execute();

Create a New Shift Rate

Create a new shift rate with the specified attributes such as name, type, value, and a unique external identifier.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeTrackingRatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TimeTrackingRatesApi apiInstance = new TimeTrackingRatesApi(defaultClient);
    CreateShiftRateRequest createShiftRateRequest = new CreateShiftRateRequest(); // CreateShiftRateRequest | Details of the shift rate to create.
    try {
      CreateShiftRate201Response result = apiInstance.createShiftRate()
            .createShiftRateRequest(createShiftRateRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingRatesApi#createShiftRate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createShiftRateRequest** | [**CreateShiftRateRequest**](CreateShiftRateRequest.md)| Details of the shift rate to create. | [optional] |

### Return type

[**CreateShiftRate201Response**](CreateShiftRate201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Shift rate created successfully. |  -  |
| **400** | Invalid input provided for the shift rate creation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **409** | Conflict occurred, likely due to a duplicate external ID. |  -  |
| **422** | Operation failed. |  -  |
| **500** | Internal server error encountered while creating the shift rate. |  -  |

<a id="deleteShiftRateExternalId"></a>
# **deleteShiftRateExternalId**
> deleteShiftRateExternalId(externalId).execute();

Delete a ShiftRate by external ID

Delete a ShiftRate by external ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeTrackingRatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TimeTrackingRatesApi apiInstance = new TimeTrackingRatesApi(defaultClient);
    String externalId = "externalId_example"; // String | external ID
    try {
      apiInstance.deleteShiftRateExternalId(externalId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingRatesApi#deleteShiftRateExternalId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **externalId** | **String**| external ID | |

### Return type

null (empty response body)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getShiftRate"></a>
# **getShiftRate**
> GetShiftRate200Response getShiftRate(externalId).execute();

Retrieve a Shift Rate by External ID

Retrieve details of a specific shift rate using its external ID. The response includes information such as the name, type, value, and unique identifier of the shift rate.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeTrackingRatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TimeTrackingRatesApi apiInstance = new TimeTrackingRatesApi(defaultClient);
    String externalId = "externalId_example"; // String | The unique external identifier of the shift rate to retrieve.
    try {
      GetShiftRate200Response result = apiInstance.getShiftRate(externalId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingRatesApi#getShiftRate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **externalId** | **String**| The unique external identifier of the shift rate to retrieve. | |

### Return type

[**GetShiftRate200Response**](GetShiftRate200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Shift rate retrieved successfully. |  -  |
| **400** | Invalid external ID provided or the request is malformed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Shift rate with the given external ID not found. |  -  |
| **500** | Internal server error occurred while retrieving the shift rate. |  -  |

<a id="getShiftRates"></a>
# **getShiftRates**
> GetShiftRates200Response getShiftRates().limit(limit).offset(offset).execute();

Retrieve a Paginated List of Shift Rates

Retrieve a paginated list of shift rates, including details such as rate name, type, value, and timestamps. Pagination parameters can be used to control the size and position of the result set.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeTrackingRatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TimeTrackingRatesApi apiInstance = new TimeTrackingRatesApi(defaultClient);
    String limit = "limit_example"; // String | The maximum number of records to return per page. For example, '10' to return up to 10 records.
    String offset = "offset_example"; // String | The starting index for the records to retrieve. For example, '0' for the first page or '10' for the second page when limit=10.
    try {
      GetShiftRates200Response result = apiInstance.getShiftRates()
            .limit(limit)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingRatesApi#getShiftRates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **String**| The maximum number of records to return per page. For example, &#39;10&#39; to return up to 10 records. | [optional] |
| **offset** | **String**| The starting index for the records to retrieve. For example, &#39;0&#39; for the first page or &#39;10&#39; for the second page when limit&#x3D;10. | [optional] |

### Return type

[**GetShiftRates200Response**](GetShiftRates200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of shift rates retrieved successfully. |  -  |
| **400** | Invalid query parameters provided (e.g., non-numeric limit or offset). |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **500** | Internal server error encountered while retrieving shift rates. |  -  |

<a id="updateShiftRate"></a>
# **updateShiftRate**
> UpdateShiftRate200Response updateShiftRate(externalId, updateShiftRateRequest).execute();

Update a shift rate

Update specific fields of an existing shift rate.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeTrackingRatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure HTTP bearer authorization: deelToken
    HttpBearerAuth deelToken = (HttpBearerAuth) defaultClient.getAuthentication("deelToken");
    deelToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TimeTrackingRatesApi apiInstance = new TimeTrackingRatesApi(defaultClient);
    String externalId = "12345678g"; // String | 
    UpdateShiftRateRequest updateShiftRateRequest = new UpdateShiftRateRequest(); // UpdateShiftRateRequest | 
    try {
      UpdateShiftRate200Response result = apiInstance.updateShiftRate(externalId, updateShiftRateRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingRatesApi#updateShiftRate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **externalId** | **String**|  | |
| **updateShiftRateRequest** | [**UpdateShiftRateRequest**](UpdateShiftRateRequest.md)|  | |

### Return type

[**UpdateShiftRate200Response**](UpdateShiftRate200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Shift rate updated successfully |  -  |
| **400** | Invalid request payload |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **422** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

