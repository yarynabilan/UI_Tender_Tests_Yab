package main.subReq.allRequirements

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class CopyReqFromAnotherTender(private val driver: WebDriver) {
    private val tenderToCopyReqFrom: By = By.xpath("//td[contains(., 'Tender - Copy requirement (for Auto TestProject)')]")
    private val checkBoxOfDataReqToCopy: By = By.xpath("//input[@type='checkbox' and @name='4575']")
    private val copyReqFromAnotherTenderNameInput: By = By.xpath("//input[@type='text' and @value='data input test']")
    private val copyButton: By = By.xpath("//button[text()='Copy']")

    fun selectTenderToCopyReqFrom() {
        val tenderToCopyReqFromElement = driver.findElement(tenderToCopyReqFrom)
        tenderToCopyReqFromElement.click()
    }

    fun checkBoxOfDataReqToCopy() {
        val checkBoxOfDataReqToCopyElement = driver.findElement(checkBoxOfDataReqToCopy)
        checkBoxOfDataReqToCopyElement.click()
    }

    fun fillIncopyReqFromAnotherTenderNameInput(newName: String?) {
        val copyReqFromAnotherTenderNameInputElement = driver.findElement(copyReqFromAnotherTenderNameInput)
        copyReqFromAnotherTenderNameInputElement.clear()
        copyReqFromAnotherTenderNameInputElement.sendKeys(newName)
    }

    fun clickCopyButton() {
        val copyButtonElement = driver.findElement(copyButton)
        copyButtonElement.click()
    }
}

