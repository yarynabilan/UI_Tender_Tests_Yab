package main.Messages;

import main.BaseTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.messages.Messages;
import main.questionAndAnswers.Answers;
import main.questionAndAnswers.Categories;
import main.questionAndAnswers.NewQuestions;
import org.testng.annotations.Test;

import java.awt.*;

public class MessagesTest extends BaseTest {
    private MessagesTest MessagesTest;
    @Test
    public void sendMessageToAdministrators() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getMessagesfromTenderAdministratorTab());
        driver.switchTo().defaultContent();
        Messages messages = new Messages(driver);
        String mainWindowHandle = driver.getWindowHandle();
        tendersPage.switchToNavigationFrame();
        messages.clickSendMessageButton();
        tendersPage.switchToNewWindowTest();
        messages.checkAdministratorsCheckbox();
        messages.enterSubjectText("TestSubject AutoTest Admins");
messages.enterMessageText("auto test administrators");
messages.uploadFileToMessage();
messages.clickConfirmSendButton();
        Thread.sleep(3000);

    }
        @Test
        public void sendMessageToAdministrators2() throws InterruptedException, AWTException {
            TendersPage tendersPage = new TendersPage(driver);
            tendersPage.switchToBrowserFrame();
            PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
            publicTenderPage.clickOnElement(publicTenderPage.getMessagesfromTenderAdministratorTab());
            driver.switchTo().defaultContent();
            Messages messages = new Messages(driver);
            tendersPage.switchToNewWindowTest();
            messages.sendMessage("TestSubject AutoTest Admins", "auto test administrators", "src/main/resources/files/MessageFileAttachment.pdf");
            Thread.sleep(3000);
        }
    }