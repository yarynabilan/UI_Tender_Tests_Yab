package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class OpenTenderTest extends ApplicationsNavigationTest {
    protected TendersPage tendersPage;

    @Test
    public void openTenderTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToApplications().applications().click();
        ApplicationsPage applicationsPage = new ApplicationsPage(driver);
        Thread.sleep(3000);
        applicationsPage.tenderLink().click();
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.openPublicTender();

        String mainWindowHandle = driver.getWindowHandle();
        tendersPage.switchToNewWindow(mainWindowHandle);

        tendersPage.switchToFunctionsFrame();

        PublicTenderPage publicTenderPage = new PublicTenderPage(driver);
        assertTrue(publicTenderPage.tenderAdminProfile().isDisplayed());
    }
}
