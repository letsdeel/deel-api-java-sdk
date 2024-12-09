

# GetTasksByContract200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for the task. |  |
|**amount** | **BigDecimal** | The monetary amount associated with the task. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the task. |  |
|**attachment** | [**GetTasksByContract200ResponseDataAttachment**](GetTasksByContract200ResponseDataAttachment.md) |  |  [optional] |
|**description** | **String** | (Required) A brief description of the task. |  |
|**dateSubmitted** | **LocalDate** | (Required) The date when the task was submitted. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| DECLINED | &quot;declined&quot; |
| NOT_PAYABLE | &quot;not_payable&quot; |
| PAID | &quot;paid&quot; |
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |



