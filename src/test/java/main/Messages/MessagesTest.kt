package main.Messages

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.messages.Messages
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import kotlin.test.assertTrue

class MessagesTest :  ApplicationsNavigationTest() {

    override  var tendersPage: TendersPage? = null
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var messages: Messages

    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.messagesfromTenderAdministratorTab?.click()
        driver.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        messages = Messages(driver)

    }
    @Test
    fun sendMessageToTenderers() {
        driver.findElement(messages.sendMessageButton).click()
        tendersPage?.switchToNewWindowTest()
        messages.checkTenderersAllCheckbox()
        messages.enterSubjectText("TestSubject AutoTest Tenderers")
        messages.enterMessageText("auto test tenderers")
        driver.findElement(messages.confirmSendButton).click()
        Thread.sleep(3000)}
    @Test
    fun sendMessageToAll() {
        driver.findElement(messages.sendMessageButton).click()
        tendersPage?.switchToNewWindowTest()
        driver.findElement(messages.selectAllButton).click()
        messages.enterSubjectText("TestSubject AutoTest All")
        messages.enterMessageText("auto test all")
        messages.uploadFileToMessage()
        driver.findElement(messages.confirmSendButton).click()
        Thread.sleep(3000)}
    @Test
    fun exportMessages() {
        driver.findElement(messages.exportMessagesButton).click()
        tendersPage?.switchToNewWindowTest()
        driver.findElement(messages.confirmExportButton).click()
        tendersPage?.switchToNewWindowTest()
        val linkElement = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(messages.link()))
        assertTrue(linkElement.isDisplayed) }
}