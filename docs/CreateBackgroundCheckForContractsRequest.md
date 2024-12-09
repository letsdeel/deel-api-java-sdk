

# CreateBackgroundCheckForContractsRequest

The background check information for a contract. Either `individual_check_ids` or `package_id` must be provided, but not both.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**packageId** | **UUID** | Unique identifier of the package used for the background check. |  [optional] |
|**contractIds** | **List&lt;String&gt;** | List of contract ids. |  |
|**individualCheckIds** | **List&lt;UUID&gt;** | A list of individual check IDs. |  [optional] |



