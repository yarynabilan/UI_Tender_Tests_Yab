package main

import BasePage
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

class LoginPage(driver: WebDriver?) : BasePage(driver) {
    private val logoLocator: By = By.xpath("//img[@src='images/rib-logo-app.png']")
    private val usernameInputLocator: By = By.xpath("//input[@id='user']")
    private val passwordInputLocator: By = By.xpath("//input[@id='password']")
    private val loginButtonLocator: By = By.xpath("//input[@id='submit']")
    private val errorMessageLabelLocator: By = By.xpath("//div[@class='error']/p")
    private val forgottenPasswordButtonLocator: By = By.xpath("//form[@name='login']/parent::div/p[1]/a")

    val logo: WebElement
        get() = driver!!.findElement(logoLocator)

    fun validateErrorMessage(expectedMessage: String?): LoginPage {
        val actualMessage = driver!!.findElement(errorMessageLabelLocator).text
        Assert.assertTrue(actualMessage.contains(expectedMessage!!))
        return this
    }

    fun loginSuccessful(login: String?, password: String?): MainPage {
        driver!!.findElement(usernameInputLocator).sendKeys(login)
        driver!!.findElement(passwordInputLocator).sendKeys(password)
        driver!!.findElement(loginButtonLocator).click()
        return MainPage(driver)
    }

    //мейн пейдж - тут обєкт повертаючого значення, те що ми отримуємо головну сторінку апплікації після логіну, стірінги тут - параметри, а у тесті цей стрінг буде називатись аргументом
    fun loginFailed(login: String?, password: String?): LoginPage {
        driver!!.findElement(usernameInputLocator).sendKeys(login)
        driver!!.findElement(passwordInputLocator).sendKeys(password)
        driver!!.findElement(loginButtonLocator).click()
        return this
    }

    companion object {
        private const val TITLE = "Login page"
    }
}
