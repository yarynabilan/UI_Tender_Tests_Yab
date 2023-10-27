package main.submissionReq;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.subReq.SubmissionRequirements;
import main.subReq.allRequirements.CopyReqFromPhase;
import main.subReq.allRequirements.FileUploadReq;
import org.testng.annotations.Test;

    public class CopyReqFromPhaseTests extends ApplicationsNavigationTest{
            @Test
    public void CopyFileUploadReqFromRound() throws InterruptedException {
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
        submissionRequirements.clickOnCopyReqFromPhaseOrRoundLink();
        CopyReqFromPhase copyReqFromPhase = new CopyReqFromPhase(driver);
        copyReqFromPhase.checkBoxOfFileReqToCopy();
        copyReqFromPhase.fillInCopyReqFromPhaseNameInput("Copied From Round File Upload");
        copyReqFromPhase.clickCopyButton();
    }
}