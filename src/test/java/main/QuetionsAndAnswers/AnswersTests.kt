//package main.QuetionsAndAnswers
//
//import main.BaseTest
//import PublicTenderPage
//import main.TendersPage
//import main.questionAndAnswers.Answers
//import main.questionAndAnswers.Categories
//import org.testng.annotations.Test
//import java.awt.AWTException
//
//class AnswersTests : BaseTest() {
//    private val AnswersTests: AnswersTests? = null
//    @Test
//    @Throws(InterruptedException::class, AWTException::class)
//    fun publishAnswer() {
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//        publicTenderPage.questionsAndAnswersTab.click()
//        driver!!.switchTo().defaultContent()
//        val answers = Answers(driver!!)
//        val mainWindowHandle = driver!!.windowHandle
//        tendersPage.switchToDirectoryFrame()
//        Thread.sleep(3000)
//        answers.goToUnAnsweredQuestionsTab()
//        Thread.sleep(3000)
//        answers.selectQuestionToAnswer()
//        Thread.sleep(3000)
//
//        answers.clickAnswerToPublishButton()
//        tendersPage.switchToNewWindowTest()
//        answers.clickAnonymizeLink()
//        answers.uploadFileToAdnswer()
//        answers.fillInQuestionText("test1")
//        answers.writeAnswer("answer test")
//        answers.selectCategory()
//        Thread.sleep(3000)
//        answers.clickPublishButton()
//        Thread.sleep(3000)
//        tendersPage.switchToNewWindowTest()
//        answers.clickOkButton()
//    }
//
//    @Test
//    @Throws(InterruptedException::class, AWTException::class)
//    fun makeDraft() {
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//        publicTenderPage.questionsAndAnswersTab.click()
//        driver!!.switchTo().defaultContent()
//        val answers = Answers(driver!!)
//        val mainWindowHandle = driver!!.windowHandle
//        tendersPage.switchToDirectoryFrame()
//        Thread.sleep(3000)
//        answers.goToUnAnsweredQuestionsTab()
//        Thread.sleep(3000)
//        answers.selectQuestionToDraft()
//        answers.clickAnswerToDraftButton()
//        tendersPage.switchToNewWindowTest()
//        answers.clickAnonymizeLink()
//        answers.uploadFileToAdnswer()
//        answers.writeAnswer("draft")
//        answers.clickSaveAsDraftButton()
//        Thread.sleep(3000)
//    }
//    @Test
//    @Throws(InterruptedException::class, AWTException::class)
//    fun answerFromDraft() {
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//        publicTenderPage.questionsAndAnswersTab.click()
//        driver!!.switchTo().defaultContent()
//        val answers = Answers(driver!!)
//        val mainWindowHandle = driver!!.windowHandle
//        tendersPage.switchToDirectoryFrame()
//        Thread.sleep(3000)
//        answers.goToDraftsTab()
//        Thread.sleep(3000)
//        answers.selectQuestionToDraft()
//        answers.clickEditDraftButton()
//        tendersPage.switchToNewWindowTest()
//        answers.writeAnswer("draft")
//        answers.selectCategoryToDeleteIt()
//        answers.clickPublishButton()
//        answers.clickOKButtonPublishFromDraft()
//        Thread.sleep(7000)
//    }
//
//    @Test
//    @Throws(InterruptedException::class)
//    fun editPublishedAnswer() {
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//        publicTenderPage.questionsAndAnswersTab.click()
//        driver!!.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()
//        val categories = Categories(driver!!)
//        val answers = Answers(driver!!)
//        driver!!.switchTo().defaultContent()
//        tendersPage.switchToDirectoryFrame()
//        answers.goToPublishedAnswersTab()
//        Thread.sleep(3000)
//        answers.selectQuestionToAnswer()
//        answers.clickEditPublishedAnswerButton()
//        tendersPage.switchToNewWindowTest()
//        answers.writeAnswer("edited answer text in Published section")
//        answers.clickPublishButton()
//        answers.clickOkButton()
//    }
//}
