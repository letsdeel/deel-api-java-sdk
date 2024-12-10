

# BgCheckForContractToCreate

The background check information for a contract. Either `individual_check_ids` or `package_id` must be provided, but not both.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractIds** | **List&lt;String&gt;** | Please note that this field supports a single contract ID as of now. Support for multiple contract IDs will be added in near future. Please refer to changelog for updates. |  |
|**individualCheckIds** | [**List&lt;IdentifierValueForFilter&gt;**](IdentifierValueForFilter.md) | A list of individual check IDs. |  [optional] |
|**packageId** | [**IdentifierValueForFilter**](IdentifierValueForFilter.md) |  |  [optional] |



