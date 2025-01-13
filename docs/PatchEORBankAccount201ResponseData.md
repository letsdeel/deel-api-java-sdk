

# PatchEORBankAccount201ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of Bank Account. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Bank Account status |  [optional] |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  [optional] |
|**updatedAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;new&quot; |
| PENDING | &quot;pending&quot; |
| APPROVED | &quot;approved&quot; |
| FAILED | &quot;failed&quot; |



