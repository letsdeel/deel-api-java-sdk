

# CreateEorContractRequestEmployment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Is it a full-time contract or a part-time contract? |  [optional] |
|**state** | **String** | State code of the state/province where the this person will be employed. |  [optional] |
|**country** | **String** | Country code of employment. |  |
|**endDate** | **LocalDate** | End date in ISO-8601 format (YYYY-MM-DD). |  [optional] |
|**holidays** | **BigDecimal** | Enter the number of holidays. Leave this field blank if you are chooseing \&quot;STANDARD\&quot; time_off_type. |  [optional] |
|**startDate** | **LocalDate** | Start date in ISO-8601 format (YYYY-MM-DD). |  |
|**scopeOfWork** | **String** | Scope of work description. |  [optional] |
|**timeOffType** | [**TimeOffTypeEnum**](#TimeOffTypeEnum) | If you want to use standard number of holidays for this employee, choose \&quot;STANDARD\&quot;. If you want to enter a specific number of holidays, choose \&quot;SPECIFIC\&quot; and enter the number of days in the holidays field. |  [optional] |
|**probationPeriod** | **BigDecimal** | Number of probation days. |  [optional] |
|**workVisaRequired** | **Boolean** | Do you require Deel to apply for work visa for this person? |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FULL_TIME | &quot;Full-time&quot; |
| PART_TIME | &quot;Part-time&quot; |



## Enum: TimeOffTypeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| SPECIFIC | &quot;SPECIFIC&quot; |



