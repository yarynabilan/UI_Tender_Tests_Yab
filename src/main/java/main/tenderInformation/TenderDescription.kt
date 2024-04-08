package main.tenderInformation

import BasePage
import lombok.Getter
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

@Getter
class TenderDescription(driver: WebDriver?) : BasePage(driver) {
    private val tenderInformationExtendIcon: By = By.xpath("//*[@id=\"zpTreetree_tender_root_nodeNode2SignElement\"]/img")
    private val tenderDescriptionSubTab: By = By.xpath("//img[contains(@src, '/images/info/large_tender_description.png')]")
    private val editTenderDescriptionButton: By = By.xpath("//img[@src='https://testdociaweb.byggeweb.dk/images/buttons/edit_tender_on.png']")
    private val deadlinesAndConditionsSubTab: By = By.xpath("//*[@id=\"tender_timelimits_node\"]/span")
    private val editTenderSettingsButton: By = By.xpath("//img[@src=\"https://testdociaweb.byggeweb.dk/images/buttons/edit_tender_settings_on.png\" and @title=\"Edit tender settings\"]\n")

    //        get() = driver!!.findElement(field)
    private val tenderSettingsSubTab: By = By.xpath("//img[@src=\"/images/info/large_tender_settings.png\"]\n")

    //        get() = driver!!.findElement(field)
    private val projectNoInput: By = By.xpath("//input[@class='contentNormal' and @type='TEXT' and @name='pn']")
    private val contractingAuthorityInput: By = By.xpath("//input[@name='tenderowner']")
    private val contractTypeInput: By = By.xpath("//input[@name='contracttype']")
    private val descriptionInput: By = By.xpath("//textarea[@name='description']")
    private val contactPersonInput: By = By.xpath("//textarea[@name='contactperson']")
    private val okButton: By = By.xpath("//input[@type='button' and @name='x']")
    private val deadlinesSubTab: By = By.xpath("//img[@src='/images/info/large_tender_deadlines.png']")

    //        get() = driver!!.findElement(field)
    private val startDateHoursInput: By = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_starttime']")
    private val submissionDeadlineInput: By = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_endtime']")
    private val deadlineForReceivingQuestionsInput: By = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_qatime']")
    private val saveButton: By = By.xpath("//button[text()='Save']")
    private val directoryFrame: By = By.xpath("//frame[@name='directory']")
    private val awardCriteria: By = By.xpath("//select[@name='awardcriteria']")
    private val bestQualityOption: By = By.xpath("//option[@value='2' and text()='Best price/quality ratio']")
    private val tenderType: By = By.xpath("//select[@name='tendertype']")
    private val secretTypeOption: By = By.xpath("//select[@name='tendertype']/option[@value='4' and @data-procedure='7']")
    private val publicTypeOption: By = By.xpath("//select[@name='tendertype']/option[@value='1' and @data-procedure='1']")

    val tenderDescriptionSubTabElement: WebElement
        get() = driver!!.findElement(tenderDescriptionSubTab)
    val editTenderDescriptionButtonElement: WebElement
        get() = driver!!.findElement(editTenderDescriptionButton)

    fun projectNoInput(): WebElement {
        return driver!!.findElement(projectNoInput)
    }

    fun descriptionInput(): WebElement {
        return driver!!.findElement(descriptionInput)
    }

    fun contractingAuthorityInput(): WebElement {
        return driver!!.findElement(contractingAuthorityInput)
    }

    fun contractTypeInput(): WebElement {
        return driver!!.findElement(contractTypeInput)
    }

    fun contactPersonInput(): WebElement {
        return driver!!.findElement(contactPersonInput)
    }

    fun okButton(): WebElement {
        return driver!!.findElement(okButton)
    }

    fun startDateHoursInput(): WebElement {
        return driver!!.findElement(startDateHoursInput)
    }

    fun submissionDeadlineHoursInput(): WebElement {
        return driver!!.findElement(submissionDeadlineInput)
    }

    fun deadlineForReceivingQuestionsHoursInput(): WebElement {
        return driver!!.findElement(deadlineForReceivingQuestionsInput)
    }

    fun directoryFrame(): WebElement {
        return driver!!.findElement(directoryFrame)
    }

    fun awardCriteria(): WebElement {
        return driver!!.findElement(awardCriteria)
    }

    fun bestQualityOption(): WebElement {
        return driver!!.findElement(bestQualityOption)
    }

    fun tenderType(): WebElement {
        return driver!!.findElement(tenderType)
    }

    fun secretTypeOption(): WebElement {
        return driver!!.findElement(secretTypeOption)
    }

    fun publicTypeOption(): WebElement {
        return driver!!.findElement(publicTypeOption)
    }

    fun clickOnTenderDescriptionSubTab() {
        tenderDescriptionSubTabElement.click()
    }

    fun clickOnAwardCriteriaDropdown() {
        awardCriteria().click()
    }

    fun clickOnTenderTypeDropdown() {
        tenderType().click()
    }

    fun changeTenderTypeToSecret() {
        secretTypeOption().click()
    }

    fun changeTenderTypeToPublic() {
        publicTypeOption().click()
    }

    fun clickOnBestQualityOption() {
        bestQualityOption().click()
    }

    fun clickOnDeadlineSubTab() {
        driver!!.findElement(deadlinesSubTab).click()
    }

    fun clickOnTenderSettingsSubTab() {
        driver!!.findElement(tenderSettingsSubTab).click()
    }


    fun clickOnEditTenderSettingsButton() {
        driver!!.findElement(editTenderSettingsButton).click()
    }

    fun clickOnEditTenderDescriptionButton() {
        editTenderDescriptionButtonElement.click()
    }

    fun clickSaveButton() {
        val saveButtonElement = driver!!.findElement(saveButton)
        saveButtonElement.click()
    }

    fun fillInProjectNo(test: String?): TenderDescription {
        val projectNoInput = projectNoInput()
        projectNoInput.clear()
        projectNoInput.sendKeys(test)
        return this
    }

    fun fillInDescriptionInput(descriptionInputText: String?): TenderDescription {
        val descriptionInput = descriptionInput()
        descriptionInput.clear()
        descriptionInput.sendKeys(descriptionInputText)
        return this
    }

    fun fillInContractingAuthorityInput(ContractingAuthorityFieldTest: String?): TenderDescription {
        val contractingAuthorityInput = projectNoInput()
        contractingAuthorityInput.clear()
        contractingAuthorityInput.sendKeys(ContractingAuthorityFieldTest)
        return this
    }

    fun fillInContractTypeInput(contractTypeInputFieldTest: String?): TenderDescription {
        val contractTypeInput = contractTypeInput()
        contractTypeInput.clear()
        contractTypeInput.sendKeys(contractTypeInputFieldTest)
        return this
    }

    fun fillInContactPersonInput(contactPersonInputTextTest: String?): TenderDescription {
        val contactPersonInput = contactPersonInput()
        contactPersonInput.clear()
        contactPersonInput.sendKeys(contactPersonInputTextTest)
        return this
    }

    fun changeSubmissionDeadline(newTime: String?): TenderDescription {
        val inputElementTime = submissionDeadlineHoursInput()
        inputElementTime.clear()
        inputElementTime.sendKeys(newTime)
        return this
    }

    fun changeDeadlineForReceivingQuestions(newTime: String?): TenderDescription {
        val inputElementTime = deadlineForReceivingQuestionsHoursInput()
        inputElementTime.clear()
        inputElementTime.sendKeys(newTime)
        return this
    }

    fun switchToDirectoryFrame() {
        driver!!.switchTo().frame(directoryFrame as WebElement)
    }

}


