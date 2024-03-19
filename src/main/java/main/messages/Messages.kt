package main.messages

import main.specificationDocuments.FileUpload
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import java.awt.AWTException
import java.io.File

class Messages(private val driver: WebDriver) {
    private val sendMessageButton: By = By.xpath("//img[@title='Send message']")
    private val exportMessagesButton: By = By.xpath("//img[@title='Export messages']")
    private val confirmExportButton: By = By.xpath("//input[@type='submit' and @value='OK']")
    private val generatedReportLink: By = By.xpath("//a[@id='filelink']")
    private val inputSubjectText: By = By.xpath("//input[@name='subject']")
    private val inputMessageText: By = By.xpath("//textarea[@name='message']")
    private val fileInput: By = By.xpath("//input[@type='file']")
    private val administratorsCheckBox: By = By.xpath("//input[@name='adm']")
    private val tenderersAllCheckBox: By = By.xpath("//input[@name='contracts[]']")
    private val tenderersAcceptedCheckBox: By = By.xpath("//input[@name='accepted_contracts[]']")
    private val tenderersRejectedCheckBox: By = By.xpath("//input[@name='rejected_contracts[]']")
    private val selectAllButton: By = By.xpath("//input[@value='Select all']")
    private val deselectAllButton: By = By.xpath("//input[@value='Deselect all']")
    private val individualUsersDropdown: By = By.xpath("//td[contains(@class, 'triangle') and contains(text(), '▶')]")
    private val individualUserCheckbox: By =
        By.xpath("//td[contains(., 'Yab test, Byggeweb TEST')]/preceding-sibling::td/input[@type='checkbox']")
    private val confirmSendButton: By = By.xpath("//input[@value='Send']")
    private val exportingMessagesLink: By = By.xpath("//a[@id='filelink']")

    fun link(): WebElement {
        return driver.findElement(exportingMessagesLink)
    }

    fun clickSendMessageButton() {
        driver.findElement(sendMessageButton).click()
    }

    fun clickExportMessagesButton() {
        driver.findElement(exportMessagesButton).click()
    }

    fun clickConfirmExportButton() {
        driver.findElement(confirmExportButton).click()
    }

    fun clickGeneratedReportLink() {
        driver.findElement(generatedReportLink).click()
    }

    fun enterSubjectText(subject: String) {
        enterText(inputSubjectText, subject)
    }

    fun enterMessageText(message: String) {
        enterText(inputMessageText, message)
    }

    @Throws(AWTException::class)
    fun uploadFileToMessage() {
        val uploadFile = File("src/main/resources/files/MessageFileAttachment.pdf")
        val fileInputElement = driver.findElement(FileUpload.fileInput)
        fileInputElement.sendKeys(uploadFile.absolutePath)
    }

    fun checkAdministratorsCheckbox() {
        checkCheckbox(administratorsCheckBox)
    }

    fun checkTenderersAllCheckbox() {
        checkCheckbox(tenderersAllCheckBox)
    }

    fun checkTenderersAcceptedCheckbox() {
        checkCheckbox(tenderersAcceptedCheckBox)
    }

    fun checkTenderersRejectedCheckbox() {
        checkCheckbox(tenderersRejectedCheckBox)
    }

    fun clickSelectAllButton() {
        clickElement(selectAllButton)
    }

    fun clickDeselectAllButton() {
        clickElement(deselectAllButton)
    }

    fun clickIndividualUsersDropdown() {
        clickElement(individualUsersDropdown)
    }

    fun checkIndividualUserCheckbox() {
        checkCheckbox(individualUserCheckbox)
    }

    fun clickConfirmSendButton() {
        clickElement(confirmSendButton)
    }

    private fun enterText(locator: By, text: String) {
        val element = driver.findElement(locator) as WebElement
        element.sendKeys(text)
    }


    private fun checkCheckbox(locator: By) {
        val checkbox = driver.findElement(locator)
        if (!checkbox.isSelected) {
            checkbox.click()
        }
    }

    private fun clickElement(locator: By) {
        val element = driver.findElement(locator)
        element.click()
    }

    fun sendMessageToAdministrators(){
        checkAdministratorsCheckbox()
        enterSubjectText("TestSubject AutoTest Admins")
        enterMessageText("auto test administrators")
        uploadFileToMessage()
        clickConfirmSendButton()
    }
    fun sendMessageToApplicants(){
        checkTenderersAllCheckbox()
        enterSubjectText("TestSubject AutoTest Tenderers")
        enterMessageText("auto test tenderers")
        uploadFileToMessage()
        clickConfirmSendButton()
    }
    fun sendMessageToAll(){
        clickSelectAllButton()
        enterSubjectText("TestSubject AutoTest All")
        enterMessageText("auto test all")
        uploadFileToMessage()
        clickConfirmSendButton()
    }
}

