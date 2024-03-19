package main.Messages

import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.messages.Messages
import main.tenderInformation.TenderDescription
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.Test
import java.awt.AWTException
import kotlin.test.assertTrue

class MessagesTest : BaseTest() {
    private val MessagesTest: MessagesTest? = null
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun sendMessageToAdministrators_Applicants_All() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.messagesfromTenderAdministratorTab)
        driver!!.switchTo().defaultContent()
        val messages = Messages(driver!!)
        val mainWindowHandle = driver!!.windowHandle
        tendersPage.switchToNavigationFrame()
        messages.clickSendMessageButton()
        tendersPage.switchToNewWindowTest()
        messages.sendMessageToAdministrators()

        driver!!.switchTo().window(mainWindowHandle)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        messages.clickSendMessageButton()
        tendersPage.switchToNewWindowTest()
        messages.sendMessageToApplicants()

        driver!!.switchTo().window(mainWindowHandle)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        messages.clickSendMessageButton()
        tendersPage.switchToNewWindowTest()
        messages.sendMessageToAll()
        Thread.sleep(3000)

    }
//separated tests
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun sendMessageToTenderers() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.messagesfromTenderAdministratorTab)
        driver!!.switchTo().defaultContent()
        val messages = Messages(driver!!)
        val mainWindowHandle = driver!!.windowHandle
        tendersPage.switchToNavigationFrame()
        messages.clickSendMessageButton()
        tendersPage.switchToNewWindowTest()
        messages.checkTenderersAllCheckbox()
        messages.enterSubjectText("TestSubject AutoTest Tenderers")
        messages.enterMessageText("auto test tenderers")
        messages.clickConfirmSendButton()
        Thread.sleep(3000)}
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun sendMessageToAll() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.messagesfromTenderAdministratorTab)
        driver!!.switchTo().defaultContent()
        val messages = Messages(driver!!)
        val mainWindowHandle = driver!!.windowHandle
        tendersPage.switchToNavigationFrame()
        messages.clickSendMessageButton()
        tendersPage.switchToNewWindowTest()
        messages.clickSelectAllButton()
        messages.enterSubjectText("TestSubject AutoTest All")
        messages.enterMessageText("auto test all")
        messages.uploadFileToMessage()
        messages.clickConfirmSendButton()
        Thread.sleep(3000)}

        @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun exportMessages() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.messagesfromTenderAdministratorTab)
        driver!!.switchTo().defaultContent()
        val messages = Messages(driver!!)
        val mainWindowHandle = driver!!.windowHandle
        tendersPage.switchToNavigationFrame()
        messages.clickExportMessagesButton()
        tendersPage.switchToNewWindowTest()
        messages.clickConfirmExportButton()
            tendersPage.switchToNewWindowTest()
            Thread.sleep(3000)

            val wait = WebDriverWait(driver!!, 10)
            val linkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Messages.Locators.linkLocator))
            val isDisplayed = linkElement.isDisplayed()
            assertTrue(isDisplayed)


            Thread.sleep(3000)
}
}