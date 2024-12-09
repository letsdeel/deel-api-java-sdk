

# RequestTerminationRequestDataSeveranceOneOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of severance, either in time off. |  |
|**amount** | **BigDecimal** | The amount of severance, specified in the designated currency or time unit. |  |
|**currency** | **String** | Currency code for severance. |  |
|**timeUnit** | [**TimeUnitEnum**](#TimeUnitEnum) | The unit of time for severance (e.g., DAYS, WEEKS, MONTHS). |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TIME | &quot;TIME&quot; |



## Enum: TimeUnitEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;DAYS&quot; |
| WEEKS | &quot;WEEKS&quot; |
| MONTHS | &quot;MONTHS&quot; |



