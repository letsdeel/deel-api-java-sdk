

# Invoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the invoice. |  |
|**status** | **InvoiceStatusEnum** |  |  |
|**currency** | **String** | Currency code. |  |
|**createdAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**total** | **String** | Total invoice amount including Fee and VAT. |  |
|**amount** | **String** | Billed amount. |  |
|**deelFee** | **String** | Deel fee. |  |
|**label** | **String** | Label of the invoice. |  |
|**paidAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**vatTotal** | **String** | Amount of VAT. |  |
|**vatPercentage** | **String** | VAT percentage. |  |
|**isOverdue** | **Boolean** | Indicates if the invoice is overdue. |  |
|**issuedAt** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**vatId** | **String** | VAT identification number. |  |
|**dueDate** | **OffsetDateTime** | Long date-time format following ISO-8601 |  |
|**contractId** | **String** | Unique identifier of the contract |  |



