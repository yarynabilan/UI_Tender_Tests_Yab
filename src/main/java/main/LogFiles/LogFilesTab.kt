package main.LogFiles

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class LogFilesTab(private val driver: WebDriver) {
    private val completeHistoryTab: By = By.xpath("//span[text()='Complete history']")
    private val adminsHistory: By = By.xpath("//span[text()='History of administrators']")
    private val applicantsHistory: By = By.xpath("//span[text()='History of tenderers']")
    private val exportLogButtonLocator: By = By.xpath("//img[@name='export_logfile']")
    private val okButtonLocator: By = By.xpath("//input[@type='submit' and @value='OK']")
    private val logFileLinkLocator: By = By.xpath("//a[@id='filelink']")
    private val navigationFrame: By = By.xpath("//frame[@name='navigation']")

    val logFileLinkElement: WebElement
        get() = driver.findElement(logFileLinkLocator)
    fun switchToNewWindowTest() {
        for (winHandle in driver!!.windowHandles) {
            driver!!.switchTo().window(winHandle)
        }}
    fun switchToNavigationFrame() {
        driver!!.switchTo().frame(driver!!.findElement(navigationFrame))
    }

    fun exportCompleteHistory() {
        driver.findElement(completeHistoryTab).click()
        driver.switchTo().defaultContent()
        switchToNavigationFrame()
        driver.findElement(exportLogButtonLocator).click()
        switchToNewWindowTest()
        driver.findElement(okButtonLocator).click()
    }

    fun exportAdminsHistory() {
        driver.findElement(adminsHistory).click()
        driver.switchTo().defaultContent()
        switchToNavigationFrame()
        driver.findElement(exportLogButtonLocator).click()
        switchToNewWindowTest()
        driver.findElement(okButtonLocator).click()
    }
    fun exportApplicantsHistory() {
        driver.findElement(applicantsHistory).click()
        driver.switchTo().defaultContent()
        switchToNavigationFrame()
        driver.findElement(exportLogButtonLocator).click()
        switchToNewWindowTest()
        driver.findElement(okButtonLocator).click()

    }
}
