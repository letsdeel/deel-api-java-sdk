# LoansApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**post401kSingleDeductionDefinition**](LoansApi.md#post401kSingleDeductionDefinition) | **POST** /benefits/legal-entities/{id}/contracts/{contract_id}/plans/{plan_id}/deductions | Create a single deduction loan |


<a id="post401kSingleDeductionDefinition"></a>
# **post401kSingleDeductionDefinition**
> Post401kSingleDeductionDefinition200Response post401kSingleDeductionDefinition(id, contractId, planId, post401kSingleDeductionDefinitionRequest).execute();

Create a single deduction loan

Create a single deduction loan  **Token scopes**: &#x60;benefits:write&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoansApi;

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

    LoansApi apiInstance = new LoansApi(defaultClient);
    String id = "3f4b5f6e8"; // String | Legal entity id which employee/contract belongs
    String contractId = "3f4b5f6e8"; // String | Contract id from the employee
    String planId = "3f4b5f6e8"; // String | Plan id to enroll the employee into
    Post401kSingleDeductionDefinitionRequest post401kSingleDeductionDefinitionRequest = new Post401kSingleDeductionDefinitionRequest(); // Post401kSingleDeductionDefinitionRequest | 
    try {
      Post401kSingleDeductionDefinition200Response result = apiInstance.post401kSingleDeductionDefinition(id, contractId, planId, post401kSingleDeductionDefinitionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoansApi#post401kSingleDeductionDefinition");
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
| **id** | **String**| Legal entity id which employee/contract belongs | |
| **contractId** | **String**| Contract id from the employee | |
| **planId** | **String**| Plan id to enroll the employee into | |
| **post401kSingleDeductionDefinitionRequest** | [**Post401kSingleDeductionDefinitionRequest**](Post401kSingleDeductionDefinitionRequest.md)|  | |

### Return type

[**Post401kSingleDeductionDefinition200Response**](Post401kSingleDeductionDefinition200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |

