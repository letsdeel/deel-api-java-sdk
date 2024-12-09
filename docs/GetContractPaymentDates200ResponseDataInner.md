

# GetContractPaymentDates200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier for the payment. |  |
|**due** | **OffsetDateTime** | The date and time when the payment is due. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the payment cycle. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| UPCOMING | &quot;upcoming&quot; |
| AWAITING_PAYMENT | &quot;awaiting_payment&quot; |
| OVERDUE | &quot;overdue&quot; |



