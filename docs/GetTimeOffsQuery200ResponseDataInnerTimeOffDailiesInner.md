

# GetTimeOffsQuery200ResponseDataInnerTimeOffDailiesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Time off daily id |  |
|**date** | **OffsetDateTime** | Time off daily date |  |
|**type** | [**TypeEnum**](#TypeEnum) | Time off daily type |  |
|**amount** | **Float** | Time off daily amount |  |
|**createdAt** | **OffsetDateTime** | Time off daily creation date |  |
|**updatedAt** | **OffsetDateTime** | Time off daily update date |  |
|**description** | **String** | Time off daily description |  [optional] |
|**timeOffId** | **UUID** | Time off id |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WORKING_DAY | &quot;WORKING_DAY&quot; |
| NON_WORKING_DAY | &quot;NON_WORKING_DAY&quot; |
| HOLIDAY | &quot;HOLIDAY&quot; |



