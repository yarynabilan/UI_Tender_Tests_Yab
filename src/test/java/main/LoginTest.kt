package main
import org.testng.Assert
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

open class LoginTest : BaseTest() {
    protected open var tendersPage: TendersPage? = null

    @BeforeMethod(enabled = false)
    // щоб вимкнути метод setUp() в цьому класі
    @Test
    fun checkLogoOnTheLoginPage() {
        val loginPage = LoginPage(driver)
        Assert.assertTrue(loginPage.logo.isDisplayed, "Logo is not displayed")
    }

    @Test
    fun checkLoginIsSuccessful() {
        val loginPage = LoginPage(driver)
        Assert.assertTrue(loginPage.loginSuccessful("ribtestuser@gmail.com", "TestPassword#1").profileLogoOnTheMainPage.isDisplayed)
    }

    @Test
    fun checkFailedLogin() {
        val loginPage = LoginPage(driver)
        loginPage.loginFailed("ribtestuserFailedLogin@gmail.com", "failed login")
        loginPage.validateErrorMessage("You have entered the wrong username or password. Please try again")
    }

    @Test
    fun checkLogOut() {
        val loginPage = LoginPage(driver)
        val mainPage = MainPage(driver)
        mainPage.profileLogoOnTheMainPage.isDisplayed
        mainPage.signOut().click()
        Assert.assertTrue(loginPage.logo.isDisplayed)
    }
}

