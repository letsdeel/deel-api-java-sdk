# CartaApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEquityStakeholders**](CartaApi.md#getEquityStakeholders) | **GET** /equity/stakeholders | Retrieve stakeholders |


<a id="getEquityStakeholders"></a>
# **getEquityStakeholders**
> EquityStakeholdersContainer getEquityStakeholders().limit(limit).afterCursor(afterCursor).execute();

Retrieve stakeholders

Retrieve all stakeholders for Carta.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartaApi;

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

    CartaApi apiInstance = new CartaApi(defaultClient);
    BigDecimal limit = new BigDecimal("10"); // BigDecimal | Return a page of results with given number of records; NOTE technically ALL query parameters are strings or array of strings
    String afterCursor = "afterCursor_example"; // String | Return next page of results after given cursor.
    try {
      EquityStakeholdersContainer result = apiInstance.getEquityStakeholders()
            .limit(limit)
            .afterCursor(afterCursor)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CartaApi#getEquityStakeholders");
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
| **limit** | **BigDecimal**| Return a page of results with given number of records; NOTE technically ALL query parameters are strings or array of strings | [optional] [default to 10] |
| **afterCursor** | **String**| Return next page of results after given cursor. | [optional] |

### Return type

[**EquityStakeholdersContainer**](EquityStakeholdersContainer.md)

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

