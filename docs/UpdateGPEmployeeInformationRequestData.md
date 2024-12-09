

# UpdateGPEmployeeInformationRequestData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gender** | **String** | Employee&#39;s gender. |  [optional] |
|**lastName** | **String** | Last name of the employee. |  [optional] |
|**firstName** | **String** | First name of the employee. |  [optional] |
|**middleName** | **String** | Middle name of the employee. |  [optional] |
|**dateOfBirth** | **LocalDate** | Short date in ISO-8601 format (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**maritalStatus** | [**MaritalStatusEnum**](#MaritalStatusEnum) | Employee&#39;s marital status. |  [optional] |
|**employeeNumber** | **String** | Employee&#39;s unique number. |  [optional] |



## Enum: MaritalStatusEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;Single&quot; |
| MARRIED | &quot;Married&quot; |
| WIDOWED | &quot;Widowed&quot; |
| DIVORCED | &quot;Divorced&quot; |
| SEPARATED | &quot;Separated&quot; |
| REGISTERED_PARTNERSHIP | &quot;Registered Partnership&quot; |
| COMMON_LAW | &quot;Common Law&quot; |



