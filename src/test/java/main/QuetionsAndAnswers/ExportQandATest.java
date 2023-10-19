package main.QuetionsAndAnswers;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.questionAndAnswers.ExportQandA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Instant;

import static org.testng.Assert.assertTrue;

public class ExportQandATest extends ApplicationsNavigationTest {

    @Test
    public void ExportQandAinWordAll() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        ExportQandA exportQandA = new ExportQandA(driver);
        exportQandA.clickExportQA_button();
        tendersPage.switchToNewWindowTest();
        exportQandA.selectWordFormat();
        exportQandA.selectAll_QA();
        exportQandA.confirmOK();
        Thread.sleep(15000);
//        WebDriverWait driverWait = new WebDriverWait(driver, 16); // Зміна wait для очікування
//        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("docx")));
        assertTrue(exportQandA.link().isDisplayed());

    }
    @Test
    public void ExportQandAinExceldAll() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        ExportQandA exportQandA = new ExportQandA(driver);
        exportQandA.clickExportQA_button();
        tendersPage.switchToNewWindowTest();
        exportQandA.selectExcelFormat();
        exportQandA.selectAll_QA();
        exportQandA.confirmOK();
        Thread.sleep(15000);
        assertTrue(exportQandA.link().isDisplayed());
    }
    @Test
    public void ExportQandAinExceldDrafts() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        ExportQandA exportQandA = new ExportQandA(driver);
        exportQandA.clickExportQA_button();
        tendersPage.switchToNewWindowTest();
        exportQandA.selectExcelFormat();
        exportQandA.selectDrafts();
        exportQandA.confirmOK();
        Thread.sleep(15000);
        assertTrue(exportQandA.link().isDisplayed());
    }  @Test
    public void ExportQandAinExceldUnanswered() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        ExportQandA exportQandA = new ExportQandA(driver);
        exportQandA.clickExportQA_button();
        tendersPage.switchToNewWindowTest();
        exportQandA.selectExcelFormat();
        exportQandA.selectUnanswered();
        exportQandA.confirmOK();
        Thread.sleep(15000);
        assertTrue(exportQandA.link().isDisplayed());
    } @Test
    public void ExportQandAinExceldPublished() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        ExportQandA exportQandA = new ExportQandA(driver);
        exportQandA.clickExportQA_button();
        tendersPage.switchToNewWindowTest();
        exportQandA.selectExcelFormat();
        exportQandA.selectPublished();
        exportQandA.confirmOK();
        Thread.sleep(15000);
        assertTrue(exportQandA.link().isDisplayed());
    }
}