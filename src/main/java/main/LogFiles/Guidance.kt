package main.LogFiles

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class Guidance(private val driver: WebDriver) {
     val supportIcon: By = By.xpath("//span[text()='Support']/preceding-sibling::img")
     val tenderSupportTitle: By = By.xpath("//h1[@class='hero-title']")

}
