# PayrollApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPayStub**](PayrollApi.md#getPayStub) | **GET** /benefits/legal-entities/{id}/pay-stub | Get pay stub from employees from organization integrated with external benefits vendor |
| [**getYearToDatePay**](PayrollApi.md#getYearToDatePay) | **GET** /benefits/legal-entities/{id}/year-to-date-pay | Get year to date payment for benefits 401k. |


<a id="getPayStub"></a>
# **getPayStub**
> GetPayStub200Response getPayStub(id).payrollStartDate(payrollStartDate).payrollEndDate(payrollEndDate).status(status).itemsPerPage(itemsPerPage).offset(offset).execute();

Get pay stub from employees from organization integrated with external benefits vendor

Get pay stub from employees from organization integrated with external benefits vendor

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayrollApi;

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

    PayrollApi apiInstance = new PayrollApi(defaultClient);
    String id = "f47ac10b-58cc-4372-a567-0e02b2c3d479"; // String | Id from the legal entity to fetch data
    String payrollStartDate = "2021-01-01"; // String | Payroll start date
    String payrollEndDate = "2021-01-15"; // String | Payroll end date
    String status = "OPEN"; // String | Payroll status
    Integer itemsPerPage = 100; // Integer | Items per page
    Integer offset = 0; // Integer | Items to be skipped when searching
    try {
      GetPayStub200Response result = apiInstance.getPayStub(id)
            .payrollStartDate(payrollStartDate)
            .payrollEndDate(payrollEndDate)
            .status(status)
            .itemsPerPage(itemsPerPage)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getPayStub");
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
| **id** | **String**| Id from the legal entity to fetch data | |
| **payrollStartDate** | **String**| Payroll start date | [optional] |
| **payrollEndDate** | **String**| Payroll end date | [optional] |
| **status** | **String**| Payroll status | [optional] |
| **itemsPerPage** | **Integer**| Items per page | [optional] [default to 100] |
| **offset** | **Integer**| Items to be skipped when searching | [optional] [default to 0] |

### Return type

[**GetPayStub200Response**](GetPayStub200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="getYearToDatePay"></a>
# **getYearToDatePay**
> GetYearToDatePay200Response getYearToDatePay(id, dateStart, dateEnd).execute();

Get year to date payment for benefits 401k.

Get year to date from employees from organization integrated with external benefits vendor

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayrollApi;

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

    PayrollApi apiInstance = new PayrollApi(defaultClient);
    String id = "123"; // String | Id from the legal entity to fetch data
    String dateStart = "2021-01-01"; // String | Start date to fetch aggregated pay data
    String dateEnd = "2022-01-01"; // String | End date to fetch aggregated pay data
    try {
      GetYearToDatePay200Response result = apiInstance.getYearToDatePay(id, dateStart, dateEnd)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getYearToDatePay");
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
| **id** | **String**| Id from the legal entity to fetch data | |
| **dateStart** | **String**| Start date to fetch aggregated pay data | |
| **dateEnd** | **String**| End date to fetch aggregated pay data | |

### Return type

[**GetYearToDatePay200Response**](GetYearToDatePay200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

