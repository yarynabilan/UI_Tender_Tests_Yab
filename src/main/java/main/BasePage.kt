package main

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait

abstract class BasePage(@JvmField protected var driver: WebDriver?) {
    protected var webDriverWait: WebDriverWait = WebDriverWait(driver, 3)

    open fun switchToNewWindow(mainWindowHandle: String) {
        val allWindowHandles = driver!!.windowHandles
        for (windowHandle in allWindowHandles) {
            if (windowHandle != mainWindowHandle) {
                driver!!.switchTo().window(windowHandle)
                break
            }
        }
    }

    fun switchToLastTab() {
        val tabs = ArrayList(driver!!.windowHandles)
        try {
            driver!!.switchTo().window(tabs[tabs.size - 1])
        } catch (ex: IndexOutOfBoundsException) {
            throw RuntimeException("Switching to tab is impossible because it doesn't exist.")
        }
    }

    fun switchToFrame(frameElement: WebElement?) {
        driver!!.switchTo().frame(frameElement)
    }

    fun switchToParentFrame() {
        driver!!.switchTo().parentFrame()
    }

    public fun switchToNewWindowTest() {
        for (winHandle in driver!!.windowHandles) {
            driver!!.switchTo().window(winHandle)
        }
    }
}
