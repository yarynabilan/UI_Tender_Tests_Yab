package main

import org.testng.Assert
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class BasicTenderNavigation : OpenTenderTest() {
    private val PublicTenderPage: PublicTenderPage? = null
    @BeforeMethod
    @Throws(InterruptedException::class)
    fun setUpTestEnvironment() {
    }

    @Test
    @Throws(InterruptedException::class)
    fun navigationPublicTenderTab() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()

        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.publicTenderTab().click()
        Assert.assertTrue(publicTenderPage.publicTenderTab().isEnabled)
    }

    @Test(description = "Navigation to First Tab- Tender Information")
    @Throws(InterruptedException::class)
    fun basicNavigation() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()

        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.tenderInformationTab().click()

        Assert.assertTrue(publicTenderPage.tenderInformationTab().isEnabled)
    }


    @Test(description = "Navigation through all modules", groups = ["navigateModules"])
    @Throws(InterruptedException::class)
    fun navigateThoughtMainPanels() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        publicTenderPage.clickOnElement(publicTenderPage.submissionRequirementsTab)
        publicTenderPage.clickOnElement(publicTenderPage.tenderSpecificationDocumentsTab)
        publicTenderPage.clickOnElement(publicTenderPage.questionsAndAnswersTab)
        publicTenderPage.clickOnElement(publicTenderPage.messagesfromTenderAdministratorTab)
        publicTenderPage.clickOnElement(publicTenderPage.usersTab)
        publicTenderPage.clickOnElement(publicTenderPage.logFilesTab)
        publicTenderPage.clickOnElement(publicTenderPage.guidanceTab)
        publicTenderPage.clickOnElement(publicTenderPage.submittedTenderOffersTab)
        publicTenderPage.clickOnElement(publicTenderPage.tenderResultTab)
    }
}
