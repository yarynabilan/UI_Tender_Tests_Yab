package main.submissionReq;

import main.ApplicationsNavigationTest;
import main.PublicTenderPage;
import main.TenderInformationPanel;
import main.TendersPage;
import main.subReq.SubmissionRequirements;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CreateDataInputRequirement extends ApplicationsNavigationTest {

    @Test
    public void CreateDataInputRequirement() throws InterruptedException {

        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());


        driver.switchTo().defaultContent(); // Повернення до головного вікна сторінки
        tendersPage.switchToDirectoryFrame();
        TenderInformationPanel tenderInformationPanel = new TenderInformationPanel(driver);



    }
}
