

# UpdateTimeOff200ResponseTimeOff

Updated time off request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**amount** | **Float** |  |  |
|**reason** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**isPaid** | **Boolean** |  |  |
|**endDate** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**startDate** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**approvedAt** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**contractOid** | **String** |  |  [optional] |
|**requestedAt** | **OffsetDateTime** |  |  |
|**halfEndDate** | **Boolean** |  |  |
|**halfStartDate** | **Boolean** |  |  |
|**deductionAmount** | **Float** |  |  [optional] |
|**timeOffDailies** | [**List&lt;UpdateTimeOff200ResponseTimeOffTimeOffDailiesInner&gt;**](UpdateTimeOff200ResponseTimeOffTimeOffDailiesInner.md) |  |  [optional] |
|**timeOffTypeId** | **String** |  |  |
|**recipientProfile** | [**UpdateTimeOff200ResponseTimeOffRecipientProfile**](UpdateTimeOff200ResponseTimeOffRecipientProfile.md) |  |  [optional] |
|**requesterProfile** | [**UpdateTimeOff200ResponseTimeOffRecipientProfile**](UpdateTimeOff200ResponseTimeOffRecipientProfile.md) |  |  [optional] |
|**timeOffPercentage** | **Float** |  |  [optional] |
|**isEndDateEstimated** | **Boolean** |  |  [optional] |
|**otherTypeDescription** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;REQUESTED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| USED | &quot;USED&quot; |
| CANCELED | &quot;CANCELED&quot; |



