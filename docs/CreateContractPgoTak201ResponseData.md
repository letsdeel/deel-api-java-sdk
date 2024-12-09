

# CreateContractPgoTak201ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier for the created task. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the task. |  [optional] |
|**created** | **Boolean** | Indicates whether the task creation operation was successful. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| DECLINED | &quot;declined&quot; |
| NOT_PAYABLE | &quot;not_payable&quot; |
| PAID | &quot;paid&quot; |
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |



