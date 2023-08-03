import org.apache.logging.log4j.core.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;


public class BaseTest {

    protected WebDriver driver;
    //   protected Logger logger;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/yab/IdeaProjects/MyTestFramework/src/main/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://testdociaweb.byggeweb.dk/controller?cmd=company7.login.form&language=English&extern=1");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginSuccessful("ribtestuser@gmail.com", "TestPassword#1");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
