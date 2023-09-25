package main.tenderInformation;

import main.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class TenderInformationUpdate extends ApplicationsNavigationTest {

    @Test
    public void UpdateTenderDescriptionProjectNo() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        tendersPage.switchToDirectoryFrame();
        TenderInformationPanel tenderInformationPanel = new TenderInformationPanel(driver);
        tenderInformationPanel.clickOnTenderDescriptionSubTab();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        tendersPage.switchToNavigationFrame();
        tenderInformationPanel.clickOnEditTenderDescriptionButton();
        tenderInformationPanel.switchToNewWindowTest();
        Thread.sleep(3000);
        tenderInformationPanel.getInputElement().clear();
        tenderInformationPanel.enterTextInInput("test");
        tenderInformationPanel.okButton().click();

    }

}
