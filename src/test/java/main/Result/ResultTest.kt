package main.Result

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.tenderResult.TenderResult
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import java.io.File

class ResultTest : ApplicationsNavigationTest() {

    override  var tendersPage: TendersPage? = null
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var tenderResult: TenderResult

    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tendersPage!!.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
        tenderResult = TenderResult(driver!!)
    }

    @Test
    fun registerTenderResult() {
        publicTenderPage.tenderResultTab?.click()
        driver!!.switchTo().defaultContent()
        tendersPage?.switchToNavigationFrame()

        WebDriverWait(driver!!, 10).until(ExpectedConditions.elementToBeClickable(tenderResult.registerResultButton))
        driver!!.findElement(tenderResult.registerResultButton).click()
        tendersPage?.switchToNewWindowTest()

        WebDriverWait(driver!!, 10).until(ExpectedConditions.elementToBeClickable(tenderResult.yabCheckBox))
        driver!!.findElement(tenderResult.yabCheckBox).click()
        driver!!.findElement(tenderResult.commentsField).sendKeys("YabWinner")
        val absolutePath = File("src/main/resources/files/Test File.pdf").absolutePath
        driver!!.findElement(tenderResult.attachmentInput).sendKeys(absolutePath)
        driver!!.findElement(tenderResult.checkboxForUploadEspd).click()
    }
}
