package main.specificationDocuments;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import org.testng.annotations.Test;

public class SpecificationDocuments extends ApplicationsNavigationTest {
    @Test
    public void CreateEditDeleteFolder() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        Folders folders = new Folders(driver);
        folders.clickOnCreateFolderButton();
        Thread.sleep(5000);
//        folders.switchToNewWindowTest();
//        folders.fillInFolderName("Folder A");
//        folders.clickOnOkButton();
    }
}