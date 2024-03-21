package main.submittedApplications;

import main.specificationDocuments.FileUpload
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import java.awt.AWTException
import java.io.File

class SubmittedApplications(private val driver: WebDriver) {
    private val submittedApplicationIcon: By =
        By.xpath("//span[text()='Submitted applications']/preceding-sibling::img[@src='/images/info/large_tender_submitted_yes.png']\n")
    private val editEvaluationButton: By = By.xpath("//input[@value='Edit evaluation']")
    private val yabTenderer: By = By.xpath("//td[text()='Byggeweb TEST']")
    private val textFieldEvaluation: By = By.xpath("//textarea[@name='comment']\n")
    private val fileInput: By = By.xpath("//input[@type='file']")
    private val okButton: By = By.xpath("//input[@value='OK']")

    // after tender deadline
    private val downloadSubmissions: By = By.xpath("//span[contains(text(), 'Download submissions')]\n")
    private val fileLink: By = By.xpath("//a[@id='filelink']\n")
    private val exportCompareDataButton: By = By.xpath("//img[@title='Export and compare submitted data']\n")
    private val nextButton: By = By.xpath("//input[@value='Next']")
    private val removeFileButton: By = By.xpath("//span[@onclick='remove_file(this)']\n")

    fun fileLink(): WebElement {
        return driver.findElement(fileLink)
    }

    fun clickOnSubmittedApplications() {
        val element = driver.findElement(submittedApplicationIcon)
        element.click()
    }

        fun clickOnEditEvaluation() {
            val element = driver.findElement(editEvaluationButton)
            element.click()
        }
        fun clickOnYabTenderer() {
            val element = driver.findElement(yabTenderer)
            element.click()
        }
        fun enterTextInEvaluationField(text: String) {
            val element = driver.findElement(textFieldEvaluation)
            element.clear()
            element.sendKeys(text)
        }
//        fun uploadFileFromResourcesToEvaluation() {
//            val filePath = "src/main/resources/files/Test File.pdf"
//            val element = driver.findElement(fileInputEvaluation)
//            element.sendKeys(filePath)
//        }

    @Throws(AWTException::class)
    fun uploadFile() {
        val uploadFile = File("src/main/resources/files/Test File.pdf")
        val fileInputElement = driver.findElement(FileUpload.fileInput)
        fileInputElement.sendKeys(uploadFile.absolutePath)
    }
        fun clickOnOkButton() {
            val element = driver.findElement(okButton)
            element.click()
        }
        fun clickOnDownloadSubmissions() {
            val element = driver.findElement(downloadSubmissions)
            element.click()
        }
        fun clickOnExportCompareDataButton() {
            val element = driver.findElement(exportCompareDataButton)
            element.click()
        }
        fun clickOnNextButton() {
            val element = driver.findElement(nextButton)
            element.click()
        }
        fun clickOnRemoveFileButton() {
            val element = driver.findElement(removeFileButton)
            element.click()
        }
    companion object {
        @JvmField
        var fileInput: By = By.xpath("//input[@type='file']")
    }
    }
