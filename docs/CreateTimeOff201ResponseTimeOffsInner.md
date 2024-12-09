

# CreateTimeOff201ResponseTimeOffsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The time off id |  |
|**amount** | **Float** | The amount of time off |  |
|**reason** | **String** | The reason for the time off |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the time off |  [optional] |
|**isPaid** | **Boolean** | Is the time off paid |  |
|**endDate** | **OffsetDateTime** | The end date of the time off |  |
|**createdAt** | **OffsetDateTime** | The creation date of the time off |  |
|**startDate** | **OffsetDateTime** | The start date of the time off |  |
|**updatedAt** | **OffsetDateTime** | The update date of the time off |  |
|**approvedAt** | **OffsetDateTime** | The approval date of the time off |  [optional] |
|**description** | **String** | The description of the time off |  [optional] |
|**contractOid** | **String** | The contract id of the time off |  [optional] |
|**requestedAt** | **OffsetDateTime** | The request date of the time off |  |
|**halfEndDate** | **Boolean** | Is the end date a half day |  |
|**halfStartDate** | **Boolean** | Is the start date a half day |  |
|**deductionAmount** | **Float** | The deduction amount of the time off |  [optional] |
|**timeOffDailies** | [**List&lt;CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner&gt;**](CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner.md) |  |  [optional] |
|**timeOffTypeId** | **String** | The time off type id |  |
|**recipientProfile** | [**CreateTimeOff201ResponseTimeOffsInnerRecipientProfile**](CreateTimeOff201ResponseTimeOffsInnerRecipientProfile.md) |  |  [optional] |
|**requesterProfile** | [**CreateTimeOff201ResponseTimeOffsInnerRequesterProfile**](CreateTimeOff201ResponseTimeOffsInnerRequesterProfile.md) |  |  [optional] |
|**timeOffPercentage** | **Float** | The time off percentage |  [optional] |
|**isEndDateEstimated** | **Boolean** | Is the end date estimated |  [optional] |
|**otherTypeDescription** | **String** | The other type description |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;REQUESTED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| USED | &quot;USED&quot; |
| CANCELED | &quot;CANCELED&quot; |



