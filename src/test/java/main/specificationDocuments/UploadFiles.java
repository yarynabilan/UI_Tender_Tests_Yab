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
    public void createFolderAndUploadFileToDelete() throws InterruptedException, AWTException {
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
        Thread.sleep(10000);
        fileUpload.clickTransferralUploadTab();
        Thread.sleep(15000);
        fileUpload.clickSharedFoldersTab();
        assertTrue(fileUpload.sharedFoldersTab().isEnabled());
        fileUpload.clickSharedFoldersTab();
        Thread.sleep(15000);
        tendersPage.switchToNewWindowTest();


//        fileUpload.clickTransferButton();
//        fileUpload.confirmUpload();
//        Thread.sleep(4000);
    }
}


//    public void transferralUploadProjectWS() throws InterruptedException, AWTException {
//    public void transferralUploadProjectPS() throws InterruptedException, AWTException {
//    public void transferralUploadProjectDS() throws InterruptedException, AWTException {
//    public void transferralUploadProjectVS_WS() throws InterruptedException, AWTException {
//    public void transferralUploadProjectWS_PS() throws InterruptedException, AWTException {
//

