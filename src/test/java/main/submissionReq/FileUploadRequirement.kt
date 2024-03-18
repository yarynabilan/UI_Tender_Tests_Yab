package main.submissionReq

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.subReq.SubmissionRequirements
import main.subReq.allRequirements.FileUploadReq
import org.testng.annotations.Test

class FileUploadRequirement : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class)
    fun CreateFileUploadRequirement() {
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
        submissionRequirements.clickOnFileUploadReqLink()
        val fileUploadReq = FileUploadReq(driver!!)
        fileUploadReq.fillInNameOfFileUploadReq("Test File Upload Requirement Name")
        fileUploadReq.fillInDescriptionField("Test Description of File Upload Requirement ")
        fileUploadReq.clickOkButton()
        Thread.sleep(2000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun CreateToDeleteFileUploadRequirement() {
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
        submissionRequirements.clickOnFileUploadReqLink()
        val fileUploadReq = FileUploadReq(driver!!)
        fileUploadReq.fillInNameOfFileUploadReq("To Delete Test File Upload Requirement")
        fileUploadReq.fillInDescriptionField("Test Description of File Upload Requirement to Delete ")
        fileUploadReq.clickOkButton()
    }

    @Test
    @Throws(InterruptedException::class)
    fun EditFileUploadRequirement() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.submissionRequirementsTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val submissionRequirements = SubmissionRequirements(driver)
        val fileUploadReq = FileUploadReq(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()

        fileUploadReq.selectFileUpload()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        submissionRequirements.clickOnEditSubReqButton()

        submissionRequirements.switchToNewWindowTest()
        fileUploadReq.selectCheckboxDoc()
        fileUploadReq.selectCheckboxDocx()
        fileUploadReq.selectCheckboxXls()
        fileUploadReq.selectCheckboxXlsx()
        fileUploadReq.selectCheckboxPpt()
        fileUploadReq.selectCheckboxPptx()
        fileUploadReq.selectCheckboxPdf()
        fileUploadReq.selectCheckboxPng()
        submissionRequirements.clickOnOkButton()
    }

    @Test
    @Throws(InterruptedException::class)
    fun DeleteFileUploadRequirement() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.submissionRequirementsTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        val submissionRequirements = SubmissionRequirements(driver)
        val fileUploadReq = FileUploadReq(driver!!)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        fileUploadReq.selectFileUploadReqToDelete()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        submissionRequirements.clickOnDeleteSubReqButton()
        submissionRequirements.switchToNewWindowTest()
        submissionRequirements.confirmDeletion()
    }
}
