package main.specificationDocuments

import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import kotlin.test.assertTrue

class UploadFiles : BaseTest() {
    private lateinit var tendersPage: TendersPage
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var fileUpload: FileUpload
    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
        fileUpload = FileUpload(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver.switchTo().defaultContent()
    }
    @Test
    fun CreateFolderAndUploadFileToDelete() {
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)
        fileUpload.clickEnhancedUploadTab()
        fileUpload.inputDestinationFolder("TEST_578")
        fileUpload.clickOkButton()
        Thread.sleep(3000)
        fileUpload.uploadFileToDelete()
        Thread.sleep(2000)
        fileUpload.confirmUpload()
        Thread.sleep(4000)
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOkButton()
        Thread.sleep(4000) }

    @Test
    fun UploadFileToExistingFolder() {
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        Thread.sleep(5000)
        fileUpload.clickEnhancedUploadTab()
        Thread.sleep(3000)
        fileUpload.uploadFirstFileVersion()
        fileUpload.uploadFileToMove()
        Thread.sleep(2000)
        fileUpload.confirmUpload()
        Thread.sleep(4000)
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOkButton()
        Thread.sleep(4000) }

    @Test
    fun standardUploadOFSecondFileVersion() {
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        Thread.sleep(5000)
        fileUpload.clickStandardUploadTab()
        Thread.sleep(3000)
        fileUpload.uploadSecondFileVersion()
        fileUpload.uploadFileToMove()
        Thread.sleep(2000)
        fileUpload.confirmUpload()
        Thread.sleep(4000)
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOkButton()
        Thread.sleep(4000) }

    @Test
    fun transferralUploadMyFolder() {
        val mainWindowHandle = driver.windowHandle
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        Thread.sleep(2000)
        tendersPage.switchToNewWindowTest()
        fileUpload.clickTransferralUploadTab()
        fileUpload.clickMyFoldersTab()
        tendersPage.switchToNewWindowTest()
        fileUpload.selectFileFromMyFolder()
        fileUpload.clickTransferButton()
        fileUpload.confirmUpload()
        Thread.sleep(4000)
        driver.switchTo().window(mainWindowHandle)
        driver.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        Thread.sleep(2000)
        tendersPage.switchToNewWindowTest()
        fileUpload.clickTransferralUploadTab()
        fileUpload.clickMyFoldersTab()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickSelectAllButton()
        fileUpload.clickTransferButton()
        fileUpload.confirmUpload()
        Thread.sleep(4000) }

    @Test
    fun transferralUploadSharedFolder() {

        val fileUpload = FileUpload(driver!!)
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)
        fileUpload.clickTransferralUploadTab()
        Thread.sleep(3000)
        fileUpload.clickSharedFoldersTab()
        tendersPage.switchToNewWindowTest()
        fileUpload.selectFileFromSharedFolder()
        Thread.sleep(3000)
        fileUpload.clickTransferButton()
        fileUpload.confirmUpload()
        Thread.sleep(4000) }

    @Test
    fun transferralUploadFromFirstPhase() {

        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)
        fileUpload.clickTransferralUploadTab()
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)
        fileUpload.clickTenderPhasesTab()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOnPrequalificationTab()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOnFolderA()
        tendersPage.switchToNewWindowTest()
        fileUpload.selectFileFromFirstPhase()
        fileUpload.clickTransferButton()
        fileUpload.confirmUpload()
        Thread.sleep(4000)
    }

    // TO FINISH
    @Test
    fun transferralUploadProjectWS() {
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        Thread.sleep(2000)
        tendersPage.switchToNewWindowTest()
        fileUpload.clickTransferralUploadTab()
        fileUpload.clickRibProjectTab()
        fileUpload.selectProject()
        tendersPage.switchToNewWindowTest()
        fileUpload.transferFileFromProjectWS()
        Thread.sleep(3000) }

    @Test
    fun transferralUploadProjectWSPSDS() {
        val mainWindowHandle = driver!!.windowHandle
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()

        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        Thread.sleep(2000)
        tendersPage.switchToNewWindowTest()
        fileUpload.clickTransferralUploadTab()
        fileUpload.clickRibProjectTab()
        fileUpload.selectProject()
        tendersPage.switchToNewWindowTest()
        fileUpload.transferFileFromProjectWS()
        Thread.sleep(2000)

        driver!!.switchTo().window(mainWindowHandle)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        Thread.sleep(2000)
        tendersPage.switchToNewWindowTest()
        fileUpload.clickTransferralUploadTab()
        fileUpload.clickRibProjectTab()
        fileUpload.selectProject()
        tendersPage.switchToNewWindowTest()
        fileUpload.transferFileFromProjectPS()
        Thread.sleep(2000)

        driver!!.switchTo().window(mainWindowHandle)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        fileUpload.clickUploadFileButton()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickTransferralUploadTab()
        fileUpload.clickRibProjectTab()
        fileUpload.selectProject()
        tendersPage.switchToNewWindowTest()
        fileUpload.transferFileFromProjectDS()
        Thread.sleep(3000) }

    // TO DO:
    //    public void transferralUploadProjectVS_WS() throws InterruptedException, AWTException {
    //    public void transferralUploadProjectVS_PS() throws InterruptedException, AWTException {
    //
    @Test
    fun downloadFile() {
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFileToDownload()
        tendersPage.switchToNavigationFrame()
        fileUpload.clickDownloadButton()
        Thread.sleep(3000) }

    @Test
    fun previewFile() {
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFileToDownload()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToFileDetailsFrame()
        fileUpload.clickOnPreviewFileButton()
        Thread.sleep(10000) }

    @Test
    fun openFile() {
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFileToDownload()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToFileDetailsFrame()
        fileUpload.clickOnOpenFileButton()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOnFileLink()
        Thread.sleep(10000) }

    @Test
    fun compareTwoFilesVersion() {
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFileToDownload()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToFileDetailsFrame()
        fileUpload.clickOnCompareFileButton()
        tendersPage.switchToNewWindowTest()
        fileUpload.confirmCompareFile()
        Thread.sleep(10000) }

    @Test
    fun updateFileMetadataField() {
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFileToDownload()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToFileDetailsFrame()
        fileUpload.clickFileInfoButton()
        fileUpload.updateSubjectMetadataFiled("Subject update AutoTEST")
        fileUpload.clickUpdateButton()
        Thread.sleep(5000) }

    @Test
    fun downloadAllTenderFiles() {
        tendersPage.switchToDirectoryFrame()
        fileUpload.clickDownloadAllTenderDocumentsIcon()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOkDownload()
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)
        fileUpload.clickOnGeneratedFilesLink() }

    @Test
    fun sendAllTenderFileToEmail() {
        tendersPage.switchToDirectoryFrame()
        fileUpload.clickDownloadAllTenderDocumentsIcon()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOkDownload()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickSendToEmailButton()
        Thread.sleep(3000) }
    @Test
    fun downloadFileListInExcel() {
        tendersPage.switchToNavigationFrame()
        fileUpload.clickDownloadFileListInExcel()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickNextButton()
        fileUpload.selectFileFromDropdown()
        fileUpload.selectUploadDateFromDropdown()
        fileUpload.clickOkDownload()
        Thread.sleep(7000)
        val linkElement = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(fileUpload.fileLinkElement))
        assertTrue(linkElement.isDisplayed) }
    }



