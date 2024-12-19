# ContractsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addContractDocument**](ContractsApi.md#addContractDocument) | **POST** /contracts/{contract_id}/documents | Attach a file to contract |
| [**approveExerciseEquity**](ContractsApi.md#approveExerciseEquity) | **PATCH** /equity/exercise/{public_id} | Approve an equity exercise |
| [**archiveContract**](ContractsApi.md#archiveContract) | **PATCH** /contracts/{contract_id}/archive | Archive a contract |
| [**attachExternalId**](ContractsApi.md#attachExternalId) | **PATCH** /contracts/{contract_id} | External Id |
| [**editContractDocument**](ContractsApi.md#editContractDocument) | **PUT** /contracts/{contract_id}/documents | Edit the file attached to contract document. |
| [**getAlternateEmailsByContractId**](ContractsApi.md#getAlternateEmailsByContractId) | **GET** /contracts/{contract_id}/alternate_emails | Find contract emails by ID |
| [**getContractById**](ContractsApi.md#getContractById) | **GET** /contracts/{contract_id} | Retrieve a single contract |
| [**getContractEquityWithholdingAmount**](ContractsApi.md#getContractEquityWithholdingAmount) | **GET** /contracts/{contract_id}/equity_withholding_estimate | Get an estimate of equity withholding amount. |
| [**getContractList**](ContractsApi.md#getContractList) | **GET** /contracts | List of contracts |
| [**getContractPaymentDates**](ContractsApi.md#getContractPaymentDates) | **GET** /contracts/{contract_id}/payment_cycles | Retrieve contractor payment dates |
| [**getContractTemplates**](ContractsApi.md#getContractTemplates) | **GET** /contract-templates | Retrieve contract templates |
| [**getDownloadWorkerDocumentsById**](ContractsApi.md#getDownloadWorkerDocumentsById) | **GET** /workers/{worker_id}/documents/{document_id}/download | Download worker document |
| [**getInviteLink**](ContractsApi.md#getInviteLink) | **GET** /contracts/{contract_id}/invite | Get worker invite link |
| [**getWorkerDocumentsById**](ContractsApi.md#getWorkerDocumentsById) | **GET** /workers/{worker_id}/documents | List of worker documents |
| [**inviteToSignContract**](ContractsApi.md#inviteToSignContract) | **POST** /contracts/{contract_id}/invitations | Send contract to worker |
| [**requestExerciseEquity**](ContractsApi.md#requestExerciseEquity) | **POST** /equity/exercise | Create a request to exercise equity. |
| [**signContract**](ContractsApi.md#signContract) | **POST** /contracts/{contract_id}/signatures | Sign a contract |
| [**uninviteToSignContract**](ContractsApi.md#uninviteToSignContract) | **DELETE** /contracts/{contract_id}/invitations | Remove invite |


<a id="addContractDocument"></a>
# **addContractDocument**
> AddContractDocument201Response addContractDocument(contractId)._file(_file).execute();

Attach a file to contract

Attach a file to contract document.  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    File _file = new File("/path/to/file"); // File | Upload the file you want to attach to this entry.
    try {
      AddContractDocument201Response result = apiInstance.addContractDocument(contractId)
            ._file(_file)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#addContractDocument");
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
| **_file** | **File**| Upload the file you want to attach to this entry. | [optional] |

### Return type

[**AddContractDocument201Response**](AddContractDocument201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

<a id="approveExerciseEquity"></a>
# **approveExerciseEquity**
> ApproveExerciseEquity200Response approveExerciseEquity(publicId, approveExerciseEquityRequest).execute();

Approve an equity exercise

Approve an equity exercise.  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    UUID publicId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | Equity exercise public ID.
    ApproveExerciseEquityRequest approveExerciseEquityRequest = new ApproveExerciseEquityRequest(); // ApproveExerciseEquityRequest | 
    try {
      ApproveExerciseEquity200Response result = apiInstance.approveExerciseEquity(publicId, approveExerciseEquityRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#approveExerciseEquity");
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
| **publicId** | **UUID**| Equity exercise public ID. | |
| **approveExerciseEquityRequest** | [**ApproveExerciseEquityRequest**](ApproveExerciseEquityRequest.md)|  | |

### Return type

[**ApproveExerciseEquity200Response**](ApproveExerciseEquity200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
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

<a id="archiveContract"></a>
# **archiveContract**
> GenericResultUpdated archiveContract(contractId).execute();

Archive a contract

Archive a terminated, cancelled or completed contract.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    try {
      GenericResultUpdated result = apiInstance.archiveContract(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#archiveContract");
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

[**GenericResultUpdated**](GenericResultUpdated.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="attachExternalId"></a>
# **attachExternalId**
> GenericResultCreated attachExternalId(contractId, inputToPatchContractExternalId).execute();

External Id

Add an external Id to a Deel contract. You can use this to add a Deel contract&#39;s refernece Id in your platform. External Id can be passed as a query parameter in List contract endpoint to find this conract later.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    InputToPatchContractExternalId inputToPatchContractExternalId = new InputToPatchContractExternalId(); // InputToPatchContractExternalId | Contract object that needs to be created
    try {
      GenericResultCreated result = apiInstance.attachExternalId(contractId, inputToPatchContractExternalId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#attachExternalId");
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
| **inputToPatchContractExternalId** | [**InputToPatchContractExternalId**](InputToPatchContractExternalId.md)| Contract object that needs to be created | |

### Return type

[**GenericResultCreated**](GenericResultCreated.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
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

<a id="editContractDocument"></a>
# **editContractDocument**
> ContractDocumentContainer editContractDocument(contractId)._file(_file).execute();

Edit the file attached to contract document.

Overwrite the file currently attached to contract document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    File _file = new File("/path/to/file"); // File | Upload the file you want to attach to this entry.
    try {
      ContractDocumentContainer result = apiInstance.editContractDocument(contractId)
            ._file(_file)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#editContractDocument");
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
| **_file** | **File**| Upload the file you want to attach to this entry. | [optional] |

### Return type

[**ContractDocumentContainer**](ContractDocumentContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

<a id="getAlternateEmailsByContractId"></a>
# **getAlternateEmailsByContractId**
> List&lt;AlternateEmailItem&gt; getAlternateEmailsByContractId(contractId).execute();

Find contract emails by ID

Returns an array of alternate email objects

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    try {
      List<AlternateEmailItem> result = apiInstance.getAlternateEmailsByContractId(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getAlternateEmailsByContractId");
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

[**List&lt;AlternateEmailItem&gt;**](AlternateEmailItem.md)

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

<a id="getContractById"></a>
# **getContractById**
> GetContractById200Response getContractById(contractId).execute();

Retrieve a single contract

Retrieve a single contract.  **Token scopes**: &#x60;contracts:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    try {
      GetContractById200Response result = apiInstance.getContractById(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getContractById");
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

[**GetContractById200Response**](GetContractById200Response.md)

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

<a id="getContractEquityWithholdingAmount"></a>
# **getContractEquityWithholdingAmount**
> GetContractEquityWithholdingAmount200Response getContractEquityWithholdingAmount(contractId, eventValue, eventCurrency).execute();

Get an estimate of equity withholding amount.

Get an estimate of the withholding amount required as well as the assumptions behind the estimate, given a contract id, event amount and currency code.  **Token scopes**: &#x60;contracts:read&#x60;, &#x60;global-payroll:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    String eventValue = "10000.00"; // String | The monetary value of the equity event.
    String eventCurrency = "USD"; // String | Three-letter currency code for the payment, following ISO 4217.
    try {
      GetContractEquityWithholdingAmount200Response result = apiInstance.getContractEquityWithholdingAmount(contractId, eventValue, eventCurrency)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getContractEquityWithholdingAmount");
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
| **eventValue** | **String**| The monetary value of the equity event. | |
| **eventCurrency** | **String**| Three-letter currency code for the payment, following ISO 4217. | |

### Return type

[**GetContractEquityWithholdingAmount200Response**](GetContractEquityWithholdingAmount200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

<a id="getContractList"></a>
# **getContractList**
> GetContractList200Response getContractList().afterCursor(afterCursor).limit(limit).orderDirection(orderDirection).types(types).statuses(statuses).teamId(teamId).externalId(externalId).countries(countries).currencies(currencies).search(search).sortBy(sortBy).execute();

List of contracts

Retrieve a list of contracts.  **Token scopes**: &#x60;contracts:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String afterCursor = "afterCursor_example"; // String | Return next page of results after the given cursor.
    String limit = "limit_example"; // String | Return a page of results with the given number of records.
    String orderDirection = "asc"; // String | Order direction of results; ascending or descending.
    List<String> types = Arrays.asList(); // List<String> | Filter contracts by type. A contract is included in the results if its type is in this list.
    List<String> statuses = Arrays.asList(); // List<String> | Filter contracts by current status. A contract is included in the results if its status is in this list.
    String teamId = "teamId_example"; // String | Filter contracts for the given team ID. NOTE: All query parameters are technically strings or arrays of strings.
    String externalId = "externalId_example"; // String | Filter contracts for the given external ID.
    List<String> countries = Arrays.asList(); // List<String> | Filter contracts by country codes.
    GetContractListCurrenciesParameter currencies = new GetContractListCurrenciesParameter(); // GetContractListCurrenciesParameter | Filter contracts by currency codes.
    String search = "search_example"; // String | Include a contract if its name or the contractor's name contains the given search term.
    String sortBy = "contract_title"; // String | Sort contracts by the given field name.
    try {
      GetContractList200Response result = apiInstance.getContractList()
            .afterCursor(afterCursor)
            .limit(limit)
            .orderDirection(orderDirection)
            .types(types)
            .statuses(statuses)
            .teamId(teamId)
            .externalId(externalId)
            .countries(countries)
            .currencies(currencies)
            .search(search)
            .sortBy(sortBy)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getContractList");
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
| **afterCursor** | **String**| Return next page of results after the given cursor. | [optional] |
| **limit** | **String**| Return a page of results with the given number of records. | [optional] |
| **orderDirection** | **String**| Order direction of results; ascending or descending. | [optional] [enum: asc, desc] |
| **types** | [**List&lt;String&gt;**](String.md)| Filter contracts by type. A contract is included in the results if its type is in this list. | [optional] [enum: ongoing_time_based, milestones, time_based, pay_as_you_go_time_based, commission, payg_milestones, payg_tasks, eor, unknown, employee, global_payroll, shield_msa, hris_direct_employee] |
| **statuses** | [**List&lt;String&gt;**](String.md)| Filter contracts by current status. A contract is included in the results if its status is in this list. | [optional] [enum: new, under_review, waiting_for_employee_contract, waiting_for_client_sign, processing_payment, waiting_for_contractor_sign, waiting_for_eor_sign, waiting_for_employee_sign, awaiting_deposit_payment, in_progress, completed, cancelled, user_cancelled, rejected, waiting_for_client_payment] |
| **teamId** | **String**| Filter contracts for the given team ID. NOTE: All query parameters are technically strings or arrays of strings. | [optional] |
| **externalId** | **String**| Filter contracts for the given external ID. | [optional] |
| **countries** | [**List&lt;String&gt;**](String.md)| Filter contracts by country codes. | [optional] |
| **currencies** | [**GetContractListCurrenciesParameter**](.md)| Filter contracts by currency codes. | [optional] |
| **search** | **String**| Include a contract if its name or the contractor&#39;s name contains the given search term. | [optional] |
| **sortBy** | **String**| Sort contracts by the given field name. | [optional] [enum: contract_title, worker_name] |

### Return type

[**GetContractList200Response**](GetContractList200Response.md)

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

<a id="getContractPaymentDates"></a>
# **getContractPaymentDates**
> GetContractPaymentDates200Response getContractPaymentDates(contractId).execute();

Retrieve contractor payment dates

Fetches a list of payment dates associated with a specific contract. This endpoint provides information on when contractors are scheduled to be paid, along with the current status of each payment cycle.  **Token scopes**: &#x60;contracts:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "contractId_example"; // String | The Deel contract ID for which payment dates are being retrieved.
    try {
      GetContractPaymentDates200Response result = apiInstance.getContractPaymentDates(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getContractPaymentDates");
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
| **contractId** | **String**| The Deel contract ID for which payment dates are being retrieved. | |

### Return type

[**GetContractPaymentDates200Response**](GetContractPaymentDates200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response containing contractor payment dates. |  -  |
| **400** | Invalid request parameters. |  -  |
| **404** | Contract not found. |  -  |
| **500** | Internal server error. |  -  |

<a id="getContractTemplates"></a>
# **getContractTemplates**
> GetContractTemplates200Response getContractTemplates().execute();

Retrieve contract templates

Fetches a collection of contract templates available within your organization. Use this endpoint to retrieve metadata about the templates.  **Token scopes**: &#x60;contracts:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    try {
      GetContractTemplates200Response result = apiInstance.getContractTemplates()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getContractTemplates");
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

[**GetContractTemplates200Response**](GetContractTemplates200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response containing contract templates. |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Internal server error. |  -  |

<a id="getDownloadWorkerDocumentsById"></a>
# **getDownloadWorkerDocumentsById**
> DownloadWorkerDocumentsByIdContainer getDownloadWorkerDocumentsById(workerId, documentId).execute();

Download worker document

Get the download link of worker document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for a worker.
    BigDecimal documentId = new BigDecimal("1234"); // BigDecimal | Unique identifier for a compliance document in Deel.
    try {
      DownloadWorkerDocumentsByIdContainer result = apiInstance.getDownloadWorkerDocumentsById(workerId, documentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getDownloadWorkerDocumentsById");
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
| **workerId** | **String**| Unique identifier for a worker. | |
| **documentId** | **BigDecimal**| Unique identifier for a compliance document in Deel. | |

### Return type

[**DownloadWorkerDocumentsByIdContainer**](DownloadWorkerDocumentsByIdContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getInviteLink"></a>
# **getInviteLink**
> GetInviteLink200Response getInviteLink(contractId).execute();

Get worker invite link

Get invite link generated for worker  **Token scopes**: &#x60;contracts:read&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    try {
      GetInviteLink200Response result = apiInstance.getInviteLink(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getInviteLink");
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

[**GetInviteLink200Response**](GetInviteLink200Response.md)

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

<a id="getWorkerDocumentsById"></a>
# **getWorkerDocumentsById**
> WorkerDocumentsByIdContainer getWorkerDocumentsById(workerId).execute();

List of worker documents

Retrieve a list of documents of a worker.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String workerId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for a worker.
    try {
      WorkerDocumentsByIdContainer result = apiInstance.getWorkerDocumentsById(workerId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#getWorkerDocumentsById");
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
| **workerId** | **String**| Unique identifier for a worker. | |

### Return type

[**WorkerDocumentsByIdContainer**](WorkerDocumentsByIdContainer.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="inviteToSignContract"></a>
# **inviteToSignContract**
> SignContract201Response inviteToSignContract(contractId, inviteToSignContractRequest).execute();

Send contract to worker

Invite a worker to sign the contract. Worker will be notified via email  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    InviteToSignContractRequest inviteToSignContractRequest = new InviteToSignContractRequest(); // InviteToSignContractRequest | 
    try {
      SignContract201Response result = apiInstance.inviteToSignContract(contractId, inviteToSignContractRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#inviteToSignContract");
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
| **inviteToSignContractRequest** | [**InviteToSignContractRequest**](InviteToSignContractRequest.md)|  | |

### Return type

[**SignContract201Response**](SignContract201Response.md)

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

<a id="requestExerciseEquity"></a>
# **requestExerciseEquity**
> RequestExerciseEquity201Response requestExerciseEquity(requestExerciseEquityRequest).execute();

Create a request to exercise equity.

Create a request to exercise equity.  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    RequestExerciseEquityRequest requestExerciseEquityRequest = new RequestExerciseEquityRequest(); // RequestExerciseEquityRequest | 
    try {
      RequestExerciseEquity201Response result = apiInstance.requestExerciseEquity(requestExerciseEquityRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#requestExerciseEquity");
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
| **requestExerciseEquityRequest** | [**RequestExerciseEquityRequest**](RequestExerciseEquityRequest.md)|  | |

### Return type

[**RequestExerciseEquity201Response**](RequestExerciseEquity201Response.md)

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
| **500** | Operation failed. |  -  |

<a id="signContract"></a>
# **signContract**
> SignContract201Response signContract(contractId, signContractRequest).execute();

Sign a contract

Sign a contract as a client.  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    SignContractRequest signContractRequest = new SignContractRequest(); // SignContractRequest | 
    try {
      SignContract201Response result = apiInstance.signContract(contractId, signContractRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#signContract");
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
| **signContractRequest** | [**SignContractRequest**](SignContractRequest.md)|  | |

### Return type

[**SignContract201Response**](SignContract201Response.md)

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

<a id="uninviteToSignContract"></a>
# **uninviteToSignContract**
> UninviteToSignContract200Response uninviteToSignContract(contractId).execute();

Remove invite

Remove invite in order to re-invite a worker to sign the contract  **Token scopes**: &#x60;contracts:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContractsApi;

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

    ContractsApi apiInstance = new ContractsApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    try {
      UninviteToSignContract200Response result = apiInstance.uninviteToSignContract(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractsApi#uninviteToSignContract");
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

[**UninviteToSignContract200Response**](UninviteToSignContract200Response.md)

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

