package main.tenderInformation

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import org.testng.annotations.Test

class TenderInformationUpdate : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class)
    fun UpdateTenderDescriptionProjectNo() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        Thread.sleep(3000)
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderDescriptionSubTab()
        driver!!.switchTo().defaultContent()
        Thread.sleep(2000)
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderDescriptionButton()
        tenderDescription.switchToNewWindowTest()
        Thread.sleep(3000)
        tenderDescription.projectNoInput().clear()
        tenderDescription.fillInProjectNo("test")
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateDescription() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        Thread.sleep(3000)
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderDescriptionSubTab()
        driver!!.switchTo().defaultContent()
        Thread.sleep(2000)
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderDescriptionButton()
        tenderDescription.switchToNewWindowTest()
        Thread.sleep(3000)
        tenderDescription.descriptionInput().clear()
        tenderDescription.fillInDescriptionInput("Description ø Input TEST_YAB")
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateContractingAuthority() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        Thread.sleep(3000)
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderDescriptionSubTab()
        driver!!.switchTo().defaultContent()
        Thread.sleep(2000)
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderDescriptionButton()
        tenderDescription.switchToNewWindowTest()
        Thread.sleep(3000)
        tenderDescription.contractingAuthorityInput().clear()
        tenderDescription.fillInContractingAuthorityInput("contractingAuthorityInputTEST_YAB")
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateContractType() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        Thread.sleep(3000)
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderDescriptionSubTab()
        driver!!.switchTo().defaultContent()
        Thread.sleep(2000)
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderDescriptionButton()
        tenderDescription.switchToNewWindowTest()
        Thread.sleep(3000)
        tenderDescription.contractTypeInput().clear()
        tenderDescription.fillInContractTypeInput("contractType_InputTEST_YAB")
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateContactPersonData() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        Thread.sleep(3000)
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderDescriptionSubTab()
        driver!!.switchTo().defaultContent()
        Thread.sleep(2000)
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderDescriptionButton()
        tenderDescription.switchToNewWindowTest()
        Thread.sleep(3000)
        tenderDescription.contactPersonInput().clear()
        tenderDescription.fillInContactPersonInput("new Contact Person data ribtestuser@gmail.com +380683363xxx")
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateAwardCriteria() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        Thread.sleep(3000)
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderDescriptionSubTab()
        driver!!.switchTo().defaultContent()
        Thread.sleep(2000)
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderDescriptionButton()
        tenderDescription.switchToNewWindowTest()
        Thread.sleep(3000)
        tenderDescription.clickOnAwardCriteriaDropdown()
        tenderDescription.bestQualityOption().click()
        tenderDescription.okButton().click()
        Thread.sleep(3000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateTenderType() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        Thread.sleep(3000)
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderDescriptionSubTab()
        driver!!.switchTo().defaultContent()
        Thread.sleep(2000)
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderDescriptionButton()
        tenderDescription.switchToNewWindowTest()
        Thread.sleep(2000)
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
