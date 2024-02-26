package main.specificationDocuments;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.awt.*;

import static org.testng.Assert.assertTrue;

public class UploadFiles extends ApplicationsNavigationTest {
    @Test
    public void CreateFolderWithAlreadyExistingName() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        FileUpload fileUpload = new FileUpload(driver);
        fileUpload.clickUploadFileButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        Thread.sleep(3000);
        fileUpload.clickEnhancedUploadTab();
        fileUpload.inputDestinationFolder("TEST_3");
        fileUpload.clickOkButton();
        //  fileUpload.clickAddFilesButton();
        fileUpload.uploadFileToDelete();
        Thread.sleep(2000);
        fileUpload.confirmUpload();
        Thread.sleep(4000);
        tendersPage.switchToNewWindowTest();
        fileUpload.clickOkButton();
        Thread.sleep(4000);
    }

    @Test
    public void UploadFileToExistingFolder() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFolder();
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        fileUpload.clickUploadFileButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        Thread.sleep(5000);
        fileUpload.clickEnhancedUploadTab();
        Thread.sleep(3000);
        fileUpload.uploadFirstFileVersion();
        fileUpload.uploadFileToMove();
        Thread.sleep(2000);
        fileUpload.confirmUpload();
        Thread.sleep(4000);
        tendersPage.switchToNewWindowTest();
        fileUpload.clickOkButton();
        Thread.sleep(4000);
    }

    @Test
    public void standardUploadOFSecondFileVersion() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFolder();
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        fileUpload.clickUploadFileButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        Thread.sleep(5000);
        fileUpload.clickStandardUploadTab();
        Thread.sleep(3000);
        fileUpload.uploadSecondFileVersion();
        fileUpload.uploadFileToMove();
        Thread.sleep(2000);
        fileUpload.confirmUpload();
        Thread.sleep(4000);
        tendersPage.switchToNewWindowTest();
        fileUpload.clickOkButton();
        Thread.sleep(4000);
    }

    @Test
    public void transferralUploadMyFolder() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        String mainWindowHandle = driver.getWindowHandle();
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFolder();
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        fileUpload.clickUploadFileButton();
        Thread.sleep(2000);
        tendersPage.switchToNewWindowTest();
        fileUpload.clickTransferralUploadTab();
        fileUpload.clickMyFoldersTab();
        tendersPage.switchToNewWindowTest();
        fileUpload.selectFileFromMyFolder();
        fileUpload.clickTransferButton();
        fileUpload.confirmUpload();
        Thread.sleep(4000);
        driver.switchTo().window(mainWindowHandle);
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        fileUpload.clickUploadFileButton();
        Thread.sleep(2000);
        tendersPage.switchToNewWindowTest();
        fileUpload.clickTransferralUploadTab();
        fileUpload.clickMyFoldersTab();
        tendersPage.switchToNewWindowTest();
        fileUpload.clickSelectAllButton();
        fileUpload.clickTransferButton();
        fileUpload.confirmUpload();
        Thread.sleep(4000);
    }

    @Test
    public void transferralUploadSharedFolder() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFolder();
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        fileUpload.clickUploadFileButton();
        tendersPage.switchToNewWindowTest();
        Thread.sleep(3000);
        fileUpload.clickTransferralUploadTab();
        Thread.sleep(3000);
        fileUpload.clickSharedFoldersTab();
        tendersPage.switchToNewWindowTest();
        fileUpload.selectFileFromSharedFolder();
        Thread.sleep(3000);
        fileUpload.clickTransferButton();
        fileUpload.confirmUpload();
        Thread.sleep(4000);
    }

    @Test
    public void transferralUploadFromFirstPhase() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFolder();
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        fileUpload.clickUploadFileButton();
        tendersPage.switchToNewWindowTest();
        Thread.sleep(3000);
        fileUpload.clickTransferralUploadTab();
        tendersPage.switchToNewWindowTest();
        Thread.sleep(3000);
        fileUpload.clickTenderPhasesTab();
        tendersPage.switchToNewWindowTest();
        fileUpload.clickOnPrequalificationTab();
        tendersPage.switchToNewWindowTest();
        fileUpload.clickOnFolderA();

        tendersPage.switchToNewWindowTest();

        fileUpload.selectFileFromFirstPhase();
        fileUpload.clickTransferButton();
        fileUpload.confirmUpload();
        Thread.sleep(4000);
    }

    @Test
    public void downloadFile() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFolder();
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFileToDownload();
        tendersPage.switchToNavigationFrame();
        fileUpload.clickDownloadButton();
        Thread.sleep(3000);
    }

    @Test
    public void previewFile() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFolder();
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFileToDownload();
        driver.switchTo().defaultContent();
        tendersPage.switchToFileDetailsFrame();
        fileUpload.clickOnPreviewFileButton();
        Thread.sleep(10000);
    }
 @Test
    public void openFile() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFolder();
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFileToDownload();
        driver.switchTo().defaultContent();
        tendersPage.switchToFileDetailsFrame();
        fileUpload.clickOnOpenFileButton();
        tendersPage.switchToNewWindowTest();
        fileUpload.clickOnFileLink();
        Thread.sleep(10000);
    }
@Test
    public void compareTwoFilesVersion() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFolder();
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFileToDownload();
        driver.switchTo().defaultContent();
        tendersPage.switchToFileDetailsFrame();
        fileUpload.clickOnCompareFileButton();
        tendersPage.switchToNewWindowTest();
        fileUpload.confirmCompareFile();
        Thread.sleep(10000);
    }
    @Test
    public void updateFileMetadataField() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFolder();
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        fileUpload.selectFileToDownload();
        driver.switchTo().defaultContent();
        tendersPage.switchToFileDetailsFrame();
        fileUpload.clickFileInfoButton();
        fileUpload.updateSubjectMetadataFiled("Subject update AutoTEST");
        fileUpload.clickUpdateButton();
        Thread.sleep(5000);
    }
    @Test
    public void downloadAllTenderFiles() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.clickDownloadAllTenderDocumentsIcon();
        tendersPage.switchToNewWindowTest();
        fileUpload.clickOkDownload();
        tendersPage.switchToNewWindowTest();
        Thread.sleep(3000);
        fileUpload.clickOnGeneratedFilesLink();

    }
 @Test
    public void sendAllTenderFileToEmail() throws InterruptedException, AWTException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        FileUpload fileUpload = new FileUpload(driver);
        tendersPage.switchToDirectoryFrame();
        fileUpload.clickDownloadAllTenderDocumentsIcon();
        tendersPage.switchToNewWindowTest();
        fileUpload.clickOkDownload();
        tendersPage.switchToNewWindowTest();
        fileUpload.clickSendToEmailButton();
        Thread.sleep(3000);

    }



}

// TO DO:
//    public void transferralUploadProjectWS() throws InterruptedException, AWTException {
//    public void transferralUploadProjectPS() throws InterruptedException, AWTException {
//    public void transferralUploadProjectDS() throws InterruptedException, AWTException {
//    public void transferralUploadProjectVS_WS() throws InterruptedException, AWTException {
//    public void transferralUploadProjectWS_PS() throws InterruptedException, AWTException {
//

