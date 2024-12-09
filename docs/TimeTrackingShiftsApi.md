# TimeTrackingShiftsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShifts**](TimeTrackingShiftsApi.md#createShifts) | **POST** /time_tracking/shifts | Create shifts |
| [**deleteShiftExternalId**](TimeTrackingShiftsApi.md#deleteShiftExternalId) | **DELETE** /time_tracking/shifts/{external_id} | Delete a Shift by External ID |
| [**getShiftDetails**](TimeTrackingShiftsApi.md#getShiftDetails) | **GET** /time_tracking/shifts/{external_id} | Get shift details |
| [**getShifts**](TimeTrackingShiftsApi.md#getShifts) | **GET** /time_tracking/shifts | List of shifts |
| [**updateShift**](TimeTrackingShiftsApi.md#updateShift) | **PATCH** /time_tracking/shifts/{external_id} | Update a shift |


<a id="createShifts"></a>
# **createShifts**
> CreateShifts201Response createShifts().createShiftsRequest(createShiftsRequest).execute();

Create shifts

Create shifts

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeTrackingShiftsApi;

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

    TimeTrackingShiftsApi apiInstance = new TimeTrackingShiftsApi(defaultClient);
    CreateShiftsRequest createShiftsRequest = new CreateShiftsRequest(); // CreateShiftsRequest | Request body to create time tracking shifts.
    try {
      CreateShifts201Response result = apiInstance.createShifts()
            .createShiftsRequest(createShiftsRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingShiftsApi#createShifts");
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
| **createShiftsRequest** | [**CreateShiftsRequest**](CreateShiftsRequest.md)| Request body to create time tracking shifts. | [optional] |

### Return type

[**CreateShifts201Response**](CreateShifts201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **422** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteShiftExternalId"></a>
# **deleteShiftExternalId**
> deleteShiftExternalId(externalId).execute();

Delete a Shift by External ID

This endpoint deletes a shift using its external ID. Once deleted, the shift will no longer be retrievable or editable.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeTrackingShiftsApi;

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

    TimeTrackingShiftsApi apiInstance = new TimeTrackingShiftsApi(defaultClient);
    String externalId = "shift123-external-id"; // String | The unique external identifier of the shift to be deleted.
    try {
      apiInstance.deleteShiftExternalId(externalId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingShiftsApi#deleteShiftExternalId");
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
| **externalId** | **String**| The unique external identifier of the shift to be deleted. | |

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
| **204** | Shift deleted successfully. No content is returned. |  -  |
| **400** | Invalid external ID provided or the request is malformed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Shift with the given external ID was not found. |  -  |
| **500** | Internal server error while attempting to delete the shift. |  -  |

<a id="getShiftDetails"></a>
# **getShiftDetails**
> GetShiftDetails200Response getShiftDetails(externalId).execute();

Get shift details

Retrieve details of a specific shift by external ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeTrackingShiftsApi;

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

    TimeTrackingShiftsApi apiInstance = new TimeTrackingShiftsApi(defaultClient);
    String externalId = "shift_1234567dewdwe"; // String | 
    try {
      GetShiftDetails200Response result = apiInstance.getShiftDetails(externalId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingShiftsApi#getShiftDetails");
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

### Return type

[**GetShiftDetails200Response**](GetShiftDetails200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Shift details retrieved successfully |  -  |
| **400** | Invalid request parameters |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getShifts"></a>
# **getShifts**
> GetShifts200Response getShifts().limit(limit).offset(offset).execute();

List of shifts

Retrieve a paginated list of shifts with details such as start and end times, breaks, metadata, and summary metrics. Supports pagination through &#x60;limit&#x60; and &#x60;offset&#x60; query parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeTrackingShiftsApi;

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

    TimeTrackingShiftsApi apiInstance = new TimeTrackingShiftsApi(defaultClient);
    String limit = "limit_example"; // String | Maximum number of records to return.
    String offset = "offset_example"; // String | Offset/index of record for the next page of records to return.
    try {
      GetShifts200Response result = apiInstance.getShifts()
            .limit(limit)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingShiftsApi#getShifts");
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
| **limit** | **String**| Maximum number of records to return. | [optional] |
| **offset** | **String**| Offset/index of record for the next page of records to return. | [optional] |

### Return type

[**GetShifts200Response**](GetShifts200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with paginated shifts. |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="updateShift"></a>
# **updateShift**
> UpdateShift200Response updateShift(externalId, updateShiftRequest).execute();

Update a shift

Update specific fields of an existing shift by its unique &#x60;external_id&#x60;. This includes shift metadata (start and end times, breaks, and approval dates) and associated summary details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TimeTrackingShiftsApi;

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

    TimeTrackingShiftsApi apiInstance = new TimeTrackingShiftsApi(defaultClient);
    String externalId = "12345678g"; // String | 
    UpdateShiftRequest updateShiftRequest = new UpdateShiftRequest(); // UpdateShiftRequest | 
    try {
      UpdateShift200Response result = apiInstance.updateShift(externalId, updateShiftRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingShiftsApi#updateShift");
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
| **updateShiftRequest** | [**UpdateShiftRequest**](UpdateShiftRequest.md)|  | |

### Return type

[**UpdateShift200Response**](UpdateShift200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Shift updated successfully. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **422** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

