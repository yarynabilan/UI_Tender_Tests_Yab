package main.LogFiles

import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.Test
import kotlin.test.assertTrue

class LogFilesTest : BaseTest() {

    @Test
    @Throws(InterruptedException::class)
    fun exportCompleteHistory() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.logFilesTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val LogFilesTab = LogFilesTab(driver!!)
        LogFilesTab.exportCompleteHistory()
        val linkElement = WebDriverWait(driver!!, 25).until(ExpectedConditions.visibilityOf(LogFilesTab.logFileLinkElement))
        assertTrue(linkElement.isDisplayed())
}

    @Test
    @Throws(InterruptedException::class)
    fun exportAdminsHistory() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.logFilesTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val LogFilesTab = LogFilesTab(driver!!)
        LogFilesTab.exportAdminsHistory()
        val linkElement = WebDriverWait(driver!!, 25).until(ExpectedConditions.visibilityOf(LogFilesTab.logFileLinkElement))
        assertTrue(linkElement.isDisplayed())
    }
    @Test
    @Throws(InterruptedException::class)
    fun exportApplicantsHistory() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.logFilesTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val LogFilesTab = LogFilesTab(driver!!)
        LogFilesTab.exportApplicantsHistory()
        val linkElement = WebDriverWait(driver!!, 25).until(ExpectedConditions.visibilityOf(LogFilesTab.logFileLinkElement))
        assertTrue(linkElement.isDisplayed())
    }
}
