package main.submissionReq

import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.subReq.SubmissionRequirements
import main.subReq.allRequirements.CopyReqFromPhase
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class CopyReqFromPhaseTests : BaseTest() {

        private lateinit var tendersPage: TendersPage
        private lateinit var publicTenderPage: PublicTenderPage
        private var submissionRequirements: SubmissionRequirements? = null
        private lateinit var copyReqFromPhase: CopyReqFromPhase

    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.submissionRequirementsTab?.click()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        submissionRequirements = SubmissionRequirements(driver)
        submissionRequirements?.clickOnCreateSubReqButton()
        Thread.sleep(2000)
        submissionRequirements!!.switchToNewWindowTest()
        submissionRequirements!!.clickOnCopyReqFromPhaseOrRoundLink()
    }
        @Test
    @Throws(InterruptedException::class)
    fun CopyFileUploadReqFromRound() {
        copyReqFromPhase.checkBoxOfFileReqToCopy()
        copyReqFromPhase.fillInCopyReqFromPhaseNameInput("Copied From Round File Upload")
        copyReqFromPhase.clickCopyButton()
    }
}