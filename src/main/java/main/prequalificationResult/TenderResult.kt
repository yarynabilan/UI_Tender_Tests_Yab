package main.prequalificationResult

import main.specificationDocuments.FileUpload
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import java.io.File

class TenderResult(private val driver: WebDriver) {
    private val registerResultButton: By = By.xpath("//img[@title='Register tender result']")
    private val yabCheckBox: By = By.xpath("(//input[@type='checkbox'])[1]")
    private val commentsField: By = By.xpath("//textarea[@name='comment']")
    private val checkboxForUploadEspd: By = By.xpath("//td[@class='content']/input[@type='checkbox' and @name='allowespddoc']\n")
    private val attachmentInput: By = By.xpath("//input[@type='file']")
    private val removeAttachedFileButton: By = By.xpath("")
    private val accesibleByDropdown: By = By.xpath("")
    private val accessibleToAminsOption: By = By.xpath("")
    private val okButton: By = By.xpath("//input[@type='button' and @value='OK']")

    fun clickOnRegisterResultButton() {
        val registerResultButtonElement: WebElement = driver.findElement(registerResultButton)
        registerResultButtonElement.click()
    }
     fun clickYabCheckBox() {
        val yabCheckBoxElement: WebElement = driver.findElement(yabCheckBox)
        yabCheckBoxElement.click()
    }
     fun enterComments(comment: String) {
        val commentsFieldElement: WebElement = driver.findElement(commentsField)
        commentsFieldElement.sendKeys(comment)
    }
    fun uploadFile(filePath: String) {
        val absolutePath = File(filePath).absolutePath
        val uploadFileElement = driver.findElement(attachmentInput)
        uploadFileElement.sendKeys(absolutePath)
    }
    fun clickOkButton() {
        val okButtonElement: WebElement = driver.findElement(okButton)
        okButtonElement.click()
    }
    fun selectCheckboxForUploadEspd() {
        val checkboxForUploadEspdElement = driver.findElement(checkboxForUploadEspd)
        if (!checkboxForUploadEspdElement.isSelected) {
            checkboxForUploadEspdElement.click()
        }
}
}