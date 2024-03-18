package main.tenderInformation

import lombok.Getter
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

@Getter
class TenderDeadlines(private val driver: WebDriver) {
    private val startDateInput: By = By.xpath("//input[@type='text' and @class='date hasDatepicker' and @name='PRI_startdate' and @id='PRI_startdate']")
    private val submissionDeadlineDateInput: By = By.xpath("//input[@type='text' and @class='date hasDatepicker' and @name='PRI_enddate' and @id='PRI_enddate']")
    private val deadlineForReceivingQuestionsDateInput: By = By.xpath("//input[@type='text' and @class='date hasDatepicker' and @name='PRI_qadate' and @id='PRI_qadate']")
    private val okButton: By = By.xpath("//input[@type='button' and @name='x']")
    private val deadlinesSubTab: By = By.xpath("//img[@src='/images/info/large_tender_deadlines.png']")
    private val startDateHoursInput: By = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_starttime']")
    private val submissionDeadlineInput: By = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_endtime']")
    private val deadlineForReceivingQuestionsInput: By = By.xpath("//td[@class='value']//input[@type='text' and @class='time' and @name='PRI_qatime']")
    private val saveButton: By = By.xpath("//button[text()='Save']")
    private val directoryFrame: By = By.xpath("//frame[@name='directory']")

    fun startDateInput(): WebElement {
        return driver.findElement(startDateInput)
    }

    fun submissionDeadlineDateInput(): WebElement {
        return driver.findElement(submissionDeadlineDateInput)
    }

    fun deadlineForReceivingQuestionsDateInput(): WebElement {
        return driver.findElement(deadlineForReceivingQuestionsDateInput)
    }

    fun startDateHoursInput(): WebElement {
        return driver.findElement(startDateHoursInput)
    }

    fun submissionDeadlineHoursInput(): WebElement {
        return driver.findElement(submissionDeadlineInput)
    }

    fun deadlineForReceivingQuestionsHoursInput(): WebElement {
        return driver.findElement(deadlineForReceivingQuestionsInput)
    }

    fun clickSaveButton() {
        val saveButtonElement = driver.findElement(saveButton)
        saveButtonElement.click()
    }

    fun changeStartDate(newDate: String?): TenderDeadlines {
        val startDateInput = startDateInput()
        startDateInput.clear()
        startDateInput.sendKeys(newDate)
        return this
    }

    fun changeSubmissionDeadlineDate(newSubmissionDate: String?): TenderDeadlines {
        val submissionDeadlineDateInput = submissionDeadlineDateInput()
        submissionDeadlineDateInput.clear()
        submissionDeadlineDateInput.sendKeys(newSubmissionDate)
        return this
    }

    fun changeDateOfReceivingQuestions(newDateOfReceivingQuestions: String?): TenderDeadlines {
        val deadlineForReceivingQuestionsDateInput = deadlineForReceivingQuestionsDateInput()
        deadlineForReceivingQuestionsDateInput.clear()
        deadlineForReceivingQuestionsDateInput.sendKeys(newDateOfReceivingQuestions)
        return this
    }

    fun changeSubmissionDeadline(newTime: String?): TenderDeadlines {
        val inputElementTime = submissionDeadlineHoursInput()
        inputElementTime.clear()
        inputElementTime.sendKeys(newTime)
        return this
    }

    fun changeDeadlineForReceivingQuestions(newTime: String?): TenderDeadlines {
        val inputElementTime = deadlineForReceivingQuestionsHoursInput()
        inputElementTime.clear()
        inputElementTime.sendKeys(newTime)
        return this
    }

    fun changeStartDateHours(newTime: String?): TenderDeadlines {
        val inputElementTime = startDateHoursInput()
        inputElementTime.clear()
        inputElementTime.sendKeys(newTime)
        return this
    }

    companion object {
        private const val TITLE = "Tender Deadlines"
    }
}