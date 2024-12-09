

# GetBenefitEmployee200ResponseContractsInnerCompensationsInner

Details about the compensations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rate** | **BigDecimal** | The rate of compensation. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of compensation, either MAIN or VARIABLE. |  [optional] |
|**scale** | **String** | The scale of the compensation. |  [optional] |
|**currency** | **String** | The currency of the compensation. |  [optional] |
|**cycleScale** | **String** | The cycle scale of the compensation. |  [optional] |
|**variableCompensationType** | [**VariableCompensationTypeEnum**](#VariableCompensationTypeEnum) | The type of variable compensation, either FIXED or PERCENTAGE. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MAIN | &quot;MAIN&quot; |
| VARIABLE | &quot;VARIABLE&quot; |



## Enum: VariableCompensationTypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;FIXED&quot; |
| PERCENTAGE | &quot;PERCENTAGE&quot; |



