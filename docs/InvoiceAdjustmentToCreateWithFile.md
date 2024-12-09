

# InvoiceAdjustmentToCreateWithFile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractId** | **String** | Id of a Deel contract. |  |
|**dateSubmitted** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |
|**type** | **InvoiceAdjustmentTypeToCreateEnum** |  |  |
|**amount** | **BigDecimal** | Amount to be paid. Must be a positive number. |  |
|**description** | **String** | Description of the adjustment. |  |
|**paymentCycleId** | **BigDecimal** | ID of an existing active payment cycle - required if type is \&quot;vat\&quot; |  [optional] |
|**_file** | **File** | Upload the file you want to attach to this entry. |  [optional] |



