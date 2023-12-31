package main.submissionReq;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TendersPage;
import main.subReq.SubmissionRequirements;
import main.subReq.allRequirements.DataInputReq;
import main.subReq.allRequirements.FileUploadReq;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DataInputRequirement extends ApplicationsNavigationTest {

    @Test
    public void CreateDataInputRequirement() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        SubmissionRequirements submissionRequirements = new SubmissionRequirements(driver);
        submissionRequirements.clickOnCreateSubReqButton();
        Thread.sleep(3000);
        submissionRequirements.switchToNewWindowTest();
        submissionRequirements.clickOnDataInputReqLink();
        DataInputReq dataInputReq = new DataInputReq(driver);
        dataInputReq.dataInputNameFiled().clear();
        dataInputReq.fillInNameOfDataInputReq("Data Input Requirement test");
        dataInputReq.fillInDescriptionFiled("test description");
    dataInputReq.clickEditButton();
    dataInputReq.switchToNewWindowTest();
    dataInputReq.fillInfield1("test1");
        dataInputReq.clickAddButton();
    dataInputReq.fillInfield2("test2");
        dataInputReq.clickAddButton();
    dataInputReq.fillInfield3("test3");
        dataInputReq.clickAddButton();
    dataInputReq.fillInfield4("test4");
        dataInputReq.clickAddButton();
    dataInputReq.fillInfield5("test5");
        dataInputReq.clickAddButton();
    dataInputReq.fillInfield6("test6");
    dataInputReq.clickOnFiledTypeDropdown1();
    dataInputReq.selectFieldTypeTextShort();
    dataInputReq.clickOnFiledTypeDropdown2();
    dataInputReq.selectFieldTypeTextLong();
    dataInputReq.clickOnFiledTypeDropdown3();
    dataInputReq.selectFieldTypeNumbers();
    dataInputReq.clickOnFiledTypeDropdown4();
    dataInputReq.selectFieldTypeCurrencyAmount();
    dataInputReq.clickOnFiledTypeDropdown5();
    dataInputReq.selectFieldTypeDate();
    dataInputReq.clickOnFiledTypeDropdown6();
    dataInputReq.selectFieldTypeBooleanValue();
    dataInputReq.clickOnCurrencyDropdown();
    dataInputReq.selectCurrencyTypeDKK();
    dataInputReq.clickOnMandatoryForCurrencyDropdown();
    dataInputReq.selectMandatoryForCurrency();
    dataInputReq.clickOnMandatoryForNumbersDropdown();
    dataInputReq.selectMandatoryForNumbers();
        dataInputReq.fillInGuidField1("Test1");
        dataInputReq.fillInGuidField2("Test2");
        dataInputReq.fillInGuidField3("Test3");
        dataInputReq.fillInGuidField4("Test4");
        dataInputReq.fillInGuidField5("Test5");
        dataInputReq.fillInGuidField6("Test6");
        dataInputReq.clickOkButton();
        dataInputReq.clickOnlastOkButton();
        Thread.sleep(2000);
    }

    @Test
    public void CreateDataInputRequirementToDelete() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        SubmissionRequirements submissionRequirements = new SubmissionRequirements(driver);
        submissionRequirements.clickOnCreateSubReqButton();
        Thread.sleep(3000);
        submissionRequirements.switchToNewWindowTest();
        submissionRequirements.clickOnDataInputReqLink();
        DataInputReq dataInputReq = new DataInputReq(driver);
        dataInputReq.dataInputNameFiled().clear();
        dataInputReq.fillInNameOfDataInputReq("Data Input Requirement To Delete Test");
        dataInputReq.fillInDescriptionFiled("test description - to delete");
        dataInputReq.clickEditButton();
        dataInputReq.switchToNewWindowTest();
        dataInputReq.fillInfield1("test1");
        dataInputReq.clickAddButton();
        dataInputReq.fillInfield2("test2");
        dataInputReq.clickAddButton();
        dataInputReq.fillInfield3("test3");
        dataInputReq.clickAddButton();
        dataInputReq.fillInfield4("test4");
        dataInputReq.clickAddButton();
        dataInputReq.fillInfield5("test5");
        dataInputReq.clickAddButton();
        dataInputReq.fillInfield6("test6");
        dataInputReq.clickOnFiledTypeDropdown1();
        dataInputReq.selectFieldTypeTextShort();
        dataInputReq.clickOnFiledTypeDropdown2();
        dataInputReq.selectFieldTypeTextLong();
        dataInputReq.clickOnFiledTypeDropdown3();
        dataInputReq.selectFieldTypeNumbers();
        dataInputReq.clickOnFiledTypeDropdown4();
        dataInputReq.selectFieldTypeCurrencyAmount();
        dataInputReq.clickOnFiledTypeDropdown5();
        dataInputReq.selectFieldTypeDate();
        dataInputReq.clickOnFiledTypeDropdown6();
        dataInputReq.selectFieldTypeBooleanValue();
        dataInputReq.clickOnCurrencyDropdown();
        dataInputReq.selectCurrencyTypeDKK();
        dataInputReq.clickOnMandatoryForCurrencyDropdown();
        dataInputReq.selectMandatoryForCurrency();
        dataInputReq.clickOnMandatoryForNumbersDropdown();
        dataInputReq.selectMandatoryForNumbers();
        dataInputReq.fillInGuidField1("Test1");
        dataInputReq.fillInGuidField2("Test2");
        dataInputReq.fillInGuidField3("Test3");
        dataInputReq.fillInGuidField4("Test4");
        dataInputReq.fillInGuidField5("Test5");
        dataInputReq.fillInGuidField6("Test6");
        dataInputReq.clickOkButton();
        dataInputReq.clickOnlastOkButton();
        Thread.sleep(2000);
    }
    @Test
    public void DeleteDatainputReq() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        SubmissionRequirements submissionRequirements = new SubmissionRequirements(driver);
        DataInputReq dataInputReq = new DataInputReq(driver);
        driver.switchTo().defaultContent();
        tendersPage.switchToDirectoryFrame();
        dataInputReq.selectDataReqToDelete();
        driver.switchTo().defaultContent();
        tendersPage.switchToNavigationFrame();
        submissionRequirements.clickOnDeleteSubReqButton();
        submissionRequirements.switchToNewWindowTest();
        dataInputReq.confirmDeletion();
    }
}

