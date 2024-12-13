# AccountingApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBillingInvoiceDownloadLink**](AccountingApi.md#getBillingInvoiceDownloadLink) | **GET** /invoices/{id}/download | Download invoice PDF |
| [**getDeelInvoiceList**](AccountingApi.md#getDeelInvoiceList) | **GET** /invoices/deel | Retrieve Deel invoices |
| [**getInvoiceList**](AccountingApi.md#getInvoiceList) | **GET** /invoices | Retrieve invoices |
| [**getPaymentList**](AccountingApi.md#getPaymentList) | **GET** /payments | Retrieve payment receipts |
| [**getPaymentsBreakDownById**](AccountingApi.md#getPaymentsBreakDownById) | **GET** /payments/{payment_id}/breakdown | Retrieve a payment breakdown |


<a id="getBillingInvoiceDownloadLink"></a>
# **getBillingInvoiceDownloadLink**
> GetBillingInvoiceDownloadLink200Response getBillingInvoiceDownloadLink(id).execute();

Download invoice PDF

Get a link to download the invoice PDF.  **Token scopes**: &#x60;accounting:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingApi;

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

    AccountingApi apiInstance = new AccountingApi(defaultClient);
    String id = "abcd1234efgh5678"; // String | The invoice ID used to identify the invoice to be downloaded.
    try {
      GetBillingInvoiceDownloadLink200Response result = apiInstance.getBillingInvoiceDownloadLink(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getBillingInvoiceDownloadLink");
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
| **id** | **String**| The invoice ID used to identify the invoice to be downloaded. | |

### Return type

[**GetBillingInvoiceDownloadLink200Response**](GetBillingInvoiceDownloadLink200Response.md)

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
| **500** | Operation failed. |  -  |

<a id="getDeelInvoiceList"></a>
# **getDeelInvoiceList**
> DeelInvoiceListContainer getDeelInvoiceList(contractId).limit(limit).offset(offset).execute();

Retrieve Deel invoices

Retrieve a list of invoices related to Deel fees.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingApi;

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

    AccountingApi apiInstance = new AccountingApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    BigDecimal limit = new BigDecimal("10"); // BigDecimal | Return a page of results with given number of records; NOTE technically ALL query parameters are strings or array of strings
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | Return a page of results after given index of row; NOTE technically ALL query parameters are strings or array of strings'
    try {
      DeelInvoiceListContainer result = apiInstance.getDeelInvoiceList(contractId)
            .limit(limit)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getDeelInvoiceList");
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
| **limit** | **BigDecimal**| Return a page of results with given number of records; NOTE technically ALL query parameters are strings or array of strings | [optional] [default to 10] |
| **offset** | **BigDecimal**| Return a page of results after given index of row; NOTE technically ALL query parameters are strings or array of strings&#39; | [optional] [default to 0] |

### Return type

[**DeelInvoiceListContainer**](DeelInvoiceListContainer.md)

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
| **500** | Operation failed. |  -  |

<a id="getInvoiceList"></a>
# **getInvoiceList**
> GetInvoiceList200Response getInvoiceList().issuedFromDate(issuedFromDate).issuedToDate(issuedToDate).entities(entities).limit(limit).offset(offset).execute();

Retrieve invoices

Retrieve a list of paid invoices for your workforce.  **Token scopes**: &#x60;accounting:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingApi;

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

    AccountingApi apiInstance = new AccountingApi(defaultClient);
    String issuedFromDate = "2022-05-24"; // String | Filter invoices issued on or after the specified date.
    String issuedToDate = "2022-05-24"; // String | Filter invoices issued before the specified date.
    GetInvoiceListEntitiesParameter entities = new GetInvoiceListEntitiesParameter(); // GetInvoiceListEntitiesParameter | Filter by entity type (e.g., individual or company).
    BigDecimal limit = new BigDecimal("10"); // BigDecimal | Number of records to retrieve per page.
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | Index of the first record to return.
    try {
      GetInvoiceList200Response result = apiInstance.getInvoiceList()
            .issuedFromDate(issuedFromDate)
            .issuedToDate(issuedToDate)
            .entities(entities)
            .limit(limit)
            .offset(offset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getInvoiceList");
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
| **issuedFromDate** | **String**| Filter invoices issued on or after the specified date. | [optional] |
| **issuedToDate** | **String**| Filter invoices issued before the specified date. | [optional] |
| **entities** | [**GetInvoiceListEntitiesParameter**](.md)| Filter by entity type (e.g., individual or company). | [optional] |
| **limit** | **BigDecimal**| Number of records to retrieve per page. | [optional] [default to 10] |
| **offset** | **BigDecimal**| Index of the first record to return. | [optional] [default to 0] |

### Return type

[**GetInvoiceList200Response**](GetInvoiceList200Response.md)

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
| **500** | Operation failed. |  -  |

<a id="getPaymentList"></a>
# **getPaymentList**
> GetPaymentList200Response getPaymentList().dateFrom(dateFrom).dateTo(dateTo).currencies(currencies).entities(entities).execute();

Retrieve payment receipts

Retrieve a list of payments made to Deel, including worker details, payment status, and payment methods.  **Token scopes**: &#x60;accounting:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingApi;

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

    AccountingApi apiInstance = new AccountingApi(defaultClient);
    LocalDate dateFrom = LocalDate.parse("2022-01-01"); // LocalDate | Filters results to include payments created on or after this date (in ISO 8601 format).
    LocalDate dateTo = LocalDate.parse("2022-12-31"); // LocalDate | Filters results to include payments created before this date (in ISO 8601 format).
    GetContractListCurrenciesParameter currencies = new GetContractListCurrenciesParameter(); // GetContractListCurrenciesParameter | Filters payments by their currency codes. Can be a single currency code or an array of codes.
    GetInvoiceListEntitiesParameter entities = new GetInvoiceListEntitiesParameter(); // GetInvoiceListEntitiesParameter | Filters payments by legal entity type (e.g., 'individual' or 'company'). Can be a single entity type or an array.
    try {
      GetPaymentList200Response result = apiInstance.getPaymentList()
            .dateFrom(dateFrom)
            .dateTo(dateTo)
            .currencies(currencies)
            .entities(entities)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getPaymentList");
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
| **dateFrom** | **LocalDate**| Filters results to include payments created on or after this date (in ISO 8601 format). | [optional] |
| **dateTo** | **LocalDate**| Filters results to include payments created before this date (in ISO 8601 format). | [optional] |
| **currencies** | [**GetContractListCurrenciesParameter**](.md)| Filters payments by their currency codes. Can be a single currency code or an array of codes. | [optional] |
| **entities** | [**GetInvoiceListEntitiesParameter**](.md)| Filters payments by legal entity type (e.g., &#39;individual&#39; or &#39;company&#39;). Can be a single entity type or an array. | [optional] |

### Return type

[**GetPaymentList200Response**](GetPaymentList200Response.md)

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
| **500** | Operation failed. |  -  |

<a id="getPaymentsBreakDownById"></a>
# **getPaymentsBreakDownById**
> GetPaymentsBreakDownById200Response getPaymentsBreakDownById(paymentId).execute();

Retrieve a payment breakdown

Get a full breakdown of a payment made to Deel. Breakdown will include individual invoices and Deel fee as line items.  **Token scopes**: &#x60;accounting:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountingApi;

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

    AccountingApi apiInstance = new AccountingApi(defaultClient);
    String paymentId = "payment1234"; // String | Unique identifier for the payment to retrieve the breakdown.
    try {
      GetPaymentsBreakDownById200Response result = apiInstance.getPaymentsBreakDownById(paymentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountingApi#getPaymentsBreakDownById");
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
| **paymentId** | **String**| Unique identifier for the payment to retrieve the breakdown. | |

### Return type

[**GetPaymentsBreakDownById200Response**](GetPaymentsBreakDownById200Response.md)

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

