import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertTrue;

public class OpenTenderTest extends ApplicationsNavigationTest{
    @Test
    public void openTenderTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToApplications().applications().click();
        ApplicationsPage applicationsPage = new ApplicationsPage(driver);
        applicationsPage.tenderLink().click();
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.openPublicTender();
        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        assertTrue(wait.until(ExpectedConditions.visibilityOf(publicTenderPage.tenderHeaderType())).isDisplayed());
    }
}