package main.submissionReq;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.subReq.SubmissionRequirements;
import main.subReq.allRequirements.FileUploadReq;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FileUploadRequirement extends ApplicationsNavigationTest {
    @Test
    public void CreateFileUploadRequirement() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        SubmissionRequirements submissionRequirements = new SubmissionRequirements(driver);
        submissionRequirements.clickOnCreateSubReqButton();
        Thread.sleep(2000);
        submissionRequirements.switchToNewWindowTest();
        submissionRequirements.clickOnFileUploadReqLink();
        FileUploadReq fileUploadReq = new FileUploadReq(driver);
        fileUploadReq.fillInNameOfFileUploadReq("Test File Upload Requirement Name");
        fileUploadReq.fillInDescriptionField("Test Description of File Upload Requirement ");
        fileUploadReq.clickOkButton();
        Thread.sleep(2000);
    }
    @Test
    public void CreateToDeleteFileUploadRequirement() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        SubmissionRequirements submissionRequirements = new SubmissionRequirements(driver);
        submissionRequirements.clickOnCreateSubReqButton();
        Thread.sleep(2000);
        submissionRequirements.switchToNewWindowTest();
        submissionRequirements.clickOnFileUploadReqLink();
        FileUploadReq fileUploadReq = new FileUploadReq(driver);
        fileUploadReq.fillInNameOfFileUploadReq("To Delete Test File Upload Requirement");
        fileUploadReq.fillInDescriptionField("Test Description of File Upload Requirement to Delete ");
        fileUploadReq.clickOkButton();

    }
    @Test
    public void EditFileUploadRequirement() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        SubmissionRequirements submissionRequirements = new SubmissionRequirements(driver);
        FileUploadReq fileUploadReq = new FileUploadReq(driver);
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();

        fileUploadReq.selectFileUpload();
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        submissionRequirements.clickOnEditSubReqButton();

        submissionRequirements.switchToNewWindowTest();
        fileUploadReq.selectCheckboxDoc();
        fileUploadReq.selectCheckboxDocx();
        fileUploadReq.selectCheckboxXls();
        fileUploadReq.selectCheckboxXlsx();
        fileUploadReq.selectCheckboxPpt();
        fileUploadReq.selectCheckboxPptx();
        fileUploadReq.selectCheckboxPdf();
        fileUploadReq.selectCheckboxPng();
        submissionRequirements.clickOnOkButton();

    }
    @Test
    public void DeleteFileUploadRequirement() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        SubmissionRequirements submissionRequirements = new SubmissionRequirements(driver);
        FileUploadReq fileUploadReq = new FileUploadReq(driver);
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        fileUploadReq.selectFileUploadReqToDelete();
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        submissionRequirements.clickOnDeleteSubReqButton();
        submissionRequirements.switchToNewWindowTest();
        fileUploadReq.confirmDeletion();
    }

}
