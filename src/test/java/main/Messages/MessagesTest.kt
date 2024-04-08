//package main.Messages
//
//import main.BaseTest
//import PublicTenderPage
//import main.TendersPage
//import main.messages.Messages
//import org.openqa.selenium.support.ui.ExpectedConditions
//import org.openqa.selenium.support.ui.WebDriverWait
//import org.testng.annotations.BeforeMethod
//import org.testng.annotations.Test
//import kotlin.test.assertTrue
//
//class MessagesTest : BaseTest() {
//    private lateinit var tendersPage: TendersPage
//    private lateinit var publicTenderPage: PublicTenderPage
//    private lateinit var messages: Messages
//
//    @BeforeMethod
//    fun setUpTest() {
//        tendersPage = TendersPage(driver)
//        publicTenderPage = PublicTenderPage(driver)
//        messages = Messages(driver)
//        val tendersPage = TendersPage(driver)
//        tendersPage.switchToBrowserFrame()
//        val publicTenderPage = PublicTenderPage(driver)
//        publicTenderPage.messagesfromTenderAdministratorTab.click()
//        driver.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()
//    }
//    @Test
//    fun sendMessageToAdministrators_Applicants_All() {
//        val mainWindowHandle = driver.windowHandle
//        messages.clickSendMessageButton()
//        tendersPage.switchToNewWindowTest()
//        messages.sendMessageToAdministrators()
//
//        driver.switchTo().window(mainWindowHandle)
//        driver.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()
//        messages.clickSendMessageButton()
//        tendersPage.switchToNewWindowTest()
//        messages.sendMessageToApplicants()
//
//        driver.switchTo().window(mainWindowHandle)
//        driver.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()
//        messages.clickSendMessageButton()
//        tendersPage.switchToNewWindowTest()
//        messages.sendMessageToAll()
//        Thread.sleep(3000) }
//
//
////separated tests
//    @Test
//    fun sendMessageToTenderers() {
//        messages.clickSendMessageButton()
//        tendersPage.switchToNewWindowTest()
//        messages.checkTenderersAllCheckbox()
//        messages.enterSubjectText("TestSubject AutoTest Tenderers")
//        messages.enterMessageText("auto test tenderers")
//        messages.clickConfirmSendButton()
//        Thread.sleep(3000)}
//    @Test
//    fun sendMessageToAll() {
//        messages.clickSendMessageButton()
//        tendersPage.switchToNewWindowTest()
//        messages.clickSelectAllButton()
//        messages.enterSubjectText("TestSubject AutoTest All")
//        messages.enterMessageText("auto test all")
//        messages.uploadFileToMessage()
//        messages.clickConfirmSendButton()
//        Thread.sleep(3000)}
//    @Test
//    fun exportMessages() {
//        messages.clickExportMessagesButton()
//        tendersPage.switchToNewWindowTest()
//        messages.clickConfirmExportButton()
//        tendersPage.switchToNewWindowTest()
//        val linkElement = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(messages.link()))
//        assertTrue(linkElement.isDisplayed) }
//}