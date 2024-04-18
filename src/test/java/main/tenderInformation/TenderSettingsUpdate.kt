package main.tenderInformation

import main.ApplicationsNavigationTest
import main.PublicTenderPage
import main.TendersPage
import main.users.all.Administrators
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class TenderSettingsUpdate : ApplicationsNavigationTest() {
    private lateinit var tenderDescription: TenderDescription

    @BeforeMethod
    fun setUpTest() {
    val tendersPage = TendersPage(driver)
        val tenderDescription = TenderDescription(driver!!)

        tendersPage.switchToBrowserFrame()

    val publicTenderPage = PublicTenderPage(driver)
    publicTenderPage.tenderInformationTab?.click()
    driver!!.switchTo().defaultContent()
    tendersPage.switchToDirectoryFrame()
    tenderDescription.clickOnTenderSettingsSubTab()
    driver!!.switchTo().defaultContent()
    tendersPage.switchToNavigationFrame()
    tenderDescription.clickOnEditTenderSettingsButton()
    Thread.sleep(3000)
    tenderDescription.switchToNewWindowTest()}

        @Test
    @Throws(InterruptedException::class)
    fun UpdateSubcontractorsSettings() {
        val tenderSettings = TenderSettings(driver!!)
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
    fun selectSupplementaryFilesAcceptedTest() {
        val tenderSettings = TenderSettings(driver)
        tenderSettings.selectSupplementaryFilesAccepted()
        tenderDescription.okButton().click() }

    @Test
    @Throws(InterruptedException::class)
    fun selectSupplementaryFilesNotAcceptedTest() {
        val tenderSettings = TenderSettings(driver!!)
        tenderSettings.selectSupplementaryFilesNoAccepted()
        Thread.sleep(5000)
        tenderDescription.okButton().click() }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateSecuritySettings() {
        val tenderSettings = TenderSettings(driver!!)
        tenderSettings.updateSecuritySettings()
        tenderDescription.okButton().click()}

    @Test
    @Throws(InterruptedException::class)
    fun UpdateOpeningAndPublicationSettings() {
        val tenderSettings = TenderSettings(driver!!)
        tenderSettings.clickOnAccessDocumentsBySubcontractorDropdown()
        tenderSettings.clickOnlyTenderersMayDownloadDropdownOption()
        tenderSettings.clickOnAllowTendersPartnerToAccessDropdownOption()
        tenderSettings.subcontractorQAdropdown()
        tenderSettings.setNotifyAboutAnswersNo()
        tenderSettings.setNotifyAboutAnswersYes()
        tenderDescription.okButton().click() }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateQandAHadlingSetting() {
        val tenderSettings = TenderSettings(driver!!)
        tenderSettings.updateQAhandlingNoYes()
        tenderDescription.okButton().click() }

    @Test
    @Throws(InterruptedException::class)
    fun UpdateSendersVisibilitySettings() {
        val tenderSettings = TenderSettings(driver!!)
        tenderSettings.updateSendersVisibilitySettings()
        tenderDescription.okButton().click()
    }
}
