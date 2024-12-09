

# GetPaymentList200ResponseDataRowsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **BigDecimal** | Unique identifier of the payment. |  [optional] |
|**label** | **String** | A descriptive label for the payment. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the payment. Either &#39;paid&#39; or &#39;processing&#39;. |  [optional] |
|**paidAt** | **OffsetDateTime** | Date and time when the payment was completed, in ISO-8601 format. |  [optional] |
|**workers** | [**List&lt;TheWorkerForThePayment&gt;**](TheWorkerForThePayment.md) |  |  [optional] |
|**createdAt** | **String** | Date and time when the payment was created, in ISO-8601 format. |  [optional] |
|**paymentMethod** | [**GetPaymentList200ResponseDataRowsInnerPaymentMethod**](GetPaymentList200ResponseDataRowsInnerPaymentMethod.md) |  |  [optional] |
|**paymentCurrency** | **String** | Three-letter currency code for the payment, following ISO 4217. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PAID | &quot;paid&quot; |
| PROCESSING | &quot;processing&quot; |



