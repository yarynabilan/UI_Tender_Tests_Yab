package main.subReq.allRequirements

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class CopyReqFromPhase(private val driver: WebDriver) {
    private val copyReqFromPhaseLink: By = By.xpath("//span[text()='Copy requirements from phase or round']")
    private val checkBoxOfFileReqToCopy: By = By.xpath("//input[@type='checkbox' and @name='4576']")
    private val copyReqFromPhaseNameInput: By = By.xpath("//input[@type='text' and @value='File Upload']")
    private val copyButton: By = By.xpath("//button[text()='Copy']")

    fun clickCopyReqFromPhaseLink() {
        val copyReqFromPhaseLinkElement = driver.findElement(copyReqFromPhaseLink)
        copyReqFromPhaseLinkElement.click()
    }

    fun checkBoxOfFileReqToCopy() {
        val checkBoxOfFileReqToCopyElement = driver.findElement(checkBoxOfFileReqToCopy)
        checkBoxOfFileReqToCopyElement.click()
    }

    fun fillInCopyReqFromPhaseNameInput(newName: String?) {
        val copyReqFromPhaseNameInputElement = driver.findElement(copyReqFromPhaseNameInput)
        copyReqFromPhaseNameInputElement.clear()
        copyReqFromPhaseNameInputElement.sendKeys(newName)
    }

    fun clickCopyButton() {
        val copyButtonElement = driver.findElement(copyButton)
        copyButtonElement.click()
    }
}
