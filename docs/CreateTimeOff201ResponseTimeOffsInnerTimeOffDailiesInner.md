

# CreateTimeOff201ResponseTimeOffsInnerTimeOffDailiesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The time off daily id |  |
|**date** | **OffsetDateTime** | The date of the time off daily |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the time off daily |  |
|**amount** | **Float** | The amount of the time off daily |  |
|**createdAt** | **OffsetDateTime** | The creation date of the time off daily |  |
|**updatedAt** | **OffsetDateTime** | The update date of the time off daily |  |
|**description** | **String** | The description of the time off daily |  [optional] |
|**timeOffId** | **UUID** | The time off id |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WORKING_DAY | &quot;WORKING_DAY&quot; |
| NON_WORKING_DAY | &quot;NON_WORKING_DAY&quot; |
| HOLIDAY | &quot;HOLIDAY&quot; |



