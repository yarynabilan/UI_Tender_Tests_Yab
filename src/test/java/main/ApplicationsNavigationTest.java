package main;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
public class ApplicationsNavigationTest extends LoginTest {


    @Test
    public void applicationNavigationTest() {
 //       main.LoginPage loginPage = new main.LoginPage(driver);
//        loginPage.loginSuccessful("ribtestuser@gmail.com", "TestPassword#1");
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToApplications().applications().click();
        ApplicationsPage applicationsPage = new ApplicationsPage(driver);
        assertTrue(applicationsPage.tenderLink().isDisplayed());
    }
}



