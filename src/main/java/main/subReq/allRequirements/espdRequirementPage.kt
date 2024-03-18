package main.subReq.allRequirements

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import java.awt.AWTException
import java.io.File

class espdRequirementPage(private val driver: WebDriver) {
    private val ESPDnameInput: By = By.xpath("//input[@class='contentNormal' and @type='text' and @name='name']")
    private val ESPDdescriptionFiled: By = By.xpath("//textarea[@class='contentNormal' and @name='description']")
    private val mainAuthorityRadioButton: By = By.xpath("//input[@type='radio' and @name='agent' and @value='ca']")
    private val nextButton: By = By.xpath("//span[@id='button-1108-btnInnerEl']")
    private val nextButton2: By = By.xpath("//span[@id='button-1218-btnInnerEl']")
    private val nextButton3: By = By.xpath("//span[@id='button-1372-btnInnerEl']")
    private val saveButton: By = By.xpath("//span[@id='espdsavebutton-btnInnerEl']")
    private val okButton: By = By.xpath("//input[@name='x' and @value='OK']")
    private val reuseESPDRadioButton: By = By.xpath("//input[@value='1']")
    private val uploadESPDButton: By = By.xpath("//span[text()='Upload ESPD Request']")
    private val fileUploadButtonLocator: By = By.xpath("//span[text()='Upload ESPD Request']")
    private val fileInput: By = By.xpath("//input[@type='file' and @name='file1']")
    private val createdESPD: By = By.xpath("//img[@src='/images/info/large_tender_datamandatory.png' and @title='Test ESPD Requirement Name']")
    private val confirmUpload: By = By.xpath("//input[@name='x']")

    fun fillInESPDName(espdName: String?) {
        val espdNameInput: WebElement = driver.findElement(ESPDnameInput)
        espdNameInput.clear()
        espdNameInput.sendKeys(espdName)
    }

    fun fillInESPDdescriptionField(descriptionText: String?) {
        val descriptionFiled: WebElement = driver.findElement(ESPDdescriptionFiled)
        descriptionFiled.clear()
        descriptionFiled.sendKeys(descriptionText)
    }

    fun selectMainAuthorityRadioButton() {
        val mainAuthorityRadioButton: WebElement = driver.findElement(this.mainAuthorityRadioButton)
        if (!mainAuthorityRadioButton.isSelected) {
            mainAuthorityRadioButton.click()
        }
    }

    fun clickOnOk() {
        val okButton: WebElement = driver.findElement(this.okButton)
        okButton.click()
    }

    fun clickUploadOK() {
        val confirmUploadButton: WebElement = driver.findElement(confirmUpload)
        confirmUploadButton.click()
    }

    fun clickOnNext() {
        val nextButton: WebElement = driver.findElement(this.nextButton)
        nextButton.click()
    }

    fun clickOnNext2() {
        val nextButton2: WebElement = driver.findElement(this.nextButton2)
        nextButton2.click()
    }

    fun clickOnNext3() {
        val nextButton3: WebElement = driver.findElement(this.nextButton3)
        nextButton3.click()
    }

    fun clickOnSave() {
        val saveButton: WebElement = driver.findElement(this.saveButton)
        saveButton.click()
    }

    fun selectReuseESPDRadioButton() {
        val radioButton: WebElement = driver.findElement(reuseESPDRadioButton)
        radioButton.click()
    }

    fun clickUploadESPDButton() {
        val uploadEspdElement: WebElement = driver.findElement(uploadESPDButton)
        uploadEspdElement.click()
    }

    @Throws(AWTException::class)
    fun uploadFileFromResourcesToProject(fileName: String) {
        val projectPath = System.getProperty("user.dir")
        val filePath = "$projectPath/src/main/resources/$fileName"
        val fileUploadButtonElement: WebElement = driver.findElement(fileUploadButtonLocator)
        fileUploadButtonElement.sendKeys(filePath)
    }

    @Throws(AWTException::class)
    fun uploadFileFromResourcesToProject2() {
        val uploadFile = File("src/main/resources/espd_request.xml")
        val fileInput: WebElement = driver.findElement(fileInput)
        fileInput.sendKeys(uploadFile.absolutePath)
    }

    fun createdESPD(): WebElement {
        return driver.findElement(By.xpath("//img[@src='/images/info/large_tender_datamandatory.png' and @title='Test ESPD Requirement Name']"))
    }

    fun fileInput(): WebElement {
        return driver.findElement(By.xpath("//input[@type='file' and @name='file1']"))

}
}
