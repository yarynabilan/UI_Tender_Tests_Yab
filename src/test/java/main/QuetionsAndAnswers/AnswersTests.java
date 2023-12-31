package main.QuetionsAndAnswers;

import main.BaseTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.questionAndAnswers.Answers;
import main.questionAndAnswers.Categories;
import main.questionAndAnswers.NewQuestions;
import org.testng.annotations.Test;

import java.awt.*;

public class AnswersTests extends BaseTest {
    private AnswersTests AnswersTests;
    @Test
    public void publishAnswer() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        Answers answers = new Answers(driver);
        String mainWindowHandle = driver.getWindowHandle();
        tendersPage.switchToDirectoryFrame();
        Thread.sleep(3000);
        answers.goToUnAnsweredQuestionsTab();
        Thread.sleep(3000);
        answers.selectQuestionToAnswer();
        answers.clickAnswerToPublishButton();
        tendersPage.switchToNewWindowTest();
        answers.clickAnonymizeLink();
        answers.uploadFileToAdnswer();
        answers.fillInQuestionText("test1");
        answers.writeAnswer("answer test");
        answers.selectCategory();
        Thread.sleep(3000);
        answers.clickPublishButton();
}
    @Test
    public void makeDraft() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        Answers answers = new Answers(driver);
        String mainWindowHandle = driver.getWindowHandle();
        tendersPage.switchToDirectoryFrame();
        Thread.sleep(3000);
        answers.goToUnAnsweredQuestionsTab();
        Thread.sleep(3000);
        answers.selectQuestionToDraft();
        answers.clickAnswerToDraftButton();
        tendersPage.switchToNewWindowTest();
        answers.clickAnonymizeLink();
        answers.uploadFileToAdnswer();
        answers.writeAnswer("draft");
        answers.clickSaveAsDraftButton();
        Thread.sleep(3000);
    }
    @Test
    public void answerFromDraft() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        Answers answers = new Answers(driver);
        String mainWindowHandle = driver.getWindowHandle();
        tendersPage.switchToDirectoryFrame();
        Thread.sleep(3000);
        answers.goToDraftsTab();
        Thread.sleep(3000);
        answers.selectQuestionToDraft();
        answers.clickEditDraftButton();
        tendersPage.switchToNewWindowTest();
        answers.writeAnswer("draft");
        answers.selectCategoryToDeleteIt();
        answers.clickPublishButton();
        answers.clickOKButtonPublishFromDraft();
        Thread.sleep(7000);
    }
    @Test
    public void editPublishedAnswer() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Categories categories = new Categories(driver);
        Answers answers = new Answers(driver);
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        answers.goToPublishedAnswersTab();
        Thread.sleep(3000);
        answers.selectQuestionToAnswer();
        answers.clickEditPublishedAnswerButton();
        tendersPage.switchToNewWindowTest();
        answers.writeAnswer("edited answer text in Published section");
        answers.clickPublishButton();
        answers.clickOkButton();
    }
    }
