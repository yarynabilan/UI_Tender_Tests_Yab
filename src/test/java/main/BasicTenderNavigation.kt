package main;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class BasicTenderNavigation extends OpenTenderTest {

    private PublicTenderPage PublicTenderPage;
@BeforeMethod
public void setUpTestEnvironment() throws InterruptedException {
}
    @Test
    public void navigationPublicTenderTab() throws InterruptedException {
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.publicTenderTab().click();
        assertTrue(publicTenderPage.publicTenderTab().isEnabled());
    }

    @Test(description = "Navigation to First Tab- Tender Information")
    public void basicNavigation() throws InterruptedException {

        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();

        main.PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.tenderInformationTab().click();

        assertTrue(publicTenderPage.tenderInformationTab().isEnabled());
    }



    @Test(description = "Navigation through all modules", groups = "navigateModules")
    public void navigateThoughtMainPanels() throws InterruptedException {

        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.switchToBrowserFrame();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        publicTenderPage.clickOnElement(publicTenderPage.getTenderInformationTab());
        publicTenderPage.clickOnElement(publicTenderPage.getSubmissionRequirementsTab());
        publicTenderPage.clickOnElement(publicTenderPage.getTenderSpecificationDocumentsTab());
        publicTenderPage.clickOnElement(publicTenderPage.getQuestionsAndAnswersTab());
        publicTenderPage.clickOnElement(publicTenderPage.getMessagesfromTenderAdministratorTab());
        publicTenderPage.clickOnElement(publicTenderPage.getUsersTab());
        publicTenderPage.clickOnElement(publicTenderPage.getLogFilesTab());
        publicTenderPage.clickOnElement(publicTenderPage.getGuidanceTab());
        publicTenderPage.clickOnElement(publicTenderPage.getSubmittedTenderOffersTab());
        publicTenderPage.clickOnElement(publicTenderPage.getTenderResultTab());

    }
}