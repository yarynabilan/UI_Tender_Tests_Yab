//package main.Guidance
//
//import main.BaseTest
//import main.LogFiles.Guidance
//import main.PublicTenderPage
//import main.TendersPage
//import org.openqa.selenium.support.ui.ExpectedConditions
//import org.openqa.selenium.support.ui.WebDriverWait
//import org.testng.annotations.BeforeMethod
//import org.testng.annotations.Test
//import kotlin.test.assertTrue
//
//class GuidanceTest : BaseTest() {
//    private lateinit var tendersPage: TendersPage
//    private lateinit var publicTenderPage: PublicTenderPage
//    private lateinit var guidance: Guidance
//
//    @BeforeMethod
//    fun setUpTest() {
//        tendersPage = TendersPage(driver)
//        publicTenderPage = PublicTenderPage(driver)
//        guidance = Guidance(driver)
//        tendersPage.switchToBrowserFrame()
//        publicTenderPage.guidanceTab.click()
//        driver.switchTo().defaultContent()
//        tendersPage.switchToDirectoryFrame()
//    }
//    @Test
//    fun goToSupportPage() {
//        guidance.clickSupportIcon()
//        tendersPage.switchToNewWindowTest()
//        val tenderSupportTitle = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(guidance.tenderSupportTitleElement))
//        assertTrue(tenderSupportTitle.isDisplayed)
//    }
//}
