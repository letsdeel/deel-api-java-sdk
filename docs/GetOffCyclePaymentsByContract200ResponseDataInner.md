

# GetOffCyclePaymentsByContract200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the off-cycle payment. |  |
|**amount** | **String** | The amount of the off-cycle payment. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the off-cycle payment. |  |
|**createdAt** | **OffsetDateTime** | The timestamp when the off-cycle payment was created. |  |
|**description** | **String** | A description or reason for the off-cycle payment. |  |
|**reportedBy** | [**GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy**](GetOffCyclePaymentsByContract200ResponseDataInnerReportedBy.md) |  |  |
|**currencyCode** | **String** | The three-letter ISO currency code for the payment amount. |  |
|**dateSubmitted** | **OffsetDateTime** | The timestamp when the off-cycle payment was submitted. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| DECLINED | &quot;declined&quot; |
| NOT_PAYABLE | &quot;not_payable&quot; |
| PAID | &quot;paid&quot; |
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |



