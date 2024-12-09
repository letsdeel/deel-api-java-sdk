

# GetOffCyclePaymentByContractAndId200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier for the off-cycle payment. |  |
|**amount** | **String** | Amount of the off-cycle payment. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the off-cycle payment. |  |
|**createdAt** | **OffsetDateTime** | Timestamp of when the off-cycle payment was created. |  |
|**description** | **String** | Description of the off-cycle payment. |  |
|**reportedBy** | [**GetOffCyclePaymentByContractAndId200ResponseDataReportedBy**](GetOffCyclePaymentByContractAndId200ResponseDataReportedBy.md) |  |  |
|**currencyCode** | **String** | ISO 4217 currency code of the payment. |  |
|**dateSubmitted** | **OffsetDateTime** | Timestamp of when the payment was submitted. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| DECLINED | &quot;declined&quot; |
| NOT_PAYABLE | &quot;not_payable&quot; |
| PAID | &quot;paid&quot; |
| PENDING | &quot;pending&quot; |
| PROCESSING | &quot;processing&quot; |



