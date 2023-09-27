package main.tenderInformation;

import main.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TenderSettingsUpdate extends ApplicationsNavigationTest {

    @Test
    public void UpdateTenderSettings() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
// Знову "прив'язка" вебдрайвера до поточного потоку
        WebDriverWait driverWait = new WebDriverWait(driver, 3); // Зміна wait для очікування
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//frame[@name='directory']")));
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderInformationPanel = new TenderDescription(driver);
        tenderInformationPanel.clickOnTenderSettingsSubTab(); // Продовження взаємодії з елементами в фреймі
      driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
        tendersPage.switchToNavigationFrame();
        tenderInformationPanel.clickOnEditTenderSettingsButton();
        Thread.sleep(3000);

      tenderInformationPanel.switchToNewWindowTest();
        tenderInformationPanel.clickOnAccessDocumentsBySubcontractorDropdown();
        tenderInformationPanel.clickOnlyTenderersMayDownloadDropdownOption();
        tenderInformationPanel.okButton().click();
    }
    @Test
    public void UpdateTenderSettings2() throws InterruptedException {

        TendersPage tendersPage = new TendersPage(driver);

        WebElement iframeElement = driver.findElement(By.xpath("//frame[@name='browser']"));
        driver.switchTo().frame(iframeElement);
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
// Знову "прив'язка" вебдрайвера до поточного потоку
        WebDriverWait driverWait = new WebDriverWait(driver, 3); // Зміна wait для очікування
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//frame[@name='directory']")));
        WebElement frameDirectory = driver.findElement(By.xpath("//frame[@name='directory']"));
        driver.switchTo().frame(frameDirectory);
        TenderDescription tenderDescription = new TenderDescription(driver);
        tenderDescription.clickOnTenderSettingsSubTab(); // Продовження взаємодії з елементами в фреймі
        driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
        WebElement frameNavigation = driver.findElement(By.xpath("//frame[@name='navigation']"));
        driver.switchTo().frame(frameNavigation);
        tenderDescription.clickOnEditTenderSettingsButton();
        tenderDescription.switchToNewWindowTest();
        Thread.sleep(3000);
        tenderDescription.clickOnAccessDocumentsBySubcontractorDropdown();
        tenderDescription.clickOnlyTenderersMayDownloadDropdownOption();
        tenderDescription.okButton().click();
    }
}
