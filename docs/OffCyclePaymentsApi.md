# OffCyclePaymentsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOffCyclePayment**](OffCyclePaymentsApi.md#createOffCyclePayment) | **POST** /contracts/{contract_id}/off-cycle-payments | Add off-cycle payment |
| [**getOffCyclePaymentByContractAndId**](OffCyclePaymentsApi.md#getOffCyclePaymentByContractAndId) | **GET** /contracts/{contract_id}/off-cycle-payments/{id} | Retrieve a single off-cycle payment |
| [**getOffCyclePaymentsByContract**](OffCyclePaymentsApi.md#getOffCyclePaymentsByContract) | **GET** /contracts/{contract_id}/off-cycle-payments | List of off-cycle payments |


<a id="createOffCyclePayment"></a>
# **createOffCyclePayment**
> GenericResultCreatedWithId createOffCyclePayment(contractId, createOffCyclePaymentRequest).execute();

Add off-cycle payment

Add a new invoice line-item for the purpose of an off-cycle payment associated with a specific contract. This is typically used for exceptional payments outside the regular payment schedule.  **Token scopes**: &#x60;off-cycle-payments:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffCyclePaymentsApi;

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

    OffCyclePaymentsApi apiInstance = new OffCyclePaymentsApi(defaultClient);
    String contractId = "contractId_example"; // String | The unique identifier (ID) of the Deel contract for which the off-cycle payment is being created.
    CreateOffCyclePaymentRequest createOffCyclePaymentRequest = new CreateOffCyclePaymentRequest(); // CreateOffCyclePaymentRequest | Details of the off-cycle payment to be created.
    try {
      GenericResultCreatedWithId result = apiInstance.createOffCyclePayment(contractId, createOffCyclePaymentRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffCyclePaymentsApi#createOffCyclePayment");
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
| **contractId** | **String**| The unique identifier (ID) of the Deel contract for which the off-cycle payment is being created. | |
| **createOffCyclePaymentRequest** | [**CreateOffCyclePaymentRequest**](CreateOffCyclePaymentRequest.md)| Details of the off-cycle payment to be created. | |

### Return type

[**GenericResultCreatedWithId**](GenericResultCreatedWithId.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **201** | The off-cycle payment was successfully created. |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Contract not found. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Internal server error. |  -  |

<a id="getOffCyclePaymentByContractAndId"></a>
# **getOffCyclePaymentByContractAndId**
> GetOffCyclePaymentByContractAndId200Response getOffCyclePaymentByContractAndId(contractId, id).execute();

Retrieve a single off-cycle payment

Retrieve a single off-cycle payment.  **Token scopes**: &#x60;off-cycle-payments:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffCyclePaymentsApi;

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

    OffCyclePaymentsApi apiInstance = new OffCyclePaymentsApi(defaultClient);
    String contractId = "mqj9gkr"; // String | Deel contract id.
    UUID id = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"); // UUID | Deel off-cycle payment id.
    try {
      GetOffCyclePaymentByContractAndId200Response result = apiInstance.getOffCyclePaymentByContractAndId(contractId, id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffCyclePaymentsApi#getOffCyclePaymentByContractAndId");
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
| **id** | **UUID**| Deel off-cycle payment id. | |

### Return type

[**GetOffCyclePaymentByContractAndId200Response**](GetOffCyclePaymentByContractAndId200Response.md)

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

<a id="getOffCyclePaymentsByContract"></a>
# **getOffCyclePaymentsByContract**
> GetOffCyclePaymentsByContract200Response getOffCyclePaymentsByContract(contractId).execute();

List of off-cycle payments

Retrieve a list of off-cycle payments for the specified contract ID. Off-cycle payments are payments made outside the regular payment schedule, often for exceptional or one-time expenses.  **Token scopes**: &#x60;off-cycle-payments:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OffCyclePaymentsApi;

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

    OffCyclePaymentsApi apiInstance = new OffCyclePaymentsApi(defaultClient);
    String contractId = "contractId_example"; // String | The unique identifier (ID) of the Deel contract for which to retrieve off-cycle payments.
    try {
      GetOffCyclePaymentsByContract200Response result = apiInstance.getOffCyclePaymentsByContract(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffCyclePaymentsApi#getOffCyclePaymentsByContract");
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
| **contractId** | **String**| The unique identifier (ID) of the Deel contract for which to retrieve off-cycle payments. | |

### Return type

[**GetOffCyclePaymentsByContract200Response**](GetOffCyclePaymentsByContract200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of off-cycle payments. |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Contract not found. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Internal server error. |  -  |

