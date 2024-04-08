//package main.submissionReq
//
//import main.BaseTest
//import PublicTenderPage
//import main.TendersPage
//import main.subReq.SubmissionRequirements
//import main.subReq.allRequirements.CopyReqFromAnotherTender
//import org.testng.annotations.BeforeMethod
//import org.testng.annotations.Test
//
//class CopyReqFromAnotherTenderTest : BaseTest() {
//
//    private lateinit var tendersPage: TendersPage
//    private lateinit var publicTenderPage: PublicTenderPage
//    private lateinit var submissionRequirements: SubmissionRequirements
//    private lateinit var copyReqFromAnotherTender: CopyReqFromAnotherTender
//
//    @BeforeMethod
//    fun setUpTest() {
//        tendersPage = TendersPage(driver)
//        publicTenderPage= PublicTenderPage(driver)
//        submissionRequirements = SubmissionRequirements(driver)
//        copyReqFromAnotherTender = CopyReqFromAnotherTender(driver)
//        tendersPage.switchToBrowserFrame()
//        publicTenderPage.submissionRequirementsTab.click()
//        driver!!.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()
//        submissionRequirements.clickOnCreateSubReqButton()
//        Thread.sleep(2000)
//        submissionRequirements.switchToNewWindowTest()
//        submissionRequirements.clickOncopyReqFromAnotherTenderLink()
//    }
//    @Test
//    @Throws(InterruptedException::class)
//    fun CopyDataReqFromAnotherTender() {
//        copyReqFromAnotherTender.selectTenderToCopyReqFrom()
//        copyReqFromAnotherTender.checkBoxOfDataReqToCopy()
//        copyReqFromAnotherTender.fillIncopyReqFromAnotherTenderNameInput("Copied from Another Tender Test Data InputReq")
//        copyReqFromAnotherTender.clickCopyButton()
//    }
//}
