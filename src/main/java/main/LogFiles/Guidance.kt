package main.LogFiles

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class Guidance(private val driver: WebDriver) {
    private val supportIcon: By = By.xpath("//span[text()='Support']/preceding-sibling::img")
    private val tenderSupportTitle: By = By.xpath("//h1[@class='hero-title']")
    fun clickSupportIcon() {
        val supportIconElement: WebElement = driver.findElement(supportIcon)
        supportIconElement.click()
    }

    val tenderSupportTitleElement: WebElement
    get() = driver.findElement(tenderSupportTitle)

}
