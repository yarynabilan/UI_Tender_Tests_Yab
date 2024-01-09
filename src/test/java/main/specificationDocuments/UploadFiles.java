package main.specificationDocuments;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import org.testng.annotations.Test;

import java.awt.*;

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
    public void transfferalUploadMyFolder() throws InterruptedException, AWTException {
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
    }