package main.submissionReq

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.subReq.SubmissionRequirements
import main.subReq.allRequirements.espdRequirementPage
import org.testng.annotations.Test
import java.awt.AWTException
import java.io.IOException

class EspdRequirementTests : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class)
    fun CreateEspdRequirement() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.submissionRequirementsTab)
        driver!!.switchTo().defaultContent() // Якщо потрібно, відключаємося від фреймів
        tendersPage.switchToNavigationFrame()
        val submissionRequirements = SubmissionRequirements(driver)
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
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.submissionRequirementsTab)
        driver!!.switchTo().defaultContent() // Якщо потрібно, відключаємося від фреймів
        tendersPage.switchToNavigationFrame()
        val submissionRequirements = SubmissionRequirements(driver)
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
}




