package main.specificationDocuments;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import org.testng.annotations.Test;

public class UploadFiles extends ApplicationsNavigationTest {
    @Test
    public void UploadFile1() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        FileUpload fileUpload = new FileUpload(driver);
    fileUpload.clickUploadFileButton();
        Thread.sleep(5000);

        fileUpload.clickEnhancedUploadTab();
    fileUpload.inputDestinationFolder("Test1");
    fileUpload.clickOkButton();
    fileUpload.clickAddFilesButton();
    }

    @Test
    public void UploadFileToExistingFolder() throws InterruptedException {
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
        fileUpload.clickUploadFileButton();
        Thread.sleep(5000);
        fileUpload.clickEnhancedUploadTab();
    fileUpload.inputDestinationFolder("Test1");
    fileUpload.clickOkButton();
    fileUpload.clickAddFilesButton();
    }
    }