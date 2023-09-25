package main.tenderInformation;

import main.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

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
        TenderInformationPanel tenderInformationPanel = new TenderInformationPanel(driver);
        tenderInformationPanel.clickOnTenderSettingsSubTab(); // Продовження взаємодії з елементами в фреймі
      driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
        tendersPage.switchToNavigationFrame();
        tenderInformationPanel.clickOnEditTenderSettingsButton();
        //       tendersPage.switchToNewWindow();
        Thread.sleep(3000);

        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandlestest = driver.getWindowHandles();
        for (String windowHandle2 : allWindowHandlestest) {
            if (!windowHandle2.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle2);
            }
        }


        tenderInformationPanel.clickOnAccessDocumentsBySubcontractorDropdown();
        tenderInformationPanel.clickOnlyTenderersMayDownloadDropdownOption();
        tenderInformationPanel.okButton().click();
    }
    @Test
    public void UpdateTenderSettings2() throws InterruptedException {

        TendersPage tendersPage = new TendersPage(driver);

     //   String mainWindowHandle = driver.getWindowHandle(); // збереження ідентифікатора поточного вікна

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
        TenderInformationPanel tenderInformationPanel = new TenderInformationPanel(driver);
        tenderInformationPanel.clickOnTenderSettingsSubTab(); // Продовження взаємодії з елементами в фреймі
        driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
        WebElement frameNavigation = driver.findElement(By.xpath("//frame[@name='navigation']"));
        driver.switchTo().frame(frameNavigation);
        tenderInformationPanel.clickOnEditTenderSettingsButton();
        Set<String> allWindowHandlestest = driver.getWindowHandles();
        for (String windowHandle2 : allWindowHandlestest) {
            if (!windowHandle2.equals(allWindowHandlestest)) {
                driver.switchTo().window(windowHandle2);
            }
        }
        Thread.sleep(3000);
        tenderInformationPanel.clickOnAccessDocumentsBySubcontractorDropdown();
        tenderInformationPanel.clickOnlyTenderersMayDownloadDropdownOption();
        tenderInformationPanel.okButton().click();
    }
}
