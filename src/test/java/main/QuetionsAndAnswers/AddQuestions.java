package main.QuetionsAndAnswers;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.questionAndAnswers.Question;
import main.tenderInformation.TenderDescription;
import org.testng.annotations.Test;

public class AddQuestions extends ApplicationsNavigationTest {
    @Test
    public void CreateNewQuestion() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        Question question = new Question(driver);
        tendersPage.switchToNavigationFrame();
        question.addNewQuestion();

       tendersPage.switchToNewWindowTest();
        question.fillInQuestionTest("hefjlvkb;xk");
        question.confirmQuestionOkSend();
        Thread.sleep(5000);
    }
}