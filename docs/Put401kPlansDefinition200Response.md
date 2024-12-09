

# Put401kPlansDefinition200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the 401K plan. |  |
|**name** | **String** | Name of the 401K plan. |  |
|**details** | [**Put401kPlansDefinitionRequestDetails**](Put401kPlansDefinitionRequestDetails.md) |  |  [optional] |
|**startDate** | **LocalDate** | Start date of the plan. |  |
|**contributionType** | [**ContributionTypeEnum**](#ContributionTypeEnum) | Type of contribution for the 401K plan. |  |
|**contributionValue** | **BigDecimal** | Value of the contribution if type is percent or amount. |  [optional] |
|**contributionValueForMatchRate** | [**List&lt;Put401kPlansDefinitionRequestContributionValueForMatchRateInner&gt;**](Put401kPlansDefinitionRequestContributionValueForMatchRateInner.md) | Array of objects containing limits and rates for match rate contribution type. |  [optional] |



## Enum: ContributionTypeEnum

| Name | Value |
|---- | -----|
| PERCENTAGE | &quot;PERCENTAGE&quot; |
| FIXED_AMOUNT | &quot;FIXED_AMOUNT&quot; |
| MATCH | &quot;MATCH&quot; |



