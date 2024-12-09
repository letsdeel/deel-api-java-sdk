

# EmployeeTimeoffsItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeOffId** | **String** | Unique identifier of this resource. |  |
|**timeOffTypeId** | **String** | Unique identifier of this resource. |  |
|**policyId** | **String** | Unique identifier of this resource. |  |
|**policyTypeId** | **String** | Unique identifier of this resource. |  |
|**policyName** | **String** | Time off policy name. |  |
|**policyTypeName** | **String** | Time off policy type name. |  |
|**reason** | **String** | Reason for time off. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Time off type. |  |
|**requestedAt** | **String** | Time off requested date. |  |
|**reviewedAt** | **String** | Time off reviewed date. |  |
|**withMultipleDates** | **Boolean** | Time off with multiple dates. |  |
|**createdAt** | **String** | Time off created date. |  |
|**updatedAt** | **String** | Time off updated date. |  |
|**denialReason** | **String** | Time off denial reason. |  |
|**requester** | [**EmployeeTimeoffsItemRequester**](EmployeeTimeoffsItemRequester.md) |  |  |
|**reviewer** | [**EmployeeTimeoffsItemReviewer**](EmployeeTimeoffsItemReviewer.md) |  |  |
|**daysUsedStartYear** | **String** | Days used in the start year. |  |
|**daysUsedEndYear** | **String** | Days used in the end year. |  |
|**daysUsed** | **String** | Days used. |  |
|**startDate** | **String** | Time off start date. |  |
|**endDate** | **String** | Time off end date. |  |
|**isStartDateHalfDay** | **Boolean** | Is start date half day. |  |
|**isEndDateHalfDay** | **Boolean** | Is end date half day. |  |
|**attachments** | [**List&lt;EmployeeTimeoffsItemAttachmentsInner&gt;**](EmployeeTimeoffsItemAttachmentsInner.md) |  |  |
|**changeRequest** | **String** | Time off change request. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VACATION | &quot;VACATION&quot; |
| SICK_LEAVE | &quot;SICK_LEAVE&quot; |
| OTHER | &quot;OTHER&quot; |



