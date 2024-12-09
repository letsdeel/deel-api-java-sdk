

# CreateInvoiceAdjustmentRequest1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of invoice adjustment. |  |
|**amount** | **BigDecimal** | Amount to be paid. Must be a positive number. |  |
|**contractId** | **String** | Id of a Deel contract. |  |
|**description** | **String** | Description of the adjustment. |  |
|**dateSubmitted** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |
|**paymentCycleId** | **String** | ID of an existing active payment cycle - required if type is \&quot;vat\&quot; |  [optional] |
|**_file** | **File** | Upload the file you want to attach to this entry. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BONUS | &quot;bonus&quot; |
| COMMISSION | &quot;commission&quot; |
| DEDUCTION | &quot;deduction&quot; |
| EXPENSE | &quot;expense&quot; |
| OTHER | &quot;other&quot; |
| OVERTIME | &quot;overtime&quot; |
| TIME_OFF | &quot;time_off&quot; |
| VAT | &quot;vat&quot; |



