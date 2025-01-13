# DeelAsAServiceApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEORBankAccount**](DeelAsAServiceApi.md#addEORBankAccount) | **POST** /daas/banks | Add bank account |
| [**getEORBankAccountGuide**](DeelAsAServiceApi.md#getEORBankAccountGuide) | **GET** /daas/banks/guide | Retrieve bank account guide |
| [**patchEORBankAccount**](DeelAsAServiceApi.md#patchEORBankAccount) | **PATCH** /daas/banks/{bank_id} | Modify bank account for an EOR employee |


<a id="addEORBankAccount"></a>
# **addEORBankAccount**
> AddEORBankAccount201Response addEORBankAccount().addEORBankAccountRequest(addEORBankAccountRequest).execute();

Add bank account

Add bank account for an EOR employee.  **Token scopes**: &#x60;worker:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeelAsAServiceApi;

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

    DeelAsAServiceApi apiInstance = new DeelAsAServiceApi(defaultClient);
    AddEORBankAccountRequest addEORBankAccountRequest = new AddEORBankAccountRequest(); // AddEORBankAccountRequest | 
    try {
      AddEORBankAccount201Response result = apiInstance.addEORBankAccount()
            .addEORBankAccountRequest(addEORBankAccountRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeelAsAServiceApi#addEORBankAccount");
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
| **addEORBankAccountRequest** | [**AddEORBankAccountRequest**](AddEORBankAccountRequest.md)|  | [optional] |

### Return type

[**AddEORBankAccount201Response**](AddEORBankAccount201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |

<a id="getEORBankAccountGuide"></a>
# **getEORBankAccountGuide**
> GetEORBankAccountGuide200Response getEORBankAccountGuide().execute();

Retrieve bank account guide

Retrieve bank account form guide for an EOR employee. This data can be used to add a new bank account for an employee.  **Token scopes**: &#x60;worker:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeelAsAServiceApi;

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

    DeelAsAServiceApi apiInstance = new DeelAsAServiceApi(defaultClient);
    try {
      GetEORBankAccountGuide200Response result = apiInstance.getEORBankAccountGuide()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeelAsAServiceApi#getEORBankAccountGuide");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetEORBankAccountGuide200Response**](GetEORBankAccountGuide200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="patchEORBankAccount"></a>
# **patchEORBankAccount**
> PatchEORBankAccount201Response patchEORBankAccount(bankId).addEORBankAccountRequest(addEORBankAccountRequest).execute();

Modify bank account for an EOR employee

Modify bank account for an EOR employee.  **Token scopes**: &#x60;worker:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeelAsAServiceApi;

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

    DeelAsAServiceApi apiInstance = new DeelAsAServiceApi(defaultClient);
    UUID bankId = UUID.fromString("dcc7b587-2246-4909-853e-12056e90c451"); // UUID | Unique identifier for a bank in UUID format.
    AddEORBankAccountRequest addEORBankAccountRequest = new AddEORBankAccountRequest(); // AddEORBankAccountRequest | Bank Account object that needs to be modified
    try {
      PatchEORBankAccount201Response result = apiInstance.patchEORBankAccount(bankId)
            .addEORBankAccountRequest(addEORBankAccountRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeelAsAServiceApi#patchEORBankAccount");
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
| **bankId** | **UUID**| Unique identifier for a bank in UUID format. | |
| **addEORBankAccountRequest** | [**AddEORBankAccountRequest**](AddEORBankAccountRequest.md)| Bank Account object that needs to be modified | [optional] |

### Return type

[**PatchEORBankAccount201Response**](PatchEORBankAccount201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |

