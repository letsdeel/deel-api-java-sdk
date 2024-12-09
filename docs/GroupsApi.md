# GroupsApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGroup**](GroupsApi.md#createGroup) | **POST** /groups | Create a group |
| [**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /groups/{id} | Delete a group |
| [**editGroup**](GroupsApi.md#editGroup) | **PATCH** /groups/{id} | Edit a group |
| [**getGroups**](GroupsApi.md#getGroups) | **GET** /groups | Return list of groups |


<a id="createGroup"></a>
# **createGroup**
> CreateGroup200Response createGroup(createGroupRequest).execute();

Create a group

Create a new group within your organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    CreateGroupRequest createGroupRequest = new CreateGroupRequest(); // CreateGroupRequest | 
    try {
      CreateGroup200Response result = apiInstance.createGroup(createGroupRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroup");
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
| **createGroupRequest** | [**CreateGroupRequest**](CreateGroupRequest.md)|  | |

### Return type

[**CreateGroup200Response**](CreateGroup200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group created successfully |  -  |
| **400** | Invalid request payload |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="deleteGroup"></a>
# **deleteGroup**
> DeleteGroup200Response deleteGroup(id).execute();

Delete a group

Archive an existing group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String id = "9e12eb6b-90ea-4543-8ff1-7789e7b8db7e"; // String | 
    try {
      DeleteGroup200Response result = apiInstance.deleteGroup(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroup");
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
| **id** | **String**|  | |

### Return type

[**DeleteGroup200Response**](DeleteGroup200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group archived successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Group not found |  -  |
| **500** | Operation failed. |  -  |

<a id="editGroup"></a>
# **editGroup**
> EditGroup200Response editGroup(id, editGroupRequest).execute();

Edit a group

Edit the details of an existing group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String id = "9e12eb6b-90ea-4543-8ff1-7789e7b8db7e"; // String | 
    EditGroupRequest editGroupRequest = new EditGroupRequest(); // EditGroupRequest | 
    try {
      EditGroup200Response result = apiInstance.editGroup(id, editGroupRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#editGroup");
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
| **id** | **String**|  | |
| **editGroupRequest** | [**EditGroupRequest**](EditGroupRequest.md)|  | |

### Return type

[**EditGroup200Response**](EditGroup200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group updated successfully |  -  |
| **400** | Invalid request payload |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

<a id="getGroups"></a>
# **getGroups**
> GetGroups200Response getGroups().limit(limit).sortOrder(sortOrder).cursor(cursor).includeArchivedGroups(includeArchivedGroups).externalMetadata(externalMetadata).execute();

Return list of groups

List all the groups in your organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.letsdeel.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    Integer limit = 100; // Integer | The maximum number of groups to return (between 1 and 100)
    String sortOrder = "ASC"; // String | Sort the results in ascending (ASC) or descending (DESC) order based on the group name.
    String cursor = "cursor_example"; // String | The encoded cursor for paginated results. This is an opaque string that allows fetching the next set of results.
    Boolean includeArchivedGroups = true; // Boolean | Include archived groups (soft deleted records). Defaults to `true`.
    String externalMetadata = "externalMetadata_example"; // String | Extra information about the group
    try {
      GetGroups200Response result = apiInstance.getGroups()
            .limit(limit)
            .sortOrder(sortOrder)
            .cursor(cursor)
            .includeArchivedGroups(includeArchivedGroups)
            .externalMetadata(externalMetadata)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroups");
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
| **limit** | **Integer**| The maximum number of groups to return (between 1 and 100) | [optional] [default to 100] |
| **sortOrder** | **String**| Sort the results in ascending (ASC) or descending (DESC) order based on the group name. | [optional] [default to ASC] [enum: ASC, DESC] |
| **cursor** | **String**| The encoded cursor for paginated results. This is an opaque string that allows fetching the next set of results. | [optional] |
| **includeArchivedGroups** | **Boolean**| Include archived groups (soft deleted records). Defaults to &#x60;true&#x60;. | [optional] [default to true] |
| **externalMetadata** | **String**| Extra information about the group | [optional] |

### Return type

[**GetGroups200Response**](GetGroups200Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of groups in the organization. |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Operation failed. |  -  |
| **403** | Operation failed. |  -  |
| **404** | Operation failed. |  -  |
| **500** | Operation failed. |  -  |

