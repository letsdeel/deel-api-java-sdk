

# EorTimeoffsBaseItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reason** | **String** | Reason for requesting time off. |  [optional] |
|**type** | **TimeoffsTypeEnum** |  |  |
|**requestedAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**reviewedAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  [optional] |
|**denialReason** | **String** | Reason why time off was denied. |  [optional] |
|**hasMultipleDates** | **Boolean** | Indicates if multiple time off days are requested. |  [optional] |
|**status** | **TimeoffsStatusEnum** |  |  |
|**otherTimeoffName** | **String** | Custom title for the time off. Only specify if type is \&quot;OTHER\&quot;. |  [optional] |
|**requester** | [**TimeoffsProfile**](TimeoffsProfile.md) |  |  [optional] |
|**reviewer** | [**TimeoffsProfile**](TimeoffsProfile.md) |  |  [optional] |
|**daysUsedStartYear** | **String** | Days used at the start year. |  [optional] |
|**daysUsedEndYear** | **String** | Days used at the end year. |  [optional] |
|**totalDaysUsed** | **String** | Total number of time off days used. |  [optional] |
|**startDateIsHalfDay** | **Boolean** | Indicates if the first day of time off is a half day. |  [optional] |
|**endDateIsHalfDay** | **Boolean** | Indicates if the last day of time off is a half day. |  [optional] |
|**singleDate** | **OffsetDateTime** | Long date-time format following ISO-8601 |  [optional] |
|**dateIsHalfDay** | **Boolean** | If true, only a single date was specified. |  [optional] |
|**attachments** | [**List&lt;TimeoffsAttachmentsItem&gt;**](TimeoffsAttachmentsItem.md) | A list of attachments. 2022-09-08 FE only allows for \&quot;SICK LEAVE\&quot; |  [optional] |



