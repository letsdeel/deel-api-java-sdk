# ContractorsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPremium**](ContractorsApi.md#addPremium) | **POST** /contracts/{contract_id}/premium | Upgrade to Premium |
| [**amendContractDetails**](ContractorsApi.md#amendContractDetails) | **POST** /contracts/{contract_id}/amendments | Amend contract |
| [**createContract**](ContractorsApi.md#createContract) | **POST** /contracts | Create a new contract |
| [**getContractPreview**](ContractorsApi.md#getContractPreview) | **GET** /contracts/{contract_id}/preview | Preview a contract agreement |
| [**removePremiumFromContract**](ContractorsApi.md#removePremiumFromContract) | **DELETE** /contracts/{contract_id}/premium | Downgrade from Premium |
| [**terminateContract**](ContractorsApi.md#terminateContract) | **POST** /contracts/{contractId}/terminations | Terminate contract |


<a id="addPremium"></a>
# **addPremium**
> PremiumResultAddedContainer addPremium(contractId).premiumToAddContainer(premiumToAddContainer).execute();

Upgrade to Premium

Add additional protection against misclassification by upgrading to Deel Premium.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractorsApi;

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

    ContractorsApi apiInstance = new ContractorsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    PremiumToAddContainer premiumToAddContainer = new PremiumToAddContainer(); // PremiumToAddContainer | Answers for assessment in order to find eligibility for Deel Premium.
    try {
      PremiumResultAddedContainer result = apiInstance.addPremium(contractId)
            .premiumToAddContainer(premiumToAddContainer)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#addPremium");
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
| **premiumToAddContainer** | [**PremiumToAddContainer**](PremiumToAddContainer.md)| Answers for assessment in order to find eligibility for Deel Premium. | [optional] |

### Return type

[**PremiumResultAddedContainer**](PremiumResultAddedContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="amendContractDetails"></a>
# **amendContractDetails**
> AmendContractDetails201Response amendContractDetails(contractId, amendContractDetailsRequest).execute();

Amend contract

Amend the details of a contract. Please note that if the contract is already signed or active, then the update will have to be approved and re-signed for to take effect.  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractorsApi;

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

    ContractorsApi apiInstance = new ContractorsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    AmendContractDetailsRequest amendContractDetailsRequest = new AmendContractDetailsRequest(); // AmendContractDetailsRequest | Contract object that needs to be amended
    try {
      AmendContractDetails201Response result = apiInstance.amendContractDetails(contractId, amendContractDetailsRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#amendContractDetails");
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
| **amendContractDetailsRequest** | [**AmendContractDetailsRequest**](AmendContractDetailsRequest.md)| Contract object that needs to be amended | |

### Return type

[**AmendContractDetails201Response**](AmendContractDetails201Response.md)

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

<a id="createContract"></a>
# **createContract**
> CreateContract201Response createContract(createContractRequest).execute();

Create a new contract

Create a new Deel contract.  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractorsApi;

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

    ContractorsApi apiInstance = new ContractorsApi(defaultClient);
    CreateContractRequest createContractRequest = new CreateContractRequest(); // CreateContractRequest | 
    try {
      CreateContract201Response result = apiInstance.createContract(createContractRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#createContract");
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
| **createContractRequest** | [**CreateContractRequest**](CreateContractRequest.md)|  | |

### Return type

[**CreateContract201Response**](CreateContract201Response.md)

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

<a id="getContractPreview"></a>
# **getContractPreview**
> String getContractPreview(contractId).templateId(templateId).execute();

Preview a contract agreement

Retrieve an IC and EOR contract agreement content in HTML. If no template is specified, the default or currently assigned template will be used. This endpoint does not support Global Payroll contract type.  **Token scopes**: &#x60;contracts:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractorsApi;

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

    ContractorsApi apiInstance = new ContractorsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    UUID templateId = UUID.fromString("9585241d-2387-4d80-abea-cea4dde4807d"); // UUID | ID of an existing contract template.
    try {
      String result = apiInstance.getContractPreview(contractId)
            .templateId(templateId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getContractPreview");
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
| **templateId** | **UUID**| ID of an existing contract template. | [optional] |

### Return type

**String**

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json

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

<a id="removePremiumFromContract"></a>
# **removePremiumFromContract**
> GenericResultDeleted removePremiumFromContract(contractId).reason(reason).execute();

Downgrade from Premium

Remove Deel Premium from an existing contract.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractorsApi;

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

    ContractorsApi apiInstance = new ContractorsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    String reason = "reason_example"; // String | Reason for deleting an existing Deel Premium from a contract.
    try {
      GenericResultDeleted result = apiInstance.removePremiumFromContract(contractId)
            .reason(reason)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#removePremiumFromContract");
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
| **reason** | **String**| Reason for deleting an existing Deel Premium from a contract. | [optional] |

### Return type

[**GenericResultDeleted**](GenericResultDeleted.md)

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

<a id="terminateContract"></a>
# **terminateContract**
> TerminateContract201Response terminateContract(contractId, terminateContractRequest).execute();

Terminate contract

Terminate contract.  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractorsApi;

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

    ContractorsApi apiInstance = new ContractorsApi(defaultClient);
    String contractId = "5f4e1e4e"; // String | Contract id
    TerminateContractRequest terminateContractRequest = new TerminateContractRequest(); // TerminateContractRequest | 
    try {
      TerminateContract201Response result = apiInstance.terminateContract(contractId, terminateContractRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#terminateContract");
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
| **contractId** | **String**| Contract id | |
| **terminateContractRequest** | [**TerminateContractRequest**](TerminateContractRequest.md)|  | |

### Return type

[**TerminateContract201Response**](TerminateContract201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

