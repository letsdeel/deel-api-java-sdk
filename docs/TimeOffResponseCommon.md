

# TimeOffResponseCommon


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**recipientProfile** | [**ProfileReference**](ProfileReference.md) |  |  [optional] |
|**requesterProfile** | [**ProfileReference**](ProfileReference.md) |  |  [optional] |
|**timeOffTypeId** | **String** |  |  |
|**requestedAt** | **OffsetDateTime** |  |  |
|**otherTypeDescription** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**reason** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  |
|**endDate** | **OffsetDateTime** |  |  |
|**deductionAmount** | **Float** |  |  [optional] |
|**isPaid** | **Boolean** |  |  |
|**halfStartDate** | **Boolean** |  |  |
|**halfEndDate** | **Boolean** |  |  |
|**amount** | **Float** |  |  |
|**contractOid** | **String** |  |  [optional] |
|**approvedAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**timeOffDailies** | [**List&lt;TimeOffDaily&gt;**](TimeOffDaily.md) |  |  [optional] |
|**timeOffPercentage** | **Float** |  |  [optional] |
|**isEndDateEstimated** | **Boolean** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;REQUESTED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| USED | &quot;USED&quot; |
| CANCELED | &quot;CANCELED&quot; |



