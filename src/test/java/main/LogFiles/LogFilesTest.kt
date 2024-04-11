package main.LogFiles

import lombok.Getter
import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import kotlin.test.assertTrue
@Getter
class LogFilesTest : ApplicationsNavigationTest() {

    override  var tendersPage: TendersPage? = null
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var logFilesTab: LogFilesTab

    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tendersPage!!.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
        logFilesTab = LogFilesTab(driver)
        publicTenderPage.logFilesTab?.click()
        driver.switchTo().defaultContent()
        tendersPage!!.switchToDirectoryFrame()
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
