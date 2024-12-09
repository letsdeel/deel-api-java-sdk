

# Post401kEnrollmentsDefinition200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Enrollment id. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the contribution for 401k. |  [optional] |
|**details** | [**Get401kEnrollmentsDefinition200ResponseInnerDetails**](Get401kEnrollmentsDefinition200ResponseInnerDetails.md) |  |  [optional] |
|**contributionType** | [**ContributionTypeEnum**](#ContributionTypeEnum) | Type of contribution. |  [optional] |
|**contributionLimit** | **BigDecimal** | Maximum limit of contribution. |  [optional] |
|**contributionValue** | **BigDecimal** | Value of the contribution. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ROTH | &quot;ROTH&quot; |
| TRAD | &quot;TRAD&quot; |
| LOAN | &quot;LOAN&quot; |
| NEC | &quot;NEC&quot; |



## Enum: ContributionTypeEnum

| Name | Value |
|---- | -----|
| PERCENTAGE | &quot;PERCENTAGE&quot; |
| FIXED_AMOUNT | &quot;FIXED_AMOUNT&quot; |



