

# GetInvoiceList200ResponseDataRowsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of this resource as a UUID. |  |
|**fee** | **String** | Fee added to the invoice amount. |  [optional] |
|**type** | **String** | Type of the invoice. |  [optional] |
|**label** | **String** | Label or reference number of the invoice. |  |
|**total** | **String** | Total invoice amount, including fees and VAT. |  |
|**amount** | **String** | Billed amount of the invoice. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the invoice. |  |
|**vatId** | **String** | VAT identification number related to the invoice. |  |
|**paidAt** | **OffsetDateTime** | Date and time when the invoice was paid (ISO-8601 format). |  |
|**currency** | **String** | Three-letter currency code for the invoice. |  |
|**deelFee** | **String** | Fee charged by Deel. |  [optional] |
|**dueDate** | **OffsetDateTime** | Date and time when the invoice is due (ISO-8601 format). |  |
|**isSealed** | **Boolean** | Indicates whether the invoice is sealed. |  [optional] |
|**issuedAt** | **OffsetDateTime** | Date and time when the invoice was issued (ISO-8601 format). |  |
|**vatTotal** | **String** | Total amount of VAT charged on the invoice. |  |
|**createdAt** | **OffsetDateTime** | Date and time when the invoice was created (ISO-8601 format). |  |
|**isOverdue** | **Boolean** | Indicates whether the invoice is overdue. |  |
|**contractId** | **String** | Unique identifier of the related contract. |  |
|**isOffcycle** | **Boolean** | Indicates whether the invoice is off-cycle. |  [optional] |
|**exchangeFee** | **String** | Fee related to currency exchange for the invoice. |  [optional] |
|**processedAt** | **OffsetDateTime** | Date and time when the invoice was processed (ISO-8601 format). |  [optional] |
|**hasBreakdown** | **Boolean** | Indicates whether the invoice includes a breakdown of items. |  [optional] |
|**isEarlyPaid** | **Boolean** | Indicates whether the invoice was paid early. |  [optional] |
|**paymentMethod** | **String** | Method used to pay the invoice. |  [optional] |
|**vatPercentage** | **String** | Percentage of VAT charged on the invoice. |  |
|**earlyPayoutFee** | **String** | Fee charged for early payout of the invoice. |  [optional] |
|**paymentCurrency** | **String** | Currency in which the invoice was paid. |  [optional] |
|**moneyReceivedAt** | **OffsetDateTime** | Date and time when the payment was received (ISO-8601 format). |  [optional] |
|**paymentProcessedAt** | **OffsetDateTime** | Date and time when the payment was processed (ISO-8601 format). |  [optional] |
|**isPaidToContractor** | **Boolean** | Indicates whether the invoice was paid to the contractor. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| PAID | &quot;paid&quot; |
| PROCESSING | &quot;processing&quot; |
| CANCELED | &quot;canceled&quot; |
| SKIPPED | &quot;skipped&quot; |
| FAILED | &quot;failed&quot; |
| REFUNDED | &quot;refunded&quot; |



