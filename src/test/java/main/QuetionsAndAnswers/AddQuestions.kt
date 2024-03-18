package main.QuetionsAndAnswers

import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.questionAndAnswers.NewQuestions
import org.testng.annotations.Test

class AddQuestions @Test constructor() : BaseTest() {
    private val addQuestions: AddQuestions? = null

    @Test
    @Throws(InterruptedException::class)
    fun CreateNewQuestionToPublish() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        val newQuestions = NewQuestions(driver!!)
        tendersPage.switchToNavigationFrame()
        newQuestions.clickOnAddNewQuestionButton()
        tendersPage.switchToNewWindowTest()
        newQuestions.fillInQuestionText("It will be published - Admin 1.")
        newQuestions.confirmQuestionOkSend()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun CreateNewQuestionToDraft() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        val newQuestions = NewQuestions(driver!!)
        tendersPage.switchToNavigationFrame()
        newQuestions.clickOnAddNewQuestionButton()
        tendersPage.switchToNewWindowTest()
        newQuestions.fillInQuestionText("It will be draft 2.Admin")
        newQuestions.confirmQuestionOkSend()
    }

    init {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        driver!!.switchTo().defaultContent()
        val newQuestions = NewQuestions(driver!!)
        val mainWindowHandle = driver!!.windowHandle
        tendersPage.switchToNavigationFrame()
        newQuestions.clickOnAddNewQuestionButton()
        tendersPage.switchToNewWindowTest()
        newQuestions.fillInQuestionText("It will be unanswered - 1 Admin")
        Thread.sleep(5000)
        newQuestions.confirmQuestionOkSend()
        driver!!.switchTo().window(mainWindowHandle)
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        newQuestions.clickOnAddNewQuestionButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        newQuestions.fillInQuestionText("It will be published - 2 Admin")
        newQuestions.confirmQuestionOkSend()

        driver!!.switchTo().window(mainWindowHandle)
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        newQuestions.clickOnAddNewQuestionButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        newQuestions.fillInQuestionText("It will be draft 3 Admin")
        newQuestions.confirmQuestionOkSend()

        driver!!.switchTo().window(mainWindowHandle)
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        newQuestions.clickOnAddNewQuestionButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        newQuestions.fillInQuestionText("test")
        newQuestions.confirmQuestionOkSend()
    }
}

