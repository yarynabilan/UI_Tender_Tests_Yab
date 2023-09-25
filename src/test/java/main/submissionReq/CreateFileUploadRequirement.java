package main.submissionReq;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.subReq.SubmissionRequirements;
import main.subReq.dataInput.DataInputReq;
import main.subReq.dataInput.FileUploadReq;
import org.testng.annotations.Test;

public class CreateFileUploadRequirement  extends ApplicationsNavigationTest {
    @Test
    public void CreateDataInputRequirement() throws InterruptedException {
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
        submissionRequirements.clickOnFileUploadReqLink();
        FileUploadReq fileUploadReq = new FileUploadReq(driver);
        fileUploadReq.fillInNameOfFileUploadReq("Test File Upload Requirement Name");
        fileUploadReq.fillInDescriptionField("Test Description of File Upload Requirement ");
        fileUploadReq.clickOkButton();
        Thread.sleep(2000);
    }
    }

