package main.QuetionsAndAnswers

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.questionAndAnswers.ExportQandA
import org.testng.Assert
import org.testng.annotations.Test

class ExportQandATest : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class)
    fun ExportQandAinWordAll() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()

        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val exportQandA = ExportQandA(driver!!)
        exportQandA.clickExportQA_button()
        tendersPage.switchToNewWindowTest()
        exportQandA.selectWordFormat()
        exportQandA.selectAll_QA()
        exportQandA.confirmOK()
        Thread.sleep(15000)
        //        WebDriverWait driverWait = new WebDriverWait(driver, 16); // Зміна wait для очікування
//        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("docx")));
        Assert.assertTrue(exportQandA.link().isDisplayed)
    }

    @Test
    @Throws(InterruptedException::class)
    fun ExportQandAinExceldAll() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val exportQandA = ExportQandA(driver!!)
        exportQandA.clickExportQA_button()
        tendersPage.switchToNewWindowTest()
        exportQandA.selectExcelFormat()
        exportQandA.selectAll_QA()
        exportQandA.confirmOK()
        Thread.sleep(15000)
        Assert.assertTrue(exportQandA.link().isDisplayed)
    }

    @Test
    @Throws(InterruptedException::class)
    fun ExportQandAinExceldDrafts() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val exportQandA = ExportQandA(driver!!)
        exportQandA.clickExportQA_button()
        tendersPage.switchToNewWindowTest()
        exportQandA.selectExcelFormat()
        exportQandA.selectDrafts()
        exportQandA.confirmOK()
        Thread.sleep(15000)
        Assert.assertTrue(exportQandA.link().isDisplayed)
    }

    @Test
    @Throws(InterruptedException::class)
    fun ExportQandAinExceldUnanswered() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val exportQandA = ExportQandA(driver!!)
        exportQandA.clickExportQA_button()
        tendersPage.switchToNewWindowTest()
        exportQandA.selectExcelFormat()
        exportQandA.selectUnanswered()
        exportQandA.confirmOK()
        Thread.sleep(15000)
        Assert.assertTrue(exportQandA.link().isDisplayed)
    }

    @Test
    @Throws(InterruptedException::class)
    fun ExportQandAinExceldPublished() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val exportQandA = ExportQandA(driver!!)
        exportQandA.clickExportQA_button()
        tendersPage.switchToNewWindowTest()
        exportQandA.selectExcelFormat()
        exportQandA.selectPublished()
        exportQandA.confirmOK()
        Thread.sleep(15000)
        Assert.assertTrue(exportQandA.link().isDisplayed)
    }
}