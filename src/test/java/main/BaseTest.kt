package main

import org.testng.annotations.Parameters
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import java.util.concurrent.TimeUnit

open class BaseTest {
    protected open lateinit var driver: WebDriver
    private lateinit var username: String
    private lateinit var password: String
    @BeforeMethod
    @Parameters("username", "password")
    fun setUp(username: String, password: String) {
        this.username = username
        this.password = password


        driver = ChromeDriver()
        driver.manage().window().maximize()
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        driver.get("https://testdociaweb.byggeweb.dk/controller?cmd=company7.login.form&language=English&extern=1")
        val loginPage = LoginPage(driver)
        loginPage.loginSuccessful(this.username, this.password)
        Thread.sleep(3000)

        val mainPage = MainPage(driver)
        mainPage.navigateToApplications().applications().click()
        Thread.sleep(3000)
        val applicationsPage = ApplicationsPage(driver)
        Thread.sleep(3000)
        applicationsPage.tenderLink().click()
        Thread.sleep(3000)

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
