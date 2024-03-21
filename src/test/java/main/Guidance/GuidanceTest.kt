package main.Guidance

import main.BaseTest
import main.LogFiles.Guidance
import main.PublicTenderPage
import main.TendersPage
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.Test
import kotlin.test.assertTrue

class GuidanceTest : BaseTest() {
    @Test
    @Throws(InterruptedException::class)
    fun goToSupportPage() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.guidanceTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val Guidance = Guidance(driver!!)
        Guidance.clickSupportIcon()
        tendersPage.switchToNewWindowTest()
        val tenderSupportTitle = WebDriverWait(driver!!, 25).until(ExpectedConditions.visibilityOf(Guidance.tenderSupportTitleElement))
        assertTrue(tenderSupportTitle.isDisplayed())
    }
}