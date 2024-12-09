

# Get401kEnrollmentsDefinition200ResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Enrollment id. |  [optional] |
|**details** | [**Get401kEnrollmentsDefinition200ResponseInnerDetails**](Get401kEnrollmentsDefinition200ResponseInnerDetails.md) |  |  [optional] |
|**contributionType** | [**ContributionTypeEnum**](#ContributionTypeEnum) | Type of contribution. |  [optional] |
|**contributionLimit** | **BigDecimal** | Maximum limit of contribution. |  [optional] |
|**contributionValue** | **BigDecimal** | Value of the contribution. |  [optional] |
|**contribution401kType** | [**Contribution401kTypeEnum**](#Contribution401kTypeEnum) | Type of the contribution for 401k. |  [optional] |



## Enum: ContributionTypeEnum

| Name | Value |
|---- | -----|
| PERCENTAGE | &quot;PERCENTAGE&quot; |
| FIXED_AMOUNT | &quot;FIXED_AMOUNT&quot; |



## Enum: Contribution401kTypeEnum

| Name | Value |
|---- | -----|
| ROTH | &quot;ROTH&quot; |
| TRAD | &quot;TRAD&quot; |
| LOAN | &quot;LOAN&quot; |
| NEC | &quot;NEC&quot; |



