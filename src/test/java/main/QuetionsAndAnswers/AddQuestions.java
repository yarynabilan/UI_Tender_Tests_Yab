package main.QuetionsAndAnswers;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.questionAndAnswers.NewQuestions;
import org.testng.annotations.Test;

public class AddQuestions extends ApplicationsNavigationTest {
    @Test
    public void CreateNewQuestion() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        NewQuestions newQuestions = new NewQuestions(driver);
        tendersPage.switchToNavigationFrame();
        newQuestions.addNewQuestion();

       tendersPage.switchToNewWindowTest();
        newQuestions.fillInQuestionTest("hefjlvkb;xk");
        newQuestions.confirmQuestionOkSend();
        Thread.sleep(5000);
    }
}