

# HrisDirectEmployeeContract


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractOid** | **String** | The Hris Direct employee contract ID |  |
|**startDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |
|**employeeNumber** | **BigDecimal** |  |  [optional] |
|**endDate** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example 2022-12-31. |  [optional] |
|**employmentType** | [**EmploymentTypeEnum**](#EmploymentTypeEnum) |  |  |
|**partTimePercentage** | **BigDecimal** | required if employmentType is \&quot;PART_TIME\&quot; |  |



## Enum: EmploymentTypeEnum

| Name | Value |
|---- | -----|
| FULL_TIME | &quot;FULL_TIME&quot; |



