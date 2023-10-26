package main.submissionReq;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.subReq.SubmissionRequirements;
import main.subReq.allRequirements.CopyReqFromAnotherTender;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CopyReqFromAnotherTenderTest extends ApplicationsNavigationTest {

    @Test
    public void CopyDataReqFromAnotherTender() throws InterruptedException {
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
        submissionRequirements.clickOncopyReqFromAnotherTenderLink();
        CopyReqFromAnotherTender copyReqFromAnotherTender = new CopyReqFromAnotherTender(driver);
        copyReqFromAnotherTender.selectTenderToCopyReqFrom();
        copyReqFromAnotherTender.checkBoxOfDataReqToCopy();
        copyReqFromAnotherTender.fillIncopyReqFromAnotherTenderNameInput("Copied from Another Tender Test Data InputReq");
        copyReqFromAnotherTender.clickCopyButton();
    }
}
