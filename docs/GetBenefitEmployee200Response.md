

# GetBenefitEmployee200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the employee. |  [optional] |
|**phones** | [**List&lt;GetBenefitEmployee200ResponsePhonesInner&gt;**](GetBenefitEmployee200ResponsePhonesInner.md) | List of phone numbers associated with the employee. |  [optional] |
|**status** | **String** | The employee status given his contracts. |  [optional] |
|**addresses** | [**List&lt;GetBenefitEmployee200ResponseAddressesInner&gt;**](GetBenefitEmployee200ResponseAddressesInner.md) | List of addresses associated with the employee. |  [optional] |
|**contracts** | [**List&lt;GetBenefitEmployee200ResponseContractsInner&gt;**](GetBenefitEmployee200ResponseContractsInner.md) | List of contracts associated with the employee. |  [optional] |
|**hireDate** | **String** | Employee date of first contract. |  [optional] |
|**workEmail** | **String** | Employee work email address. |  [optional] |
|**dateOfBirth** | **String** | Employee date of birth. |  [optional] |
|**maritalStatus** | [**MaritalStatusEnum**](#MaritalStatusEnum) | The marital status of the employee. |  [optional] |
|**personalEmail** | **String** | Employee personal email address. |  [optional] |
|**documentNumber** | **String** | Document number of employee identification document. |  [optional] |
|**legalLastName** | **String** | Employee legal last name. |  [optional] |
|**legalFirstName** | **String** | Employee legal first name. |  [optional] |
|**legalMiddleName** | **String** | Employee legal middle name. |  [optional] |
|**takesOwnersDraw** | **Boolean** | Indicates if the employee takes an owner draw. |  [optional] |
|**ownershipPercentage** | **BigDecimal** | The percentage of business ownership by the employee. |  [optional] |



## Enum: MaritalStatusEnum

| Name | Value |
|---- | -----|
| COMMON_LAW | &quot;Common Law&quot; |
| DIVORCED | &quot;Divorced&quot; |
| MARRIED | &quot;Married&quot; |
| REGISTERED_PARTNERSHIP | &quot;Registered Partnership&quot; |
| SEPARATED | &quot;Separated&quot; |
| SINGLE | &quot;Single&quot; |
| WIDOWED | &quot;Widowed&quot; |



