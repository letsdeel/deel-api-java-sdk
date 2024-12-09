

# GetCustomFieldFromPeopleById200ResponseDataSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**GetCustomFieldFromPeopleById200ResponseDataSettingsAccess**](GetCustomFieldFromPeopleById200ResponseDataSettingsAccess.md) |  |  [optional] |
|**required** | **Boolean** | Whether the custom field is required |  [optional] |
|**countries** | **List&lt;String&gt;** | Countries for which the custom field is applicable. |  [optional] |
|**isEnabled** | **Boolean** | Whether the custom field is enabled |  [optional] |
|**workerTypes** | [**List&lt;WorkerTypesEnum&gt;**](#List&lt;WorkerTypesEnum&gt;) | Worker types for which the custom field is applicable |  [optional] |



## Enum: List&lt;WorkerTypesEnum&gt;

| Name | Value |
|---- | -----|
| EOR | &quot;eor&quot; |
| CONTRACTOR | &quot;contractor&quot; |
| HRIS_DIRECT_EMPLOYEE | &quot;hris_direct_employee&quot; |
| DIRECT_EMPLOYEE | &quot;direct_employee&quot; |



