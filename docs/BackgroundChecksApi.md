# BackgroundChecksApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBackgroundCheckForContracts**](BackgroundChecksApi.md#createBackgroundCheckForContracts) | **POST** /background-checks/regular | Create background check |
| [**getBackgroundChecksByContractId**](BackgroundChecksApi.md#getBackgroundChecksByContractId) | **GET** /background-checks/{contract_id} | List background checks by contract |
| [**getBackgroundChecksOptions**](BackgroundChecksApi.md#getBackgroundChecksOptions) | **GET** /background-checks/options | List of background check options |


<a id="createBackgroundCheckForContracts"></a>
# **createBackgroundCheckForContracts**
> CreateBackgroundCheckForContracts201Response createBackgroundCheckForContracts(createBackgroundCheckForContractsRequest).execute();

Create background check

Create background check.  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackgroundChecksApi;

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

    BackgroundChecksApi apiInstance = new BackgroundChecksApi(defaultClient);
    CreateBackgroundCheckForContractsRequest createBackgroundCheckForContractsRequest = new CreateBackgroundCheckForContractsRequest(); // CreateBackgroundCheckForContractsRequest | Request body to create a background check for one or more contracts.
    try {
      CreateBackgroundCheckForContracts201Response result = apiInstance.createBackgroundCheckForContracts(createBackgroundCheckForContractsRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundChecksApi#createBackgroundCheckForContracts");
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
| **createBackgroundCheckForContractsRequest** | [**CreateBackgroundCheckForContractsRequest**](CreateBackgroundCheckForContractsRequest.md)| Request body to create a background check for one or more contracts. | |

### Return type

[**CreateBackgroundCheckForContracts201Response**](CreateBackgroundCheckForContracts201Response.md)

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
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getBackgroundChecksByContractId"></a>
# **getBackgroundChecksByContractId**
> GetBackgroundChecksByContractId200Response getBackgroundChecksByContractId(contractId).execute();

List background checks by contract

List background checks by contract.  **Token scopes**: &#x60;contracts:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackgroundChecksApi;

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

    BackgroundChecksApi apiInstance = new BackgroundChecksApi(defaultClient);
    String contractId = "clm01a8"; // String | Deel contract id.
    try {
      GetBackgroundChecksByContractId200Response result = apiInstance.getBackgroundChecksByContractId(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundChecksApi#getBackgroundChecksByContractId");
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
| **contractId** | **String**| Deel contract id. | |

### Return type

[**GetBackgroundChecksByContractId200Response**](GetBackgroundChecksByContractId200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getBackgroundChecksOptions"></a>
# **getBackgroundChecksOptions**
> GetBackgroundChecksOptions200Response getBackgroundChecksOptions().country(country).prices(prices).execute();

List of background check options

Retrieve the list of background check options.  **Token scopes**: &#x60;contracts:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackgroundChecksApi;

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

    BackgroundChecksApi apiInstance = new BackgroundChecksApi(defaultClient);
    String country = "US"; // String | Country code.
    String prices = "true"; // String | Flag to include prices in the response.
    try {
      GetBackgroundChecksOptions200Response result = apiInstance.getBackgroundChecksOptions()
            .country(country)
            .prices(prices)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundChecksApi#getBackgroundChecksOptions");
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
| **country** | **String**| Country code. | [optional] |
| **prices** | **String**| Flag to include prices in the response. | [optional] [enum: true, false] |

### Return type

[**GetBackgroundChecksOptions200Response**](GetBackgroundChecksOptions200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

