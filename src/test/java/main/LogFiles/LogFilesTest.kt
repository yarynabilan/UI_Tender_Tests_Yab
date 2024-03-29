package main.LogFiles

import lombok.Getter
import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import kotlin.test.assertTrue
@Getter
class LogFilesTest : BaseTest() {

    private lateinit var tendersPage: TendersPage
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var logFilesTab: LogFilesTab

    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        publicTenderPage = PublicTenderPage(driver)
        logFilesTab = LogFilesTab(driver)
        tendersPage.switchToBrowserFrame()
        publicTenderPage.clickOnElement(publicTenderPage.logFilesTab)
        driver.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
    }
    @Test
    fun exportCompleteHistory() {
        logFilesTab.exportCompleteHistory()
        val linkElement = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(logFilesTab.logFileLinkElement))
        assertTrue(linkElement.isDisplayed) }
    @Test
    fun exportAdminsHistory() {
        logFilesTab.exportAdminsHistory()
        val linkElement = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(logFilesTab.logFileLinkElement))
        assertTrue(linkElement.isDisplayed) }
    @Test
    fun exportApplicantsHistory() {
        logFilesTab.exportApplicantsHistory()
        val linkElement = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(logFilesTab.logFileLinkElement))
        assertTrue(linkElement.isDisplayed) }
}
