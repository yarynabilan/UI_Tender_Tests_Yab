package main;

import main.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;


public class BaseTest {

    protected WebDriver driver;

    //   protected Logger logger;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/yab/IdeaProjects/MyTestFramework/src/main/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://testdociaweb.byggeweb.dk/controller?cmd=company7.login.form&language=English&extern=1");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginSuccessful("ribtestuser@gmail.com", "TestPassword#1");

        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToApplications().applications().click();
        ApplicationsPage applicationsPage = new ApplicationsPage(driver);
        Thread.sleep(3000);
        applicationsPage.tenderLink().click();
        TendersPage tendersPage = new TendersPage(driver);
        tendersPage.openPublicTender();

        String mainWindowHandle = driver.getWindowHandle();
        tendersPage.switchToNewWindow(mainWindowHandle);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}