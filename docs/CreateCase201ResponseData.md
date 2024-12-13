

# CreateCase201ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the immigration case |  |
|**process** | [**CreateCase201ResponseDataProcess**](CreateCase201ResponseDataProcess.md) |  |  |
|**createdAt** | **OffsetDateTime** | Timestamp when the case was created |  |
|**updatedAt** | **OffsetDateTime** | Timestamp when the case was last updated |  |
|**closureNote** | **String** | Optional note explaining why the case was closed |  [optional] |
|**closureReason** | **String** | Standardized reason for case closure |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| CLOSED | &quot;CLOSED&quot; |
| ON_HOLD | &quot;ON_HOLD&quot; |



