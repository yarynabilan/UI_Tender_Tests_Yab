package main.tenderInformation

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.annotations.Test

class TenderSettingsUpdate : ApplicationsNavigationTest() {
    @Test
    @Throws(InterruptedException::class)
    fun UpdateSubcontractorsSettings() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()

        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderSettingsSubTab()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderSettingsButton()
        Thread.sleep(3000)
        tenderDescription.switchToNewWindowTest()
        val tenderSettings = TenderSettings(driver)
        tenderSettings.clickOnAccessDocumentsBySubcontractorDropdown()
        tenderSettings.clickOnlyTenderersMayDownloadDropdownOption()
        tenderSettings.clickOnAllowTendersPartnerToAccessDropdownOption()
        tenderSettings.subcontractorQAdropdown()
        tenderSettings.setNotifyAboutAnswersNo()
        tenderSettings.setNotifyAboutAnswersYes()
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateTenderSettingsOLD() {
        val tendersPage = TendersPage(driver)

        val iframeElement = driver!!.findElement(By.xpath("//frame[@name='browser']"))
        driver!!.switchTo().frame(iframeElement)
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent() // Повернення до головного вікна сторінки
        // Знову "прив'язка" вебдрайвера до поточного потоку
        val driverWait = WebDriverWait(driver, 3) // Зміна wait для очікування
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//frame[@name='directory']")))
        val frameDirectory = driver!!.findElement(By.xpath("//frame[@name='directory']"))
        driver!!.switchTo().frame(frameDirectory)
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderSettingsSubTab() // Продовження взаємодії з елементами в фреймі
        driver!!.switchTo().defaultContent() // Повернення до головного вікна сторінки
        val frameNavigation = driver!!.findElement(By.xpath("//frame[@name='navigation']"))
        driver!!.switchTo().frame(frameNavigation)
        tenderDescription.clickOnEditTenderSettingsButton()
        tenderDescription.switchToNewWindowTest()
        Thread.sleep(3000)
        val tenderSettings = TenderSettings(driver)
        tenderSettings.clickOnAccessDocumentsBySubcontractorDropdown()
        tenderSettings.clickOnlyTenderersMayDownloadDropdownOption()
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun selectSupplementaryFilesAcceptedTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderSettingsSubTab()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderSettingsButton()
        Thread.sleep(3000)
        tenderDescription.switchToNewWindowTest()
        val tenderSettings = TenderSettings(driver)
        tenderSettings.selectSupplementaryFilesAccepted()
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun selectSupplementaryFilesNotAcceptedTest() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()
        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderSettingsSubTab()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderSettingsButton()
        Thread.sleep(3000)
        tenderDescription.switchToNewWindowTest()
        val tenderSettings = TenderSettings(driver)
        tenderSettings.selectSupplementaryFilesNoAccepted()
        Thread.sleep(5000)
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateSecuritySettings() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()

        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderSettingsSubTab()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderSettingsButton()
        Thread.sleep(3000)
        tenderDescription.switchToNewWindowTest()
        val tenderSettings = TenderSettings(driver)
        tenderSettings.updateSecuritySettings()
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateOpeningAndPublicationSettings() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()

        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderSettingsSubTab()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderSettingsButton()
        Thread.sleep(3000)
        tenderDescription.switchToNewWindowTest()
        val tenderSettings = TenderSettings(driver)
        tenderSettings.clickOnAccessDocumentsBySubcontractorDropdown()
        tenderSettings.clickOnlyTenderersMayDownloadDropdownOption()
        tenderSettings.clickOnAllowTendersPartnerToAccessDropdownOption()
        tenderSettings.subcontractorQAdropdown()
        tenderSettings.setNotifyAboutAnswersNo()
        tenderSettings.setNotifyAboutAnswersYes()
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateQandAHadlingSetting() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()

        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderSettingsSubTab()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderSettingsButton()
        Thread.sleep(3000)
        tenderDescription.switchToNewWindowTest()
        val tenderSettings = TenderSettings(driver)
        tenderSettings.updateQAhandlingNoYes()
        tenderDescription.okButton().click()
    }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateSendersVisibilitySettings() {
        val tendersPage = TendersPage(driver)
        tendersPage.switchToBrowserFrame()

        val publicTenderPage = PublicTenderPage(driver)
        publicTenderPage.clickOnElement(publicTenderPage.tenderInformationTab)
        driver!!.switchTo().defaultContent()
        tendersPage.switchToDirectoryFrame()
        val tenderDescription = TenderDescription(driver)
        tenderDescription.clickOnTenderSettingsSubTab()
        driver!!.switchTo().defaultContent()
        tendersPage.switchToNavigationFrame()
        tenderDescription.clickOnEditTenderSettingsButton()
        Thread.sleep(3000)
        tenderDescription.switchToNewWindowTest()
        val tenderSettings = TenderSettings(driver)
        tenderSettings.updateSendersVisibilitySettings()
        tenderDescription.okButton().click()
    }
}
