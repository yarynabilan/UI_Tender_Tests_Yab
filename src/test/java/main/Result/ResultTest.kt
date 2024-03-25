package main.Result

import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.prequalificationResult.TenderResult
import org.testng.annotations.Test

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
        tenderResult.clickOnRegisterResultButton()
        tendersPage.switchToNewWindowTest()
        tenderResult.clickYabCheckBox()
        tenderResult.enterComments("YabWinner")
        tenderResult.uploadFile("src/main/resources/files/Test File.pdf")
        tenderResult.selectCheckboxForUploadEspd()
        Thread.sleep(3000)

    }
    }

