package main.Messages

import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.messages.Messages
import org.testng.annotations.Test
import java.awt.AWTException

class MessagesTest : BaseTest() {
    private val MessagesTest: MessagesTest? = null
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun sendMessageToAdministrators() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.messagesfromTenderAdministratorTab)
        driver!!.switchTo().defaultContent()
        val messages = Messages(driver)
        val mainWindowHandle = driver!!.windowHandle
        tendersPage.switchToNavigationFrame()
        messages.clickSendMessageButton()
        tendersPage.switchToNewWindowTest()
        messages.checkAdministratorsCheckbox()
        messages.enterSubjectText("TestSubject AutoTest Admins")
        messages.enterMessageText("auto test administrators")
        messages.uploadFileToMessage()
        messages.clickConfirmSendButton()
        Thread.sleep(3000)
    } //        @Test
    //        public void sendMessageToAdministrators2() throws InterruptedException, AWTException {
    //            TendersPage tendersPage = new TendersPage(driver);
    //            tendersPage.switchToBrowserFrame();
    //            PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
    //            publicTenderPage.clickOnElement(publicTenderPage.getMessagesfromTenderAdministratorTab());
    //            driver.switchTo().defaultContent();
    //            Messages messages = new Messages(driver);
    //            tendersPage.switchToNewWindowTest();
    //            messages.sendMessage("TestSubject AutoTest Admins", "auto test administrators", "src/main/resources/files/MessageFileAttachment.pdf");
    //            Thread.sleep(3000);
    //        }
}