package main

import org.testng.Assert
import org.testng.annotations.Test

open class ApplicationsNavigationTest : LoginTest() {
    @Test
    fun applicationNavigationTest() {
        val mainPage = MainPage(driver)
        mainPage.navigateToApplications().applications().click()
        val applicationsPage = ApplicationsPage(driver)
        Assert.assertTrue(applicationsPage.tenderLink().isDisplayed)
    }
}



