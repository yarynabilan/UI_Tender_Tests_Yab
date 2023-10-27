package main.QuetionsAndAnswers;

import main.BaseTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.questionAndAnswers.NewQuestions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddQuestions extends BaseTest {
    private NewQuestions newQuestions;

    @BeforeMethod
    public void setUpTest() throws InterruptedException, NullPointerException {
        super.setUp(); // Викликаємо setUp() базового класу
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();

        // Перше дійство: додавання першого питання
        NewQuestions newQuestions = new NewQuestions(driver);
    }

    @Test
    public void CreateNewQuestion() throws InterruptedException {
        // Перше дійство: додавання першого питання
        newQuestions.clickOnAddNewQuestionButton();
        newQuestions.fillInQuestionText("It will be published");
        newQuestions.confirmQuestionOkSend();
        Thread.sleep(3000);

        // Друге дійство: додавання другого питання
        newQuestions.clickOnAddNewQuestionButton();
        newQuestions.fillInQuestionText("It will be draft");
        newQuestions.confirmQuestionOkSend();

        // Третє дійство: додавання третього питання
        newQuestions.clickOnAddNewQuestionButton();
        newQuestions.fillInQuestionText("It will be unanswered");
        Thread.sleep(5000);
    }
}
