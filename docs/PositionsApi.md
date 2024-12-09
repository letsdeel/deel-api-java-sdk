# PositionsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyChangesPositions**](PositionsApi.md#applyChangesPositions) | **POST** /hris/positions/apply_changes | Apply changes to positions. |
| [**getHrisPositions**](PositionsApi.md#getHrisPositions) | **GET** /hris/positions/profile/{hrisProfileId} | Fetch HrisPositions from a HrisProfile |


<a id="applyChangesPositions"></a>
# **applyChangesPositions**
> applyChangesPositions(applyChangesPositionsRequest).execute();

Apply changes to positions.

Apply add, edit, and delete operations to profiles.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PositionsApi;

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

    PositionsApi apiInstance = new PositionsApi(defaultClient);
    ApplyChangesPositionsRequest applyChangesPositionsRequest = new ApplyChangesPositionsRequest(); // ApplyChangesPositionsRequest | 
    try {
      apiInstance.applyChangesPositions(applyChangesPositionsRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#applyChangesPositions");
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
| **applyChangesPositionsRequest** | [**ApplyChangesPositionsRequest**](ApplyChangesPositionsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |
| **400** | Bad Request. Invalid input parameters. |  -  |
| **401** | Unauthorized. Invalid or expired token. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Internal Server Error. Could not process the request. |  -  |

<a id="getHrisPositions"></a>
# **getHrisPositions**
> GetHrisPositions200Response getHrisPositions(hrisProfileId).execute();

Fetch HrisPositions from a HrisProfile

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PositionsApi;

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

    PositionsApi apiInstance = new PositionsApi(defaultClient);
    String hrisProfileId = "d290f1ee-6c54-4b01-90e6-d701748f0851"; // String | HRIS Profile ID
    try {
      GetHrisPositions200Response result = apiInstance.getHrisPositions(hrisProfileId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#getHrisPositions");
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
| **hrisProfileId** | **String**| HRIS Profile ID | |

### Return type

[**GetHrisPositions200Response**](GetHrisPositions200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

