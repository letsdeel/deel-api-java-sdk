# MilestonesApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMilestone**](MilestonesApi.md#createMilestone) | **POST** /contracts/{contract_id}/milestones | Create a Milestone |
| [**createMilestoneReview**](MilestonesApi.md#createMilestoneReview) | **POST** /contracts/{contract_id}/milestones/{milestone_id}/reviews | Review a single milestone |
| [**createMilestoneReviews**](MilestonesApi.md#createMilestoneReviews) | **POST** /contracts/{contract_id}/milestones/many/reviews | Review multiple milestones |
| [**deleteMilestoneById**](MilestonesApi.md#deleteMilestoneById) | **DELETE** /contracts/{contract_id}/milestones/{milestone_id} | Delete a Milestone |
| [**getMilestonesByContract**](MilestonesApi.md#getMilestonesByContract) | **GET** /contracts/{contract_id}/milestones | Retrieve Milestones by Contract |
| [**getMilestonesByContractAndId**](MilestonesApi.md#getMilestonesByContractAndId) | **GET** /contracts/{contract_id}/milestones/{milestone_id} | Retrieve a single milestone |


<a id="createMilestone"></a>
# **createMilestone**
> CreateMilestone201Response createMilestone(contractId, createMilestoneRequest).execute();

Create a Milestone

Add a new milestone to a specific contract. Milestones represent distinct deliverables or phases in the contract and can include additional details such as attachments.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MilestonesApi;

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

    MilestonesApi apiInstance = new MilestonesApi(defaultClient);
    String contractId = "37nex2x"; // String | The unique identifier of the Deel contract where the milestone will be added.
    CreateMilestoneRequest createMilestoneRequest = new CreateMilestoneRequest(); // CreateMilestoneRequest | The milestone object containing the required details to be added to the contract.
    try {
      CreateMilestone201Response result = apiInstance.createMilestone(contractId, createMilestoneRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#createMilestone");
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
| **contractId** | **String**| The unique identifier of the Deel contract where the milestone will be added. | |
| **createMilestoneRequest** | [**CreateMilestoneRequest**](CreateMilestoneRequest.md)| The milestone object containing the required details to be added to the contract. | |

### Return type

[**CreateMilestone201Response**](CreateMilestone201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Milestone created successfully. |  -  |
| **400** | Invalid request. The input data did not meet the required validation rules. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | The specified contract ID does not exist. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="createMilestoneReview"></a>
# **createMilestoneReview**
> GenericResultCreated createMilestoneReview(contractId, milestoneId).milestoneReviewToCreateContainer(milestoneReviewToCreateContainer).execute();

Review a single milestone

Review a milestone to approve or decline submitted work.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MilestonesApi;

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

    MilestonesApi apiInstance = new MilestonesApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    String milestoneId = "milestoneId_example"; // String | ID of milestone to return
    MilestoneReviewToCreateContainer milestoneReviewToCreateContainer = new MilestoneReviewToCreateContainer(); // MilestoneReviewToCreateContainer | Milestone review object that need to be created
    try {
      GenericResultCreated result = apiInstance.createMilestoneReview(contractId, milestoneId)
            .milestoneReviewToCreateContainer(milestoneReviewToCreateContainer)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#createMilestoneReview");
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
| **milestoneId** | **String**| ID of milestone to return | |
| **milestoneReviewToCreateContainer** | [**MilestoneReviewToCreateContainer**](MilestoneReviewToCreateContainer.md)| Milestone review object that need to be created | [optional] |

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
| **201** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="createMilestoneReviews"></a>
# **createMilestoneReviews**
> GenericResultCreated createMilestoneReviews(contractId).milestoneReviewsToCreateContainer(milestoneReviewsToCreateContainer).execute();

Review multiple milestones

Review a batch of milestones to approve or reject submitted work.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MilestonesApi;

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

    MilestonesApi apiInstance = new MilestonesApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    MilestoneReviewsToCreateContainer milestoneReviewsToCreateContainer = new MilestoneReviewsToCreateContainer(); // MilestoneReviewsToCreateContainer | Milestone review objects that need to be created
    try {
      GenericResultCreated result = apiInstance.createMilestoneReviews(contractId)
            .milestoneReviewsToCreateContainer(milestoneReviewsToCreateContainer)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#createMilestoneReviews");
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
| **milestoneReviewsToCreateContainer** | [**MilestoneReviewsToCreateContainer**](MilestoneReviewsToCreateContainer.md)| Milestone review objects that need to be created | [optional] |

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
| **201** | Successful operation. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteMilestoneById"></a>
# **deleteMilestoneById**
> DeleteMilestoneById200Response deleteMilestoneById(contractId, milestoneId).execute();

Delete a Milestone

Delete a specific milestone associated with a contract. This operation removes the milestone and its data permanently from the system.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MilestonesApi;

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

    MilestonesApi apiInstance = new MilestonesApi(defaultClient);
    String contractId = "37nex2x"; // String | The unique identifier of the Deel contract from which the milestone will be deleted.
    String milestoneId = "milestoneId_example"; // String | The unique identifier of the milestone that is to be deleted.
    try {
      DeleteMilestoneById200Response result = apiInstance.deleteMilestoneById(contractId, milestoneId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#deleteMilestoneById");
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
| **contractId** | **String**| The unique identifier of the Deel contract from which the milestone will be deleted. | |
| **milestoneId** | **String**| The unique identifier of the milestone that is to be deleted. | |

### Return type

[**DeleteMilestoneById200Response**](DeleteMilestoneById200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Milestone successfully deleted. |  -  |
| **400** | Invalid request. The provided contract or milestone ID is invalid. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Contract or milestone not found. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Server error. Something went wrong while processing the request. |  -  |

<a id="getMilestonesByContract"></a>
# **getMilestonesByContract**
> GetMilestonesByContract200Response getMilestonesByContract(contractId).execute();

Retrieve Milestones by Contract

Retrieve a list of milestones associated with a specific contract. Each milestone includes details such as its title, amount, status, and relevant dates, along with information about the creator and reviewer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MilestonesApi;

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

    MilestonesApi apiInstance = new MilestonesApi(defaultClient);
    String contractId = "37nex2x"; // String | The unique identifier of the Deel contract for which milestones are being retrieved.
    try {
      GetMilestonesByContract200Response result = apiInstance.getMilestonesByContract(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#getMilestonesByContract");
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
| **contractId** | **String**| The unique identifier of the Deel contract for which milestones are being retrieved. | |

### Return type

[**GetMilestonesByContract200Response**](GetMilestonesByContract200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of milestones for the specified contract. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getMilestonesByContractAndId"></a>
# **getMilestonesByContractAndId**
> GetMilestonesByContractAndId200Response getMilestonesByContractAndId(contractId, milestoneId).execute();

Retrieve a single milestone

Retrieve a single milestone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MilestonesApi;

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

    MilestonesApi apiInstance = new MilestonesApi(defaultClient);
    String contractId = "37nex2x"; // String | Deel contract id.
    String milestoneId = "milestoneId_example"; // String | ID of milestone to return
    try {
      GetMilestonesByContractAndId200Response result = apiInstance.getMilestonesByContractAndId(contractId, milestoneId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MilestonesApi#getMilestonesByContractAndId");
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
| **milestoneId** | **String**| ID of milestone to return | |

### Return type

[**GetMilestonesByContractAndId200Response**](GetMilestonesByContractAndId200Response.md)

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

