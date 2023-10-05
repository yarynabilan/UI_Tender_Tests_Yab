package main.tenderInformation;

import main.*;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TenderInformationUpdate extends ApplicationsNavigationTest {

    @Test
    public void UpdateTenderDescriptionProjectNo() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderDescription = new TenderDescription(driver);
        tenderDescription.clickOnTenderDescriptionSubTab();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        tendersPage.switchToNavigationFrame();
        tenderDescription.clickOnEditTenderDescriptionButton();
        tenderDescription.switchToNewWindowTest();
        Thread.sleep(3000);
        tenderDescription.projectNoInput().clear();
        tenderDescription.fillInProjectNo("test");
        tenderDescription.okButton().click();

    }
    @Test
    public void UpdateDescription() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderDescription = new TenderDescription(driver);
        tenderDescription.clickOnTenderDescriptionSubTab();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        tendersPage.switchToNavigationFrame();
        tenderDescription.clickOnEditTenderDescriptionButton();
        tenderDescription.switchToNewWindowTest();
        Thread.sleep(3000);
        tenderDescription.descriptionInput().clear();
        tenderDescription.fillInDescriptionInput("Description ø Input TEST_YAB");
        tenderDescription.okButton().click();

    }
    @Test
    public void UpdateContractingAuthority() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderDescription = new TenderDescription(driver);
        tenderDescription.clickOnTenderDescriptionSubTab();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        tendersPage.switchToNavigationFrame();
        tenderDescription.clickOnEditTenderDescriptionButton();
        tenderDescription.switchToNewWindowTest();
        Thread.sleep(3000);
        tenderDescription.contractingAuthorityInput().clear();
        tenderDescription.fillInContractingAuthorityInput("contractingAuthorityInputTEST_YAB");
        tenderDescription.okButton().click();

    }
    @Test
    public void UpdateContractType() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderDescription = new TenderDescription(driver);
        tenderDescription.clickOnTenderDescriptionSubTab();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        tendersPage.switchToNavigationFrame();
        tenderDescription.clickOnEditTenderDescriptionButton();
        tenderDescription.switchToNewWindowTest();
        Thread.sleep(3000);
        tenderDescription.contractTypeInput().clear();
        tenderDescription.fillInContractTypeInput("contractType_InputTEST_YAB");
        tenderDescription.okButton().click();

    }@Test
    public void UpdateContactPersonData() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderDescription = new TenderDescription(driver);
        tenderDescription.clickOnTenderDescriptionSubTab();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        tendersPage.switchToNavigationFrame();
        tenderDescription.clickOnEditTenderDescriptionButton();
        tenderDescription.switchToNewWindowTest();
        Thread.sleep(3000);
        tenderDescription.contactPersonInput().clear();
        tenderDescription.fillInContactPersonInput("new Contact Person data ribtestuser@gmail.com +380683363xxx");
        tenderDescription.okButton().click();

    }@Test
    public void UpdateAwardCriteria() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderDescription = new TenderDescription(driver);
        tenderDescription.clickOnTenderDescriptionSubTab();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        tendersPage.switchToNavigationFrame();
        tenderDescription.clickOnEditTenderDescriptionButton();
        tenderDescription.switchToNewWindowTest();
        Thread.sleep(3000);
        tenderDescription.clickOnAwardCriteriaDropdown();
        tenderDescription.bestQualityOption().click();
        tenderDescription.okButton().click();
        Thread.sleep(3000);
    }
    @Test
        public void UpdateTenderType() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        tendersPage.switchToDirectoryFrame();
        TenderDescription tenderDescription = new TenderDescription(driver);
        tenderDescription.clickOnTenderDescriptionSubTab();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        tendersPage.switchToNavigationFrame();
        tenderDescription.clickOnEditTenderDescriptionButton();
        tenderDescription.switchToNewWindowTest();
        Thread.sleep(2000);
        tenderDescription.clickOnTenderTypeDropdown();
        tenderDescription.changeTenderTypeToSecret();
        tenderDescription.changeTenderTypeToPublic();
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        String expectedText = "Warning!";
        if (alertMessage.contains(expectedText)) {
            System.out.println("Alert message contains proper text");
        } else {
            System.out.println("No or wrong alert message");
        }
        alert.accept();
        tenderDescription.okButton().click();
    }
}
