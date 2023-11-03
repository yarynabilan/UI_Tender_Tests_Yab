package main.QuetionsAndAnswers;

import main.BaseTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.questionAndAnswers.NewQuestions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddQuestions extends BaseTest {
    private NewQuestions newQuestions;

//    @BeforeMethod
//    public void setUpTest() throws InterruptedException, NullPointerException {
//        super.setUp(); // Викликаємо setUp() базового класу
//        TendersPage tendersPage = new TendersPage(driver);
//        tendersPage.switchToBrowserFrame();
//        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
//        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
//        driver.switchTo().defaultContent();
//        NewQuestions newQuestions = new NewQuestions(driver);
//    tendersPage.switchToNavigationFrame();
//        Thread.sleep(3000);
//
//    }

    @Test
    public void CreateNewQuestionToPublish() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        NewQuestions newQuestions = new NewQuestions(driver);
        tendersPage.switchToNavigationFrame();
        newQuestions.clickOnAddNewQuestionButton();
        tendersPage.switchToNewWindowTest();
        newQuestions.fillInQuestionText("It will be published - Admin 1.");
        newQuestions.confirmQuestionOkSend();
        Thread.sleep(3000);
    }
        @Test
        public void CreateNewQuestionToDraft() throws InterruptedException {
            TendersPage tendersPage = new TendersPage(driver);
            tendersPage.switchToBrowserFrame();
            PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
            publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
            driver.switchTo().defaultContent();
            NewQuestions newQuestions = new NewQuestions(driver);
            tendersPage.switchToNavigationFrame();
            newQuestions.clickOnAddNewQuestionButton();
            tendersPage.switchToNewWindowTest();
            newQuestions.fillInQuestionText("It will be draft 2.Admin");
            newQuestions.confirmQuestionOkSend();

        }
    @Test
    public void CreateNewQuestionToUnanswer() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        NewQuestions newQuestions = new NewQuestions(driver);
        tendersPage.switchToNavigationFrame();
        newQuestions.clickOnAddNewQuestionButton();
        tendersPage.switchToNewWindowTest();
        newQuestions.fillInQuestionText("It will be unanswered - 3 Admin");
        Thread.sleep(5000);
    }
}
