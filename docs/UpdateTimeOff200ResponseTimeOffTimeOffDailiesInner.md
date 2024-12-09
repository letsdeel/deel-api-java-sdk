

# UpdateTimeOff200ResponseTimeOffTimeOffDailiesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**date** | **OffsetDateTime** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**amount** | **Float** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**description** | **String** |  |  [optional] |
|**timeOffId** | **UUID** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WORKING_DAY | &quot;WORKING_DAY&quot; |
| NON_WORKING_DAY | &quot;NON_WORKING_DAY&quot; |
| HOLIDAY | &quot;HOLIDAY&quot; |



