package main.submissionReq;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.specificationDocuments.FileUpload;
import main.subReq.SubmissionRequirements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import main.subReq.allRequirements.espdRequirementPage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class EspdRequirementTests extends ApplicationsNavigationTest {
    @Test
    public void CreateEspdRequirement() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
        driver.switchTo().defaultContent(); // Якщо потрібно, відключаємося від фреймів
        tendersPage.switchToNavigationFrame();
        SubmissionRequirements submissionRequirements = new SubmissionRequirements(driver);
        submissionRequirements.clickOnCreateSubReqButton();
        Thread.sleep(2000);
        submissionRequirements.switchToNewWindowTest();
        submissionRequirements.clickOnEdpdReqLink();
        espdRequirementPage espdRequirement = new espdRequirementPage(driver);
        espdRequirement.fillInESPDName("Test ESPD Requirement Name");
        espdRequirement.fillInESPDdescriptionField("Test Description of ESPD Requirement ");
        espdRequirement.selectMainAuthorityRadioButton();
        espdRequirement.clickOnOk();
        espdRequirement.clickOnNext();
        espdRequirement.clickOnNext2();
        espdRequirement.clickOnNext3();
        espdRequirement.clickOnSave();
        Thread.sleep(2000);
//        tendersPage.switchToDirectoryFrame();
//        assertTrue(espdRequirement.createdESPD().isDisplayed());
    }

    @Test
    public void testUploadFileFromResources() throws InterruptedException, IOException, AWTException {
            TendersPage tendersPage = new TendersPage(driver);
            tendersPage.switchToBrowserFrame();
            PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
            publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
            driver.switchTo().defaultContent(); // Якщо потрібно, відключаємося від фреймів
            tendersPage.switchToNavigationFrame();
            SubmissionRequirements submissionRequirements = new SubmissionRequirements(driver);
            submissionRequirements.clickOnCreateSubReqButton();
            Thread.sleep(2000);
            submissionRequirements.switchToNewWindowTest();
            submissionRequirements.clickOnEdpdReqLink();
            espdRequirementPage espdRequirementPage = new espdRequirementPage(driver);
            espdRequirementPage.fillInESPDName("Test ESPD Requirement Name");
            espdRequirementPage.fillInESPDdescriptionField("Test Description of ESPD Requirement ");
            espdRequirementPage.selectReuseESPDRadioButton();
          espdRequirementPage.selectMainAuthorityRadioButton();
     //      espdRequirementPage.clickUploadESPDButton();
           espdRequirementPage.uploadFileFromResourcesToProject2();
        Thread.sleep(5000);

       espdRequirementPage.clickUploadOK();
        //     assertTrue(espdRequirementPage.createdESPD().isDisplayed());

}
    }




