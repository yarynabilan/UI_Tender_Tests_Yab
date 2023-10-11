package main.submissionReq;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.subReq.SubmissionRequirements;
import org.testng.annotations.Test;
import main.subReq.allRequirements.espdRequirement;

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
        espdRequirement espdRequirement = new espdRequirement(driver);
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
}
