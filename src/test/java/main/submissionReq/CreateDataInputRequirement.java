package main.submissionReq;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TenderInformationPanel;
import main.TendersPage;
import main.subReq.SubmissionRequirements;
import main.subReq.dataInput.DataInputReq;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class CreateDataInputRequirement extends ApplicationsNavigationTest {

    @Test
    public void CreateDataInputRequirement() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());

        // Переключаємося на новий фрейм або сторінку
        driver.switchTo().defaultContent(); // Якщо потрібно, відключаємося від фреймів
        tendersPage.switchToNavigationFrame();
        SubmissionRequirements submissionRequirements = new SubmissionRequirements(driver);
        submissionRequirements.clickOnCreateSubReqButton();

        Thread.sleep(3000);
        Set<String> allWindowHandlestest = driver.getWindowHandles();

        for (String windowHandle2 : allWindowHandlestest) {
            if (!windowHandle2.equals(allWindowHandlestest)) {
                driver.switchTo().window(windowHandle2);
            }
        }

        submissionRequirements.clickOnDataInputReqLink();
        DataInputReq dataInputReq = new DataInputReq(driver);
        dataInputReq.dataInputNameFiled().clear();
        dataInputReq.fillInNameOfDataInputReq("Data Input Requirement test");
        dataInputReq.fillInDescriptionFiled("test description");
    dataInputReq.clickEditButton();
        for (String windowHandle2 : allWindowHandlestest) {
            if (!windowHandle2.equals(allWindowHandlestest)) {
                driver.switchTo().window(windowHandle2);
            }
        }
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
        dataInputReq.fillInGuidField1("Test1");
        dataInputReq.fillInGuidField2("Test2");
        dataInputReq.fillInGuidField3("Test3");
        dataInputReq.fillInGuidField4("Test4");
        dataInputReq.fillInGuidField5("Test5");
        dataInputReq.fillInGuidField6("Test6");
        dataInputReq.clickOkButton();
        dataInputReq.clickOnlastOkButton();
        Thread.sleep(4000);
    }
}

