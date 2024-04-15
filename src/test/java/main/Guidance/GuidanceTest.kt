package main.Guidance

import main.ApplicationsNavigationTest
import main.BaseTest
import main.LogFiles.Guidance
import main.PublicTenderPage
import main.TendersPage
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import kotlin.test.assertTrue

class GuidanceTest : BaseTest() {
    private lateinit var guidance: Guidance
    private lateinit var tendersPage: TendersPage

    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)

        guidance = Guidance(driver)
        publicTenderPage.guidanceTab?.click()
        driver.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
    }

    @Test
    fun goToSupportPage() {
        driver.findElement(guidance.supportIcon).click()
        tendersPage.switchToNewWindowTest()
        assertTrue(WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOfElementLocated(guidance.tenderSupportTitle)).isDisplayed())
    }
}
