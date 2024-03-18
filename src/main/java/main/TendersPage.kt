package main

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class TendersPage(driver: WebDriver?) : BasePage(driver) {
    //   List<WebElement> repositoriesList = driver.findElements(By.xpath("//td[text() = 'AutoTest Public Tender']"));
    private val publicTenderLink: By = By.xpath("//td[text() = 'AutoTest Public Tender']")

    //    private By limitedTenderLink = By.xpath("//td[text() = 'Limited Test rib']");
    //    private By limitedTenderLink = By.xpath("//td[text() = 'Limited 110 Sprint Tender']");
    private val limitedTenderLink: By = By.xpath("//td[text() = 'Limited 112']")
    private val browserFrame: By = By.xpath("//frame[@name='browser']")
    private val functionsFrame: By = By.xpath("//frame[@name='functions']")
    private val navigationFrame: By = By.xpath("//frame[@name='navigation']")
    private val directoryFrame: By = By.xpath("//frame[@name='directory']")
    private val fileDetailsFrame: By = By.xpath("//frame[@name='filespec']")
    fun openPublicTender(): TendersPage {
        driver!!.findElement(limitedTenderLink).click()
        return this
    }

    fun openLimitedTender(): TendersPage {
        driver!!.findElement(limitedTenderLink).click()
        return this
    }

    fun switchToBrowserFrame() {
        driver!!.switchTo().frame(driver!!.findElement(browserFrame))
    }

    fun switchToFunctionsFrame() {
        driver!!.switchTo().frame(driver!!.findElement(functionsFrame))
    }

    fun switchToNavigationFrame() {
        driver!!.switchTo().frame(driver!!.findElement(navigationFrame))
    }

    fun switchToDirectoryFrame() {
        driver!!.switchTo().frame(driver!!.findElement(directoryFrame))
    }

    fun switchToFileDetailsFrame() {
        driver!!.switchTo().frame(driver!!.findElement(fileDetailsFrame))
    }

    fun switchToNewWindow() {
        val mainWindowHandle = driver!!.windowHandle // Зберегти ідентифікатор поточного вікна

        // Знайти ідентифікатор нового вікна
        var newWindowHandle: String? = null
        val allWindowHandles = driver!!.windowHandles
        for (windowHandle in allWindowHandles) {
            if (windowHandle != mainWindowHandle) {
                newWindowHandle = windowHandle
                break
            }
        }

        driver!!.switchTo().window(newWindowHandle)
    }

    fun switchToPreviousWindow() {
        val windowHandles = driver!!.windowHandles

        // Якщо є більше одного вікна, то можна повернутися до попереднього
        if (windowHandles.size > 1) {
            val iterator: Iterator<String> = windowHandles.iterator()
            val currentWindow = iterator.next()
            val previousWindow = iterator.next()

            driver!!.switchTo().window(previousWindow)
        } else {
            println("No previous window")
        }
    }
}


