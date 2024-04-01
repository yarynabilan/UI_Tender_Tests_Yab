package main.specificationDocuments

import io.qameta.allure.Step
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import java.awt.AWTException
import java.io.File

class FileUpload internal constructor(private val driver: WebDriver) {
    var uploadFileButton: By = By.xpath("//img[@name='upload_file']")
    var enhancedUploadTab: By = By.xpath("//nobr[text()='Enhanced upload']")
    var standartUploadTab: By = By.xpath("//nobr[text()='Standard upload']")
    var transferralUploadTab: By = By.xpath("//nobr[text()='Transferral']")
    var tenderPhasesTab: By = By.xpath("//div[@class='WMP_trans_phases large_icon']//span[text()='Tender phases']")
    var prequalificationTab: By = By.xpath("//div[@class='timelimit' and div[@class='phase']//span[@class='description' and text()='Prequalification']]")
    var folderALocator: By = By.xpath("//td[contains(text(), 'Folder A')]")
    var fileFromFirstPhase: By = By.xpath("//td[contains(text(), 'FileFromFirstPhase.png')]/preceding-sibling::td/input[@type='checkbox']")
    var myFoldersTab: By = By.xpath("//div[@class='WMP_trans_pers_folders large_icon']//span[text()='My folders']")
    var sharedFoldersTab: By = By.xpath("//div[@class='WMP_trans_shared_folders large_icon']//span[text()='Shared folders']")
    var ribProjectTab: By = By.xpath("//div[@class='WMP_trans_projects large_icon']//span[text()='RIB projects']")
    var ribArchivesTab: By = By.xpath("//div[@class='WMP_trans_archives large_icon']//span[text()='RIB archives']")
    var ribTendersTab: By = By.xpath("//div[@class='WMP_trans_tenders large_icon']//span[text()='RIB Tenders']")
    var uploadFoldersTab: By = By.xpath("//nobr[text()='Upload folders']")
    var inputForDestinationFolder: By = By.xpath("//input[@name='name']")
    var OkButton: By = By.xpath("//input[@name='OK']")
    var confirmUpload: By = By.xpath("//input[@value='OK']")
    var addFilesButton: By = By.xpath("//span[text()='Add more files']")
    var folderLocator: By = By.xpath("//span[text()='Folder A']")
    var fileFromMyFolder: By = By.xpath("//td[contains(text(), 'FileTøTransferFrom MyFolder.pdf')]/preceding-sibling::td/input[@type='checkbox' and @name='file']\n")
    var fileFromSharedFolder: By = By.xpath("//td[contains(text(), 'From Shared Folder.pdf')]/preceding-sibling::td/input[@type='checkbox' and @name='file']")
    var transferButton: By = By.xpath("//input[@type='button' and @value='Transfer']\n")
    var selectAllButton: By = By.xpath("//input[@value='Select all']")
    var downloadFileButton: By = By.xpath("//img[@name='download_file']")
    var fileToDownload: By = By.xpath("//nobr[contains(text(),'File To Move.png')]")
    var previewFileButton: By = By.xpath("//img[@title='Preview file with RIB-viewer']")
    var openFileButton: By = By.xpath("//img[@title='Open original file']")
    var compareFileButton: By = By.xpath("//img[@title='Compare two file versions']")
    var fileLink: By = By.xpath("//span[@class='contentHeading1']")
    var confirmCompareFileButton: By = By.xpath("//input[@value='Compare']")
    var fileInfoButton: By = By.xpath("//nobr[contains(text(),'File information')]")
    var subjectMetadataField: By = By.xpath("//input[@name='metadata_566559_Ref']")
    var updateButton: By = By.xpath("//input[@value='Update']")
    var downloadAllTenderDocumentsIcon: By = By.xpath("//img[@src='/images/info/large_all_distribution_download.png']")
    var okDownload: By = By.xpath("//input[@value='OK']\n")
    var generatedFilesLink: By = By.xpath("//a[contains(@href, '/download/')]")
    var sendToEmailButton: By = By.xpath("//input[@value='Send an e-mail with a download link']")
    var downloadFileListInExcel: By = By.xpath("//img[@name='create_excel']\n")
    var nextButton: By = By.xpath("//input[@value='Next']")
    var fileDataDropdown: By = By.xpath("//select[@name='metadata_pos_1']/option[text()='File']")
    var uploadDateDataDropdown: By = By.xpath("//select[@name='metadata_pos_1']/option[text()='Upload-date']")
    var fileLinkByXPath: By = By.xpath("//a[@id='filelink']")
    var project: By = By.xpath("//table[@class='directory standard']//td[contains(text(), 'Tender - file to transfer')]")
    var projectWS: By = By.xpath("//table[@class='page-content contentHeading1']//div[@class='WMP_transfer_area_ws large_icon']")

    var fileFromWS: By = By.xpath("//td[text()='file_WS.txt']")
    var projectVS: By = By.xpath("//table[@class='page-content contentHeading1']//div[@class='WMP_transfer_area_vs large_icon']\n")
    var projectPS: By = By.xpath("//table[@class='page-content contentHeading1']//div[@class='WMP_transfer_area_ps large_icon']\n")
    var documentList: By = By.xpath("//td[text()='doc list 1']")
    var docListFolder: By = By.xpath("//td[text()='PS_Folder_001']")
    var docListFileCheckbox: By = By.xpath("//input[@type='checkbox' and @name='file' and @value='143560']")
    var projectDS: By = By.xpath("//table[@class='page-content contentHeading1']//div[@class='WMP_transfer_area_ds large_icon']\n")
    var distibutionList: By = By.xpath("//td[text()='dist list 1']")

    fun selectFileFromWS() {
        val fileFromWSElement = driver.findElement(fileFromWS)
        fileFromWSElement.click()
    }

    fun clickUploadFileButton() {
        val uploadFileElement = driver.findElement(uploadFileButton)
        uploadFileElement.click()
    }

    fun clickSelectAllButton() {
        val selectAllElement = driver.findElement(selectAllButton)
        selectAllElement.click()
    }

    fun sharedFoldersTab(): WebElement {
        return driver.findElement(sharedFoldersTab)
    }

    fun myFoldersTab(): WebElement {
        return driver.findElement(myFoldersTab)
    }

    fun clickEnhancedUploadTab() {
        val enhancedUploadElement = driver.findElement(enhancedUploadTab)
        enhancedUploadElement.click()
    }

    fun clickStandardUploadTab() {
        val standartUploadTablement = driver.findElement(standartUploadTab)
        standartUploadTablement.click()
    }

    fun clickTransferralUploadTab() {
        val transferralUploadTabElement = driver.findElement(transferralUploadTab)
        transferralUploadTabElement.click()
    }

    fun inputDestinationFolder(folderName: String?) {
        val destinationFolderElement = driver.findElement(inputForDestinationFolder)
        destinationFolderElement.sendKeys(folderName)
    }

    fun clickOkButton() {
        val okButtonElement = driver.findElement(OkButton)
        okButtonElement.click()
    }

    fun clickAddFilesButton() {
        val addFilesElement = driver.findElement(addFilesButton)
        addFilesElement.click()
    }

    fun selectFolder() {
        val folderElement = driver.findElement(folderLocator)
        folderElement.click()
    }

    @Throws(AWTException::class)
    fun uploadFirstFileVersion() {
        val uploadFile = File("src/main/resources/files/Test File.pdf")
        val fileInputElement = driver.findElement(fileInput)
        fileInputElement.sendKeys(uploadFile.absolutePath)
    }

    @Throws(AWTException::class)
    fun uploadSecondFileVersion() {
        val uploadFile = File("src/main/resources/files/filesVersion2/Test File.pdf")
        val fileInputElement = driver.findElement(fileInput)
        fileInputElement.sendKeys(uploadFile.absolutePath)
    }

    @Throws(AWTException::class)
    fun uploadFileToMove() {
        val uploadFile = File("src/main/resources/files/File To Move.png")
        val fileInputElement = driver.findElement(fileInput)
        fileInputElement.sendKeys(uploadFile.absolutePath)
    }

    @Throws(AWTException::class)
    fun uploadFileToDelete() {
        val uploadFile = File("src/main/resources/files/fileToDelete.xlsx")
        val fileInputElement = driver.findElement(fileInput)
        fileInputElement.sendKeys(uploadFile.absolutePath)
    }

    @Throws(AWTException::class)
    fun standardUpload() {
        val uploadFile = File("src/main/resources/files/standardUpload.txt")
        val fileInputElement = driver.findElement(fileInput)
        fileInputElement.sendKeys(uploadFile.absolutePath)
    }

    fun clickTenderPhasesTab() {
        val tenderPhasesTabElement = driver.findElement(tenderPhasesTab)
        tenderPhasesTabElement.click()
    }

    fun clickMyFoldersTab(): By {
        val myFoldersTabElement = driver.findElement(myFoldersTab)
        myFoldersTabElement.click()
        return myFoldersTab
    }

    fun selectFileFromMyFolder() {
        val fileFromMyFolderCheckBox = driver.findElement(fileFromMyFolder)
        fileFromMyFolderCheckBox.click()
    }

    fun selectFileFromSharedFolder() {
        val fileFromSharedFolderCheckBox = driver.findElement(fileFromSharedFolder)
        fileFromSharedFolderCheckBox.click()
    }

    fun clickTransferButton() {
        val transferButtonElement = driver.findElement(transferButton)
        transferButtonElement.click()
    }

    fun clickSharedFoldersTab() {
        val sharedFoldersTabElement = driver.findElement(sharedFoldersTab)
        sharedFoldersTabElement.click()
    }

    fun clickRibProjectTab() {
        val ribProjectTabElement = driver.findElement(ribProjectTab)
        ribProjectTabElement.click()
    }

    fun selectProject() {
        val projectElement = driver.findElement(project)
        projectElement.click()
    }

    fun clickRibArchivesTab() {
        val ribArchivesTabElement = driver.findElement(ribArchivesTab)
        ribArchivesTabElement.click()
    }

    fun clickRibTendersTab() {
        val ribTendersTabElement = driver.findElement(ribTendersTab)
        ribTendersTabElement.click()
    }

    fun confirmUpload() {
        val confirmUploadElement = driver.findElement(confirmUpload)
        confirmUploadElement.click()
    }

    fun clickOnPrequalificationTab() {
        val prequalificationTabElement = driver.findElement(prequalificationTab)
        prequalificationTabElement.click()
    }

    fun selectFileFromFirstPhase() {
        val fileFromFirstPhaseElement = driver.findElement(fileFromFirstPhase)
        fileFromFirstPhaseElement.click()
    }

    fun clickOnFolderA() {
        val folderAElement = driver.findElement(folderALocator)
        folderAElement.click()
    }

    fun clickDownloadButton() {
        val downloadFileButtonElement = driver.findElement(downloadFileButton)
        downloadFileButtonElement.click()
    }

    fun selectFileToDownload() {
        val fileToDownloadElement = driver.findElement(fileToDownload)
        fileToDownloadElement.click()
    }

    fun clickOnPreviewFileButton() {
        val previewFileButtonElement = driver.findElement(previewFileButton)
        previewFileButtonElement.click()
    }

    fun clickOnOpenFileButton() {
        val openFileButtonElement = driver.findElement(openFileButton)
        openFileButtonElement.click()
    }

    fun clickOnFileLink() {
        val fileLinkElement = driver.findElement(fileLink)
        fileLinkElement.click()
    }

    fun clickOnCompareFileButton() {
        val compareFileButtonElement = driver.findElement(compareFileButton)
        compareFileButtonElement.click()
    }

    fun confirmCompareFile() {
        val confirmCompareFileButtonElement = driver.findElement(confirmCompareFileButton)
        confirmCompareFileButtonElement.click()
    }

    fun clickFileInfoButton() {
        val fileInfoButtonElement = driver.findElement(fileInfoButton)
        fileInfoButtonElement.click()
    }

    fun clickUpdateButton() {
        val updateButtonElement = driver.findElement(updateButton)
        updateButtonElement.click()
    }

    fun clickDownloadAllTenderDocumentsIcon() {
        val downloadAllTenderDocumentsIconElement = driver.findElement(downloadAllTenderDocumentsIcon)
        downloadAllTenderDocumentsIconElement.click()
    }

    fun clickOkDownload() {
        val okButtonElement = driver.findElement(okDownload)
        okButtonElement.click()
    }

    fun clickOnGeneratedFilesLink() {
        val generatedLinkElement = driver.findElement(generatedFilesLink)
        generatedLinkElement.click()
    }

    fun clickSendToEmailButton() {
        val sendToEmailButtonElement = driver.findElement(sendToEmailButton)
        sendToEmailButtonElement.click()
    }

    fun clickDownloadFileListInExcel() {
        val downloadFileListinExcelButtonElement = driver.findElement(downloadFileListInExcel)
        downloadFileListinExcelButtonElement.click()
    }

    fun clickNextButton() {
        val nextButtonElement = driver.findElement(nextButton)
        nextButtonElement.click()
    }

    fun updateSubjectMetadataFiled(text: String?) {
        val subjectMetadataFieldElement = driver.findElement(subjectMetadataField)
        subjectMetadataFieldElement.click()
        subjectMetadataFieldElement.sendKeys(text)
    }

    fun selectFileFromDropdown() {
        val fileOptionElement = driver.findElement(fileDataDropdown)
        fileOptionElement.click()
    }

    fun selectUploadDateFromDropdown() {
        val uploadDateOptionElement = driver.findElement(uploadDateDataDropdown)
        uploadDateOptionElement.click()
    }

//    fun clickFileLinkByXPath() {
//        val fileLinkByXPathElement = driver.findElement(fileLinkByXPath)
//        fileLinkByXPathElement.click()
//    }
    val fileLinkElement: WebElement
        get() = driver.findElement(fileLinkByXPath)
    @Step
    fun transferFileFromProjectWS() {
        driver.findElement(projectWS).click()
        clickSelectAllButton()
        clickTransferButton()
        clickOkButton()
    }

    @Step
    fun transferFileFromProjectPS() {
        driver.findElement(projectPS).click()
        driver.findElement(documentList).click()
        driver.findElement(docListFolder).click()
        driver.findElement(docListFileCheckbox).click()
        clickTransferButton()
        clickOkButton()
    }

    @Step
    fun transferFileFromProjectDS() {
        driver.findElement(projectDS).click()
        driver.findElement(distibutionList).click()
        clickSelectAllButton()
        clickTransferButton()
        clickOkButton()
    } //    public void goToDocumentList() {
    //        WebElement documentListElement = driver.findElement(documentList);
    //        documentListElement.click();}
    //
    //    public void goToDocListFolder() {
    //        WebElement docListFolderElement = driver.findElement(docListFolder);
    //        docListFolderElement.click();}
    //    public void selectDocListFile() {
    //        WebElement docListFileCheckboxElement = driver.findElement(docListFileCheckbox);
    //        docListFileCheckboxElement.click();}
    //
    //
    //    public void transferFileFromProjectVS() {
    //        WebElement projectWSElement = driver.findElement(projectVS);
    //        projectWSElement.click();}

    companion object {
        @JvmField
        var fileInput: By = By.xpath("//input[@type='file']")
    }
}