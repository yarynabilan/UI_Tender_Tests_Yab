package main.tenderInformation;

import main.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class DeadlineUpdate extends ApplicationsNavigationTest {

    @Test
    public void UpdateTenderDescription() throws InterruptedException {

        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());


        driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
        tendersPage.switchToDirectoryFrame();
        TenderInformationPanel tenderInformationPanel = new TenderInformationPanel(driver);

        tenderInformationPanel.clickOnDeadlineSubTab();
        driver.switchTo().defaultContent();

        tendersPage.switchToDirectoryFrame();

       tenderInformationPanel.submissionDeadlineInput().clear();
       tenderInformationPanel.changeSubmissionDeadline("13:30");
        tenderInformationPanel.clickSaveButton();
        assertTrue(tenderInformationPanel.saveButton().isEnabled());
        driver.switchTo().defaultContent();


    }
}
