package main.Result

import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.tenderResult.TenderResult
import org.testng.annotations.Test
import java.io.File

class ResultTest : BaseTest() {

    @Test
    @Throws(InterruptedException::class)
    fun registerTenderResult() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderResultTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val tenderResult = TenderResult(driver!!)
        driver!!.findElement(tenderResult.registerResultButton).click()
        tendersPage.switchToNewWindowTest()
        driver!!.findElement(tenderResult.yabCheckBox).click()
        driver!!.findElement(tenderResult.commentsField).sendKeys("YabWinner")
        val absolutePath = File("src/main/resources/files/Test File.pdf").absolutePath
        driver!!.findElement(tenderResult.attachmentInput).sendKeys(absolutePath)
        driver!!.findElement(tenderResult.checkboxForUploadEspd).click()
        Thread.sleep(3000)
    }}
