package main.tenderInformation

import lombok.Getter
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.Assert

@Getter
class TenderSettings(private val driver: WebDriver) {
    private val editTenderSettingsButton: By = By.xpath("//img[@src=\"https://testdociaweb.byggeweb.dk/images/buttons/edit_tender_settings_on.png\" and @title=\"Edit tender settings\"]\n")
//        get() = driver.findElement(field)
    private val accessDocumentsBySubcontractorDropdown: By = By.xpath("//select[@class=\"contentNormal\" and @name=\"subcontractor\"]")
    private val onlyTenderersMayDownloadDropdownOption: By = By.xpath("//option[@value=\"0\" and text()=\"Only tenderers may download\"]\n")
    private val allowTendersPartnerToAccessDropdownOption: By = By.xpath("//option[@value='1' and text()=\"Allow tenderers' partner access to tender material\"]")
    private val tenderSettingsSubTab: By = By.xpath("//img[@src=\"/images/info/large_tender_settings.png\"]\n")
    private val subcontractorQA: By = By.xpath("//select[@class=\"contentNormal\" and @name=\"subcontractor_qa\"]")
    private val notifyAboutAnswersYes: By = By.xpath("//option[@value='1' and text()=\"Yes\"]")
    private val notifyAboutAnswersNo: By = By.xpath("//option[@value='0' and text()=\"No\"]")

    private val employmentDropdown: By = By.xpath("//select[@class='contentNormal' and @name='multiplefiles']\n")

    private val supplementaryFilesAcceptedOption: By = By.xpath("//select[@class='contentNormal' and @name='multiplefiles']/option[contains(text(), 'Supplementary files are accepted')]")
    private val supplementaryFilesNoAcceptedOption: By = By.xpath("//select[@class='contentNormal' and @name='multiplefiles']/option[contains(text(), 'Supplementary files are not accepted')]\n")
    private val publicationDropdown: By = By.xpath("//select[@class='contentNormal' and @name='multiplefilespublication']")
    private val publicationDisabled: By = By.xpath("//select[@class='contentNormal' and @name='multiplefilespublication']/option[@selected='' and @value='0']\n")
    private val publicationAnabled: By = By.xpath("//select[@class='contentNormal' and @name='multiplefilespublication']/option[@value='1']\n")
    private val securityDropdown: By = By.xpath("//select[@class='contentNormal' and @name='tenderoffer']")
    private val seeTheStatusYes: By = By.xpath("//select[@class='contentNormal' and @name='tenderoffer']/option[contains(text(), 'See status of submitted')]\n")
    private val seeTheStatusNo: By = By.xpath("//option[contains(text(), 'Not see status of submitted')]")
    private val qaHandlingDropdown: By = By.xpath("//select[@class='contentNormal' and @name='tender_questions']\n")
    private val QAmoduleUsedYes: By = By.xpath("//select[@class='contentNormal' and @name='tender_questions']/option[contains(text(), 'RIB Q&A module is used')]\n")
    private val QAmoduleUsedNo: By = By.xpath("//select[@class='contentNormal' and @name='tender_questions']/option[contains(text(), 'Q&A is handled otherwise')]")
    private val sendersSettingsDropdown: By = By.xpath("//select[@class='contentNormal' and @name='tender_questions']\n")
    private val sendersRevealed: By = By.xpath("//select[@class='contentNormal' and @name='questions_senders']/option[contains(text(), 'Are revealed to administrators') ]")
    private val sendersHidden: By = By.xpath("//select[@class='contentNormal' and @name='questions_senders']/option[contains(text(), 'Are hidden to all users')]\n")

    fun accessDocumentsBySubcontractorDropdown(): WebElement {
        return driver.findElement(accessDocumentsBySubcontractorDropdown)
    }

    fun onlyTenderersMayDownloadDropdownOption(): WebElement {
        return driver.findElement(onlyTenderersMayDownloadDropdownOption)
    }

    fun notifyAboutAnswersYes(): WebElement {
        return driver.findElement(notifyAboutAnswersYes)
    }

    fun notifyAboutAnswersNo(): WebElement {
        return driver.findElement(notifyAboutAnswersNo)
    }

    fun allowTendersPartnerToAccessDropdownOption(): WebElement {
        return driver.findElement(allowTendersPartnerToAccessDropdownOption)
    }

    fun subcontractorQAdropdown(): WebElement {
        return driver.findElement(subcontractorQA)
    }

    fun clickOnAccessDocumentsBySubcontractorDropdown() {
        accessDocumentsBySubcontractorDropdown().click()
    }

    fun clickOnAllowTendersPartnerToAccessDropdownOption() {
        allowTendersPartnerToAccessDropdownOption().click()
    }

    fun clickOnlyTenderersMayDownloadDropdownOption() {
        onlyTenderersMayDownloadDropdownOption().click()
    }

    fun clickSubcontractorQaDropdown() {
        subcontractorQAdropdown().click()
    }

    fun setNotifyAboutAnswersYes() {
        notifyAboutAnswersYes().click()
    }

    fun setNotifyAboutAnswersNo() {
        notifyAboutAnswersNo().click()
    }

    fun selectSupplementaryFilesAccepted() {
        val employmentDropdown = driver.findElement(this.employmentDropdown)
        employmentDropdown.click()
        val supplementaryFilesAcceptedOption = driver.findElement(this.supplementaryFilesAcceptedOption)
        supplementaryFilesAcceptedOption.click()
    }

    fun selectSupplementaryFilesNoAccepted() {
        val employmentDropdown = driver.findElement(this.employmentDropdown)
        employmentDropdown.click()
        val supplementaryFilesNoAcceptedOption = driver.findElement(this.supplementaryFilesNoAcceptedOption)
        supplementaryFilesNoAcceptedOption.click()
    }

    fun updateSecuritySettings() {
        val securityDropdown = driver.findElement(this.securityDropdown)
        securityDropdown.click()
        val seeTheStatusYes = driver.findElement(this.seeTheStatusYes)
        seeTheStatusYes.click()
        val wait = WebDriverWait(driver, 5)
        val alert = wait.until(ExpectedConditions.alertIsPresent())
        val expectedTextPart = "Warning!"
        val actualText = alert.text
        Assert.assertTrue(actualText.contains(expectedTextPart))
        alert.accept()
        securityDropdown.click()
        val seeTheStatusNo = driver.findElement(this.seeTheStatusNo)
        seeTheStatusNo.click()
    }

    fun updateQAhandlingNoYes() {
        val QAmoduleUsedNo = driver.findElement(this.QAmoduleUsedNo)
        QAmoduleUsedNo.click()
        val QAmoduleUsedYes = driver.findElement(this.QAmoduleUsedYes)
        QAmoduleUsedYes.click()
    }

    fun updateSendersVisibilitySettings() {
        val sendersSettingsDropdown = driver.findElement(this.sendersSettingsDropdown)
        sendersSettingsDropdown.click()
        val sendersHidden = driver.findElement(this.sendersHidden)
        sendersHidden.click()
        val sendersRevealed = driver.findElement(this.sendersRevealed)
        sendersRevealed.click()
    }

    fun updatePublicationSettings() {
        val publicationDropdown = driver.findElement(this.publicationDropdown)
        publicationDropdown.click()
        val publicationDisabled = driver.findElement(this.publicationDisabled)
        publicationDisabled.click()
        val publicationAnabled = driver.findElement(this.publicationAnabled)
        publicationAnabled.click()
    }

    companion object {
        private const val TITLE = "Tender Settings"
    }
}

