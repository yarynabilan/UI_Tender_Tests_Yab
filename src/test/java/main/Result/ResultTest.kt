//package main.Result
//
//import main.BaseTest
//import PublicTenderPage
//import main.TendersPage
//import main.tenderResult.TenderResult
//import org.testng.annotations.BeforeMethod
//import org.testng.annotations.Test
//import java.io.File
//class ResultTest : BaseTest() {
//    private lateinit var tendersPage: TendersPage
//    private lateinit var publicTenderPage: PublicTenderPage
//    private lateinit var tenderResult: TenderResult
//
//    @BeforeMethod
//    fun setUpTest() {
//        tendersPage = TendersPage(driver)
//        publicTenderPage = PublicTenderPage(driver)
//        tenderResult = TenderResult(driver!!)
//    }
//    @Test
//    @Throws(InterruptedException::class)
//    fun registerTenderResult() {
//        tendersPage.switchToBrowserFrame()
//        publicTenderPage.tenderResultTab.click()
//        driver!!.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()
//        driver!!.findElement(tenderResult.registerResultButton).click()
//        tendersPage.switchToNewWindowTest()
//        driver!!.findElement(tenderResult.yabCheckBox).click()
//        driver!!.findElement(tenderResult.commentsField).sendKeys("YabWinner")
//        val absolutePath = File("src/main/resources/files/Test File.pdf").absolutePath
//        driver!!.findElement(tenderResult.attachmentInput).sendKeys(absolutePath)
//        driver!!.findElement(tenderResult.checkboxForUploadEspd).click()
//        Thread.sleep(3000)
//    }
//}
//
