package main.questionAndAnswers

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class NewQuestions(private val driver: WebDriver) {
    private val newQuestionButton: By = By.xpath("//img[@title='New question']")
    private val textInputForQuestion: By = By.xpath("//textarea[@id='question']")
    private val okButton: By = By.xpath("//input[@type='button' and @value='OK']\n")
    private val sendButton: By = By.xpath("//input[@type='button' and @value='Send']\n")
    fun clickOnAddNewQuestionButton() {
        val newQuestionButton = driver.findElement(this.newQuestionButton)
        newQuestionButton.click()
    }

    fun fillInQuestionText(test: String?): NewQuestions {
        val textInputForQuestion = driver.findElement(this.textInputForQuestion)
        textInputForQuestion.clear()
        textInputForQuestion.sendKeys(test)
        return this
    }

    fun confirmQuestionOkSend() {
        val okButton = driver.findElement(this.okButton)
        okButton.click()
        val sendButton = driver.findElement(this.sendButton)
        sendButton.click()
    }
}
