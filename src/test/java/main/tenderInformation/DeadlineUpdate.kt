package main.tenderInformation;

import main.*;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class DeadlineUpdate extends ApplicationsNavigationTest {

    @Test
    public void UpdateDeadlinesDates() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderInformationPanel = new TenderDescription(driver);
        tenderInformationPanel.clickOnDeadlineSubTab();
        driver.switchTo().defaultContent();
        TenderDeadlines tenderDeadlines = new TenderDeadlines(driver);
        tendersPage.switchToDirectoryFrame();
        tenderDeadlines.submissionDeadlineDateInput().clear();
        tenderDeadlines.changeSubmissionDeadlineDate("01.01.2025");
        tenderDeadlines.deadlineForReceivingQuestionsDateInput().clear();
        tenderDeadlines.changeDateOfReceivingQuestions("01.01.2025");
        Thread.sleep(2000);
        tenderDeadlines.clickSaveButton();
        driver.switchTo().defaultContent();
    }

    @Test
    public void UpdateDeadlineForReceivingQuestionsHours() throws NullPointerException {
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
        tenderDeadlines.changeStartDate("01.01.2024");
        tenderDeadlines.clickSaveButton();
        String expectedText = "01.01.2024";
        String actualText = tenderDeadlines.startDateInput().getAttribute("value");
        assertEquals(expectedText, actualText);
        driver.switchTo().defaultContent();
    }
    @Test
    public void UpdateStartDateHours() throws NullPointerException, InterruptedException {
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
        tenderDeadlines.startDateHoursInput().clear();
        tenderDeadlines.changeStartDateHours("09:00");
        tenderDeadlines.clickSaveButton();
        String expectedText = "09:00";
        String actualText = tenderDeadlines.startDateHoursInput().getAttribute("value");
        assertEquals(expectedText, actualText);
        driver.switchTo().defaultContent();
    }
 @Test
    public void UpdateStartDateBack() throws NullPointerException, InterruptedException {
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
     tenderDeadlines.changeStartDate("01.01.2020");
     Thread.sleep(2000);
     tenderDeadlines.clickSaveButton();
     Thread.sleep(2000);
     Alert alert = driver.switchTo().alert();
     String alertText = alert.getText();
     String expectedText = "The chosen date cannot be in the past.";
     if (alertText.equals(expectedText)) {
         alert.accept();}
     driver.switchTo().defaultContent();
    }
}