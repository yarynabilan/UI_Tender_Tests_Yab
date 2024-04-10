package main.QuetionsAndAnswers

import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.questionAndAnswers.Answers
import main.questionAndAnswers.Categories
import main.questionAndAnswers.NewQuestions
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import java.awt.AWTException

class AnswersTests : BaseTest() {
    private lateinit var tendersPage: TendersPage
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var answers: Answers

    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.questionsAndAnswersTab?.click()
        answers = Answers(driver!!)
        driver!!.switchTo().defaultContent()


    }
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun publishAnswer() {
        val mainWindowHandle = driver!!.windowHandle
        tendersPage.switchToDirectoryFrame()
        Thread.sleep(3000)
        answers.goToUnAnsweredQuestionsTab()
        Thread.sleep(3000)
        answers.selectQuestionToAnswer()
        Thread.sleep(3000)

        answers.clickAnswerToPublishButton()
        tendersPage.switchToNewWindowTest()
        answers.clickAnonymizeLink()
        answers.uploadFileToAdnswer()
        answers.fillInQuestionText("test1")
        answers.writeAnswer("answer test")
        answers.selectCategory()
        Thread.sleep(3000)
        answers.clickPublishButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        answers.clickOkButton()

    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun makeDraft() {

        val mainWindowHandle = driver!!.windowHandle
        tendersPage.switchToDirectoryFrame()
        Thread.sleep(3000)
        answers.goToUnAnsweredQuestionsTab()
        Thread.sleep(3000)
        answers.selectQuestionToDraft()
        answers.clickAnswerToDraftButton()
        tendersPage.switchToNewWindowTest()
        answers.clickAnonymizeLink()
        answers.uploadFileToAdnswer()
        answers.writeAnswer("draft")
        answers.clickSaveAsDraftButton()
        Thread.sleep(3000)
    }
    @Test
    fun answerFromDraft() {

        val mainWindowHandle = driver!!.windowHandle
        tendersPage.switchToDirectoryFrame()
        Thread.sleep(3000)
        answers.goToDraftsTab()
        Thread.sleep(3000)
        answers.selectQuestionToDraft()
        answers.clickEditDraftButton()
        tendersPage.switchToNewWindowTest()
        answers.writeAnswer("draft")
        answers.selectCategoryToDeleteIt()
        answers.clickPublishButton()
        answers.clickOKButtonPublishFromDraft()
        Thread.sleep(7000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun editPublishedAnswer() {
        tendersPage.switchToNavigationFrame()
//        val categories = Categories(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        answers.goToPublishedAnswersTab()
        Thread.sleep(3000)
        answers.selectQuestionToAnswer()
        answers.clickEditPublishedAnswerButton()
        tendersPage.switchToNewWindowTest()
        answers.writeAnswer("edited answer text in Published section")
        answers.clickPublishButton()
        answers.clickOkButton()
    }
}
