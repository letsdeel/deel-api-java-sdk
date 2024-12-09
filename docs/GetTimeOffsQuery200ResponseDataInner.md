

# GetTimeOffsQuery200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Time off id |  |
|**amount** | **Float** | Amount of time off |  |
|**reason** | **String** | Reason for time off |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of time off |  [optional] |
|**isPaid** | **Boolean** | Is time off paid |  |
|**endDate** | **OffsetDateTime** | End date of time off |  |
|**createdAt** | **OffsetDateTime** | Time off creation date |  |
|**startDate** | **OffsetDateTime** | Start date of time off |  |
|**updatedAt** | **OffsetDateTime** | Time off update date |  |
|**approvedAt** | **OffsetDateTime** | Time off approval date |  [optional] |
|**description** | **String** | Time off description |  [optional] |
|**contractOid** | **String** | Contract id |  [optional] |
|**requestedAt** | **OffsetDateTime** | Time off request date |  |
|**halfEndDate** | **Boolean** | Is half end date |  |
|**halfStartDate** | **Boolean** | Is half start date |  |
|**deductionAmount** | **Float** | Deduction amount |  [optional] |
|**timeOffDailies** | [**List&lt;GetTimeOffsQuery200ResponseDataInnerTimeOffDailiesInner&gt;**](GetTimeOffsQuery200ResponseDataInnerTimeOffDailiesInner.md) |  |  [optional] |
|**timeOffTypeId** | **String** | Time off type id |  |
|**recipientProfile** | [**GetTimeOffsQuery200ResponseDataInnerRecipientProfile**](GetTimeOffsQuery200ResponseDataInnerRecipientProfile.md) |  |  [optional] |
|**requesterProfile** | [**GetTimeOffsQuery200ResponseDataInnerRequesterProfile**](GetTimeOffsQuery200ResponseDataInnerRequesterProfile.md) |  |  [optional] |
|**timeOffPercentage** | **Float** | Time off percentage |  [optional] |
|**isEndDateEstimated** | **Boolean** | Is end date estimated |  [optional] |
|**otherTypeDescription** | **String** | Other type description |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;REQUESTED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| USED | &quot;USED&quot; |
| CANCELED | &quot;CANCELED&quot; |



