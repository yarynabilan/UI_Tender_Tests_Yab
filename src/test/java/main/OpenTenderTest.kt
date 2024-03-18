package main

import org.testng.Assert
import org.testng.annotations.Test

open class OpenTenderTest : ApplicationsNavigationTest() {
    protected override var tendersPage: TendersPage? = null

    @Test
    @Throws(InterruptedException::class)
    fun openTenderTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToFunctionsFrame()
        val publicTenderPage = PublicTenderPage(driver)
        Assert.assertTrue(publicTenderPage.tenderAdminProfile().isDisplayed)
    }
}
