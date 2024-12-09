

# ContractSearchFormWithoutCursor

This is a model to make it easier to understand and restrict search parameters

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**limit** | **String** | Return a page of results with given number of records. |  [optional] |
|**orderDirection** | **SortDirEnum** |  |  [optional] |
|**types** | [**ContractSearchFormWithoutCursorTypes**](ContractSearchFormWithoutCursorTypes.md) |  |  [optional] |
|**statuses** | [**ContractSearchFormWithoutCursorStatuses**](ContractSearchFormWithoutCursorStatuses.md) |  |  [optional] |
|**teamId** | **String** | Unique identifier of this resource. |  [optional] |
|**externalId** | **String** | Filter contracts for given external ID |  [optional] |
|**countries** | [**ContractSearchFormWithoutCursorCountries**](ContractSearchFormWithoutCursorCountries.md) |  |  [optional] |
|**currencies** | [**ContractSearchFormWithoutCursorCurrencies**](ContractSearchFormWithoutCursorCurrencies.md) |  |  [optional] |
|**search** | **String** | Include a contract if by name or contractor name contains given search term. |  [optional] |
|**sortBy** | **ContractsSortByEnum** |  |  [optional] |



