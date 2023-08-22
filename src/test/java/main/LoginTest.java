package main;

import main.BaseTest;
import main.LoginPage;
import main.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    //protected Logger logger;
    @Test
    public void checkLogoOnTheLoginPage() {
        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.getLogo().isDisplayed(), "Logo is not displayed");
    }

    // додатковий меседж в дужках - виведеться тільки тоді коли перевірка зафейлиться
    @Test
    public void checkLoginIsSuccessful() {
        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.loginSuccessful("ribtestuser@gmail.com", "TestPassword#1").getProfileLogoOnTheMainPage().isDisplayed());

    }

    @Test
    public void checkFailedLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFailed("ribtestuserFailedLogin@gmail.com", "failed login");
        loginPage.validateErrorMessage("You have entered the wrong username or password. Please try again");
    }

    @Test
    public void checkLogOut() {
        LoginPage loginPage = new LoginPage(driver);
//        loginPage.loginSuccessful("ribtestuser@gmail.com", "TestPassword#1");
        MainPage mainPage = new MainPage(driver);
        mainPage.getProfileLogoOnTheMainPage().isDisplayed();
        mainPage.signOut().click();
        assertTrue(loginPage.getLogo().isDisplayed());
    }
}

