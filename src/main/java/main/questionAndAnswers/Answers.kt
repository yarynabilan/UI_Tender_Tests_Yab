package main.questionAndAnswers

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import java.awt.AWTException
import java.io.File

class Answers(private val driver: WebDriver) {
    //    private By questionToAnswer = By.xpath("//div[contains(text(), 'It will be published - 2 Admin')]");
    private val questionToAnswer: By = By.xpath("//tr[@class='rowNormal']/td[@class='vline' and text()='6']\n")
    private val answerToDraft: By = By.xpath("//tr[@class='rowNormal']/td[@class='vline' and text()='3']\n")
    private val unAnsweredQuestionsTab: By = By.xpath("//img[@src='/images/info/large_quanda_questions.png']")
    private val publishedAnswersTab: By = By.xpath("//img[@src='/images/info/large_quanda_answers.png']\n")
    private val draftsTab: By = By.xpath("//img[@src='/images/info/large_quanda_drafts.png']")
    private val answerToPublishButton: By = By.xpath("//div[@class='contentNormalLimited' and contains(text(),'It will be published - 2 Admin')]/following-sibling::div[@class='contentNormal']/input[@type='button' and @value='Answer']")
    private val answerToDraftButton: By = By.xpath("//input[@type='button' and @onclick='answer(2060)' and @value='Answer']")
    private val saveAsDraftButton: By = By.xpath("//input[@type='button' and @value='Save as draft']")
    private val editDraftButton: By = By.xpath("//input[@value='Edit']")
    private val publishButton: By = By.xpath("//input[@type='button' and @value='Publish']")
    private val anonymizeLink: By = By.xpath("//div[@id='anonymize_link']")
    private val fileInput: By = By.xpath("//input[@type='file']")
    private val inputForUpdatingQuestion: By = By.xpath("//textarea[@id='question']")
    private val inputForAnswer: By = By.xpath("//textarea[@id='answer']")

    //private By categoryDropdownLocator = By.xpath("//option[text()='Not categorized']");
    private val categoryDropdownLocator: By = By.xpath("//select[@name='category']")
    private val confirmOKButtonPublishFromDraft: By = By.xpath("//input[@value='OK']")
    private val editPublishedAnswerButton: By = By.xpath("//input[@value='Edit']")
    private val okButton: By = By.xpath("//input[@value='OK']")


    fun goToUnAnsweredQuestionsTab() {
        val unAnsweredQuestionsTab = driver.findElement(this.unAnsweredQuestionsTab)
        unAnsweredQuestionsTab.click()
    }

    fun clickOKButtonPublishFromDraft() {
        val confirmOKButtonPublishFromDraft = driver.findElement(this.confirmOKButtonPublishFromDraft)
        confirmOKButtonPublishFromDraft.click()
    }

    fun goToDraftsTab() {
        val draftsTab = driver.findElement(this.draftsTab)
        draftsTab.click()
    }

    fun clickEditPublishedAnswerButton() {
        val editPublishedAnswerButton = driver.findElement(this.editPublishedAnswerButton)
        editPublishedAnswerButton.click()
    }

    fun goToPublishedAnswersTab() {
        val publishedAnswersTab = driver.findElement(this.publishedAnswersTab)
        publishedAnswersTab.click()
    }

    fun selectQuestionToAnswer() {
        val questionToAnswer = driver.findElement(this.questionToAnswer)
        questionToAnswer.click()
    }

    fun selectQuestionToDraft() {
        val answerToDraft = driver.findElement(this.answerToDraft)
        answerToDraft.click()
    }

    fun clickAnswerToPublishButton() {
        val answerToPublishButton = driver.findElement(this.answerToPublishButton)
        answerToPublishButton.click()
    }

    fun clickAnswerToDraftButton() {
        val answerToDraftButton = driver.findElement(this.answerToDraftButton)
        answerToDraftButton.click()
    }

    fun clickSaveAsDraftButton() {
        val saveAsDraftButton = driver.findElement(this.saveAsDraftButton)
        saveAsDraftButton.click()
    }

    fun clickPublishButton() {
        val publishButton = driver.findElement(this.publishButton)
        publishButton.click()
    }

    fun clickEditDraftButton() {
        val editDraftButton = driver.findElement(this.editDraftButton)
        editDraftButton.click()
    }

    fun clickAnonymizeLink() {
        val anonymizeLink = driver.findElement(this.anonymizeLink)
        anonymizeLink.click()
    }

    fun setFileInput(): WebElement {
        return driver.findElement(fileInput)
    }

    @Throws(AWTException::class)
    fun uploadFileToAdnswer() {
        val uploadFile = File("src/main/resources/files/QandA attachment.pdf")
        val fileInput = setFileInput()
        fileInput.sendKeys(uploadFile.absolutePath)
    }

    fun fillInQuestionText(test: String?): Answers {
        val inputForUpdatingQuestion = driver.findElement(this.inputForUpdatingQuestion)
        inputForUpdatingQuestion.clear()
        inputForUpdatingQuestion.sendKeys(test)
        return this
    }

    fun writeAnswer(test: String?): Answers {
        val inputForAnswer = driver.findElement(this.inputForAnswer)
        inputForAnswer.clear()
        inputForAnswer.sendKeys(test)
        return this
    }

    fun selectCategory() {
        val categoryDropdown = Select(driver.findElement(categoryDropdownLocator))
        categoryDropdown.selectByVisibleText("Not categorized")
    }

    fun selectCategoryToDeleteIt() {
        val categoryDropdown = Select(driver.findElement(categoryDropdownLocator))
        categoryDropdown.selectByVisibleText("to Delete")
    }

    fun clickOkButton() {
        driver.findElement(okButton).click()
    }
}


