package main.QuetionsAndAnswers;

import main.BaseTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.questionAndAnswers.NewQuestions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddQuestions extends BaseTest {
    private AddQuestions addQuestions;

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
    public void AddQuestions() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        NewQuestions newQuestions = new NewQuestions(driver);
        String mainWindowHandle = driver.getWindowHandle();
        tendersPage.switchToNavigationFrame();
        newQuestions.clickOnAddNewQuestionButton();
        tendersPage.switchToNewWindowTest();
        newQuestions.fillInQuestionText("It will be unanswered - 1 Admin");
        Thread.sleep(5000);
        newQuestions.confirmQuestionOkSend();
        driver.switchTo().window(mainWindowHandle);
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        newQuestions.clickOnAddNewQuestionButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        newQuestions.fillInQuestionText("It will be published - 2 Admin");
        newQuestions.confirmQuestionOkSend();

        driver.switchTo().window(mainWindowHandle);
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        newQuestions.clickOnAddNewQuestionButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        newQuestions.fillInQuestionText("It will be draft 3 Admin");
        newQuestions.confirmQuestionOkSend();

        driver.switchTo().window(mainWindowHandle);
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        newQuestions.clickOnAddNewQuestionButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        newQuestions.fillInQuestionText("test");
        newQuestions.confirmQuestionOkSend();
    }


}

