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
    public void UpdateTenderDescription() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        String newWindowHandle = null;
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

        Set<String> allWindowHandlestest = driver.getWindowHandles();

        for (String windowHandle2 : allWindowHandlestest) {
            if (!windowHandle2.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle2);
            }
        }
        Thread.sleep(3000);
        tenderInformationPanel.getInputElement().clear();
        tenderInformationPanel.enterTextInInput("test");
        tenderInformationPanel.okButton().click();

    }


    @Test
    public void TestUpdateTenderDescription() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);

        String mainWindowHandle = driver.getWindowHandle(); // збереження ідентифікатора поточного вікна

        // Ваш код
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
        tendersPage.switchToNewWindow();

//        WebElement iframeElement = driver.findElement(By.xpath("//frame[@name='browser']"));
//        driver.switchTo().frame(iframeElement);
//        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
//        driver.switchTo().defaultContent();

        WebDriverWait driverWait = new WebDriverWait(driver, 3);

        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//frame[@name='directory']")));
        WebElement frameDirectory = driver.findElement(By.xpath("//frame[@name='directory']"));
        driver.switchTo().frame(frameDirectory);
        tenderInformationPanel.clickOnTenderDescriptionSubTab();
        driver.switchTo().defaultContent();
        // Ваш код

        // Повернутися до попереднього вікна
        tendersPage.switchToNewWindow(mainWindowHandle);

        // Ваш код
        WebElement frameNavigation = driver.findElement(By.xpath("//frame[@name='navigation']"));
        driver.switchTo().frame(frameNavigation);
        tenderInformationPanel.clickOnEditTenderDescriptionButton();

        Set<String> allWindowHandlestest = driver.getWindowHandles();

        for (String windowHandle2 : allWindowHandlestest) {
            if (!windowHandle2.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle2);
            }
        }
        Thread.sleep(3000);
        tenderInformationPanel.getInputElement().clear();
        tenderInformationPanel.enterTextInInput("test");
        tenderInformationPanel.okButton().click();
        // Ваш код

    }
        }
