

# TimeOffDaily


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**timeOffId** | **UUID** |  |  |
|**amount** | **Float** |  |  |
|**date** | **OffsetDateTime** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**description** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WORKING_DAY | &quot;WORKING_DAY&quot; |
| NON_WORKING_DAY | &quot;NON_WORKING_DAY&quot; |
| HOLIDAY | &quot;HOLIDAY&quot; |



