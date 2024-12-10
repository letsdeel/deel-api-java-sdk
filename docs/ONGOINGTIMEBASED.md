

# ONGOINGTIMEBASED


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**meta** | [**PAYASYOUGOTIMEBASEDAllOfMeta**](PAYASYOUGOTIMEBASEDAllOfMeta.md) |  |  |
|**title** | **String** | The title of the contract. |  |
|**client** | [**PAYASYOUGOTIMEBASEDAllOfClient**](PAYASYOUGOTIMEBASEDAllOfClient.md) |  |  |
|**worker** | [**PAYASYOUGOTIMEBASEDAllOfWorker**](PAYASYOUGOTIMEBASEDAllOfWorker.md) |  |  [optional] |
|**jobTitle** | [**PAYASYOUGOTIMEBASEDAllOfJobTitle**](PAYASYOUGOTIMEBASEDAllOfJobTitle.md) |  |  |
|**seniority** | [**PAYASYOUGOTIMEBASEDAllOfSeniority**](PAYASYOUGOTIMEBASEDAllOfSeniority.md) |  |  [optional] |
|**stateCode** | **String** | The state or province code. Use country lookup endpoint to retrieve state codes. |  [optional] |
|**externalId** | **String** | External Id. |  [optional] |
|**whoReports** | [**WhoReportsEnum**](#WhoReportsEnum) | Flag to indicate who is supposed to provide regular reports |  [optional] |
|**countryCode** | **String** | Country code. |  [optional] |
|**noticePeriod** | **BigDecimal** | Days before to notice the termination of contract for eather party. |  [optional] |
|**scopeOfWork** | **String** | Describe the work to be performed. |  [optional] |
|**specialClause** | **String** | Enter any special clause you may have. |  [optional] |
|**terminationDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of contract |  |
|**startDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |
|**compensationDetails** | [**PAYASYOUGOTIMEBASEDAllOfCompensationDetails**](PAYASYOUGOTIMEBASEDAllOfCompensationDetails.md) |  |  |



## Enum: WhoReportsEnum

| Name | Value |
|---- | -----|
| BOTH | &quot;both&quot; |
| CLIENT | &quot;client&quot; |
| CONTRACTOR | &quot;contractor&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ONGOING_TIME_BASED | &quot;ongoing_time_based&quot; |



