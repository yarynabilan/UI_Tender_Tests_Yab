package main

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import java.util.concurrent.TimeUnit

open class BaseTest {
    protected open lateinit var driver: WebDriver

    @BeforeMethod
    @Throws(InterruptedException::class)
    fun setUp() {
        driver = ChromeDriver()
        driver.manage().window().maximize()
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        driver.get("https://testdociaweb.byggeweb.dk/controller?cmd=company7.login.form&language=English&extern=1")
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
        val mainWindowHandle = driver.getWindowHandle()
        tendersPage.switchToNewWindow(mainWindowHandle)
    }

    @AfterMethod
    fun tearDown() {
        if (::driver.isInitialized) {
            driver.quit()
        }
    }
}
