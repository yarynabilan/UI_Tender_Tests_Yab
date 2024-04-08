//package main.QuetionsAndAnswers
//
//import main.BaseTest
//import PublicTenderPage
//import main.TendersPage
//import main.questionAndAnswers.NewQuestions
//import org.testng.annotations.Test
//import org.testng.annotations.BeforeMethod
//
//
//class AddQuestions : BaseTest() {
//    private lateinit var tendersPage: TendersPage
//    private lateinit var publicTenderPage: PublicTenderPage
//    private lateinit var newQuestions: NewQuestions
//
//    @BeforeMethod
//    fun setUpTest() {
//        tendersPage = TendersPage(driver)
//        publicTenderPage = PublicTenderPage(driver)
//        newQuestions = NewQuestions(driver)
//        tendersPage.switchToBrowserFrame()
//        publicTenderPage.questionsAndAnswersTab.click()
//        driver.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()
//        newQuestions.clickOnAddNewQuestionButton()
//        tendersPage.switchToNewWindowTest()
//    }
//    @Test
//    fun createNewQuestionToPublish() {
//        newQuestions.fillInQuestionText("It will be published - Admin 1.")
//        newQuestions.confirmQuestionOkSend() }
//
//    @Test
//    fun createNewQuestionToDraft() {
//        newQuestions.fillInQuestionText("It will be draft 2.Admin")
//        newQuestions.confirmQuestionOkSend() }
//
//    @Test
//    fun createNewQuestionToUnanswer() {
//        newQuestions.fillInQuestionText("It will be unAnswered.Admin")
//        newQuestions.confirmQuestionOkSend() }
//    }
////TODO: 1. add attachment to the question