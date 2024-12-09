# ReportsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetailedPaymentsReport**](ReportsApi.md#getDetailedPaymentsReport) | **GET** /reports/detailed-payments | Detailed payments report |


<a id="getDetailedPaymentsReport"></a>
# **getDetailedPaymentsReport**
> PaymentsDetailedReportContainer getDetailedPaymentsReport(fromDate, toDate).limit(limit).offset(offset).execute();

Detailed payments report

Retrieve the detailed payment report in JSON format.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReportsApi;

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

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String fromDate = "fromDate_example"; // String | Filtered results will include records created on or after the provided date.
    String toDate = "toDate_example"; // String | Filtered results will include records created before the provided date.
    BigDecimal limit = new BigDecimal("10"); // BigDecimal | Return a page of results with given number of records; NOTE technically ALL query parameters are strings or array of strings
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | Return a page of results after given index of row; NOTE technically ALL query parameters are strings or array of strings'
    try {
      PaymentsDetailedReportContainer result = apiInstance.getDetailedPaymentsReport(fromDate, toDate)
            .limit(limit)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getDetailedPaymentsReport");
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
| **fromDate** | **String**| Filtered results will include records created on or after the provided date. | |
| **toDate** | **String**| Filtered results will include records created before the provided date. | |
| **limit** | **BigDecimal**| Return a page of results with given number of records; NOTE technically ALL query parameters are strings or array of strings | [optional] [default to 10] |
| **offset** | **BigDecimal**| Return a page of results after given index of row; NOTE technically ALL query parameters are strings or array of strings&#39; | [optional] [default to 0] |

### Return type

[**PaymentsDetailedReportContainer**](PaymentsDetailedReportContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

