package main

import BasePage
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

class MainPage(driver: WebDriver?) : BasePage(driver) {
    private val imgLocator: By = By.xpath("//div[@id = 'companypage-top-user']/p") // це user TOP Label

    //   By userTopLabel = By.xpath("///div[@id = 'companypage-top-user']/p");
    private val signOutLocator: By = By.xpath("//span[@onclick=\"Company.User.LogOff();\"]")
    private val applications: By = By.xpath("//*[@id='tab_applications']")
    val profileLogoOnTheMainPage: WebElement
        get() = driver!!.findElement(imgLocator)

    fun signOut(): WebElement {
        return driver!!.findElement(signOutLocator)
    }

    fun applications(): WebElement {
        return driver!!.findElement(applications)
    }
    fun goToMainPage(): MainPage {
        Assert.assertTrue(driver!!.findElement(signOutLocator).isDisplayed)
        driver!!.findElement(signOutLocator).click()
        return MainPage(driver)
    }

    fun navigateToApplications(): MainPage {
        driver!!.findElement(applications).click()
        return this
    }
    companion object {
        private const val TITLE = "Main page"
    }
}
