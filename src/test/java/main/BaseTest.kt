package main

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import java.util.concurrent.TimeUnit

open class BaseTest {
    @JvmField
    protected var driver: WebDriver? = null

    @BeforeMethod
    @Throws(InterruptedException::class)
    fun setUp() {
//        System.setProperty("webdriver.chrome.driver", "/Users/yab/IdeaProjects/MyTestFramework/src/main/resources/drivers/chromedriver");
//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        //       System.setProperty("webdriver.chrome.driver", "/Users/yab/Desktop/chromedriver/");
//        System.setProperty("webdriver.chrome.driver", "/usr/local/Caskroom/chromedriver/121.0.6167.85/chromedriver-mac-x64/chromedriver");

        driver = ChromeDriver()
        (driver as ChromeDriver).manage().window().maximize()
        (driver as ChromeDriver).manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        (driver as ChromeDriver).get("https://testdociaweb.byggeweb.dk/controller?cmd=company7.login.form&language=English&extern=1")
        val loginPage = LoginPage(driver)
        loginPage.loginSuccessful("ribtestuser@gmail.com", "TestPassword#1")
        Thread.sleep(3000)

        val mainPage = MainPage(driver)
        mainPage.navigateToApplications().applications().click()
        val applicationsPage = ApplicationsPage(driver)
        Thread.sleep(3000)
        applicationsPage.tenderLink().click()
        val tendersPage = TendersPage(driver)
        tendersPage.openPublicTender()

        val mainWindowHandle = (driver as ChromeDriver).getWindowHandle()
        tendersPage.switchToNewWindow(mainWindowHandle)
    }

    @AfterMethod
    fun tearDown() {
        if (driver != null) {
            driver!!.quit()
        }
    }
}