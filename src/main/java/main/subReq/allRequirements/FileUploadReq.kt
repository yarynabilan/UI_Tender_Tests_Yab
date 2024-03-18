package main.subReq.allRequirements

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class FileUploadReq(private val driver: WebDriver) {
    private val fileUploadInput: By = By.xpath("//input[@class=\"contentNormal\"]")
    private val descriptionFiled: By = By.xpath("//textarea[@class=\"contentNormal\" and @name=\"description\"]")
    private val okButton: By = By.xpath("//input[@name='x' and @value='OK']")
    private val toDeteleFileUploadReq: By = By.xpath("//span[text()='To Delete Test File Upload Requirement']")
    private val fileUploadReq: By = By.xpath("//span[text()='Test File Upload Requirement Name']")
    private val checkboxDocx: By = By.xpath("//input[@type='checkbox' and @value='docx']")
    private val checkboxDoc: By = By.xpath("//input[@type='checkbox' and @value='doc']")
    private val checkboxXlsx: By = By.xpath("//input[@type='checkbox' and @value='xlsx']")
    private val checkboxXls: By = By.xpath("//input[@type='checkbox' and @value='xls']")
    private val checkboxPptx: By = By.xpath("//input[@type='checkbox' and @value='pptx']")
    private val checkboxPpt: By = By.xpath("//input[@type='checkbox' and @value='ppt']")
    private val checkboxTxt: By = By.xpath("//input[@type='checkbox' and @value='txt']")
    private val checkboxPdf: By = By.xpath("//input[@type='checkbox' and @value='pdf']")
    private val checkboxPng: By = By.xpath("//input[@type='checkbox' and @value='png']")
    private val checkboxJpg: By = By.xpath("//input[@type='checkbox' and @value='jpg']")

    fun fileUploadInput(): WebElement {
        return driver.findElement(fileUploadInput)
    }

    fun descriptionFiled(): WebElement {
        return driver.findElement(descriptionFiled)
    }

    fun okButton(): WebElement {
        return driver.findElement(okButton)
    }

    fun fillInNameOfFileUploadReq(fileUploadName: String?): FileUploadReq {
        val fileUploadInput = fileUploadInput()
        fileUploadInput.clear()
        fileUploadInput.sendKeys(fileUploadName)
        return this
    }

    fun fillInDescriptionField(newDescription: String?): FileUploadReq {
        val descriptionFiled = descriptionFiled()
        descriptionFiled.clear()
        descriptionFiled.sendKeys(newDescription)
        return this
    }

    fun clickOkButton() {
        okButton().click()
    }


    fun selectFileUploadReqToDelete() {
        val toDeteleFileUploadReq = driver.findElement(this.toDeteleFileUploadReq)
        toDeteleFileUploadReq.click()
    }

    fun selectFileUpload() {
        val fileUploadReq = driver.findElement(this.fileUploadReq)
        fileUploadReq.click()
    }

    fun editFileUploadReq() {
        val fileUploadReq = driver.findElement(this.fileUploadReq)
        fileUploadReq.click()
    }

    fun selectCheckboxDocx() {
        val checkboxDocx = driver.findElement(this.checkboxDocx)
        checkboxDocx.click()
    }

    fun selectCheckboxDoc() {
        val checkboxDoc = driver.findElement(this.checkboxDoc)
        checkboxDoc.click()
    }

    fun selectCheckboxXlsx() {
        val checkboxXlsx = driver.findElement(this.checkboxXlsx)
        checkboxXlsx.click()
    }

    fun selectCheckboxXls() {
        val checkboxXls = driver.findElement(this.checkboxXls)
        checkboxXls.click()
    }

    fun selectCheckboxPptx() {
        val checkboxPptx = driver.findElement(this.checkboxPptx)
        checkboxPptx.click()
    }

    fun selectCheckboxPpt() {
        val checkboxPpt = driver.findElement(this.checkboxPpt)
        checkboxPpt.click()
    }

    fun selectCheckboxPdf() {
        val checkboxPdf = driver.findElement(this.checkboxPdf)
        checkboxPdf.click()
    }

    fun selectCheckboxPng() {
        val checkboxPng = driver.findElement(this.checkboxPng)
        checkboxPng.click()
    }
}
