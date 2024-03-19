package main.submissionReq

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.subReq.SubmissionRequirements
import main.subReq.allRequirements.CopyReqFromPhase
import org.testng.annotations.Test

class CopyReqFromPhaseTests : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class)
    fun CopyFileUploadReqFromRound() {
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
        submissionRequirements.clickOnCopyReqFromPhaseOrRoundLink()
        val copyReqFromPhase = CopyReqFromPhase(driver!!)
        copyReqFromPhase.checkBoxOfFileReqToCopy()
        copyReqFromPhase.fillInCopyReqFromPhaseNameInput("Copied From Round File Upload")
        copyReqFromPhase.clickCopyButton()
    }
}