

# ContractSearchForm

Search form should include parameters varied based on usage of cursor for pagination. NOTE: that all query parameters are based on strings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**afterCursor** | **String** | Return next page of results after given cursor. |  [optional] |
|**limit** | **String** | Return a page of results with given number of records. |  [optional] |
|**orderDirection** | **SortDirEnum** |  |  [optional] |
|**types** | [**ContractSearchFormWithoutCursorTypes**](ContractSearchFormWithoutCursorTypes.md) |  |  [optional] |
|**statuses** | [**ContractSearchFormWithoutCursorStatuses**](ContractSearchFormWithoutCursorStatuses.md) |  |  [optional] |
|**teamId** | [**IdentifierValueForFilter**](IdentifierValueForFilter.md) |  |  [optional] |
|**externalId** | **String** | Filter contracts for given external ID |  [optional] |
|**countries** | [**ContractSearchFormWithoutCursorCountries**](ContractSearchFormWithoutCursorCountries.md) |  |  [optional] |
|**currencies** | [**ContractSearchFormWithoutCursorCurrencies**](ContractSearchFormWithoutCursorCurrencies.md) |  |  [optional] |
|**search** | **String** | Include a contract if by name or contractor name contains given search term. |  [optional] |
|**sortBy** | **ContractsSortByEnum** |  |  [optional] |



