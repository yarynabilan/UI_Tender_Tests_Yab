import main.OpenTenderTest
import main.PublicTenderPage
import main.TendersPage
import org.testng.Assert
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import org.openqa.selenium.By
import com.codeborne.selenide.SelenideElement

class BasicTenderNavigation : OpenTenderTest() {
    private lateinit var publicTenderPage: PublicTenderPage

    @BeforeMethod
    fun setUpTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
    }

    @Test(description = "Navigation Public Tender Tab")
    fun navigationPublicTenderTab() {
        publicTenderPage.publicTenderTab().click()
        Assert.assertTrue(publicTenderPage.publicTenderTab().isEnabled)
    }

    @Test(description = "Navigation to First Tab- Tender Information")
    fun basicNavigation() {
        publicTenderPage.tenderInformationTab?.click()
        publicTenderPage.tenderInformationTab?.let { Assert.assertTrue(it.isEnabled) }
    }

    @Test(description = "Navigation through all modules", groups = ["navigateModules"])
    fun navigateThoughtMainPanels() {
        publicTenderPage.tenderInformationTab?.click()
        publicTenderPage.submissionRequirementsTab?.click()
        publicTenderPage.tenderSpecificationDocumentsTab?.click()
        publicTenderPage.questionsAndAnswersTab?.click()
        publicTenderPage.messagesfromTenderAdministratorTab?.click()
        publicTenderPage.usersTab?.click()
        publicTenderPage.logFilesTab?.click()
        publicTenderPage.guidanceTab?.click()
        publicTenderPage.submittedTenderOffersTab?.click()
        publicTenderPage.tenderResultTab?.click()
    }
}
