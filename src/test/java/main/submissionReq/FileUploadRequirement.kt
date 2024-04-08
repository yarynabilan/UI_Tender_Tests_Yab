//package main.submissionReq
//import main.BaseTest
//import PublicTenderPage
//import main.TendersPage
//import main.subReq.SubmissionRequirements
//import main.subReq.allRequirements.FileUploadReq
//import org.testng.annotations.BeforeMethod
//import org.testng.annotations.Test
//
//class FileUploadRequirement : BaseTest() {
//    private lateinit var tendersPage: TendersPage
//    private lateinit var publicTenderPage: PublicTenderPage
//    private lateinit var submissionRequirements: SubmissionRequirements
//    private lateinit var fileUploadReq: FileUploadReq
//    @BeforeMethod
//    fun setUpTest() {
//        tendersPage = TendersPage(driver)
//        publicTenderPage = PublicTenderPage(driver)
//        fileUploadReq = FileUploadReq(driver)
//        submissionRequirements = SubmissionRequirements(driver)
//        tendersPage.switchToBrowserFrame()
//        publicTenderPage.submissionRequirementsTab.click()
//        driver.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()}
//    @Test
//    fun CreateFileUploadRequirement() {
//        submissionRequirements.clickOnCreateSubReqButton()
//        Thread.sleep(2000)
//        submissionRequirements.switchToNewWindowTest()
//        submissionRequirements.clickOnFileUploadReqLink()
//        fileUploadReq.fillInNameOfFileUploadReq("Test File Upload Requirement Name")
//        fileUploadReq.fillInDescriptionField("Test Description of File Upload Requirement ")
//        fileUploadReq.clickOkButton()
//        Thread.sleep(2000)
//    }
//
//    @Test
//    fun CreateToDeleteFileUploadRequirement() {
//        submissionRequirements.clickOnCreateSubReqButton()
//        Thread.sleep(2000)
//        submissionRequirements.switchToNewWindowTest()
//        submissionRequirements.clickOnFileUploadReqLink()
//        val fileUploadReq = FileUploadReq(driver)
//        fileUploadReq.fillInNameOfFileUploadReq("To Delete Test File Upload Requirement")
//        fileUploadReq.fillInDescriptionField("Test Description of File Upload Requirement to Delete ")
//        fileUploadReq.clickOkButton()
//    }
//
//    @Test
//    fun EditFileUploadRequirement() {
//        driver.switchTo().defaultContent()
//        tendersPage.switchToDirectoryFrame()
//        fileUploadReq.selectFileUpload()
//        driver.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()
//        submissionRequirements.clickOnEditSubReqButton()
//        submissionRequirements.switchToNewWindowTest()
//        fileUploadReq.selectCheckboxDoc()
//        fileUploadReq.selectCheckboxDocx()
//        fileUploadReq.selectCheckboxXls()
//        fileUploadReq.selectCheckboxXlsx()
//        fileUploadReq.selectCheckboxPpt()
//        fileUploadReq.selectCheckboxPptx()
//        fileUploadReq.selectCheckboxPdf()
//        fileUploadReq.selectCheckboxPng()
//        submissionRequirements.clickOnOkButton() }
//
//    @Test
//    fun DeleteFileUploadRequirement() {
//        driver.switchTo().defaultContent()
//        tendersPage.switchToDirectoryFrame()
//        fileUploadReq.selectFileUploadReqToDelete()
//        driver.switchTo().defaultContent()
//        tendersPage.switchToNavigationFrame()
//        submissionRequirements.clickOnDeleteSubReqButton()
//        submissionRequirements.switchToNewWindowTest()
//        submissionRequirements.confirmDeletion()
//    }
//}
