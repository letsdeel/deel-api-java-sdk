# PaystubsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBenefitPaystubs**](PaystubsApi.md#getBenefitPaystubs) | **GET** /benefits/legal-entities/{legalEntityId}/paystubs | Get paystubs from legal entity integrated with external benefits vendor |


<a id="getBenefitPaystubs"></a>
# **getBenefitPaystubs**
> GetBenefitPaystubs200Response getBenefitPaystubs(legalEntityId).states(states).dateStart(dateStart).dateEnd(dateEnd).itemsPerPage(itemsPerPage).cursor(cursor).execute();

Get paystubs from legal entity integrated with external benefits vendor

Get paystubs from legal entity integrated with external benefits vendor  **Token scopes**: &#x60;benefits:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaystubsApi;

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

    PaystubsApi apiInstance = new PaystubsApi(defaultClient);
    String legalEntityId = "40233e16-a043-4c68-85c1-6a369755b5a5"; // String | Id from the legal entity to fetch data
    String states = "OPEN"; // String | Payroll states: OPEN | LOCKED | CLOSED (OPEN doesn't have `employees` info)
    String dateStart = "2022-01-01"; // String | Start date to fectch the paystubs from
    String dateEnd = "2022-01-15"; // String | End date to fectch the paystubs
    Integer itemsPerPage = 10; // Integer | Items per page
    String cursor = "40233e16-a043-4c68-85c1-6a369755b5a5"; // String | The last fetched id to start querying from
    try {
      GetBenefitPaystubs200Response result = apiInstance.getBenefitPaystubs(legalEntityId)
            .states(states)
            .dateStart(dateStart)
            .dateEnd(dateEnd)
            .itemsPerPage(itemsPerPage)
            .cursor(cursor)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaystubsApi#getBenefitPaystubs");
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
| **legalEntityId** | **String**| Id from the legal entity to fetch data | |
| **states** | **String**| Payroll states: OPEN | LOCKED | CLOSED (OPEN doesn&#39;t have &#x60;employees&#x60; info) | [optional] [enum: OPEN, LOCKED, CLOSED] |
| **dateStart** | **String**| Start date to fectch the paystubs from | [optional] |
| **dateEnd** | **String**| End date to fectch the paystubs | [optional] |
| **itemsPerPage** | **Integer**| Items per page | [optional] [default to 10] |
| **cursor** | **String**| The last fetched id to start querying from | [optional] |

### Return type

[**GetBenefitPaystubs200Response**](GetBenefitPaystubs200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

