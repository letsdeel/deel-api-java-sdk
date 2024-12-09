

# CreateTimesheetRequest

Details of the timesheet to create. Both a client or a contractor may create a timesheet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quantity** | **BigDecimal** | This is based on the scale of work statement of the associated contract |  |
|**contractId** | **String** | Id of a Deel contract. |  |
|**description** | **String** |  |  |
|**dateSubmitted** | **LocalDate** | Short date in format ISO-8601 (YYYY-MM-DD). For example: 2022-12-31. |  |



