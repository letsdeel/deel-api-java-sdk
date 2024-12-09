# PartnerManagedApi

All URIs are relative to *https://api.letsdeel.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBankAccount**](PartnerManagedApi.md#addBankAccount) | **POST** /partner-managed/employees/{employee_id}/banks | Add bank account |
| [**addEmployeeAdditionalInformation**](PartnerManagedApi.md#addEmployeeAdditionalInformation) | **POST** /partner-managed/employees/{employee_id}/contracts/{contract_id}/additional-information | Add additional information |
| [**downloadHrVerificationLettersAndDocuments**](PartnerManagedApi.md#downloadHrVerificationLettersAndDocuments) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/hr-documents/{document_id}/download | Download HR verification letters and documents |
| [**getBankAccountGuide**](PartnerManagedApi.md#getBankAccountGuide) | **GET** /partner-managed/employees/{employee_id}/banks/guide | Bank account form |
| [**getEmployeeAgreementDownloadLink**](PartnerManagedApi.md#getEmployeeAgreementDownloadLink) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/employee-agreement/download | Download employee agreement PDF |
| [**getEmployeeAgreementPreview**](PartnerManagedApi.md#getEmployeeAgreementPreview) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/employee-agreement | Preview employee agreement |
| [**getEmployeeComplianceDocumentTemplate**](PartnerManagedApi.md#getEmployeeComplianceDocumentTemplate) | **GET** /partner-managed/employees/{employee_id}/compliance-documents/{document_id}/templates/download | Download employee compliance document template |
| [**getEmployeeComplianceDocuments**](PartnerManagedApi.md#getEmployeeComplianceDocuments) | **GET** /partner-managed/employees/{employee_id}/compliance-documents | List of employee compliance documents |
| [**getEmployeePayslips**](PartnerManagedApi.md#getEmployeePayslips) | **GET** /partner-managed/employees/{employee_id}/payslips | Get list of payslips for an EOR employee |
| [**getEmployeeTaxDocuments**](PartnerManagedApi.md#getEmployeeTaxDocuments) | **GET** /partner-managed/employees/{employee_id}/tax-documents | List of tax documents for an employee |
| [**getHrVerificationLettersAndDocuments**](PartnerManagedApi.md#getHrVerificationLettersAndDocuments) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/hr-documents | List HR verification letters and documents |
| [**getOfferLetterPreview**](PartnerManagedApi.md#getOfferLetterPreview) | **GET** /partner-managed/employees/{employee_id}/contracts/{contract_id}/offer-letter | Preview job offer letter |
| [**patchBankAccount**](PartnerManagedApi.md#patchBankAccount) | **PATCH** /partner-managed/employees/{employee_id}/banks/{bank_id} | Modify bank account for an EOR employee |
| [**requestCustomVerificationLetter**](PartnerManagedApi.md#requestCustomVerificationLetter) | **POST** /partner-managed/employees/{employee_id}/contracts/{contract_id}/custom-verification-letter | Request custom verification letter |
| [**signEmployeeContract**](PartnerManagedApi.md#signEmployeeContract) | **POST** /partner-managed/employees/{employee_id}/contracts/{contract_id}/signatures | Sign a contract |
| [**uploadEmployeeComplianceDocument**](PartnerManagedApi.md#uploadEmployeeComplianceDocument) | **POST** /partner-managed/employees/{employee_id}/compliance-documents/{document_id} | Upload employee compliance document |


<a id="addBankAccount"></a>
# **addBankAccount**
> BankAccountAddedContainer addBankAccount(employeeId, bankAccountToAddContainer).execute();

Add bank account

Add bank account for an EOR employee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    BankAccountToAddContainer bankAccountToAddContainer = new BankAccountToAddContainer(); // BankAccountToAddContainer | Bank Account object that needs to be created
    try {
      BankAccountAddedContainer result = apiInstance.addBankAccount(employeeId, bankAccountToAddContainer)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#addBankAccount");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **bankAccountToAddContainer** | [**BankAccountToAddContainer**](BankAccountToAddContainer.md)| Bank Account object that needs to be created | |

### Return type

[**BankAccountAddedContainer**](BankAccountAddedContainer.md)

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

<a id="addEmployeeAdditionalInformation"></a>
# **addEmployeeAdditionalInformation**
> GenericResultUpdated addEmployeeAdditionalInformation(employeeId, contractId, additionalEORInfoContainer).execute();

Add additional information

Add additional information for an EOR employee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // String | Deel contract id.
    AdditionalEORInfoContainer additionalEORInfoContainer = new AdditionalEORInfoContainer(); // AdditionalEORInfoContainer | Bank Account object that needs to be created
    try {
      GenericResultUpdated result = apiInstance.addEmployeeAdditionalInformation(employeeId, contractId, additionalEORInfoContainer)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#addEmployeeAdditionalInformation");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |
| **additionalEORInfoContainer** | [**AdditionalEORInfoContainer**](AdditionalEORInfoContainer.md)| Bank Account object that needs to be created | |

### Return type

[**GenericResultUpdated**](GenericResultUpdated.md)

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

<a id="downloadHrVerificationLettersAndDocuments"></a>
# **downloadHrVerificationLettersAndDocuments**
> EmployeeAgreementDownloadContainer downloadHrVerificationLettersAndDocuments(employeeId, contractId, documentId).execute();

Download HR verification letters and documents

Retrieve URL to download HR verification letters and documents.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // String | Deel contract id.
    BigDecimal documentId = new BigDecimal("1234"); // BigDecimal | Unique identifier for a compliance document in Deel.
    try {
      EmployeeAgreementDownloadContainer result = apiInstance.downloadHrVerificationLettersAndDocuments(employeeId, contractId, documentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#downloadHrVerificationLettersAndDocuments");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |
| **documentId** | **BigDecimal**| Unique identifier for a compliance document in Deel. | |

### Return type

[**EmployeeAgreementDownloadContainer**](EmployeeAgreementDownloadContainer.md)

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

<a id="getBankAccountGuide"></a>
# **getBankAccountGuide**
> BankAccountGuideContainer getBankAccountGuide(employeeId).execute();

Bank account form

Retrieve bank account form guide for an EOR employee. This data can be used to add a new bank account for an employee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    try {
      BankAccountGuideContainer result = apiInstance.getBankAccountGuide(employeeId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getBankAccountGuide");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |

### Return type

[**BankAccountGuideContainer**](BankAccountGuideContainer.md)

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

<a id="getEmployeeAgreementDownloadLink"></a>
# **getEmployeeAgreementDownloadLink**
> EmployeeAgreementDownloadContainer getEmployeeAgreementDownloadLink(employeeId, contractId).execute();

Download employee agreement PDF

Get link to download the employee agreement PDF.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // String | Deel contract id.
    try {
      EmployeeAgreementDownloadContainer result = apiInstance.getEmployeeAgreementDownloadLink(employeeId, contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getEmployeeAgreementDownloadLink");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |

### Return type

[**EmployeeAgreementDownloadContainer**](EmployeeAgreementDownloadContainer.md)

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

<a id="getEmployeeAgreementPreview"></a>
# **getEmployeeAgreementPreview**
> String getEmployeeAgreementPreview(employeeId, contractId).execute();

Preview employee agreement

Retrieve an EOR Employee Agreement content in HTML.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // String | Deel contract id.
    try {
      String result = apiInstance.getEmployeeAgreementPreview(employeeId, contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getEmployeeAgreementPreview");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |

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

<a id="getEmployeeComplianceDocumentTemplate"></a>
# **getEmployeeComplianceDocumentTemplate**
> GetEmployeeComplianceDocumentTemplateDownloadLinkContainer getEmployeeComplianceDocumentTemplate(employeeId, documentId).execute();

Download employee compliance document template

Get the download link for an employee compliance document template, if it exists.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    BigDecimal documentId = new BigDecimal("1234"); // BigDecimal | Unique identifier for a compliance document in Deel.
    try {
      GetEmployeeComplianceDocumentTemplateDownloadLinkContainer result = apiInstance.getEmployeeComplianceDocumentTemplate(employeeId, documentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getEmployeeComplianceDocumentTemplate");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **documentId** | **BigDecimal**| Unique identifier for a compliance document in Deel. | |

### Return type

[**GetEmployeeComplianceDocumentTemplateDownloadLinkContainer**](GetEmployeeComplianceDocumentTemplateDownloadLinkContainer.md)

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

<a id="getEmployeeComplianceDocuments"></a>
# **getEmployeeComplianceDocuments**
> GetEmployeeComplianceDocumentsContainer getEmployeeComplianceDocuments(employeeId).execute();

List of employee compliance documents

Get a list of employee compliance documents.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    try {
      GetEmployeeComplianceDocumentsContainer result = apiInstance.getEmployeeComplianceDocuments(employeeId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getEmployeeComplianceDocuments");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |

### Return type

[**GetEmployeeComplianceDocumentsContainer**](GetEmployeeComplianceDocumentsContainer.md)

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

<a id="getEmployeePayslips"></a>
# **getEmployeePayslips**
> EmployeePayslipsListContainer getEmployeePayslips(employeeId).execute();

Get list of payslips for an EOR employee

Get list of payslips for an EOR employee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    try {
      EmployeePayslipsListContainer result = apiInstance.getEmployeePayslips(employeeId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getEmployeePayslips");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |

### Return type

[**EmployeePayslipsListContainer**](EmployeePayslipsListContainer.md)

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

<a id="getEmployeeTaxDocuments"></a>
# **getEmployeeTaxDocuments**
> EmployeeTaxDocumentsListContainer getEmployeeTaxDocuments(employeeId).execute();

List of tax documents for an employee

Get list of tax documents for an employee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    try {
      EmployeeTaxDocumentsListContainer result = apiInstance.getEmployeeTaxDocuments(employeeId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getEmployeeTaxDocuments");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |

### Return type

[**EmployeeTaxDocumentsListContainer**](EmployeeTaxDocumentsListContainer.md)

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

<a id="getHrVerificationLettersAndDocuments"></a>
# **getHrVerificationLettersAndDocuments**
> HrVerificationLettersAndDocumentsListContainer getHrVerificationLettersAndDocuments(employeeId, contractId).execute();

List HR verification letters and documents

List all HR verification letters and documents available.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // String | Deel contract id.
    try {
      HrVerificationLettersAndDocumentsListContainer result = apiInstance.getHrVerificationLettersAndDocuments(employeeId, contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getHrVerificationLettersAndDocuments");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |

### Return type

[**HrVerificationLettersAndDocumentsListContainer**](HrVerificationLettersAndDocumentsListContainer.md)

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

<a id="getOfferLetterPreview"></a>
# **getOfferLetterPreview**
> String getOfferLetterPreview(employeeId, contractId).execute();

Preview job offer letter

Retrieve an EOR job offer letter in HTML. This endpoint does not support IC and Global Payroll contract types.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // String | Deel contract id.
    try {
      String result = apiInstance.getOfferLetterPreview(employeeId, contractId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#getOfferLetterPreview");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |

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

<a id="patchBankAccount"></a>
# **patchBankAccount**
> BankAccountAddedContainer patchBankAccount(employeeId, bankId, bankAccountToAddContainer).execute();

Modify bank account for an EOR employee

Modify bank account for an EOR employee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    String bankId = "dcc7b587-2246-4909-853e-12056e90c451"; // String | Bank Account id.
    BankAccountToAddContainer bankAccountToAddContainer = new BankAccountToAddContainer(); // BankAccountToAddContainer | Bank Account object that needs to be modified
    try {
      BankAccountAddedContainer result = apiInstance.patchBankAccount(employeeId, bankId, bankAccountToAddContainer)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#patchBankAccount");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **bankId** | **String**| Bank Account id. | |
| **bankAccountToAddContainer** | [**BankAccountToAddContainer**](BankAccountToAddContainer.md)| Bank Account object that needs to be modified | |

### Return type

[**BankAccountAddedContainer**](BankAccountAddedContainer.md)

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

<a id="requestCustomVerificationLetter"></a>
# **requestCustomVerificationLetter**
> GenericResultCreated requestCustomVerificationLetter(employeeId, contractId, requestCustomVerificationLetterContainer).execute();

Request custom verification letter

Request employment verification letters, visa support, bank verification and more.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // String | Deel contract id.
    RequestCustomVerificationLetterContainer requestCustomVerificationLetterContainer = new RequestCustomVerificationLetterContainer(); // RequestCustomVerificationLetterContainer | Request custom verification letter to be requested
    try {
      GenericResultCreated result = apiInstance.requestCustomVerificationLetter(employeeId, contractId, requestCustomVerificationLetterContainer)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#requestCustomVerificationLetter");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |
| **requestCustomVerificationLetterContainer** | [**RequestCustomVerificationLetterContainer**](RequestCustomVerificationLetterContainer.md)| Request custom verification letter to be requested | |

### Return type

[**GenericResultCreated**](GenericResultCreated.md)

### Authorization

[deelToken](../README.md#deelToken), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
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

<a id="signEmployeeContract"></a>
# **signEmployeeContract**
> GenericResultCreated signEmployeeContract(employeeId, contractId, employeeContractSignatureToCreateContainer).execute();

Sign a contract

Sign a contract as a employee.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    String contractId = "37nex2x"; // String | Deel contract id.
    EmployeeContractSignatureToCreateContainer employeeContractSignatureToCreateContainer = new EmployeeContractSignatureToCreateContainer(); // EmployeeContractSignatureToCreateContainer | Contract signature object that needs to be created
    try {
      GenericResultCreated result = apiInstance.signEmployeeContract(employeeId, contractId, employeeContractSignatureToCreateContainer)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#signEmployeeContract");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **contractId** | **String**| Deel contract id. | |
| **employeeContractSignatureToCreateContainer** | [**EmployeeContractSignatureToCreateContainer**](EmployeeContractSignatureToCreateContainer.md)| Contract signature object that needs to be created | |

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

<a id="uploadEmployeeComplianceDocument"></a>
# **uploadEmployeeComplianceDocument**
> UploadEmployeeComplianceDocumentContainer uploadEmployeeComplianceDocument(employeeId, documentId, _file).execute();

Upload employee compliance document

Upload an employee compliance document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PartnerManagedApi;

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

    PartnerManagedApi apiInstance = new PartnerManagedApi(defaultClient);
    String employeeId = "0123abcd-e031-4f1e-93d4-6bc66e8c4727"; // String | Unique identifier for an employee in Deel.
    BigDecimal documentId = new BigDecimal("1234"); // BigDecimal | Unique identifier for a compliance document in Deel.
    File _file = new File("/path/to/file"); // File | The employee compliance document to upload.
    try {
      UploadEmployeeComplianceDocumentContainer result = apiInstance.uploadEmployeeComplianceDocument(employeeId, documentId, _file)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartnerManagedApi#uploadEmployeeComplianceDocument");
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
| **employeeId** | **String**| Unique identifier for an employee in Deel. | |
| **documentId** | **BigDecimal**| Unique identifier for a compliance document in Deel. | |
| **_file** | **File**| The employee compliance document to upload. | |

### Return type

[**UploadEmployeeComplianceDocumentContainer**](UploadEmployeeComplianceDocumentContainer.md)

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

