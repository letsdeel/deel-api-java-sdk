# TasksApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createContractPgoTak**](TasksApi.md#createContractPgoTak) | **POST** /contracts/{contract_id}/tasks | Create a new task |
| [**createTaskManyReview**](TasksApi.md#createTaskManyReview) | **POST** /contracts/{contract_id}/tasks/many/reviews | Review multiple tasks |
| [**createTaskReviewById**](TasksApi.md#createTaskReviewById) | **POST** /contracts/{contract_id}/tasks/{task_id}/reviews | Review a single task |
| [**deleteContractTaskById**](TasksApi.md#deleteContractTaskById) | **DELETE** /contracts/{contract_id}/tasks/{task_id} | Delete task |
| [**getTasksByContract**](TasksApi.md#getTasksByContract) | **GET** /contracts/{contract_id}/tasks | List of tasks |


<a id="createContractPgoTak"></a>
# **createContractPgoTak**
> CreateContractPgoTak201Response createContractPgoTak(contractId, createContractPgoTakRequest).execute();

Create a new task

Create a new task for a contractor associated with a specific Deel contract. A task can include details like amount, description, submission date, and optional attachments.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TasksApi;

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

    TasksApi apiInstance = new TasksApi(defaultClient);
    String contractId = "37nex2x"; // String | The unique Deel contract ID associated with the task.
    CreateContractPgoTakRequest createContractPgoTakRequest = new CreateContractPgoTakRequest(); // CreateContractPgoTakRequest | 
    try {
      CreateContractPgoTak201Response result = apiInstance.createContractPgoTak(contractId, createContractPgoTakRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#createContractPgoTak");
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
| **contractId** | **String**| The unique Deel contract ID associated with the task. | |
| **createContractPgoTakRequest** | [**CreateContractPgoTakRequest**](CreateContractPgoTakRequest.md)|  | |

### Return type

[**CreateContractPgoTak201Response**](CreateContractPgoTak201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The task was successfully created. |  -  |
| **400** | Bad request. Missing required fields or invalid data format. |  -  |
| **401** | Unauthorized. Authentication credentials are missing or invalid. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Internal server error. An unexpected error occurred while processing the request. |  -  |

<a id="createTaskManyReview"></a>
# **createTaskManyReview**
> CreateTaskManyReview201Response createTaskManyReview(contractId, createTaskManyReviewRequest).execute();

Review multiple tasks

Review multiple tasks associated with a Deel contract to approve or decline the submitted work. The review includes a status (approved or declined) for each task and an optional reason for declined tasks.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TasksApi;

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

    TasksApi apiInstance = new TasksApi(defaultClient);
    String contractId = "37nex2x"; // String | The unique Deel contract ID associated with the tasks.
    CreateTaskManyReviewRequest createTaskManyReviewRequest = new CreateTaskManyReviewRequest(); // CreateTaskManyReviewRequest | 
    try {
      CreateTaskManyReview201Response result = apiInstance.createTaskManyReview(contractId, createTaskManyReviewRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#createTaskManyReview");
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
| **contractId** | **String**| The unique Deel contract ID associated with the tasks. | |
| **createTaskManyReviewRequest** | [**CreateTaskManyReviewRequest**](CreateTaskManyReviewRequest.md)|  | |

### Return type

[**CreateTaskManyReview201Response**](CreateTaskManyReview201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The task reviews were successfully processed. |  -  |
| **400** | Bad request. Missing required fields or invalid data format. |  -  |
| **401** | Unauthorized. Authentication credentials are missing or invalid. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Not found. One or more specified tasks or the contract was not found. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Internal server error. An unexpected error occurred while processing the request. |  -  |

<a id="createTaskReviewById"></a>
# **createTaskReviewById**
> CreateTaskReviewById201Response createTaskReviewById(contractId, taskId, createTaskReviewByIdRequest).execute();

Review a single task

Review a specific task associated with a Deel contract to approve or decline the submitted work. The review includes the status (approved or declined) and an optional reason if declined.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TasksApi;

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

    TasksApi apiInstance = new TasksApi(defaultClient);
    String contractId = "37nex2x"; // String | The unique Deel contract ID associated with the task.
    String taskId = "00000000-0000-0000-0000-000000000000"; // String | The unique ID of the task to be reviewed.
    CreateTaskReviewByIdRequest createTaskReviewByIdRequest = new CreateTaskReviewByIdRequest(); // CreateTaskReviewByIdRequest | 
    try {
      CreateTaskReviewById201Response result = apiInstance.createTaskReviewById(contractId, taskId, createTaskReviewByIdRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#createTaskReviewById");
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
| **contractId** | **String**| The unique Deel contract ID associated with the task. | |
| **taskId** | **String**| The unique ID of the task to be reviewed. | |
| **createTaskReviewByIdRequest** | [**CreateTaskReviewByIdRequest**](CreateTaskReviewByIdRequest.md)|  | |

### Return type

[**CreateTaskReviewById201Response**](CreateTaskReviewById201Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The task review was successfully processed. |  -  |
| **400** | Bad request. Missing required fields or invalid data format. |  -  |
| **401** | Unauthorized. Authentication credentials are missing or invalid. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Not found. The specified task or contract was not found. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Internal server error. An unexpected error occurred while processing the request. |  -  |

<a id="deleteContractTaskById"></a>
# **deleteContractTaskById**
> DeleteContractTaskById200Response deleteContractTaskById(contractId, taskId).reason(reason).execute();

Delete task

Delete a specific task associated with the contract. Optionally, a reason can be provided for auditing or documentation purposes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TasksApi;

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

    TasksApi apiInstance = new TasksApi(defaultClient);
    String contractId = "37nex2x"; // String | The unique identifier of the Deel contract.
    String taskId = "123e4567-e89b-12d3-a456-426614174000"; // String | The unique identifier of the task to be deleted.
    String reason = "Task is no longer required due to scope changes."; // String | The reason for deleting the task. This can be used for auditing purposes.
    try {
      DeleteContractTaskById200Response result = apiInstance.deleteContractTaskById(contractId, taskId)
            .reason(reason)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#deleteContractTaskById");
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
| **contractId** | **String**| The unique identifier of the Deel contract. | |
| **taskId** | **String**| The unique identifier of the task to be deleted. | |
| **reason** | **String**| The reason for deleting the task. This can be used for auditing purposes. | [optional] |

### Return type

[**DeleteContractTaskById200Response**](DeleteContractTaskById200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The task was successfully deleted. |  -  |
| **400** | Invalid request. For example, missing required parameters or invalid format. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Permission denied. The user does not have the required access to delete the task. |  -  |
| **404** | The specified task or contract was not found. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getTasksByContract"></a>
# **getTasksByContract**
> GetTasksByContract200Response getTasksByContract(contractId).execute();

List of tasks

Retrieve a list of tasks associated with a specific contract. Each task contains details such as its ID, amount, submission date, status, and description. This endpoint is useful for tracking the progress and status of tasks related to contracts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TasksApi;

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

    TasksApi apiInstance = new TasksApi(defaultClient);
    String contractId = "contractId_example"; // String | The unique identifier for the Deel contract.
    try {
      GetTasksByContract200Response result = apiInstance.getTasksByContract(contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TasksApi#getTasksByContract");
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
| **contractId** | **String**| The unique identifier for the Deel contract. | |

### Return type

[**GetTasksByContract200Response**](GetTasksByContract200Response.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. A list of tasks associated with the specified contract. |  -  |
| **400** | Operation failed. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **405** | Operation failed. |  -  |
| **429** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

