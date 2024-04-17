package main.submissionReq

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.subReq.SubmissionRequirements
import main.subReq.allRequirements.espdRequirementPage
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import java.awt.AWTException
import java.io.IOException

class EspdRequirementTests : ApplicationsNavigationTest() {

    override  var tendersPage: TendersPage? = null
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var espdRequirementPage: espdRequirementPage
    private lateinit var submissionRequirements: SubmissionRequirements

    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tendersPage!!.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.submissionRequirementsTab?.click()
        driver!!.switchTo().defaultContent()
        tendersPage!!.switchToNavigationFrame()
        submissionRequirements = SubmissionRequirements(driver)}

    @Test
    @Throws(InterruptedException::class)
    fun CreateEspdRequirement() {
        submissionRequirements.clickOnCreateSubReqButton()
        Thread.sleep(2000)
        submissionRequirements.switchToNewWindowTest()
        submissionRequirements.clickOnEdpdReqLink()
        val espdRequirement = espdRequirementPage(driver!!)
        espdRequirement.fillInESPDName("Test ESPD Requirement Name")
        espdRequirement.fillInESPDdescriptionField("Test Description of ESPD Requirement ")
        espdRequirement.selectMainAuthorityRadioButton()
        espdRequirement.clickOnOk()
        espdRequirement.clickOnNext()
        espdRequirement.clickOnNext2()
        espdRequirement.clickOnNext3()
        espdRequirement.clickOnSave()
        Thread.sleep(2000)
        //        tendersPage.switchToDirectoryFrame();
//        assertTrue(espdRequirement.createdESPD().isDisplayed());
    }

    @Test
    @Throws(InterruptedException::class, IOException::class, AWTException::class)
    fun testUploadFileFromResources() {
        submissionRequirements.clickOnCreateSubReqButton()
        Thread.sleep(2000)
        submissionRequirements.switchToNewWindowTest()
        submissionRequirements.clickOnEdpdReqLink()
        val espdRequirementPage = espdRequirementPage(driver!!)
        espdRequirementPage.fillInESPDName("Test ESPD Requirement Name")
        espdRequirementPage.fillInESPDdescriptionField("Test Description of ESPD Requirement ")
        espdRequirementPage.selectReuseESPDRadioButton()
        espdRequirementPage.selectMainAuthorityRadioButton()
        espdRequirementPage.uploadFileFromResourcesToProject2()
        Thread.sleep(5000)
        espdRequirementPage.clickUploadOK()

        //     assertTrue(espdRequirementPage.createdESPD().isDisplayed());
    }
//    TODO:Delete and add again
}




