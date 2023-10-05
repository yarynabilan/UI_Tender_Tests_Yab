package main.submissionReq;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.subReq.SubmissionRequirements;
import org.testng.annotations.Test;
import main.subReq.allRequirements.espdRequirement;

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
        espdRequirement espdRequirement = new espdRequirement(driver);

        espdRequirement.fillInNameOfFileUploadReq("Test File Upload Requirement Name");
        espdRequirement.fillInDescriptionField("Test Description of File Upload Requirement ");
        espdRequirement.clickOkButton();
        Thread.sleep(2000);
    }
}
