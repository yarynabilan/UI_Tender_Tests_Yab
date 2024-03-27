package main

import BasePage
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

class HomePage : BasePage {
    private val logoLocator: By = By.xpath("//img[@src='images/rib-logo-app.png']")
    private val usernameInputLocator: By = By.xpath("//input[@id='user']")
    private val passwordInputLocator: By = By.xpath("//input[@id='password']")
    private val loginButtonLocator: By = By.xpath("//input[@id='submit']")
    private val errorMessageLabelLocator: By = By.xpath("//div[@class='error']/p")
    private val forgottenPasswordButtonLocator: By = By.xpath("//form[@name='login']/parent::div/p[1]/a")

    constructor(driver: WebDriver?) : super(driver)

    constructor(driver: WebDriver?, title: String?) : super(driver)

    val logo: WebElement
        get() = driver!!.findElement(logoLocator)

    fun validateErrorMessage(expectedMessage: String?): HomePage {
        val actualMessage = driver!!.findElement(errorMessageLabelLocator).text
        Assert.assertTrue(actualMessage.contains(expectedMessage!!))
        return this
    }

    companion object {
        private const val TITLE = "Login page"
    }
}

