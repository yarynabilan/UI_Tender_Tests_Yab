import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.WebDriverWait

abstract class BasePage(protected var driver: WebDriver?) {
    protected var webDriverWait: WebDriverWait = WebDriverWait(driver ?: throw IllegalArgumentException("WebDriver must not be null"), 3)

    open fun switchToNewWindow(mainWindowHandle: String) {
        driver?.let {
            val allWindowHandles = it.windowHandles
            for (windowHandle in allWindowHandles) {
                if (windowHandle != mainWindowHandle) {
                    it.switchTo().window(windowHandle)
                    break
                }
            }
        }
    }

    fun switchToLastTab() {
        driver?.let {
            val tabs = ArrayList(it.windowHandles)
            try {
                it.switchTo().window(tabs[tabs.size - 1])
            } catch (ex: IndexOutOfBoundsException) {
                throw RuntimeException("Switching to tab is impossible because it doesn't exist.")
            }
        }
    }

    fun switchToFrame(frameElement: WebElement?) {
        driver?.switchTo()?.frame(frameElement)
    }

    fun switchToParentFrame() {
        driver?.switchTo()?.parentFrame()
    }

    fun switchToNewWindowTest() {
        driver?.let {
            for (winHandle in it.windowHandles) {
                it.switchTo().window(winHandle)
            }
        }
    }
}


