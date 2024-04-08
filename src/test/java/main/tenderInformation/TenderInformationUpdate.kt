package main.tenderInformation
import main.BaseTest
import main.PublicTenderPage
import main.TendersPage
import main.users.all.Administrators
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class TenderInformationUpdate : BaseTest() {
    private lateinit var tendersPage: TendersPage
    private lateinit var publicTenderPage: PublicTenderPage
    private lateinit var tenderDescription: TenderDescription

    @BeforeMethod
    fun setUpTest() {
        tendersPage = TendersPage(driver)
        tenderDescription = TenderDescription(driver)
        tendersPage.switchToBrowserFrame()
        publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.tenderInformationTab?.click()
        driver!!.switchTo().defaultContent()
        Thread.sleep(3000)
        tendersPage.switchToDirectoryFrame()
        tenderDescription.clickOnTenderDescriptionSubTab()
        driver!!.switchTo().defaultContent()
        Thread.sleep(2000)
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderDescriptionButton()
        tenderDescription.switchToNewWindowTest()
        Thread.sleep(2000)
    }
    @Test
    @Throws(InterruptedException::class)
    fun UpdateTenderDescriptionProjectNo() {
        tenderDescription.projectNoInput().clear()
        tenderDescription.fillInProjectNo("test")
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateDescription() {
        tenderDescription.descriptionInput().clear()
        tenderDescription.fillInDescriptionInput("Description ø Input TEST_YAB")
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateContractingAuthority() {
        tenderDescription.contractingAuthorityInput().clear()
        tenderDescription.fillInContractingAuthorityInput("contractingAuthorityInputTEST_YAB")
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateContractType() {
        tenderDescription.contractTypeInput().clear()
        tenderDescription.fillInContractTypeInput("contractType_InputTEST_YAB")
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateContactPersonData() {
        tenderDescription.contactPersonInput().clear()
        tenderDescription.fillInContactPersonInput("new Contact Person data ribtestuser@gmail.com +380683363xxx")
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateAwardCriteria() {
        tenderDescription.clickOnAwardCriteriaDropdown()
        tenderDescription.bestQualityOption().click()
        tenderDescription.okButton().click()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateTenderType() {
        tenderDescription.clickOnTenderTypeDropdown()
        tenderDescription.changeTenderTypeToSecret()
        tenderDescription.changeTenderTypeToPublic()

        //        Alert alert = driver.switchTo().alert();
//        String alertMessage = alert.getText();
//        String expectedText = "Warning!";
//        if (alertMessage.contains(expectedText)) {
//            System.out.println("Alert message contains proper text");
//        } else {
//            System.out.println("No or wrong alert message");
//        }
//        alert.accept();
        tenderDescription.okButton().click()
    }
}
