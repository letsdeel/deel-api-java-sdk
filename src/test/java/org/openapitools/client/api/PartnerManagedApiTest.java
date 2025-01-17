/*
 * Deel REST API
 * Deel REST API
 *
 * The version of the OpenAPI document: 1.25.0
 * Contact: apiteam@deel.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AdditionalEORInfoContainer;
import org.openapitools.client.model.ApiErrorContainer;
import org.openapitools.client.model.BankAccountAddedContainer;
import org.openapitools.client.model.BankAccountGuideContainer;
import org.openapitools.client.model.BankAccountToAddContainer;
import java.math.BigDecimal;
import org.openapitools.client.model.EmployeeAgreementDownloadContainer;
import org.openapitools.client.model.EmployeeContractSignatureToCreateContainer;
import org.openapitools.client.model.EmployeePayslipsListContainer;
import org.openapitools.client.model.EmployeeTaxDocumentsListContainer;
import java.io.File;
import org.openapitools.client.model.GenericResultCreated;
import org.openapitools.client.model.GenericResultUpdated;
import org.openapitools.client.model.GetEmployeeComplianceDocumentTemplateDownloadLinkContainer;
import org.openapitools.client.model.GetEmployeeComplianceDocumentsContainer;
import org.openapitools.client.model.HrVerificationLettersAndDocumentsListContainer;
import org.openapitools.client.model.RequestCustomVerificationLetterContainer;
import org.openapitools.client.model.RequestCustomVerificationLetterWithFile;
import org.openapitools.client.model.UploadEmployeeComplianceDocumentContainer;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PartnerManagedApi
 */
@Disabled
public class PartnerManagedApiTest {

    private final PartnerManagedApi api = new PartnerManagedApi();

    /**
     * Add bank account
     *
     * Add bank account for an EOR employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addBankAccountTest() throws ApiException {
        String employeeId = null;
        BankAccountToAddContainer bankAccountToAddContainer = null;
        BankAccountAddedContainer response = api.addBankAccount(employeeId, bankAccountToAddContainer)
                .execute();
        // TODO: test validations
    }

    /**
     * Add additional information
     *
     * Add additional information for an EOR employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEmployeeAdditionalInformationTest() throws ApiException {
        String employeeId = null;
        String contractId = null;
        AdditionalEORInfoContainer additionalEORInfoContainer = null;
        GenericResultUpdated response = api.addEmployeeAdditionalInformation(employeeId, contractId, additionalEORInfoContainer)
                .execute();
        // TODO: test validations
    }

    /**
     * Download HR verification letters and documents
     *
     * Retrieve URL to download HR verification letters and documents.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadHrVerificationLettersAndDocumentsTest() throws ApiException {
        String employeeId = null;
        String contractId = null;
        BigDecimal documentId = null;
        EmployeeAgreementDownloadContainer response = api.downloadHrVerificationLettersAndDocuments(employeeId, contractId, documentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Bank account form
     *
     * Retrieve bank account form guide for an EOR employee. This data can be used to add a new bank account for an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBankAccountGuideTest() throws ApiException {
        String employeeId = null;
        BankAccountGuideContainer response = api.getBankAccountGuide(employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Download employee agreement PDF
     *
     * Get link to download the employee agreement PDF.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeAgreementDownloadLinkTest() throws ApiException {
        String employeeId = null;
        String contractId = null;
        EmployeeAgreementDownloadContainer response = api.getEmployeeAgreementDownloadLink(employeeId, contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Preview employee agreement
     *
     * Retrieve an EOR Employee Agreement content in HTML.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeAgreementPreviewTest() throws ApiException {
        String employeeId = null;
        String contractId = null;
        String response = api.getEmployeeAgreementPreview(employeeId, contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Download employee compliance document template
     *
     * Get the download link for an employee compliance document template, if it exists.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeComplianceDocumentTemplateTest() throws ApiException {
        String employeeId = null;
        BigDecimal documentId = null;
        GetEmployeeComplianceDocumentTemplateDownloadLinkContainer response = api.getEmployeeComplianceDocumentTemplate(employeeId, documentId)
                .execute();
        // TODO: test validations
    }

    /**
     * List of employee compliance documents
     *
     * Get a list of employee compliance documents.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeComplianceDocumentsTest() throws ApiException {
        String employeeId = null;
        GetEmployeeComplianceDocumentsContainer response = api.getEmployeeComplianceDocuments(employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get list of payslips for an EOR employee
     *
     * Get list of payslips for an EOR employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeePayslipsTest() throws ApiException {
        String employeeId = null;
        EmployeePayslipsListContainer response = api.getEmployeePayslips(employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * List of tax documents for an employee
     *
     * Get list of tax documents for an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeTaxDocumentsTest() throws ApiException {
        String employeeId = null;
        EmployeeTaxDocumentsListContainer response = api.getEmployeeTaxDocuments(employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * List HR verification letters and documents
     *
     * List all HR verification letters and documents available.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHrVerificationLettersAndDocumentsTest() throws ApiException {
        String employeeId = null;
        String contractId = null;
        HrVerificationLettersAndDocumentsListContainer response = api.getHrVerificationLettersAndDocuments(employeeId, contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Preview job offer letter
     *
     * Retrieve an EOR job offer letter in HTML. This endpoint does not support IC and Global Payroll contract types.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOfferLetterPreviewTest() throws ApiException {
        String employeeId = null;
        String contractId = null;
        String response = api.getOfferLetterPreview(employeeId, contractId)
                .execute();
        // TODO: test validations
    }

    /**
     * Modify bank account for an EOR employee
     *
     * Modify bank account for an EOR employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchBankAccountTest() throws ApiException {
        String employeeId = null;
        String bankId = null;
        BankAccountToAddContainer bankAccountToAddContainer = null;
        BankAccountAddedContainer response = api.patchBankAccount(employeeId, bankId, bankAccountToAddContainer)
                .execute();
        // TODO: test validations
    }

    /**
     * Request custom verification letter
     *
     * Request employment verification letters, visa support, bank verification and more.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void requestCustomVerificationLetterTest() throws ApiException {
        String employeeId = null;
        String contractId = null;
        RequestCustomVerificationLetterContainer requestCustomVerificationLetterContainer = null;
        GenericResultCreated response = api.requestCustomVerificationLetter(employeeId, contractId, requestCustomVerificationLetterContainer)
                .execute();
        // TODO: test validations
    }

    /**
     * Sign a contract
     *
     * Sign a contract as a employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signEmployeeContractTest() throws ApiException {
        String employeeId = null;
        String contractId = null;
        EmployeeContractSignatureToCreateContainer employeeContractSignatureToCreateContainer = null;
        GenericResultCreated response = api.signEmployeeContract(employeeId, contractId, employeeContractSignatureToCreateContainer)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload employee compliance document
     *
     * Upload an employee compliance document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadEmployeeComplianceDocumentTest() throws ApiException {
        String employeeId = null;
        BigDecimal documentId = null;
        File _file = null;
        UploadEmployeeComplianceDocumentContainer response = api.uploadEmployeeComplianceDocument(employeeId, documentId, _file)
                .execute();
        // TODO: test validations
    }

}
