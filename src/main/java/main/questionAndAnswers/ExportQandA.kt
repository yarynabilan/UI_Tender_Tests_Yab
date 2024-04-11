package main.questionAndAnswers

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

class ExportQandA(private val driver: WebDriver) {
    val exportQuestionButton: By = By.xpath("//img[@title='Export Q&A']")
    private val fileFormatDropdown: By = By.xpath("//select[@name='fileformat']")
    val wordFormatOption: By = By.xpath("//option[@value='word']")
    val excelFormatOption: By = By.xpath("//option[@value='excel']")
    private val sortColumnDropdown: By = By.xpath("//select[@name='column']")
    private val answerDateOption: By = By.xpath("//option[@value='AnswerDate']")
    private val questionDateOption: By = By.xpath("//option[@value='CreateDate']")
    private val sortOrderDropdown: By = By.xpath("//select[@name='direction']")
    private val oldestFirstOption: By = By.xpath("//option[@value='asc']")
    private val newestFirstOption: By = By.xpath("//option[@value='desc']")
    private val qANDaStatusDropdown: By = By.xpath("//select[@name='status']")
    private val allOption: By = By.xpath("//select[@name='status']/option[text()='All']")
    private val unansweredOption: By = By.xpath("//select[@name='status']/option[text()='Unanswered questions']")
    private val draftsOption: By = By.xpath("//select[@name='status']/option[text()='Drafts']")
    private val publishedOption: By = By.xpath("//select[@name='status']/option[text()='Published answers']")
    val okButton: By = By.xpath("//input[@type='submit' and @value='OK']")
    private val link: By = By.xpath("//a[@id='filelink']")

//    fun link(): WebElement {
//        return driver.findElement(link)
//    }
    val linkQAElement: WebElement
        get() = driver.findElement(link)

    fun selectAll_QA() {
        val qANDaStatusDropdownElement = Select(driver.findElement(qANDaStatusDropdown))
        qANDaStatusDropdownElement.selectByVisibleText("All")
    }

    fun sortByAnswerDate() {
        val sortColumnDropdownElement = Select(driver.findElement(sortColumnDropdown))
        sortColumnDropdownElement.selectByValue("AnswerDate")
    }

    fun sortByOrderDesc() {
        val sortOrderDropdownElement = Select(driver.findElement(sortOrderDropdown))
        sortOrderDropdownElement.selectByValue("desc")
    }
    fun selectAll() {
        val qANDaStatusDropdownElement = Select(driver.findElement(qANDaStatusDropdown))
        qANDaStatusDropdownElement.selectByVisibleText("All")
    }

    fun selectUnanswered() {
        val qANDaStatusDropdownElement = Select(driver.findElement(qANDaStatusDropdown))
        qANDaStatusDropdownElement.selectByVisibleText("Unanswered questions")
    }

    fun selectDrafts() {
        val qANDaStatusDropdownElement = Select(driver.findElement(qANDaStatusDropdown))
        qANDaStatusDropdownElement.selectByVisibleText("Drafts")
    }

    fun selectPublished() {
        val qANDaStatusDropdownElement = Select(driver.findElement(qANDaStatusDropdown))
        qANDaStatusDropdownElement.selectByVisibleText("Published answers")
    }
}
