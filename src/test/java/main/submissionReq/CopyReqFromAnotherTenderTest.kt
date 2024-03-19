package main.submissionReq

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.subReq.SubmissionRequirements
import main.subReq.allRequirements.CopyReqFromAnotherTender
import org.testng.annotations.Test

class CopyReqFromAnotherTenderTest : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class)
    fun CopyDataReqFromAnotherTender() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.submissionRequirementsTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val submissionRequirements = SubmissionRequirements(driver)
        submissionRequirements.clickOnCreateSubReqButton()
        Thread.sleep(2000)
        submissionRequirements.switchToNewWindowTest()
        submissionRequirements.clickOncopyReqFromAnotherTenderLink()
        val copyReqFromAnotherTender = CopyReqFromAnotherTender(driver!!)
        copyReqFromAnotherTender.selectTenderToCopyReqFrom()
        copyReqFromAnotherTender.checkBoxOfDataReqToCopy()
        copyReqFromAnotherTender.fillIncopyReqFromAnotherTenderNameInput("Copied from Another Tender Test Data InputReq")
        copyReqFromAnotherTender.clickCopyButton()
    }
}
