package main.specificationDocuments;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class FoldersTest extends ApplicationsNavigationTest {

    @Test
    public void CreateFolder() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Folders folders = new Folders(driver);
        Thread.sleep(3000);
        folders.clickOnCreateFolderButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        folders.fillInFolderName("Folder A");
        folders.clickOnOkButton();
        Thread.sleep(3000);

    }
    @Test
    public void CreateFolderWithSubFolder() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Folders folders = new Folders(driver);
        String mainWindowHandle = driver.getWindowHandle();
        Thread.sleep(3000);
        folders.clickOnCreateFolderButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        folders.fillInFolderName("Folder S");
        folders.clickOnOkButton();
        Thread.sleep(3000);
        driver.switchTo().window(mainWindowHandle);
        Thread.sleep(3000);
        tendersPage.switchToNavigationFrame();
        folders.clickOnCreateFolderButton();
        tendersPage.switchToNewWindowTest();
        Thread.sleep(3000);
        folders.fillInFolderName("subFolder");
        folders.clickOnOkButton();
        Thread.sleep(3000);
    }
    @Test
    public void CreateEditDeleteFolder() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Folders folders = new Folders(driver);
        String mainWindowHandle = driver.getWindowHandle();
        Thread.sleep(3000);
        folders.clickOnCreateFolderButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        folders.fillInFolderName("ToRenameAndDelete");
        folders.clickOnOkButton();
        Thread.sleep(3000);
        driver.switchTo().window(mainWindowHandle);
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        folders.clickOnRenameFolderButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        folders.fillInFolderName("renamed");
        folders.clickOnOkButton();
        driver.switchTo().window(mainWindowHandle);
        tendersPage.switchToNavigationFrame();
        Thread.sleep(3000);
        folders.clickOnDeleteOnFolderButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        folders.clickOnOkButton();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
    }
    @Test
    public void CreateFolderWithAlreadyExistingName() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Folders folders = new Folders(driver);
        Thread.sleep(3000);
        folders.clickOnCreateFolderButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        folders.fillInFolderName("Folder A");
        folders.clickOnOkButton();
        Thread.sleep(3000);
        tendersPage.switchToNewWindowTest();
        folders.validateErrorMessage("Error! The folder name is already in use. Please choose a different name.");
    }
    }
