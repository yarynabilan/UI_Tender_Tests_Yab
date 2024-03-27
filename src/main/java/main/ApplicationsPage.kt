package main

import BasePage
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class ApplicationsPage(driver: WebDriver?) : BasePage(driver) {
    var tenderLink: By = By.xpath("//li[@id='docia_tender']")
    fun tenderLink(): WebElement {
        return driver!!.findElement(tenderLink)
    }

    companion object {
        private const val TITLE = "Applications page"
    }
}
