package main.tenderInformation;

import main.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DeadlineUpdate extends ApplicationsNavigationTest {

    @Test
    public void UpdateSubmissionDeadline() throws InterruptedException {

        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());


        driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderInformationPanel = new TenderDescription(driver);

        tenderInformationPanel.clickOnDeadlineSubTab();
        driver.switchTo().defaultContent();

        tendersPage.switchToDirectoryFrame();

        tenderInformationPanel.submissionDeadlineHoursInput().clear();
        tenderInformationPanel.changeSubmissionDeadline("13:30");
        tenderInformationPanel.clickSaveButton();
        assertTrue(tenderInformationPanel.saveButton().isEnabled());
        driver.switchTo().defaultContent();


    }

    @Test
    public void UpdateDeadlineForReceivingQuestions() throws NullPointerException {

        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());


        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderInformationPanel = new TenderDescription(driver);

        tenderInformationPanel.clickOnDeadlineSubTab();
        driver.switchTo().defaultContent();

        tendersPage.switchToDirectoryFrame();

        tenderInformationPanel.deadlineForReceivingQuestionsHoursInput().clear();
        tenderInformationPanel.changeDeadlineForReceivingQuestions("12:30");
        tenderInformationPanel.clickSaveButton();
        assertTrue(tenderInformationPanel.saveButton().isEnabled());
        driver.switchTo().defaultContent();
    }

    @Test
    public void UpdateStartDate() throws NullPointerException {

        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());


        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderDescription = new TenderDescription(driver);

        tenderDescription.clickOnDeadlineSubTab();
        driver.switchTo().defaultContent();
        TenderDeadlines tenderDeadlines = new TenderDeadlines(driver);

        tendersPage.switchToDirectoryFrame();
        tenderDeadlines.startDateInput().clear();
        tenderDeadlines.changeStartDate("22.11.2023");
        tenderDeadlines.saveButton().click();
        assertTrue(tenderDescription.saveButton().isEnabled());
        driver.switchTo().defaultContent();
    }


}