

# CreateTimesheet201ResponseData

Details of invoice adjustment created.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**CreateEorContractRequestClientTeamId**](CreateEorContractRequestClientTeamId.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of invoice adjustment |  [optional] |
|**created** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| DECLINED | &quot;declined&quot; |
| NOT_PAYABLE | &quot;not_payable&quot; |
| PAID | &quot;paid&quot; |
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |



