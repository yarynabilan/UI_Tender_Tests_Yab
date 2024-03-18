package main.specificationDocuments

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import org.testng.annotations.Test
import java.awt.AWTException

class UploadFiles : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun CreateFolderWithAlreadyExistingName() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        Thread.sleep(3000)
        val fileUpload = FileUpload(driver!!)
        fileUpload.clickUploadFileButton()
        Thread.sleep(3000)
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)
        fileUpload.clickEnhancedUploadTab()
        fileUpload.inputDestinationFolder("TEST_3")
        fileUpload.clickOkButton()
        //  fileUpload.clickAddFilesButton();
        fileUpload.uploadFileToDelete()
        Thread.sleep(2000)
        fileUpload.confirmUpload()
        Thread.sleep(4000)
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOkButton()
        Thread.sleep(4000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun UploadFileToExistingFolder() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
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
        Thread.sleep(4000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun standardUploadOFSecondFileVersion() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
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
        Thread.sleep(4000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun transferralUploadMyFolder() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
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
        fileUpload.clickMyFoldersTab()
        tendersPage.switchToNewWindowTest()
        fileUpload.selectFileFromMyFolder()
        fileUpload.clickTransferButton()
        fileUpload.confirmUpload()
        Thread.sleep(4000)
        driver!!.switchTo().window(mainWindowHandle)
        driver!!.switchTo().defaultContent()
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
        Thread.sleep(4000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun transferralUploadSharedFolder() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
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
        Thread.sleep(4000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun transferralUploadFromFirstPhase() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
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
    @Throws(InterruptedException::class, AWTException::class)
    fun transferralUploadProjectWS() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
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
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun transferralUploadProjectWSPSDS() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
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
        Thread.sleep(3000)
    }

    // TO DO:
    //    public void transferralUploadProjectVS_WS() throws InterruptedException, AWTException {
    //    public void transferralUploadProjectVS_PS() throws InterruptedException, AWTException {
    //
    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun downloadFile() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFileToDownload()
        tendersPage.switchToNavigationFrame()
        fileUpload.clickDownloadButton()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun previewFile() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFolder()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        fileUpload.selectFileToDownload()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToFileDetailsFrame()
        fileUpload.clickOnPreviewFileButton()
        Thread.sleep(10000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun openFile() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
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
        Thread.sleep(10000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun compareTwoFilesVersion() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
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
        Thread.sleep(10000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun updateFileMetadataField() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
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
        Thread.sleep(5000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun downloadAllTenderFiles() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
        tendersPage.switchToDirectoryFrame()
        fileUpload.clickDownloadAllTenderDocumentsIcon()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOkDownload()
        tendersPage.switchToNewWindowTest()
        Thread.sleep(3000)
        fileUpload.clickOnGeneratedFilesLink()
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun sendAllTenderFileToEmail() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
        tendersPage.switchToDirectoryFrame()
        fileUpload.clickDownloadAllTenderDocumentsIcon()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickOkDownload()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickSendToEmailButton()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class, AWTException::class)
    fun downloadFileListInExcel() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        driver!!.switchTo().defaultContent()
        val fileUpload = FileUpload(driver!!)
        tendersPage.switchToNavigationFrame()
        fileUpload.clickDownloadFileListInExcel()
        tendersPage.switchToNewWindowTest()
        fileUpload.clickNextButton()
        fileUpload.selectFileFromDropdown()
        fileUpload.selectUploadDateFromDropdown()
        fileUpload.clickOkDownload()
        Thread.sleep(7000)
        fileUpload.clickFileLinkByXPath()
        Thread.sleep(2000)
    }
}

